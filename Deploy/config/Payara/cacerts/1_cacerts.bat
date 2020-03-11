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

@rem ---------------------------------------------------------------------------
@rem List the contents of cacerts -> cacerts.txt
"C:\Java\jdk1.8.0_241\bin\keytool.exe" -v -list ^
-keystore cacerts -storepass changeit > cacerts.txt
@if %errorlevel% neq 0 goto errors

@rem ---------------------------------------------------------------------------
@rem Copy "cacerts" from "jdk1.8.0_241" to "cacerts.jks" (password = changeit)

@copy cacerts cacerts.jks > nul

@rem ---------------------------------------------------------------------------
@rem Remove certificate "utnuserfirstobjectca [jdk]" from cacerts.jks
"C:\Java\jdk1.8.0_241\bin\keytool.exe" -v -delete ^
-keystore cacerts.jks -storepass changeit -alias "utnuserfirstobjectca [jdk]"

@rem ---------------------------------------------------------------------------
@rem Remove certificate "gtecybertrustglobalca [jdk]" from cacerts.jks
"C:\Java\jdk1.8.0_241\bin\keytool.exe" -v -delete ^
-keystore cacerts.jks -storepass changeit -alias "gtecybertrustglobalca [jdk]"

@rem ---------------------------------------------------------------------------
@rem List the contents of cacerts.jks -> cacerts.jks.txt
"C:\Java\jdk1.8.0_241\bin\keytool.exe" -v -list ^
-keystore cacerts.jks -storepass changeit > cacerts.jks.txt
@if %errorlevel% neq 0 goto errors

:errors
@pause
