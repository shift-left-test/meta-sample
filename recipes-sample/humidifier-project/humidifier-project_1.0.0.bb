SUMMARY = "humidifier-project"
DESCRIPTION = "humidifier-project - A CMakeUtils based sample project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "http://mod.lge.com/hub/yocto/sample/humidifier-project"
BUGTRACKER = "http://mod.lge.com/hub/yocto/sample/humidifier-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1b25eb8076e8b7bebc3cb0692513bee"

DEPENDS += "fff"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/humidifier-project.git;protocol=http;nobranch=1"

SRCREV = "07b77fff9b309aa319dbe2e6e4e0166d223744a2"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
