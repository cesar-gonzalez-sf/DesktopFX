
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IngresaestInsRegistro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IngresaestInsRegistro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IngresaestInsRegistro", propOrder = {
    "ins"
})
public class IngresaestInsRegistro {

    protected String ins;

    /**
     * Obtiene el valor de la propiedad ins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIns() {
        return ins;
    }

    /**
     * Define el valor de la propiedad ins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIns(String value) {
        this.ins = value;
    }

}
