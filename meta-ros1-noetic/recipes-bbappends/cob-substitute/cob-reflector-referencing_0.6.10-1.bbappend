# Copyright (c) 2021 LG Electronics, Inc.

# ERROR: cob-reflector-referencing-0.6.10-1-r0 do_package_qa: QA Issue: /usr/opt/ros/noetic/lib/cob_reflector_referencing/reflector_referencing_node contained in package cob-reflector-referencing requires /bin/bash, but no providers found in RDEPENDS_cob-reflector-referencing? [file-rdeps]
RDEPENDS_${PN} += "bash"

# This is needed only for webOS OSE and it's not in meta-ros-webos, because
# then meta-ros-webos would need to include this .bbappend just when
# meta-ros1-noetic layer is included
VIRTUAL-RUNTIME_bash ?= "bash"
RDEPENDS_${PN}_append_class-target_webos = " ${VIRTUAL-RUNTIME_bash}"
RDEPENDS_${PN}_remove_class-target_webos = "${@oe.utils.conditional('WEBOS_PREFERRED_PROVIDER_FOR_BASH', 'busybox', 'bash', '', d)}"
