
package cl.imperial.cajaunificada.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StartupResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="StartupResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.cajaunificada.imperial.cl/cajaunificada}ProcedureResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="propiedades" type="{http://ws.cajaunificada.imperial.cl/cajaunificada}StartupPropiedad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartupResult", propOrder = {
    "propiedades"
})
public class StartupResult
    extends ProcedureResult
{

    @XmlElement(nillable = true)
    protected List<StartupPropiedad> propiedades;

    /**
     * Gets the value of the propiedades property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propiedades property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropiedades().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StartupPropiedad }
     * 
     * 
     */
    public List<StartupPropiedad> getPropiedades() {
        if (propiedades == null) {
            propiedades = new ArrayList<StartupPropiedad>();
        }
        return this.propiedades;
    }

}
