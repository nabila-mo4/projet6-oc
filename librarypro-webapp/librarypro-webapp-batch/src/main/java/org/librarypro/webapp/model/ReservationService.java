
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
@WebServiceClient(name = "ReservationService", targetNamespace = "model.webapp.librarypro.org", wsdlLocation = "http://lfr023539:5050/librarypro-webservice-interface207172345459075089/ReservationService?wsdl")
public class ReservationService
    extends Service
{

    private final static URL RESERVATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException RESERVATIONSERVICE_EXCEPTION;
    private final static QName RESERVATIONSERVICE_QNAME = new QName("model.webapp.librarypro.org", "ReservationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://lfr023539:5050/librarypro-webservice-interface207172345459075089/ReservationService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RESERVATIONSERVICE_WSDL_LOCATION = url;
        RESERVATIONSERVICE_EXCEPTION = e;
    }

    public ReservationService() {
        super(__getWsdlLocation(), RESERVATIONSERVICE_QNAME);
    }

    public ReservationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RESERVATIONSERVICE_QNAME, features);
    }

    public ReservationService(URL wsdlLocation) {
        super(wsdlLocation, RESERVATIONSERVICE_QNAME);
    }

    public ReservationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RESERVATIONSERVICE_QNAME, features);
    }

    public ReservationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReservationClient
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationClient getReservationPort() {
        return super.getPort(new QName("model.webapp.librarypro.org", "ReservationPort"), ReservationClient.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationClient
     */
    @WebEndpoint(name = "ReservationPort")
    public ReservationClient getReservationPort(WebServiceFeature... features) {
        return super.getPort(new QName("model.webapp.librarypro.org", "ReservationPort"), ReservationClient.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RESERVATIONSERVICE_EXCEPTION!= null) {
            throw RESERVATIONSERVICE_EXCEPTION;
        }
        return RESERVATIONSERVICE_WSDL_LOCATION;
    }

}
