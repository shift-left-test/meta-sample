SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/autotools-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/autotools-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/autotools-project.git;protocol=http;nobranch=1"

SRCREV = "ba55d75de0533e6d00f216449e76999f11e29326"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
