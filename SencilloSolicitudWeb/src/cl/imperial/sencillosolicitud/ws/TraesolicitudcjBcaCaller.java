/*
 * Source: TraesolicitudcjBcaCaller.java - Generated by OBCOM SQL Wizard 1.158
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

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Caller of procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca}.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
public class TraesolicitudcjBcaCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code TraesolicitudcjBcaCaller} instance.
     */
    public TraesolicitudcjBcaCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  nroInterno {@code Nro_INTerno int}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public TraesolicitudcjBcaResult executeProc(final DataSource dataSource, Integer nroInterno)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, nroInterno);
        }
    }

    /**
     * Executes procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  nroInterno {@code Nro_INTerno int}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public TraesolicitudcjBcaResult executeProc(final Connection conn, Integer nroInterno)
        throws SQLException
    {
        final TraesolicitudcjBcaResult result = createProcResult();
        final String jdbcURL = getJdbcURL(conn);
        if (jdbcURL.startsWith("jdbc:oracle:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$TraeSolicitudCJ_bca(?,?,?,?,?,?)}")) {
                call.setObject(1, nroInterno, Types.INTEGER);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, ORACLE_CURSOR);
                call.registerOutParameter(4, ORACLE_CURSOR);
                call.registerOutParameter(5, ORACLE_CURSOR);
                call.registerOutParameter(6, ORACLE_CURSOR);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setVouchers(readVouchers((ResultSet) call.getObject(3)));
                result.setEfectivos(readEfectivos((ResultSet) call.getObject(4)));
                result.setDocumentos(readDocumentos((ResultSet) call.getObject(5)));
                result.setSaldos(readSaldos((ResultSet) call.getObject(6)));
            }
        } else if (jdbcURL.startsWith("jdbc:postgresql:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$TraeSolicitudCJ_bca(?,?,?,?,?,?)}")) {
                call.setObject(1, nroInterno, Types.INTEGER);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, Types.OTHER);
                call.registerOutParameter(4, Types.OTHER);
                call.registerOutParameter(5, Types.OTHER);
                call.registerOutParameter(6, Types.OTHER);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setVouchers(readVouchers((ResultSet) call.getObject(3)));
                result.setEfectivos(readEfectivos((ResultSet) call.getObject(4)));
                result.setDocumentos(readDocumentos((ResultSet) call.getObject(5)));
                result.setSaldos(readSaldos((ResultSet) call.getObject(6)));
            }
        } else {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$TraeSolicitudCJ_bca(?,?)}")) {
                call.setObject(1, nroInterno, Types.INTEGER);
                call.registerOutParameter(2, Types.NVARCHAR);
                int updateCount = 0;
                boolean haveRset = call.execute();
                while (haveRset || updateCount != -1) {
                    if (!haveRset) {
                        updateCount = call.getUpdateCount();
                    } else if (result.getVouchers() == null) {
                        result.setVouchers(readVouchers(call.getResultSet()));
                    } else if (result.getEfectivos() == null) {
                        result.setEfectivos(readEfectivos(call.getResultSet()));
                    } else if (result.getDocumentos() == null) {
                        result.setDocumentos(readDocumentos(call.getResultSet()));
                    } else if (result.getSaldos() == null) {
                        result.setSaldos(readSaldos(call.getResultSet()));
                    } else {
                        unexpectedResultSet(call.getResultSet());
                    }
                    haveRset = call.getMoreResults();
                }
                result.setErrorMessage(call.getString(2));
            }
        }
        return result;
    }

    /**
     * Creates and returns a new instance of {@code TraesolicitudcjBcaResult}.
     * <p>
     * Can be overridden to return a subtype of {@code TraesolicitudcjBcaResult}.
     *
     * @return a new {@code TraesolicitudcjBcaResult} instance.
     */
    protected TraesolicitudcjBcaResult createProcResult()
    {
        return new TraesolicitudcjBcaResult();
    }

    //--------------------------------------------------------------------------
    //-- TraesolicitudcjBcaVoucher ResultSet Methods ---------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code TraesolicitudcjBcaVoucher}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code TraesolicitudcjBcaVoucher} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<TraesolicitudcjBcaVoucher> readVouchers(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cNroInterno = resultSet.findColumn("NRO_INTERNO");
            final int cNroInternopadre = resultSet.findColumn("NRO_INTERNOPADRE");
            final int cTipoTransaccion = resultSet.findColumn("TIPO_TRANSACCION");
            final int cCodEmp = resultSet.findColumn("COD_EMP");
            final int cFecha = resultSet.findColumn("FECHA");
            final int cMontoEfectivo = resultSet.findColumn("MONTO_EFECTIVO");
            final int cMontoDocumentos = resultSet.findColumn("MONTO_DOCUMENTOS");
            final int cUsuario = resultSet.findColumn("USUARIO");
            final int cEstacion = resultSet.findColumn("ESTACION");
            final int cEstado = resultSet.findColumn("ESTADO");
            final int cCodUsurecibe = resultSet.findColumn("COD_USURECIBE");
            final int cCierre = resultSet.findColumn("CIERRE");
            final int cNomEmp = resultSet.findColumn("NOM_EMP");
            final int cTipoEnvio = resultSet.findColumn("TIPO_ENVIO");

            // Convert result rows to an array of "TraesolicitudcjBcaVoucher"
            final List<TraesolicitudcjBcaVoucher> list = new ArrayList<>();
            while (resultSet.next()) {
                final TraesolicitudcjBcaVoucher item = createVoucher();
                item.setNroInterno(resultSet.getString(cNroInterno));
                item.setNroInternopadre(resultSet.getString(cNroInternopadre));
                item.setTipoTransaccion(resultSet.getString(cTipoTransaccion));
                item.setCodEmp(resultSet.getString(cCodEmp));
                item.setFecha(resultSet.getString(cFecha));
                item.setMontoEfectivo(resultSet.getString(cMontoEfectivo));
                item.setMontoDocumentos(resultSet.getString(cMontoDocumentos));
                item.setUsuario(resultSet.getString(cUsuario));
                item.setEstacion(resultSet.getString(cEstacion));
                item.setEstado(resultSet.getString(cEstado));
                item.setCodUsurecibe(resultSet.getString(cCodUsurecibe));
                item.setCierre(resultSet.getString(cCierre));
                item.setNomEmp(resultSet.getString(cNomEmp));
                item.setTipoEnvio(resultSet.getString(cTipoEnvio));
                if (filterVoucher(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code TraesolicitudcjBcaVoucher}.
     * <p>
     * Can be overridden to return a subtype of {@code TraesolicitudcjBcaVoucher}.
     *
     * @return a new {@code TraesolicitudcjBcaVoucher} instance.
     */
    protected TraesolicitudcjBcaVoucher createVoucher()
    {
        return new TraesolicitudcjBcaVoucher();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code TraesolicitudcjBcaVoucher} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterVoucher(final TraesolicitudcjBcaVoucher item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- TraesolicitudcjBcaEfectivo ResultSet Methods --------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code TraesolicitudcjBcaEfectivo}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code TraesolicitudcjBcaEfectivo} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<TraesolicitudcjBcaEfectivo> readEfectivos(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cNroInterno = resultSet.findColumn("NRO_INTERNO");
            final int cTipoTransaccion = resultSet.findColumn("TIPO_TRANSACCION");
            final int cCodigoDen = resultSet.findColumn("CODIGO_DEN");
            final int cCantidadDen = resultSet.findColumn("CANTIDAD_DEN");

            // Convert result rows to an array of "TraesolicitudcjBcaEfectivo"
            final List<TraesolicitudcjBcaEfectivo> list = new ArrayList<>();
            while (resultSet.next()) {
                final TraesolicitudcjBcaEfectivo item = createEfectivo();
                item.setNroInterno(resultSet.getString(cNroInterno));
                item.setTipoTransaccion(resultSet.getString(cTipoTransaccion));
                item.setCodigoDen(resultSet.getString(cCodigoDen));
                item.setCantidadDen(resultSet.getString(cCantidadDen));
                if (filterEfectivo(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code TraesolicitudcjBcaEfectivo}.
     * <p>
     * Can be overridden to return a subtype of {@code TraesolicitudcjBcaEfectivo}.
     *
     * @return a new {@code TraesolicitudcjBcaEfectivo} instance.
     */
    protected TraesolicitudcjBcaEfectivo createEfectivo()
    {
        return new TraesolicitudcjBcaEfectivo();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code TraesolicitudcjBcaEfectivo} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterEfectivo(final TraesolicitudcjBcaEfectivo item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- TraesolicitudcjBcaDocumento ResultSet Methods -------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code TraesolicitudcjBcaDocumento}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code TraesolicitudcjBcaDocumento} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<TraesolicitudcjBcaDocumento> readDocumentos(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cNroInterno = resultSet.findColumn("NRO_INTERNO");
            final int cTipoTransaccion = resultSet.findColumn("TIPO_TRANSACCION");
            final int cTipoDocumento = resultSet.findColumn("TIPO_DOCUMENTO");
            final int cIdDocumento = resultSet.findColumn("ID_DOCUMENTO");
            final int cMonto = resultSet.findColumn("MONTO");
            final int cNumero = resultSet.findColumn("NUMERO");
            final int cCuenta = resultSet.findColumn("CUENTA");

            // Convert result rows to an array of "TraesolicitudcjBcaDocumento"
            final List<TraesolicitudcjBcaDocumento> list = new ArrayList<>();
            while (resultSet.next()) {
                final TraesolicitudcjBcaDocumento item = createDocumento();
                item.setNroInterno(resultSet.getString(cNroInterno));
                item.setTipoTransaccion(resultSet.getString(cTipoTransaccion));
                item.setTipoDocumento(resultSet.getString(cTipoDocumento));
                item.setIdDocumento(resultSet.getString(cIdDocumento));
                item.setMonto(resultSet.getString(cMonto));
                item.setNumero(resultSet.getString(cNumero));
                item.setCuenta(resultSet.getString(cCuenta));
                if (filterDocumento(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code TraesolicitudcjBcaDocumento}.
     * <p>
     * Can be overridden to return a subtype of {@code TraesolicitudcjBcaDocumento}.
     *
     * @return a new {@code TraesolicitudcjBcaDocumento} instance.
     */
    protected TraesolicitudcjBcaDocumento createDocumento()
    {
        return new TraesolicitudcjBcaDocumento();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code TraesolicitudcjBcaDocumento} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterDocumento(final TraesolicitudcjBcaDocumento item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- TraesolicitudcjBcaSaldo ResultSet Methods -----------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code TraesolicitudcjBcaSaldo}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code TraesolicitudcjBcaSaldo} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<TraesolicitudcjBcaSaldo> readSaldos(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cSaldocmr = resultSet.findColumn("SALDOCMR");

            // Convert result rows to an array of "TraesolicitudcjBcaSaldo"
            final List<TraesolicitudcjBcaSaldo> list = new ArrayList<>();
            while (resultSet.next()) {
                final TraesolicitudcjBcaSaldo item = createSaldo();
                item.setSaldocmr(resultSet.getString(cSaldocmr));
                if (filterSaldo(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code TraesolicitudcjBcaSaldo}.
     * <p>
     * Can be overridden to return a subtype of {@code TraesolicitudcjBcaSaldo}.
     *
     * @return a new {@code TraesolicitudcjBcaSaldo} instance.
     */
    protected TraesolicitudcjBcaSaldo createSaldo()
    {
        return new TraesolicitudcjBcaSaldo();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code TraesolicitudcjBcaSaldo} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterSaldo(final TraesolicitudcjBcaSaldo item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  nroInterno {@code Nro_INTerno int}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static TraesolicitudcjBcaResult execute(final DataSource dataSource, Integer nroInterno)
        throws SQLException
    {
        return new TraesolicitudcjBcaCaller().executeProc(dataSource, nroInterno);
    }

    /**
     * Executes procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  nroInterno {@code Nro_INTerno int}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static TraesolicitudcjBcaResult execute(final Connection conn, Integer nroInterno)
        throws SQLException
    {
        return new TraesolicitudcjBcaCaller().executeProc(conn, nroInterno);
    }
}