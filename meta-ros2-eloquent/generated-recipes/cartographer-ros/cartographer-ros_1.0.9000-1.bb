# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Cartographer is a system that provides real-time simultaneous localization     and mapping (SLAM) in 2D and 3D across multiple platforms and sensor     configurations. This package provides Cartographer's ROS integration."
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "The Cartographer Authors <google-cartographer@googlegroups.com>"
HOMEPAGE = "https://github.com/ros2/cartographer_ros"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b73cebba72f83c5afebf178817283e37"

ROS_CN = "cartographer_ros"
ROS_BPN = "cartographer_ros"

ROS_BUILD_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    libeigen \
    lua \
    nav-msgs \
    pcl \
    pcl-conversions \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-eigen \
    tf2-msgs \
    tf2-ros \
    urdfdom-headers \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    lua \
    nav-msgs \
    pcl \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-msgs \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cartographer \
    cartographer-ros-msgs \
    lua \
    nav-msgs \
    pcl \
    rclcpp \
    sensor-msgs \
    tf2 \
    tf2-msgs \
    tf2-ros \
    visualization-msgs \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/cartographer_ros-release/archive/release/eloquent/cartographer_ros/1.0.9000-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/cartographer_ros"
SRC_URI = "git://github.com/ros2-gbp/cartographer_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "4b3eb79ad9e1e668104ea8d83c4479940557e660"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
