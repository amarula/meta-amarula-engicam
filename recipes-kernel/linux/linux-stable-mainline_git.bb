SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
COMPATIBLE_MACHINE = "(icorem6|icorem6rqs|icorem6ctouch|geam6ul|isiot)"

inherit kernel

KBRANCH ?= "master"

KERNEL_IMAGETYPE = "uImage"

# Pull in the devicetree files into the rootfs
RDEPENDS_${KERNEL_PACKAGE_NAME}-base += "kernel-devicetree"

# Default is to use stable kernel version
# If you want to use latest git version set to "1"
DEFAULT_PREFERENCE = "-1" 

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

#Using an "In-Tree" defconfig File
KBUILD_DEFCONFIG ?= "imx_v6_v7_defconfig"
	
# 4.15-rc1
PV = "4.15+git${SRCPV}"
SRCREV_pn-${PN} = "4fbd8d194f06c8a3fd2af1ce560ddb31f7ec8323"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git;branch=master"

S = "${WORKDIR}/git"
