# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using introspection type support."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ricardo González"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_fastrtps"
ROS_BPN = "rmw_fastrtps_dynamic_cpp"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rmw-fastrtps-shared-cpp \
    rosidl-runtime-c \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    fastrtps-cmake-module-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    fastrtps-cmake-module \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rmw-fastrtps-shared-cpp \
    rosidl-runtime-c \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-fastrtps-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    osrf-testing-tools-cpp \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/rolling/rmw_fastrtps_dynamic_cpp/3.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rmw_fastrtps_dynamic_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_fastrtps-release;${ROS_BRANCH};protocol=https"
SRCREV = "ba476919aae950f32894464c930637eeb264f1b7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
