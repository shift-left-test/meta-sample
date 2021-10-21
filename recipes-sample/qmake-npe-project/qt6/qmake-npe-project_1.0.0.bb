SUMMARY = "A qmake6 based sample project"
DESCRIPTION = "A qmake6 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake-npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake-npe-project.git;protocol=http;nobranch=1"

SRCREV = "7c9fd9f53f4a607048d8a31112bfccc792e44563"

S = "${WORKDIR}/git"

inherit qt6-qmake

BBCLASSEXTEND = "native nativesdk"
