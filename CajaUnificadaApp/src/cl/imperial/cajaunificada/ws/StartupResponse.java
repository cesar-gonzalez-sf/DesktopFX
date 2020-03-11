
package cl.imperial.cajaunificada.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para startupResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="startupResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.cajaunificada.imperial.cl/cajaunificada}startupResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startupResponse", propOrder = {
    "startupResult"
})
public class StartupResponse {

    protected StartupResult startupResult;

    /**
     * Obtiene el valor de la propiedad startupResult.
     * 
     * @return
     *     possible object is
     *     {@link StartupResult }
     *     
     */
    public StartupResult getStartupResult() {
        return startupResult;
    }

    /**
     * Define el valor de la propiedad startupResult.
     * 
     * @param value
     *     allowed object is
     *     {@link StartupResult }
     *     
     */
    public void setStartupResult(StartupResult value) {
        this.startupResult = value;
    }

}
