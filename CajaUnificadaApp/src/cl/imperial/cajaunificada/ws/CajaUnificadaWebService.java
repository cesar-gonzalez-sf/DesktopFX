
package cl.imperial.cajaunificada.ws;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CajaUnificadaWebService", targetNamespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", wsdlLocation = "CajaUnificadaWebService.wsdl")
public class CajaUnificadaWebService
    extends Service
{

    private final static URL CAJAUNIFICADAWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAJAUNIFICADAWEBSERVICE_EXCEPTION;
    private final static QName CAJAUNIFICADAWEBSERVICE_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "CajaUnificadaWebService");

    static {
        CAJAUNIFICADAWEBSERVICE_WSDL_LOCATION = cl.imperial.cajaunificada.ws.CajaUnificadaWebService.class.getResource("CajaUnificadaWebService.wsdl");
        WebServiceException e = null;
        if (CAJAUNIFICADAWEBSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'CajaUnificadaWebService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        CAJAUNIFICADAWEBSERVICE_EXCEPTION = e;
    }

    public CajaUnificadaWebService() {
        super(__getWsdlLocation(), CAJAUNIFICADAWEBSERVICE_QNAME);
    }

    public CajaUnificadaWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAJAUNIFICADAWEBSERVICE_QNAME, features);
    }

    public CajaUnificadaWebService(URL wsdlLocation) {
        super(wsdlLocation, CAJAUNIFICADAWEBSERVICE_QNAME);
    }

    public CajaUnificadaWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAJAUNIFICADAWEBSERVICE_QNAME, features);
    }

    public CajaUnificadaWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CajaUnificadaWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CajaUnificadaWeb
     */
    @WebEndpoint(name = "CajaUnificadaWebPort")
    public CajaUnificadaWeb getCajaUnificadaWebPort() {
        return super.getPort(new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "CajaUnificadaWebPort"), CajaUnificadaWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CajaUnificadaWeb
     */
    @WebEndpoint(name = "CajaUnificadaWebPort")
    public CajaUnificadaWeb getCajaUnificadaWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "CajaUnificadaWebPort"), CajaUnificadaWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAJAUNIFICADAWEBSERVICE_EXCEPTION!= null) {
            throw CAJAUNIFICADAWEBSERVICE_EXCEPTION;
        }
        return CAJAUNIFICADAWEBSERVICE_WSDL_LOCATION;
    }

}
