
package mynamespace.wsdl.authservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 *  WSDL File for AuthService
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AuthService", targetNamespace = "http://mynamespace/wsdl/AuthService", wsdlLocation = "file:/Users/antondahlin/IdeaProjects/HW2WebServicesLatest/wsdl/AuthService.wsdl")
public class AuthService
    extends Service
{

    private final static URL AUTHSERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTHSERVICE_EXCEPTION;
    private final static QName AUTHSERVICE_QNAME = new QName("http://mynamespace/wsdl/AuthService", "AuthService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/antondahlin/IdeaProjects/HW2WebServicesLatest/wsdl/AuthService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHSERVICE_WSDL_LOCATION = url;
        AUTHSERVICE_EXCEPTION = e;
    }

    public AuthService() {
        super(__getWsdlLocation(), AUTHSERVICE_QNAME);
    }

    public AuthService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHSERVICE_QNAME, features);
    }

    public AuthService(URL wsdlLocation) {
        super(wsdlLocation, AUTHSERVICE_QNAME);
    }

    public AuthService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHSERVICE_QNAME, features);
    }

    public AuthService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthPortType
     */
    @WebEndpoint(name = "AuthPort")
    public AuthPortType getAuthPort() {
        return super.getPort(new QName("http://mynamespace/wsdl/AuthService", "AuthPort"), AuthPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthPortType
     */
    @WebEndpoint(name = "AuthPort")
    public AuthPortType getAuthPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mynamespace/wsdl/AuthService", "AuthPort"), AuthPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHSERVICE_EXCEPTION!= null) {
            throw AUTHSERVICE_EXCEPTION;
        }
        return AUTHSERVICE_WSDL_LOCATION;
    }

}
