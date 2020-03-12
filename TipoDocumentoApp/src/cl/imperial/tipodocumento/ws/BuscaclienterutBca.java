
package cl.imperial.tipodocumento.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaclienterutBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaclienterutBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vrutCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaclienterutBca", propOrder = {
    "vrutCliente"
})
public class BuscaclienterutBca {

    protected String vrutCliente;

    /**
     * Obtiene el valor de la propiedad vrutCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrutCliente() {
        return vrutCliente;
    }

    /**
     * Define el valor de la propiedad vrutCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrutCliente(String value) {
        this.vrutCliente = value;
    }

}
