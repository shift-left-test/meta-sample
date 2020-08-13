SUMMARY = "stringutils"
DESCRIPTION = "stringutils - A simple library which provides a series of utility functions for C++ projects"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/stringutils"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/stringutils/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/stringutils.git;protocol=http;nobranch=1"

SRCREV = "a851f80c16b1385467d2127d4b51fb08845a3af4"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY_${PN} = "1"
