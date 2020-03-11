/*
 * Source: GrabaenviobanInsCaller.java - Generated by OBCOM SQL Wizard 1.158
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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Caller of procedure {@code SolicitudSencillo$GrabaEnvioBan_ins}.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
public class GrabaenviobanInsCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code GrabaenviobanInsCaller} instance.
     */
    public GrabaenviobanInsCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$GrabaEnvioBan_ins} using a data source.
     *
     * @param  dataSource the connection data source.
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
     * @throws SQLException if an SQL error occurs.
     */
    public GrabaenviobanInsResult executeProc(final DataSource dataSource, String tipoTran, BigDecimal montoEfe, BigDecimal montoDoc, String codEmp, String detefectivo, String detdoctos, String sencillo, String usuario, String estacion, String codUsurecibe, String cierre, String tipoEnvio, String idBandejapos)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, tipoTran, montoEfe, montoDoc, codEmp, detefectivo, detdoctos, sencillo, usuario, estacion, codUsurecibe, cierre, tipoEnvio, idBandejapos);
        }
    }

    /**
     * Executes procedure {@code SolicitudSencillo$GrabaEnvioBan_ins} using a connection.
     *
     * @param  conn the database connection.
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
     * @throws SQLException if an SQL error occurs.
     */
    public GrabaenviobanInsResult executeProc(final Connection conn, String tipoTran, BigDecimal montoEfe, BigDecimal montoDoc, String codEmp, String detefectivo, String detdoctos, String sencillo, String usuario, String estacion, String codUsurecibe, String cierre, String tipoEnvio, String idBandejapos)
        throws SQLException
    {
        final GrabaenviobanInsResult result = createProcResult();
        final String jdbcURL = getJdbcURL(conn);
        if (jdbcURL.startsWith("jdbc:oracle:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$GrabaEnvioBan_ins(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}")) {
                call.setString(1, tipoTran);
                call.setBigDecimal(2, montoEfe);
                call.setBigDecimal(3, montoDoc);
                call.setString(4, codEmp);
                call.setString(5, detefectivo);
                call.setString(6, detdoctos);
                call.setString(7, sencillo);
                call.setString(8, usuario);
                call.setString(9, estacion);
                call.setString(10, codUsurecibe);
                call.setString(11, cierre);
                call.setString(12, tipoEnvio);
                call.setString(13, idBandejapos);
                call.registerOutParameter(14, Types.NVARCHAR);
                call.registerOutParameter(15, ORACLE_CURSOR);
                call.execute();
                result.setErrorMessage(call.getString(14));
                result.setSolicitudes(readSolicitudes((ResultSet) call.getObject(15)));
            }
        } else if (jdbcURL.startsWith("jdbc:postgresql:")) {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$GrabaEnvioBan_ins(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}")) {
                call.setString(1, tipoTran);
                call.setBigDecimal(2, montoEfe);
                call.setBigDecimal(3, montoDoc);
                call.setString(4, codEmp);
                call.setString(5, detefectivo);
                call.setString(6, detdoctos);
                call.setString(7, sencillo);
                call.setString(8, usuario);
                call.setString(9, estacion);
                call.setString(10, codUsurecibe);
                call.setString(11, cierre);
                call.setString(12, tipoEnvio);
                call.setString(13, idBandejapos);
                call.registerOutParameter(14, Types.NVARCHAR);
                call.registerOutParameter(15, Types.OTHER);
                call.execute();
                result.setErrorMessage(call.getString(14));
                result.setSolicitudes(readSolicitudes((ResultSet) call.getObject(15)));
            }
        } else {
            try (final CallableStatement call = prepareCall(conn, "{call SolicitudSencillo$GrabaEnvioBan_ins(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}")) {
                call.setString(1, tipoTran);
                call.setBigDecimal(2, montoEfe);
                call.setBigDecimal(3, montoDoc);
                call.setString(4, codEmp);
                call.setString(5, detefectivo);
                call.setString(6, detdoctos);
                call.setString(7, sencillo);
                call.setString(8, usuario);
                call.setString(9, estacion);
                call.setString(10, codUsurecibe);
                call.setString(11, cierre);
                call.setString(12, tipoEnvio);
                call.setString(13, idBandejapos);
                call.registerOutParameter(14, Types.NVARCHAR);
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
                result.setErrorMessage(call.getString(14));
            }
        }
        return result;
    }

    /**
     * Creates and returns a new instance of {@code GrabaenviobanInsResult}.
     * <p>
     * Can be overridden to return a subtype of {@code GrabaenviobanInsResult}.
     *
     * @return a new {@code GrabaenviobanInsResult} instance.
     */
    protected GrabaenviobanInsResult createProcResult()
    {
        return new GrabaenviobanInsResult();
    }

    //--------------------------------------------------------------------------
    //-- GrabaenviobanInsSolicitud ResultSet Methods ---------------------------
    //--------------------------------------------------------------------------

    /**
     * Converts a result set to an array of {@code GrabaenviobanInsSolicitud}.
     *
     * @param  resultSet the result set to convert (can be null).
     * @return an array of {@code GrabaenviobanInsSolicitud} or null.
     * @throws SQLException if an SQL error occurs.
     */
    protected List<GrabaenviobanInsSolicitud> readSolicitudes(final ResultSet resultSet)
        throws SQLException
    {
        if (resultSet == null)
            return null;
        try {
            // Obtain ordinal (index) numbers of result columns
            final int cNroInterno = resultSet.findColumn("NRO_INTERNO");
            final int cFechagrab = resultSet.findColumn("FECHAGRAB");

            // Convert result rows to an array of "GrabaenviobanInsSolicitud"
            final List<GrabaenviobanInsSolicitud> list = new ArrayList<>();
            while (resultSet.next()) {
                final GrabaenviobanInsSolicitud item = createSolicitud();
                item.setNroInterno(resultSet.getString(cNroInterno));
                item.setFechagrab(resultSet.getString(cFechagrab));
                if (filterSolicitud(item)) list.add(item);
            }
            return list;
        } finally {
            resultSet.close();
        }
    }

    /**
     * Creates and returns a new instance of {@code GrabaenviobanInsSolicitud}.
     * <p>
     * Can be overridden to return a subtype of {@code GrabaenviobanInsSolicitud}.
     *
     * @return a new {@code GrabaenviobanInsSolicitud} instance.
     */
    protected GrabaenviobanInsSolicitud createSolicitud()
    {
        return new GrabaenviobanInsSolicitud();
    }

    /**
     * Returns {@code true} if supplied item should be added to result set.
     * <p>
     * Can be overridden to select which items are added to the result set.
     *
     * @param  item the {@code GrabaenviobanInsSolicitud} to be checked.
     * @return {@code true} if {@code item} should be added to result set.
     * @throws NullPointerException if {@code item} is {@code null}.
     */
    protected boolean filterSolicitud(final GrabaenviobanInsSolicitud item)
    {
        return true;
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code SolicitudSencillo$GrabaEnvioBan_ins} using a data source.
     *
     * @param  dataSource the connection data source.
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
     * @throws SQLException if an SQL error occurs.
     */
    public static GrabaenviobanInsResult execute(final DataSource dataSource, String tipoTran, BigDecimal montoEfe, BigDecimal montoDoc, String codEmp, String detefectivo, String detdoctos, String sencillo, String usuario, String estacion, String codUsurecibe, String cierre, String tipoEnvio, String idBandejapos)
        throws SQLException
    {
        return new GrabaenviobanInsCaller().executeProc(dataSource, tipoTran, montoEfe, montoDoc, codEmp, detefectivo, detdoctos, sencillo, usuario, estacion, codUsurecibe, cierre, tipoEnvio, idBandejapos);
    }

    /**
     * Executes procedure {@code SolicitudSencillo$GrabaEnvioBan_ins} using a connection.
     *
     * @param  conn the database connection.
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
     * @throws SQLException if an SQL error occurs.
     */
    public static GrabaenviobanInsResult execute(final Connection conn, String tipoTran, BigDecimal montoEfe, BigDecimal montoDoc, String codEmp, String detefectivo, String detdoctos, String sencillo, String usuario, String estacion, String codUsurecibe, String cierre, String tipoEnvio, String idBandejapos)
        throws SQLException
    {
        return new GrabaenviobanInsCaller().executeProc(conn, tipoTran, montoEfe, montoDoc, codEmp, detefectivo, detdoctos, sencillo, usuario, estacion, codUsurecibe, cierre, tipoEnvio, idBandejapos);
    }
}