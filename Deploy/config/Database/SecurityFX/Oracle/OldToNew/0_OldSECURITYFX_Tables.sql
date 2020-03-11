--------------------------------------------------------------------------------
-- Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
--
-- All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
-- used  under  the  terms of its associated license document. You may NOT copy,
-- modify, sublicense, or distribute this source file or portions of  it  unless
-- previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
-- notice and above copyright must always be included verbatim with this file.
--------------------------------------------------------------------------------

DROP TABLE EcuACCPRV CASCADE CONSTRAINTS;
DROP TABLE EcuACCLOG CASCADE CONSTRAINTS;
DROP TABLE EcuACCCTX CASCADE CONSTRAINTS;
DROP TABLE EcuACCCON CASCADE CONSTRAINTS;
DROP TABLE EcuACCC2P CASCADE CONSTRAINTS;
DROP TABLE EcuACCC2U CASCADE CONSTRAINTS;
DROP TABLE EcuACCCAP CASCADE CONSTRAINTS;
DROP TABLE EcuACCU2P CASCADE CONSTRAINTS;
DROP TABLE EcuACCUSU CASCADE CONSTRAINTS;
DROP TABLE EcuACCPER CASCADE CONSTRAINTS;
DROP TABLE EcuACCNET CASCADE CONSTRAINTS;
DROP TABLE EcuACCFAM CASCADE CONSTRAINTS;

--------------------------------------------------------------------------------
-- EcuACCFAM -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCFAM
(
    V_FAM_FAMILIA           CHAR(10)        DEFAULT ' ' NOT NULL,
    V_FAM_NOMBRE_USUARIO    CHAR(40)        DEFAULT ' ' NOT NULL,
    V_FAM_UBICACION         CHAR(40)        DEFAULT ' ' NOT NULL,
    V_FAM_TEXTO1            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_FAM_TEXTO2            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_FAM_TEXTO3            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_FAM_TEXTO4            CHAR(40)        DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCFAM_PK PRIMARY KEY (V_FAM_FAMILIA)
);

--------------------------------------------------------------------------------
-- EcuACCNET -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCNET
(
    V_NET_NOMBRE            CHAR(16)        DEFAULT ' ' NOT NULL,
    V_NET_FAMILIA           CHAR(10)        DEFAULT ' ' NOT NULL,
    V_NET_TIPO              CHAR(1)         DEFAULT ' ' NOT NULL,
    V_NET_DIRECCION_IP      CHAR(16)        DEFAULT ' ' NOT NULL,
    V_NET_POLL_PRIMARIO     CHAR(10)        DEFAULT ' ' NOT NULL,
    V_NET_POLL_BACKUP       CHAR(10)        DEFAULT ' ' NOT NULL,
    V_NET_CIRCUITO          DECIMAL(4)      DEFAULT  0  NOT NULL,
    V_NET_MASTERKEY1        CHAR(16)        DEFAULT ' ' NOT NULL,
    V_NET_MASTERKEY2        CHAR(16)        DEFAULT ' ' NOT NULL,
    V_NET_HORA_KEY1         CHAR(26)        DEFAULT ' ' NOT NULL,
    V_NET_HORA_KEY2         CHAR(26)        DEFAULT ' ' NOT NULL,
    V_NET_GRUPO_DYN         CHAR(10)        DEFAULT ' ' NOT NULL,
    V_NET_PRINTER           CHAR(10)        DEFAULT ' ' NOT NULL,
    V_NET_NOMBRE_USUARIO    CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_UBICACION         CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_TEXTO1            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_TEXTO2            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_TEXTO3            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_TEXTO4            CHAR(40)        DEFAULT ' ' NOT NULL,
    V_NET_SERIETERM         CHAR(20)        DEFAULT ' ' NOT NULL,
    V_NET_HABILITADO        CHAR(1)         DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCNET_PK PRIMARY KEY (V_NET_NOMBRE)
);

--------------------------------------------------------------------------------
-- EcuACCPER -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCPER
(
    V_ACC_CODE_NUM          DECIMAL(7)      DEFAULT  0  NOT NULL,
    V_ACC_PRIV_MEN          CHAR(32)        DEFAULT ' ' NOT NULL,
    V_ACC_PRIV_VARL         CHAR(32)        DEFAULT ' ' NOT NULL,
    V_ACC_PRIV_VARM         CHAR(32)        DEFAULT ' ' NOT NULL,
    V_ACC_PRIV_REGL         CHAR(32)        DEFAULT ' ' NOT NULL,
    V_ACC_PRIV_REGM         CHAR(32)        DEFAULT ' ' NOT NULL,
    V_ACC_NAME              CHAR(30)        DEFAULT ' ' NOT NULL,
    V_ACC_EXP               DECIMAL(8)      DEFAULT  0  NOT NULL,
    V_ACC_INDICADORES       CHAR(6)         DEFAULT ' ' NOT NULL,
    V_ACC_HORA_INIC         DECIMAL(4,2)    DEFAULT  0  NOT NULL,
    V_ACC_HORA_FIN          DECIMAL(4,2)    DEFAULT  0  NOT NULL,
    V_ACC_CLASE_PD          CHAR(1)         DEFAULT ' ' NOT NULL,
    V_ACC_PROG_INI          CHAR(12)        DEFAULT ' ' NOT NULL,
    V_ACC_FAMILIA           CHAR(10)        DEFAULT ' ' NOT NULL,
    V_ACC_CANT_TERM         DECIMAL(4)      DEFAULT  0  NOT NULL,
    V_ACC_TERM_001          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_002          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_003          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_004          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_005          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_006          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_007          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_008          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_009          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_010          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_011          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_012          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_013          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_014          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_015          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_TERM_016          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_DIAS_VIG_PASSW    DECIMAL(4)      DEFAULT  0  NOT NULL,
    V_ACC_VIG_PASSW         DECIMAL(8)      DEFAULT  0  NOT NULL,
    V_ACC_PASSWORD          DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_001   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_002   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_003   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_004   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_005   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_OTRAS_PASSW_006   DECIMAL(18)     DEFAULT  0  NOT NULL,
    V_ACC_FAM_IMPR          CHAR(10)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_PRE          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_CANT_IMPR         DECIMAL(4)      DEFAULT  0  NOT NULL,
    V_ACC_IMPR_001          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_002          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_003          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_004          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_005          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_006          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_007          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_008          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_009          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_010          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_011          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_012          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_013          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_014          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_015          CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ACC_IMPR_016          CHAR(16)        DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCPER_PK PRIMARY KEY (V_ACC_CODE_NUM)
);

--------------------------------------------------------------------------------
-- EcuACCUSU -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCUSU
(
    USU_CODIGO              CHAR(40)        DEFAULT ' ' NOT NULL,
    APELLIDO_PAT            CHAR(20)        DEFAULT ' ' NOT NULL,
    APELLIDO_MAT            CHAR(20)        DEFAULT ' ' NOT NULL,
    NOMBRES                 CHAR(30)        DEFAULT ' ' NOT NULL,
    RUT                     CHAR(11)        DEFAULT ' ' NOT NULL,
    USU_ESTADO              CHAR(2)         DEFAULT ' ' NOT NULL,
    CERTIF_ID               CHAR(26)        DEFAULT ' ' NOT NULL,
    PSW_TIPO                CHAR(3)         DEFAULT ' ' NOT NULL,
    PASSWORD                CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_VIG_DESD            DECIMAL(8)      DEFAULT  0  NOT NULL,
    PSW_ULTIMAS_001         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_ULTIMAS_002         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_ULTIMAS_003         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_ULTIMAS_004         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_ULTIMAS_005         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_ULTIMAS_006         CHAR(51)        DEFAULT ' ' NOT NULL,
    PSW_DIAS_CADUC          DECIMAL(6)      DEFAULT  0  NOT NULL,
    PSW_ESTADO              CHAR(3)         DEFAULT ' ' NOT NULL,
    RUT_INST                CHAR(11)        DEFAULT ' ' NOT NULL,
    FAMILIA                 CHAR(10)        DEFAULT ' ' NOT NULL,
    CARGO                   CHAR(40)        DEFAULT ' ' NOT NULL,
    DIRECCION               CHAR(40)        DEFAULT ' ' NOT NULL,
    COMUNA                  CHAR(20)        DEFAULT ' ' NOT NULL,
    CIUDAD                  CHAR(20)        DEFAULT ' ' NOT NULL,
    ESTADO                  CHAR(20)        DEFAULT ' ' NOT NULL,
    PAIS                    CHAR(20)        DEFAULT ' ' NOT NULL,
    FONO1                   CHAR(20)        DEFAULT ' ' NOT NULL,
    FONO2                   CHAR(20)        DEFAULT ' ' NOT NULL,
    FAX                     CHAR(20)        DEFAULT ' ' NOT NULL,
    EMAIL                   CHAR(40)        DEFAULT ' ' NOT NULL,
    FEC_REGISTRO            DECIMAL(8)      DEFAULT  0  NOT NULL,
    COD_CONTRATO            CHAR(20)        DEFAULT ' ' NOT NULL,
    ANEXO_CONTRATO          CHAR(10)        DEFAULT ' ' NOT NULL,
    FEC_VIG_DESD            DECIMAL(8)      DEFAULT  0  NOT NULL,
    FEC_VIG_HAST            DECIMAL(8)      DEFAULT  0  NOT NULL,
    FEC_CRE_USU             CHAR(26)        DEFAULT ' ' NOT NULL,
    FEC_PRI_LOG             CHAR(26)        DEFAULT ' ' NOT NULL,
    FEC_ULT_LOG             CHAR(26)        DEFAULT ' ' NOT NULL,
    COD_FACTURACION         CHAR(8)         DEFAULT ' ' NOT NULL,
    FACTURACION             CHAR(1)         DEFAULT ' ' NOT NULL,
    DEMO_DIAS               DECIMAL(2)      DEFAULT  0  NOT NULL,
    DEMO_AUTO               CHAR(16)        DEFAULT ' ' NOT NULL,
    DEMO_FEC_INI            DECIMAL(8)      DEFAULT  0  NOT NULL,
    DEMO_VECES              DECIMAL(2)      DEFAULT  0  NOT NULL,
    DEMO_DIAS_TOT           DECIMAL(4)      DEFAULT  0  NOT NULL,
    SW_CERT_DIG             CHAR(1)         DEFAULT ' ' NOT NULL,
    USUARIOIM               CHAR(1)         DEFAULT ' ' NOT NULL,
    NICKNAME                CHAR(10)        DEFAULT ' ' NOT NULL,
    FEC_ERR_LOG             CHAR(26)        DEFAULT ' ' NOT NULL,
    ERROR_LOGIN             DECIMAL(1)      DEFAULT  0  NOT NULL,
    CONSTRAINT EcuACCUSU_PK PRIMARY KEY (USU_CODIGO)
);

--------------------------------------------------------------------------------
-- EcuACCU2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCU2P
(
    CODIGO_ADI              CHAR(40)        DEFAULT ' ' NOT NULL,
    CODIGO_ECU              DECIMAL(7)      DEFAULT  0  NOT NULL,
    CONSTRAINT EcuACCU2P_PK PRIMARY KEY (CODIGO_ADI,CODIGO_ECU)
);

--------------------------------------------------------------------------------
-- EcuACCCAP -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCCAP
(
    CAP_CODIGO              VARCHAR2(40)    DEFAULT ' ' NOT NULL,
    CAP_NOMBRE              VARCHAR2(120)   DEFAULT ' ' NOT NULL,
    CAP_TIPO                DECIMAL(2)      DEFAULT  0  NOT NULL,
    CONSTRAINT EcuACCCAP_PK PRIMARY KEY (CAP_CODIGO)
);

--------------------------------------------------------------------------------
-- EcuACCC2U -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCC2U
(
    CODIGO_ADI              CHAR(40)        DEFAULT ' ' NOT NULL,
    CAP_CODIGO              VARCHAR2(40)    DEFAULT ' ' NOT NULL,
    CAP_VALOR               VARCHAR2(200)   DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCC2U_PK PRIMARY KEY (CODIGO_ADI,CAP_CODIGO),
    CONSTRAINT EcuACCC2U_F1 FOREIGN KEY (CODIGO_ADI)
        REFERENCES EcuACCUSU (USU_CODIGO),
    CONSTRAINT EcuACCC2U_F2 FOREIGN KEY (CAP_CODIGO)
        REFERENCES EcuACCCAP (CAP_CODIGO)
);

--------------------------------------------------------------------------------
-- EcuACCC2P -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCC2P
(
    CODIGO_ECU              DECIMAL(7)      DEFAULT  0  NOT NULL,
    CAP_CODIGO              VARCHAR2(40)    DEFAULT ' ' NOT NULL,
    CAP_VALOR               VARCHAR2(200)   DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCC2P_PK PRIMARY KEY (CODIGO_ECU,CAP_CODIGO),
    CONSTRAINT EcuACCC2P_F1 FOREIGN KEY (CODIGO_ECU)
        REFERENCES EcuACCPER (V_ACC_CODE_NUM),
    CONSTRAINT EcuACCC2P_F2 FOREIGN KEY (CAP_CODIGO)
        REFERENCES EcuACCCAP (CAP_CODIGO)
);

--------------------------------------------------------------------------------
-- EcuACCCON -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCCON
(
    TIPO_REG                CHAR(1)         DEFAULT ' ' NOT NULL,
    ECL_NAME                CHAR(10)        DEFAULT ' ' NOT NULL,
    UNIQUE_ID               DECIMAL(16)     DEFAULT  0  NOT NULL,
    USUARIO                 CHAR(40)        DEFAULT ' ' NOT NULL,
    CORREL                  DECIMAL(3)      DEFAULT  0  NOT NULL,
    TERMINAL                CHAR(16)        DEFAULT ' ' NOT NULL,
    HORA_CONEX              CHAR(26)        DEFAULT ' ' NOT NULL,
    ECL_ULT_PING            CHAR(26)        DEFAULT ' ' NOT NULL,
    ECL_UPTIME              DECIMAL(12,0)   DEFAULT  0  NOT NULL,
    CONSTRAINT EcuACCCON_PK PRIMARY KEY (TIPO_REG,ECL_NAME,UNIQUE_ID),
    CONSTRAINT EcuACCCON_I1 UNIQUE (TIPO_REG,USUARIO,CORREL)
);

--------------------------------------------------------------------------------
-- EcuACCCTX -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCCTX
(
    STATION                 CHAR(16)        DEFAULT ' ' NOT NULL,
    SUBDROP                 CHAR(1)         DEFAULT ' ' NOT NULL,
    SECUENCIA               DECIMAL(4)      DEFAULT  0  NOT NULL,
    CODIGO_ADI              CHAR(40)        DEFAULT ' ' NOT NULL,
    CODIGO_ECU              DECIMAL(7)      DEFAULT  0  NOT NULL,
    DATA                    CLOB            DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCCTX_PK PRIMARY KEY (STATION,SUBDROP,SECUENCIA)
);

--------------------------------------------------------------------------------
-- EcuACCLOG -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCLOG
(
    V_ECULOG_HORA           CHAR(26)        DEFAULT ' ' NOT NULL,
    V_ECULOG_CODIGO_ADI     CHAR(40)        DEFAULT ' ' NOT NULL,
    V_ECULOG_CODIGO_ECU     DECIMAL(7)      DEFAULT  0  NOT NULL,
    V_ECULOG_TERMINAL       CHAR(16)        DEFAULT ' ' NOT NULL,
    V_ECULOG_CODIGO_MSG     DECIMAL(4)      DEFAULT  0  NOT NULL,
    V_ECULOG_MENSAJE        CHAR(99)        DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCLOG_PK PRIMARY KEY (V_ECULOG_HORA)
);

--------------------------------------------------------------------------------
-- EcuACCPRV -------------------------------------------------------------------
--------------------------------------------------------------------------------

CREATE TABLE EcuACCPRV
(
    V_PRV_TIPO              CHAR(1)         DEFAULT ' ' NOT NULL,
    V_PRV_NUMERO            DECIMAL(2)      DEFAULT  0  NOT NULL,
    V_PRV_NOMBRE            CHAR(20)        DEFAULT ' ' NOT NULL,
    V_PRV_CONST             CHAR(20)        DEFAULT ' ' NOT NULL,
    V_PRV_SYSLOG            CHAR(2)         DEFAULT ' ' NOT NULL,
    CONSTRAINT EcuACCPRV_PK PRIMARY KEY (V_PRV_TIPO,V_PRV_NUMERO)
);

--------------------------------------------------------------------------------

COMMIT;
QUIT;
