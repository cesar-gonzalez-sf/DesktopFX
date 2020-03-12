
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.imperial.escanerproducto.ws package. 
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

    private final static QName _Faultinfo_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "faultinfo");
    private final static QName _Grabavaletranstorio_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "grabavaletranstorio");
    private final static QName _GrabavaletranstorioResponse_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "grabavaletranstorioResponse");
    private final static QName _GrabavaletranstorioResult_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "grabavaletranstorioResult");
    private final static QName _Traelecturascan_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "traelecturascan");
    private final static QName _TraelecturascanProducto_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "traelecturascanProducto");
    private final static QName _TraelecturascanResponse_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "traelecturascanResponse");
    private final static QName _TraelecturascanResult_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "traelecturascanResult");
    private final static QName _WebFaultInfo_QNAME = new QName("http://ws.escanerproducto.imperial.cl/escanerproducto", "webFaultInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.imperial.escanerproducto.ws
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
     * Create an instance of {@link Grabavaletranstorio }
     * 
     */
    public Grabavaletranstorio createGrabavaletranstorio() {
        return new Grabavaletranstorio();
    }

    /**
     * Create an instance of {@link GrabavaletranstorioResponse }
     * 
     */
    public GrabavaletranstorioResponse createGrabavaletranstorioResponse() {
        return new GrabavaletranstorioResponse();
    }

    /**
     * Create an instance of {@link GrabavaletranstorioResult }
     * 
     */
    public GrabavaletranstorioResult createGrabavaletranstorioResult() {
        return new GrabavaletranstorioResult();
    }

    /**
     * Create an instance of {@link Traelecturascan }
     * 
     */
    public Traelecturascan createTraelecturascan() {
        return new Traelecturascan();
    }

    /**
     * Create an instance of {@link TraelecturascanProducto }
     * 
     */
    public TraelecturascanProducto createTraelecturascanProducto() {
        return new TraelecturascanProducto();
    }

    /**
     * Create an instance of {@link TraelecturascanResponse }
     * 
     */
    public TraelecturascanResponse createTraelecturascanResponse() {
        return new TraelecturascanResponse();
    }

    /**
     * Create an instance of {@link TraelecturascanResult }
     * 
     */
    public TraelecturascanResult createTraelecturascanResult() {
        return new TraelecturascanResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "faultinfo")
    public JAXBElement<WebFaultInfo> createFaultinfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_Faultinfo_QNAME, WebFaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grabavaletranstorio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Grabavaletranstorio }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "grabavaletranstorio")
    public JAXBElement<Grabavaletranstorio> createGrabavaletranstorio(Grabavaletranstorio value) {
        return new JAXBElement<Grabavaletranstorio>(_Grabavaletranstorio_QNAME, Grabavaletranstorio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabavaletranstorioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrabavaletranstorioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "grabavaletranstorioResponse")
    public JAXBElement<GrabavaletranstorioResponse> createGrabavaletranstorioResponse(GrabavaletranstorioResponse value) {
        return new JAXBElement<GrabavaletranstorioResponse>(_GrabavaletranstorioResponse_QNAME, GrabavaletranstorioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrabavaletranstorioResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrabavaletranstorioResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "grabavaletranstorioResult")
    public JAXBElement<GrabavaletranstorioResult> createGrabavaletranstorioResult(GrabavaletranstorioResult value) {
        return new JAXBElement<GrabavaletranstorioResult>(_GrabavaletranstorioResult_QNAME, GrabavaletranstorioResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Traelecturascan }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Traelecturascan }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "traelecturascan")
    public JAXBElement<Traelecturascan> createTraelecturascan(Traelecturascan value) {
        return new JAXBElement<Traelecturascan>(_Traelecturascan_QNAME, Traelecturascan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraelecturascanProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraelecturascanProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "traelecturascanProducto")
    public JAXBElement<TraelecturascanProducto> createTraelecturascanProducto(TraelecturascanProducto value) {
        return new JAXBElement<TraelecturascanProducto>(_TraelecturascanProducto_QNAME, TraelecturascanProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraelecturascanResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraelecturascanResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "traelecturascanResponse")
    public JAXBElement<TraelecturascanResponse> createTraelecturascanResponse(TraelecturascanResponse value) {
        return new JAXBElement<TraelecturascanResponse>(_TraelecturascanResponse_QNAME, TraelecturascanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TraelecturascanResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TraelecturascanResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "traelecturascanResult")
    public JAXBElement<TraelecturascanResult> createTraelecturascanResult(TraelecturascanResult value) {
        return new JAXBElement<TraelecturascanResult>(_TraelecturascanResult_QNAME, TraelecturascanResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WebFaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.escanerproducto.imperial.cl/escanerproducto", name = "webFaultInfo")
    public JAXBElement<WebFaultInfo> createWebFaultInfo(WebFaultInfo value) {
        return new JAXBElement<WebFaultInfo>(_WebFaultInfo_QNAME, WebFaultInfo.class, null, value);
    }

}
