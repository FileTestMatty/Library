
package service;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IAuthorServirceImplService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/BookService/IAuthorServirceImplService?wsdl")
public class IAuthorServirceImplService
    extends Service
{

    private final static URL IAUTHORSERVIRCEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IAUTHORSERVIRCEIMPLSERVICE_EXCEPTION;
    private final static QName IAUTHORSERVIRCEIMPLSERVICE_QNAME = new QName("http://service/", "IAuthorServirceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BookService/IAuthorServirceImplService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IAUTHORSERVIRCEIMPLSERVICE_WSDL_LOCATION = url;
        IAUTHORSERVIRCEIMPLSERVICE_EXCEPTION = e;
    }

    public IAuthorServirceImplService() {
        super(__getWsdlLocation(), IAUTHORSERVIRCEIMPLSERVICE_QNAME);
    }

    public IAuthorServirceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IAUTHORSERVIRCEIMPLSERVICE_QNAME, features);
    }

    public IAuthorServirceImplService(URL wsdlLocation) {
        super(wsdlLocation, IAUTHORSERVIRCEIMPLSERVICE_QNAME);
    }

    public IAuthorServirceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IAUTHORSERVIRCEIMPLSERVICE_QNAME, features);
    }

    public IAuthorServirceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IAuthorServirceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAuthorService
     */
    @WebEndpoint(name = "IAuthorServirceImplPort")
    public IAuthorService getIAuthorServirceImplPort() {
        return super.getPort(new QName("http://service/", "IAuthorServirceImplPort"), IAuthorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAuthorService
     */
    @WebEndpoint(name = "IAuthorServirceImplPort")
    public IAuthorService getIAuthorServirceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "IAuthorServirceImplPort"), IAuthorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IAUTHORSERVIRCEIMPLSERVICE_EXCEPTION!= null) {
            throw IAUTHORSERVIRCEIMPLSERVICE_EXCEPTION;
        }
        return IAUTHORSERVIRCEIMPLSERVICE_WSDL_LOCATION;
    }

}
