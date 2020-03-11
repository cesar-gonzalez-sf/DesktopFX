IF OBJECT_ID(N'dbo.DESKTOPFX$MULTICAST_DIR', N'P') IS NOT NULL 
    DROP PROCEDURE dbo.DESKTOPFX$MULTICAST_DIR
GO

CREATE PROCEDURE dbo.DESKTOPFX$MULTICAST_DIR
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
    @VALID_FROM         DATETIME,
    @MULTICASTS_MAX     INTEGER,
    @RECEIVE_TIME       DATETIME        OUTPUT,
    @TRANSMIT_TIME      DATETIME        OUTPUT
AS
BEGIN
    -- No Count + Trx Rollback
    SET NOCOUNT, XACT_ABORT ON;

    -- Initialize receive time
    SET @RECEIVE_TIME = GETDATE();

    -- Update last user poll date
    UPDATE dbo.DESKTOPFX_USER
    SET    LAST_POLL = @RECEIVE_TIME
    WHERE  USER_CODE = @WSS_USER_CODE;

    -- #ResultSet ITEM ITEMS
    --   #Column  ID                DECIMAL
    --   #Column  NAME              NVARCHAR
    --   #Column  MESSAGE           NVARCHAR
    --   #Column  VALID_FROM        DATETIME
    --   #Column  VALID_TO          DATETIME
    --   #Column  ATTACHMENT_TYPE   NVARCHAR
    -- #EndResultSet
    SELECT TOP(@MULTICASTS_MAX)
           ID                       AS ID,
           NAME                     AS NAME, 
           MESSAGE                  AS MESSAGE,
           VALID_FROM               AS VALID_FROM,
           VALID_TO                 AS VALID_TO,
           ATTACHMENT_TYPE          AS ATTACHMENT_TYPE
    FROM   dbo.DESKTOPFX_MULTICAST
    WHERE  VALID_FROM > @VALID_FROM
    AND    @RECEIVE_TIME BETWEEN VALID_FROM AND VALID_TO
    AND    (USER_FILTER    IS NULL OR USER_FILTER    = @WSS_USER_CODE)
    AND    (PROFILE_FILTER IS NULL OR PROFILE_FILTER = @WSS_PROFILE_CODE)
    AND    (STATION_FILTER IS NULL OR STATION_FILTER = @WSS_STATION_CODE)
    ORDER BY VALID_FROM;

    -- Initialize transmit time
    SET @TRANSMIT_TIME = GETDATE();
END;
GO
