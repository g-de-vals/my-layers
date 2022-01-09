SUMMARY = "My image recipe"
DESCRIPTION = "Recipe of the base image"
LICENSE = "MIT"

inherit core-image
inherit extrausers

DL_DIR = "${TOPDIR}/../downloads"

EXTRA_USERS_PARAMS += "usermod -p '\$5\$zgovUQGt\$mLk74hzMis9Gns1njeeqLFDStlE.eBHWGRozI45zKfA' root;"
