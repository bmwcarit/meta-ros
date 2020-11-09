# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Twist multiplexer, which multiplex several velocity commands (topics) and       allows to priorize or disable them (locks)."
AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
ROS_AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "CC BY-NC-SA 4.0"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=6bc0e2b80b41b84c8240cea714dea709"

ROS_CN = "twist_mux"
ROS_BPN = "twist_mux"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    rostest \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    std-msgs \
    twist-mux-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    geometry-msgs \
    roscpp \
    std-msgs \
    twist-mux-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rospy \
    rostopic \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/twist_mux-release/archive/release/melodic/twist_mux/3.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/twist_mux"
SRC_URI = "git://github.com/ros-gbp/twist_mux-release;${ROS_BRANCH};protocol=https"
SRCREV = "e64ccb4df7baa7705352f1367f9cab04d764b751"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
