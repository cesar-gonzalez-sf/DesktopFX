/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.escanerproducto;

import java.util.Iterator;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Cesar Gonzalez
 */
public class ProductosList
{
    private final StringProperty COD_RAPIDO;
    private final StringProperty COD_PRODUCTO;
    private final StringProperty DESCRIPCION;
    private final StringProperty PRECIO_BRUTO;
    private final StringProperty CANTIDAD_EMBALAJE;
    private final StringProperty COD_UNIMED;
    private final StringProperty CANTIDAD;
    private final StringProperty TIPO;
    private final StringProperty DESCUENTO;
    private final StringProperty TOTAL;
    private final StringProperty CODE;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    public ProductosList()
    {
        COD_RAPIDO          =   new SimpleStringProperty   (this, "COD_RAPIDO"          , null);
        COD_PRODUCTO        =   new SimpleStringProperty   (this, "COD_PRODUCTO"        , null);
        DESCRIPCION         =   new SimpleStringProperty   (this, "DESCRIPCION"         , null);
        PRECIO_BRUTO        =   new SimpleStringProperty   (this, "PRECIO_BRUTO"        , null);
        CANTIDAD_EMBALAJE   =   new SimpleStringProperty   (this, "CANTIDAD_EMBALAJE"   , null);
        COD_UNIMED          =   new SimpleStringProperty   (this, "COD_UNIMED"          , null);
        CANTIDAD            =   new SimpleStringProperty   (this, "CANTIDAD"            , null);
        TIPO                =   new SimpleStringProperty   (this, "TIPO"                , null);
        DESCUENTO           =   new SimpleStringProperty   (this, "CANTIDAD"            , null);
        TOTAL               =   new SimpleStringProperty   (this, "TOTAL"               , null);
        CODE                =   new SimpleStringProperty   (this, "CODE"                , null);
    }

    //--------------------------------------------------------------------------
    //-- COD_RAPIDO Property Methods --------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "COD_RAPIDO" property.
     *
     * @return the "COD_RAPIDO" property.
     */
    public final StringProperty COD_RAPIDOProperty()
    {
        return COD_RAPIDO;
    }

    /**
     * Returns the value of the "COD_RAPIDO" property.
     *
     * @return the current value of the property.
     */
    public final String getCOD_RAPIDO()
    {
        return COD_RAPIDOProperty().get();
    }

    /**
     * Changes the value of the "COD_RAPIDO" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCOD_RAPIDO(final String value)
    {
        COD_RAPIDOProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- COD_PRODUCTO Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "COD_PRODUCTO" property.
     *
     * @return the "COD_PRODUCTO" property.
     */
    public final StringProperty COD_PRODUCTOProperty()
    {
        return COD_PRODUCTO;
    }

    /**
     * Returns the value of the "COD_PRODUCTO" property.
     *
     * @return the current value of the property.
     */
    public final String getCOD_PRODUCTO()
    {
        return COD_PRODUCTOProperty().get();
    }

    /**
     * Changes the value of the "COD_PRODUCTO" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCOD_PRODUCTO(final String value)
    {
        COD_PRODUCTOProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- DESCRIPCION Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "DESCRIPCION" property.
     *
     * @return the "DESCRIPCION" property.
     */
    public final StringProperty DESCRIPCIONProperty()
    {
        return DESCRIPCION;
    }

    /**
     * Returns the value of the "DESCRIPCION" property.
     *
     * @return the current value of the property.
     */
    public final String getDESCRIPCION()
    {
        return DESCRIPCIONProperty().get();
    }

    /**
     * Changes the value of the "DESCRIPCION" property.
     *
     * @param integer the new value of the property.
     */
    public final void setDESCRIPCION(final String value)
    {
        DESCRIPCIONProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- PRECIO_BRUTO Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "PRECIO_BRUTO" property.
     *
     * @return the "PRECIO_BRUTO" property.
     */
    public final StringProperty PRECIO_BRUTOProperty()
    {
        return PRECIO_BRUTO;
    }

    /**
     * Returns the value of the "PRECIO_BRUTO" property.
     *
     * @return the current value of the property.
     */
    public final String getPRECIO_BRUTO()
    {
        return PRECIO_BRUTOProperty().get();
    }

    /**
     * Changes the value of the "PRECIO_BRUTO" property.
     *
     * @param integer the new value of the property.
     */
    public final void setPRECIO_BRUTO(final String value)
    {
        PRECIO_BRUTOProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- CANTIDAD_EMBALAJE Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "CANTIDAD_EMBALAJE" property.
     *
     * @return the "CANTIDAD_EMBALAJE" property.
     */
    public final StringProperty CANTIDAD_EMBALAJEProperty()
    {
        return CANTIDAD_EMBALAJE;
    }

    /**
     * Returns the value of the "CANTIDAD_EMBALAJE" property.
     *
     * @return the current value of the property.
     */
    public final String getCANTIDAD_EMBALAJE()
    {
        return CANTIDAD_EMBALAJEProperty().get();
    }

    /**
     * Changes the value of the "CANTIDAD_EMBALAJE" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCANTIDAD_EMBALAJE(final String value)
    {
        CANTIDAD_EMBALAJEProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- COD_UNIMED Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "COD_UNIMED" property.
     *
     * @return the "COD_UNIMED" property.
     */
    public final StringProperty COD_UNIMEDProperty()
    {
        return COD_UNIMED;
    }

    /**
     * Returns the value of the "COD_UNIMED" property.
     *
     * @return the current value of the property.
     */
    public final String getCOD_UNIMED()
    {
        return COD_UNIMEDProperty().get();
    }

    /**
     * Changes the value of the "COD_UNIMED" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCOD_UNIMED(final String value)
    {
        COD_UNIMEDProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- CANTIDAD Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "CANTIDAD" property.
     *
     * @return the "CANTIDAD" property.
     */
    public final StringProperty CANTIDADProperty()
    {
        return CANTIDAD;
    }

    /**
     * Returns the value of the "CANTIDAD" property.
     *
     * @return the current value of the property.
     */
    public final String getCANTIDAD()
    {
        return CANTIDADProperty().get();
    }

    /**
     * Changes the value of the "CANTIDAD" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCANTIDAD(final String value)
    {
        CANTIDADProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- TIPO Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "TIPO" property.
     *
     * @return the "TIPO" property.
     */
    public final StringProperty TIPOProperty()
    {
        return TIPO;
    }

    /**
     * Returns the value of the "TIPO" property.
     *
     * @return the current value of the property.
     */
    public final String getTIPO()
    {
        return TIPOProperty().get();
    }

    /**
     * Changes the value of the "TIPO" property.
     *
     * @param integer the new value of the property.
     */
    public final void setTIPO(final String value)
    {
        TIPOProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- DESCUENTO Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "DESCUENTO" property.
     *
     * @return the "DESCUENTO" property.
     */
    public final StringProperty DESCUENTOProperty()
    {
        return DESCUENTO;
    }

    /**
     * Returns the value of the "DESCUENTO" property.
     *
     * @return the current value of the property.
     */
    public final String getDESCUENTO()
    {
        return DESCUENTOProperty().get();
    }

    /**
     * Changes the value of the "DESCUENTO" property.
     *
     * @param integer the new value of the property.
     */
    public final void setDESCUENTO(final String value)
    {
        DESCUENTOProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- TOTAL Property Methods --------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "TOTAL" property.
     *
     * @return the "TOTAL" property.
     */
    public final StringProperty TOTALProperty()
    {
        return TOTAL;
    }

    /**
     * Returns the value of the "TOTAL" property.
     *
     * @return the current value of the property.
     */
    public final String getTOTAL()
    {
        return TOTALProperty().get();
    }

    /**
     * Changes the value of the "TOTAL" property.
     *
     * @param integer the new value of the property.
     */
    public final void setTOTAL(final String value)
    {
        TOTALProperty().set(value);
    }

    //--------------------------------------------------------------------------
    //-- CODE Property Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the "DESCUENTO" property.
     *
     * @return the "DESCUENTO" property.
     */
    public final StringProperty CODEProperty()
    {
        return CODE;
    }

    /**
     * Returns the value of the "CODE" property.
     *
     * @return the current value of the property.
     */
    public final String getCODE()
    {
        return CODEProperty().get();
    }

    /**
     * Changes the value of the "CODE" property.
     *
     * @param integer the new value of the property.
     */
    public final void setCODE(final String value)
    {
        CODEProperty().set(value);
    }

    /**
     * @return
     */
    public static boolean isEmpty()
    {
        if (ProductosList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return
     */
    public static Iterator<ProductosList> iterator()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
