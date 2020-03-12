
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TraelecturascanProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TraelecturascanProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantidadEmbalaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRapido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUnimed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descuento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioBruto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraelecturascanProducto", propOrder = {
    "cantidad",
    "cantidadEmbalaje",
    "codProducto",
    "codRapido",
    "codUnimed",
    "code",
    "descripcion",
    "descuento",
    "precioBruto",
    "tipo"
})
public class TraelecturascanProducto {

    protected String cantidad;
    protected String cantidadEmbalaje;
    protected String codProducto;
    protected String codRapido;
    protected String codUnimed;
    protected String code;
    protected String descripcion;
    protected String descuento;
    protected String precioBruto;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadEmbalaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadEmbalaje() {
        return cantidadEmbalaje;
    }

    /**
     * Define el valor de la propiedad cantidadEmbalaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadEmbalaje(String value) {
        this.cantidadEmbalaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProducto() {
        return codProducto;
    }

    /**
     * Define el valor de la propiedad codProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProducto(String value) {
        this.codProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad codRapido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRapido() {
        return codRapido;
    }

    /**
     * Define el valor de la propiedad codRapido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRapido(String value) {
        this.codRapido = value;
    }

    /**
     * Obtiene el valor de la propiedad codUnimed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUnimed() {
        return codUnimed;
    }

    /**
     * Define el valor de la propiedad codUnimed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUnimed(String value) {
        this.codUnimed = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescuento(String value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad precioBruto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioBruto() {
        return precioBruto;
    }

    /**
     * Define el valor de la propiedad precioBruto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioBruto(String value) {
        this.precioBruto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
