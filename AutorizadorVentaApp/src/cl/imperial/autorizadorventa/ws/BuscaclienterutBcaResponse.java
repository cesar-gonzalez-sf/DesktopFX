
package cl.imperial.autorizadorventa.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaclienterutBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaclienterutBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.autorizadorventa.imperial.cl/autorizadorventa}buscaclienterutBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaclienterutBcaResponse", propOrder = {
    "buscaclienterutBcaResult"
})
public class BuscaclienterutBcaResponse {

    protected BuscaclienterutBcaResult buscaclienterutBcaResult;

    /**
     * Obtiene el valor de la propiedad buscaclienterutBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscaclienterutBcaResult }
     *     
     */
    public BuscaclienterutBcaResult getBuscaclienterutBcaResult() {
        return buscaclienterutBcaResult;
    }

    /**
     * Define el valor de la propiedad buscaclienterutBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscaclienterutBcaResult }
     *     
     */
    public void setBuscaclienterutBcaResult(BuscaclienterutBcaResult value) {
        this.buscaclienterutBcaResult = value;
    }

}
