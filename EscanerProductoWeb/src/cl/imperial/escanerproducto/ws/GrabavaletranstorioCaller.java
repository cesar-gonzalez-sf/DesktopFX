/*
 * Source: GrabavaletranstorioCaller.java - Generated by OBCOM SQL Wizard 1.160
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

package cl.imperial.escanerproducto.ws;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import javax.sql.DataSource;

/**
 * Caller of procedure {@code Escaner$GrabaValeTranstorio}.
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
public class GrabavaletranstorioCaller extends ProcedureCaller
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code GrabavaletranstorioCaller} instance.
     */
    public GrabavaletranstorioCaller()
    {
    }

    //--------------------------------------------------------------------------
    //-- Execute Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code Escaner$GrabaValeTranstorio} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  vxmlproductos {@code vXmlProductos varchar}.
     * @param  vcodEmp {@code vCod_Emp varchar(20)}.
     * @param  vusuario {@code vUsuario varchar(50)}.
     * @param  vtipodoc {@code vTipoDoc varchar(3)}.
     * @param  vcodEntidad {@code vCod_Entidad varchar(40)}.
     * @param  vcodSucursal {@code vCod_Sucursal varchar(3)}.
     * @param  vcodLista {@code vCod_Lista varchar(3)}.
     * @param  vestacion {@code vEstacion varchar(30)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public GrabavaletranstorioResult executeProc(final DataSource dataSource, String vxmlproductos, String vcodEmp, String vusuario, String vtipodoc, String vcodEntidad, String vcodSucursal, String vcodLista, String vestacion)
        throws SQLException
    {
        try (final Connection conn = dataSource.getConnection()) {
            return executeProc(conn, vxmlproductos, vcodEmp, vusuario, vtipodoc, vcodEntidad, vcodSucursal, vcodLista, vestacion);
        }
    }

    /**
     * Executes procedure {@code Escaner$GrabaValeTranstorio} using a connection.
     *
     * @param  conn the database connection.
     * @param  vxmlproductos {@code vXmlProductos varchar}.
     * @param  vcodEmp {@code vCod_Emp varchar(20)}.
     * @param  vusuario {@code vUsuario varchar(50)}.
     * @param  vtipodoc {@code vTipoDoc varchar(3)}.
     * @param  vcodEntidad {@code vCod_Entidad varchar(40)}.
     * @param  vcodSucursal {@code vCod_Sucursal varchar(3)}.
     * @param  vcodLista {@code vCod_Lista varchar(3)}.
     * @param  vestacion {@code vEstacion varchar(30)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public GrabavaletranstorioResult executeProc(final Connection conn, String vxmlproductos, String vcodEmp, String vusuario, String vtipodoc, String vcodEntidad, String vcodSucursal, String vcodLista, String vestacion)
        throws SQLException
    {
        final GrabavaletranstorioResult result = createProcResult();
        try (final CallableStatement call = prepareCall(conn, "{call Escaner$GrabaValeTranstorio(?,?,?,?,?,?,?,?,?,?)}")) {
            call.setString(1, vxmlproductos);
            call.setString(2, vcodEmp);
            call.setString(3, vusuario);
            call.setString(4, vtipodoc);
            call.setString(5, vcodEntidad);
            call.setString(6, vcodSucursal);
            call.setString(7, vcodLista);
            call.setString(8, vestacion);
            call.registerOutParameter(9, Types.INTEGER);
            call.registerOutParameter(10, Types.VARCHAR);
            call.execute();
            result.setNroInterno(objectToInteger(call.getObject(9)));
            result.setErrorMessage(call.getString(10));
        }
        return result;
    }

    /**
     * Creates and returns a new instance of {@code GrabavaletranstorioResult}.
     * <p>
     * Can be overridden to return a subtype of {@code GrabavaletranstorioResult}.
     *
     * @return a new {@code GrabavaletranstorioResult} instance.
     */
    protected GrabavaletranstorioResult createProcResult()
    {
        return new GrabavaletranstorioResult();
    }

    //--------------------------------------------------------------------------
    //-- Static Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Executes procedure {@code Escaner$GrabaValeTranstorio} using a data source.
     *
     * @param  dataSource the connection data source.
     * @param  vxmlproductos {@code vXmlProductos varchar}.
     * @param  vcodEmp {@code vCod_Emp varchar(20)}.
     * @param  vusuario {@code vUsuario varchar(50)}.
     * @param  vtipodoc {@code vTipoDoc varchar(3)}.
     * @param  vcodEntidad {@code vCod_Entidad varchar(40)}.
     * @param  vcodSucursal {@code vCod_Sucursal varchar(3)}.
     * @param  vcodLista {@code vCod_Lista varchar(3)}.
     * @param  vestacion {@code vEstacion varchar(30)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static GrabavaletranstorioResult execute(final DataSource dataSource, String vxmlproductos, String vcodEmp, String vusuario, String vtipodoc, String vcodEntidad, String vcodSucursal, String vcodLista, String vestacion)
        throws SQLException
    {
        return new GrabavaletranstorioCaller().executeProc(dataSource, vxmlproductos, vcodEmp, vusuario, vtipodoc, vcodEntidad, vcodSucursal, vcodLista, vestacion);
    }

    /**
     * Executes procedure {@code Escaner$GrabaValeTranstorio} using a connection.
     *
     * @param  conn the database connection.
     * @param  vxmlproductos {@code vXmlProductos varchar}.
     * @param  vcodEmp {@code vCod_Emp varchar(20)}.
     * @param  vusuario {@code vUsuario varchar(50)}.
     * @param  vtipodoc {@code vTipoDoc varchar(3)}.
     * @param  vcodEntidad {@code vCod_Entidad varchar(40)}.
     * @param  vcodSucursal {@code vCod_Sucursal varchar(3)}.
     * @param  vcodLista {@code vCod_Lista varchar(3)}.
     * @param  vestacion {@code vEstacion varchar(30)}.
     * @return the output parameters and result sets of the procedure.
     * @throws SQLException if an SQL error occurs.
     */
    public static GrabavaletranstorioResult execute(final Connection conn, String vxmlproductos, String vcodEmp, String vusuario, String vtipodoc, String vcodEntidad, String vcodSucursal, String vcodLista, String vestacion)
        throws SQLException
    {
        return new GrabavaletranstorioCaller().executeProc(conn, vxmlproductos, vcodEmp, vusuario, vtipodoc, vcodEntidad, vcodSucursal, vcodLista, vestacion);
    }
}