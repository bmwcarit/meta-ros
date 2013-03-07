DESCRIPTION = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "CLOSED"

inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE = "524288"

IMAGE_FEATURES += "tools-sdk"

# add own name to hosts
augment_hosts_setting_file () {
	echo '127.0.0.1\tqemux86.localdomain\t\tqemux86' >> ${IMAGE_ROOTFS}/etc/hosts
}

# remove not needed ipkg informations
# create a custom hosts file
ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; augment_hosts_setting_file ; "

# currently install all python-modules, but we only need a subset.
# also adding python-misc to obtain the ast module. We should check if this ast file should better
# be a python module in the openembedded core repository.
IMAGE_INSTALL += "packagegroup-core-ssh-openssh cmake \
  python-modules python-misc python-empy python-setuptools \
  boost boost-dev python-dev libtinyxml libtinyxml-dev \
  log4cxx log4cxx-dev libbz2-dev \
  python-argparse python-rosdep python-wstool \
"

