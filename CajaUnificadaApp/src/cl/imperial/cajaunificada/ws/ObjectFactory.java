
package cl.imperial.cajaunificada.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.imperial.cajaunificada.ws package. 
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

    private final static QName _Faultinfo_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "faultinfo");
    private final static QName _RegistraPago_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "registraPago");
    private final static QName _RegistraPagoDetalle_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "registraPagoDetalle");
    private final static QName _RegistraPagoResponse_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "registraPagoResponse");
    private final static QName _RegistraPagoResult_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "registraPagoResult");
    private final static QName _Startup_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "startup");
    private final static QName _StartupPropiedad_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "startupPropiedad");
    private final static QName _StartupResponse_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "startupResponse");
    private final static QName _StartupResult_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "startupResult");
    private final static QName _ValeGet_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "valeGet");
    private final static QName _ValeGetResponse_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "valeGetResponse");
    private final static QName _ValeGetResult_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "valeGetResult");
    private final static QName _WebFaultInfo_QNAME = new QName("http://ws.cajaunificada.imperial.cl/cajaunificada", "webFaultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.imperial.cajaunificada.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebFaultInfo }
     * 
     */
    public WebFaultInfo createWebFaultInfo() {
        return new WebFaultInfo();
    }

    /**
     * Create an instance of {@link RegistraPago }
     * 
     */
    public RegistraPago createRegistraPago() {
        return new RegistraPago();
    }

    /**
     * Create an instance of {@link RegistraPagoDetalle }
     * 
     */
    public RegistraPagoDetalle createRegistraPagoDetalle() {
        return new RegistraPagoDetalle();
    }

    /**
     * Create an instance of {@link RegistraPagoResponse }
     * 
     */
    public RegistraPagoResponse createRegistraPagoResponse() {
        return new RegistraPagoResponse();
    }

    /**
     * Create an instance of {@link RegistraPagoResult }
     * 
     */
    public RegistraPagoResult createRegistraPagoResult() {
        return new RegistraPagoResult();
    }

    /**
     * Create an instance of {@link Startup }
     * 
     */
    public Startup createStartup() {
        return new Startup();
    }

    /**
     * Create an instance of {@link StartupPropiedad }
     * 
     */
    public StartupPropiedad createStartupPropiedad() {
        return new StartupPropiedad();
    }

    /**
     * Create an instance of {@link StartupResponse }
     * 
     */
    public StartupResponse createStartupResponse() {
        return new StartupResponse();
    }

    /**
     * Create an instance of {@link StartupResult }
     * 
     */
    public StartupResult createStartupResult() {
        return new StartupResult();
    }

    /**
     * Create an instance of {@link ValeGet }
     * 
     */
    public ValeGet createValeGet() {
        return new ValeGet();
    }

    /**
     * Create an instance of {@link ValeGetResponse }
     * 
     */
    public ValeGetResponse createValeGetResponse() {
        return new ValeGetResponse();
    }

    /**
     * Create an instance of {@link ValeGetResult }
     * 
     */
    public ValeGetResult createValeGetResult() {
        return new ValeGetResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "faultinfo")
    public JAXBElement<WebFaultInfo> createFaultinfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_Faultinfo_QNAME, WebFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistraPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "registraPago")
    public JAXBElement<RegistraPago> createRegistraPago(RegistraPago value) {
        return new JAXBElement<RegistraPago>(_RegistraPago_QNAME, RegistraPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPagoDetalle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistraPagoDetalle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "registraPagoDetalle")
    public JAXBElement<RegistraPagoDetalle> createRegistraPagoDetalle(RegistraPagoDetalle value) {
        return new JAXBElement<RegistraPagoDetalle>(_RegistraPagoDetalle_QNAME, RegistraPagoDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistraPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "registraPagoResponse")
    public JAXBElement<RegistraPagoResponse> createRegistraPagoResponse(RegistraPagoResponse value) {
        return new JAXBElement<RegistraPagoResponse>(_RegistraPagoResponse_QNAME, RegistraPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPagoResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistraPagoResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "registraPagoResult")
    public JAXBElement<RegistraPagoResult> createRegistraPagoResult(RegistraPagoResult value) {
        return new JAXBElement<RegistraPagoResult>(_RegistraPagoResult_QNAME, RegistraPagoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Startup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Startup }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "startup")
    public JAXBElement<Startup> createStartup(Startup value) {
        return new JAXBElement<Startup>(_Startup_QNAME, Startup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartupPropiedad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartupPropiedad }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "startupPropiedad")
    public JAXBElement<StartupPropiedad> createStartupPropiedad(StartupPropiedad value) {
        return new JAXBElement<StartupPropiedad>(_StartupPropiedad_QNAME, StartupPropiedad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartupResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "startupResponse")
    public JAXBElement<StartupResponse> createStartupResponse(StartupResponse value) {
        return new JAXBElement<StartupResponse>(_StartupResponse_QNAME, StartupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartupResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartupResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "startupResult")
    public JAXBElement<StartupResult> createStartupResult(StartupResult value) {
        return new JAXBElement<StartupResult>(_StartupResult_QNAME, StartupResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValeGet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValeGet }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "valeGet")
    public JAXBElement<ValeGet> createValeGet(ValeGet value) {
        return new JAXBElement<ValeGet>(_ValeGet_QNAME, ValeGet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValeGetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValeGetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "valeGetResponse")
    public JAXBElement<ValeGetResponse> createValeGetResponse(ValeGetResponse value) {
        return new JAXBElement<ValeGetResponse>(_ValeGetResponse_QNAME, ValeGetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValeGetResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValeGetResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "valeGetResult")
    public JAXBElement<ValeGetResult> createValeGetResult(ValeGetResult value) {
        return new JAXBElement<ValeGetResult>(_ValeGetResult_QNAME, ValeGetResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.cajaunificada.imperial.cl/cajaunificada", name = "webFaultInfo")
    public JAXBElement<WebFaultInfo> createWebFaultInfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_WebFaultInfo_QNAME, WebFaultInfo.class, null, value);
    }

}
