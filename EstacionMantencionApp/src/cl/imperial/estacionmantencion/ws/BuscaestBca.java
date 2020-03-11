
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaestBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaestBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaestBca", propOrder = {
    "est"
})
public class BuscaestBca {

    protected String est;

    /**
     * Obtiene el valor de la propiedad est.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEst() {
        return est;
    }

    /**
     * Define el valor de la propiedad est.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEst(String value) {
        this.est = value;
    }

}
