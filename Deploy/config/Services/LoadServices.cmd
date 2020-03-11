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

@chcp 1252 > nul
@setlocal

@rem @set url="jdbc:mysql://localhost:3306/ecubas?user=ecubas&password=ecubas&useSSL=false&serverTimezone=GMT-3"
@rem @set url="jdbc:oracle:thin:ECUBAS/ECUBAS@localhost:1521:ORCL"
@rem @set url="jdbc:postgresql://localhost:5432/ecubas?user=ecubas&password=ecubas"
@rem @set url="jdbc:jtds:sybase://localhost:5000/ECUBAS;user=EcuAdmin;password=EcuAdmin"
@set url="jdbc:sqlserver://localhost;databaseName=ECUBAS;userName=EcuAdmin;password=EcuAdmin"

@if not defined JAVA_HOME set JAVA_HOME=C:/Java/jdk1.8.0_231
%JAVA_HOME%/bin/java -cp ../Lib/* -Djdbc=%url% -Doper=load ^
-Dtype=service -Dfiles="*.xml" cl.obcom.desktopfx.loader.Main

@endlocal
@pause
