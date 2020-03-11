
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminaestEliResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminaestEliResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.estacionmantencion.imperial.cl/estacionmantencion}eliminaestEliResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminaestEliResponse", propOrder = {
    "eliminaestEliResult"
})
public class EliminaestEliResponse {

    protected EliminaestEliResult eliminaestEliResult;

    /**
     * Obtiene el valor de la propiedad eliminaestEliResult.
     * 
     * @return
     *     possible object is
     *     {@link EliminaestEliResult }
     *     
     */
    public EliminaestEliResult getEliminaestEliResult() {
        return eliminaestEliResult;
    }

    /**
     * Define el valor de la propiedad eliminaestEliResult.
     * 
     * @param value
     *     allowed object is
     *     {@link EliminaestEliResult }
     *     
     */
    public void setEliminaestEliResult(EliminaestEliResult value) {
        this.eliminaestEliResult = value;
    }

}
