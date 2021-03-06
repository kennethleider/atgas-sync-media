
package org.atgas.media.beyondtv.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.atgas.media.beyondtv.webservices.btvbatchprocessor.ArrayOfPVSPropertyBag;
import org.atgas.media.beyondtv.webservices.btvbatchprocessor.ArrayOfString;
import org.atgas.media.beyondtv.webservices.types.PVSPropertyBag;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BTVTaskListProcessorSoap", targetNamespace = "http://www.snapstream.com/WebService")
@XmlSeeAlso({
    org.atgas.media.beyondtv.webservices.types.ObjectFactory.class,
    org.atgas.media.beyondtv.webservices.btvbatchprocessor.ObjectFactory.class
})
public interface BTVTaskListProcessorSoap {


    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitRecompress", action = "http://www.snapstream.com/WebService/SubmitRecompress")
    @RequestWrapper(localName = "SubmitRecompress", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitRecompress")
    @ResponseWrapper(localName = "SubmitRecompressResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitRecompressResponse")
    public void submitRecompress(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bags
     */
    @WebMethod(operationName = "SubmitBatchRecompress", action = "http://www.snapstream.com/WebService/SubmitBatchRecompress")
    @RequestWrapper(localName = "SubmitBatchRecompress", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchRecompress")
    @ResponseWrapper(localName = "SubmitBatchRecompressResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchRecompressResponse")
    public void submitBatchRecompress(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bags", targetNamespace = "http://www.snapstream.com/WebService")
        ArrayOfPVSPropertyBag bags);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitConvertSSXToAVI", action = "http://www.snapstream.com/WebService/SubmitConvertSSXToAVI")
    @RequestWrapper(localName = "SubmitConvertSSXToAVI", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitConvertSSXToAVI")
    @ResponseWrapper(localName = "SubmitConvertSSXToAVIResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitConvertSSXToAVIResponse")
    public void submitConvertSSXToAVI(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitChapterList", action = "http://www.snapstream.com/WebService/SubmitChapterList")
    @RequestWrapper(localName = "SubmitChapterList", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitChapterList")
    @ResponseWrapper(localName = "SubmitChapterListResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitChapterListResponse")
    public void submitChapterList(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitEmail", action = "http://www.snapstream.com/WebService/SubmitEmail")
    @RequestWrapper(localName = "SubmitEmail", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitEmail")
    @ResponseWrapper(localName = "SubmitEmailResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitEmailResponse")
    public void submitEmail(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitTPSnip", action = "http://www.snapstream.com/WebService/SubmitTPSnip")
    @RequestWrapper(localName = "SubmitTPSnip", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitTPSnip")
    @ResponseWrapper(localName = "SubmitTPSnipResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitTPSnipResponse")
    public void submitTPSnip(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bstrXMLProps
     */
    @WebMethod(operationName = "SubmitFileTag", action = "http://www.snapstream.com/WebService/SubmitFileTag")
    @RequestWrapper(localName = "SubmitFileTag", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitFileTag")
    @ResponseWrapper(localName = "SubmitFileTagResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitFileTagResponse")
    public void submitFileTag(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bstrXMLProps", targetNamespace = "http://www.snapstream.com/WebService")
        String bstrXMLProps);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitClip", action = "http://www.snapstream.com/WebService/SubmitClip")
    @RequestWrapper(localName = "SubmitClip", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitClip")
    @ResponseWrapper(localName = "SubmitClipResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitClipResponse")
    public void submitClip(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bags
     */
    @WebMethod(operationName = "SubmitBatchClip", action = "http://www.snapstream.com/WebService/SubmitBatchClip")
    @RequestWrapper(localName = "SubmitBatchClip", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchClip")
    @ResponseWrapper(localName = "SubmitBatchClipResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchClipResponse")
    public void submitBatchClip(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bags", targetNamespace = "http://www.snapstream.com/WebService")
        ArrayOfPVSPropertyBag bags);

    /**
     * 
     * @param authTicket
     * @param bag
     */
    @WebMethod(operationName = "SubmitClipAndSqueeze", action = "http://www.snapstream.com/WebService/SubmitClipAndSqueeze")
    @RequestWrapper(localName = "SubmitClipAndSqueeze", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitClipAndSqueeze")
    @ResponseWrapper(localName = "SubmitClipAndSqueezeResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitClipAndSqueezeResponse")
    public void submitClipAndSqueeze(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bag", targetNamespace = "http://www.snapstream.com/WebService")
        PVSPropertyBag bag);

    /**
     * 
     * @param authTicket
     * @param bags
     */
    @WebMethod(operationName = "SubmitBatchClipAndSqueeze", action = "http://www.snapstream.com/WebService/SubmitBatchClipAndSqueeze")
    @RequestWrapper(localName = "SubmitBatchClipAndSqueeze", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchClipAndSqueeze")
    @ResponseWrapper(localName = "SubmitBatchClipAndSqueezeResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SubmitBatchClipAndSqueezeResponse")
    public void submitBatchClipAndSqueeze(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bags", targetNamespace = "http://www.snapstream.com/WebService")
        ArrayOfPVSPropertyBag bags);

    /**
     * 
     * @param guid
     * @param authTicket
     */
    @WebMethod(operationName = "Remove", action = "http://www.snapstream.com/WebService/Remove")
    @RequestWrapper(localName = "Remove", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.Remove")
    @ResponseWrapper(localName = "RemoveResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.RemoveResponse")
    public void remove(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param authTicket
     * @param index
     * @param getTaskByFullNameResult
     * @param fullName
     * @param taskName
     */
    @WebMethod(operationName = "GetTaskByFullName", action = "http://www.snapstream.com/WebService/GetTaskByFullName")
    @RequestWrapper(localName = "GetTaskByFullName", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetTaskByFullName")
    @ResponseWrapper(localName = "GetTaskByFullNameResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetTaskByFullNameResponse")
    public void getTaskByFullName(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "taskName", targetNamespace = "http://www.snapstream.com/WebService")
        String taskName,
        @WebParam(name = "fullName", targetNamespace = "http://www.snapstream.com/WebService")
        String fullName,
        @WebParam(name = "index", targetNamespace = "http://www.snapstream.com/WebService", mode = WebParam.Mode.INOUT)
        Holder<Long> index,
        @WebParam(name = "GetTaskByFullNameResult", targetNamespace = "http://www.snapstream.com/WebService", mode = WebParam.Mode.OUT)
        Holder<String> getTaskByFullNameResult);

    /**
     * 
     * @param authTicket
     * @return
     *     returns org.atgas.media.beyondtv.webservices.btvbatchprocessor.ArrayOfString
     */
    @WebMethod(operationName = "GetTimeConstraint", action = "http://www.snapstream.com/WebService/GetTimeConstraint")
    @WebResult(name = "GetTimeConstraintResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetTimeConstraint", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetTimeConstraint")
    @ResponseWrapper(localName = "GetTimeConstraintResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetTimeConstraintResponse")
    public ArrayOfString getTimeConstraint(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param authTicket
     * @param bstrStartXml
     * @param bstrEndXml
     */
    @WebMethod(operationName = "SetTimeConstraint", action = "http://www.snapstream.com/WebService/SetTimeConstraint")
    @RequestWrapper(localName = "SetTimeConstraint", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SetTimeConstraint")
    @ResponseWrapper(localName = "SetTimeConstraintResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SetTimeConstraintResponse")
    public void setTimeConstraint(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "bstrStartXml", targetNamespace = "http://www.snapstream.com/WebService")
        String bstrStartXml,
        @WebParam(name = "bstrEndXml", targetNamespace = "http://www.snapstream.com/WebService")
        String bstrEndXml);

    /**
     * 
     * @param authTicket
     * @return
     *     returns int
     */
    @WebMethod(operationName = "GetEnableTimeConstraint", action = "http://www.snapstream.com/WebService/GetEnableTimeConstraint")
    @WebResult(name = "GetEnableTimeConstraintResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetEnableTimeConstraint", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetEnableTimeConstraint")
    @ResponseWrapper(localName = "GetEnableTimeConstraintResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetEnableTimeConstraintResponse")
    public int getEnableTimeConstraint(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param val
     * @param authTicket
     */
    @WebMethod(operationName = "SetEnableTimeConstraint", action = "http://www.snapstream.com/WebService/SetEnableTimeConstraint")
    @RequestWrapper(localName = "SetEnableTimeConstraint", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SetEnableTimeConstraint")
    @ResponseWrapper(localName = "SetEnableTimeConstraintResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.SetEnableTimeConstraintResponse")
    public void setEnableTimeConstraint(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "val", targetNamespace = "http://www.snapstream.com/WebService")
        int val);

    /**
     * 
     * @param guid
     * @param authTicket
     * @param startingIndex
     * @param taskName
     * @return
     *     returns long
     */
    @WebMethod(operationName = "RemoveByName", action = "http://www.snapstream.com/WebService/RemoveByName")
    @WebResult(name = "RemoveByNameResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "RemoveByName", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.RemoveByName")
    @ResponseWrapper(localName = "RemoveByNameResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.RemoveByNameResponse")
    public long removeByName(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid,
        @WebParam(name = "taskName", targetNamespace = "http://www.snapstream.com/WebService")
        String taskName,
        @WebParam(name = "startingIndex", targetNamespace = "http://www.snapstream.com/WebService")
        long startingIndex);

    /**
     * 
     * @param guid
     * @param authTicket
     */
    @WebMethod(operationName = "Wait", action = "http://www.snapstream.com/WebService/Wait")
    @RequestWrapper(localName = "Wait", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.Wait")
    @ResponseWrapper(localName = "WaitResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.WaitResponse")
    public void wait(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param guid
     * @param authTicket
     */
    @WebMethod(operationName = "Halt", action = "http://www.snapstream.com/WebService/Halt")
    @RequestWrapper(localName = "Halt", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.Halt")
    @ResponseWrapper(localName = "HaltResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.HaltResponse")
    public void halt(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param guid
     * @param authTicket
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ItemByID", action = "http://www.snapstream.com/WebService/ItemByID")
    @WebResult(name = "ItemByIDResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ItemByID", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ItemByID")
    @ResponseWrapper(localName = "ItemByIDResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ItemByIDResponse")
    public String itemByID(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param guid
     * @param authTicket
     * @return
     *     returns long
     */
    @WebMethod(operationName = "ProgressByID", action = "http://www.snapstream.com/WebService/ProgressByID")
    @WebResult(name = "ProgressByIDResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ProgressByID", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ProgressByID")
    @ResponseWrapper(localName = "ProgressByIDResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ProgressByIDResponse")
    public long progressByID(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param authTicket
     * @return
     *     returns int
     */
    @WebMethod(operationName = "IsTranscoding", action = "http://www.snapstream.com/WebService/IsTranscoding")
    @WebResult(name = "IsTranscodingResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "IsTranscoding", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.IsTranscoding")
    @ResponseWrapper(localName = "IsTranscodingResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.IsTranscodingResponse")
    public int isTranscoding(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param authTicket
     * @param index
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ItemByIndex", action = "http://www.snapstream.com/WebService/ItemByIndex")
    @WebResult(name = "ItemByIndexResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ItemByIndex", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ItemByIndex")
    @ResponseWrapper(localName = "ItemByIndexResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ItemByIndexResponse")
    public String itemByIndex(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "index", targetNamespace = "http://www.snapstream.com/WebService")
        long index);

    /**
     * 
     * @param guid
     * @param authTicket
     */
    @WebMethod(operationName = "Run", action = "http://www.snapstream.com/WebService/Run")
    @RequestWrapper(localName = "Run", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.Run")
    @ResponseWrapper(localName = "RunResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.RunResponse")
    public void run(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

    /**
     * 
     * @param authTicket
     * @return
     *     returns long
     */
    @WebMethod(operationName = "GetNumberOfTasksInProgress", action = "http://www.snapstream.com/WebService/GetNumberOfTasksInProgress")
    @WebResult(name = "GetNumberOfTasksInProgressResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetNumberOfTasksInProgress", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetNumberOfTasksInProgress")
    @ResponseWrapper(localName = "GetNumberOfTasksInProgressResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetNumberOfTasksInProgressResponse")
    public long getNumberOfTasksInProgress(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param authTicket
     * @return
     *     returns long
     */
    @WebMethod(operationName = "GetNumberOfTasksPending", action = "http://www.snapstream.com/WebService/GetNumberOfTasksPending")
    @WebResult(name = "GetNumberOfTasksPendingResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetNumberOfTasksPending", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetNumberOfTasksPending")
    @ResponseWrapper(localName = "GetNumberOfTasksPendingResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetNumberOfTasksPendingResponse")
    public long getNumberOfTasksPending(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param authTicket
     * @return
     *     returns long
     */
    @WebMethod(operationName = "GetCount", action = "http://www.snapstream.com/WebService/GetCount")
    @WebResult(name = "GetCountResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetCount", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetCount")
    @ResponseWrapper(localName = "GetCountResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.GetCountResponse")
    public long getCount(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param guid
     * @param authTicket
     */
    @WebMethod(operationName = "Reset", action = "http://www.snapstream.com/WebService/Reset")
    @RequestWrapper(localName = "Reset", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.Reset")
    @ResponseWrapper(localName = "ResetResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.media.beyondtv.webservices.btvbatchprocessor.ResetResponse")
    public void reset(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "guid", targetNamespace = "http://www.snapstream.com/WebService")
        String guid);

}
