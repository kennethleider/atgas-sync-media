package com.snapstream.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-05-05T12:53:47.735-06:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://www.snapstream.com/WebService", name = "BTVGuideDataSoap")
@XmlSeeAlso({com.snapstream.types.ObjectFactory.class, ObjectFactory.class})
public interface BTVGuideDataSoap {

    @WebResult(name = "GetEpisodesByKeywordWithOptionsResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByKeywordWithOptions", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeywordWithOptions")
    @WebMethod(operationName = "GetEpisodesByKeywordWithOptions", action = "http://www.snapstream.com/WebService/GetEpisodesByKeywordWithOptions")
    @ResponseWrapper(localName = "GetEpisodesByKeywordWithOptionsResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeywordWithOptionsResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByKeywordWithOptions(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "keyword", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String keyword,
        @WebParam(name = "titleSearch", targetNamespace = "http://www.snapstream.com/WebService")
        int titleSearch,
        @WebParam(name = "descSearch", targetNamespace = "http://www.snapstream.com/WebService")
        int descSearch,
        @WebParam(name = "actorSearch", targetNamespace = "http://www.snapstream.com/WebService")
        int actorSearch,
        @WebParam(name = "limit", targetNamespace = "http://www.snapstream.com/WebService")
        long limit
    );

    @WebResult(name = "GetSeriesCount2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesCount2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCount2")
    @WebMethod(operationName = "GetSeriesCount2", action = "http://www.snapstream.com/WebService/GetSeriesCount2")
    @ResponseWrapper(localName = "GetSeriesCount2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCount2Response")
    public long getSeriesCount2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "GetEpisodesByStationAndTimeRangesResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByStationAndTimeRanges", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndTimeRanges")
    @WebMethod(operationName = "GetEpisodesByStationAndTimeRanges", action = "http://www.snapstream.com/WebService/GetEpisodesByStationAndTimeRanges")
    @ResponseWrapper(localName = "GetEpisodesByStationAndTimeRangesResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndTimeRangesResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByStationAndTimeRanges(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelIDStart", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelIDStart,
        @WebParam(name = "uniqueChannelIDEnd", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelIDEnd,
        @WebParam(name = "timeStart", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeStart,
        @WebParam(name = "timeEnd", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeEnd
    );

    @WebResult(name = "GetLastUpdateTimeResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetLastUpdateTime", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetLastUpdateTime")
    @WebMethod(operationName = "GetLastUpdateTime", action = "http://www.snapstream.com/WebService/GetLastUpdateTime")
    @ResponseWrapper(localName = "GetLastUpdateTimeResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetLastUpdateTimeResponse")
    public java.math.BigInteger getLastUpdateTime(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "GetEpisodesByRange2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByRange2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByRange2")
    @WebMethod(operationName = "GetEpisodesByRange2", action = "http://www.snapstream.com/WebService/GetEpisodesByRange2")
    @ResponseWrapper(localName = "GetEpisodesByRange2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByRange2Response")
    public com.snapstream.webservice.ArrayOfArrayOfString getEpisodesByRange2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelIDStart", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelIDStart,
        @WebParam(name = "uniqueChannelIDEnd", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelIDEnd,
        @WebParam(name = "timeStart", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeStart,
        @WebParam(name = "timeEnd", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeEnd
    );

    @WebResult(name = "GetSeries2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeries2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeries2")
    @WebMethod(operationName = "GetSeries2", action = "http://www.snapstream.com/WebService/GetSeries2")
    @ResponseWrapper(localName = "GetSeries2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeries2Response")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeries2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uiStart", targetNamespace = "http://www.snapstream.com/WebService")
        long uiStart,
        @WebParam(name = "uiResults", targetNamespace = "http://www.snapstream.com/WebService")
        long uiResults
    );

    @WebResult(name = "GetEpisodesByRange3Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByRange3", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByRange3")
    @WebMethod(operationName = "GetEpisodesByRange3", action = "http://www.snapstream.com/WebService/GetEpisodesByRange3")
    @ResponseWrapper(localName = "GetEpisodesByRange3Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByRange3Response")
    public com.snapstream.webservice.ArrayOfArrayOfString getEpisodesByRange3(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "channels", targetNamespace = "http://www.snapstream.com/WebService")
        com.snapstream.webservice.ArrayOfString channels,
        @WebParam(name = "timeStart", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeStart,
        @WebParam(name = "timeEnd", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger timeEnd
    );

    @WebResult(name = "GetSeriesCollectionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesCollection", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCollection")
    @WebMethod(operationName = "GetSeriesCollection", action = "http://www.snapstream.com/WebService/GetSeriesCollection")
    @ResponseWrapper(localName = "GetSeriesCollectionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCollectionResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeriesCollection(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "GetFirstEpisodeBySeriesIDResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetFirstEpisodeBySeriesID", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetFirstEpisodeBySeriesID")
    @WebMethod(operationName = "GetFirstEpisodeBySeriesID", action = "http://www.snapstream.com/WebService/GetFirstEpisodeBySeriesID")
    @ResponseWrapper(localName = "GetFirstEpisodeBySeriesIDResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetFirstEpisodeBySeriesIDResponse")
    public com.snapstream.types.PVSPropertyBag getFirstEpisodeBySeriesID(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "epgID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String epgID
    );

    @WebResult(name = "GetEpisodesBySeriesIDResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesBySeriesID", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesBySeriesID")
    @WebMethod(operationName = "GetEpisodesBySeriesID", action = "http://www.snapstream.com/WebService/GetEpisodesBySeriesID")
    @ResponseWrapper(localName = "GetEpisodesBySeriesIDResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesBySeriesIDResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesBySeriesID(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "epgID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String epgID
    );

    @WebResult(name = "GetEpisodesByStationResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByStation", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStation")
    @WebMethod(operationName = "GetEpisodesByStation", action = "http://www.snapstream.com/WebService/GetEpisodesByStation")
    @ResponseWrapper(localName = "GetEpisodesByStationResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByStation(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID
    );

    @WebResult(name = "GetSeriesCountResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesCount", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCount")
    @WebMethod(operationName = "GetSeriesCount", action = "http://www.snapstream.com/WebService/GetSeriesCount")
    @ResponseWrapper(localName = "GetSeriesCountResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesCountResponse")
    public long getSeriesCount(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "GetEpisodesByStationAndSeriesID2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByStationAndSeriesID2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndSeriesID2")
    @WebMethod(operationName = "GetEpisodesByStationAndSeriesID2", action = "http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID2")
    @ResponseWrapper(localName = "GetEpisodesByStationAndSeriesID2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndSeriesID2Response")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByStationAndSeriesID2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID,
        @WebParam(name = "epgID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String epgID
    );

    @WebResult(name = "SearchByTitleResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "SearchByTitle", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SearchByTitle")
    @WebMethod(operationName = "SearchByTitle", action = "http://www.snapstream.com/WebService/SearchByTitle")
    @ResponseWrapper(localName = "SearchByTitleResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SearchByTitleResponse")
    public long searchByTitle(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "partialTitle", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String partialTitle
    );

    @WebResult(name = "SearchByTitle2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "SearchByTitle2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SearchByTitle2")
    @WebMethod(operationName = "SearchByTitle2", action = "http://www.snapstream.com/WebService/SearchByTitle2")
    @ResponseWrapper(localName = "SearchByTitle2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SearchByTitle2Response")
    public long searchByTitle2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "partialTitle", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String partialTitle
    );

    @WebResult(name = "GetEpisodesByKeywordWithLimitResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByKeywordWithLimit", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeywordWithLimit")
    @WebMethod(operationName = "GetEpisodesByKeywordWithLimit", action = "http://www.snapstream.com/WebService/GetEpisodesByKeywordWithLimit")
    @ResponseWrapper(localName = "GetEpisodesByKeywordWithLimitResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeywordWithLimitResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByKeywordWithLimit(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "keyword", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String keyword,
        @WebParam(name = "limit", targetNamespace = "http://www.snapstream.com/WebService")
        long limit
    );

    @WebResult(name = "GetCategoriesResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetCategories", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetCategories")
    @WebMethod(operationName = "GetCategories", action = "http://www.snapstream.com/WebService/GetCategories")
    @ResponseWrapper(localName = "GetCategoriesResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetCategoriesResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getCategories(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "bstrCategory", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String bstrCategory
    );

    @WebResult(name = "GetFirstEpisodeByStationAndSeriesID2Result", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetFirstEpisodeByStationAndSeriesID2", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetFirstEpisodeByStationAndSeriesID2")
    @WebMethod(operationName = "GetFirstEpisodeByStationAndSeriesID2", action = "http://www.snapstream.com/WebService/GetFirstEpisodeByStationAndSeriesID2")
    @ResponseWrapper(localName = "GetFirstEpisodeByStationAndSeriesID2Response", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetFirstEpisodeByStationAndSeriesID2Response")
    public com.snapstream.types.PVSPropertyBag getFirstEpisodeByStationAndSeriesID2(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID,
        @WebParam(name = "epgID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String epgID
    );

    @WebResult(name = "GetSeriesByRangeResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesByRange", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByRange")
    @WebMethod(operationName = "GetSeriesByRange", action = "http://www.snapstream.com/WebService/GetSeriesByRange")
    @ResponseWrapper(localName = "GetSeriesByRangeResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByRangeResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeriesByRange(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uiStart", targetNamespace = "http://www.snapstream.com/WebService")
        long uiStart,
        @WebParam(name = "uiEnd", targetNamespace = "http://www.snapstream.com/WebService")
        long uiEnd
    );

    @WebResult(name = "GetEpisodesByKeywordResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByKeyword", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeyword")
    @WebMethod(operationName = "GetEpisodesByKeyword", action = "http://www.snapstream.com/WebService/GetEpisodesByKeyword")
    @ResponseWrapper(localName = "GetEpisodesByKeywordResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByKeywordResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByKeyword(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "keyword", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String keyword
    );

    @WebResult(name = "GetSeriesByCategoryResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesByCategory", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByCategory")
    @WebMethod(operationName = "GetSeriesByCategory", action = "http://www.snapstream.com/WebService/GetSeriesByCategory")
    @ResponseWrapper(localName = "GetSeriesByCategoryResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByCategoryResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeriesByCategory(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "bstrCategory", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String bstrCategory,
        @WebParam(name = "bstrSubcategory", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String bstrSubcategory
    );

    @WebResult(name = "GetEpisodesByStationAndSeriesIDResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodesByStationAndSeriesID", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndSeriesID")
    @WebMethod(operationName = "GetEpisodesByStationAndSeriesID", action = "http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID")
    @ResponseWrapper(localName = "GetEpisodesByStationAndSeriesIDResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodesByStationAndSeriesIDResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getEpisodesByStationAndSeriesID(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID,
        @WebParam(name = "epgID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String epgID,
        @WebParam(name = "time", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger time
    );

    @WebResult(name = "GetEpisodeByStationAndTimeResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEpisodeByStationAndTime", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodeByStationAndTime")
    @WebMethod(operationName = "GetEpisodeByStationAndTime", action = "http://www.snapstream.com/WebService/GetEpisodeByStationAndTime")
    @ResponseWrapper(localName = "GetEpisodeByStationAndTimeResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetEpisodeByStationAndTimeResponse")
    public com.snapstream.types.PVSPropertyBag getEpisodeByStationAndTime(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID,
        @WebParam(name = "time", targetNamespace = "http://www.snapstream.com/WebService")
        java.math.BigInteger time
    );

    @RequestWrapper(localName = "GetDataExtents", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetDataExtents")
    @WebMethod(operationName = "GetDataExtents", action = "http://www.snapstream.com/WebService/GetDataExtents")
    @ResponseWrapper(localName = "GetDataExtentsResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetDataExtentsResponse")
    public void getDataExtents(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(mode = WebParam.Mode.OUT, name = "GetDataExtentsResult", targetNamespace = "http://www.snapstream.com/WebService")
        javax.xml.ws.Holder<java.math.BigInteger> getDataExtentsResult,
        @WebParam(mode = WebParam.Mode.OUT, name = "maximum", targetNamespace = "http://www.snapstream.com/WebService")
        javax.xml.ws.Holder<java.math.BigInteger> maximum
    );

    @WebResult(name = "GetSeriesByKeywordWithLimitResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesByKeywordWithLimit", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByKeywordWithLimit")
    @WebMethod(operationName = "GetSeriesByKeywordWithLimit", action = "http://www.snapstream.com/WebService/GetSeriesByKeywordWithLimit")
    @ResponseWrapper(localName = "GetSeriesByKeywordWithLimitResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByKeywordWithLimitResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeriesByKeywordWithLimit(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "keyword", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String keyword,
        @WebParam(name = "limit", targetNamespace = "http://www.snapstream.com/WebService")
        long limit
    );

    @WebResult(name = "GetSeriesByKeywordResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSeriesByKeyword", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByKeyword")
    @WebMethod(operationName = "GetSeriesByKeyword", action = "http://www.snapstream.com/WebService/GetSeriesByKeyword")
    @ResponseWrapper(localName = "GetSeriesByKeywordResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSeriesByKeywordResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSeriesByKeyword(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "keyword", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String keyword
    );
}
