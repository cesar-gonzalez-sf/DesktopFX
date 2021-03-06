/*
 * Source: BuscausuariosvaBcaSolicitud.java - Generated by OBCOM SQL Wizard 1.158
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
 * Row of result set {@code SOLICITUD} of procedure {@code SolicitudSencillo$BuscaUsuariosVA_bca}.
 *
 * <pre>
 * #ResultSet SOLICITUD SOLICITUDES
 *   #Column  USU_CODIGO  NVARCHAR
 *   #Column  USUARIO     NVARCHAR
 *   #Column  EMAIL       NVARCHAR
 *   #Column  RUT         NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "buscausuariosvaBcaSolicitud")
@XmlType(name = "BuscausuariosvaBcaSolicitud")
public class BuscausuariosvaBcaSolicitud implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String usuCodigo;
    private String usuario;
    private String email;
    private String rut;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscausuariosvaBcaSolicitud} instance.
     */
    public BuscausuariosvaBcaSolicitud()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of property {@code usuCodigo}.
     *
     * @return the current value of the property.
     */
    public String getUsuCodigo()
    {
        return usuCodigo;
    }

    /**
     * Changes the value of property {@code usuCodigo}.
     *
     * @param value the new value of the property.
     */
    public void setUsuCodigo(final String value)
    {
        this.usuCodigo = value;
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
     * Returns the value of property {@code email}.
     *
     * @return the current value of the property.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Changes the value of property {@code email}.
     *
     * @param value the new value of the property.
     */
    public void setEmail(final String value)
    {
        this.email = value;
    }

    /**
     * Returns the value of property {@code rut}.
     *
     * @return the current value of the property.
     */
    public String getRut()
    {
        return rut;
    }

    /**
     * Changes the value of property {@code rut}.
     *
     * @param value the new value of the property.
     */
    public void setRut(final String value)
    {
        this.rut = value;
    }
}
