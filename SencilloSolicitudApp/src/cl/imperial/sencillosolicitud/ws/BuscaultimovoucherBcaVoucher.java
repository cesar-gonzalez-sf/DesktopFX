
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuscaultimovoucherBcaVoucher complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuscaultimovoucherBcaVoucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cierre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUsurecibe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoDocumentos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoEfectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroInternopadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BuscaultimovoucherBcaVoucher", propOrder = {
    "cierre",
    "codEmp",
    "codUsurecibe",
    "estacion",
    "estado",
    "fecha",
    "montoDocumentos",
    "montoEfectivo",
    "nroInterno",
    "nroInternopadre",
    "tipoTransaccion",
    "usuario"
})
public class BuscaultimovoucherBcaVoucher {

    protected String cierre;
    protected String codEmp;
    protected String codUsurecibe;
    protected String estacion;
    protected String estado;
    protected String fecha;
    protected String montoDocumentos;
    protected String montoEfectivo;
    protected String nroInterno;
    protected String nroInternopadre;
    protected String tipoTransaccion;
    protected String usuario;

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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDocumentos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoDocumentos() {
        return montoDocumentos;
    }

    /**
     * Define el valor de la propiedad montoDocumentos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoDocumentos(String value) {
        this.montoDocumentos = value;
    }

    /**
     * Obtiene el valor de la propiedad montoEfectivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontoEfectivo() {
        return montoEfectivo;
    }

    /**
     * Define el valor de la propiedad montoEfectivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontoEfectivo(String value) {
        this.montoEfectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInterno() {
        return nroInterno;
    }

    /**
     * Define el valor de la propiedad nroInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInterno(String value) {
        this.nroInterno = value;
    }

    /**
     * Obtiene el valor de la propiedad nroInternopadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroInternopadre() {
        return nroInternopadre;
    }

    /**
     * Define el valor de la propiedad nroInternopadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroInternopadre(String value) {
        this.nroInternopadre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccion(String value) {
        this.tipoTransaccion = value;
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
