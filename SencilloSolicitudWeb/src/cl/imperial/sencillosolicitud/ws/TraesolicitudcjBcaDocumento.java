/*
 * Source: TraesolicitudcjBcaDocumento.java - Generated by OBCOM SQL Wizard 1.158
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
 * Row of result set {@code DOCUMENTO} of procedure {@code SolicitudSencillo$TraeSolicitudCJ_bca}.
 *
 * <pre>
 * #ResultSet DOCUMENTO DOCUMENTOS
 *   #Column  NRO_INTERNO       NVARCHAR
 *   #Column  TIPO_TRANSACCION  NVARCHAR
 *   #Column  TIPO_DOCUMENTO    NVARCHAR
 *   #Column  ID_DOCUMENTO      NVARCHAR
 *   #Column  MONTO             NVARCHAR
 *   #Column  NUMERO            NVARCHAR
 *   #Column  CUENTA            NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "traesolicitudcjBcaDocumento")
@XmlType(name = "TraesolicitudcjBcaDocumento")
public class TraesolicitudcjBcaDocumento implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String nroInterno;
    private String tipoTransaccion;
    private String tipoDocumento;
    private String idDocumento;
    private String monto;
    private String numero;
    private String cuenta;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code TraesolicitudcjBcaDocumento} instance.
     */
    public TraesolicitudcjBcaDocumento()
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
}