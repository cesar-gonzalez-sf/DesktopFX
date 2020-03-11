
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaempBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaempBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.estacionmantencion.imperial.cl/estacionmantencion}buscaempBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaempBcaResponse", propOrder = {
    "buscaempBcaResult"
})
public class BuscaempBcaResponse {

    protected BuscaempBcaResult buscaempBcaResult;

    /**
     * Obtiene el valor de la propiedad buscaempBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscaempBcaResult }
     *     
     */
    public BuscaempBcaResult getBuscaempBcaResult() {
        return buscaempBcaResult;
    }

    /**
     * Define el valor de la propiedad buscaempBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscaempBcaResult }
     *     
     */
    public void setBuscaempBcaResult(BuscaempBcaResult value) {
        this.buscaempBcaResult = value;
    }

}
