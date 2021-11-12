SUMMARY = "A cmake based sample project"
DESCRIPTION = "A cmake based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/cmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/cmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1b25eb8076e8b7bebc3cb0692513bee"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/cmake-project.git;protocol=http;nobranch=1"

SRCREV = "6b7988090acc040f38d67f0d6b0fbf603ca8fce9"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
