#
# Copyright (c) 2013 Stefan Herbrechtsmeier, Bielefeld University
# Copyright (c) 2019-2020 LG Electronics, Inc.
#

inherit cmake
inherit ros_faulty_solibs
# ROS_PYTHON_VERSION is usually set in generated/superflore-ros-distro.inc, but
# in case superflore-ros-distro.inc isn't included default to 3
ROS_PYTHON_VERSION ?= "3"
inherit ${@'distutils3-base' if d.getVar('ROS_PYTHON_VERSION') == '3' else 'distutils-base'}

# Used to disable exporting LD_LIBRARY_PATH when building with catkin
# because on builder with the same architecture as target MACHINE it
# will try to use incompatible libraries (e.g. libpython) from TARGET
# sysroot instead using the one from host (e.g. for native python)
export CATKIN_CROSSCOMPILING = "1"

EXTRA_OECMAKE_CATKIN = "\
    -DPYTHON_EXECUTABLE_TARGET='/usr/bin/env python3' \
    -DCMAKE_PREFIX_PATH='${STAGING_DIR_HOST}${ros_prefix};${STAGING_DIR_HOST}${prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
    -DCATKIN_DEVEL_PREFIX='${WORKDIR}/devel' \
    "

EXTRA_OECMAKE_CATKIN_class-native = "\
    -DCMAKE_PREFIX_PATH='${ros_prefix}' \
    -DCMAKE_INSTALL_PREFIX:PATH='${ros_prefix}' \
    -DRT_LIBRARY=${libdir_native} \
    -DCATKIN_DEVEL_PREFIX='${WORKDIR}/devel' \
    "

EXTRA_OECMAKE_prepend = "\
    ${EXTRA_OECMAKE_CATKIN} \
    -DCATKIN_BUILD_BINARY_PACKAGE=ON \
    -DSETUPTOOLS_DEB_LAYOUT=OFF \
    -DCATKIN_ENABLE_TESTING=0 \
    "
