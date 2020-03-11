/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada;

import java.util.List;
import cl.imperial.cajaunificada.ws.StartupPropiedad;
import cl.imperial.cajaunificada.ws.StartupResult;
import cl.obcom.desktopfx.jfx.Dialog;

/**
 * Provides the values of the application startup properties.
 *
 * @author Nicolas Uribe
 */
public final class StartupParams
{
    private String codEmp;
    private String idBandejaPos;
    private String nombreBandeja;
    private String sucursal;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code StartupParams} instance.
     */
    StartupParams()
    {
        codEmp = "FERRE";
        idBandejaPos = "";
        nombreBandeja = "";
        sucursal = "";

    }

    /**
     * Constructs a new {@code StartupParams} instance.
     *
     * @param  startup the startup web service parameters (can be null).
     * @throws NullPointerException if {@code startup} is {@code null}.
     * @throws NumberFormatException if a numeric value is invalid.
     */
    StartupParams(final StartupResult startup)
    {
     // Initialize default values
        this();
        try {
            // Done if returned startup properties is null or empty
            final List<StartupPropiedad> props = startup.getPropiedades();
            if (props == null || props.isEmpty()) return;

            // Store the database startup properties
            for (final StartupPropiedad prop : props) {
                String name = prop.getNombre();
                String value = prop.getValor();
                if (name != null && value != null) {
                    name = name.trim().toUpperCase();
                    value = value.trim();
                    switch (name) {
                    case "COD_EMP":
                        codEmp = value;
                        break;
                    case "ID_BANDEJA":
                        idBandejaPos = value;
                        break;
                    case "NOMBRE_BANDEJA":
                        nombreBandeja = value;
                        break;
                    case "SUCURSAL":
                        sucursal = value;
                        break;
                    //default:
                    //    Main.logger.warning("Unknown startup property: " + name);
                    }
                }
            }
        }catch(final Throwable thrown){
            Dialog.showError(this, thrown);
        }
    }

    //--------------------------------------------------------------------------
    //-- Getter Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the value of the property {@code codEmp}.
     *
     * @return the current value of the property.
     */
    public String getCodEmp()
    {
        return codEmp;
    }

    /**
     * Returns the value of the property {@code codEmp}.
     *
     * @return the current value of the property.
     */
    public String getIdBandejaPos()
    {
        return idBandejaPos;
    }

    /**
     * Returns the value of the property {@code nombreBandeja}.
     *
     * @return the current value of the property.
     */
    public String getNombreBandeja()
    {
        return nombreBandeja;
    }

    /**
     * Changes the value of the property {@code nombreBandeja}.
     *
     * @param nombreBandeja the new value of the property.
     */
    public void setNombreBandeja(final String nombreBandeja)
    {
        this.nombreBandeja = nombreBandeja;
    }

    /**
     * Returns the value of the property {@code sucursal}.
     *
     * @return the current value of the property.
     */
    public String getSucursal()
    {
        return sucursal;
    }

    /**
     * Changes the value of the property {@code sucursal}.
     *
     * @param sucursal the new value of the property.
     */
    public void setSucursal(final String sucursal)
    {
        this.sucursal = sucursal;
    }

}
