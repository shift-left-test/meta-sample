SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/autotools-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/autotools-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/autotools-project.git;protocol=http;nobranch=1"

SRCREV = "ad8cb67a5da0b403de3c9d12167f0bbb9a4e156e"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
