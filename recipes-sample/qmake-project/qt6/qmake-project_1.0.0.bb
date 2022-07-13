SUMMARY = "A qmake6 based sample project"
DESCRIPTION = "A qmake6 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/qmake-project"
BUGTRACKER = "https://github.com/shift-left-test/qmake-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/shift-left-test/qmake-project.git;protocol=https;nobranch=1"

SRCREV = "2bde968fffb21229b84c0de32270d34410e70e9d"

S = "${WORKDIR}/git"

inherit qt6-qmake

BBCLASSEXTEND = "native nativesdk"
