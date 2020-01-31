# Generated by superflore -- DO NOT EDIT
#
# Copyright 2020 Open Source Robotics Foundation

inherit ros_distro_eloquent
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

# matches with: https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/eloquent/rosidl_typesupport_connext_cpp/0.8.4-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/rosidl_typesupport_connext_cpp"
SRC_URI = "git://github.com/ros2-gbp/rosidl_typesupport_connext-release;${ROS_BRANCH};protocol=https"
SRCREV = "1b057a50063bfccc72e27797fc9496787ba24063"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
