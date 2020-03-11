
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresaestInsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresaestInsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.estacionmantencion.imperial.cl/estacionmantencion}ingresaestInsResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresaestInsResponse", propOrder = {
    "ingresaestInsResult"
})
public class IngresaestInsResponse {

    protected IngresaestInsResult ingresaestInsResult;

    /**
     * Obtiene el valor de la propiedad ingresaestInsResult.
     * 
     * @return
     *     possible object is
     *     {@link IngresaestInsResult }
     *     
     */
    public IngresaestInsResult getIngresaestInsResult() {
        return ingresaestInsResult;
    }

    /**
     * Define el valor de la propiedad ingresaestInsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link IngresaestInsResult }
     *     
     */
    public void setIngresaestInsResult(IngresaestInsResult value) {
        this.ingresaestInsResult = value;
    }

}
