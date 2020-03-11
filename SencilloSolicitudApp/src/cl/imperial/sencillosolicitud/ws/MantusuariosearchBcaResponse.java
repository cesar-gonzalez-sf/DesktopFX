
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mantusuariosearchBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mantusuariosearchBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}mantusuariosearchBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mantusuariosearchBcaResponse", propOrder = {
    "mantusuariosearchBcaResult"
})
public class MantusuariosearchBcaResponse {

    protected MantusuariosearchBcaResult mantusuariosearchBcaResult;

    /**
     * Obtiene el valor de la propiedad mantusuariosearchBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link MantusuariosearchBcaResult }
     *     
     */
    public MantusuariosearchBcaResult getMantusuariosearchBcaResult() {
        return mantusuariosearchBcaResult;
    }

    /**
     * Define el valor de la propiedad mantusuariosearchBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link MantusuariosearchBcaResult }
     *     
     */
    public void setMantusuariosearchBcaResult(MantusuariosearchBcaResult value) {
        this.mantusuariosearchBcaResult = value;
    }

}
