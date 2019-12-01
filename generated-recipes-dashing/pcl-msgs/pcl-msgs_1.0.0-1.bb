# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Package containing PCL (Point Cloud Library)-related ROS messages."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Open Perception"
HOMEPAGE = "http://wiki.ros.org/pcl_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pcl_msgs"
ROS_BPN = "pcl_msgs"

ROS_BUILD_DEPENDS = " \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/pcl_msgs-release/archive/release/dashing/pcl_msgs/1.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "fac5fc9be045705819b1aa488fd04089"
SRC_URI[sha256sum] = "affc867936f4dbb96d12f372d6f0d427deef690de34c8fd06f392218ef7ab021"
S = "${WORKDIR}/pcl_msgs-release-release-dashing-pcl_msgs-1.0.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pcl-msgs', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pcl-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pcl-msgs/pcl-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pcl-msgs/pcl-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pcl-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pcl-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
