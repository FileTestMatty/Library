
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _CreateAuthors_QNAME = new QName("http://alfasoft.it/authors", "createAuthors");
    private final static QName _CreateAuthorsResponse_QNAME = new QName("http://alfasoft.it/authors", "createAuthorsResponse");
    private final static QName _DeleteAuthors_QNAME = new QName("http://alfasoft.it/authors", "deleteAuthors");
    private final static QName _DeleteAuthorsResponse_QNAME = new QName("http://alfasoft.it/authors", "deleteAuthorsResponse");
    private final static QName _Find_QNAME = new QName("http://alfasoft.it/authors", "find");
    private final static QName _FindResponse_QNAME = new QName("http://alfasoft.it/authors", "findResponse");
    private final static QName _GetAuthors_QNAME = new QName("http://alfasoft.it/authors", "getAuthors");
    private final static QName _GetAuthorsResponse_QNAME = new QName("http://alfasoft.it/authors", "getAuthorsResponse");
    private final static QName _GetById_QNAME = new QName("http://alfasoft.it/authors", "getById");
    private final static QName _GetByIdResponse_QNAME = new QName("http://alfasoft.it/authors", "getByIdResponse");
    private final static QName _Update_QNAME = new QName("http://alfasoft.it/authors", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://alfasoft.it/authors", "updateResponse");
    private final static QName _DaoException_QNAME = new QName("http://alfasoft.it/authors", "DaoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAuthors }
     * 
     */
    public CreateAuthors createCreateAuthors() {
        return new CreateAuthors();
    }

    /**
     * Create an instance of {@link CreateAuthorsResponse }
     * 
     */
    public CreateAuthorsResponse createCreateAuthorsResponse() {
        return new CreateAuthorsResponse();
    }

    /**
     * Create an instance of {@link DeleteAuthors }
     * 
     */
    public DeleteAuthors createDeleteAuthors() {
        return new DeleteAuthors();
    }

    /**
     * Create an instance of {@link DeleteAuthorsResponse }
     * 
     */
    public DeleteAuthorsResponse createDeleteAuthorsResponse() {
        return new DeleteAuthorsResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetAuthors }
     * 
     */
    public GetAuthors createGetAuthors() {
        return new GetAuthors();
    }

    /**
     * Create an instance of {@link GetAuthorsResponse }
     * 
     */
    public GetAuthorsResponse createGetAuthorsResponse() {
        return new GetAuthorsResponse();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link DaoException }
     * 
     */
    public DaoException createDaoException() {
        return new DaoException();
    }

    /**
     * Create an instance of {@link Autore }
     * 
     */
    public Autore createAutore() {
        return new Autore();
    }

    /**
     * Create an instance of {@link Paginator }
     * 
     */
    public Paginator createPaginator() {
        return new Paginator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuthors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAuthors }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "createAuthors")
    public JAXBElement<CreateAuthors> createCreateAuthors(CreateAuthors value) {
        return new JAXBElement<CreateAuthors>(_CreateAuthors_QNAME, CreateAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuthorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAuthorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "createAuthorsResponse")
    public JAXBElement<CreateAuthorsResponse> createCreateAuthorsResponse(CreateAuthorsResponse value) {
        return new JAXBElement<CreateAuthorsResponse>(_CreateAuthorsResponse_QNAME, CreateAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAuthors }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "deleteAuthors")
    public JAXBElement<DeleteAuthors> createDeleteAuthors(DeleteAuthors value) {
        return new JAXBElement<DeleteAuthors>(_DeleteAuthors_QNAME, DeleteAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuthorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteAuthorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "deleteAuthorsResponse")
    public JAXBElement<DeleteAuthorsResponse> createDeleteAuthorsResponse(DeleteAuthorsResponse value) {
        return new JAXBElement<DeleteAuthorsResponse>(_DeleteAuthorsResponse_QNAME, DeleteAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Find }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAuthors }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "getAuthors")
    public JAXBElement<GetAuthors> createGetAuthors(GetAuthors value) {
        return new JAXBElement<GetAuthors>(_GetAuthors_QNAME, GetAuthors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAuthorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "getAuthorsResponse")
    public JAXBElement<GetAuthorsResponse> createGetAuthorsResponse(GetAuthorsResponse value) {
        return new JAXBElement<GetAuthorsResponse>(_GetAuthorsResponse_QNAME, GetAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Update }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DaoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DaoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://alfasoft.it/authors", name = "DaoException")
    public JAXBElement<DaoException> createDaoException(DaoException value) {
        return new JAXBElement<DaoException>(_DaoException_QNAME, DaoException.class, null, value);
    }

}
