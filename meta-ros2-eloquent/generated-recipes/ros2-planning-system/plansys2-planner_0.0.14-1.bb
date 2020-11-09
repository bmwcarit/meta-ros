# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "This package contains the PDDL-based Planner module for the ROS2 Planning System"
AUTHOR = "Francisco Martin Rico <fmrico@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License, Version 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=e8978a5103d23266fc6f8ec03dc9eb16"

ROS_CN = "ros2_planning_system"
ROS_BPN = "plansys2_planner"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    boost \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-problem-expert \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-problem-expert \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    plansys2-domain-expert \
    plansys2-msgs \
    plansys2-pddl-parser \
    plansys2-problem-expert \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    ros2run \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelligentRoboticsLabs/ros2_planning_system-release/archive/release/eloquent/plansys2_planner/0.0.14-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/plansys2_planner"
SRC_URI = "git://github.com/IntelligentRoboticsLabs/ros2_planning_system-release;${ROS_BRANCH};protocol=https"
SRCREV = "d1fbc93c64a076de0cd1d851bacde2309e53f0ab"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
