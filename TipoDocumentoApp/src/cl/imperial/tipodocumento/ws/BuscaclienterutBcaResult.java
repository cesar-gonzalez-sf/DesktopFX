
package cl.imperial.tipodocumento.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaclienterutBcaResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaclienterutBcaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.tipodocumento.imperial.cl/tipodocumento}ProcedureResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientes" type="{http://ws.tipodocumento.imperial.cl/tipodocumento}BuscaclienterutBcaCliente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscaclienterutBcaResult", propOrder = {
    "clientes",
    "errorMessage"
})
public class BuscaclienterutBcaResult
    extends ProcedureResult
{

    @XmlElement(nillable = true)
    protected List<BuscaclienterutBcaCliente> clientes;
    protected String errorMessage;

    /**
     * Gets the value of the clientes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuscaclienterutBcaCliente }
     * 
     * 
     */
    public List<BuscaclienterutBcaCliente> getClientes() {
        if (clientes == null) {
            clientes = new ArrayList<BuscaclienterutBcaCliente>();
        }
        return this.clientes;
    }

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

}
