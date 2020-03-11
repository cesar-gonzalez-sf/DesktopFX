/*
 * Source: RegistraPagoDetalle.java - Generated by OBCOM SQL Wizard 1.158
 * Author: Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 *
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 * 
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously authorized in writing by IMPERIAL S.A. In any event,  this  notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada.ws;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Row of result set {@code DETALLE} of procedure {@code CajaUnificada$Registra_Pago}.
 *
 * <pre>
 * #ResultSet DETALLE DETALLES
 *   #Column  COD_RAPIDO       INTEGER
 *   #Column  DESCRIPCION      NVARCHAR
 *   #Column  CANTIDAD         DECIMAL
 *   #Column  UNIDAD_MEDIDA    NVARCHAR
 *   #Column  PRECIO_UNITARIO  INTEGER
 *   #Column  TOTAL            DECIMAL
 * #EndResultSet
 * </pre>
 *
 * @author Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 */
@XmlRootElement(name = "registraPagoDetalle")
@XmlType(name = "RegistraPagoDetalle")
public class RegistraPagoDetalle implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int codRapido;
    private String descripcion;
    private BigDecimal cantidad;
    private String unidadMedida;
    private int precioUnitario;
    private BigDecimal total;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code RegistraPagoDetalle} instance.
     */
    public RegistraPagoDetalle()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of property {@code codRapido}.
     *
     * @return the current value of the property.
     */
    public int getCodRapido()
    {
        return codRapido;
    }

    /**
     * Changes the value of property {@code codRapido}.
     *
     * @param value the new value of the property.
     */
    public void setCodRapido(final int value)
    {
        this.codRapido = value;
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
     * Returns the value of property {@code cantidad}.
     *
     * @return the current value of the property.
     */
    public BigDecimal getCantidad()
    {
        return cantidad;
    }

    /**
     * Changes the value of property {@code cantidad}.
     *
     * @param value the new value of the property.
     */
    public void setCantidad(final BigDecimal value)
    {
        this.cantidad = value;
    }

    /**
     * Returns the value of property {@code unidadMedida}.
     *
     * @return the current value of the property.
     */
    public String getUnidadMedida()
    {
        return unidadMedida;
    }

    /**
     * Changes the value of property {@code unidadMedida}.
     *
     * @param value the new value of the property.
     */
    public void setUnidadMedida(final String value)
    {
        this.unidadMedida = value;
    }

    /**
     * Returns the value of property {@code precioUnitario}.
     *
     * @return the current value of the property.
     */
    public int getPrecioUnitario()
    {
        return precioUnitario;
    }

    /**
     * Changes the value of property {@code precioUnitario}.
     *
     * @param value the new value of the property.
     */
    public void setPrecioUnitario(final int value)
    {
        this.precioUnitario = value;
    }

    /**
     * Returns the value of property {@code total}.
     *
     * @return the current value of the property.
     */
    public BigDecimal getTotal()
    {
        return total;
    }

    /**
     * Changes the value of property {@code total}.
     *
     * @param value the new value of the property.
     */
    public void setTotal(final BigDecimal value)
    {
        this.total = value;
    }
}
