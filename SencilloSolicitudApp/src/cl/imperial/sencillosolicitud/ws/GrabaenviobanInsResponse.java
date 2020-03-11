
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabaenviobanInsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabaenviobanInsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}grabaenviobanInsResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabaenviobanInsResponse", propOrder = {
    "grabaenviobanInsResult"
})
public class GrabaenviobanInsResponse {

    protected GrabaenviobanInsResult grabaenviobanInsResult;

    /**
     * Obtiene el valor de la propiedad grabaenviobanInsResult.
     * 
     * @return
     *     possible object is
     *     {@link GrabaenviobanInsResult }
     *     
     */
    public GrabaenviobanInsResult getGrabaenviobanInsResult() {
        return grabaenviobanInsResult;
    }

    /**
     * Define el valor de la propiedad grabaenviobanInsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link GrabaenviobanInsResult }
     *     
     */
    public void setGrabaenviobanInsResult(GrabaenviobanInsResult value) {
        this.grabaenviobanInsResult = value;
    }

}
