# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Path following control package for wheeled mobile robot"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "trajectory_tracker"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    libeigen \
    nav-msgs \
    neonavigation-common \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    libeigen \
    nav-msgs \
    neonavigation-common \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-tracker-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    libeigen \
    nav-msgs \
    neonavigation-common \
    roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-tracker-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation-release/archive/release/melodic/trajectory_tracker/0.4.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/trajectory_tracker"
SRC_URI = "git://github.com/at-wat/neonavigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "537053994f4fe981505bb79d7103287252177f1e"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('neonavigation', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
