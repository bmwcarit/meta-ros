# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The handeye package"
AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
ROS_AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/handeye"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

ROS_CN = "handeye"
ROS_BPN = "handeye"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-enum34 \
    ${PYTHON_PN}-matplotlib \
    ${PYTHON_PN}-numpy \
    ${ROS_UNRESOLVED_DEP-python-scipy} \
    baldor \
    criutils \
    geometry-msgs \
    message-runtime \
    std-msgs \
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

# matches with: https://github.com/crigroup/handeye-release/archive/release/melodic/handeye/0.1.1-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/handeye"
SRC_URI = "git://github.com/crigroup/handeye-release;${ROS_BRANCH};protocol=https"
SRCREV = "3050519584094217a54fed21113b889265952809"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
