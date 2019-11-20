# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "An application used to systematically record rosbags"
AUTHOR = "Brenden Gibbons <bgibbons@squarerobots.com>"
ROS_AUTHOR = "Brenden Gibbons <bgibbons@squarerobots.com>"
HOMEPAGE = "http://www.ros.org/wiki/bagger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "bagger"
ROS_BPN = "bagger"

ROS_BUILD_DEPENDS = " \
    message-generation \
    roscpp \
    roslint \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    rostest \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rosbag \
    roscpp \
    rospy \
    rostest \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    geometry-msgs \
    nav-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/squarerobot/bagger-release/archive/release/melodic/bagger/0.1.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/bagger"
SRC_URI = "git://github.com/squarerobot/bagger-release;${ROS_BRANCH};protocol=https"
SRCREV = "d96bf8e5dadaef3c83c8683d39dcdd7cce0586ca"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('bagger', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
