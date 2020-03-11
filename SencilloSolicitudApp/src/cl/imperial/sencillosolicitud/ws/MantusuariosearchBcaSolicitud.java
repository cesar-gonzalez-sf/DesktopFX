
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MantusuariosearchBcaSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MantusuariosearchBcaSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidoMat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bodega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAlterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcioncargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechacumpleano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecharetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fono1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impnopomade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impnoportable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impportable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impportmade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indRetiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MantusuariosearchBcaSolicitud", propOrder = {
    "apellidoMat",
    "apellidoPat",
    "bodega",
    "codAlterno",
    "codCargo",
    "codUsuario",
    "codVendedor",
    "color",
    "descripcioncargo",
    "email",
    "empresa",
    "fechacumpleano",
    "fecharetiro",
    "fono1",
    "fono2",
    "idCargo",
    "impnopomade",
    "impnoportable",
    "impportable",
    "impportmade",
    "indRetiro",
    "nombres",
    "rut",
    "tienda",
    "usuEstado",
    "usuario"
})
public class MantusuariosearchBcaSolicitud {

    protected String apellidoMat;
    protected String apellidoPat;
    protected String bodega;
    protected String codAlterno;
    protected String codCargo;
    protected String codUsuario;
    protected String codVendedor;
    protected String color;
    protected String descripcioncargo;
    protected String email;
    protected String empresa;
    protected String fechacumpleano;
    protected String fecharetiro;
    protected String fono1;
    protected String fono2;
    protected String idCargo;
    protected String impnopomade;
    protected String impnoportable;
    protected String impportable;
    protected String impportmade;
    protected String indRetiro;
    protected String nombres;
    protected String rut;
    protected String tienda;
    protected String usuEstado;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad apellidoMat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMat() {
        return apellidoMat;
    }

    /**
     * Define el valor de la propiedad apellidoMat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMat(String value) {
        this.apellidoMat = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPat() {
        return apellidoPat;
    }

    /**
     * Define el valor de la propiedad apellidoPat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPat(String value) {
        this.apellidoPat = value;
    }

    /**
     * Obtiene el valor de la propiedad bodega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodega() {
        return bodega;
    }

    /**
     * Define el valor de la propiedad bodega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodega(String value) {
        this.bodega = value;
    }

    /**
     * Obtiene el valor de la propiedad codAlterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAlterno() {
        return codAlterno;
    }

    /**
     * Define el valor de la propiedad codAlterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAlterno(String value) {
        this.codAlterno = value;
    }

    /**
     * Obtiene el valor de la propiedad codCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCargo() {
        return codCargo;
    }

    /**
     * Define el valor de la propiedad codCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCargo(String value) {
        this.codCargo = value;
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
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcioncargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcioncargo() {
        return descripcioncargo;
    }

    /**
     * Define el valor de la propiedad descripcioncargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcioncargo(String value) {
        this.descripcioncargo = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad fechacumpleano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechacumpleano() {
        return fechacumpleano;
    }

    /**
     * Define el valor de la propiedad fechacumpleano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechacumpleano(String value) {
        this.fechacumpleano = value;
    }

    /**
     * Obtiene el valor de la propiedad fecharetiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecharetiro() {
        return fecharetiro;
    }

    /**
     * Define el valor de la propiedad fecharetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecharetiro(String value) {
        this.fecharetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad fono1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFono1() {
        return fono1;
    }

    /**
     * Define el valor de la propiedad fono1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFono1(String value) {
        this.fono1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fono2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFono2() {
        return fono2;
    }

    /**
     * Define el valor de la propiedad fono2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFono2(String value) {
        this.fono2 = value;
    }

    /**
     * Obtiene el valor de la propiedad idCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCargo() {
        return idCargo;
    }

    /**
     * Define el valor de la propiedad idCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCargo(String value) {
        this.idCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad impnopomade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpnopomade() {
        return impnopomade;
    }

    /**
     * Define el valor de la propiedad impnopomade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpnopomade(String value) {
        this.impnopomade = value;
    }

    /**
     * Obtiene el valor de la propiedad impnoportable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpnoportable() {
        return impnoportable;
    }

    /**
     * Define el valor de la propiedad impnoportable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpnoportable(String value) {
        this.impnoportable = value;
    }

    /**
     * Obtiene el valor de la propiedad impportable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpportable() {
        return impportable;
    }

    /**
     * Define el valor de la propiedad impportable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpportable(String value) {
        this.impportable = value;
    }

    /**
     * Obtiene el valor de la propiedad impportmade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpportmade() {
        return impportmade;
    }

    /**
     * Define el valor de la propiedad impportmade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpportmade(String value) {
        this.impportmade = value;
    }

    /**
     * Obtiene el valor de la propiedad indRetiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndRetiro() {
        return indRetiro;
    }

    /**
     * Define el valor de la propiedad indRetiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndRetiro(String value) {
        this.indRetiro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad tienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTienda() {
        return tienda;
    }

    /**
     * Define el valor de la propiedad tienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTienda(String value) {
        this.tienda = value;
    }

    /**
     * Obtiene el valor de la propiedad usuEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuEstado() {
        return usuEstado;
    }

    /**
     * Define el valor de la propiedad usuEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuEstado(String value) {
        this.usuEstado = value;
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

}
