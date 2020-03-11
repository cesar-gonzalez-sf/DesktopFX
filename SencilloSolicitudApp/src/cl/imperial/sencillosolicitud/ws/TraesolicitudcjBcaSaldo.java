
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TraesolicitudcjBcaSaldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TraesolicitudcjBcaSaldo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="saldocmr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraesolicitudcjBcaSaldo", propOrder = {
    "saldocmr"
})
public class TraesolicitudcjBcaSaldo {

    protected String saldocmr;

    /**
     * Obtiene el valor de la propiedad saldocmr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldocmr() {
        return saldocmr;
    }

    /**
     * Define el valor de la propiedad saldocmr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldocmr(String value) {
        this.saldocmr = value;
    }

}
