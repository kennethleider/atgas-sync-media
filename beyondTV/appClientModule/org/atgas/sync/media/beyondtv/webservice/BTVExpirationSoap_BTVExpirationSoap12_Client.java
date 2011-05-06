
package com.snapstream.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-05-05T12:53:07.650-06:00
 * Generated source version: 2.4.0
 * 
 */
public final class BTVExpirationSoap_BTVExpirationSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.snapstream.com/WebService", "BTVExpiration");

    private BTVExpirationSoap_BTVExpirationSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = BTVExpiration.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BTVExpiration ss = new BTVExpiration(wsdlURL, SERVICE_NAME);
        BTVExpirationSoap port = ss.getBTVExpirationSoap12();  
        
        {
        System.out.println("Invoking setDaysLimitsByGuid...");
        java.lang.String _setDaysLimitsByGuid_authTicket = "";
        java.lang.String _setDaysLimitsByGuid_guid = "";
        int _setDaysLimitsByGuid_days = 0;
        port.setDaysLimitsByGuid(_setDaysLimitsByGuid_authTicket, _setDaysLimitsByGuid_guid, _setDaysLimitsByGuid_days);


        }
        {
        System.out.println("Invoking getShowLimitsByGuid...");
        java.lang.String _getShowLimitsByGuid_authTicket = "";
        java.lang.String _getShowLimitsByGuid_guid = "";
        int _getShowLimitsByGuid__return = port.getShowLimitsByGuid(_getShowLimitsByGuid_authTicket, _getShowLimitsByGuid_guid);
        System.out.println("getShowLimitsByGuid.result=" + _getShowLimitsByGuid__return);


        }
        {
        System.out.println("Invoking setDriveLimits...");
        java.lang.String _setDriveLimits_authTicket = "";
        com.snapstream.types.PVSPropertyBag _setDriveLimits_bag = null;
        port.setDriveLimits(_setDriveLimits_authTicket, _setDriveLimits_bag);


        }
        {
        System.out.println("Invoking getDriveLimitsByName...");
        java.lang.String _getDriveLimitsByName_authTicket = "";
        java.lang.String _getDriveLimitsByName_name = "";
        com.snapstream.types.PVSPropertyBag _getDriveLimitsByName__return = port.getDriveLimitsByName(_getDriveLimitsByName_authTicket, _getDriveLimitsByName_name);
        System.out.println("getDriveLimitsByName.result=" + _getDriveLimitsByName__return);


        }
        {
        System.out.println("Invoking setShowLimitsByGuid...");
        java.lang.String _setShowLimitsByGuid_authTicket = "";
        java.lang.String _setShowLimitsByGuid_guid = "";
        int _setShowLimitsByGuid_limit = 0;
        port.setShowLimitsByGuid(_setShowLimitsByGuid_authTicket, _setShowLimitsByGuid_guid, _setShowLimitsByGuid_limit);


        }
        {
        System.out.println("Invoking getMaxDaysByGuid...");
        java.lang.String _getMaxDaysByGuid_authTicket = "";
        java.lang.String _getMaxDaysByGuid_guid = "";
        int _getMaxDaysByGuid__return = port.getMaxDaysByGuid(_getMaxDaysByGuid_authTicket, _getMaxDaysByGuid_guid);
        System.out.println("getMaxDaysByGuid.result=" + _getMaxDaysByGuid__return);


        }

        System.exit(0);
    }

}
