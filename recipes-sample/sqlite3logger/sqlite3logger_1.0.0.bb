SUMMARY = "sqlite3logger"
DESCRIPTION = "sqlite3logger - A sample project which depends on other modules"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/sqlite3logger"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/sqlite3logger/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1b25eb8076e8b7bebc3cb0692513bee"

DEPENDS += "\
    sqlite3wrapper \
    stringutils \
"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/sqlite3logger.git;protocol=http;nobranch=1"

SRCREV = "a5eee04fea2f9723e5effd8c730f7682b87b9b8c"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
