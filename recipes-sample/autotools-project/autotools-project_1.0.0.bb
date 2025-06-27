SUMMARY = "An autotools based sample project"
DESCRIPTION = "An autotools based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/autotools-project"
BUGTRACKER = "https://github.com/shift-left-test/autotools-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=482f1f569fef1eb92a4f68bbddae8724"

SRC_URI = "git://github.com/shift-left-test/autotools-project.git;protocol=https;nobranch=1"

SRCREV = "935c4001fb175336f3f945201be4834f60ef82a9"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
