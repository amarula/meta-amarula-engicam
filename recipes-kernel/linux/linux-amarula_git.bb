# Integrate Amarula Development Linux Kernel for engicam
# Board Support - using this is temporary once the patches
# moved to mainline stable kernel will migrate to mainline
# till then use development Kernel

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

DESCRIPTION = "Amarula Dev Linux Kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
SRC_URI = "git://github.com/amarula/linux-amarula.git;branch=imx6-yocto"

S = "${WORKDIR}/git"

LINUX_VERSION ?= "4.18.0-rc5"
SRCREV ?= "${AUTOREV}"
PV = "${LINUX_VERSION}+git${SRCPV}"

KCONF_BSP_AUDIT_LEVEL = "0"
deltask kernel_configme

# Following are Engicam Boards Specific Config Variables

COMPATIBLE_MACHINE = "(icorem6|icorem6rqs|icorem6mipi|icorem6ctouch|geam6ul|isiot)"

KERNEL_IMAGETYPE = "uImage"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

# Using an "In-Tree" defconfig File
KBUILD_DEFCONFIG ?= "imx_v6_v7_defconfig"
