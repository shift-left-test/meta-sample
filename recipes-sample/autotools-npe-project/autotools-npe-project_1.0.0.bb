SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/autotools-npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/autotools-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/autotools-npe-project.git;protocol=http;nobranch=1"

SRCREV = "be7d7498122d709400cfc240c219ccb3713272ba"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
