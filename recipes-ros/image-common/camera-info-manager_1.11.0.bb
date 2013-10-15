DESCRIPTION = "This package provides a C++ interface for camera calibration information."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost camera-calibration-parsers image-transport roscpp roslib rostest sensor-msgs"

require image-common.inc

SRC_URI += "file://0001-check-for-CATKIN_ENABLE_TESTING.patch;striplevel=2"
