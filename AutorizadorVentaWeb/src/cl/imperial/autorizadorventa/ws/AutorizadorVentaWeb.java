/*
 * Source: AutorizadorVentaWeb.java - Generated by OBCOM SQL Wizard 1.160
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

package cl.imperial.autorizadorventa.ws;

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
 * The {@code AutorizadorVenta} Web Service.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@WebService(targetNamespace = AutorizadorVentaWeb.TNS)
public class AutorizadorVentaWeb
{
    /** The Target Namespace of the Web Service. */
    public static final String TNS = "http://ws.autorizadorventa.imperial.cl/autorizadorventa";

    /** The Logger of the Web Service. */
    private static final Logger logger =
        Logger.getLogger(AutorizadorVentaWeb.class.getName());

    /** The User Transaction of the Web Service. */
    @Resource(name = "userTransaction")
    private UserTransaction userTransaction;

    /** The Data Source of the Web Service. */
    @Resource(name = "AutorizadorVentaDataSource")
    private DataSource dataSource;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code AutorizadorVentaWeb} instance.
     */
    public AutorizadorVentaWeb()
    {
    }

    //--------------------------------------------------------------------------
    //-- WebService Methods ----------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code AutorizadorVenta$BuscaClienteRut_bca}.
     *
     * @param  rutCliente {@code RUT_CLIENTE varchar(13)}.
     * @param  codEntidad {@code COD_ENTIDAD varchar(13)}.
     * @param  codSucursal {@code COD_SUCURSAL varchar(3)}.
     * @return the output parameters and result sets of the procedure.
     * @throws AutorizadorVentaWebException if an error occurs.
     */
    @WebMethod(operationName = "buscaclienterutBca")
    @WebResult(name = "buscaclienterutBcaResult", targetNamespace = TNS)
    public BuscaclienterutBcaResult buscaclienterutBca(
        @WebParam(name = "rutCliente", targetNamespace = TNS) final String rutCliente,
        @WebParam(name = "codEntidad", targetNamespace = TNS) final String codEntidad,
        @WebParam(name = "codSucursal", targetNamespace = TNS) final String codSucursal)
        throws AutorizadorVentaWebException
    {
        final BuscaclienterutBcaResult result;
        try {
            getUserTransaction().begin();
            try {
                result = BuscaclienterutBcaCaller.execute(getDataSource(), rutCliente, codEntidad, codSucursal);
            } catch (final Throwable callerThrowable) {
                getUserTransaction().rollback();
                throw callerThrowable;
            }
            getUserTransaction().commit();
        } catch (final Throwable thrown) {
            logError(thrown, "buscaclienterutBca");
            throw new AutorizadorVentaWebException(thrown, "buscaclienterutBca");
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
                dataSource = (DataSource) context.lookup("java:comp/env/AutorizadorVentaDataSource");
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