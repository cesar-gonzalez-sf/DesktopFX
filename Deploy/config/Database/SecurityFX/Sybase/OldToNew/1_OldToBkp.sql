--------------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
-- EcuACCFAM -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCFAM_BKP
GO
SELECT * INTO dbo.EcuACCFAM_BKP FROM EcuACCFAM
GO

--------------------------------------------------------------------------------
-- EcuACCNET -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCNET_BKP
GO
SELECT * INTO EcuACCNET_BKP FROM EcuACCNET
GO

--------------------------------------------------------------------------------
-- EcuACCPER -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCPER_BKP
GO
SELECT * INTO dbo.EcuACCPER_BKP FROM EcuACCPER
GO

--------------------------------------------------------------------------------
-- EcuACCUSU -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCUSU_BKP
GO
SELECT * INTO dbo.EcuACCUSU_BKP FROM EcuACCUSU
GO

--------------------------------------------------------------------------------
-- EcuACCU2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCU2P_BKP
GO
SELECT * INTO dbo.EcuACCU2P_BKP FROM EcuACCU2P
GO

--------------------------------------------------------------------------------
-- EcuACCCAP -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCCAP_BKP
GO
SELECT * INTO dbo.EcuACCCAP_BKP FROM EcuACCCAP
GO

--------------------------------------------------------------------------------
-- EcuACCC2U -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCC2U_BKP
GO
SELECT * INTO dbo.EcuACCC2U_BKP FROM EcuACCC2U
GO

--------------------------------------------------------------------------------
-- EcuACCC2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCC2P_BKP
GO
SELECT * INTO dbo.EcuACCC2P_BKP FROM EcuACCC2P
GO

--------------------------------------------------------------------------------
-- EcuACCCON -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCCON_BKP
GO
SELECT * INTO dbo.EcuACCCON_BKP FROM EcuACCCON
GO

--------------------------------------------------------------------------------
-- EcuACCCTX -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCCTX_BKP
GO
SELECT * INTO dbo.EcuACCCTX_BKP FROM EcuACCCTX
GO

--------------------------------------------------------------------------------
-- EcuACCLOG -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCLOG_BKP
GO
SELECT * INTO dbo.EcuACCLOG_BKP FROM EcuACCLOG
GO

--------------------------------------------------------------------------------
-- EcuACCPRV -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS dbo.EcuACCPRV_BKP
GO
SELECT * INTO dbo.EcuACCPRV_BKP FROM EcuACCPRV
GO

--------------------------------------------------------------------------------
