
package cl.imperial.tipodocumento.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TipoDocumentoWeb", targetNamespace = "http://ws.tipodocumento.imperial.cl/tipodocumento")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TipoDocumentoWeb {


    /**
     * 
     * @param vrutCliente
     * @return
     *     returns cl.imperial.tipodocumento.ws.BuscaclienterutBcaResult
     * @throws TipoDocumentoWebException
     */
    @WebMethod
    @WebResult(name = "buscaclienterutBcaResult", targetNamespace = "http://ws.tipodocumento.imperial.cl/tipodocumento")
    @RequestWrapper(localName = "buscaclienterutBca", targetNamespace = "http://ws.tipodocumento.imperial.cl/tipodocumento", className = "cl.imperial.tipodocumento.ws.BuscaclienterutBca")
    @ResponseWrapper(localName = "buscaclienterutBcaResponse", targetNamespace = "http://ws.tipodocumento.imperial.cl/tipodocumento", className = "cl.imperial.tipodocumento.ws.BuscaclienterutBcaResponse")
    @Action(input = "http://ws.tipodocumento.imperial.cl/tipodocumento/TipoDocumentoWeb/buscaclienterutBcaRequest", output = "http://ws.tipodocumento.imperial.cl/tipodocumento/TipoDocumentoWeb/buscaclienterutBcaResponse", fault = {
        @FaultAction(className = TipoDocumentoWebException.class, value = "http://ws.tipodocumento.imperial.cl/tipodocumento/TipoDocumentoWeb/buscaclienterutBca/Fault/TipoDocumentoWebException")
    })
    public BuscaclienterutBcaResult buscaclienterutBca(
        @WebParam(name = "vrutCliente", targetNamespace = "http://ws.tipodocumento.imperial.cl/tipodocumento")
        String vrutCliente)
        throws TipoDocumentoWebException
    ;

}
