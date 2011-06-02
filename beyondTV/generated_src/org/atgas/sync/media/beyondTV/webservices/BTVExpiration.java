
package org.atgas.sync.media.beyondTV.webservices;

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
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BTVExpiration", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVExpiration.asmx")
public class BTVExpiration
    extends Service
{

    private final static URL BTVEXPIRATION_WSDL_LOCATION;
    private final static WebServiceException BTVEXPIRATION_EXCEPTION;
    private final static QName BTVEXPIRATION_QNAME = new QName("http://www.snapstream.com/WebService", "BTVExpiration");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8129/wsdl/BTVExpiration.asmx");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BTVEXPIRATION_WSDL_LOCATION = url;
        BTVEXPIRATION_EXCEPTION = e;
    }

    public BTVExpiration() {
        super(__getWsdlLocation(), BTVEXPIRATION_QNAME);
    }

    public BTVExpiration(WebServiceFeature... features) {
        super(__getWsdlLocation(), BTVEXPIRATION_QNAME, features);
    }

    public BTVExpiration(URL wsdlLocation) {
        super(wsdlLocation, BTVEXPIRATION_QNAME);
    }

    public BTVExpiration(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BTVEXPIRATION_QNAME, features);
    }

    public BTVExpiration(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVExpiration(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BTVExpirationSoap
     */
    @WebEndpoint(name = "BTVExpirationSoap")
    public BTVExpirationSoap getBTVExpirationSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVExpirationSoap"), BTVExpirationSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVExpirationSoap
     */
    @WebEndpoint(name = "BTVExpirationSoap")
    public BTVExpirationSoap getBTVExpirationSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVExpirationSoap"), BTVExpirationSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BTVEXPIRATION_EXCEPTION!= null) {
            throw BTVEXPIRATION_EXCEPTION;
        }
        return BTVEXPIRATION_WSDL_LOCATION;
    }

}
