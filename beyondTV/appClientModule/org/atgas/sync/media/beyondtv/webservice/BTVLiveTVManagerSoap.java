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
 * 2011-05-05T12:55:00.768-06:00
 * Generated source version: 2.4.0
 * 
 */
 
@WebService(targetNamespace = "http://www.snapstream.com/WebService", name = "BTVLiveTVManagerSoap")
@XmlSeeAlso({com.snapstream.types.ObjectFactory.class, ObjectFactory.class})
public interface BTVLiveTVManagerSoap {

    @WebResult(name = "GetSessionsResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSessions", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSessions")
    @WebMethod(operationName = "GetSessions", action = "http://www.snapstream.com/WebService/GetSessions")
    @ResponseWrapper(localName = "GetSessionsResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSessionsResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getSessions(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @RequestWrapper(localName = "SetChannel", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SetChannel")
    @WebMethod(operationName = "SetChannel", action = "http://www.snapstream.com/WebService/SetChannel")
    @ResponseWrapper(localName = "SetChannelResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SetChannelResponse")
    public void setChannel(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid,
        @WebParam(name = "channel", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String channel
    );

    @WebResult(name = "NewWebSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewWebSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewWebSession")
    @WebMethod(operationName = "NewWebSession", action = "http://www.snapstream.com/WebService/NewWebSession")
    @ResponseWrapper(localName = "NewWebSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewWebSessionResponse")
    public java.lang.String newWebSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "NewSessionWithErrorConditionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewSessionWithErrorCondition", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSessionWithErrorCondition")
    @WebMethod(operationName = "NewSessionWithErrorCondition", action = "http://www.snapstream.com/WebService/NewSessionWithErrorCondition")
    @ResponseWrapper(localName = "NewSessionWithErrorConditionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSessionWithErrorConditionResponse")
    public com.snapstream.webservice.ArrayOfAnyType newSessionWithErrorCondition(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sessionType", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sessionType,
        @WebParam(name = "uniqueChannelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelID
    );

    @WebResult(name = "ExistingWebSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ExistingWebSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingWebSession")
    @WebMethod(operationName = "ExistingWebSession", action = "http://www.snapstream.com/WebService/ExistingWebSession")
    @ResponseWrapper(localName = "ExistingWebSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingWebSessionResponse")
    public java.lang.String existingWebSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sourceGuid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sourceGuid
    );

    @WebResult(name = "ExistingSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ExistingSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingSession")
    @WebMethod(operationName = "ExistingSession", action = "http://www.snapstream.com/WebService/ExistingSession")
    @ResponseWrapper(localName = "ExistingSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingSessionResponse")
    public java.lang.String existingSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sessionType", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sessionType,
        @WebParam(name = "existingGuid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String existingGuid
    );

    @WebResult(name = "GetSessionPropsResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSessionProps", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSessionProps")
    @WebMethod(operationName = "GetSessionProps", action = "http://www.snapstream.com/WebService/GetSessionProps")
    @ResponseWrapper(localName = "GetSessionPropsResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSessionPropsResponse")
    public com.snapstream.types.PVSPropertyBag getSessionProps(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @RequestWrapper(localName = "ForceChannel", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ForceChannel")
    @WebMethod(operationName = "ForceChannel", action = "http://www.snapstream.com/WebService/ForceChannel")
    @ResponseWrapper(localName = "ForceChannelResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ForceChannelResponse")
    public void forceChannel(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid,
        @WebParam(name = "guidSource", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guidSource,
        @WebParam(name = "channel", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String channel
    );

    @WebResult(name = "GetRecordingResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetRecording", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetRecording")
    @WebMethod(operationName = "GetRecording", action = "http://www.snapstream.com/WebService/GetRecording")
    @ResponseWrapper(localName = "GetRecordingResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetRecordingResponse")
    public com.snapstream.types.PVSPropertyBag getRecording(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @RequestWrapper(localName = "EndSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.EndSession")
    @WebMethod(operationName = "EndSession", action = "http://www.snapstream.com/WebService/EndSession")
    @ResponseWrapper(localName = "EndSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.EndSessionResponse")
    public void endSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @WebResult(name = "NewSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSession")
    @WebMethod(operationName = "NewSession", action = "http://www.snapstream.com/WebService/NewSession")
    @ResponseWrapper(localName = "NewSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSessionResponse")
    public java.lang.String newSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sessionType", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sessionType,
        @WebParam(name = "uniqueChannelId", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String uniqueChannelId
    );

    @WebResult(name = "GetChannelResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetChannel", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetChannel")
    @WebMethod(operationName = "GetChannel", action = "http://www.snapstream.com/WebService/GetChannel")
    @ResponseWrapper(localName = "GetChannelResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetChannelResponse")
    public java.lang.String getChannel(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @WebResult(name = "SetChannelWithErrorConditionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "SetChannelWithErrorCondition", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SetChannelWithErrorCondition")
    @WebMethod(operationName = "SetChannelWithErrorCondition", action = "http://www.snapstream.com/WebService/SetChannelWithErrorCondition")
    @ResponseWrapper(localName = "SetChannelWithErrorConditionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.SetChannelWithErrorConditionResponse")
    public int setChannelWithErrorCondition(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid,
        @WebParam(name = "channel", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String channel
    );

    @WebResult(name = "IsRecordingResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "IsRecording", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.IsRecording")
    @WebMethod(operationName = "IsRecording", action = "http://www.snapstream.com/WebService/IsRecording")
    @ResponseWrapper(localName = "IsRecordingResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.IsRecordingResponse")
    public boolean isRecording(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @WebResult(name = "GetSignalStrengthResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetSignalStrength", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSignalStrength")
    @WebMethod(operationName = "GetSignalStrength", action = "http://www.snapstream.com/WebService/GetSignalStrength")
    @ResponseWrapper(localName = "GetSignalStrengthResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetSignalStrengthResponse")
    public int getSignalStrength(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @WebResult(name = "NewSourceSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewSourceSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSourceSession")
    @WebMethod(operationName = "NewSourceSession", action = "http://www.snapstream.com/WebService/NewSourceSession")
    @ResponseWrapper(localName = "NewSourceSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSourceSessionResponse")
    public java.lang.String newSourceSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket
    );

    @WebResult(name = "GetImminentRecordingsResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetImminentRecordings", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetImminentRecordings")
    @WebMethod(operationName = "GetImminentRecordings", action = "http://www.snapstream.com/WebService/GetImminentRecordings")
    @ResponseWrapper(localName = "GetImminentRecordingsResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.GetImminentRecordingsResponse")
    public com.snapstream.webservice.ArrayOfPVSPropertyBag getImminentRecordings(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @RequestWrapper(localName = "KeepAlive", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.KeepAlive")
    @WebMethod(operationName = "KeepAlive", action = "http://www.snapstream.com/WebService/KeepAlive")
    @ResponseWrapper(localName = "KeepAliveResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.KeepAliveResponse")
    public void keepAlive(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guid
    );

    @WebResult(name = "NewSessionOnSourceResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewSessionOnSource", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSessionOnSource")
    @WebMethod(operationName = "NewSessionOnSource", action = "http://www.snapstream.com/WebService/NewSessionOnSource")
    @ResponseWrapper(localName = "NewSessionOnSourceResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSessionOnSourceResponse")
    public java.lang.String newSessionOnSource(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sessionType", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sessionType,
        @WebParam(name = "guidSource", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String guidSource
    );

    @WebResult(name = "ExistingSourceSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ExistingSourceSession", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingSourceSession")
    @WebMethod(operationName = "ExistingSourceSession", action = "http://www.snapstream.com/WebService/ExistingSourceSession")
    @ResponseWrapper(localName = "ExistingSourceSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.ExistingSourceSessionResponse")
    public java.lang.String existingSourceSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "sourceGuid", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String sourceGuid
    );

    @WebResult(name = "NewSourceSessionOnChannelResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "NewSourceSessionOnChannel", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSourceSessionOnChannel")
    @WebMethod(operationName = "NewSourceSessionOnChannel", action = "http://www.snapstream.com/WebService/NewSourceSessionOnChannel")
    @ResponseWrapper(localName = "NewSourceSessionOnChannelResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "com.snapstream.webservice.NewSourceSessionOnChannelResponse")
    public java.lang.String newSourceSessionOnChannel(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String authTicket,
        @WebParam(name = "channelID", targetNamespace = "http://www.snapstream.com/WebService")
        java.lang.String channelID
    );
}
