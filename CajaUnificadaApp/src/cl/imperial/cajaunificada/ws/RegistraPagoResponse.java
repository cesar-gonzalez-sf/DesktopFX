
package cl.imperial.cajaunificada.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registraPagoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registraPagoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.cajaunificada.imperial.cl/cajaunificada}registraPagoResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registraPagoResponse", propOrder = {
    "registraPagoResult"
})
public class RegistraPagoResponse {

    protected RegistraPagoResult registraPagoResult;

    /**
     * Obtiene el valor de la propiedad registraPagoResult.
     * 
     * @return
     *     possible object is
     *     {@link RegistraPagoResult }
     *     
     */
    public RegistraPagoResult getRegistraPagoResult() {
        return registraPagoResult;
    }

    /**
     * Define el valor de la propiedad registraPagoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraPagoResult }
     *     
     */
    public void setRegistraPagoResult(RegistraPagoResult value) {
        this.registraPagoResult = value;
    }

}
