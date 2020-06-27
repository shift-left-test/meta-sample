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

SRCREV = "1ca40bf3c6682eb81ec4674960c58ed683a3a283"

S = "${WORKDIR}/git"

inherit qmake5
