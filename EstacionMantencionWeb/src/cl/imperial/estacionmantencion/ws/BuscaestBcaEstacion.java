/*
 * Source: BuscaestBcaEstacion.java - Generated by OBCOM SQL Wizard 1.158
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

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Row of result set {@code ESTACION} of procedure {@code EstacionMantencion$BuscaEst_bca}.
 *
 * <pre>
 * #ResultSet ESTACION ESTACIONES
 *   #Column  ESTACION         NVARCHAR
 *   #Column  COD_EMP          NVARCHAR
 *   #Column  TIPOESTACION     NVARCHAR
 *   #Column  DESCRIPCION      NVARCHAR
 *   #Column  SUCURSAL_RANDOM  NVARCHAR
 *   #Column  ESTACION_RANDOM  NVARCHAR
 * #EndResultSet
 * </pre>
 *
 * @author Cesar Luis Gonzalez-Rubio Chacin (Imperial S.A.)
 */
@XmlRootElement(name = "buscaestBcaEstacion")
@XmlType(name = "BuscaestBcaEstacion")
public class BuscaestBcaEstacion implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String estacion;
    private String codEmp;
    private String tipoestacion;
    private String descripcion;
    private String sucursalRandom;
    private String estacionRandom;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code BuscaestBcaEstacion} instance.
     */
    public BuscaestBcaEstacion()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

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
     * Returns the value of property {@code tipoestacion}.
     *
     * @return the current value of the property.
     */
    public String getTipoestacion()
    {
        return tipoestacion;
    }

    /**
     * Changes the value of property {@code tipoestacion}.
     *
     * @param value the new value of the property.
     */
    public void setTipoestacion(final String value)
    {
        this.tipoestacion = value;
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
     * Returns the value of property {@code sucursalRandom}.
     *
     * @return the current value of the property.
     */
    public String getSucursalRandom()
    {
        return sucursalRandom;
    }

    /**
     * Changes the value of property {@code sucursalRandom}.
     *
     * @param value the new value of the property.
     */
    public void setSucursalRandom(final String value)
    {
        this.sucursalRandom = value;
    }

    /**
     * Returns the value of property {@code estacionRandom}.
     *
     * @return the current value of the property.
     */
    public String getEstacionRandom()
    {
        return estacionRandom;
    }

    /**
     * Changes the value of property {@code estacionRandom}.
     *
     * @param value the new value of the property.
     */
    public void setEstacionRandom(final String value)
    {
        this.estacionRandom = value;
    }
}
