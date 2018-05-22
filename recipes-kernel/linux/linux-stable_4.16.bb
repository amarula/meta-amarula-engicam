FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.16.8"
KBRANCH ?= "linux-4.16.y"
SRCREV ?= "dec316ea18281d2892324a4bfeb4d5a8a6605e69"

require linux-stable.inc

COMPATIBLE_MACHINE = "(icorem6|icorem6rqs|icorem6ctouch|geam6ul|isiot)"

KERNEL_IMAGETYPE = "uImage"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

#Using an "In-Tree" defconfig File
KBUILD_DEFCONFIG ?= "imx_v6_v7_defconfig"
