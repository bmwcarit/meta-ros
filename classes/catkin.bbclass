#
# Copyright (c) 2013 Stefan Herbrechtsmeier, Bielefeld University
# 

inherit cmake distutils-base ros faulty-solibs

DEPENDS_prepend = "${@['catkin-native ', ''][(d.getVar('BPN', True) == 'catkin') | (d.getVar('BPN', True) == 'catkin-runtime')]}"

EXTRA_OECMAKE_CATKIN = "\
    -DCMAKE_PREFIX_PATH='${STAGING_DIR_HOST}${ros_prefix};${STAGING_DIR_HOST}${prefix};${STAGING_DIR_NATIVE}${ros_prefix};${STAGING_DIR_NATIVE}${prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
    "

EXTRA_OECMAKE_CATKIN_class-native = "\
    -DCMAKE_PREFIX_PATH='${ros_prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
    -DRT_LIBRARY=${libdir_native} \
    "

EXTRA_OECMAKE_prepend = "\
    ${EXTRA_OECMAKE_CATKIN} \
    -DCATKIN_BUILD_BINARY_PACKAGE=ON \
    -DSETUPTOOLS_DEB_LAYOUT=OFF \
    -DCATKIN_ENABLE_TESTING=0 \
    "

OECMAKE_SOURCEPATH = "${S}"
OECMAKE_BUILDPATH = "${S}/build"

export BUILD_SYS
export HOST_SYS

SYSROOT_PREPROCESS_FUNCS += "catkin_sysroot_preprocess"
catkin_sysroot_preprocess () {
    sysroot_stage_dir ${D}${ros_sysconfdir} ${SYSROOT_DESTDIR}${ros_sysconfdir}
}

_catkin_clean_paths() {
    # Fix paths containing the target sysroot
    sed -i "s|${STAGING_DIR_TARGET}||g" $1

    # Remove paths containing the host sysroot
    sed -i "s|${STAGING_DIR_NATIVE}[^;\")]*||g" $1
}

PACKAGE_PREPROCESS_FUNCS += "catkin_package_preprocess"
catkin_package_preprocess() {
    # Fix hard-coded paths in cmake config files
    for file in ${PKGD}/${ros_datadir}/${ROS_BPN}/cmake/*.cmake; do
        if [ -e ${file} ]; then
            _catkin_clean_paths ${file}
        fi
    done

    # Fix hard-coded paths in pkg-config files
    for file in ${PKGD}/${ros_libdir}/pkgconfig/*.pc; do
        if [ -e ${file} ]; then
            _catkin_clean_paths ${file}
        fi
    done

    # Fix hard-coded paths in environment hooks
    for shell in 'sh' 'bash' 'tcsh' 'zsh'; do
        for file in ${PKGD}/${ros_sysconfdir}/catkin/profile.d/*.${shell}; do
            if [ -e ${file} ]; then
                # Special fix for substituted PYTHON_EXECUTABLE
                # Note: has to be executed before _catkin_clean_paths; otherwise
                #       the substituted variable has already been removed
                sed -i "s|${PYTHON}|/usr/bin/python|g" ${file}

                _catkin_clean_paths ${file}
            fi
        done
    done
}
