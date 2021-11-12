SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/autotools-npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/autotools-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=196153602d7e4313ff44195d6c73279a"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/autotools-npe-project.git;protocol=http;nobranch=1"

SRCREV = "dd073659b409b7a8751cdd48bdaf8d6068936b8f"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
