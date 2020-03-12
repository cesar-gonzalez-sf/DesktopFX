
package cl.imperial.escanerproducto.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "faultinfo", targetNamespace = "http://ws.escanerproducto.imperial.cl/escanerproducto")
public class EscanerProductoWebException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WebFaultInfo faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public EscanerProductoWebException(String message, WebFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EscanerProductoWebException(String message, WebFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: cl.imperial.escanerproducto.ws.WebFaultInfo
     */
    public WebFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
