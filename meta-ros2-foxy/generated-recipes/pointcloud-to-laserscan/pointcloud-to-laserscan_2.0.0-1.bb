# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Converts a 3D Point Cloud into a 2D laser scan. This is useful for making devices like the Kinect appear like a laser scanner for 2D-based algorithms (e.g. laser-based SLAM)."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Paul Bovbel <paul@bovbel.com>"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "pointcloud_to_laserscan"
ROS_BPN = "pointcloud_to_laserscan"

ROS_BUILD_DEPENDS = " \
    laser-geometry \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    laser-geometry \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    laser-geometry \
    launch \
    launch-ros \
    message-filters \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    tf2 \
    tf2-ros \
    tf2-sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-lint-cmake \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-cmake-xmllint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/pointcloud_to_laserscan-release/archive/release/foxy/pointcloud_to_laserscan/2.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/pointcloud_to_laserscan"
SRC_URI = "git://github.com/ros2-gbp/pointcloud_to_laserscan-release;${ROS_BRANCH};protocol=https"
SRCREV = "0976f071e28f9686e4958038a5e93c495f9e420e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
