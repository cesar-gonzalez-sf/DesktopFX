
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TraesolicitudcjBcaEfectivo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TraesolicitudcjBcaEfectivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidadDen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoDen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraesolicitudcjBcaEfectivo", propOrder = {
    "cantidadDen",
    "codigoDen",
    "nroInterno",
    "tipoTransaccion"
})
public class TraesolicitudcjBcaEfectivo {

    protected String cantidadDen;
    protected String codigoDen;
    protected String nroInterno;
    protected String tipoTransaccion;

    /**
     * Obtiene el valor de la propiedad cantidadDen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidadDen() {
        return cantidadDen;
    }

    /**
     * Define el valor de la propiedad cantidadDen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidadDen(String value) {
        this.cantidadDen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDen() {
        return codigoDen;
    }

    /**
     * Define el valor de la propiedad codigoDen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDen(String value) {
        this.codigoDen = value;
    }

    /**
     * Obtiene el valor de la propiedad nroInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * Define el valor de la propiedad nroInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterno(String value) {
        this.nroInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccion(String value) {
        this.tipoTransaccion = value;
    }

}
