FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.16.12"
KBRANCH ?= "linux-4.16.y"
SRCREV ?= "e2a75b6d2e9de22858bb2bfa14fea56a2c6e4761"

require linux-stable.inc

COMPATIBLE_MACHINE = "(icorem6|icorem6rqs|icorem6ctouch|geam6ul|isiot)"

KERNEL_IMAGETYPE = "uImage"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

#Using an "In-Tree" defconfig File
KBUILD_DEFCONFIG ?= "imx_v6_v7_defconfig"
