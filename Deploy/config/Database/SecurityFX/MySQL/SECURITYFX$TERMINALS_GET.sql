DROP PROCEDURE IF EXISTS SECURITYFX$TERMINALS_GET;

DELIMITER $$
CREATE PROCEDURE SECURITYFX$TERMINALS_GET (
-- -----------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
-- -----------------------------------------------------------------------------
    IN  _WSS_USER_CODE      VARCHAR(100),
    IN  _WSS_PROFILE_CODE   INTEGER,
    IN  _WSS_STATION_CODE   VARCHAR(100),
    -- ----------------------------------
    IN  _TERMINAL_NAME      VARCHAR(100),
    IN  _TERMINALS_MAX      INTEGER
)
BEGIN
    -- #ResultSet TERMINAL TERMINALS
    --    #Column NAME      VARCHAR
    --    #Column TYPE      VARCHAR
    --    #Column FUNCTION  VARCHAR
    --    #Column LOCATION  VARCHAR
    -- #EndResultSet
    SELECT
           RTRIM(V_NET_NOMBRE)          AS NAME,
           RTRIM(V_NET_TIPO)            AS TYPE,
           RTRIM(V_NET_NOMBRE_USUARIO)  AS 'FUNCTION',
           RTRIM(V_NET_UBICACION)       AS LOCATION
    FROM  EcuACCNET
    WHERE V_NET_NOMBRE LIKE CONCAT(_TERMINAL_NAME, '%')
    ORDER BY V_NET_NOMBRE ASC
    LIMIT _TERMINALS_MAX;
END$$
DELIMITER ;
