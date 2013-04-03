DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS nodes locally and remotely \
via SSH, as well as setting parameters on the Parameter Server."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"
RDEPENDS_${PN} = "\
  python-textutils \
  python-logging \
  python-threading \
  python-rospkg \
  rosgraph \
  python-pyyaml \
  roslib \
  catkin \
  python-catkin-pkg \
  rosclean \
  rosmaster \
  rosgraph-msgs \
    genpy \
      genmsg \
    std-msgs \
"

require ros-comm.inc

S = "${WORKDIR}/ros_comm-${PV}/tools/${BPN}"
