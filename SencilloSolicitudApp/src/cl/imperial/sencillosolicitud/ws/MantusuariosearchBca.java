
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mantusuariosearchBca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mantusuariosearchBca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mantusuariosearchBca", propOrder = {
    "codVendedor",
    "codUsuario"
})
public class MantusuariosearchBca {

    protected String codVendedor;
    protected String codUsuario;

    /**
     * Obtiene el valor de la propiedad codVendedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVendedor() {
        return codVendedor;
    }

    /**
     * Define el valor de la propiedad codVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVendedor(String value) {
        this.codVendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
    }

}
