
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
@WebServiceClient(name = "BTVDispatcher", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVDispatcher.asmx")
public class BTVDispatcher
    extends Service
{

    private final static URL BTVDISPATCHER_WSDL_LOCATION;
    private final static WebServiceException BTVDISPATCHER_EXCEPTION;
    private final static QName BTVDISPATCHER_QNAME = new QName("http://www.snapstream.com/WebService", "BTVDispatcher");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8129/wsdl/BTVDispatcher.asmx");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BTVDISPATCHER_WSDL_LOCATION = url;
        BTVDISPATCHER_EXCEPTION = e;
    }

    public BTVDispatcher() {
        super(__getWsdlLocation(), BTVDISPATCHER_QNAME);
    }

    public BTVDispatcher(WebServiceFeature... features) {
        super(__getWsdlLocation(), BTVDISPATCHER_QNAME, features);
    }

    public BTVDispatcher(URL wsdlLocation) {
        super(wsdlLocation, BTVDISPATCHER_QNAME);
    }

    public BTVDispatcher(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BTVDISPATCHER_QNAME, features);
    }

    public BTVDispatcher(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVDispatcher(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BTVDispatcherSoap
     */
    @WebEndpoint(name = "BTVDispatcherSoap")
    public BTVDispatcherSoap getBTVDispatcherSoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVDispatcherSoap"), BTVDispatcherSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVDispatcherSoap
     */
    @WebEndpoint(name = "BTVDispatcherSoap")
    public BTVDispatcherSoap getBTVDispatcherSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVDispatcherSoap"), BTVDispatcherSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BTVDISPATCHER_EXCEPTION!= null) {
            throw BTVDISPATCHER_EXCEPTION;
        }
        return BTVDISPATCHER_WSDL_LOCATION;
    }

}