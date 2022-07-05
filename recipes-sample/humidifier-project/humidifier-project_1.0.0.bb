SUMMARY = "humidifier-project"
DESCRIPTION = "humidifier-project - A CMakeUtils based sample project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/humidifier-project"
BUGTRACKER = "https://github.com/shift-left-test/humidifier-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f1b25eb8076e8b7bebc3cb0692513bee"

DEPENDS += "\
    fff \
    sqlite3wrapper \
"

SRC_URI = "git://github.com/shift-left-test/humidifier-project.git;protocol=https;nobranch=1"

SRCREV = "5ac64410a94044826bb0f535f6133ef855d78371"

S = "${WORKDIR}/git"

inherit cmake

BBCLASSEXTEND = "native nativesdk"
