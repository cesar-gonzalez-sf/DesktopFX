@rem ---------------------------------------------------------------------------
@rem Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
@rem
@rem All  rights to this product are owned by OBCOM INGENIERIA S.A. and may only
@rem be used under the terms of its associated license  document.  You  may  NOT
@rem copy,  modify, sublicense, or distribute this source file or portions of it
@rem unless previously authorized in writing by OBCOM  INGENIERIA  S.A.  In  any
@rem event, this notice and the above copyright must always be included verbatim
@rem with this file.
@rem ---------------------------------------------------------------------------
@rem https://docs.jboss.org/author/display/WFLY10/Documentation
@rem ---------------------------------------------------------------------------

@chcp 1252 > nul
@setlocal

@set JAVA_HOME=C:\Java\jdk1.8.0_231
"C:\Java\wildfly-18.0.1.Final\bin\jboss-cli.bat" ^
--connect --controller=localhost:9990 --file=add_mailsession.txt

@endlocal
@pause
