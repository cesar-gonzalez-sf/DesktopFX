
package cl.imperial.estacionmantencion.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresaestIns complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresaestIns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sucran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresaestIns", propOrder = {
    "est",
    "emp",
    "tipoest",
    "desc",
    "sucran",
    "estran"
})
public class IngresaestIns {

    protected String est;
    protected String emp;
    protected String tipoest;
    protected String desc;
    protected String sucran;
    protected String estran;

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

    /**
     * Obtiene el valor de la propiedad emp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmp() {
        return emp;
    }

    /**
     * Define el valor de la propiedad emp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmp(String value) {
        this.emp = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoest() {
        return tipoest;
    }

    /**
     * Define el valor de la propiedad tipoest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoest(String value) {
        this.tipoest = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad sucran.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSucran() {
        return sucran;
    }

    /**
     * Define el valor de la propiedad sucran.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSucran(String value) {
        this.sucran = value;
    }

    /**
     * Obtiene el valor de la propiedad estran.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstran() {
        return estran;
    }

    /**
     * Define el valor de la propiedad estran.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstran(String value) {
        this.estran = value;
    }

}
