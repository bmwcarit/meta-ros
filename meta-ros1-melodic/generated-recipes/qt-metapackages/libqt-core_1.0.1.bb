# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "libqt-core metapackage supporting qt4 and qt5"
AUTHOR = "Matthew Bries <mbries@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "United-States-Government-Purpose & SwRI-Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=8e473b26ead33548c945bdaca143a08d"

ROS_CN = "qt_metapackages"
ROS_BPN = "libqt_core"

ROS_BUILD_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/qt_metapackages-release/archive/release/melodic/libqt_core/1.0.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/libqt_core"
SRC_URI = "git://github.com/swri-robotics-gbp/qt_metapackages-release;${ROS_BRANCH};protocol=https"
SRCREV = "7b5265c42593541cf2ce78061e93cf0ab9c1db5f"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('qt-metapackages', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
