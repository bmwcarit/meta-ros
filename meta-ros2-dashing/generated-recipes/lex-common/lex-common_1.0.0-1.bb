# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Lex Common utilities, intended for use by Lex clients"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/aws_common"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=80318c4afef111a7690eaf237460856b"

ROS_CN = "lex_common"
ROS_BPN = "lex_common"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
    aws-common \
    ros-environment \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
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

# matches with: https://github.com/aws-gbp/lex_common-release/archive/release/dashing/lex_common/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/lex_common"
SRC_URI = "git://github.com/aws-gbp/lex_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "89d42e1a29b103b1e9a1698801345f42b7d69ee9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
