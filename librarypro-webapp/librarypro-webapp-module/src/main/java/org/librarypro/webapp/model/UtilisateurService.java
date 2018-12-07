
package org.librarypro.webapp.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UtilisateurService", targetNamespace = "model.webapp.librarypro.org", wsdlLocation = "http://lfr023539:8080/librarypro-webservice-interface8589775951915625231/UtilisateurService?wsdl")
public class UtilisateurService
    extends Service
{

    private final static URL UTILISATEURSERVICE_WSDL_LOCATION;
    private final static WebServiceException UTILISATEURSERVICE_EXCEPTION;
    private final static QName UTILISATEURSERVICE_QNAME = new QName("model.webapp.librarypro.org", "UtilisateurService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr023539:8080/librarypro-webservice-interface8589775951915625231/UtilisateurService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTILISATEURSERVICE_WSDL_LOCATION = url;
        UTILISATEURSERVICE_EXCEPTION = e;
    }

    public UtilisateurService() {
        super(__getWsdlLocation(), UTILISATEURSERVICE_QNAME);
    }

    public UtilisateurService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTILISATEURSERVICE_QNAME, features);
    }

    public UtilisateurService(URL wsdlLocation) {
        super(wsdlLocation, UTILISATEURSERVICE_QNAME);
    }

    public UtilisateurService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTILISATEURSERVICE_QNAME, features);
    }

    public UtilisateurService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilisateurService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UtilisateurClient
     */
    @WebEndpoint(name = "UtilisateurPort")
    public UtilisateurClient getUtilisateurPort() {
        return super.getPort(new QName("model.webapp.librarypro.org", "UtilisateurPort"), UtilisateurClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilisateurClient
     */
    @WebEndpoint(name = "UtilisateurPort")
    public UtilisateurClient getUtilisateurPort(WebServiceFeature... features) {
        return super.getPort(new QName("model.webapp.librarypro.org", "UtilisateurPort"), UtilisateurClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UTILISATEURSERVICE_EXCEPTION!= null) {
            throw UTILISATEURSERVICE_EXCEPTION;
        }
        return UTILISATEURSERVICE_WSDL_LOCATION;
    }

}