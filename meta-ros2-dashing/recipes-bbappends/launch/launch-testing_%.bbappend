# Copyright (c) 2019 LG Electronics, Inc.

# This component puts *_proc files under libdir.
FILES_${PN}_prepend = " \
    ${datadir}/lib/${ROS_BPN} \
"
