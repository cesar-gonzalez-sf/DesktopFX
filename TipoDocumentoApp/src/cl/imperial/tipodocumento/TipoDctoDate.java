/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.tipodocumento;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Parametros de envío para plugins EscanerProducto
 *
 * @author Cesar Gonzalez
 */
public final class TipoDctoDate
{
    private final StringProperty rut;
    private final StringProperty codEntidad;
    private final StringProperty cod_sucursal;
    private final StringProperty credito;
    private final StringProperty lista_precio;

    public TipoDctoDate() {
        rut             = new SimpleStringProperty(this, "rut", null);
        codEntidad      = new SimpleStringProperty(this, "codEntidad", null);
        cod_sucursal    = new SimpleStringProperty(this, "cod_sucursal", null);
        credito         = new SimpleStringProperty(this, "credito", null);
        lista_precio    = new SimpleStringProperty(this, "lista_precio", null);
    }

    /**
     * Clear the values of all properties.
     */
    public void clear()
    {
        setrut(null);
        setCodEntidad(null);
        setCodSucursal(null);
        setCredito(null);
        setlista_precio(null);
    }

    /**
     * Copy all properties from source cliente to this cliente.
     *
     * @param  source the source cliente to be copied.
     * @throws NullPointerException if {@code source} is {@code null}.
     */
    public void copyFrom(final TipoDctoDate source)
    {
        setrut(source.getRut());
        setCodEntidad(source.getCodEntidad());
        setCodSucursal(source.getCodSucursal());
        setCredito(source.getCredito());
        setlista_precio(source.getlista_precio());
    }

    //--------------------------------------------------------------------------
    //-- Rut Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Returns the value of the property {@code rut}.
     *
     * @return the current value of the property.
     */
    public StringProperty rutProperty()
    {
        return rut;
    }

    /**
     *
     * @return
     */
    public String getRut()
    {
        return rut.get();
    }

    /**
     * Changes the value of the property {@code rut}.
     *
     * @param cod the new value of the property.
     */
    public void setrut(final String rut)
    {
        this.rut.set(rut);
    }

    //--------------------------------------------------------------------------
    //-- CodEntidad Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Returns the value of the property {@code codEntidad}.
     *
     * @return the current value of the property.
     */
    public StringProperty codEntidadProperty()
    {
        return codEntidad;
    }

    /**
     *
     * @return
     */
    public String getCodEntidad()
    {
        return codEntidad.get();
    }

    /**
     * Changes the value of the property {@code codEntidad}.
     *
     * @param cod the new value of the property.
     */
    public void setCodEntidad(final String codEntidad)
    {
        this.codEntidad.set(codEntidad);
    }

    //--------------------------------------------------------------------------
    //-- CodSucursal Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Returns the value of the property {@code codSucursal}.
     *
     * @return the current value of the property.
     */
    public StringProperty codSucursalProperty()
    {
        return cod_sucursal;
    }

    /**
     *
     * @return
     */
    public String getCodSucursal()
    {
        return cod_sucursal.get();
    }

    /**
     * Changes the value of the property {@code codSucursal}.
     *
     * @param cod the new value of the property.
     */
    public void setCodSucursal(final String codSucursal)
    {
        this.cod_sucursal.set(codSucursal);
    }

    //--------------------------------------------------------------------------
    //-- Credito Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Returns the value of the property {@code codSucursal}.
     *
     * @return the current value of the property.
     */
    public StringProperty CreditoProperty()
    {
        return credito;
    }

    /**
     *
     * @return
     */
    public String getCredito()
    {
        return credito.get();
    }

    /**
     * Changes the value of the property {@code codSucursal}.
     *
     * @param cod the new value of the property.
     */
    public void setCredito(final String Credito)
    {
        this.credito.set(Credito);
    }

    //--------------------------------------------------------------------------
    //-- lista_precio Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Returns the value of the property {@code codSucursal}.
     *
     * @return the current value of the property.
     */
    public StringProperty lista_precioProperty()
    {
        return lista_precio;
    }

    /**
     *
     * @return
     */
    public String getlista_precio()
    {
        return lista_precio.get();
    }

    /**
     * Changes the value of the property {@code lista_precio}.
     *
     * @param cod the new value of the property.
     */
    public void setlista_precio(final String lista_precio)
    {
        this.lista_precio.set(lista_precio);
    }
}
