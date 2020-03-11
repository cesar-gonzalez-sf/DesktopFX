CREATE OR REPLACE PROCEDURE SECURITYFX$TERMINAL_PUT
--------------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
--------------------------------------------------------------------------------
(
    WSS_USER_CODE$          IN  NVARCHAR2,
    WSS_PROFILE_CODE$       IN  INTEGER,
    WSS_STATION_CODE$       IN  NVARCHAR2,
    --------------------------------------
    TERMINAL_NAME$          IN  NVARCHAR2,
    DOMAIN$                 IN  NVARCHAR2,
    TYPE$                   IN  NVARCHAR2,
    GROUP$                  IN  NVARCHAR2,
    LOCATION$               IN  NVARCHAR2,
    FUNCTION$               IN  NVARCHAR2,
    TEXT1$                  IN  NVARCHAR2,
    TEXT2$                  IN  NVARCHAR2,
    TEXT3$                  IN  NVARCHAR2,
    TEXT4$                  IN  NVARCHAR2,
    IP_ADDR$                IN  NVARCHAR2,
    PRI_POLL$               IN  NVARCHAR2,
    BKP_POLL$               IN  NVARCHAR2,
    CIRCUIT$                IN  INTEGER,
    CREATED$                OUT INTEGER
)
AS
    V_NET_NOMBRE$           EcuACCNET.V_NET_NOMBRE%TYPE;
BEGIN
    -- Asume the terminal exists
    CREATED$ := 0;

    -- Normalize specified terminal name
    V_NET_NOMBRE$ := UPPER(RTRIM(TERMINAL_NAME$));

    -- Update the properties of specified terminal
    UPDATE EcuACCNET
    SET    V_NET_FAMILIA        = NVL(DOMAIN$,' '),
           V_NET_TIPO           = NVL(TYPE$,' '),
           V_NET_GRUPO_DYN      = NVL(GROUP$,' '),
           V_NET_UBICACION      = NVL(LOCATION$,' '),
           V_NET_NOMBRE_USUARIO = NVL(FUNCTION$,' '),
           V_NET_TEXTO1         = NVL(TEXT1$,' '),
           V_NET_TEXTO2         = NVL(TEXT2$,' '),
           V_NET_TEXTO3         = NVL(TEXT3$,' '),
           V_NET_TEXTO4         = NVL(TEXT4$,' '),
           V_NET_DIRECCION_IP   = NVL(IP_ADDR$,' '),
           V_NET_POLL_PRIMARIO  = NVL(PRI_POLL$,' '),
           V_NET_POLL_BACKUP    = NVL(BKP_POLL$,' '),
           V_NET_CIRCUITO       = CIRCUIT$
    WHERE  V_NET_NOMBRE = V_NET_NOMBRE$;

    -- Create terminal if it didn't exist
    IF (SQL%ROWCOUNT = 0) THEN
        INSERT INTO EcuACCNET (
             V_NET_NOMBRE
            ,V_NET_FAMILIA
            ,V_NET_TIPO
            ,V_NET_GRUPO_DYN
            ,V_NET_UBICACION
            ,V_NET_NOMBRE_USUARIO
            ,V_NET_TEXTO1
            ,V_NET_TEXTO2
            ,V_NET_TEXTO3
            ,V_NET_TEXTO4
            ,V_NET_DIRECCION_IP
            ,V_NET_POLL_PRIMARIO
            ,V_NET_POLL_BACKUP
            ,V_NET_CIRCUITO
        ) VALUES (
             V_NET_NOMBRE$
            ,NVL(DOMAIN$,' ')
            ,NVL(TYPE$,' ')
            ,NVL(GROUP$,' ')
            ,NVL(LOCATION$,' ')
            ,NVL(FUNCTION$,' ')
            ,NVL(TEXT1$,' ')
            ,NVL(TEXT2$,' ')
            ,NVL(TEXT3$,' ')
            ,NVL(TEXT4$,' ')
            ,NVL(IP_ADDR$,' ')
            ,NVL(PRI_POLL$,' ')
            ,NVL(BKP_POLL$,' ')
            ,CIRCUIT$
        );
        CREATED$ := 1;
    END IF;

    -- Generate an audit record
    IF (CREATED$ = 0) THEN
        SECURITYFX$AUDIT_PUT(
            WSS_USER_CODE$, WSS_PROFILE_CODE$, WSS_STATION_CODE$, 
            15, 'Terminal fue modificado: ' || TERMINAL_NAME$);
    ELSE
        SECURITYFX$AUDIT_PUT(
            WSS_USER_CODE$, WSS_PROFILE_CODE$, WSS_STATION_CODE$, 
            13, 'Terminal fue creado: ' || TERMINAL_NAME$);
    END IF;
END SECURITYFX$TERMINAL_PUT;
/

--------------------------------------------------------------------------------

COMMIT;
QUIT;
