
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscaempresaxestacionBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscaempresaxestacionBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaempresaxestacionBca", propOrder = {
    "estacion"
})
public class BuscaempresaxestacionBca {

    protected String estacion;

    /**
     * Obtiene el valor de la propiedad estacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstacion() {
        return estacion;
    }

    /**
     * Define el valor de la propiedad estacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstacion(String value) {
        this.estacion = value;
    }

}
