
package cl.imperial.cajaunificada.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 *
 */
@WebFault(name = "faultinfo", targetNamespace = "http://ws.cajaunificada.imperial.cl/cajaunificada")
public class CajaUnificadaWebException
    extends Exception
{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private final WebFaultInfo faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public CajaUnificadaWebException(final String message, final WebFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public CajaUnificadaWebException(final String message, final WebFaultInfo faultInfo, final Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: cl.imperial.cajaunificada.ws.WebFaultInfo
     */
    public WebFaultInfo getFaultInfo() {
        return faultInfo;
    }

}