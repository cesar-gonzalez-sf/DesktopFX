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

JAVA_HOME=/usr/java/jdk1.8.0_212 \
/opt/wildfly-18.0.0.Final/bin/jboss-cli.sh --connect --controller=localhost:9990 \
--command="/subsystem=deployment-scanner/scanner=default:write-attribute(name=scan-enabled,value=false)"

#-------------------------------------------------------------------------------
