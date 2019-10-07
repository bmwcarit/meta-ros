# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Generate the C++ interfaces for RTI Connext."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_typesupport_connext"
ROS_BPN = "rosidl_typesupport_connext_cpp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_rti-connext-dds-5.3.1-native} \
    ament-cmake-native \
    connext-cmake-module-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_rti-connext-dds-5.3.1-native} \
    ament-cmake-native \
    connext-cmake-module-native \
    rcutils-native \
    rosidl-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-generator-dds-idl-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-parser \
    rosidl-typesupport-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/dashing/rosidl_typesupport_connext_cpp/0.7.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "66ca252a1e5371d38896959bf44e1c9e"
SRC_URI[sha256sum] = "f8844c4f51edc9f6c061d669939d67d42461f91fe50c6f408fdd978ac543196b"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-dashing-rosidl_typesupport_connext_cpp-0.7.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosidl-typesupport-connext', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosidl-typesupport-connext', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-connext/rosidl-typesupport-connext_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-connext/rosidl-typesupport-connext-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-connext/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosidl-typesupport-connext/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
