SUMMARY = "A cmake based sample project"
DESCRIPTION = "A camke based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/cmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/cmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/cmake-project.git;protocol=http;nobranch=1"

SRCREV = "1579cd9e0db8a63ffaeb40a25cf17031787d4ea8"

S = "${WORKDIR}/git"

inherit cmake
