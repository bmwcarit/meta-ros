# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Driver for the Phidgets Magnetometer devices"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Chris Lalancette"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_magnetometer"

ROS_BUILD_DEPENDS = " \
    phidgets-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    phidgets-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    phidgets-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/phidgets_drivers-release/archive/release/dashing/phidgets_magnetometer/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/phidgets_magnetometer"
SRC_URI = "git://github.com/ros2-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "443e73e7362a2739a71d3c4c335d1e410c0e7488"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
