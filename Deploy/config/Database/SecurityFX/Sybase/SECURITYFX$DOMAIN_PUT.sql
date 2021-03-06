IF EXISTS(SELECT * FROM sysobjects WHERE name = 'securityfx$domain_put' AND type = 'P')
    DROP PROCEDURE securityfx$domain_put
GO

CREATE PROCEDURE securityfx$domain_put
--------------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
--------------------------------------------------------------------------------
    @WSS_USER_CODE      NVARCHAR(100),
    @WSS_PROFILE_CODE   INTEGER,
    @WSS_STATION_CODE   NVARCHAR(100),
    ----------------------------------
    @DOMAIN_NAME        NVARCHAR(100),
    @FUNCTION           NVARCHAR(100),
    @LOCATION           NVARCHAR(100),
    @TEXT1              NVARCHAR(100),
    @TEXT2              NVARCHAR(100),
    @TEXT3              NVARCHAR(100),
    @TEXT4              NVARCHAR(100),
    @CREATED            INTEGER OUT
AS
BEGIN
    DECLARE @AUDIT_EVENT    INTEGER
    DECLARE @AUDIT_MESSAGE  NVARCHAR(100)

    -- Set No Count
    SET NOCOUNT ON

    -- Asume the domain exists
    SELECT @CREATED = 0

    -- Normalize specified domain name
    SELECT @DOMAIN_NAME = UPPER(RTRIM(@DOMAIN_NAME))

    -- Update the properties of specified domain
    UPDATE dbo.EcuACCFAM
    SET    V_FAM_NOMBRE_USUARIO = ISNULL(@FUNCTION,''),
           V_FAM_UBICACION      = ISNULL(@LOCATION,''),
           V_FAM_TEXTO1         = ISNULL(@TEXT1,''),
           V_FAM_TEXTO2         = ISNULL(@TEXT2,''),
           V_FAM_TEXTO3         = ISNULL(@TEXT3,''),
           V_FAM_TEXTO4         = ISNULL(@TEXT4,'')
    WHERE  V_FAM_FAMILIA = @DOMAIN_NAME

    -- Create domain if it didn't exist
    IF (@@ROWCOUNT = 0) BEGIN
        INSERT INTO dbo.EcuACCFAM (
             V_FAM_FAMILIA
            ,V_FAM_NOMBRE_USUARIO
            ,V_FAM_UBICACION
            ,V_FAM_TEXTO1
            ,V_FAM_TEXTO2
            ,V_FAM_TEXTO3
            ,V_FAM_TEXTO4
        ) VALUES (
             @DOMAIN_NAME
            ,ISNULL(@FUNCTION,'')
            ,ISNULL(@LOCATION,'')
            ,ISNULL(@TEXT1,'')
            ,ISNULL(@TEXT2,'')
            ,ISNULL(@TEXT3,'')
            ,ISNULL(@TEXT4,'')
        )
        SELECT @CREATED = 1
    END

    -- Generate an audit record
    IF (@CREATED = 0) BEGIN
        SELECT @AUDIT_EVENT = 15
        SELECT @AUDIT_MESSAGE = 'Familia fue modificada: ' + @DOMAIN_NAME
    END
    ELSE BEGIN
        SELECT @AUDIT_EVENT = 16
        SELECT @AUDIT_MESSAGE = 'Familia fue creada: ' + @DOMAIN_NAME
    END
    EXEC dbo.securityfx$audit_put
        @WSS_USER_CODE, @WSS_PROFILE_CODE, @WSS_STATION_CODE,
        @AUDIT_EVENT, @AUDIT_MESSAGE
END
GO

sp_procxmode securityfx$domain_put, "anymode"
GO
