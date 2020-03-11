
package cl.imperial.cajaunificada.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RegistraPagoResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistraPagoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.cajaunificada.imperial.cl/cajaunificada}ProcedureResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienteCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteComuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteCondiciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteDv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteOrdenCompra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteRut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detalles" type="{http://ws.cajaunificada.imperial.cl/cajaunificada}RegistraPagoDetalle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dteFechaHoraEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dteFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dteObservaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorDireccionMatriz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorDireccionSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorDv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorGiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorRazonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorRut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emisorVendedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalNeto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistraPagoResult", propOrder = {
    "clienteCiudad",
    "clienteComuna",
    "clienteCondiciones",
    "clienteDireccion",
    "clienteDv",
    "clienteOrdenCompra",
    "clienteRazonSocial",
    "clienteRut",
    "detalles",
    "dteFechaHoraEmision",
    "dteFolio",
    "dteObservaciones",
    "dteTipoDocumento",
    "emisorDireccionMatriz",
    "emisorDireccionSucursal",
    "emisorDv",
    "emisorGiro",
    "emisorRazonSocial",
    "emisorRut",
    "emisorVendedor",
    "iva",
    "total",
    "totalNeto"
})
public class RegistraPagoResult
    extends ProcedureResult
{

    protected String clienteCiudad;
    protected String clienteComuna;
    protected String clienteCondiciones;
    protected String clienteDireccion;
    protected String clienteDv;
    protected String clienteOrdenCompra;
    protected String clienteRazonSocial;
    protected String clienteRut;
    @XmlElement(nillable = true)
    protected List<RegistraPagoDetalle> detalles;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dteFechaHoraEmision;
    protected String dteFolio;
    protected String dteObservaciones;
    protected String dteTipoDocumento;
    protected String emisorDireccionMatriz;
    protected String emisorDireccionSucursal;
    protected String emisorDv;
    protected String emisorGiro;
    protected String emisorRazonSocial;
    protected String emisorRut;
    protected String emisorVendedor;
    protected int iva;
    protected int total;
    protected int totalNeto;

    /**
     * Obtiene el valor de la propiedad clienteCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteCiudad() {
        return clienteCiudad;
    }

    /**
     * Define el valor de la propiedad clienteCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteCiudad(String value) {
        this.clienteCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteComuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteComuna() {
        return clienteComuna;
    }

    /**
     * Define el valor de la propiedad clienteComuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteComuna(String value) {
        this.clienteComuna = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCondiciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteCondiciones() {
        return clienteCondiciones;
    }

    /**
     * Define el valor de la propiedad clienteCondiciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteCondiciones(String value) {
        this.clienteCondiciones = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDireccion() {
        return clienteDireccion;
    }

    /**
     * Define el valor de la propiedad clienteDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDireccion(String value) {
        this.clienteDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteDv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDv() {
        return clienteDv;
    }

    /**
     * Define el valor de la propiedad clienteDv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDv(String value) {
        this.clienteDv = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteOrdenCompra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteOrdenCompra() {
        return clienteOrdenCompra;
    }

    /**
     * Define el valor de la propiedad clienteOrdenCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteOrdenCompra(String value) {
        this.clienteOrdenCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteRazonSocial() {
        return clienteRazonSocial;
    }

    /**
     * Define el valor de la propiedad clienteRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteRazonSocial(String value) {
        this.clienteRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteRut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteRut() {
        return clienteRut;
    }

    /**
     * Define el valor de la propiedad clienteRut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteRut(String value) {
        this.clienteRut = value;
    }

    /**
     * Gets the value of the detalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistraPagoDetalle }
     * 
     * 
     */
    public List<RegistraPagoDetalle> getDetalles() {
        if (detalles == null) {
            detalles = new ArrayList<RegistraPagoDetalle>();
        }
        return this.detalles;
    }

    /**
     * Obtiene el valor de la propiedad dteFechaHoraEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDteFechaHoraEmision() {
        return dteFechaHoraEmision;
    }

    /**
     * Define el valor de la propiedad dteFechaHoraEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDteFechaHoraEmision(XMLGregorianCalendar value) {
        this.dteFechaHoraEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad dteFolio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDteFolio() {
        return dteFolio;
    }

    /**
     * Define el valor de la propiedad dteFolio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDteFolio(String value) {
        this.dteFolio = value;
    }

    /**
     * Obtiene el valor de la propiedad dteObservaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDteObservaciones() {
        return dteObservaciones;
    }

    /**
     * Define el valor de la propiedad dteObservaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDteObservaciones(String value) {
        this.dteObservaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad dteTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDteTipoDocumento() {
        return dteTipoDocumento;
    }

    /**
     * Define el valor de la propiedad dteTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDteTipoDocumento(String value) {
        this.dteTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorDireccionMatriz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorDireccionMatriz() {
        return emisorDireccionMatriz;
    }

    /**
     * Define el valor de la propiedad emisorDireccionMatriz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorDireccionMatriz(String value) {
        this.emisorDireccionMatriz = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorDireccionSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorDireccionSucursal() {
        return emisorDireccionSucursal;
    }

    /**
     * Define el valor de la propiedad emisorDireccionSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorDireccionSucursal(String value) {
        this.emisorDireccionSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorDv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorDv() {
        return emisorDv;
    }

    /**
     * Define el valor de la propiedad emisorDv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorDv(String value) {
        this.emisorDv = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorGiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorGiro() {
        return emisorGiro;
    }

    /**
     * Define el valor de la propiedad emisorGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorGiro(String value) {
        this.emisorGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorRazonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorRazonSocial() {
        return emisorRazonSocial;
    }

    /**
     * Define el valor de la propiedad emisorRazonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorRazonSocial(String value) {
        this.emisorRazonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorRut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorRut() {
        return emisorRut;
    }

    /**
     * Define el valor de la propiedad emisorRut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorRut(String value) {
        this.emisorRut = value;
    }

    /**
     * Obtiene el valor de la propiedad emisorVendedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisorVendedor() {
        return emisorVendedor;
    }

    /**
     * Define el valor de la propiedad emisorVendedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisorVendedor(String value) {
        this.emisorVendedor = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     */
    public int getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     */
    public void setIva(int value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad totalNeto.
     * 
     */
    public int getTotalNeto() {
        return totalNeto;
    }

    /**
     * Define el valor de la propiedad totalNeto.
     * 
     */
    public void setTotalNeto(int value) {
        this.totalNeto = value;
    }

}
