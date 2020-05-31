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

SRCREV = "614c7f2840069cd579e6e98d26b5ce73eefbbf5c"

S = "${WORKDIR}/git"

inherit cmake
