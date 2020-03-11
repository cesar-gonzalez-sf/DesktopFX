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

DROP TABLE IF EXISTS ecuaccfam_bkp CASCADE;
SELECT * INTO ecuaccfam_bkp FROM ecuaccfam;

--------------------------------------------------------------------------------
-- EcuACCNET -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccnet_bkp CASCADE;
SELECT * INTO ecuaccnet_bkp FROM ecuaccnet;

--------------------------------------------------------------------------------
-- EcuACCPER -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccper_bkp CASCADE;
SELECT * INTO ecuaccper_bkp FROM ecuaccper;

--------------------------------------------------------------------------------
-- EcuACCUSU -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccusu_bkp CASCADE;
SELECT * INTO ecuaccusu_bkp FROM ecuaccusu;

--------------------------------------------------------------------------------
-- EcuACCU2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccu2p_bkp CASCADE;
SELECT * INTO ecuaccu2p_bkp FROM ecuaccu2p;

--------------------------------------------------------------------------------
-- EcuACCCAP -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuacccap_bkp CASCADE;
SELECT * INTO ecuacccap_bkp FROM ecuacccap;

--------------------------------------------------------------------------------
-- EcuACCC2U -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccc2u_bkp CASCADE;
SELECT * INTO ecuaccc2u_bkp FROM ECUACCC2U;

--------------------------------------------------------------------------------
-- EcuACCC2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccc2p_bkp CASCADE;
SELECT * INTO ecuaccc2p_bkp FROM ecuaccc2p;

--------------------------------------------------------------------------------
-- EcuACCCON -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuacccon_bkp CASCADE;
SELECT * INTO ecuacccon_bkp FROM ecuacccon;

--------------------------------------------------------------------------------
-- EcuACCCTX -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccctx_bkp CASCADE;
SELECT * INTO ecuaccctx_bkp FROM ecuaccctx;

--------------------------------------------------------------------------------
-- EcuACCLOG -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuacclog_bkp CASCADE;
SELECT * INTO ecuacclog_bkp FROM ecuacclog;

--------------------------------------------------------------------------------
-- EcuACCPRV -------------------------------------------------------------------
--------------------------------------------------------------------------------

DROP TABLE IF EXISTS ecuaccprv_bkp CASCADE;
SELECT * INTO ecuaccprv_bkp FROM ecuaccprv;

--------------------------------------------------------------------------------
