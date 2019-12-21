# Copyright (c) 2019 LG Electronics, Inc.

require amazon-kinesis-video-streams-producer-sdk-cpp-${PV}.inc

KVSSDK_PROJECT = "kinesis-video-pic"

DEPENDS += "gtest"

# WARNING: amazon-kinesis-video-streams-producer-sdk-cpp-kinesis-video-pic-1.7.8-r0 do_package: QA Issue: amazon-kinesis-video-streams-producer-sdk-cpp-kinesis-video-pic: Files/directories were installed but not shipped in any package:
#   /usr/tst
#   /usr/tst/samples
# Please set FILES such that these items are packaged. Alternatively if they are unneeded, avoid installing them or delete them within do_install.
# amazon-kinesis-video-streams-producer-sdk-cpp-kinesis-video-pic: 2 installed and not shipped files. [installed-vs-shipped]
do_install_append() {
    rm -rfv ${D}${prefix}/tst
}
