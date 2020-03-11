/*
 * Source: BuscaultimovoucherBcaVoucher.java - Generated by OBCOM SQL Wizard 1.158
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

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Row of result set {@code VOUCHER} of procedure {@code SolicitudSencillo$BuscaUltimoVoucher_bca}.
 *
 * <pre>
 * #ResultSet VOUCHER VOUCHERS
 *   #Column  NRO_INTERNO       NVARCHAR
 *   #Column  NRO_INTERNOPADRE  NVARCHAR
 *   #Column  TIPO_TRANSACCION  NVARCHAR
 *   #Column  COD_EMP           NVARCHAR
 *   #Column  FECHA             NVARCHAR
 *   #Column  MONTO_EFECTIVO    NVARCHAR
 *   #Column  MONTO_DOCUMENTOS  NVARCHAR
 *   #Column  USUARIO           NVARCHAR
 *   #Column  ESTACION          NVARCHAR
 *   #Column  ESTADO            NVARCHAR
 *   #Column  COD_USURECIBE     NVARCHAR
 *   #Column  CIERRE            NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "buscaultimovoucherBcaVoucher")
@XmlType(name = "BuscaultimovoucherBcaVoucher")
public class BuscaultimovoucherBcaVoucher implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String nroInterno;
    private String nroInternopadre;
    private String tipoTransaccion;
    private String codEmp;
    private String fecha;
    private String montoEfectivo;
    private String montoDocumentos;
    private String usuario;
    private String estacion;
    private String estado;
    private String codUsurecibe;
    private String cierre;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscaultimovoucherBcaVoucher} instance.
     */
    public BuscaultimovoucherBcaVoucher()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of property {@code nroInterno}.
     *
     * @return the current value of the property.
     */
    public String getNroInterno()
    {
        return nroInterno;
    }

    /**
     * Changes the value of property {@code nroInterno}.
     *
     * @param value the new value of the property.
     */
    public void setNroInterno(final String value)
    {
        this.nroInterno = value;
    }

    /**
     * Returns the value of property {@code nroInternopadre}.
     *
     * @return the current value of the property.
     */
    public String getNroInternopadre()
    {
        return nroInternopadre;
    }

    /**
     * Changes the value of property {@code nroInternopadre}.
     *
     * @param value the new value of the property.
     */
    public void setNroInternopadre(final String value)
    {
        this.nroInternopadre = value;
    }

    /**
     * Returns the value of property {@code tipoTransaccion}.
     *
     * @return the current value of the property.
     */
    public String getTipoTransaccion()
    {
        return tipoTransaccion;
    }

    /**
     * Changes the value of property {@code tipoTransaccion}.
     *
     * @param value the new value of the property.
     */
    public void setTipoTransaccion(final String value)
    {
        this.tipoTransaccion = value;
    }

    /**
     * Returns the value of property {@code codEmp}.
     *
     * @return the current value of the property.
     */
    public String getCodEmp()
    {
        return codEmp;
    }

    /**
     * Changes the value of property {@code codEmp}.
     *
     * @param value the new value of the property.
     */
    public void setCodEmp(final String value)
    {
        this.codEmp = value;
    }

    /**
     * Returns the value of property {@code fecha}.
     *
     * @return the current value of the property.
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * Changes the value of property {@code fecha}.
     *
     * @param value the new value of the property.
     */
    public void setFecha(final String value)
    {
        this.fecha = value;
    }

    /**
     * Returns the value of property {@code montoEfectivo}.
     *
     * @return the current value of the property.
     */
    public String getMontoEfectivo()
    {
        return montoEfectivo;
    }

    /**
     * Changes the value of property {@code montoEfectivo}.
     *
     * @param value the new value of the property.
     */
    public void setMontoEfectivo(final String value)
    {
        this.montoEfectivo = value;
    }

    /**
     * Returns the value of property {@code montoDocumentos}.
     *
     * @return the current value of the property.
     */
    public String getMontoDocumentos()
    {
        return montoDocumentos;
    }

    /**
     * Changes the value of property {@code montoDocumentos}.
     *
     * @param value the new value of the property.
     */
    public void setMontoDocumentos(final String value)
    {
        this.montoDocumentos = value;
    }

    /**
     * Returns the value of property {@code usuario}.
     *
     * @return the current value of the property.
     */
    public String getUsuario()
    {
        return usuario;
    }

    /**
     * Changes the value of property {@code usuario}.
     *
     * @param value the new value of the property.
     */
    public void setUsuario(final String value)
    {
        this.usuario = value;
    }

    /**
     * Returns the value of property {@code estacion}.
     *
     * @return the current value of the property.
     */
    public String getEstacion()
    {
        return estacion;
    }

    /**
     * Changes the value of property {@code estacion}.
     *
     * @param value the new value of the property.
     */
    public void setEstacion(final String value)
    {
        this.estacion = value;
    }

    /**
     * Returns the value of property {@code estado}.
     *
     * @return the current value of the property.
     */
    public String getEstado()
    {
        return estado;
    }

    /**
     * Changes the value of property {@code estado}.
     *
     * @param value the new value of the property.
     */
    public void setEstado(final String value)
    {
        this.estado = value;
    }

    /**
     * Returns the value of property {@code codUsurecibe}.
     *
     * @return the current value of the property.
     */
    public String getCodUsurecibe()
    {
        return codUsurecibe;
    }

    /**
     * Changes the value of property {@code codUsurecibe}.
     *
     * @param value the new value of the property.
     */
    public void setCodUsurecibe(final String value)
    {
        this.codUsurecibe = value;
    }

    /**
     * Returns the value of property {@code cierre}.
     *
     * @return the current value of the property.
     */
    public String getCierre()
    {
        return cierre;
    }

    /**
     * Changes the value of property {@code cierre}.
     *
     * @param value the new value of the property.
     */
    public void setCierre(final String value)
    {
        this.cierre = value;
    }
}