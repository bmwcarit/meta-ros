# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Provides the prefix level environment files for ROS 2 packages."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=f2c2560c422b1f619ff2ce48845782f5"

ROS_CN = "ros_workspace"
ROS_BPN = "ros_workspace"

ROS_BUILD_DEPENDS = " \
    ament-cmake-core \
    ament-package \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/ros_workspace-release/archive/release/dashing/ros_workspace/0.7.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7a1318575534d89ec4c3b3a208370096"
SRC_URI[sha256sum] = "591b29f43aa835764a290c11483f0a81f54b576f9fe20f61adf9569809ab60ed"
S = "${WORKDIR}/ros_workspace-release-release-dashing-ros_workspace-0.7.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-workspace', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros-workspace', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-workspace/ros-workspace_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-workspace/ros-workspace-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-workspace/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros-workspace/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
