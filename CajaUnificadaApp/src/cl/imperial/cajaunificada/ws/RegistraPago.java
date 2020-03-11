
package cl.imperial.cajaunificada.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registraPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registraPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nroInterno" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registraPago", propOrder = {
    "nroInterno"
})
public class RegistraPago {

    protected int nroInterno;

    /**
     * Obtiene el valor de la propiedad nroInterno.
     * 
     */
    public int getNroInterno() {
        return nroInterno;
    }

    /**
     * Define el valor de la propiedad nroInterno.
     * 
     */
    public void setNroInterno(int value) {
        this.nroInterno = value;
    }

}
