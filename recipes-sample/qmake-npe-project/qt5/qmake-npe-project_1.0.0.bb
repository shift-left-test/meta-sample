SUMMARY = "A qmake5 based sample project"
DESCRIPTION = "A qmake5 based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/qmake-npe-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/qmake-npe-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=196153602d7e4313ff44195d6c73279a"

DEPENDS += "qtbase"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/qmake-npe-project.git;protocol=http;nobranch=1"

SRCREV = "7c4598da57b597ecba73aed782156e3c1907d7f6"

S = "${WORKDIR}/git"

inherit qmake5

BBCLASSEXTEND = "native nativesdk"
