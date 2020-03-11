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

DELETE FROM dbo.EcuACCFAM
GO
INSERT INTO dbo.EcuACCFAM SELECT * FROM dbo.EcuACCFAM_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCNET -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCNET
GO
INSERT INTO dbo.EcuACCNET SELECT * FROM dbo.EcuACCNET_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCPER -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCPER
GO
INSERT INTO dbo.EcuACCPER SELECT * FROM dbo.EcuACCPER_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCUSU -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCUSU
GO
INSERT INTO dbo.EcuACCUSU SELECT * FROM dbo.EcuACCUSU_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCU2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCU2P
GO
INSERT INTO dbo.EcuACCU2P SELECT * FROM dbo.EcuACCU2P_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCCAP -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCCAP
GO
INSERT INTO dbo.EcuACCCAP SELECT * FROM dbo.EcuACCCAP_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCC2U -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCC2U
GO
INSERT INTO dbo.EcuACCC2U SELECT * FROM dbo.EcuACCC2U_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCC2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCC2P
GO
INSERT INTO dbo.EcuACCC2P SELECT * FROM dbo.EcuACCC2P_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCCON -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCCON
GO
INSERT INTO dbo.EcuACCCON SELECT * FROM dbo.EcuACCCON_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCCTX -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCCTX
GO
INSERT INTO dbo.EcuACCCTX SELECT * FROM dbo.EcuACCCTX_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCLOG -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCLOG
GO
INSERT INTO dbo.EcuACCLOG SELECT * FROM dbo.EcuACCLOG_BKP
GO

--------------------------------------------------------------------------------
-- EcuACCPRV -------------------------------------------------------------------
--------------------------------------------------------------------------------

DELETE FROM dbo.EcuACCPRV
GO
INSERT INTO dbo.EcuACCPRV SELECT * FROM dbo.EcuACCPRV_BKP
GO

--------------------------------------------------------------------------------
