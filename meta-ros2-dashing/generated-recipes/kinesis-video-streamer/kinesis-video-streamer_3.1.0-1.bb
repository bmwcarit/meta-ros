# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Kinesis Video Streams producer node"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "kinesis_video_streamer"
ROS_BPN = "kinesis_video_streamer"

ROS_BUILD_DEPENDS = " \
    aws-common \
    aws-ros2-common \
    image-transport \
    kinesis-manager \
    kinesis-video-msgs \
    rclcpp \
    rmw-implementation \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rmw-implementation-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    launch \
    launch-ros \
    python3-pyyaml \
    rmw-implementation \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/dashing/kinesis_video_streamer/3.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/kinesis_video_streamer"
SRC_URI = "git://github.com/aws-gbp/kinesis_video_streamer-release;${ROS_BRANCH};protocol=https"
SRCREV = "e0fdd8e751e7c06fca969c89516db4a1a34d6e7f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
