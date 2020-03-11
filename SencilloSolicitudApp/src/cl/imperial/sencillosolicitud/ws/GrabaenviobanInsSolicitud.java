
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GrabaenviobanInsSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GrabaenviobanInsSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechagrab" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrabaenviobanInsSolicitud", propOrder = {
    "fechagrab",
    "nroInterno"
})
public class GrabaenviobanInsSolicitud {

    protected String fechagrab;
    protected String nroInterno;

    /**
     * Obtiene el valor de la propiedad fechagrab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechagrab() {
        return fechagrab;
    }

    /**
     * Define el valor de la propiedad fechagrab.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechagrab(String value) {
        this.fechagrab = value;
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

}
