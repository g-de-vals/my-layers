SUMMARY = "My image recipe"
DESCRIPTION = "Recipe of the base image"
LICENSE = "MIT"

inherit core-image
inherit extrausers

DL_DIR = "${TOPDIR}/../downloads"

EXTRA_USERS_PARAMS += "usermod -p '\$5\$zgovUQGt\$mLk74hzMis9Gns1njeeqLFDStlE.eBHWGRozI45zKfA' root;"
EXTRA_USERS_PARAMS += "useradd -p '\$5\$yq79SljY\$0afWsdgqVjRldcWXLGSa6g2qaw.OaBnP4KOJzs2yD.4' diag;"
EXTRA_USERS_PARAMS += "useradd -p '\$5\$0YAyINzb\$M7l9erS.TIr2eTgD6ZfAKk3xMUEjCoYIZSXwNRshpUA' guest;"
