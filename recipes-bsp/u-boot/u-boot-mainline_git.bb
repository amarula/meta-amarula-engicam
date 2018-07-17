#Integrating Mainline U-Boot

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DESCRIPTION = "Das U-Boot"
COMPATIBLE_MACHINE = "(icorem6|icorem6mipi|icorem6rqs|icorem6ctouch|geam6ul|isiot)"

DEPENDS = "dtc-native bc-native"
SRC_URI = "git://git.denx.de/u-boot.git;"
#commit revison for v2018.07 tag
SRCREV = "8c5d4fd0ec222701598a27b26ab7265d4cee45a3"

PV = "v2018.07+git${SRCPV}"

S = "${WORKDIR}/git"
