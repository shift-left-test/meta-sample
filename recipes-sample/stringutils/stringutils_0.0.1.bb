DESCRIPTION = "A simple library which provides a series of utility functions for C++ projects"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

SRC_URI = "git://mod.lge.com/hub/yocto/stringutils.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit cmake
