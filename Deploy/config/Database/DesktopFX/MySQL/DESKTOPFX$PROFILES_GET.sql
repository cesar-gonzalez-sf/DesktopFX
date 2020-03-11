DROP PROCEDURE IF EXISTS DESKTOPFX$PROFILES_GET;

DELIMITER $$
CREATE PROCEDURE DESKTOPFX$PROFILES_GET (
-- -----------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
-- -----------------------------------------------------------------------------
    IN  _USER_CODE      VARCHAR(200)
)
BEGIN
    -- #ResultSet PROFILE PROFILES
    --   #Column  PROFILE_CODE  INTEGER
    -- #EndResultSet
    SELECT CODIGO_ECU AS PROFILE_CODE 
    FROM   EcuACCU2P
    WHERE  CODIGO_ADI = _USER_CODE;
END$$
DELIMITER ;
