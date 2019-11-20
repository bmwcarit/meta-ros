# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize   ROS messages which type is unknown at compilation time."
AUTHOR = "Davide Faconti <faconti@icarustechnology.com>"
ROS_AUTHOR = "Davide Faconti <faconti@icarustechnology.com>"
HOMEPAGE = "http://www.ros.org/wiki/ros_type_introspection"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_type_introspection"
ROS_BPN = "ros_type_introspection"

ROS_BUILD_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    abseil-cpp \
    roscpp \
    roscpp-serialization \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/facontidavide/ros_type_introspection-release/archive/release/melodic/ros_type_introspection/1.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ros_type_introspection"
SRC_URI = "git://github.com/facontidavide/ros_type_introspection-release;${ROS_BRANCH};protocol=https"
SRCREV = "21782f0db83828502b0d19091f976206ddb117b2"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-type-introspection', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
