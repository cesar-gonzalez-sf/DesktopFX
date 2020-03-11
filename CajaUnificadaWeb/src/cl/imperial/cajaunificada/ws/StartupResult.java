/*
 * Source: StartupResult.java - Generated by OBCOM SQL Wizard 1.158
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

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Results of procedure {@code CajaUnificada$Startup}.
 *
 * <pre>
 * PROPIEDAD  ResultSet  Output
 * </pre>
 *
 * @author Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 */
@XmlRootElement(name = "startupResult")
@XmlType(name = "StartupResult")
public class StartupResult extends ProcedureResult
{
    private static final long serialVersionUID = 1L;
    private List<StartupPropiedad> propiedades;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code StartupResult} instance.
     */
    public StartupResult()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of property {@code propiedades}.
     *
     * @return the current value of the property.
     */
    public List<StartupPropiedad> getPropiedades()
    {
        return propiedades;
    }

    /**
     * Changes the value of property {@code propiedades}.
     *
     * @param value the new value of the property.
     */
    public void setPropiedades(final List<StartupPropiedad> value)
    {
        this.propiedades = value;
    }
}
