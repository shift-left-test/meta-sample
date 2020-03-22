DESCRIPTION = "sample project for testing purpose"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dcada7ad9f632dba360934666016c666"

SRC_URI = "git://mod.lge.com/hub/yocto/sample-project.git;protocol=http;tag=${PV};nobranch=1"

S = "${WORKDIR}/git"

inherit cmake
