<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://microsoft.com/wsdl/types/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="GetJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetJobsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetJobsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetJobByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetJobByGUIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetJobByGUIDResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUpcomingRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUpcomingRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUpcomingRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastRebuild">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastRebuildResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastRebuildResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditRecordingJob">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditRecordingJobResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetPossibleRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPossibleRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPossibleRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodeStatusResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeCollectionStatus">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeCollectionStatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodeCollectionStatusResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBlockedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBlockedRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBlockedRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetExistingConflicts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetExistingConflictsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetExistingConflictsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HasExistingConflicts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HasExistingConflictsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="HasExistingConflictsResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPotentialConflicts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPotentialConflictsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPotentialConflictsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HasPotentialConflicts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HasPotentialConflictsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="HasPotentialConflictsResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetForcedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetForcedRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetForcedRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRejectedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRejectedRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRejectedRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecentRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecentRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRecentRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReprioritizeJob">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
            <s:element minOccurs="1" maxOccurs="1" name="priority" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReprioritizeJobResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveRecordingJob">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveRecordingJobResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveRecordingJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveRecordingJobsResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddRecordingJob">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="highestPriority" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddRecordingJobResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddRecordingJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="highestPriority" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddRecordingJobsResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPotentialRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPotentialRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPotentialRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextRecording">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextRecordingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNextRecordingResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddBlockedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddBlockedRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddForcedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddForcedRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveBlockedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveBlockedRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveForcedRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveForcedRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveBlockedRecordingsByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveBlockedRecordingsByGUIDResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveForcedRecordingsByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveForcedRecordingsByGUIDResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveRecentRecordingsByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveRecentRecordingsByGUIDResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddRecentRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddRecentRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveRecentRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveRecentRecordingsResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetPotentialScheduleAtPriority">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="priority" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPotentialScheduleAtPriorityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPotentialScheduleAtPriorityResult" type="tns:ArrayOfPVSPropertyBagArray" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBagArray">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBagArray" nillable="true" type="s1:PVSPropertyBagArray" />
        </s:sequence>
      </s:complexType>
      <s:element name="ReprioritizeJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReprioritizeJobsResponse">
        <s:complexType />
      </s:element>
      <s:element name="EditRecordingJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditRecordingJobsResponse">
        <s:complexType />
      </s:element>
      <s:element name="IsSeriesManaged">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrEPGID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsSeriesManagedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IsSeriesManagedResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClearPopularityJobs">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClearPopularityJobsResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetUpcomingRecordingDuration">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUpcomingRecordingDurationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetUpcomingRecordingDurationResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastRecording">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastRecordingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetLastRecordingResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddRecentRecordingByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddRecentRecordingByGUIDResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddBlockedRecordingByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddBlockedRecordingByGUIDResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddForcedRecordingByGUID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddForcedRecordingByGUIDResponse">
        <s:complexType />
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/types">
      <s:complexType name="PVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Properties" type="s1:ArrayOfPVSProperty" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPVSProperty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSProperty" nillable="true" type="s1:PVSProperty" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PVSProperty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Value" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PVSPropertyBagArray">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Bags" type="s1:ArrayOfPVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetJobsSoapIn">
    <wsdl:part name="parameters" element="tns:GetJobs" />
  </wsdl:message>
  <wsdl:message name="GetJobsSoapOut">
    <wsdl:part name="parameters" element="tns:GetJobsResponse" />
  </wsdl:message>
  <wsdl:message name="GetJobByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetJobByGUID" />
  </wsdl:message>
  <wsdl:message name="GetJobByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetJobByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetUpcomingRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetUpcomingRecordings" />
  </wsdl:message>
  <wsdl:message name="GetUpcomingRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetUpcomingRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetLastRebuildSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastRebuild" />
  </wsdl:message>
  <wsdl:message name="GetLastRebuildSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastRebuildResponse" />
  </wsdl:message>
  <wsdl:message name="EditRecordingJobSoapIn">
    <wsdl:part name="parameters" element="tns:EditRecordingJob" />
  </wsdl:message>
  <wsdl:message name="EditRecordingJobSoapOut">
    <wsdl:part name="parameters" element="tns:EditRecordingJobResponse" />
  </wsdl:message>
  <wsdl:message name="GetPossibleRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetPossibleRecordings" />
  </wsdl:message>
  <wsdl:message name="GetPossibleRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetPossibleRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodeStatus" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodeStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeCollectionStatusSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodeCollectionStatus" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeCollectionStatusSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodeCollectionStatusResponse" />
  </wsdl:message>
  <wsdl:message name="GetBlockedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetBlockedRecordings" />
  </wsdl:message>
  <wsdl:message name="GetBlockedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetBlockedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetExistingConflictsSoapIn">
    <wsdl:part name="parameters" element="tns:GetExistingConflicts" />
  </wsdl:message>
  <wsdl:message name="GetExistingConflictsSoapOut">
    <wsdl:part name="parameters" element="tns:GetExistingConflictsResponse" />
  </wsdl:message>
  <wsdl:message name="HasExistingConflictsSoapIn">
    <wsdl:part name="parameters" element="tns:HasExistingConflicts" />
  </wsdl:message>
  <wsdl:message name="HasExistingConflictsSoapOut">
    <wsdl:part name="parameters" element="tns:HasExistingConflictsResponse" />
  </wsdl:message>
  <wsdl:message name="GetPotentialConflictsSoapIn">
    <wsdl:part name="parameters" element="tns:GetPotentialConflicts" />
  </wsdl:message>
  <wsdl:message name="GetPotentialConflictsSoapOut">
    <wsdl:part name="parameters" element="tns:GetPotentialConflictsResponse" />
  </wsdl:message>
  <wsdl:message name="HasPotentialConflictsSoapIn">
    <wsdl:part name="parameters" element="tns:HasPotentialConflicts" />
  </wsdl:message>
  <wsdl:message name="HasPotentialConflictsSoapOut">
    <wsdl:part name="parameters" element="tns:HasPotentialConflictsResponse" />
  </wsdl:message>
  <wsdl:message name="GetForcedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetForcedRecordings" />
  </wsdl:message>
  <wsdl:message name="GetForcedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetForcedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetRejectedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetRejectedRecordings" />
  </wsdl:message>
  <wsdl:message name="GetRejectedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetRejectedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetRecentRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetRecentRecordings" />
  </wsdl:message>
  <wsdl:message name="GetRecentRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetRecentRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="ReprioritizeJobSoapIn">
    <wsdl:part name="parameters" element="tns:ReprioritizeJob" />
  </wsdl:message>
  <wsdl:message name="ReprioritizeJobSoapOut">
    <wsdl:part name="parameters" element="tns:ReprioritizeJobResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveRecordingJobSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveRecordingJob" />
  </wsdl:message>
  <wsdl:message name="RemoveRecordingJobSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveRecordingJobResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveRecordingJobsSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveRecordingJobs" />
  </wsdl:message>
  <wsdl:message name="RemoveRecordingJobsSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveRecordingJobsResponse" />
  </wsdl:message>
  <wsdl:message name="AddRecordingJobSoapIn">
    <wsdl:part name="parameters" element="tns:AddRecordingJob" />
  </wsdl:message>
  <wsdl:message name="AddRecordingJobSoapOut">
    <wsdl:part name="parameters" element="tns:AddRecordingJobResponse" />
  </wsdl:message>
  <wsdl:message name="AddRecordingJobsSoapIn">
    <wsdl:part name="parameters" element="tns:AddRecordingJobs" />
  </wsdl:message>
  <wsdl:message name="AddRecordingJobsSoapOut">
    <wsdl:part name="parameters" element="tns:AddRecordingJobsResponse" />
  </wsdl:message>
  <wsdl:message name="GetRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetRecordings" />
  </wsdl:message>
  <wsdl:message name="GetRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetPotentialRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetPotentialRecordings" />
  </wsdl:message>
  <wsdl:message name="GetPotentialRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetPotentialRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextRecordingSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextRecording" />
  </wsdl:message>
  <wsdl:message name="GetNextRecordingSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextRecordingResponse" />
  </wsdl:message>
  <wsdl:message name="AddBlockedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:AddBlockedRecordings" />
  </wsdl:message>
  <wsdl:message name="AddBlockedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:AddBlockedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="AddForcedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:AddForcedRecordings" />
  </wsdl:message>
  <wsdl:message name="AddForcedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:AddForcedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveBlockedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveBlockedRecordings" />
  </wsdl:message>
  <wsdl:message name="RemoveBlockedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveBlockedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveForcedRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveForcedRecordings" />
  </wsdl:message>
  <wsdl:message name="RemoveForcedRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveForcedRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveBlockedRecordingsByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveBlockedRecordingsByGUID" />
  </wsdl:message>
  <wsdl:message name="RemoveBlockedRecordingsByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveBlockedRecordingsByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveForcedRecordingsByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveForcedRecordingsByGUID" />
  </wsdl:message>
  <wsdl:message name="RemoveForcedRecordingsByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveForcedRecordingsByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveRecentRecordingsByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveRecentRecordingsByGUID" />
  </wsdl:message>
  <wsdl:message name="RemoveRecentRecordingsByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveRecentRecordingsByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="AddRecentRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:AddRecentRecordings" />
  </wsdl:message>
  <wsdl:message name="AddRecentRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:AddRecentRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveRecentRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveRecentRecordings" />
  </wsdl:message>
  <wsdl:message name="RemoveRecentRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveRecentRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetPotentialScheduleAtPrioritySoapIn">
    <wsdl:part name="parameters" element="tns:GetPotentialScheduleAtPriority" />
  </wsdl:message>
  <wsdl:message name="GetPotentialScheduleAtPrioritySoapOut">
    <wsdl:part name="parameters" element="tns:GetPotentialScheduleAtPriorityResponse" />
  </wsdl:message>
  <wsdl:message name="ReprioritizeJobsSoapIn">
    <wsdl:part name="parameters" element="tns:ReprioritizeJobs" />
  </wsdl:message>
  <wsdl:message name="ReprioritizeJobsSoapOut">
    <wsdl:part name="parameters" element="tns:ReprioritizeJobsResponse" />
  </wsdl:message>
  <wsdl:message name="EditRecordingJobsSoapIn">
    <wsdl:part name="parameters" element="tns:EditRecordingJobs" />
  </wsdl:message>
  <wsdl:message name="EditRecordingJobsSoapOut">
    <wsdl:part name="parameters" element="tns:EditRecordingJobsResponse" />
  </wsdl:message>
  <wsdl:message name="IsSeriesManagedSoapIn">
    <wsdl:part name="parameters" element="tns:IsSeriesManaged" />
  </wsdl:message>
  <wsdl:message name="IsSeriesManagedSoapOut">
    <wsdl:part name="parameters" element="tns:IsSeriesManagedResponse" />
  </wsdl:message>
  <wsdl:message name="ClearPopularityJobsSoapIn">
    <wsdl:part name="parameters" element="tns:ClearPopularityJobs" />
  </wsdl:message>
  <wsdl:message name="ClearPopularityJobsSoapOut">
    <wsdl:part name="parameters" element="tns:ClearPopularityJobsResponse" />
  </wsdl:message>
  <wsdl:message name="GetUpcomingRecordingDurationSoapIn">
    <wsdl:part name="parameters" element="tns:GetUpcomingRecordingDuration" />
  </wsdl:message>
  <wsdl:message name="GetUpcomingRecordingDurationSoapOut">
    <wsdl:part name="parameters" element="tns:GetUpcomingRecordingDurationResponse" />
  </wsdl:message>
  <wsdl:message name="GetLastRecordingSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastRecording" />
  </wsdl:message>
  <wsdl:message name="GetLastRecordingSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastRecordingResponse" />
  </wsdl:message>
  <wsdl:message name="AddRecentRecordingByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:AddRecentRecordingByGUID" />
  </wsdl:message>
  <wsdl:message name="AddRecentRecordingByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:AddRecentRecordingByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="AddBlockedRecordingByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:AddBlockedRecordingByGUID" />
  </wsdl:message>
  <wsdl:message name="AddBlockedRecordingByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:AddBlockedRecordingByGUIDResponse" />
  </wsdl:message>
  <wsdl:message name="AddForcedRecordingByGUIDSoapIn">
    <wsdl:part name="parameters" element="tns:AddForcedRecordingByGUID" />
  </wsdl:message>
  <wsdl:message name="AddForcedRecordingByGUIDSoapOut">
    <wsdl:part name="parameters" element="tns:AddForcedRecordingByGUIDResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVSchedulerSoap">
    <wsdl:operation name="GetJobs">
      <wsdl:input message="tns:GetJobsSoapIn" />
      <wsdl:output message="tns:GetJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetJobByGUID">
      <wsdl:input message="tns:GetJobByGUIDSoapIn" />
      <wsdl:output message="tns:GetJobByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordings">
      <wsdl:input message="tns:GetUpcomingRecordingsSoapIn" />
      <wsdl:output message="tns:GetUpcomingRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLastRebuild">
      <wsdl:input message="tns:GetLastRebuildSoapIn" />
      <wsdl:output message="tns:GetLastRebuildSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJob">
      <wsdl:input message="tns:EditRecordingJobSoapIn" />
      <wsdl:output message="tns:EditRecordingJobSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPossibleRecordings">
      <wsdl:input message="tns:GetPossibleRecordingsSoapIn" />
      <wsdl:output message="tns:GetPossibleRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeStatus">
      <wsdl:input message="tns:GetEpisodeStatusSoapIn" />
      <wsdl:output message="tns:GetEpisodeStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeCollectionStatus">
      <wsdl:input message="tns:GetEpisodeCollectionStatusSoapIn" />
      <wsdl:output message="tns:GetEpisodeCollectionStatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBlockedRecordings">
      <wsdl:input message="tns:GetBlockedRecordingsSoapIn" />
      <wsdl:output message="tns:GetBlockedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetExistingConflicts">
      <wsdl:input message="tns:GetExistingConflictsSoapIn" />
      <wsdl:output message="tns:GetExistingConflictsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="HasExistingConflicts">
      <wsdl:input message="tns:HasExistingConflictsSoapIn" />
      <wsdl:output message="tns:HasExistingConflictsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPotentialConflicts">
      <wsdl:input message="tns:GetPotentialConflictsSoapIn" />
      <wsdl:output message="tns:GetPotentialConflictsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="HasPotentialConflicts">
      <wsdl:input message="tns:HasPotentialConflictsSoapIn" />
      <wsdl:output message="tns:HasPotentialConflictsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetForcedRecordings">
      <wsdl:input message="tns:GetForcedRecordingsSoapIn" />
      <wsdl:output message="tns:GetForcedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRejectedRecordings">
      <wsdl:input message="tns:GetRejectedRecordingsSoapIn" />
      <wsdl:output message="tns:GetRejectedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRecentRecordings">
      <wsdl:input message="tns:GetRecentRecordingsSoapIn" />
      <wsdl:output message="tns:GetRecentRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJob">
      <wsdl:input message="tns:ReprioritizeJobSoapIn" />
      <wsdl:output message="tns:ReprioritizeJobSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJob">
      <wsdl:input message="tns:RemoveRecordingJobSoapIn" />
      <wsdl:output message="tns:RemoveRecordingJobSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJobs">
      <wsdl:input message="tns:RemoveRecordingJobsSoapIn" />
      <wsdl:output message="tns:RemoveRecordingJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJob">
      <wsdl:input message="tns:AddRecordingJobSoapIn" />
      <wsdl:output message="tns:AddRecordingJobSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJobs">
      <wsdl:input message="tns:AddRecordingJobsSoapIn" />
      <wsdl:output message="tns:AddRecordingJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRecordings">
      <wsdl:input message="tns:GetRecordingsSoapIn" />
      <wsdl:output message="tns:GetRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPotentialRecordings">
      <wsdl:input message="tns:GetPotentialRecordingsSoapIn" />
      <wsdl:output message="tns:GetPotentialRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextRecording">
      <wsdl:input message="tns:GetNextRecordingSoapIn" />
      <wsdl:output message="tns:GetNextRecordingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordings">
      <wsdl:input message="tns:AddBlockedRecordingsSoapIn" />
      <wsdl:output message="tns:AddBlockedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordings">
      <wsdl:input message="tns:AddForcedRecordingsSoapIn" />
      <wsdl:output message="tns:AddForcedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordings">
      <wsdl:input message="tns:RemoveBlockedRecordingsSoapIn" />
      <wsdl:output message="tns:RemoveBlockedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordings">
      <wsdl:input message="tns:RemoveForcedRecordingsSoapIn" />
      <wsdl:output message="tns:RemoveForcedRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordingsByGUID">
      <wsdl:input message="tns:RemoveBlockedRecordingsByGUIDSoapIn" />
      <wsdl:output message="tns:RemoveBlockedRecordingsByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordingsByGUID">
      <wsdl:input message="tns:RemoveForcedRecordingsByGUIDSoapIn" />
      <wsdl:output message="tns:RemoveForcedRecordingsByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordingsByGUID">
      <wsdl:input message="tns:RemoveRecentRecordingsByGUIDSoapIn" />
      <wsdl:output message="tns:RemoveRecentRecordingsByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordings">
      <wsdl:input message="tns:AddRecentRecordingsSoapIn" />
      <wsdl:output message="tns:AddRecentRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordings">
      <wsdl:input message="tns:RemoveRecentRecordingsSoapIn" />
      <wsdl:output message="tns:RemoveRecentRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPotentialScheduleAtPriority">
      <wsdl:input message="tns:GetPotentialScheduleAtPrioritySoapIn" />
      <wsdl:output message="tns:GetPotentialScheduleAtPrioritySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJobs">
      <wsdl:input message="tns:ReprioritizeJobsSoapIn" />
      <wsdl:output message="tns:ReprioritizeJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJobs">
      <wsdl:input message="tns:EditRecordingJobsSoapIn" />
      <wsdl:output message="tns:EditRecordingJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsSeriesManaged">
      <wsdl:input message="tns:IsSeriesManagedSoapIn" />
      <wsdl:output message="tns:IsSeriesManagedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ClearPopularityJobs">
      <wsdl:input message="tns:ClearPopularityJobsSoapIn" />
      <wsdl:output message="tns:ClearPopularityJobsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordingDuration">
      <wsdl:input message="tns:GetUpcomingRecordingDurationSoapIn" />
      <wsdl:output message="tns:GetUpcomingRecordingDurationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLastRecording">
      <wsdl:input message="tns:GetLastRecordingSoapIn" />
      <wsdl:output message="tns:GetLastRecordingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordingByGUID">
      <wsdl:input message="tns:AddRecentRecordingByGUIDSoapIn" />
      <wsdl:output message="tns:AddRecentRecordingByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordingByGUID">
      <wsdl:input message="tns:AddBlockedRecordingByGUIDSoapIn" />
      <wsdl:output message="tns:AddBlockedRecordingByGUIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordingByGUID">
      <wsdl:input message="tns:AddForcedRecordingByGUIDSoapIn" />
      <wsdl:output message="tns:AddForcedRecordingByGUIDSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVSchedulerSoap" type="tns:BTVSchedulerSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetJobByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetJobByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetUpcomingRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastRebuild">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastRebuild" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJob">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EditRecordingJob" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPossibleRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPossibleRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeStatus">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeCollectionStatus">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeCollectionStatus" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBlockedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetBlockedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExistingConflicts">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetExistingConflicts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HasExistingConflicts">
      <soap:operation soapAction="http://www.snapstream.com/WebService/HasExistingConflicts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialConflicts">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPotentialConflicts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HasPotentialConflicts">
      <soap:operation soapAction="http://www.snapstream.com/WebService/HasPotentialConflicts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetForcedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetForcedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRejectedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRejectedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecentRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRecentRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJob">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ReprioritizeJob" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJob">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveRecordingJob" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveRecordingJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJob">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddRecordingJob" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddRecordingJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPotentialRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextRecording">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNextRecording" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddBlockedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddForcedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveBlockedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveForcedRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordingsByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveBlockedRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordingsByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveForcedRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordingsByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveRecentRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddRecentRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveRecentRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialScheduleAtPriority">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPotentialScheduleAtPriority" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ReprioritizeJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EditRecordingJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsSeriesManaged">
      <soap:operation soapAction="http://www.snapstream.com/WebService/IsSeriesManaged" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClearPopularityJobs">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ClearPopularityJobs" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordingDuration">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetUpcomingRecordingDuration" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastRecording">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastRecording" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordingByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddRecentRecordingByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordingByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddBlockedRecordingByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordingByGUID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddForcedRecordingByGUID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVSchedulerSoap12" type="tns:BTVSchedulerSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetJobByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetJobByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetUpcomingRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastRebuild">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastRebuild" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJob">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EditRecordingJob" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPossibleRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPossibleRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeStatus">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeCollectionStatus">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeCollectionStatus" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBlockedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetBlockedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExistingConflicts">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetExistingConflicts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HasExistingConflicts">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/HasExistingConflicts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialConflicts">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPotentialConflicts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="HasPotentialConflicts">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/HasPotentialConflicts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetForcedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetForcedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRejectedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRejectedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecentRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRecentRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJob">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ReprioritizeJob" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJob">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveRecordingJob" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecordingJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveRecordingJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJob">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddRecordingJob" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecordingJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddRecordingJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPotentialRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextRecording">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNextRecording" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddBlockedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddForcedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveBlockedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveForcedRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveBlockedRecordingsByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveBlockedRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveForcedRecordingsByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveForcedRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordingsByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveRecentRecordingsByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddRecentRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveRecentRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveRecentRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPotentialScheduleAtPriority">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPotentialScheduleAtPriority" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReprioritizeJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ReprioritizeJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditRecordingJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EditRecordingJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsSeriesManaged">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/IsSeriesManaged" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ClearPopularityJobs">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ClearPopularityJobs" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUpcomingRecordingDuration">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetUpcomingRecordingDuration" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastRecording">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastRecording" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddRecentRecordingByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddRecentRecordingByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddBlockedRecordingByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddBlockedRecordingByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddForcedRecordingByGUID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddForcedRecordingByGUID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVScheduler">
    <wsdl:port name="BTVSchedulerSoap" binding="tns:BTVSchedulerSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVScheduler.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVSchedulerSoap12" binding="tns:BTVSchedulerSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVScheduler.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>