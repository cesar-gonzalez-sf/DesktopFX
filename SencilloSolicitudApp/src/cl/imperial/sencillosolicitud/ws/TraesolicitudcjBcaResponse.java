
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traesolicitudcjBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traesolicitudcjBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}traesolicitudcjBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traesolicitudcjBcaResponse", propOrder = {
    "traesolicitudcjBcaResult"
})
public class TraesolicitudcjBcaResponse {

    protected TraesolicitudcjBcaResult traesolicitudcjBcaResult;

    /**
     * Obtiene el valor de la propiedad traesolicitudcjBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link TraesolicitudcjBcaResult }
     *     
     */
    public TraesolicitudcjBcaResult getTraesolicitudcjBcaResult() {
        return traesolicitudcjBcaResult;
    }

    /**
     * Define el valor de la propiedad traesolicitudcjBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TraesolicitudcjBcaResult }
     *     
     */
    public void setTraesolicitudcjBcaResult(TraesolicitudcjBcaResult value) {
        this.traesolicitudcjBcaResult = value;
    }

}
