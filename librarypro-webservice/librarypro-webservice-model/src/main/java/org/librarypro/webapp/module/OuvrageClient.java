
package org.librarypro.webapp.module;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OuvrageClient", targetNamespace = "module.webapp.librarypro.org")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OuvrageClient {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.librarypro.webapp.module.OuvrageDTO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBook", targetNamespace = "module.webapp.librarypro.org", className = "org.librarypro.webapp.module.GetBook")
    @ResponseWrapper(localName = "getBookResponse", targetNamespace = "module.webapp.librarypro.org", className = "org.librarypro.webapp.module.GetBookResponse")
    @Action(input = "module.webapp.librarypro.org/OuvrageClient/getBookRequest", output = "module.webapp.librarypro.org/OuvrageClient/getBookResponse")
    public OuvrageDTO getBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
