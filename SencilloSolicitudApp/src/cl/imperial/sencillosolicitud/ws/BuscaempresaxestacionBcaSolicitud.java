
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaempresaxestacionBcaSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaempresaxestacionBcaSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ajustesencillo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaventa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonsocialSii" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipofacEcodespacho" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipofacEcoretiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaempresaxestacionBcaSolicitud", propOrder = {
    "ajustesencillo",
    "bodega",
    "codEmp",
    "codRegion",
    "descripcion",
    "estacion",
    "listaventa",
    "nomEmp",
    "razonsocialSii",
    "tipoestacion",
    "tipofacEcodespacho",
    "tipofacEcoretiro"
})
public class BuscaempresaxestacionBcaSolicitud {

    protected String ajustesencillo;
    protected String bodega;
    protected String codEmp;
    protected String codRegion;
    protected String descripcion;
    protected String estacion;
    protected String listaventa;
    protected String nomEmp;
    protected String razonsocialSii;
    protected String tipoestacion;
    protected String tipofacEcodespacho;
    protected String tipofacEcoretiro;

    /**
     * Obtiene el valor de la propiedad ajustesencillo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAjustesencillo() {
        return ajustesencillo;
    }

    /**
     * Define el valor de la propiedad ajustesencillo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAjustesencillo(String value) {
        this.ajustesencillo = value;
    }

    /**
     * Obtiene el valor de la propiedad bodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodega() {
        return bodega;
    }

    /**
     * Define el valor de la propiedad bodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodega(String value) {
        this.bodega = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmp() {
        return codEmp;
    }

    /**
     * Define el valor de la propiedad codEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmp(String value) {
        this.codEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad codRegion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegion() {
        return codRegion;
    }

    /**
     * Define el valor de la propiedad codRegion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegion(String value) {
        this.codRegion = value;
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
     * Obtiene el valor de la propiedad estacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacion() {
        return estacion;
    }

    /**
     * Define el valor de la propiedad estacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacion(String value) {
        this.estacion = value;
    }

    /**
     * Obtiene el valor de la propiedad listaventa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaventa() {
        return listaventa;
    }

    /**
     * Define el valor de la propiedad listaventa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaventa(String value) {
        this.listaventa = value;
    }

    /**
     * Obtiene el valor de la propiedad nomEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEmp() {
        return nomEmp;
    }

    /**
     * Define el valor de la propiedad nomEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEmp(String value) {
        this.nomEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad razonsocialSii.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonsocialSii() {
        return razonsocialSii;
    }

    /**
     * Define el valor de la propiedad razonsocialSii.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonsocialSii(String value) {
        this.razonsocialSii = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoestacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoestacion() {
        return tipoestacion;
    }

    /**
     * Define el valor de la propiedad tipoestacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoestacion(String value) {
        this.tipoestacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipofacEcodespacho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipofacEcodespacho() {
        return tipofacEcodespacho;
    }

    /**
     * Define el valor de la propiedad tipofacEcodespacho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipofacEcodespacho(String value) {
        this.tipofacEcodespacho = value;
    }

    /**
     * Obtiene el valor de la propiedad tipofacEcoretiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipofacEcoretiro() {
        return tipofacEcoretiro;
    }

    /**
     * Define el valor de la propiedad tipofacEcoretiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipofacEcoretiro(String value) {
        this.tipofacEcoretiro = value;
    }

}
