#
# Makefile.am --
#
#      Template to generate the mibs/tubs Makefile.in using automake.
#
# Copyright (c) 1999 Frank Strauss, Technical University of Braunschweig.
#
# See the file "COPYING" for information on usage and redistribution
# of this file, and for a DISCLAIMER OF ALL WARRANTIES.
#
# @(#) $Id: Makefile.am 1105 2003-12-01 19:01:38Z strauss $
#

tubsdir			= $(mibdir)/tubs
MIBS			= $(shell ls -1 $(srcdir) | egrep -v 'CVS|Makefile')
EXTRA_DIST              = $(MIBS)
tubs_DATA		= $(MIBS)
