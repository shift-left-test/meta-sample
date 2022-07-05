SUMMARY = "sqlite3wrapper"
DESCRIPTION = "sqlite3wrapper - A simple sqlite3 wrapper for C++"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/SQLite3Wrapper"
BUGTRACKER = "https://github.com/shift-left-test/SQLite3Wrapper/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=df949e8c96ecf1483905048fb77276b5"

DEPENDS += "sqlite3"

SRC_URI = "git://github.com/shift-left-test/SQLite3Wrapper.git;protocol=https;nobranch=1"

SRCREV = "9d4d4b9bff3b38e4f120ad29cfac92602fea3ef4"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
