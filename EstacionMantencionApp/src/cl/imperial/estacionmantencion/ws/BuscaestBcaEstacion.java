
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaestBcaEstacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaestBcaEstacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estacionRandom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sucursalRandom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoestacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaestBcaEstacion", propOrder = {
    "codEmp",
    "descripcion",
    "estacion",
    "estacionRandom",
    "sucursalRandom",
    "tipoestacion"
})
public class BuscaestBcaEstacion {

    protected String codEmp;
    protected String descripcion;
    protected String estacion;
    protected String estacionRandom;
    protected String sucursalRandom;
    protected String tipoestacion;

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
     * Obtiene el valor de la propiedad estacionRandom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacionRandom() {
        return estacionRandom;
    }

    /**
     * Define el valor de la propiedad estacionRandom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacionRandom(String value) {
        this.estacionRandom = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursalRandom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucursalRandom() {
        return sucursalRandom;
    }

    /**
     * Define el valor de la propiedad sucursalRandom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucursalRandom(String value) {
        this.sucursalRandom = value;
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

}
