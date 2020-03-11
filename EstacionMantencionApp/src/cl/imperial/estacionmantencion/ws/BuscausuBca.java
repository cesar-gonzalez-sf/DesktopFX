
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscausuBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscausuBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usuCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscausuBca", propOrder = {
    "usuCodigo"
})
public class BuscausuBca {

    protected String usuCodigo;

    /**
     * Obtiene el valor de la propiedad usuCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuCodigo() {
        return usuCodigo;
    }

    /**
     * Define el valor de la propiedad usuCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuCodigo(String value) {
        this.usuCodigo = value;
    }

}
