
package cl.imperial.autorizadorventa.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.imperial.autorizadorventa.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscaclienterutBca_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "buscaclienterutBca");
    private final static QName _BuscaclienterutBcaCliente_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "buscaclienterutBcaCliente");
    private final static QName _BuscaclienterutBcaResponse_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "buscaclienterutBcaResponse");
    private final static QName _BuscaclienterutBcaResult_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "buscaclienterutBcaResult");
    private final static QName _Faultinfo_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "faultinfo");
    private final static QName _WebFaultInfo_QNAME = new QName("http://ws.autorizadorventa.imperial.cl/autorizadorventa", "webFaultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.imperial.autorizadorventa.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscaclienterutBca }
     * 
     */
    public BuscaclienterutBca createBuscaclienterutBca() {
        return new BuscaclienterutBca();
    }

    /**
     * Create an instance of {@link BuscaclienterutBcaCliente }
     * 
     */
    public BuscaclienterutBcaCliente createBuscaclienterutBcaCliente() {
        return new BuscaclienterutBcaCliente();
    }

    /**
     * Create an instance of {@link BuscaclienterutBcaResponse }
     * 
     */
    public BuscaclienterutBcaResponse createBuscaclienterutBcaResponse() {
        return new BuscaclienterutBcaResponse();
    }

    /**
     * Create an instance of {@link BuscaclienterutBcaResult }
     * 
     */
    public BuscaclienterutBcaResult createBuscaclienterutBcaResult() {
        return new BuscaclienterutBcaResult();
    }

    /**
     * Create an instance of {@link WebFaultInfo }
     * 
     */
    public WebFaultInfo createWebFaultInfo() {
        return new WebFaultInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBca }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBca }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "buscaclienterutBca")
    public JAXBElement<BuscaclienterutBca> createBuscaclienterutBca(BuscaclienterutBca value) {
        return new JAXBElement<BuscaclienterutBca>(_BuscaclienterutBca_QNAME, BuscaclienterutBca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "buscaclienterutBcaCliente")
    public JAXBElement<BuscaclienterutBcaCliente> createBuscaclienterutBcaCliente(BuscaclienterutBcaCliente value) {
        return new JAXBElement<BuscaclienterutBcaCliente>(_BuscaclienterutBcaCliente_QNAME, BuscaclienterutBcaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "buscaclienterutBcaResponse")
    public JAXBElement<BuscaclienterutBcaResponse> createBuscaclienterutBcaResponse(BuscaclienterutBcaResponse value) {
        return new JAXBElement<BuscaclienterutBcaResponse>(_BuscaclienterutBcaResponse_QNAME, BuscaclienterutBcaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscaclienterutBcaResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "buscaclienterutBcaResult")
    public JAXBElement<BuscaclienterutBcaResult> createBuscaclienterutBcaResult(BuscaclienterutBcaResult value) {
        return new JAXBElement<BuscaclienterutBcaResult>(_BuscaclienterutBcaResult_QNAME, BuscaclienterutBcaResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "faultinfo")
    public JAXBElement<WebFaultInfo> createFaultinfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_Faultinfo_QNAME, WebFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.autorizadorventa.imperial.cl/autorizadorventa", name = "webFaultInfo")
    public JAXBElement<WebFaultInfo> createWebFaultInfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_WebFaultInfo_QNAME, WebFaultInfo.class, null, value);
    }

}
