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

@if not defined SQLCON set SQLCON=-S localhost -U EcuAdmin -P EcuAdmin -d ECUBAS

sqlcmd.exe %SQLCON% -b -i 3_DeleteBkp.sql
@if %errorlevel% neq 0 goto errors

@echo Scripts executed successfully
@pause
@exit /b 0

:errors
@echo Error executing script
@pause
@exit /b 1
