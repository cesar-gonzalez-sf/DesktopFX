
package cl.imperial.sencillosolicitud.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcedureResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcedureResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedureResult")
@XmlSeeAlso({
    BuscabanusutieBcaResult.class,
    BuscaempresaxestacionBcaResult.class,
    BuscaultimovoucherBcaResult.class,
    BuscausuariosvaBcaResult.class,
    GrabaenviobanInsResult.class,
    MantusuariosearchBcaResult.class,
    TraedenmonBcaResult.class,
    TraesolicitudcjBcaResult.class
})
public abstract class ProcedureResult {


}
