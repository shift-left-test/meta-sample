DESCRIPTION = "cpp-project for testing purpose"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5b34fb28d5adc2108f3317d97f59937"

SRC_URI = "git://mod.lge.com/hub/yocto/sample/cpp-project-qt5.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit qmake5

DEPENDS = "qtbase"
