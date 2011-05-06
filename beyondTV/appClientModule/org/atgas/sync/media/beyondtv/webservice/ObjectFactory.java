
package com.snapstream.webservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.snapstream.webservice package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.snapstream.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLastIndexChangedResponse }
     * 
     */
    public GetLastIndexChangedResponse createGetLastIndexChangedResponse() {
        return new GetLastIndexChangedResponse();
    }

    /**
     * Create an instance of {@link GetLastIndexChanged }
     * 
     */
    public GetLastIndexChanged createGetLastIndexChanged() {
        return new GetLastIndexChanged();
    }

    /**
     * Create an instance of {@link GetEpisodesByKeywordWithLimitResponse }
     * 
     */
    public GetEpisodesByKeywordWithLimitResponse createGetEpisodesByKeywordWithLimitResponse() {
        return new GetEpisodesByKeywordWithLimitResponse();
    }

    /**
     * Create an instance of {@link AddNotificationRecordings }
     * 
     */
    public AddNotificationRecordings createAddNotificationRecordings() {
        return new AddNotificationRecordings();
    }

    /**
     * Create an instance of {@link GetEpisodesByKeywordWithLimit }
     * 
     */
    public GetEpisodesByKeywordWithLimit createGetEpisodesByKeywordWithLimit() {
        return new GetEpisodesByKeywordWithLimit();
    }

    /**
     * Create an instance of {@link AddNotificationRecordingsResponse }
     * 
     */
    public AddNotificationRecordingsResponse createAddNotificationRecordingsResponse() {
        return new AddNotificationRecordingsResponse();
    }

}
