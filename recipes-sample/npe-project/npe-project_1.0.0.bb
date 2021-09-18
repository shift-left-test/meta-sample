SUMMARY = "A null-pointer error project"
DESCRIPTION = "A cmake based null-pointer error project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72b5cdc59789a30d65d91c95069e4e2b"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/npe-project.git;protocol=http;nobranch=1"

SRCREV = "89bf40ae2d95660f3f9959d30536b3a8333dfc50"

S = "${WORKDIR}/git"

inherit cmake
