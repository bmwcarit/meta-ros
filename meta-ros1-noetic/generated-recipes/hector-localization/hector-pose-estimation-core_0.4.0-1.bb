# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "hector_pose_estimation_core is the core package of the hector_localization stack. It contains the Extended Kalman Filter (EKF)     that estimates the 6DOF pose of the robot. hector_pose_estimation can be used either as a library, as a nodelet or as a standalone node."
AUTHOR = "Johannes Meyer <joh@nnes-meyer.de>"
ROS_AUTHOR = "Johannes Meyer <joh@nnes-meyer.de>"
HOMEPAGE = "http://ros.org/wiki/hector_pose_estimation_core"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_localization"
ROS_BPN = "hector_pose_estimation_core"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geographic-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
    rosconsole \
    roscpp \
    rostime \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    libeigen \
    nav-msgs \
    rosconsole \
    roscpp \
    rostime \
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

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release/archive/release/noetic/hector_pose_estimation_core/0.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/hector_pose_estimation_core"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_localization-release;${ROS_BRANCH};protocol=https"
SRCREV = "4c6938e6e747356a700d70b2b8c3434d1688b842"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
