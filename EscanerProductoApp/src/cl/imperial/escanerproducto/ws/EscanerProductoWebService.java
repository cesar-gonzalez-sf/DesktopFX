
package cl.imperial.escanerproducto.ws;

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
@WebServiceClient(name = "EscanerProductoWebService", targetNamespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", wsdlLocation = "EscanerProductoWebService.wsdl")
public class EscanerProductoWebService
    extends Service
{

    private final static URL ESCANERPRODUCTOWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException ESCANERPRODUCTOWEBSERVICE_EXCEPTION;
    private final static QName ESCANERPRODUCTOWEBSERVICE_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "EscanerProductoWebService");

    static {
        ESCANERPRODUCTOWEBSERVICE_WSDL_LOCATION = cl.imperial.escanerproducto.ws.EscanerProductoWebService.class.getResource("EscanerProductoWebService.wsdl");
        WebServiceException e = null;
        if (ESCANERPRODUCTOWEBSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'EscanerProductoWebService.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        ESCANERPRODUCTOWEBSERVICE_EXCEPTION = e;
    }

    public EscanerProductoWebService() {
        super(__getWsdlLocation(), ESCANERPRODUCTOWEBSERVICE_QNAME);
    }

    public EscanerProductoWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ESCANERPRODUCTOWEBSERVICE_QNAME, features);
    }

    public EscanerProductoWebService(URL wsdlLocation) {
        super(wsdlLocation, ESCANERPRODUCTOWEBSERVICE_QNAME);
    }

    public EscanerProductoWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ESCANERPRODUCTOWEBSERVICE_QNAME, features);
    }

    public EscanerProductoWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EscanerProductoWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EscanerProductoWeb
     */
    @WebEndpoint(name = "EscanerProductoWebPort")
    public EscanerProductoWeb getEscanerProductoWebPort() {
        return super.getPort(new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "EscanerProductoWebPort"), EscanerProductoWeb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EscanerProductoWeb
     */
    @WebEndpoint(name = "EscanerProductoWebPort")
    public EscanerProductoWeb getEscanerProductoWebPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "EscanerProductoWebPort"), EscanerProductoWeb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ESCANERPRODUCTOWEBSERVICE_EXCEPTION!= null) {
            throw ESCANERPRODUCTOWEBSERVICE_EXCEPTION;
        }
        return ESCANERPRODUCTOWEBSERVICE_WSDL_LOCATION;
    }

}