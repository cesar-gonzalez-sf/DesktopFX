
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabavaletranstorio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabavaletranstorio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vxmlproductos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vtipodoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vcodLista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabavaletranstorio", propOrder = {
    "vxmlproductos",
    "vcodEmp",
    "vusuario",
    "vtipodoc",
    "vcodEntidad",
    "vcodSucursal",
    "vcodLista",
    "vestacion"
})
public class Grabavaletranstorio {

    protected String vxmlproductos;
    protected String vcodEmp;
    protected String vusuario;
    protected String vtipodoc;
    protected String vcodEntidad;
    protected String vcodSucursal;
    protected String vcodLista;
    protected String vestacion;

    /**
     * Obtiene el valor de la propiedad vxmlproductos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVxmlproductos() {
        return vxmlproductos;
    }

    /**
     * Define el valor de la propiedad vxmlproductos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVxmlproductos(String value) {
        this.vxmlproductos = value;
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
     * Obtiene el valor de la propiedad vusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVusuario() {
        return vusuario;
    }

    /**
     * Define el valor de la propiedad vusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVusuario(String value) {
        this.vusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad vtipodoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtipodoc() {
        return vtipodoc;
    }

    /**
     * Define el valor de la propiedad vtipodoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtipodoc(String value) {
        this.vtipodoc = value;
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
     * Obtiene el valor de la propiedad vestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVestacion() {
        return vestacion;
    }

    /**
     * Define el valor de la propiedad vestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVestacion(String value) {
        this.vestacion = value;
    }

}
