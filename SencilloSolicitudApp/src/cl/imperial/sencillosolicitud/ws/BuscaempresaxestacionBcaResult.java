
package cl.imperial.sencillosolicitud.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaempresaxestacionBcaResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaempresaxestacionBcaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}ProcedureResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="solicitudes" type="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}BuscaempresaxestacionBcaSolicitud" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaempresaxestacionBcaResult", propOrder = {
    "errorMessage",
    "solicitudes"
})
public class BuscaempresaxestacionBcaResult
    extends ProcedureResult
{

    protected String errorMessage;
    @XmlElement(nillable = true)
    protected List<BuscaempresaxestacionBcaSolicitud> solicitudes;

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the solicitudes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitudes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitudes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscaempresaxestacionBcaSolicitud }
     * 
     * 
     */
    public List<BuscaempresaxestacionBcaSolicitud> getSolicitudes() {
        if (solicitudes == null) {
            solicitudes = new ArrayList<BuscaempresaxestacionBcaSolicitud>();
        }
        return this.solicitudes;
    }

}
