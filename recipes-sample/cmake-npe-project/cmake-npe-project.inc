SUMMARY = "A null-pointer error project"
DESCRIPTION = "A cmake based null-pointer error project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/cmake-npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/cmake-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=72b5cdc59789a30d65d91c95069e4e2b"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/cmake-npe-project.git;protocol=http;nobranch=1"

SRCREV = "57bab27e3c949ec920e680b56518f44c928b1629"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
