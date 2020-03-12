
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para traelecturascanResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="traelecturascanResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.escanerproducto.imperial.cl/escanerproducto}traelecturascanResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traelecturascanResponse", propOrder = {
    "traelecturascanResult"
})
public class TraelecturascanResponse {

    protected TraelecturascanResult traelecturascanResult;

    /**
     * Obtiene el valor de la propiedad traelecturascanResult.
     * 
     * @return
     *     possible object is
     *     {@link TraelecturascanResult }
     *     
     */
    public TraelecturascanResult getTraelecturascanResult() {
        return traelecturascanResult;
    }

    /**
     * Define el valor de la propiedad traelecturascanResult.
     * 
     * @param value
     *     allowed object is
     *     {@link TraelecturascanResult }
     *     
     */
    public void setTraelecturascanResult(TraelecturascanResult value) {
        this.traelecturascanResult = value;
    }

}
