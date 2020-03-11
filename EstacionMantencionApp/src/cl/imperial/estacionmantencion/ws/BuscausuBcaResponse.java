
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscausuBcaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscausuBcaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.estacionmantencion.imperial.cl/estacionmantencion}buscausuBcaResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscausuBcaResponse", propOrder = {
    "buscausuBcaResult"
})
public class BuscausuBcaResponse {

    protected BuscausuBcaResult buscausuBcaResult;

    /**
     * Obtiene el valor de la propiedad buscausuBcaResult.
     * 
     * @return
     *     possible object is
     *     {@link BuscausuBcaResult }
     *     
     */
    public BuscausuBcaResult getBuscausuBcaResult() {
        return buscausuBcaResult;
    }

    /**
     * Define el valor de la propiedad buscausuBcaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link BuscausuBcaResult }
     *     
     */
    public void setBuscausuBcaResult(BuscausuBcaResult value) {
        this.buscausuBcaResult = value;
    }

}
