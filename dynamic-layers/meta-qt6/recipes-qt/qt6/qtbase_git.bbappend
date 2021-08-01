FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

# TODO: qtbase-native fails to build with g++ from hosttools(7.5.0)
# Drop this once our build host has a newer version of g++.
SRC_URI_append_class-native = " \
    file://0001-Fix-compile-error-with-g-7.5.0.patch \
"

