SUMMARY = "A qmake5 based sample project"
DESCRIPTION = "A qmake5 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake-project.git;protocol=http;nobranch=1"

SRCREV = "7e6aba2c76c47d6936e01091a511537ae86b329c"

S = "${WORKDIR}/git"

inherit qmake5

BBCLASSEXTEND = "native nativesdk"
