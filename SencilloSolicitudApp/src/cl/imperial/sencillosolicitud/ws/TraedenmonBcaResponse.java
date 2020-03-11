
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traedenmonBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traedenmonBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}traedenmonBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traedenmonBcaResponse", propOrder = {
    "traedenmonBcaResult"
})
public class TraedenmonBcaResponse {

    protected TraedenmonBcaResult traedenmonBcaResult;

    /**
     * Obtiene el valor de la propiedad traedenmonBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link TraedenmonBcaResult }
     *     
     */
    public TraedenmonBcaResult getTraedenmonBcaResult() {
        return traedenmonBcaResult;
    }

    /**
     * Define el valor de la propiedad traedenmonBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TraedenmonBcaResult }
     *     
     */
    public void setTraedenmonBcaResult(TraedenmonBcaResult value) {
        this.traedenmonBcaResult = value;
    }

}
