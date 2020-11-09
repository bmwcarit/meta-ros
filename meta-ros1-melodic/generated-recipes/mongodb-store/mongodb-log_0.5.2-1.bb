# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The mongodb_log package"
AUTHOR = "Marc Hanheide <marc@hanheide.net>"
ROS_AUTHOR = "Tim Niemueller <tim@niemueller.de>"
HOMEPAGE = "http://ros.org/wiki/mongodb_log"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "GPLv2"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "mongodb_store"
ROS_BPN = "mongodb_log"

ROS_BUILD_DEPENDS = " \
    mongodb-store \
    openssl \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-pymongo \
    mongodb-store \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-pymongo \
    mongodb-store \
    rosgraph \
    roslib \
    rospy \
    rostopic \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_log/0.5.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mongodb_log"
SRC_URI = "git://github.com/strands-project-releases/mongodb_store;${ROS_BRANCH};protocol=https"
SRCREV = "c60bd3bc4f615f8344b9d6231cb9f9700281ae9e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
