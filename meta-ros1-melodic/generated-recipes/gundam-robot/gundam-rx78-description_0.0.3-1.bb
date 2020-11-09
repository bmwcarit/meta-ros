# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "gundam_rx78_description contains the ROS URDF file of the GUNDAM RX-78 robot"
AUTHOR = "Kei Okada <kei.okada@gmail.com>"
ROS_AUTHOR = "Association GUNDAM GLOBAL CHALLENGE"
HOMEPAGE = "http://wiki.ros.org/gundam_rx78_description"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "TERMS OF USE FOR GUNDAM RESEARCH OPEN SIMULATOR Attribution-NonCommercial-ShareAlike & BSD"
LICENSE = "TERMS-OF-USE-FOR-GUNDAM-RESEARCH-OPEN-SIMULATOR-Attribution-NonCommercial-ShareAlike & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5e61087bff3fb766fa70953b6de4c9f"

ROS_CN = "gundam_robot"
ROS_BPN = "gundam_rx78_description"

ROS_BUILD_DEPENDS = " \
    roslint \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    robot-state-publisher \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/gundam-global-challenge/gundam_robot-release/archive/release/melodic/gundam_rx78_description/0.0.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/gundam_rx78_description"
SRC_URI = "git://github.com/gundam-global-challenge/gundam_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "df06ea67c2a623bfb80efbd2030305b08d260901"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
