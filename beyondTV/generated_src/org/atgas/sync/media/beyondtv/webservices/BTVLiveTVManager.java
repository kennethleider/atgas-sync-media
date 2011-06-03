
package org.atgas.sync.media.beyondtv.webservices;

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
@WebServiceClient(name = "BTVLiveTVManager", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVLiveTVManager.asmx")
public class BTVLiveTVManager
    extends Service
{

    private final static URL BTVLIVETVMANAGER_WSDL_LOCATION;
    private final static WebServiceException BTVLIVETVMANAGER_EXCEPTION;
    private final static QName BTVLIVETVMANAGER_QNAME = new QName("http://www.snapstream.com/WebService", "BTVLiveTVManager");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8129/wsdl/BTVLiveTVManager.asmx");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BTVLIVETVMANAGER_WSDL_LOCATION = url;
        BTVLIVETVMANAGER_EXCEPTION = e;
    }

    public BTVLiveTVManager() {
        super(__getWsdlLocation(), BTVLIVETVMANAGER_QNAME);
    }

    public BTVLiveTVManager(WebServiceFeature... features) {
        super(__getWsdlLocation(), BTVLIVETVMANAGER_QNAME, features);
    }

    public BTVLiveTVManager(URL wsdlLocation) {
        super(wsdlLocation, BTVLIVETVMANAGER_QNAME);
    }

    public BTVLiveTVManager(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BTVLIVETVMANAGER_QNAME, features);
    }

    public BTVLiveTVManager(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVLiveTVManager(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BTVLiveTVManagerSoap
     */
    @WebEndpoint(name = "BTVLiveTVManagerSoap")
    public BTVLiveTVManagerSoap getBTVLiveTVManagerSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLiveTVManagerSoap"), BTVLiveTVManagerSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVLiveTVManagerSoap
     */
    @WebEndpoint(name = "BTVLiveTVManagerSoap")
    public BTVLiveTVManagerSoap getBTVLiveTVManagerSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLiveTVManagerSoap"), BTVLiveTVManagerSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BTVLIVETVMANAGER_EXCEPTION!= null) {
            throw BTVLIVETVMANAGER_EXCEPTION;
        }
        return BTVLIVETVMANAGER_WSDL_LOCATION;
    }

}