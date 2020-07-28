# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "TODO"
AUTHOR = "Michael Jeronimo <michael.jeronimo@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_behavior_tree"

ROS_BUILD_DEPENDS = " \
    behaviortree-cpp-v3 \
    builtin-interfaces \
    geometry-msgs \
    lifecycle-msgs \
    nav-msgs \
    nav2-common \
    nav2-msgs \
    nav2-util \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    std-srvs \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    behaviortree-cpp-v3 \
    builtin-interfaces \
    geometry-msgs \
    lifecycle-msgs \
    nav-msgs \
    nav2-msgs \
    nav2-util \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/foxy/nav2_behavior_tree/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/nav2_behavior_tree"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "a3224a278fceded2bb10945a4a18f5de962c3cad"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
