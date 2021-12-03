SUMMARY = "stringutils"
DESCRIPTION = "stringutils - A simple library which provides a series of utility functions for C++ projects"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/stringutils"
BUGTRACKER = "https://github.com/shift-left-test/stringutils/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

SRC_URI = "git://github.com/shift-left-test/stringutils.git;protocol=https;nobranch=1"

SRCREV = "1d4b022d4d910247b364a6699dd8f3d82cb9420b"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY_${PN} = "1"

BBCLASSEXTEND = "native nativesdk"
