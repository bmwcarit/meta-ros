# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The tuw_vehicle_msgs package"
AUTHOR = "Raphael Hauk <raphael.hauk@racing.tuwien.ac.at>"
ROS_AUTHOR = "Marcel Zeilinger <marcel.zeilinger@racing.tuwien.ac.at>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "tuw_msgs"
ROS_BPN = "tuw_vehicle_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    roscpp \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_vehicle_msgs/0.0.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tuw_vehicle_msgs"
SRC_URI = "git://github.com/tuw-robotics/tuw_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "d1b7368e8b4fdd342fb531bafdcce4e623621dac"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
