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

DROP TABLE EcuACCFAM_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCFAM_BKP AS SELECT * FROM EcuACCFAM;

--------------------------------------------------------------------------------
-- EcuACCNET -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCNET_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCNET_BKP AS SELECT * FROM EcuACCNET;

--------------------------------------------------------------------------------
-- EcuACCPER -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCPER_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCPER_BKP AS SELECT * FROM EcuACCPER;

--------------------------------------------------------------------------------
-- EcuACCUSU -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCUSU_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCUSU_BKP AS SELECT * FROM EcuACCUSU;

--------------------------------------------------------------------------------
-- EcuACCU2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCU2P_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCU2P_BKP AS SELECT * FROM EcuACCU2P;

--------------------------------------------------------------------------------
-- EcuACCCAP -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCCAP_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCCAP_BKP AS SELECT * FROM EcuACCCAP;

--------------------------------------------------------------------------------
-- EcuACCC2U -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCC2U_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCC2U_BKP AS SELECT * FROM EcuACCC2U;

--------------------------------------------------------------------------------
-- EcuACCC2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCC2P_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCC2P_BKP AS SELECT * FROM EcuACCC2P;

--------------------------------------------------------------------------------
-- EcuACCCON -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCCON_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCCON_BKP AS SELECT * FROM EcuACCCON;

--------------------------------------------------------------------------------
-- EcuACCCTX -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCCTX_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCCTX_BKP AS SELECT * FROM EcuACCCTX;

--------------------------------------------------------------------------------
-- EcuACCLOG -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCLOG_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCLOG_BKP AS SELECT * FROM EcuACCLOG;

--------------------------------------------------------------------------------
-- EcuACCPRV -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE EcuACCPRV_BKP CASCADE CONSTRAINTS;
CREATE TABLE EcuACCPRV_BKP AS SELECT * FROM EcuACCPRV;

--------------------------------------------------------------------------------

COMMIT;
QUIT;
