<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://microsoft.com/wsdl/types/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://www.snapstream.com/types" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="NewSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelId" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="NewSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSessionWithErrorCondition">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSessionWithErrorConditionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="NewSessionWithErrorConditionResult" type="tns:ArrayOfAnyType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfAnyType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="anyType" nillable="true" />
        </s:sequence>
      </s:complexType>
      <s:element name="NewSessionOnSource">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionType" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guidSource" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSessionOnSourceResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="NewSessionOnSourceResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sessionType" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="existingGuid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ExistingSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KeepAlive">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="KeepAliveResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetChannelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetChannelResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsRecording">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsRecordingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IsRecordingResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetChannelResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetChannelWithErrorCondition">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetChannelWithErrorConditionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SetChannelWithErrorConditionResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ForceChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
            <s:element minOccurs="1" maxOccurs="1" name="guidSource" type="s1:guid" />
            <s:element minOccurs="0" maxOccurs="1" name="channel" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ForceChannelResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetSignalStrength">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSignalStrengthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetSignalStrengthResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EndSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EndSessionResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetRecording">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRecordingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRecordingResult" type="s2:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSessionProps">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSessionPropsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSessionPropsResult" type="s2:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSessions">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s2:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetSessionsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSessionsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetImminentRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetImminentRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetImminentRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSourceSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSourceSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="NewSourceSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSourceSessionOnChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewSourceSessionOnChannelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="NewSourceSessionOnChannelResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingSourceSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sourceGuid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingSourceSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ExistingSourceSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewWebSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="NewWebSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="NewWebSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingWebSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sourceGuid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ExistingWebSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ExistingWebSessionResult" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/types">
      <s:complexType name="PVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Properties" type="s2:ArrayOfPVSProperty" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfPVSProperty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSProperty" nillable="true" type="s2:PVSProperty" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="PVSProperty">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Value" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="NewSessionSoapIn">
    <wsdl:part name="parameters" element="tns:NewSession" />
  </wsdl:message>
  <wsdl:message name="NewSessionSoapOut">
    <wsdl:part name="parameters" element="tns:NewSessionResponse" />
  </wsdl:message>
  <wsdl:message name="NewSessionWithErrorConditionSoapIn">
    <wsdl:part name="parameters" element="tns:NewSessionWithErrorCondition" />
  </wsdl:message>
  <wsdl:message name="NewSessionWithErrorConditionSoapOut">
    <wsdl:part name="parameters" element="tns:NewSessionWithErrorConditionResponse" />
  </wsdl:message>
  <wsdl:message name="NewSessionOnSourceSoapIn">
    <wsdl:part name="parameters" element="tns:NewSessionOnSource" />
  </wsdl:message>
  <wsdl:message name="NewSessionOnSourceSoapOut">
    <wsdl:part name="parameters" element="tns:NewSessionOnSourceResponse" />
  </wsdl:message>
  <wsdl:message name="ExistingSessionSoapIn">
    <wsdl:part name="parameters" element="tns:ExistingSession" />
  </wsdl:message>
  <wsdl:message name="ExistingSessionSoapOut">
    <wsdl:part name="parameters" element="tns:ExistingSessionResponse" />
  </wsdl:message>
  <wsdl:message name="KeepAliveSoapIn">
    <wsdl:part name="parameters" element="tns:KeepAlive" />
  </wsdl:message>
  <wsdl:message name="KeepAliveSoapOut">
    <wsdl:part name="parameters" element="tns:KeepAliveResponse" />
  </wsdl:message>
  <wsdl:message name="GetChannelSoapIn">
    <wsdl:part name="parameters" element="tns:GetChannel" />
  </wsdl:message>
  <wsdl:message name="GetChannelSoapOut">
    <wsdl:part name="parameters" element="tns:GetChannelResponse" />
  </wsdl:message>
  <wsdl:message name="IsRecordingSoapIn">
    <wsdl:part name="parameters" element="tns:IsRecording" />
  </wsdl:message>
  <wsdl:message name="IsRecordingSoapOut">
    <wsdl:part name="parameters" element="tns:IsRecordingResponse" />
  </wsdl:message>
  <wsdl:message name="SetChannelSoapIn">
    <wsdl:part name="parameters" element="tns:SetChannel" />
  </wsdl:message>
  <wsdl:message name="SetChannelSoapOut">
    <wsdl:part name="parameters" element="tns:SetChannelResponse" />
  </wsdl:message>
  <wsdl:message name="SetChannelWithErrorConditionSoapIn">
    <wsdl:part name="parameters" element="tns:SetChannelWithErrorCondition" />
  </wsdl:message>
  <wsdl:message name="SetChannelWithErrorConditionSoapOut">
    <wsdl:part name="parameters" element="tns:SetChannelWithErrorConditionResponse" />
  </wsdl:message>
  <wsdl:message name="ForceChannelSoapIn">
    <wsdl:part name="parameters" element="tns:ForceChannel" />
  </wsdl:message>
  <wsdl:message name="ForceChannelSoapOut">
    <wsdl:part name="parameters" element="tns:ForceChannelResponse" />
  </wsdl:message>
  <wsdl:message name="GetSignalStrengthSoapIn">
    <wsdl:part name="parameters" element="tns:GetSignalStrength" />
  </wsdl:message>
  <wsdl:message name="GetSignalStrengthSoapOut">
    <wsdl:part name="parameters" element="tns:GetSignalStrengthResponse" />
  </wsdl:message>
  <wsdl:message name="EndSessionSoapIn">
    <wsdl:part name="parameters" element="tns:EndSession" />
  </wsdl:message>
  <wsdl:message name="EndSessionSoapOut">
    <wsdl:part name="parameters" element="tns:EndSessionResponse" />
  </wsdl:message>
  <wsdl:message name="GetRecordingSoapIn">
    <wsdl:part name="parameters" element="tns:GetRecording" />
  </wsdl:message>
  <wsdl:message name="GetRecordingSoapOut">
    <wsdl:part name="parameters" element="tns:GetRecordingResponse" />
  </wsdl:message>
  <wsdl:message name="GetSessionPropsSoapIn">
    <wsdl:part name="parameters" element="tns:GetSessionProps" />
  </wsdl:message>
  <wsdl:message name="GetSessionPropsSoapOut">
    <wsdl:part name="parameters" element="tns:GetSessionPropsResponse" />
  </wsdl:message>
  <wsdl:message name="GetSessionsSoapIn">
    <wsdl:part name="parameters" element="tns:GetSessions" />
  </wsdl:message>
  <wsdl:message name="GetSessionsSoapOut">
    <wsdl:part name="parameters" element="tns:GetSessionsResponse" />
  </wsdl:message>
  <wsdl:message name="GetImminentRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetImminentRecordings" />
  </wsdl:message>
  <wsdl:message name="GetImminentRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetImminentRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="NewSourceSessionSoapIn">
    <wsdl:part name="parameters" element="tns:NewSourceSession" />
  </wsdl:message>
  <wsdl:message name="NewSourceSessionSoapOut">
    <wsdl:part name="parameters" element="tns:NewSourceSessionResponse" />
  </wsdl:message>
  <wsdl:message name="NewSourceSessionOnChannelSoapIn">
    <wsdl:part name="parameters" element="tns:NewSourceSessionOnChannel" />
  </wsdl:message>
  <wsdl:message name="NewSourceSessionOnChannelSoapOut">
    <wsdl:part name="parameters" element="tns:NewSourceSessionOnChannelResponse" />
  </wsdl:message>
  <wsdl:message name="ExistingSourceSessionSoapIn">
    <wsdl:part name="parameters" element="tns:ExistingSourceSession" />
  </wsdl:message>
  <wsdl:message name="ExistingSourceSessionSoapOut">
    <wsdl:part name="parameters" element="tns:ExistingSourceSessionResponse" />
  </wsdl:message>
  <wsdl:message name="NewWebSessionSoapIn">
    <wsdl:part name="parameters" element="tns:NewWebSession" />
  </wsdl:message>
  <wsdl:message name="NewWebSessionSoapOut">
    <wsdl:part name="parameters" element="tns:NewWebSessionResponse" />
  </wsdl:message>
  <wsdl:message name="ExistingWebSessionSoapIn">
    <wsdl:part name="parameters" element="tns:ExistingWebSession" />
  </wsdl:message>
  <wsdl:message name="ExistingWebSessionSoapOut">
    <wsdl:part name="parameters" element="tns:ExistingWebSessionResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVLiveTVManagerSoap">
    <wsdl:operation name="NewSession">
      <wsdl:input message="tns:NewSessionSoapIn" />
      <wsdl:output message="tns:NewSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewSessionWithErrorCondition">
      <wsdl:input message="tns:NewSessionWithErrorConditionSoapIn" />
      <wsdl:output message="tns:NewSessionWithErrorConditionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewSessionOnSource">
      <wsdl:input message="tns:NewSessionOnSourceSoapIn" />
      <wsdl:output message="tns:NewSessionOnSourceSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ExistingSession">
      <wsdl:input message="tns:ExistingSessionSoapIn" />
      <wsdl:output message="tns:ExistingSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="KeepAlive">
      <wsdl:input message="tns:KeepAliveSoapIn" />
      <wsdl:output message="tns:KeepAliveSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetChannel">
      <wsdl:input message="tns:GetChannelSoapIn" />
      <wsdl:output message="tns:GetChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsRecording">
      <wsdl:input message="tns:IsRecordingSoapIn" />
      <wsdl:output message="tns:IsRecordingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetChannel">
      <wsdl:input message="tns:SetChannelSoapIn" />
      <wsdl:output message="tns:SetChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetChannelWithErrorCondition">
      <wsdl:input message="tns:SetChannelWithErrorConditionSoapIn" />
      <wsdl:output message="tns:SetChannelWithErrorConditionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ForceChannel">
      <wsdl:input message="tns:ForceChannelSoapIn" />
      <wsdl:output message="tns:ForceChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSignalStrength">
      <wsdl:input message="tns:GetSignalStrengthSoapIn" />
      <wsdl:output message="tns:GetSignalStrengthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EndSession">
      <wsdl:input message="tns:EndSessionSoapIn" />
      <wsdl:output message="tns:EndSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRecording">
      <wsdl:input message="tns:GetRecordingSoapIn" />
      <wsdl:output message="tns:GetRecordingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSessionProps">
      <wsdl:input message="tns:GetSessionPropsSoapIn" />
      <wsdl:output message="tns:GetSessionPropsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSessions">
      <wsdl:input message="tns:GetSessionsSoapIn" />
      <wsdl:output message="tns:GetSessionsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetImminentRecordings">
      <wsdl:input message="tns:GetImminentRecordingsSoapIn" />
      <wsdl:output message="tns:GetImminentRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewSourceSession">
      <wsdl:input message="tns:NewSourceSessionSoapIn" />
      <wsdl:output message="tns:NewSourceSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewSourceSessionOnChannel">
      <wsdl:input message="tns:NewSourceSessionOnChannelSoapIn" />
      <wsdl:output message="tns:NewSourceSessionOnChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ExistingSourceSession">
      <wsdl:input message="tns:ExistingSourceSessionSoapIn" />
      <wsdl:output message="tns:ExistingSourceSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="NewWebSession">
      <wsdl:input message="tns:NewWebSessionSoapIn" />
      <wsdl:output message="tns:NewWebSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ExistingWebSession">
      <wsdl:input message="tns:ExistingWebSessionSoapIn" />
      <wsdl:output message="tns:ExistingWebSessionSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVLiveTVManagerSoap" type="tns:BTVLiveTVManagerSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="NewSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSessionWithErrorCondition">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewSessionWithErrorCondition" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSessionOnSource">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewSessionOnSource" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ExistingSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KeepAlive">
      <soap:operation soapAction="http://www.snapstream.com/WebService/KeepAlive" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsRecording">
      <soap:operation soapAction="http://www.snapstream.com/WebService/IsRecording" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetChannelWithErrorCondition">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetChannelWithErrorCondition" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ForceChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ForceChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSignalStrength">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSignalStrength" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EndSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EndSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecording">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRecording" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSessionProps">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSessionProps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSessions">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSessions" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetImminentRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetImminentRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSourceSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewSourceSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSourceSessionOnChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewSourceSessionOnChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingSourceSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ExistingSourceSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewWebSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/NewWebSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingWebSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ExistingWebSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVLiveTVManagerSoap12" type="tns:BTVLiveTVManagerSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="NewSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSessionWithErrorCondition">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewSessionWithErrorCondition" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSessionOnSource">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewSessionOnSource" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ExistingSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="KeepAlive">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/KeepAlive" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsRecording">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/IsRecording" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetChannelWithErrorCondition">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetChannelWithErrorCondition" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ForceChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ForceChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSignalStrength">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSignalStrength" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EndSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EndSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRecording">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRecording" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSessionProps">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSessionProps" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSessions">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSessions" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetImminentRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetImminentRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSourceSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewSourceSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewSourceSessionOnChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewSourceSessionOnChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingSourceSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ExistingSourceSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="NewWebSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/NewWebSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ExistingWebSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ExistingWebSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVLiveTVManager">
    <wsdl:port name="BTVLiveTVManagerSoap" binding="tns:BTVLiveTVManagerSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVLiveTVManager.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVLiveTVManagerSoap12" binding="tns:BTVLiveTVManagerSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVLiveTVManager.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>