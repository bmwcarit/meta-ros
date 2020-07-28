# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "ROS driver package for communication with the SBG navigation systems."
AUTHOR = "Rémi Burtin <remi.burtin@sbg-systems.com>"
ROS_AUTHOR = "SBG Systems"
HOMEPAGE = "http://wiki.ros.org/sbg_driver"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "sbg_driver"
ROS_BPN = "sbg_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    geometry-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geometry-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geometry-msgs \
    rclcpp \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SBG-Systems/sbg_ros2-release/archive/release/foxy/sbg_driver/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/sbg_driver"
SRC_URI = "git://github.com/SBG-Systems/sbg_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "c9062b8fa17fa40c88a40f21a19f805f91ab6f44"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
