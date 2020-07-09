SUMMARY = "humidifier-project"
DESCRIPTION = "humidifier-project - A CMakeUtils based sample project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/humidifier-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/humidifier-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

DEPENDS += "fff"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/humidifier-project.git;protocol=http;nobranch=1"

SRCREV = "8df2afd15b666db337b590d42395533bed775c88"

S = "${WORKDIR}/git"

inherit cmake
