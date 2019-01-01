
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

    private final static QName _UpdateResponse_QNAME = new QName("model.webapp.librarypro.org", "updateResponse");
    private final static QName _Delete_QNAME = new QName("model.webapp.librarypro.org", "delete");
    private final static QName _GetListByOuvrageResponse_QNAME = new QName("model.webapp.librarypro.org", "getListByOuvrageResponse");
    private final static QName _GetListByOuvrageTrieeResponse_QNAME = new QName("model.webapp.librarypro.org", "getListByOuvrageTrieeResponse");
    private final static QName _GetListByOuvrageTriee_QNAME = new QName("model.webapp.librarypro.org", "getListByOuvrageTriee");
    private final static QName _Update_QNAME = new QName("model.webapp.librarypro.org", "update");
    private final static QName _AddResponse_QNAME = new QName("model.webapp.librarypro.org", "addResponse");
    private final static QName _GetList_QNAME = new QName("model.webapp.librarypro.org", "getList");
    private final static QName _GetListResponse_QNAME = new QName("model.webapp.librarypro.org", "getListResponse");
    private final static QName _DeleteResponse_QNAME = new QName("model.webapp.librarypro.org", "deleteResponse");
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
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
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
     * Create an instance of {@link GetListByOuvrageTriee }
     * 
     */
    public GetListByOuvrageTriee createGetListByOuvrageTriee() {
        return new GetListByOuvrageTriee();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link GetListByOuvrageTrieeResponse }
     * 
     */
    public GetListByOuvrageTrieeResponse createGetListByOuvrageTrieeResponse() {
        return new GetListByOuvrageTrieeResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetListByOuvrageResponse }
     * 
     */
    public GetListByOuvrageResponse createGetListByOuvrageResponse() {
        return new GetListByOuvrageResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
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
     * Create an instance of {@link EmpruntDTO }
     * 
     */
    public EmpruntDTO createEmpruntDTO() {
        return new EmpruntDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByOuvrageTrieeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getListByOuvrageTrieeResponse")
    public JAXBElement<GetListByOuvrageTrieeResponse> createGetListByOuvrageTrieeResponse(GetListByOuvrageTrieeResponse value) {
        return new JAXBElement<GetListByOuvrageTrieeResponse>(_GetListByOuvrageTrieeResponse_QNAME, GetListByOuvrageTrieeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListByOuvrageTriee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "getListByOuvrageTriee")
    public JAXBElement<GetListByOuvrageTriee> createGetListByOuvrageTriee(GetListByOuvrageTriee value) {
        return new JAXBElement<GetListByOuvrageTriee>(_GetListByOuvrageTriee_QNAME, GetListByOuvrageTriee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "model.webapp.librarypro.org", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
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
