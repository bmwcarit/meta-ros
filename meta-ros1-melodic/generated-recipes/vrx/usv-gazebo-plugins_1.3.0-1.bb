# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Gazebo plugins for simulating Unmanned Surface Vehicles     Originaly copied from https://github.com/bsb808/usv_gazebo_plugins"
AUTHOR = "Carlos Aguero <caguero@osrfoundation.org>"
ROS_AUTHOR = "Brian Bingham <briansbingham@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/usv_gazebo_plugins"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "vrx"
ROS_BPN = "usv_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    libeigen \
    roscpp \
    std-msgs \
    wave-gazebo-plugins \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    libeigen \
    roscpp \
    std-msgs \
    wave-gazebo-plugins \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-rosdev \
    libeigen \
    message-runtime \
    roscpp \
    std-msgs \
    wave-gazebo-plugins \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/vrx-release/archive/release/melodic/usv_gazebo_plugins/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/usv_gazebo_plugins"
SRC_URI = "git://github.com/ros-gbp/vrx-release;${ROS_BRANCH};protocol=https"
SRCREV = "596142bf66b6ea76e87b29433ed57644dab3dfa9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
