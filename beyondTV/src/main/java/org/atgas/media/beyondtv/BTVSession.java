package org.atgas.media.beyondtv;

import org.atgas.media.beyondtv.webservices.BTVLicenseManager;
import org.atgas.media.beyondtv.webservices.BTVLicenseManagerSoap;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class BTVSession {

    public final String ticket;
    private final BTVLicenseManagerSoap manager;


    public BTVSession(BTVLicenseManagerSoap manager, String ticket) {
        this.manager = manager;
        this.ticket = ticket;
    }

    public void close() {
        manager.logoff(ticket);
    }

    public static BTVSession connect(String networkLicense, String username, String password) {
        BTVLicenseManagerSoap manager = new BTVLicenseManager().getBTVLicenseManagerSoap();
        PVSPropertyBag logon = manager.logon(networkLicense, username, password);

        String ticket = new PropertyConverter().convert(logon).get("AuthTicket");
        return new BTVSession(manager, ticket);
    }
}
