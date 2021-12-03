SUMMARY = "A null-pointer error project"
DESCRIPTION = "A cmake based null-pointer error project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/cmake-npe-project"
BUGTRACKER = "https://github.com/shift-left-test/cmake-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0cf1dece46e6c3ae6c16fc35b1d55cb6"

SRC_URI = "git://github.com/shift-left-test/cmake-npe-project.git;protocol=https;nobranch=1"

SRCREV = "8bf5575fb6e32a8ac2d8f0e6e9b5f346e982af47"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
