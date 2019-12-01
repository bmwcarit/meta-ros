# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This library provides functionality to simplify working with the     navigation messages defined in marti_nav_msgs."
AUTHOR = "P. J. Reed <preed@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_route_util"

ROS_BUILD_DEPENDS = " \
    boost \
    marti-common-msgs \
    marti-nav-msgs \
    rclcpp \
    swri-geometry-util \
    swri-math-util \
    swri-roscpp \
    swri-transform-util \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    marti-common-msgs \
    marti-nav-msgs \
    rclcpp \
    swri-geometry-util \
    swri-math-util \
    swri-roscpp \
    swri-transform-util \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    marti-common-msgs \
    marti-nav-msgs \
    rclcpp \
    swri-geometry-util \
    swri-math-util \
    swri-roscpp \
    swri-transform-util \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/dashing/swri_route_util/3.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9e1e724f16ae653637acace66a8ab45c"
SRC_URI[sha256sum] = "5054602c23b534b0401d7f65d0fa1d535b58b91f25fbcc2fe539a21a16f3adae"
S = "${WORKDIR}/marti_common-release-release-dashing-swri_route_util-3.0.3-1"

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
