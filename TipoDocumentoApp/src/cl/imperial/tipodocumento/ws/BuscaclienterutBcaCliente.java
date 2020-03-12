
package cl.imperial.tipodocumento.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaclienterutBcaCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaclienterutBcaCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credAbiertoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dvCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaPrecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rutCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipopersonalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaclienterutBcaCliente", propOrder = {
    "cliCategoria",
    "cliente",
    "codEntidad",
    "codSucursal",
    "credAbiertoDoc",
    "credito",
    "dvCliente",
    "estado",
    "estadoCliente",
    "idCliente",
    "listaPrecio",
    "materno",
    "nombre",
    "paterno",
    "plazo",
    "rutCliente",
    "tipopersonalidad"
})
public class BuscaclienterutBcaCliente {

    protected String cliCategoria;
    protected String cliente;
    protected String codEntidad;
    protected String codSucursal;
    protected String credAbiertoDoc;
    protected String credito;
    protected String dvCliente;
    protected String estado;
    protected String estadoCliente;
    protected String idCliente;
    protected String listaPrecio;
    protected String materno;
    protected String nombre;
    protected String paterno;
    protected String plazo;
    protected String rutCliente;
    protected String tipopersonalidad;

    /**
     * Obtiene el valor de la propiedad cliCategoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliCategoria() {
        return cliCategoria;
    }

    /**
     * Define el valor de la propiedad cliCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliCategoria(String value) {
        this.cliCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidad() {
        return codEntidad;
    }

    /**
     * Define el valor de la propiedad codEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidad(String value) {
        this.codEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSucursal(String value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad credAbiertoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredAbiertoDoc() {
        return credAbiertoDoc;
    }

    /**
     * Define el valor de la propiedad credAbiertoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredAbiertoDoc(String value) {
        this.credAbiertoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad credito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredito() {
        return credito;
    }

    /**
     * Define el valor de la propiedad credito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredito(String value) {
        this.credito = value;
    }

    /**
     * Obtiene el valor de la propiedad dvCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvCliente() {
        return dvCliente;
    }

    /**
     * Define el valor de la propiedad dvCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvCliente(String value) {
        this.dvCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     * Define el valor de la propiedad estadoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCliente(String value) {
        this.estadoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad listaPrecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaPrecio() {
        return listaPrecio;
    }

    /**
     * Define el valor de la propiedad listaPrecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaPrecio(String value) {
        this.listaPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad materno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * Define el valor de la propiedad materno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterno(String value) {
        this.materno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad paterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * Define el valor de la propiedad paterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaterno(String value) {
        this.paterno = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazo(String value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad rutCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutCliente() {
        return rutCliente;
    }

    /**
     * Define el valor de la propiedad rutCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutCliente(String value) {
        this.rutCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipopersonalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipopersonalidad() {
        return tipopersonalidad;
    }

    /**
     * Define el valor de la propiedad tipopersonalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipopersonalidad(String value) {
        this.tipopersonalidad = value;
    }

}
