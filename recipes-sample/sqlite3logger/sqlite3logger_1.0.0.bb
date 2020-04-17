DESCRIPTION = "A sample project which depends on other modules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/sqlite3logger.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS += "stringutils sqlite3wrapper"
