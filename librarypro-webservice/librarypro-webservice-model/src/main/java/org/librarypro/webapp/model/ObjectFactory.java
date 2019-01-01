
package org.librarypro.webapp.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.librarypro.webapp.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListByOuvrageResponse_QNAME = new QName("model.webapp.librarypro.org", "getListByOuvrageResponse");
    private final static QName _AddResponse_QNAME = new QName("model.webapp.librarypro.org", "addResponse");
    private final static QName _GetList_QNAME = new QName("model.webapp.librarypro.org", "getList");
    private final static QName _GetListResponse_QNAME = new QName("model.webapp.librarypro.org", "getListResponse");
    private final static QName _GetListByOuvrage_QNAME = new QName("model.webapp.librarypro.org", "getListByOuvrage");
    private final static QName _Add_QNAME = new QName("model.webapp.librarypro.org", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.librarypro.webapp.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link GetListByOuvrage }
     * 
     */
    public GetListByOuvrage createGetListByOuvrage() {
        return new GetListByOuvrage();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetListByOuvrageResponse }
     * 
     */
    public GetListByOuvrageResponse createGetListByOuvrageResponse() {
        return new GetListByOuvrageResponse();
    }

    /**
     * Create an instance of {@link OuvrageDTO }
     * 
     */
    public OuvrageDTO createOuvrageDTO() {
        return new OuvrageDTO();
    }

    /**
     * Create an instance of {@link AuteurDTO }
     * 
     */
    public AuteurDTO createAuteurDTO() {
        return new AuteurDTO();
    }

    /**
     * Create an instance of {@link UtilisateurDTO }
     * 
     */
    public UtilisateurDTO createUtilisateurDTO() {
        return new UtilisateurDTO();
    }

    /**
     * Create an instance of {@link ReservationDTO }
     * 
     */
    public ReservationDTO createReservationDTO() {
        return new ReservationDTO();
    }

    /**
     * Create an instance of {@link EmpruntDTO }
     * 
     */
    public EmpruntDTO createEmpruntDTO() {
        return new EmpruntDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getListByOuvrageResponse")
    public JAXBElement<GetListByOuvrageResponse> createGetListByOuvrageResponse(GetListByOuvrageResponse value) {
        return new JAXBElement<GetListByOuvrageResponse>(_GetListByOuvrageResponse_QNAME, GetListByOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getList")
    public JAXBElement<GetList> createGetList(GetList value) {
        return new JAXBElement<GetList>(_GetList_QNAME, GetList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getListResponse")
    public JAXBElement<GetListResponse> createGetListResponse(GetListResponse value) {
        return new JAXBElement<GetListResponse>(_GetListResponse_QNAME, GetListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getListByOuvrage")
    public JAXBElement<GetListByOuvrage> createGetListByOuvrage(GetListByOuvrage value) {
        return new JAXBElement<GetListByOuvrage>(_GetListByOuvrage_QNAME, GetListByOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
