# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The khi_rs_gazebo package"
AUTHOR = "matsui_hiro <matsui_hiro@khi.co.jp>"
ROS_AUTHOR = "matsui_hiro <matsui_hiro@khi.co.jp>"
HOMEPAGE = "http://ros.org/wiki/khi_robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "khi_robot"
ROS_BPN = "khi_rs_gazebo"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    gazebo-ros-control \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
    gazebo-ros-control \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-ros-control \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Kawasaki-Robotics/khi_robot-release/archive/release/melodic/khi_rs_gazebo/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/khi_rs_gazebo"
SRC_URI = "git://github.com/Kawasaki-Robotics/khi_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "23bf6d77493884d0227c12056e923cbe221871e0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
