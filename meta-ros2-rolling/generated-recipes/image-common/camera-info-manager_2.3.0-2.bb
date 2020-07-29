# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "This package provides a C++ interface for camera calibration      information.  It provides CameraInfo, and handles SetCameraInfo      service requests, saving and restoring the camera calibration      data."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://ros.org/wiki/camera_info_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_common"
ROS_BPN = "camera_info_manager"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    camera-calibration-parsers \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    camera-calibration-parsers \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    camera-calibration-parsers \
    rclcpp \
    rcpputils \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_common-release/archive/release/rolling/camera_info_manager/2.3.0-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/camera_info_manager"
SRC_URI = "git://github.com/ros2-gbp/image_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "284e6ab30a42d253fd83afea9e1558e0e4c8027d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
