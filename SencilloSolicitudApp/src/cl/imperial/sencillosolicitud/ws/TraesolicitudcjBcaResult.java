
package cl.imperial.sencillosolicitud.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TraesolicitudcjBcaResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TraesolicitudcjBcaResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}ProcedureResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documentos" type="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}TraesolicitudcjBcaDocumento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="efectivos" type="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}TraesolicitudcjBcaEfectivo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saldos" type="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}TraesolicitudcjBcaSaldo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vouchers" type="{http://ws.sencillosolicitud.imperial.cl/sencillosolicitud}TraesolicitudcjBcaVoucher" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraesolicitudcjBcaResult", propOrder = {
    "documentos",
    "efectivos",
    "errorMessage",
    "saldos",
    "vouchers"
})
public class TraesolicitudcjBcaResult
    extends ProcedureResult
{

    @XmlElement(nillable = true)
    protected List<TraesolicitudcjBcaDocumento> documentos;
    @XmlElement(nillable = true)
    protected List<TraesolicitudcjBcaEfectivo> efectivos;
    protected String errorMessage;
    @XmlElement(nillable = true)
    protected List<TraesolicitudcjBcaSaldo> saldos;
    @XmlElement(nillable = true)
    protected List<TraesolicitudcjBcaVoucher> vouchers;

    /**
     * Gets the value of the documentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraesolicitudcjBcaDocumento }
     * 
     * 
     */
    public List<TraesolicitudcjBcaDocumento> getDocumentos() {
        if (documentos == null) {
            documentos = new ArrayList<TraesolicitudcjBcaDocumento>();
        }
        return this.documentos;
    }

    /**
     * Gets the value of the efectivos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the efectivos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEfectivos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraesolicitudcjBcaEfectivo }
     * 
     * 
     */
    public List<TraesolicitudcjBcaEfectivo> getEfectivos() {
        if (efectivos == null) {
            efectivos = new ArrayList<TraesolicitudcjBcaEfectivo>();
        }
        return this.efectivos;
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

    /**
     * Gets the value of the saldos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saldos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaldos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraesolicitudcjBcaSaldo }
     * 
     * 
     */
    public List<TraesolicitudcjBcaSaldo> getSaldos() {
        if (saldos == null) {
            saldos = new ArrayList<TraesolicitudcjBcaSaldo>();
        }
        return this.saldos;
    }

    /**
     * Gets the value of the vouchers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vouchers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVouchers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TraesolicitudcjBcaVoucher }
     * 
     * 
     */
    public List<TraesolicitudcjBcaVoucher> getVouchers() {
        if (vouchers == null) {
            vouchers = new ArrayList<TraesolicitudcjBcaVoucher>();
        }
        return this.vouchers;
    }

}
