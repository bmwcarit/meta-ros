# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A package which extends 'ros_base' and includes high level packages like vizualization tools and demos."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "variants"
ROS_BPN = "desktop"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-tutorials-cpp \
    action-tutorials-interfaces \
    action-tutorials-py \
    angles \
    composition \
    demo-nodes-cpp \
    demo-nodes-cpp-rosnative \
    demo-nodes-py \
    depthimage-to-laserscan \
    dummy-map-server \
    dummy-robot-bringup \
    dummy-sensors \
    examples-rclcpp-minimal-action-client \
    examples-rclcpp-minimal-action-server \
    examples-rclcpp-minimal-client \
    examples-rclcpp-minimal-composition \
    examples-rclcpp-minimal-publisher \
    examples-rclcpp-minimal-service \
    examples-rclcpp-minimal-subscriber \
    examples-rclcpp-minimal-timer \
    examples-rclpy-executors \
    examples-rclpy-minimal-action-client \
    examples-rclpy-minimal-action-server \
    examples-rclpy-minimal-client \
    examples-rclpy-minimal-publisher \
    examples-rclpy-minimal-service \
    examples-rclpy-minimal-subscriber \
    image-tools \
    intra-process-demo \
    joy \
    lifecycle \
    logging-demo \
    pcl-conversions \
    pendulum-control \
    pendulum-msgs \
    quality-of-service-demo-cpp \
    quality-of-service-demo-py \
    ros-base \
    rqt-common-plugins \
    rviz-default-plugins \
    rviz2 \
    teleop-twist-joy \
    teleop-twist-keyboard \
    tlsf \
    tlsf-cpp \
    topic-monitor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/variants-release/archive/release/eloquent/desktop/0.8.4-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/desktop"
SRC_URI = "git://github.com/ros2-gbp/variants-release;${ROS_BRANCH};protocol=https"
SRCREV = "b80f44fab5221815f211e8e389f54a659ef85420"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
