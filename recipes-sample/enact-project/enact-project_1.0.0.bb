SUMMARY = "An enact based sample project"
DESCRIPTION = "An enact based sample project for meta-shift project"
AUTHOR = "Sung Gon Kim"
HOMEPAGE = "https://github.com/shift-left-test/enact-project"
BUGTRACKER = "https://github.com/shift-left-test/enact-project/issues"
SECTION = "misc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30ff2439bf48a9ce190c32d7615271b5"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/shift-left-test/enact-project.git;protocol=https;nobranch=1"

SRCREV = "f505c0f33db995164ef70f281ac0242ced066276"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"

def get_nodejs_arch(d):
    target_arch = d.getVar('TRANSLATED_TARGET_ARCH', True)

    if target_arch == "x86-64":
        target_arch = "x64"
    elif target_arch == "aarch64":
        target_arch = "arm64"
    elif target_arch == "powerpc":
        target_arch = "ppc"
    elif target_arch == "powerpc64":
        target_arch = "ppc64"
    elif (target_arch == "i486" or target_arch == "i586" or target_arch == "i686"):
        target_arch = "ia32"

    return target_arch

NPM_BIN ?= "${STAGING_BINDIR_NATIVE}/npm"
NPM_CACHE_DIR ?= "${WORKDIR}/npm_cache"
NPM_REGISTRY ?= "https://registry.npmjs.org/"
NPM_ARCH ?= "${@get_nodejs_arch(d)}"
NPM_INSTALL_FLAGS ?= "--arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --only=production --without-ssl --insecure --no-optional --verbose"

do_configure() {
    :
}

do_compile() {
    export HOME="${WORKDIR}"

    ${NPM_BIN} set cache ${NPM_CACHE_DIR}
    ${NPM_BIN} cache clear --force

    rm -rf ${S}/node_modules

    ${NPM_BIN} config set prefer-offline true
    ${NPM_BIN} config set package-lock true
    ${NPM_BIN} config set scripts-prepend-node-path true
    ${NPM_BIN} config set dev false
    ${NPM_BIN} config set strict-ssl false
    ${NPM_BIN} config set audit false
    ${NPM_BIN} config set registry ${NPM_REGISTRY}

    npm install ${NPM_INSTALL_FLAGS}
}
