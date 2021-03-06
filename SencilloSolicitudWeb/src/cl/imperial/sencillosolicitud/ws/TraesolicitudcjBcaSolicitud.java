/*
 * Source: TraesolicitudcjBcaSolicitud.java - Generated by OBCOM SQL Wizard 1.158
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
 * Row of result set {@code SOLICITUD} of procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca}.
 *
 * <pre>
 * #ResultSet SOLICITUD SOLICITUDES
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
 *   #Column  NOM_EMP           NVARCHAR
 *   #Column  CODIGO_DEN        NVARCHAR
 *   #Column  CANTIDAD_DEN      NVARCHAR
 *   #Column  TIPO_DOCUMENTO    NVARCHAR
 *   #Column  ID_DOCUMENTO      NVARCHAR
 *   #Column  MONTO             NVARCHAR
 *   #Column  NUMERO            NVARCHAR
 *   #Column  CUENTA            NVARCHAR
 *   #Column  SALDOCMR          NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "traesolicitudcjBcaSolicitud")
@XmlType(name = "TraesolicitudcjBcaSolicitud")
public class TraesolicitudcjBcaSolicitud implements Serializable
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
    private String nomEmp;
    private String codigoDen;
    private String cantidadDen;
    private String tipoDocumento;
    private String idDocumento;
    private String monto;
    private String numero;
    private String cuenta;
    private String saldocmr;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code TraesolicitudcjBcaSolicitud} instance.
     */
    public TraesolicitudcjBcaSolicitud()
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

    /**
     * Returns the value of property {@code nomEmp}.
     *
     * @return the current value of the property.
     */
    public String getNomEmp()
    {
        return nomEmp;
    }

    /**
     * Changes the value of property {@code nomEmp}.
     *
     * @param value the new value of the property.
     */
    public void setNomEmp(final String value)
    {
        this.nomEmp = value;
    }

    /**
     * Returns the value of property {@code codigoDen}.
     *
     * @return the current value of the property.
     */
    public String getCodigoDen()
    {
        return codigoDen;
    }

    /**
     * Changes the value of property {@code codigoDen}.
     *
     * @param value the new value of the property.
     */
    public void setCodigoDen(final String value)
    {
        this.codigoDen = value;
    }

    /**
     * Returns the value of property {@code cantidadDen}.
     *
     * @return the current value of the property.
     */
    public String getCantidadDen()
    {
        return cantidadDen;
    }

    /**
     * Changes the value of property {@code cantidadDen}.
     *
     * @param value the new value of the property.
     */
    public void setCantidadDen(final String value)
    {
        this.cantidadDen = value;
    }

    /**
     * Returns the value of property {@code tipoDocumento}.
     *
     * @return the current value of the property.
     */
    public String getTipoDocumento()
    {
        return tipoDocumento;
    }

    /**
     * Changes the value of property {@code tipoDocumento}.
     *
     * @param value the new value of the property.
     */
    public void setTipoDocumento(final String value)
    {
        this.tipoDocumento = value;
    }

    /**
     * Returns the value of property {@code idDocumento}.
     *
     * @return the current value of the property.
     */
    public String getIdDocumento()
    {
        return idDocumento;
    }

    /**
     * Changes the value of property {@code idDocumento}.
     *
     * @param value the new value of the property.
     */
    public void setIdDocumento(final String value)
    {
        this.idDocumento = value;
    }

    /**
     * Returns the value of property {@code monto}.
     *
     * @return the current value of the property.
     */
    public String getMonto()
    {
        return monto;
    }

    /**
     * Changes the value of property {@code monto}.
     *
     * @param value the new value of the property.
     */
    public void setMonto(final String value)
    {
        this.monto = value;
    }

    /**
     * Returns the value of property {@code numero}.
     *
     * @return the current value of the property.
     */
    public String getNumero()
    {
        return numero;
    }

    /**
     * Changes the value of property {@code numero}.
     *
     * @param value the new value of the property.
     */
    public void setNumero(final String value)
    {
        this.numero = value;
    }

    /**
     * Returns the value of property {@code cuenta}.
     *
     * @return the current value of the property.
     */
    public String getCuenta()
    {
        return cuenta;
    }

    /**
     * Changes the value of property {@code cuenta}.
     *
     * @param value the new value of the property.
     */
    public void setCuenta(final String value)
    {
        this.cuenta = value;
    }

    /**
     * Returns the value of property {@code saldocmr}.
     *
     * @return the current value of the property.
     */
    public String getSaldocmr()
    {
        return saldocmr;
    }

    /**
     * Changes the value of property {@code saldocmr}.
     *
     * @param value the new value of the property.
     */
    public void setSaldocmr(final String value)
    {
        this.saldocmr = value;
    }
}
