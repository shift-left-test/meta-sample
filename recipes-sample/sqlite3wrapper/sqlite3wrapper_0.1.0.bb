SUMMARY = "sqlite3wrapper"
DESCRIPTION = "sqlite3wrapper - A simple sqlite3 wrapper for C++"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/SQLite3Wrapper"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/SQLite3Wrapper/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=df949e8c96ecf1483905048fb77276b5"

DEPENDS += "sqlite3"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/SQLite3Wrapper.git;protocol=http;nobranch=1"

SRCREV = "18a19b3788fae2d8b7edd86dee1988f1dbd1c507"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
