# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Firmware source code for ArbotiX ROS bindings."
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/arbotix_firmware"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "arbotix"
ROS_BPN = "arbotix_firmware"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
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

# matches with: https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_firmware/0.10.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/arbotix_firmware"
SRC_URI = "git://github.com/vanadiumlabs/arbotix_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "613ef2db85b11139c71f6ac07c509bab993df7b5"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('arbotix', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
