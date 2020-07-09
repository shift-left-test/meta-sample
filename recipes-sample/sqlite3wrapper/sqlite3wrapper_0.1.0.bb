SUMMARY = "sqlite3wrapper"
DESCRIPTION = "sqlite3wrapper - A simple sqlite3 wrapper for C++"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/SQLite3Wrapper"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/SQLite3Wrapper/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68afeac0415f7ffea472ec34ec9d20c7"

DEPENDS += "sqlite3"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/SQLite3Wrapper.git;protocol=http;nobranch=1"

SRCREV = "f780261a13ff93f545559ea40ccf7548227aad3d"

S = "${WORKDIR}/git"

inherit cmake
