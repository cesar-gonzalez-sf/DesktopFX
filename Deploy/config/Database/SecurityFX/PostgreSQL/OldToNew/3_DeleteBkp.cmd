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

@if not defined PGCLIENTENCODING set PGCLIENTENCODING=utf8
@if not defined PGSQL set PGSQL=C:\PostgreSQL\pg10\bin\psql.exe
@if not defined PGCON set PGCON=-v ON_ERROR_STOP=1 -d ecubas -h localhost -p 5432 -U ecubas

%PGSQL% %PGCON% -q -f 3_DeleteBkp.sql
@if %errorlevel% neq 0 goto errors

@echo Scripts executed successfully
@pause
@exit /b 0

:errors
@echo Error executing script
@pause
@exit /b 1
