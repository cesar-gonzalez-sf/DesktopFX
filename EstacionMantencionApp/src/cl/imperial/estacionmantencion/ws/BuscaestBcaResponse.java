
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaestBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaestBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.estacionmantencion.imperial.cl/estacionmantencion}buscaestBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaestBcaResponse", propOrder = {
    "buscaestBcaResult"
})
public class BuscaestBcaResponse {

    protected BuscaestBcaResult buscaestBcaResult;

    /**
     * Obtiene el valor de la propiedad buscaestBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscaestBcaResult }
     *     
     */
    public BuscaestBcaResult getBuscaestBcaResult() {
        return buscaestBcaResult;
    }

    /**
     * Define el valor de la propiedad buscaestBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscaestBcaResult }
     *     
     */
    public void setBuscaestBcaResult(BuscaestBcaResult value) {
        this.buscaestBcaResult = value;
    }

}
