SUMMARY = "A qmake6 based sample project"
DESCRIPTION = "A qmake6 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake-project.git;protocol=http;nobranch=1"

SRCREV = "1745d660bdb88231d23fa8f4834e39576bb01d61"

S = "${WORKDIR}/git"

inherit qt6-qmake

BBCLASSEXTEND = "native nativesdk"
