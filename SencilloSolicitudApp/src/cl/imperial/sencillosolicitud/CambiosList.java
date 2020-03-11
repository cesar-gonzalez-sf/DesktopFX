/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.sencillosolicitud;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Cesar Gonzalez
 */
public class CambiosList
{
    private final StringProperty codigo;
    private final StringProperty glosa;
    private final StringProperty valor;
    private final StringProperty cantidad;
    private final StringProperty valorT;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    public CambiosList()
    {
        codigo        =   new SimpleStringProperty   (this, "codigo"    , null);
        glosa         =   new SimpleStringProperty   (this, "glosa"     , null);
        valor         =   new SimpleStringProperty   (this, "valor"     , null);
        cantidad      =   new SimpleStringProperty   (this, "cantidad"  , null);
        valorT        =   new SimpleStringProperty   (this, "valorT"    , null);
    }


    //--------------------------------------------------------------------------
    //-- denominacion Methods --------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "codigo" property.
     *
     * @return the "codigo" property.
     */
    public final StringProperty codigoProperty()
    {
        return codigo;
    }

    /**
     * Returns the value of the "codigo" property.
     *
     * @return the current value of the property.
     */
    public final String getcodigo()
    {
        return codigoProperty().get();
    }

    /**
     * Changes the value of the "codigo" property.
     *
     * @param integer the new value of the property.
     */
    public final void setcodigo(final String value)
    {
        codigoProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- glosa Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "glosa" property.
     *
     * @return the "glosa" property.
     */
    public final StringProperty glosaProperty()
    {
        return glosa;
    }

    /**
     * Returns the value of the "glosa" property.
     *
     * @return the current value of the property.
     */
    public final String getglosa()
    {
        return glosaProperty().get();
    }

    /**
     * Changes the value of the "glosa" property.
     *
     * @param integer the new value of the property.
     */
    public final void setglosa(final String value)
    {
        glosaProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- valor Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "valor" property.
     *
     * @return the "valor" property.
     */
    public final StringProperty valorProperty()
    {
        return valor;
    }

    /**
     * Returns the value of the "valor" property.
     *
     * @return the current value of the property.
     */
    public final String getvalor()
    {
        return valorProperty().get();
    }

    /**
     * Changes the value of the "valor" property.
     *
     * @param Value the new value of the property.
     */
    public final void setvalor(final String value)
    {
        valorProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- cantidad Property Methods ---------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "cantidad" property.
     *
     * @return the "cantidad" property.
     */
    public final StringProperty cantidadProperty()
    {
        return cantidad;
    }

    /**
     * Returns the value of the "cantidad" property.
     *
     * @return the current value of the property.
     */
    public final String getcantidad()
    {
        return cantidadProperty().get();
    }

    /**
     * Changes the value of the "cantidad" property.
     *
     * @param Value the new value of the property.
     */
    public final void setcantidad(final String value)
    {
        cantidadProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- valorT Property Methods -----------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "valorT" property.
     *
     * @return the "valorT" property.
     */
    public final StringProperty valorTProperty()
    {
        return valorT;
    }

    /**
     * Returns the value of the "valorT" property.
     *
     * @return the current value of the property.
     */
    public final String getvalorT()
    {
        return valorTProperty().get();
    }

    /**
     * Changes the value of the "valorT" property.
     *
     * @param Value the new value of the property.
     */
    public final void setvalorT(final String value)
    {
        valorTProperty().set(value);
    }
}
