DROP PROCEDURE IF EXISTS EMP$BUSCAR_POR_RUT;

DELIMITER $$
CREATE PROCEDURE EMP$BUSCAR_POR_RUT (
-- -----------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
-- -----------------------------------------------------------------------------
    IN  _RUT            VARCHAR(10)
)
BEGIN
    -- #ResultSet @EMPLEADO EMPLEADOS
    --    #Column ID            DECIMAL
    --    #Column DEPT_ID       DECIMAL
    --    #Column NOMBRE        VARCHAR
    --    #Column PATERNO       VARCHAR
    --    #Column MATERNO       VARCHAR
    --    #Column RUT           VARCHAR
    --    #Column NACIMIENTO    DATETIME
    --    #Column SUELDO        DECIMAL
    -- #EndResultSet
    SELECT  ID                  AS ID,
            DEPT_ID             AS DEPT_ID,
            RTRIM(NOMBRE)       AS NOMBRE,
            RTRIM(PATERNO)      AS PATERNO,
            RTRIM(MATERNO)      AS MATERNO,
            RUT                 AS RUT,
            NACIMIENTO          AS NACIMIENTO,
            SUELDO              AS SUELDO
      FROM  EMPLEADOS
      WHERE RUT = _RUT;
END$$
DELIMITER ;
