
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscausuariosvaBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscausuariosvaBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}buscausuariosvaBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscausuariosvaBcaResponse", propOrder = {
    "buscausuariosvaBcaResult"
})
public class BuscausuariosvaBcaResponse {

    protected BuscausuariosvaBcaResult buscausuariosvaBcaResult;

    /**
     * Obtiene el valor de la propiedad buscausuariosvaBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscausuariosvaBcaResult }
     *     
     */
    public BuscausuariosvaBcaResult getBuscausuariosvaBcaResult() {
        return buscausuariosvaBcaResult;
    }

    /**
     * Define el valor de la propiedad buscausuariosvaBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscausuariosvaBcaResult }
     *     
     */
    public void setBuscausuariosvaBcaResult(BuscausuariosvaBcaResult value) {
        this.buscausuariosvaBcaResult = value;
    }

}
