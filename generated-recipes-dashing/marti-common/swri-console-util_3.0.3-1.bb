# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "swri_console_util"
AUTHOR = "P. J. Reed <preed@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_console_util"

ROS_BUILD_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/dashing/swri_console_util/3.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0397ec9cc2133fedfefaf48d792ddfa3"
SRC_URI[sha256sum] = "d5a1441bdbdb7872e3959f92fac39d9149e7da00a007146c905d7ae2ff088b01"
S = "${WORKDIR}/marti_common-release-release-dashing-swri_console_util-3.0.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('marti-common', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('marti-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/marti-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/marti-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
