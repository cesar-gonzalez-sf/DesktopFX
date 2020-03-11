/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.estacionmantencion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Cesar Gonzalez
 */
public class EstacionesList
{
    private final StringProperty Estaciones;
    private final StringProperty Cod_Emp;
    private final StringProperty TipoEstaciones;
    private final StringProperty Descripcion;
    private final StringProperty Sucursal_Random;
    private final StringProperty Estaciones_Random;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code Cliente} instance.
     */
    public EstacionesList()
    {
        Estaciones          = new SimpleStringProperty(this, "Estaciones",       null);
        Cod_Emp             = new SimpleStringProperty(this, "Cod_Emp",          null);
        TipoEstaciones      = new SimpleStringProperty(this, "TipoEstaciones",   null);
        Descripcion         = new SimpleStringProperty(this, "Descripcion",      null);
        Sucursal_Random     = new SimpleStringProperty(this, "Sucursal_Random",  null);
        Estaciones_Random   = new SimpleStringProperty(this, "Estaciones_Random",null);
    }

    //--------------------------------------------------------------------------
    //-- Clear/Copy Methods ----------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Clear the values of all properties.
     */
    public void clear()
    {
        setEstaciones       (null);
        setCod_Emp          (null);
        setTipoEstaciones   (null);
        setDescripcion      (null);
        setSucursal_Random  (null);
        setEstaciones_Random(null);
    }

    /**
     * Copy all properties from source cliente to this cliente.
     *
     * @param  source the source cliente to be copied.
     * @throws NullPointerException if {@code source} is {@code null}.
     */
    public void copyFrom(final EstacionesList source)
    {
        setEstaciones       (source.getEstaciones());
        setCod_Emp          (source.getCod_Emp());
        setTipoEstaciones   (source.getTipoEstaciones());
        setDescripcion      (source.getDescripcion());
        setSucursal_Random  (source.getSucursal_Random());
        setEstaciones_Random(source.getEstaciones_Random());
    }

    //--------------------------------------------------------------------------
    //-- Estaciones Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "Estaciones" property.
     *
     * @return the "Estaciones" property.
     */
    public StringProperty EstacionesProperty()
    {
        return Estaciones;
    }

    /**
     * Returns the value of the "Estaciones" property.
     *
     * @return the current value of the property.
     */
    public String getEstaciones()
    {
        return Estaciones.get();
    }

    /**
     * Changes the value of the "Estaciones" property.
     *
     * @param value the new value of the property.
     */
    public void setEstaciones(final String value)
    {
        Estaciones.set(value);
    }

    //--------------------------------------------------------------------------
    //-- Cod_Emp Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "Cod_Emp" property.
     *
     * @return the "Cod_Emp" property.
     */
    public StringProperty Cod_EmpProperty()
    {
        return Cod_Emp;
    }

    /**
     * Returns the value of the "Cod_Emp" property.
     *
     * @return the current value of the property.
     */
    public String getCod_Emp()
    {
        return Cod_Emp.get();
    }

    /**
     * Changes the value of the "Cod_Emp" property.
     *
     * @param value the new value of the property.
     */
    public void setCod_Emp(final String value)
    {
        Cod_Emp.set(value);
    }

    //--------------------------------------------------------------------------
    //-- TipoEstaciones Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "TipoEstaciones" property.
     *
     * @return the "TipoEstaciones" property.
     */
    public StringProperty TipoEstacionesProperty()
    {
        return TipoEstaciones;
    }

    /**
     * Returns the value of the "TipoEstaciones" property.
     *
     * @return the current value of the property.
     */
    public String getTipoEstaciones()
    {
        return TipoEstaciones.get();
    }

    /**
     * Changes the value of the "TipoEstaciones" property.
     *
     * @param value the new value of the property.
     */
    public void setTipoEstaciones(final String value)
    {
        TipoEstaciones.set(value);
    }

    //--------------------------------------------------------------------------
    //-- Descripcion Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "Descripcion" property.
     *
     * @return the "Descripcion" property.
     */
    public StringProperty DescripcionProperty()
    {
        return Descripcion;
    }

    /**
     * Returns the value of the "Descripcion" property.
     *
     * @return the current value of the property.
     */
    public String getDescripcion()
    {
        return Descripcion.get();
    }

    /**
     * Changes the value of the "Descripcion" property.
     *
     * @param value the new value of the property.
     */
    public void setDescripcion(final String value)
    {
        Descripcion.set(value);
    }

    //--------------------------------------------------------------------------
    //-- Sucursal_Random Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "Sucursal_Random" property.
     *
     * @return the "Sucursal_Random" property.
     */
    public StringProperty Sucursal_RandomProperty()
    {
        return Sucursal_Random;
    }

    /**
     * Returns the value of the "Sucursal_Random" property.
     *
     * @return the current value of the property.
     */
    public String getSucursal_Random()
    {
        return Sucursal_Random.get();
    }

    /**
     * Changes the value of the "Sucursal_Random" property.
     *
     * @param value the new value of the property.
     */
    public void setSucursal_Random(final String value)
    {
        Sucursal_Random.set(value);
    }

    //--------------------------------------------------------------------------
    //-- Estaciones_Random Property Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "Estaciones_Random" property.
     *
     * @return the "Estaciones_Random" property.
     */
    public StringProperty Estaciones_RandomProperty()
    {
        return Estaciones_Random;
    }

    /**
     * Returns the value of the "Estaciones_Random" property.
     *
     * @return the current value of the property.
     */
    public String getEstaciones_Random()
    {
        return Estaciones_Random.get();
    }

    /**
     * Changes the value of the "Estaciones_Random" property.
     *
     * @param value the new value of the property.
     */
    public void setEstaciones_Random(final String value)
    {
        Estaciones_Random.set(value);
    }
}
