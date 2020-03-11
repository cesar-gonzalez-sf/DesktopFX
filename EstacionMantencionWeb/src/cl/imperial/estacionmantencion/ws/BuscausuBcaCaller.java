/*
 * Source: BuscausuBcaCaller.java - Generated by OBCOM SQL Wizard 1.158
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

package cl.imperial.estacionmantencion.ws;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Caller of procedure {@code EstacionMantencion$BuscaUsu_bca}.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
public class BuscausuBcaCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscausuBcaCaller} instance.
     */
    public BuscausuBcaCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code EstacionMantencion$BuscaUsu_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  usuCodigo {@code USU_CODIGO char(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public BuscausuBcaResult executeProc(final DataSource dataSource, String usuCodigo)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, usuCodigo);
        }
    }

    /**
     * Executes procedure {@code EstacionMantencion$BuscaUsu_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  usuCodigo {@code USU_CODIGO char(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public BuscausuBcaResult executeProc(final Connection conn, String usuCodigo)
        throws SQLException
    {
        final BuscausuBcaResult result = createProcResult();
        final String jdbcURL = getJdbcURL(conn);
        if (jdbcURL.startsWith("jdbc:oracle:")) {
            try (final CallableStatement call = prepareCall(conn, "{call EstacionMantencion$BuscaUsu_bca(?,?,?)}")) {
                call.setString(1, usuCodigo);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, ORACLE_CURSOR);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setEstaciones(readEstaciones((ResultSet) call.getObject(3)));
            }
        } else if (jdbcURL.startsWith("jdbc:postgresql:")) {
            try (final CallableStatement call = prepareCall(conn, "{call EstacionMantencion$BuscaUsu_bca(?,?,?)}")) {
                call.setString(1, usuCodigo);
                call.registerOutParameter(2, Types.NVARCHAR);
                call.registerOutParameter(3, Types.OTHER);
                call.execute();
                result.setErrorMessage(call.getString(2));
                result.setEstaciones(readEstaciones((ResultSet) call.getObject(3)));
            }
        } else {
            try (final CallableStatement call = prepareCall(conn, "{call EstacionMantencion$BuscaUsu_bca(?,?)}")) {
                call.setString(1, usuCodigo);
                call.registerOutParameter(2, Types.NVARCHAR);
                int updateCount = 0;
                boolean haveRset = call.execute();
                while (haveRset || updateCount != -1) {
                    if (!haveRset) {
                        updateCount = call.getUpdateCount();
                    } else if (result.getEstaciones() == null) {
                        result.setEstaciones(readEstaciones(call.getResultSet()));
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
     * Creates and returns a new instance of {@code BuscausuBcaResult}.
     * <p>
     * Can be overridden to return a subtype of {@code BuscausuBcaResult}.
     *
     * @return a new {@code BuscausuBcaResult} instance.
     */
    protected BuscausuBcaResult createProcResult()
    {
        return new BuscausuBcaResult();
    }

    //--------------------------------------------------------------------------
    //-- BuscausuBcaEstacion ResultSet Methods ---------------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code BuscausuBcaEstacion}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code BuscausuBcaEstacion} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<BuscausuBcaEstacion> readEstaciones(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cUsuCodigo = resultSet.findColumn("USU_CODIGO");
            final int cApellidoPat = resultSet.findColumn("APELLIDO_PAT");
            final int cApellidoMat = resultSet.findColumn("APELLIDO_MAT");
            final int cNombres = resultSet.findColumn("NOMBRES");
            final int cComuna = resultSet.findColumn("COMUNA");
            final int cCiudad = resultSet.findColumn("CIUDAD");
            final int cPais = resultSet.findColumn("PAIS");

            // Convert result rows to an array of "BuscausuBcaEstacion"
            final List<BuscausuBcaEstacion> list = new ArrayList<>();
            while (resultSet.next()) {
                final BuscausuBcaEstacion item = createEstacion();
                item.setUsuCodigo(resultSet.getString(cUsuCodigo));
                item.setApellidoPat(resultSet.getString(cApellidoPat));
                item.setApellidoMat(resultSet.getString(cApellidoMat));
                item.setNombres(resultSet.getString(cNombres));
                item.setComuna(resultSet.getString(cComuna));
                item.setCiudad(resultSet.getString(cCiudad));
                item.setPais(resultSet.getString(cPais));
                if (filterEstacion(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code BuscausuBcaEstacion}.
     * <p>
     * Can be overridden to return a subtype of {@code BuscausuBcaEstacion}.
     *
     * @return a new {@code BuscausuBcaEstacion} instance.
     */
    protected BuscausuBcaEstacion createEstacion()
    {
        return new BuscausuBcaEstacion();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code BuscausuBcaEstacion} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterEstacion(final BuscausuBcaEstacion item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code EstacionMantencion$BuscaUsu_bca} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  usuCodigo {@code USU_CODIGO char(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static BuscausuBcaResult execute(final DataSource dataSource, String usuCodigo)
        throws SQLException
    {
        return new BuscausuBcaCaller().executeProc(dataSource, usuCodigo);
    }

    /**
     * Executes procedure {@code EstacionMantencion$BuscaUsu_bca} using a connection.
     *
     * @param  conn the database connection.
     * @param  usuCodigo {@code USU_CODIGO char(40)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static BuscausuBcaResult execute(final Connection conn, String usuCodigo)
        throws SQLException
    {
        return new BuscausuBcaCaller().executeProc(conn, usuCodigo);
    }
}
