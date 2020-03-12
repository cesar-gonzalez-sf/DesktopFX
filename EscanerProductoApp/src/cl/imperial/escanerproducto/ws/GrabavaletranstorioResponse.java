
package cl.imperial.escanerproducto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabavaletranstorioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabavaletranstorioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ws.escanerproducto.imperial.cl/escanerproducto}grabavaletranstorioResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabavaletranstorioResponse", propOrder = {
    "grabavaletranstorioResult"
})
public class GrabavaletranstorioResponse {

    protected GrabavaletranstorioResult grabavaletranstorioResult;

    /**
     * Obtiene el valor de la propiedad grabavaletranstorioResult.
     * 
     * @return
     *     possible object is
     *     {@link GrabavaletranstorioResult }
     *     
     */
    public GrabavaletranstorioResult getGrabavaletranstorioResult() {
        return grabavaletranstorioResult;
    }

    /**
     * Define el valor de la propiedad grabavaletranstorioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link GrabavaletranstorioResult }
     *     
     */
    public void setGrabavaletranstorioResult(GrabavaletranstorioResult value) {
        this.grabavaletranstorioResult = value;
    }

}
