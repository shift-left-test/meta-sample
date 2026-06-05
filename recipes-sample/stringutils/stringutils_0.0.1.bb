SUMMARY = "stringutils"
DESCRIPTION = "stringutils - A simple library which provides a series of utility functions for C++ projects"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/stringutils"
BUGTRACKER = "https://github.com/shift-left-test/stringutils/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

SRC_URI = "git://github.com/shift-left-test/stringutils.git;protocol=https;nobranch=1"

SRCREV = "c9a5a93e9c91a2d986d8253c0446ff2a2e5615c5"

inherit cmake

ALLOW_EMPTY_${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
