
package org.atgas.media.beyondtv.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BTVLibrary", targetNamespace = "http://www.snapstream.com/WebService", wsdlLocation = "http://localhost:8129/wsdl/BTVLibrary.asmx")
public class BTVLibrary
    extends Service
{

    private final static URL BTVLIBRARY_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.atgas.media.beyondtv.webservices.BTVLibrary.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.atgas.media.beyondtv.webservices.BTVLibrary.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8129/wsdl/BTVLibrary.asmx");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8129/wsdl/BTVLibrary.asmx', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BTVLIBRARY_WSDL_LOCATION = url;
    }

    public BTVLibrary(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BTVLibrary() {
        super(BTVLIBRARY_WSDL_LOCATION, new QName("http://www.snapstream.com/WebService", "BTVLibrary"));
    }

    /**
     * 
     * @return
     *     returns BTVLibrarySoap
     */
    @WebEndpoint(name = "BTVLibrarySoap")
    public BTVLibrarySoap getBTVLibrarySoap() {
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLibrarySoap"), BTVLibrarySoap.class);
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
        return super.getPort(new QName("http://www.snapstream.com/WebService", "BTVLibrarySoap"), BTVLibrarySoap.class, features);
    }

}
