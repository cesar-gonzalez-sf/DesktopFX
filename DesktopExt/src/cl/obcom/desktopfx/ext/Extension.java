/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.obcom.desktopfx.ext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import cl.obcom.desktopfx.core.Desktop;
import cl.obcom.desktopfx.core.ExtensionBase;

/**
 * IMPERIAL DesktopFX Extension.
 *
 * @author Eduardo Ostertag
 */
public final class Extension extends ExtensionBase
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code Extension} instance.
     */
    public Extension()
    {
    }

    //--------------------------------------------------------------------------
    //-- Initialization Methods ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the DesktopFX initialization parameters. This method is called by
     * DesktopFX  at  the  beginning of the initialization process. The returned
     * parameters are used to create and initialize DesktopFX helpers.
     *
     * @return the DesktopFX initialization parameters.
     */
    @Override
    public Map<String,Object> getParameters()
    {
        // Create configuration parameters
        final Map<String,Object> params = new HashMap<>();

        // Parameters to configure generation of unique DesktopFX IDs
        params.put("desktopfx.unique.base.port", Integer.valueOf(59000));
        params.put("desktopfx.unique.max.count", Integer.valueOf(10));

        // Parameters to configure DesktopFX logging
        params.put("desktopfx.logging.root.level", "INFO");
        params.put("desktopfx.logging.console.level", "INFO");
        params.put("desktopfx.logging.file.level", "INFO");
        params.put("desktopfx.logging.file.count", Integer.valueOf(10));
        params.put("desktopfx.logging.file.limit", Integer.valueOf(512000));
        params.put("desktopfx.logging.file.append", Boolean.TRUE);
        params.put("desktopfx.logging.wservice.level", "OFF");

        // Enable DesktopFX offline database functionality
        params.put("desktopfx.offline.enable", Boolean.FALSE);

        // Parameters to configure DesktopFX WebService
        params.put("desktopfx.session.maintain", Boolean.FALSE);
        params.put("desktopfx.service.mtom", Boolean.FALSE);
        params.put("desktopfx.connect.timeout", Integer.valueOf(0));
        params.put("desktopfx.request.timeout", Integer.valueOf(0));
        params.put("desktopfx.http.encode.gzip", Boolean.FALSE);
        params.put("desktopfx.http.soap.headers", Boolean.FALSE);
        params.put("desktopfx.page.extension", ".jsp");
        params.put("desktopfx.secure.webservice", Boolean.FALSE);

        // Return unmodifiable config parameters
        return Collections.unmodifiableMap(params);
    }

    //--------------------------------------------------------------------------
    //-- Start/Stop Methods ----------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Called  after  DesktopFX  has  completed  the intialization process. This
     * method is a convenient place to create and initialize custom resources.
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     *
     * @param  desktop the fully initialized DesktopFX instance.
     * @throws NullPointerException if {@code desktop} is {@code null}.
     * @throws Exception if another error occurs.
     */
    @Override
    public void start(final Desktop desktop)
        throws Exception
    {
        // Convenient place to create and initialize custom resources.
    }

    /**
     * Called  before  DesktopFX  is  about to stop. This method is a convenient
     * place to destroy custom resources and prepare for exit.
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     *
     * @throws Exception if an error occurs.
     */
    @Override
    public void stop()
        throws Exception
    {
        // Convenient place to destroy custom resources and prepare for exit.
    }
}
