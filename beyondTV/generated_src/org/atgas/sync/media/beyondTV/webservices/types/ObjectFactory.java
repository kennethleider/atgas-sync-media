
package org.atgas.sync.media.beyondTV.webservices.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.atgas.sync.media.beyondTV.webservices.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.atgas.sync.media.beyondTV.webservices.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PVSPropertyBag }
     * 
     */
    public PVSPropertyBag createPVSPropertyBag() {
        return new PVSPropertyBag();
    }

    /**
     * Create an instance of {@link PVSProperty }
     * 
     */
    public PVSProperty createPVSProperty() {
        return new PVSProperty();
    }

    /**
     * Create an instance of {@link ArrayOfPVSProperty }
     * 
     */
    public ArrayOfPVSProperty createArrayOfPVSProperty() {
        return new ArrayOfPVSProperty();
    }

}
