
package cl.imperial.cajaunificada.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para valeGetResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="valeGetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.cajaunificada.imperial.cl/cajaunificada}valeGetResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valeGetResponse", propOrder = {
    "valeGetResult"
})
public class ValeGetResponse {

    protected ValeGetResult valeGetResult;

    /**
     * Obtiene el valor de la propiedad valeGetResult.
     * 
     * @return
     *     possible object is
     *     {@link ValeGetResult }
     *     
     */
    public ValeGetResult getValeGetResult() {
        return valeGetResult;
    }

    /**
     * Define el valor de la propiedad valeGetResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ValeGetResult }
     *     
     */
    public void setValeGetResult(ValeGetResult value) {
        this.valeGetResult = value;
    }

}
