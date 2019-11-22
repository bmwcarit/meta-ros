# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "Testing utilities and tests for the tracetools package."
AUTHOR = "Christophe Bedard <bedard.christophe@gmail.com>"
ROS_AUTHOR = "Christophe Bedard <fixed-term.christophe.bourquebedard@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros2_tracing"
ROS_BPN = "tracetools_test"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch-ros \
    python3-pytest \
    tracetools \
    tracetools-launch \
    tracetools-read \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/shr-project/ros2_tracing-release/archive/release/eloquent/tracetools_test/0.2.10-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/tracetools_test"
SRC_URI = "git://github.com/shr-project/ros2_tracing-release;${ROS_BRANCH};protocol=https"
SRCREV = "980e5cab58abaf5ed04d9d34db89f176e33e7535"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros2-tracing', d)}"
ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
