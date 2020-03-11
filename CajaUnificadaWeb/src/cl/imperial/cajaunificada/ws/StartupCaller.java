/*
 * Source: StartupCaller.java - Generated by OBCOM SQL Wizard 1.158
 * Author: Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 *
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 * 
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously authorized in writing by IMPERIAL S.A. In any event,  this  notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada.ws;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Caller of procedure {@code CajaUnificada$Startup}.
 *
 * @author Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 */
public class StartupCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code StartupCaller} instance.
     */
    public StartupCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code CajaUnificada$Startup} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  userCode {@code USER_CODE nvarchar(40)}.
     * @param  profileCode {@code PROFILE_CODE decimal(7)}.
     * @param  stationName {@code STATION_NAME nvarchar(16)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public StartupResult executeProc(final DataSource dataSource, String userCode, BigDecimal profileCode, String stationName)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, userCode, profileCode, stationName);
        }
    }

    /**
     * Executes procedure {@code CajaUnificada$Startup} using a connection.
     *
     * @param  conn the database connection.
     * @param  userCode {@code USER_CODE nvarchar(40)}.
     * @param  profileCode {@code PROFILE_CODE decimal(7)}.
     * @param  stationName {@code STATION_NAME nvarchar(16)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public StartupResult executeProc(final Connection conn, String userCode, BigDecimal profileCode, String stationName)
        throws SQLException
    {
        final StartupResult result = createProcResult();
        final String jdbcURL = getJdbcURL(conn);
        if (jdbcURL.startsWith("jdbc:oracle:")) {
            try (final CallableStatement call = prepareCall(conn, "{call CajaUnificada$Startup(?,?,?,?)}")) {
                call.setString(1, userCode);
                call.setBigDecimal(2, profileCode);
                call.setString(3, stationName);
                call.registerOutParameter(4, ORACLE_CURSOR);
                call.execute();
                result.setPropiedades(readPropiedades((ResultSet) call.getObject(4)));
            }
        } else if (jdbcURL.startsWith("jdbc:postgresql:")) {
            try (final CallableStatement call = prepareCall(conn, "{call CajaUnificada$Startup(?,?,?,?)}")) {
                call.setString(1, userCode);
                call.setBigDecimal(2, profileCode);
                call.setString(3, stationName);
                call.registerOutParameter(4, Types.OTHER);
                call.execute();
                result.setPropiedades(readPropiedades((ResultSet) call.getObject(4)));
            }
        } else {
            try (final CallableStatement call = prepareCall(conn, "{call CajaUnificada$Startup(?,?,?)}")) {
                call.setString(1, userCode);
                call.setBigDecimal(2, profileCode);
                call.setString(3, stationName);
                int updateCount = 0;
                boolean haveRset = call.execute();
                while (haveRset || updateCount != -1) {
                    if (!haveRset) {
                        updateCount = call.getUpdateCount();
                    } else if (result.getPropiedades() == null) {
                        result.setPropiedades(readPropiedades(call.getResultSet()));
                    } else {
                        unexpectedResultSet(call.getResultSet());
                    }
                    haveRset = call.getMoreResults();
                }
            }
        }
        return result;
    }

    /**
     * Creates and returns a new instance of {@code StartupResult}.
     * <p>
     * Can be overridden to return a subtype of {@code StartupResult}.
     *
     * @return a new {@code StartupResult} instance.
     */
    protected StartupResult createProcResult()
    {
        return new StartupResult();
    }

    //--------------------------------------------------------------------------
    //-- StartupPropiedad ResultSet Methods ------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code StartupPropiedad}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code StartupPropiedad} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<StartupPropiedad> readPropiedades(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cNombre = resultSet.findColumn("NOMBRE");
            final int cValor = resultSet.findColumn("VALOR");

            // Convert result rows to an array of "StartupPropiedad"
            final List<StartupPropiedad> list = new ArrayList<>();
            while (resultSet.next()) {
                final StartupPropiedad item = createPropiedad();
                item.setNombre(resultSet.getString(cNombre));
                item.setValor(resultSet.getString(cValor));
                if (filterPropiedad(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code StartupPropiedad}.
     * <p>
     * Can be overridden to return a subtype of {@code StartupPropiedad}.
     *
     * @return a new {@code StartupPropiedad} instance.
     */
    protected StartupPropiedad createPropiedad()
    {
        return new StartupPropiedad();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code StartupPropiedad} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterPropiedad(final StartupPropiedad item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code CajaUnificada$Startup} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  userCode {@code USER_CODE nvarchar(40)}.
     * @param  profileCode {@code PROFILE_CODE decimal(7)}.
     * @param  stationName {@code STATION_NAME nvarchar(16)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static StartupResult execute(final DataSource dataSource, String userCode, BigDecimal profileCode, String stationName)
        throws SQLException
    {
        return new StartupCaller().executeProc(dataSource, userCode, profileCode, stationName);
    }

    /**
     * Executes procedure {@code CajaUnificada$Startup} using a connection.
     *
     * @param  conn the database connection.
     * @param  userCode {@code USER_CODE nvarchar(40)}.
     * @param  profileCode {@code PROFILE_CODE decimal(7)}.
     * @param  stationName {@code STATION_NAME nvarchar(16)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static StartupResult execute(final Connection conn, String userCode, BigDecimal profileCode, String stationName)
        throws SQLException
    {
        return new StartupCaller().executeProc(conn, userCode, profileCode, stationName);
    }
}