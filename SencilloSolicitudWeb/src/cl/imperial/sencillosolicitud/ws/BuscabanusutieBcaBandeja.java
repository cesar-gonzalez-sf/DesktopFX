/*
 * Source: BuscabanusutieBcaBandeja.java - Generated by OBCOM SQL Wizard 1.158
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
 * Row of result set {@code BANDEJA} of procedure {@code SolicitudSencillo$BuscaBanUsuTie_bca}.
 *
 * <pre>
 * #ResultSet BANDEJA BANDEJAS
 *   #Column  IDENTIFICADOR  NVARCHAR
 *   #Column  DESCRIPCION    NVARCHAR
 *   #Column  ID_BANDEJAPOS  NVARCHAR
 *   #Column  DESESTADO      NVARCHAR
 *   #Column  ESTADO         NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "buscabanusutieBcaBandeja")
@XmlType(name = "BuscabanusutieBcaBandeja")
public class BuscabanusutieBcaBandeja implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String identificador;
    private String descripcion;
    private String idBandejapos;
    private String desestado;
    private String estado;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscabanusutieBcaBandeja} instance.
     */
    public BuscabanusutieBcaBandeja()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of property {@code identificador}.
     *
     * @return the current value of the property.
     */
    public String getIdentificador()
    {
        return identificador;
    }

    /**
     * Changes the value of property {@code identificador}.
     *
     * @param value the new value of the property.
     */
    public void setIdentificador(final String value)
    {
        this.identificador = value;
    }

    /**
     * Returns the value of property {@code descripcion}.
     *
     * @return the current value of the property.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * Changes the value of property {@code descripcion}.
     *
     * @param value the new value of the property.
     */
    public void setDescripcion(final String value)
    {
        this.descripcion = value;
    }

    /**
     * Returns the value of property {@code idBandejapos}.
     *
     * @return the current value of the property.
     */
    public String getIdBandejapos()
    {
        return idBandejapos;
    }

    /**
     * Changes the value of property {@code idBandejapos}.
     *
     * @param value the new value of the property.
     */
    public void setIdBandejapos(final String value)
    {
        this.idBandejapos = value;
    }

    /**
     * Returns the value of property {@code desestado}.
     *
     * @return the current value of the property.
     */
    public String getDesestado()
    {
        return desestado;
    }

    /**
     * Changes the value of property {@code desestado}.
     *
     * @param value the new value of the property.
     */
    public void setDesestado(final String value)
    {
        this.desestado = value;
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
}
