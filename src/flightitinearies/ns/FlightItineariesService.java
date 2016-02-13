
package flightitinearies.ns;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FlightItineariesService", targetNamespace = "ns.flightItinearies", wsdlLocation = "http://0.0.0.0:1337/FlightItinearies?wsdl")
public class FlightItineariesService
    extends Service
{

    private final static URL FLIGHTITINEARIESSERVICE_WSDL_LOCATION;
    private final static WebServiceException FLIGHTITINEARIESSERVICE_EXCEPTION;
    private final static QName FLIGHTITINEARIESSERVICE_QNAME = new QName("ns.flightItinearies", "FlightItineariesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://0.0.0.0:1337/FlightItinearies?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FLIGHTITINEARIESSERVICE_WSDL_LOCATION = url;
        FLIGHTITINEARIESSERVICE_EXCEPTION = e;
    }

    public FlightItineariesService() {
        super(__getWsdlLocation(), FLIGHTITINEARIESSERVICE_QNAME);
    }

    public FlightItineariesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FLIGHTITINEARIESSERVICE_QNAME, features);
    }

    public FlightItineariesService(URL wsdlLocation) {
        super(wsdlLocation, FLIGHTITINEARIESSERVICE_QNAME);
    }

    public FlightItineariesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FLIGHTITINEARIESSERVICE_QNAME, features);
    }

    public FlightItineariesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightItineariesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FlightItinearies
     */
    @WebEndpoint(name = "FlightItineariesPort")
    public FlightItinearies getFlightItineariesPort() {
        return super.getPort(new QName("ns.flightItinearies", "FlightItineariesPort"), FlightItinearies.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FlightItinearies
     */
    @WebEndpoint(name = "FlightItineariesPort")
    public FlightItinearies getFlightItineariesPort(WebServiceFeature... features) {
        return super.getPort(new QName("ns.flightItinearies", "FlightItineariesPort"), FlightItinearies.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FLIGHTITINEARIESSERVICE_EXCEPTION!= null) {
            throw FLIGHTITINEARIESSERVICE_EXCEPTION;
        }
        return FLIGHTITINEARIESSERVICE_WSDL_LOCATION;
    }

}