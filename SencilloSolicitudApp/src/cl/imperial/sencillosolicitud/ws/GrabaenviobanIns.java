
package cl.imperial.sencillosolicitud.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grabaenviobanIns complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grabaenviobanIns"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoTran" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoEfe" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="montoDoc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detefectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detdoctos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sencillo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUsurecibe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoEnvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idBandejapos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grabaenviobanIns", propOrder = {
    "tipoTran",
    "montoEfe",
    "montoDoc",
    "codEmp",
    "detefectivo",
    "detdoctos",
    "sencillo",
    "usuario",
    "estacion",
    "codUsurecibe",
    "cierre",
    "tipoEnvio",
    "idBandejapos"
})
public class GrabaenviobanIns {

    protected String tipoTran;
    protected BigDecimal montoEfe;
    protected BigDecimal montoDoc;
    protected String codEmp;
    protected String detefectivo;
    protected String detdoctos;
    protected String sencillo;
    protected String usuario;
    protected String estacion;
    protected String codUsurecibe;
    protected String cierre;
    protected String tipoEnvio;
    protected String idBandejapos;

    /**
     * Obtiene el valor de la propiedad tipoTran.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTran() {
        return tipoTran;
    }

    /**
     * Define el valor de la propiedad tipoTran.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTran(String value) {
        this.tipoTran = value;
    }

    /**
     * Obtiene el valor de la propiedad montoEfe.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoEfe() {
        return montoEfe;
    }

    /**
     * Define el valor de la propiedad montoEfe.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoEfe(BigDecimal value) {
        this.montoEfe = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDoc.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDoc() {
        return montoDoc;
    }

    /**
     * Define el valor de la propiedad montoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDoc(BigDecimal value) {
        this.montoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEmp() {
        return codEmp;
    }

    /**
     * Define el valor de la propiedad codEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEmp(String value) {
        this.codEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad detefectivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetefectivo() {
        return detefectivo;
    }

    /**
     * Define el valor de la propiedad detefectivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetefectivo(String value) {
        this.detefectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad detdoctos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetdoctos() {
        return detdoctos;
    }

    /**
     * Define el valor de la propiedad detdoctos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetdoctos(String value) {
        this.detdoctos = value;
    }

    /**
     * Obtiene el valor de la propiedad sencillo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSencillo() {
        return sencillo;
    }

    /**
     * Define el valor de la propiedad sencillo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSencillo(String value) {
        this.sencillo = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

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

    /**
     * Obtiene el valor de la propiedad codUsurecibe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsurecibe() {
        return codUsurecibe;
    }

    /**
     * Define el valor de la propiedad codUsurecibe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsurecibe(String value) {
        this.codUsurecibe = value;
    }

    /**
     * Obtiene el valor de la propiedad cierre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCierre() {
        return cierre;
    }

    /**
     * Define el valor de la propiedad cierre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCierre(String value) {
        this.cierre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEnvio() {
        return tipoEnvio;
    }

    /**
     * Define el valor de la propiedad tipoEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEnvio(String value) {
        this.tipoEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad idBandejapos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBandejapos() {
        return idBandejapos;
    }

    /**
     * Define el valor de la propiedad idBandejapos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBandejapos(String value) {
        this.idBandejapos = value;
    }

}
