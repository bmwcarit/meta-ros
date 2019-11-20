# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A set of plugins for publishing and subscribing to sensor_msgs/Image topics     in representations other than raw pixel data. For example, for viewing a     stream of images off-robot, a video codec will give much lower bandwidth     and latency. For low frame rate tranport of high-definition images, you     might prefer sending them as JPEG or PNG-compressed form."
AUTHOR = "Michael Carroll <michael@openrobotics.org>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_transport_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_transport_plugins"
ROS_BPN = "image_transport_plugins"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    compressed-depth-image-transport \
    compressed-image-transport \
    theora-image-transport \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_transport_plugins-release/archive/release/eloquent/image_transport_plugins/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/image_transport_plugins"
SRC_URI = "git://github.com/ros2-gbp/image_transport_plugins-release;${ROS_BRANCH};protocol=https"
SRCREV = "adb057246e63d8755e76fe378ff83e98bb779750"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('image-transport-plugins', d)}"
ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
