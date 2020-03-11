/*
 * Source: BuscaempresaxestacionBcaCaller.java - Generated by OBCOM SQL Wizard 1.158
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
 * Caller of procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca}.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
public class BuscaempresaxestacionBcaCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscaempresaxestacionBcaCaller} instance.
     */
    public BuscaempresaxestacionBcaCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  estacion {@code Estacion char(50)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public BuscaempresaxestacionBcaResult executeProc(final DataSource dataSource, String estacion)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, estacion);
        }
    }

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  estacion {@code Estacion char(50)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public BuscaempresaxestacionBcaResult executeProc(final Connection conn, String estacion)
        throws SQLException
    {
        final BuscaempresaxestacionBcaResult result = createProcResult();
        final String jdbcURL = getJdbcURL(conn);
        if (jdbcURL.startsWith("jdbc:oracle:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$BuscaEmpresaXEstacion_bca(?,?,?)}")) {
                call.setString(1, estacion);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, ORACLE_CURSOR);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setSolicitudes(readSolicitudes((ResultSet) call.getObject(3)));
            }
        } else if (jdbcURL.startsWith("jdbc:postgresql:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$BuscaEmpresaXEstacion_bca(?,?,?)}")) {
                call.setString(1, estacion);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, Types.OTHER);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setSolicitudes(readSolicitudes((ResultSet) call.getObject(3)));
            }
        } else {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$BuscaEmpresaXEstacion_bca(?,?)}")) {
                call.setString(1, estacion);
                call.registerOutParameter(2, Types.NVARCHAR);
                int updateCount = 0;
                boolean haveRset = call.execute();
                while (haveRset || updateCount != -1) {
                    if (!haveRset) {
                        updateCount = call.getUpdateCount();
                    } else if (result.getSolicitudes() == null) {
                        result.setSolicitudes(readSolicitudes(call.getResultSet()));
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
     * Creates and returns a new instance of {@code BuscaempresaxestacionBcaResult}.
     * <p>
     * Can be overridden to return a subtype of {@code BuscaempresaxestacionBcaResult}.
     *
     * @return a new {@code BuscaempresaxestacionBcaResult} instance.
     */
    protected BuscaempresaxestacionBcaResult createProcResult()
    {
        return new BuscaempresaxestacionBcaResult();
    }

    //--------------------------------------------------------------------------
    //-- BuscaempresaxestacionBcaSolicitud ResultSet Methods -------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code BuscaempresaxestacionBcaSolicitud}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code BuscaempresaxestacionBcaSolicitud} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<BuscaempresaxestacionBcaSolicitud> readSolicitudes(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cEstacion = resultSet.findColumn("ESTACION");
            final int cCodEmp = resultSet.findColumn("COD_EMP");
            final int cNomEmp = resultSet.findColumn("NOM_EMP");
            final int cTipoestacion = resultSet.findColumn("TIPOESTACION");
            final int cDescripcion = resultSet.findColumn("DESCRIPCION");
            final int cBodega = resultSet.findColumn("BODEGA");
            final int cListaventa = resultSet.findColumn("LISTAVENTA");
            final int cCodRegion = resultSet.findColumn("COD_REGION");
            final int cRazonsocialSii = resultSet.findColumn("RAZONSOCIAL_SII");
            final int cAjustesencillo = resultSet.findColumn("AJUSTESENCILLO");
            final int cTipofacEcoretiro = resultSet.findColumn("TIPOFAC_ECORETIRO");
            final int cTipofacEcodespacho = resultSet.findColumn("TIPOFAC_ECODESPACHO");

            // Convert result rows to an array of "BuscaempresaxestacionBcaSolicitud"
            final List<BuscaempresaxestacionBcaSolicitud> list = new ArrayList<>();
            while (resultSet.next()) {
                final BuscaempresaxestacionBcaSolicitud item = createSolicitud();
                item.setEstacion(resultSet.getString(cEstacion));
                item.setCodEmp(resultSet.getString(cCodEmp));
                item.setNomEmp(resultSet.getString(cNomEmp));
                item.setTipoestacion(resultSet.getString(cTipoestacion));
                item.setDescripcion(resultSet.getString(cDescripcion));
                item.setBodega(resultSet.getString(cBodega));
                item.setListaventa(resultSet.getString(cListaventa));
                item.setCodRegion(resultSet.getString(cCodRegion));
                item.setRazonsocialSii(resultSet.getString(cRazonsocialSii));
                item.setAjustesencillo(resultSet.getString(cAjustesencillo));
                item.setTipofacEcoretiro(resultSet.getString(cTipofacEcoretiro));
                item.setTipofacEcodespacho(resultSet.getString(cTipofacEcodespacho));
                if (filterSolicitud(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code BuscaempresaxestacionBcaSolicitud}.
     * <p>
     * Can be overridden to return a subtype of {@code BuscaempresaxestacionBcaSolicitud}.
     *
     * @return a new {@code BuscaempresaxestacionBcaSolicitud} instance.
     */
    protected BuscaempresaxestacionBcaSolicitud createSolicitud()
    {
        return new BuscaempresaxestacionBcaSolicitud();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code BuscaempresaxestacionBcaSolicitud} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterSolicitud(final BuscaempresaxestacionBcaSolicitud item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  estacion {@code Estacion char(50)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static BuscaempresaxestacionBcaResult execute(final DataSource dataSource, String estacion)
        throws SQLException
    {
        return new BuscaempresaxestacionBcaCaller().executeProc(dataSource, estacion);
    }

    /**
     * Executes procedure {@code SolicitudSencillo$BuscaEmpresaXEstacion_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  estacion {@code Estacion char(50)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static BuscaempresaxestacionBcaResult execute(final Connection conn, String estacion)
        throws SQLException
    {
        return new BuscaempresaxestacionBcaCaller().executeProc(conn, estacion);
    }
}
