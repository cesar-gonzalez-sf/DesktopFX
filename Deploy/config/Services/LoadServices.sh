#!/bin/sh
#-------------------------------------------------------------------------------
# Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
#
# All  rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
# used under the terms of its associated license document.  You  may  NOT  copy,
# modify,  sublicense,  or  distribute this source file or portions of it unless
# previously authorized in writing by OBCOM INGENIERIA S.A. In any  event,  this
# notice and above copyright must always be included verbatim with this file.
#-------------------------------------------------------------------------------

URL="jdbc:postgresql://localhost:5432/ecubas?user=ecuadmin&password=ecuadmin"

java -cp ../Lib/* -Djdbc=$URL -Doper=load \
-Dtype=service -Dfiles='*.xml' cl.obcom.desktopfx.loader.Main

#-------------------------------------------------------------------------------
