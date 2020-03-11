
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaempresaxestacionBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaempresaxestacionBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}buscaempresaxestacionBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaempresaxestacionBcaResponse", propOrder = {
    "buscaempresaxestacionBcaResult"
})
public class BuscaempresaxestacionBcaResponse {

    protected BuscaempresaxestacionBcaResult buscaempresaxestacionBcaResult;

    /**
     * Obtiene el valor de la propiedad buscaempresaxestacionBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscaempresaxestacionBcaResult }
     *     
     */
    public BuscaempresaxestacionBcaResult getBuscaempresaxestacionBcaResult() {
        return buscaempresaxestacionBcaResult;
    }

    /**
     * Define el valor de la propiedad buscaempresaxestacionBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscaempresaxestacionBcaResult }
     *     
     */
    public void setBuscaempresaxestacionBcaResult(BuscaempresaxestacionBcaResult value) {
        this.buscaempresaxestacionBcaResult = value;
    }

}
