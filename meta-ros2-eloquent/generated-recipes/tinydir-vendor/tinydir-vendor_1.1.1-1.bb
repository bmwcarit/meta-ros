# Generated by superflore -- DO NOT EDIT
#
# Copyright 2020 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "CMake shim over tinydir: https://github.com/cxong/tinydir/"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "tinydir_vendor"
ROS_BPN = "tinydir_vendor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/tinydir_vendor-release/archive/release/eloquent/tinydir_vendor/1.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/tinydir_vendor"
SRC_URI = "git://github.com/ros2-gbp/tinydir_vendor-release;${ROS_BRANCH};protocol=https"
SRCREV = "b37e1cf5c89731c462c533ddafeb9816f0dab612"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
