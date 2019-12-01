# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Implementation of RTPS standard."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fastrtps"
ROS_BPN = "fastrtps"

ROS_BUILD_DEPENDS = " \
    asio \
    fastcdr \
    libtinyxml2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    libtinyxml2 \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
    libtinyxml2 \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/fastrtps-release/archive/release/dashing/fastrtps/1.8.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "50ffd715e9f5b1ae23073de27af8f64f"
SRC_URI[sha256sum] = "59077766b9b801862280e898f06dad701d4b54f0fbf88ac387b725e08acc63df"
S = "${WORKDIR}/fastrtps-release-release-dashing-fastrtps-1.8.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fastrtps', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fastrtps', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastrtps/fastrtps_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastrtps/fastrtps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastrtps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fastrtps/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
