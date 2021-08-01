SUMMARY = "A qmake5 based sample project"
DESCRIPTION = "A qmake5 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake5-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake5-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake5-project.git;protocol=http;nobranch=1"

SRCREV = "dfe4e06fbc11edbf981ae85b3e8683c3d60ca5e5"

S = "${WORKDIR}/git"

inherit qmake5
