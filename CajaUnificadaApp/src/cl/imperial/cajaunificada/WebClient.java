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

//import static cl.imperial.cajaunificada.util.Convert.splitRut;
//import static cl.imperial.cajaunificada.util.Convert.trimOrNull;
import java.math.BigDecimal;
import cl.imperial.cajaunificada.ws.CajaUnificadaWeb;
import cl.imperial.cajaunificada.ws.CajaUnificadaWebException;
import cl.imperial.cajaunificada.ws.CajaUnificadaWebService;
import cl.imperial.cajaunificada.ws.StartupResult;
import cl.obcom.desktopfx.core.DesktopStation;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.DesktopUser;
import cl.obcom.desktopfx.jfx.Dialog;

/**
 * Implements the AutoAtencion WebService Client.
 *
 * @author Eduardo Ostertag
 */
public final class WebClient
{
    private final CajaUnificadaWeb webPort;
    private final Main main;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code WebClient} instance.
     *
     * @param  main the plugin main instance.
     * @param  task the desktop task instance.
     * @param  offline {@code true} if offline (debug mode).
     * @throws NullPointerException if an argument is {@code null}.
     * @throws Exception if an unexpected error occurs.
     */
    public WebClient(final Main main, final DesktopTask task, final boolean offline)
        throws Exception
    {
        // Check supplied arguments
        if (main == null)
            throw new NullPointerException("main is null");
        if (task == null)
            throw new NullPointerException("desktop task is null");

        // Save supplied arguments
        this.main = main;


        // Create and initialize WebService Port
        final CajaUnificadaWebService service = new CajaUnificadaWebService();
        webPort = service.getCajaUnificadaWebPort();
        task.initWebServicePort(webPort, service, task.getCodeBase());

    }

    //--------------------------------------------------------------------------
    //-- Startup Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the startup parameters for specified desktop user.
     *
     * @param  task the desktop task instance.
     * @return the startup parameters for specified desktop task.
     * @throws NullPointerException if {@code task} is {@code null}.
     * @throws AutoAtencionWebException if a WebService error occurs.
     */
    public StartupParams startup(final DesktopTask task)
        throws CajaUnificadaWebException
    {
            // Check supplied arguments
            if (task == null)
                throw new NullPointerException("task user is null");

            // Obtain the startup parameters
            final StartupParams startupParams;

                // Obtain desktop user code and profile
            final DesktopUser desktopUser = task.getUser();
            final String userCode = desktopUser.getCode();
            final int profileCode = desktopUser.getProfileCode();
            final BigDecimal profCode = new BigDecimal(profileCode);

            // Obtain the desktop station name
            final DesktopStation desktopStation = task.getStation();
            final String stationName = desktopStation.getName();

            try{
                // Call "startup" with user, profile and station
                final StartupResult result = webPort.
                    startup(userCode, profCode, stationName);

                // Create StartupParams using StartupResult
                startupParams = new StartupParams(result);

                // Return startup params
                return startupParams;

            }catch (final Throwable thrown){

                final StartupParams Params = new StartupParams();
                Dialog.showError(this, thrown);
                return Params;
            }

    }

}
