# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Mesh Conversion Utility  Used to generate '.iv' files from '.stl' files.  This package has not been changed since 2001 and appears to be very stable.  We plan on keeping this package in this revision for mesh conversions.  This package is only available as a single source file for download.  There are no local modifications to this package."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "John Burkardt <jburkardt@fsu.edu>"
HOMEPAGE = "https://sourceforge.net/projects/ivcon/"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "ivcon"
ROS_BPN = "ivcon"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
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

# matches with: https://github.com/ros-gbp/ivcon-release/archive/release/melodic/ivcon/0.1.7-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ivcon"
SRC_URI = "git://github.com/ros-gbp/ivcon-release;${ROS_BRANCH};protocol=https"
SRCREV = "56b4843fd8879918050d5d539edc9d1eb07e8763"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
