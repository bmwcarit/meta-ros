# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Components of MoveIt! that offer visualization"
AUTHOR = "Jon Binney <jon.binney@gmail.com>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_ros_visualization"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libogre-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libqt5-opengl-dev} \
    class-loader \
    geometric-shapes \
    interactive-markers \
    libeigen \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    moveit-ros-robot-interaction \
    moveit-ros-warehouse \
    object-recognition-msgs \
    pluginlib \
    qtbase \
    rosconsole \
    roscpp \
    rospy \
    rviz \
    tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    geometric-shapes \
    interactive-markers \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    moveit-ros-robot-interaction \
    moveit-ros-warehouse \
    object-recognition-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    rviz \
    tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometric-shapes \
    interactive-markers \
    moveit-ros-perception \
    moveit-ros-planning-interface \
    moveit-ros-robot-interaction \
    moveit-ros-warehouse \
    object-recognition-msgs \
    pluginlib \
    rosconsole \
    roscpp \
    rospy \
    rviz \
    tf2-eigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_visualization/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_ros_visualization"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "ec39d819cc390d50f01da4d0da8fdae1ec947136"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('moveit', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
