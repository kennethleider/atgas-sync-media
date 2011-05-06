
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
 * 2011-05-05T12:55:39.217-06:00
 * Generated source version: 2.4.0
 * 
 */


@WebServiceClient(name = "BTVNotifier", 
                  wsdlLocation = "file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVNotifier.asmx.xml",
                  targetNamespace = "http://www.snapstream.com/WebService") 
public class BTVNotifier extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.snapstream.com/WebService", "BTVNotifier");
    public final static QName BTVNotifierSoap12 = new QName("http://www.snapstream.com/WebService", "BTVNotifierSoap12");
    public final static QName BTVNotifierSoap = new QName("http://www.snapstream.com/WebService", "BTVNotifierSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVNotifier.asmx.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BTVNotifier.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/kleider/lm/repositories/atgas-sync-media/beyondTV/wsdl/BTVNotifier.asmx.xml");
        }
        WSDL_LOCATION = url;
    }

    public BTVNotifier(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BTVNotifier(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVNotifier() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns BTVNotifierSoap
     */
    @WebEndpoint(name = "BTVNotifierSoap12")
    public BTVNotifierSoap getBTVNotifierSoap12() {
        return super.getPort(BTVNotifierSoap12, BTVNotifierSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVNotifierSoap
     */
    @WebEndpoint(name = "BTVNotifierSoap12")
    public BTVNotifierSoap getBTVNotifierSoap12(WebServiceFeature... features) {
        return super.getPort(BTVNotifierSoap12, BTVNotifierSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns BTVNotifierSoap
     */
    @WebEndpoint(name = "BTVNotifierSoap")
    public BTVNotifierSoap getBTVNotifierSoap() {
        return super.getPort(BTVNotifierSoap, BTVNotifierSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BTVNotifierSoap
     */
    @WebEndpoint(name = "BTVNotifierSoap")
    public BTVNotifierSoap getBTVNotifierSoap(WebServiceFeature... features) {
        return super.getPort(BTVNotifierSoap, BTVNotifierSoap.class, features);
    }

}
