SUMMARY = "A cmake based sample project"
DESCRIPTION = "A camke based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/cmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/cmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/cmake-project.git;protocol=http;nobranch=1"

SRCREV = "4dc56f8d6145f5b54583e0ac0c7ca508e9b3f987"

S = "${WORKDIR}/git"

inherit cmake
