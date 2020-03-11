
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscabanusutieBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscabanusutieBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}buscabanusutieBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscabanusutieBcaResponse", propOrder = {
    "buscabanusutieBcaResult"
})
public class BuscabanusutieBcaResponse {

    protected BuscabanusutieBcaResult buscabanusutieBcaResult;

    /**
     * Obtiene el valor de la propiedad buscabanusutieBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscabanusutieBcaResult }
     *     
     */
    public BuscabanusutieBcaResult getBuscabanusutieBcaResult() {
        return buscabanusutieBcaResult;
    }

    /**
     * Define el valor de la propiedad buscabanusutieBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscabanusutieBcaResult }
     *     
     */
    public void setBuscabanusutieBcaResult(BuscabanusutieBcaResult value) {
        this.buscabanusutieBcaResult = value;
    }

}
