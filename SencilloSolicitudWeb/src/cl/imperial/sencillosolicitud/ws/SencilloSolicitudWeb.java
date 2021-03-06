/*
 * Source: SencilloSolicitudWeb.java - Generated by OBCOM SQL Wizard 1.158
 * Author: Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 *
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 * 
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously authorized in writing by IMPERIAL S.A. In any event,  this  notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.sencillosolicitud.ws;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.transaction.UserTransaction;

/**
 * The {@code SencilloSolicitud} Web Service.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@WebService(targetNamespace = SencilloSolicitudWeb.TNS)
public class SencilloSolicitudWeb
{
    /** The Target Namespace of the Web Service. */
    public static final String TNS = "http://ws.sencillosolicitud.imperial.cl/sencillosolicitud";

    /** The Logger of the Web Service. */
    private static final Logger logger =
        Logger.getLogger(SencilloSolicitudWeb.class.getName());

    /** The User Transaction of the Web Service. */
    @Resource(name = "userTransaction")
    private UserTransaction userTransaction;

    /** The Data Source of the Web Service. */
    @Resource(name = "SencilloSolicitudDataSource")
    private DataSource dataSource;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code SencilloSolicitudWeb} instance.
     */
    public SencilloSolicitudWeb()
    {
    }

    //--------------------------------------------------------------------------
    //-- WebService Methods ----------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaBanUsuTie_bca}.
     *
     * @param  codEmp {@code Cod_Emp varchar(8)}.
     * @param  cajero {@code Cajero varchar(20)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "buscabanusutieBca")
    @WebResult(name = "buscabanusutieBcaResult", targetNamespace = TNS)
    public BuscabanusutieBcaResult buscabanusutieBca(
        @WebParam(name = "codEmp", targetNamespace = TNS) final String codEmp,
        @WebParam(name = "cajero", targetNamespace = TNS) final String cajero)
        throws SencilloSolicitudWebException
    {
        final BuscabanusutieBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = BuscabanusutieBcaCaller.execute(getDataSource(), codEmp, cajero);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "buscabanusutieBca");
            throw new SencilloSolicitudWebException(thrown, "buscabanusutieBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca}.
     *
     * @param  estacion {@code Estacion char(50)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "buscaempresaxestacionBca")
    @WebResult(name = "buscaempresaxestacionBcaResult", targetNamespace = TNS)
    public BuscaempresaxestacionBcaResult buscaempresaxestacionBca(
        @WebParam(name = "estacion", targetNamespace = TNS) final String estacion)
        throws SencilloSolicitudWebException
    {
        final BuscaempresaxestacionBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = BuscaempresaxestacionBcaCaller.execute(getDataSource(), estacion);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "buscaempresaxestacionBca");
            throw new SencilloSolicitudWebException(thrown, "buscaempresaxestacionBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaUltimoVoucher_bca}.
     *
     * @param  tipoTran {@code Tipo_Tran varchar(20)}.
     * @param  codEmp {@code Cod_Emp char(8)}.
     * @param  usuario {@code Usuario char(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "buscaultimovoucherBca")
    @WebResult(name = "buscaultimovoucherBcaResult", targetNamespace = TNS)
    public BuscaultimovoucherBcaResult buscaultimovoucherBca(
        @WebParam(name = "tipoTran", targetNamespace = TNS) final String tipoTran,
        @WebParam(name = "codEmp", targetNamespace = TNS) final String codEmp,
        @WebParam(name = "usuario", targetNamespace = TNS) final String usuario)
        throws SencilloSolicitudWebException
    {
        final BuscaultimovoucherBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = BuscaultimovoucherBcaCaller.execute(getDataSource(), tipoTran, codEmp, usuario);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "buscaultimovoucherBca");
            throw new SencilloSolicitudWebException(thrown, "buscaultimovoucherBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaUsuariosVA_bca}.
     *
     * @param  valor {@code VALOR varchar(50)}.
     * @param  parametro {@code PARAMETRO char(20)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "buscausuariosvaBca")
    @WebResult(name = "buscausuariosvaBcaResult", targetNamespace = TNS)
    public BuscausuariosvaBcaResult buscausuariosvaBca(
        @WebParam(name = "valor", targetNamespace = TNS) final String valor,
        @WebParam(name = "parametro", targetNamespace = TNS) final String parametro)
        throws SencilloSolicitudWebException
    {
        final BuscausuariosvaBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = BuscausuariosvaBcaCaller.execute(getDataSource(), valor, parametro);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "buscausuariosvaBca");
            throw new SencilloSolicitudWebException(thrown, "buscausuariosvaBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$GrabaEnvioBan_ins}.
     *
     * @param  tipoTran {@code Tipo_TRAN varchar(20)}.
     * @param  montoEfe {@code Monto_Efe numeric(18)}.
     * @param  montoDoc {@code Monto_Doc numeric(18)}.
     * @param  codEmp {@code Cod_Emp char(8)}.
     * @param  detefectivo {@code DetEfectivo text}.
     * @param  detdoctos {@code DetDoctos text}.
     * @param  sencillo {@code Sencillo text}.
     * @param  usuario {@code USUARIO varchar(40)}.
     * @param  estacion {@code ESTACION varchar(50)}.
     * @param  codUsurecibe {@code Cod_UsuRecibe varchar(40)}.
     * @param  cierre {@code Cierre varchar(1)}.
     * @param  tipoEnvio {@code Tipo_Envio varchar(2)}.
     * @param  idBandejapos {@code Id_BandejaPos uniqueidentifier(36)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "grabaenviobanIns")
    @WebResult(name = "grabaenviobanInsResult", targetNamespace = TNS)
    public GrabaenviobanInsResult grabaenviobanIns(
        @WebParam(name = "tipoTran", targetNamespace = TNS) final String tipoTran,
        @WebParam(name = "montoEfe", targetNamespace = TNS) final BigDecimal montoEfe,
        @WebParam(name = "montoDoc", targetNamespace = TNS) final BigDecimal montoDoc,
        @WebParam(name = "codEmp", targetNamespace = TNS) final String codEmp,
        @WebParam(name = "detefectivo", targetNamespace = TNS) final String detefectivo,
        @WebParam(name = "detdoctos", targetNamespace = TNS) final String detdoctos,
        @WebParam(name = "sencillo", targetNamespace = TNS) final String sencillo,
        @WebParam(name = "usuario", targetNamespace = TNS) final String usuario,
        @WebParam(name = "estacion", targetNamespace = TNS) final String estacion,
        @WebParam(name = "codUsurecibe", targetNamespace = TNS) final String codUsurecibe,
        @WebParam(name = "cierre", targetNamespace = TNS) final String cierre,
        @WebParam(name = "tipoEnvio", targetNamespace = TNS) final String tipoEnvio,
        @WebParam(name = "idBandejapos", targetNamespace = TNS) final String idBandejapos)
        throws SencilloSolicitudWebException
    {
        final GrabaenviobanInsResult result;
        try {
            getUserTransaction().begin();
            try {
                result = GrabaenviobanInsCaller.execute(getDataSource(), tipoTran, montoEfe, montoDoc, codEmp, detefectivo, detdoctos, sencillo, usuario, estacion, codUsurecibe, cierre, tipoEnvio, idBandejapos);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "grabaenviobanIns");
            throw new SencilloSolicitudWebException(thrown, "grabaenviobanIns");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$MantUsuarioSearch_bca}.
     *
     * @param  codVendedor {@code Cod_Vendedor varchar(40)}.
     * @param  codUsuario {@code Cod_Usuario varchar(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "mantusuariosearchBca")
    @WebResult(name = "mantusuariosearchBcaResult", targetNamespace = TNS)
    public MantusuariosearchBcaResult mantusuariosearchBca(
        @WebParam(name = "codVendedor", targetNamespace = TNS) final String codVendedor,
        @WebParam(name = "codUsuario", targetNamespace = TNS) final String codUsuario)
        throws SencilloSolicitudWebException
    {
        final MantusuariosearchBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = MantusuariosearchBcaCaller.execute(getDataSource(), codVendedor, codUsuario);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "mantusuariosearchBca");
            throw new SencilloSolicitudWebException(thrown, "mantusuariosearchBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$TraeDenMon_bca}.
     *
     * @param  estado {@code Estado varchar(1)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "traedenmonBca")
    @WebResult(name = "traedenmonBcaResult", targetNamespace = TNS)
    public TraedenmonBcaResult traedenmonBca(
        @WebParam(name = "estado", targetNamespace = TNS) final String estado)
        throws SencilloSolicitudWebException
    {
        final TraedenmonBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = TraedenmonBcaCaller.execute(getDataSource(), estado);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "traedenmonBca");
            throw new SencilloSolicitudWebException(thrown, "traedenmonBca");
        }
        return result;
    }

    /**
     * Executes procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca}.
     *
     * @param  nroInterno {@code Nro_INTerno int}.
     * @return the output parameters and result sets of the procedure.
     * @throws SencilloSolicitudWebException if an error occurs.
     */
    @WebMethod(operationName = "traesolicitudcjBca")
    @WebResult(name = "traesolicitudcjBcaResult", targetNamespace = TNS)
    public TraesolicitudcjBcaResult traesolicitudcjBca(
        @WebParam(name = "nroInterno", targetNamespace = TNS) final Integer nroInterno)
        throws SencilloSolicitudWebException
    {
        final TraesolicitudcjBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = TraesolicitudcjBcaCaller.execute(getDataSource(), nroInterno);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "traesolicitudcjBca");
            throw new SencilloSolicitudWebException(thrown, "traesolicitudcjBca");
        }
        return result;
    }

    //--------------------------------------------------------------------------
    //-- JNDI Methods ----------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the user transaction of the WebService.
     *
     * @return the user transaction of the WebService.
     * @throws NamingException if a JNDI error occurs.
     */
    private UserTransaction getUserTransaction()
        throws NamingException
    {
        if (userTransaction == null) {
            final InitialContext context = new InitialContext();
            try {
                userTransaction = (UserTransaction) context.lookup("java:comp/UserTransaction");
            } finally {
                context.close();
            }
        }
        return userTransaction;
    }

    /**
     * Returns the data source of the WebService.
     *
     * @return the data source of the WebService.
     * @throws NamingException if a JNDI error occurs.
     */
    private DataSource getDataSource()
        throws NamingException
    {
        if (dataSource == null) {
            final InitialContext context = new InitialContext();
            try {
                dataSource = (DataSource) context.lookup("java:comp/env/SencilloSolicitudDataSource");
            } finally {
                context.close();
            }
        }
        return dataSource;
    }

    //--------------------------------------------------------------------------
    //-- Error Methods ---------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Logs a method error with associated throwable information.
     *
     * @param thrown the throwable associated with the error.
     * @param methodName the name of method that threw the error.
     */
    private void logError(final Throwable thrown, final String methodName)
    {
        if (thrown instanceof SQLException) {
            logSqlError((SQLException) thrown, methodName);
        } else {
            final String fullName = getClass().getName() + '#' + methodName;
            logger.log(Level.SEVERE, "Error executing " + fullName, thrown);
        }
    }

    /**
     * Logs a method error with associated SQLException information.
     *
     * @param  sqlex the SQLException associated with the error.
     * @param  methodName the name of method that threw the error.
     * @throws NullPointerException if {@code sqlex} is {@code null}.
     */
    private void logSqlError(final SQLException sqlex, final String methodName)
    {
        // Compute full method name and obtain SQL properties
        final String fullName = getClass().getName() + '#' + methodName;
        final String sqlState = sqlex.getSQLState();
        final int sqlErrorCode = sqlex.getErrorCode();

        // Obtain all error messages of SQLException
        final StringBuilder sb = new StringBuilder(200);
        final Iterator<Throwable> iter = sqlex.iterator();
        while (iter.hasNext()) {
            final Throwable cause = iter.next();
            if (sb.length() > 0) sb.append(": ");
            final String msg = cause.getMessage();
            sb.append(msg != null ? msg : cause.toString());
        }
        final String sqlMessages = sb.toString();

        // Log error including full method name and SQL properties
        final String sqlProps = ": (" + sqlState + ',' + sqlErrorCode + ") ";
        logger.severe("Error executing " + fullName + sqlProps + sqlMessages);
    }
}
