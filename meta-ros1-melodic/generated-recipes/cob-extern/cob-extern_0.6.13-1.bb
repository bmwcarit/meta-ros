# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cob_extern stack contains third party libraries needed for operating Care-O-bot. The packages are downloaded from the manufactorers website and not changed in any way."
AUTHOR = "Richard Bormann <richard.bormann@ipa.fraunhofer.de>"
ROS_AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_extern"
SECTION = "devel"
LICENSE = "LGPL-2 & proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "cob_extern"
ROS_BPN = "cob_extern"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libdlib \
    libntcan \
    libpcan \
    libphidgets \
    opengm \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_extern-release/archive/release/melodic/cob_extern/0.6.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_extern"
SRC_URI = "git://github.com/ipa320/cob_extern-release;${ROS_BRANCH};protocol=https"
SRCREV = "95ee1d9b7d73de1e2c9e4040971f5b816f75ef0c"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cob-extern', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
