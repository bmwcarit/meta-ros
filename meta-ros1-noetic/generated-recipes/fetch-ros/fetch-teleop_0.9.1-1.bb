# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Teleoperation for fetch and freight."
AUTHOR = "Carl Saldanha <csaldanha@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/teleop.html"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_teleop"

ROS_BUILD_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    control-msgs \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/noetic/fetch_teleop/0.9.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fetch_teleop"
SRC_URI = "git://github.com/fetchrobotics-gbp/fetch_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "83c846a1eb9e2700a8745efbbf1818820b966743"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
