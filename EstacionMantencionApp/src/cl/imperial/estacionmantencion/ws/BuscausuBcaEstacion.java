
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscausuBcaEstacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscausuBcaEstacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidoMat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscausuBcaEstacion", propOrder = {
    "apellidoMat",
    "apellidoPat",
    "ciudad",
    "comuna",
    "nombres",
    "pais",
    "usuCodigo"
})
public class BuscausuBcaEstacion {

    protected String apellidoMat;
    protected String apellidoPat;
    protected String ciudad;
    protected String comuna;
    protected String nombres;
    protected String pais;
    protected String usuCodigo;

    /**
     * Obtiene el valor de la propiedad apellidoMat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMat() {
        return apellidoMat;
    }

    /**
     * Define el valor de la propiedad apellidoMat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMat(String value) {
        this.apellidoMat = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPat() {
        return apellidoPat;
    }

    /**
     * Define el valor de la propiedad apellidoPat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPat(String value) {
        this.apellidoPat = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad comuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuna(String value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad usuCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuCodigo() {
        return usuCodigo;
    }

    /**
     * Define el valor de la propiedad usuCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuCodigo(String value) {
        this.usuCodigo = value;
    }

}
