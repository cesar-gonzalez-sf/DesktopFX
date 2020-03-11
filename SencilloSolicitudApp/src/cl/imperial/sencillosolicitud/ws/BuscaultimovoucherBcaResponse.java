
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaultimovoucherBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaultimovoucherBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}buscaultimovoucherBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaultimovoucherBcaResponse", propOrder = {
    "buscaultimovoucherBcaResult"
})
public class BuscaultimovoucherBcaResponse {

    protected BuscaultimovoucherBcaResult buscaultimovoucherBcaResult;

    /**
     * Obtiene el valor de la propiedad buscaultimovoucherBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscaultimovoucherBcaResult }
     *     
     */
    public BuscaultimovoucherBcaResult getBuscaultimovoucherBcaResult() {
        return buscaultimovoucherBcaResult;
    }

    /**
     * Define el valor de la propiedad buscaultimovoucherBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscaultimovoucherBcaResult }
     *     
     */
    public void setBuscaultimovoucherBcaResult(BuscaultimovoucherBcaResult value) {
        this.buscaultimovoucherBcaResult = value;
    }

}
