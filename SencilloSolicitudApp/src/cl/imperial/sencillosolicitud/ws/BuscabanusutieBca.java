
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscabanusutieBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscabanusutieBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cajero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscabanusutieBca", propOrder = {
    "codEmp",
    "cajero"
})
public class BuscabanusutieBca {

    protected String codEmp;
    protected String cajero;

    /**
     * Obtiene el valor de la propiedad codEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmp() {
        return codEmp;
    }

    /**
     * Define el valor de la propiedad codEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmp(String value) {
        this.codEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad cajero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCajero() {
        return cajero;
    }

    /**
     * Define el valor de la propiedad cajero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCajero(String value) {
        this.cajero = value;
    }

}
