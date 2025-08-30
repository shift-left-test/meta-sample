SUMMARY = "A cmake based sample project"
DESCRIPTION = "A cmake based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/cmake-project"
BUGTRACKER = "https://github.com/shift-left-test/cmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1b25eb8076e8b7bebc3cb0692513bee"

SRC_URI = "git://github.com/shift-left-test/cmake-project.git;protocol=https;nobranch=1"

SRCREV = "039d0bb1c7324ece09d44344c1d48aaa0b6e210f"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
