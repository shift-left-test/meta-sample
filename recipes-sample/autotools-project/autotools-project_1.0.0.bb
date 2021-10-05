SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/autotools-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/autotools-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/autotools-project.git;protocol=http;nobranch=1"

SRCREV = "3bd5e909a74601c9534fc0238e55a561180c8a21"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
