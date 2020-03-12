
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traelecturascan complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traelecturascan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vcodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vtipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodLista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vtipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traelecturascan", propOrder = {
    "vcodigo",
    "vtipo",
    "vcodLista",
    "vcodEmp",
    "vcodEntidad",
    "vcodSucursal",
    "vtipoDoc"
})
public class Traelecturascan {

    protected String vcodigo;
    protected String vtipo;
    protected String vcodLista;
    protected String vcodEmp;
    protected String vcodEntidad;
    protected String vcodSucursal;
    protected String vtipoDoc;

    /**
     * Obtiene el valor de la propiedad vcodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcodigo() {
        return vcodigo;
    }

    /**
     * Define el valor de la propiedad vcodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcodigo(String value) {
        this.vcodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad vtipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtipo() {
        return vtipo;
    }

    /**
     * Define el valor de la propiedad vtipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtipo(String value) {
        this.vtipo = value;
    }

    /**
     * Obtiene el valor de la propiedad vcodLista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcodLista() {
        return vcodLista;
    }

    /**
     * Define el valor de la propiedad vcodLista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcodLista(String value) {
        this.vcodLista = value;
    }

    /**
     * Obtiene el valor de la propiedad vcodEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcodEmp() {
        return vcodEmp;
    }

    /**
     * Define el valor de la propiedad vcodEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcodEmp(String value) {
        this.vcodEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad vcodEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcodEntidad() {
        return vcodEntidad;
    }

    /**
     * Define el valor de la propiedad vcodEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcodEntidad(String value) {
        this.vcodEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad vcodSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVcodSucursal() {
        return vcodSucursal;
    }

    /**
     * Define el valor de la propiedad vcodSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVcodSucursal(String value) {
        this.vcodSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad vtipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtipoDoc() {
        return vtipoDoc;
    }

    /**
     * Define el valor de la propiedad vtipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtipoDoc(String value) {
        this.vtipoDoc = value;
    }

}
