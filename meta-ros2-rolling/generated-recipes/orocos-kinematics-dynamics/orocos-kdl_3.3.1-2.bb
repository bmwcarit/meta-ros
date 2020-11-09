# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "This package contains a recent version of the Kinematics and Dynamics     Library (KDL), distributed by the Orocos Project."
AUTHOR = "Steven! Ragnarök <steven@openrobotics.org>"
ROS_AUTHOR = "Ruben Smits"
HOMEPAGE = "http://wiki.ros.org/orocos_kdl"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "orocos_kinematics_dynamics"
ROS_BPN = "orocos_kdl"

ROS_BUILD_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    eigen3-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    eigen3-cmake-module-native \
"

ROS_EXEC_DEPENDS = " \
    pkgconfig \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    cppunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/orocos_kinematics_dynamics-release/archive/release/rolling/orocos_kdl/3.3.1-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/orocos_kdl"
SRC_URI = "git://github.com/ros2-gbp/orocos_kinematics_dynamics-release;${ROS_BRANCH};protocol=https"
SRCREV = "efd2c0124876e5884fa1cb3205c92b121212e98a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
