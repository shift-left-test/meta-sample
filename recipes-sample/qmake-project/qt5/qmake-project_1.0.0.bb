SUMMARY = "A qmake5 based sample project"
DESCRIPTION = "A qmake5 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake-project.git;protocol=http;nobranch=1"

SRCREV = "7da677468200d7ad034a1c697cfd0cb9cd522f3f"

S = "${WORKDIR}/git"

inherit qmake5
