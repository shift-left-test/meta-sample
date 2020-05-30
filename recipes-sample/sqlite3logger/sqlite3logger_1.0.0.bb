SUMMARY = "sqlite3logger"
DESCRIPTION = "sqlite3logger - A sample project which depends on other modules"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/sqlite3logger"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/sqlite3logger/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

DEPENDS += "\
    sqlite3wrapper \
    stringutils \
"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/sqlite3logger.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit cmake
