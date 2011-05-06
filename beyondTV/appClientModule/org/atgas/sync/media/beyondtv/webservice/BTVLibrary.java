
/*
 * 
 */

package com.snapstream.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-05-05T12:54:40.288-06:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "BTVLibrary", 
                  wsdlLocation = "file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVLibrary.asmx.xml",
                  targetNamespace = "http://www.snapstream.com/WebService") 
public class BTVLibrary extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.snapstream.com/WebService", "BTVLibrary");
    public final static QName BTVLibrarySoap = new QName("http://www.snapstream.com/WebService", "BTVLibrarySoap");
    public final static QName BTVLibrarySoap12 = new QName("http://www.snapstream.com/WebService", "BTVLibrarySoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVLibrary.asmx.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BTVLibrary.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVLibrary.asmx.xml");
        }
        WSDL_LOCATION = url;
    }

    public BTVLibrary(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BTVLibrary(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVLibrary() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns BTVLibrarySoap
     */
    @WebEndpoint(name = "BTVLibrarySoap")
    public BTVLibrarySoap getBTVLibrarySoap() {
        return super.getPort(BTVLibrarySoap, BTVLibrarySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVLibrarySoap
     */
    @WebEndpoint(name = "BTVLibrarySoap")
    public BTVLibrarySoap getBTVLibrarySoap(WebServiceFeature... features) {
        return super.getPort(BTVLibrarySoap, BTVLibrarySoap.class, features);
    }
    /**
     * 
     * @return
     *     returns BTVLibrarySoap
     */
    @WebEndpoint(name = "BTVLibrarySoap12")
    public BTVLibrarySoap getBTVLibrarySoap12() {
        return super.getPort(BTVLibrarySoap12, BTVLibrarySoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVLibrarySoap
     */
    @WebEndpoint(name = "BTVLibrarySoap12")
    public BTVLibrarySoap getBTVLibrarySoap12(WebServiceFeature... features) {
        return super.getPort(BTVLibrarySoap12, BTVLibrarySoap.class, features);
    }

}
