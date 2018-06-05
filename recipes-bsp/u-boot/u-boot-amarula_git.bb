#Integrating Amarula U-Boot

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DESCRIPTION = "Amarula dev U-Boot"
COMPATIBLE_MACHINE = "(icorem6|icorem6mipi|icorem6rqs|icorem6ctouch|geam6ul|isiot)"

DEPENDS = "dtc-native bc-native"
SRC_URI = "git://github.com/amarula/u-boot-amarula.git;branch=imx6-yocto;"
SRCREV = "${AUTOREV}"

PV = "v2018.05+git${SRCPV}"

S = "${WORKDIR}/git"
