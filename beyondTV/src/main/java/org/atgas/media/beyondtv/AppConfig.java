package org.atgas.media.beyondtv;

import org.atgas.media.beyondtv.webservices.BTVLicenseManager;
import org.atgas.media.beyondtv.webservices.BTVLicenseManagerSoap;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    private @Value("${beyondtv.network.license") String networkLicense;
    private @Value("${beyondtv.username") String username;
    private @Value("${beyondtv.password") String password;

    @Bean
     public PropertyConverter propertyConverter() {
        return new PropertyConverter();
    }

    @Bean
    public LibraryCollector libraryCollector() {
        return new LibraryCollector(btvSession(), propertyConverter());
    }

    @Bean
    public BTVSession btvSession() {
        return BTVSession.connect(networkLicense, username, password);
    }
}
