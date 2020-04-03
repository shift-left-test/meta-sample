DESCRIPTION = "A simple sqlite3 wrapper for C++"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68afeac0415f7ffea472ec34ec9d20c7"

SRC_URI = "git://mod.lge.com/hub/yocto/SQLite3Wrapper.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS += "sqlite3"
