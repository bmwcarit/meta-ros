DESCRIPTION = "ros-world package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    packagegroup-ros-comm \
    actionlib \
    bond \
    bondcpp \
    bondpy \
    smclib \
    chatter-msgs \
    chatter-receiver \
    chatter-sender \
    class-loader \
    actionlib-msgs \
    diagnostic-msgs \
    geometry-msgs \
    nav-msgs \
    sensor-msgs \
    shape-msgs \
    stereo-msgs \
    trajectory-msgs \
    visualization-msgs \
    actionlib-tutorials \
    nodelet-tutorial-math \
    pluginlib-tutorials \
    console-bridge \
    dynamic-reconfigure \
    angles \
    tf2-msgs \
    tf2-py \
    tf2-ros \
    tf2 \
    tf \
    tf2-tools \
    image-transport \
    nodelet-topic-tools \
    nodelet \
    pluginlib \
    roscpp-tutorials \
    rospy-tutorials \
    cv-bridge \
    compressed-image-transport \
    compressed-depth-image-transport \
    theora-image-transport \
    cmake-modules \
    rosconsole-bridge \
    urdfdom-headers \
    urdfdom \
    control-msgs \
    realtime-tools \
    control-toolbox \
    controller-interface \
    controller-manager-msgs \
    controller-manager-tests \
    controller-manager \
    hardware-interface \
    joint-limits-interface \
    transmission-interface \
    collada-parser \
    resource-retriever \
    urdf-parser-plugin \
    urdf \
    collada-dom \
    effort-controllers \
    force-torque-sensor-controller \
    forward-command-controller \
    imu-sensor-controller \
    joint-state-controller \
    position-controllers \
    velocity-controllers \
    openslam-gmapping \
    gmapping \
    image-geometry \
    camera-calibration-parsers \
    camera-info-manager \
    polled-camera \
    xacro \
    filters \
    smach \
    smach-msgs \
    smach-ros \
    eigen-stl-containers \
    ivcon \
    convex-decomposition \
    camera-calibration \
    image-proc \
    image-rotate \
    image-view \
    stereo-image-proc \
    random-numbers \
    shape-tools \
    octomap-msgs \
    pcl-msgs \
    laser-geometry \
    map-msgs \
    "

# joint-state-publisher still has some issues
