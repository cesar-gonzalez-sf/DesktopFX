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

@rem create Payara Windows Service named "payara_5201"
call C:\Java\payara-5.201\bin\asadmin.bat create-service --name payara_5201 --domaindir C:\Java\payara-5.201\glassfish\domains\ domain1

@rem change the display name to "Payara 5.201"
C:\Windows\System32\sc.exe config payara_5201 DisplayName= "Payara 5.201"

@rem change the description to "Payara 5.201"
C:\Windows\System32\sc.exe description payara_5201 "Payara 5.201"

@pause
