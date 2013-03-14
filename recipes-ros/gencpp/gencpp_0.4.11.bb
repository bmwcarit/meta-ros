DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg-native"

SRC_URI = "https://github.com/ros/${BPN}/archive/${PV}.tar.gz;downloadfilename=${BP}.tar.gz"
SRC_URI[md5sum] = "be0b3986e98f3370fef4c1fffe3a69f4"
SRC_URI[sha256sum] = "c68b4518dbc5d65fd19d43724e5c9b0e66c769ef6066e3d511a6ffce2623f3c7"

inherit catkin
