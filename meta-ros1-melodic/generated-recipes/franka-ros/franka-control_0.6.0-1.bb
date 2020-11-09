# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "franka_control provides a hardware node to control a Franka Emika research robot"
AUTHOR = "Franka Emika GmbH <support@franka.de>"
ROS_AUTHOR = "Franka Emika GmbH"
HOMEPAGE = "http://wiki.ros.org/franka_control"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "franka_ros"
ROS_BPN = "franka_control"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-interface \
    controller-manager \
    franka-hw \
    franka-msgs \
    geometry-msgs \
    libfranka \
    message-generation \
    pluginlib \
    realtime-tools \
    roscpp \
    sensor-msgs \
    tf \
    tf2-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-interface \
    controller-manager \
    franka-hw \
    franka-msgs \
    geometry-msgs \
    libfranka \
    message-runtime \
    pluginlib \
    realtime-tools \
    roscpp \
    sensor-msgs \
    tf \
    tf2-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    controller-interface \
    controller-manager \
    franka-description \
    franka-gripper \
    franka-hw \
    franka-msgs \
    geometry-msgs \
    joint-state-publisher \
    libfranka \
    message-runtime \
    pluginlib \
    realtime-tools \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    tf \
    tf2-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_control/0.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/franka_control"
SRC_URI = "git://github.com/frankaemika/franka_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "e1cccaa6064d84991caf8094eb906078b8677919"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
