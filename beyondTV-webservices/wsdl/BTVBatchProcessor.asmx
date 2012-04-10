<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://microsoft.com/wsdl/types/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="SubmitRecompress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitRecompressResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitBatchRecompress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="SubmitBatchRecompressResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitConvertSSXToAVI">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitConvertSSXToAVIResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitChapterList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitChapterListResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitEmail">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitEmailResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitTPSnip">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitTPSnipResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitFileTag">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrXMLProps" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitFileTagResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitClip">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitClipResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitBatchClip">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitBatchClipResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitClipAndSqueeze">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitClipAndSqueezeResponse">
        <s:complexType />
      </s:element>
      <s:element name="SubmitBatchClipAndSqueeze">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SubmitBatchClipAndSqueezeResponse">
        <s:complexType />
      </s:element>
      <s:element name="Remove">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetTaskByFullName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="taskName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fullName" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="index" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTaskByFullNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTaskByFullNameResult" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="index" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTimeConstraint">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetTimeConstraintResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTimeConstraintResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SetTimeConstraint">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrStartXml" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrEndXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetTimeConstraintResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetEnableTimeConstraint">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEnableTimeConstraintResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetEnableTimeConstraintResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetEnableTimeConstraint">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="val" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetEnableTimeConstraintResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
            <s:element minOccurs="0" maxOccurs="1" name="taskName" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="startingIndex" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RemoveByNameResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Wait">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WaitResponse">
        <s:complexType />
      </s:element>
      <s:element name="Halt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="HaltResponse">
        <s:complexType />
      </s:element>
      <s:element name="ItemByID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ItemByIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ItemByIDResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProgressByID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProgressByIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ProgressByIDResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsTranscoding">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IsTranscodingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="IsTranscodingResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ItemByIndex">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="index" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ItemByIndexResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ItemByIndexResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Run">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RunResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetNumberOfTasksInProgress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNumberOfTasksInProgressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetNumberOfTasksInProgressResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNumberOfTasksPending">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNumberOfTasksPendingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetNumberOfTasksPendingResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetCountResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Reset">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ResetResponse">
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
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="SubmitRecompressSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitRecompress" />
  </wsdl:message>
  <wsdl:message name="SubmitRecompressSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitRecompressResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchRecompressSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitBatchRecompress" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchRecompressSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitBatchRecompressResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitConvertSSXToAVISoapIn">
    <wsdl:part name="parameters" element="tns:SubmitConvertSSXToAVI" />
  </wsdl:message>
  <wsdl:message name="SubmitConvertSSXToAVISoapOut">
    <wsdl:part name="parameters" element="tns:SubmitConvertSSXToAVIResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitChapterListSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitChapterList" />
  </wsdl:message>
  <wsdl:message name="SubmitChapterListSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitChapterListResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitEmailSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitEmail" />
  </wsdl:message>
  <wsdl:message name="SubmitEmailSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitEmailResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitTPSnipSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitTPSnip" />
  </wsdl:message>
  <wsdl:message name="SubmitTPSnipSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitTPSnipResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitFileTagSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitFileTag" />
  </wsdl:message>
  <wsdl:message name="SubmitFileTagSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitFileTagResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitClipSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitClip" />
  </wsdl:message>
  <wsdl:message name="SubmitClipSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitClipResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchClipSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitBatchClip" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchClipSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitBatchClipResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitClipAndSqueezeSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitClipAndSqueeze" />
  </wsdl:message>
  <wsdl:message name="SubmitClipAndSqueezeSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitClipAndSqueezeResponse" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchClipAndSqueezeSoapIn">
    <wsdl:part name="parameters" element="tns:SubmitBatchClipAndSqueeze" />
  </wsdl:message>
  <wsdl:message name="SubmitBatchClipAndSqueezeSoapOut">
    <wsdl:part name="parameters" element="tns:SubmitBatchClipAndSqueezeResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveSoapIn">
    <wsdl:part name="parameters" element="tns:Remove" />
  </wsdl:message>
  <wsdl:message name="RemoveSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveResponse" />
  </wsdl:message>
  <wsdl:message name="GetTaskByFullNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetTaskByFullName" />
  </wsdl:message>
  <wsdl:message name="GetTaskByFullNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetTaskByFullNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetTimeConstraintSoapIn">
    <wsdl:part name="parameters" element="tns:GetTimeConstraint" />
  </wsdl:message>
  <wsdl:message name="GetTimeConstraintSoapOut">
    <wsdl:part name="parameters" element="tns:GetTimeConstraintResponse" />
  </wsdl:message>
  <wsdl:message name="SetTimeConstraintSoapIn">
    <wsdl:part name="parameters" element="tns:SetTimeConstraint" />
  </wsdl:message>
  <wsdl:message name="SetTimeConstraintSoapOut">
    <wsdl:part name="parameters" element="tns:SetTimeConstraintResponse" />
  </wsdl:message>
  <wsdl:message name="GetEnableTimeConstraintSoapIn">
    <wsdl:part name="parameters" element="tns:GetEnableTimeConstraint" />
  </wsdl:message>
  <wsdl:message name="GetEnableTimeConstraintSoapOut">
    <wsdl:part name="parameters" element="tns:GetEnableTimeConstraintResponse" />
  </wsdl:message>
  <wsdl:message name="SetEnableTimeConstraintSoapIn">
    <wsdl:part name="parameters" element="tns:SetEnableTimeConstraint" />
  </wsdl:message>
  <wsdl:message name="SetEnableTimeConstraintSoapOut">
    <wsdl:part name="parameters" element="tns:SetEnableTimeConstraintResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveByNameSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveByName" />
  </wsdl:message>
  <wsdl:message name="RemoveByNameSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveByNameResponse" />
  </wsdl:message>
  <wsdl:message name="WaitSoapIn">
    <wsdl:part name="parameters" element="tns:Wait" />
  </wsdl:message>
  <wsdl:message name="WaitSoapOut">
    <wsdl:part name="parameters" element="tns:WaitResponse" />
  </wsdl:message>
  <wsdl:message name="HaltSoapIn">
    <wsdl:part name="parameters" element="tns:Halt" />
  </wsdl:message>
  <wsdl:message name="HaltSoapOut">
    <wsdl:part name="parameters" element="tns:HaltResponse" />
  </wsdl:message>
  <wsdl:message name="ItemByIDSoapIn">
    <wsdl:part name="parameters" element="tns:ItemByID" />
  </wsdl:message>
  <wsdl:message name="ItemByIDSoapOut">
    <wsdl:part name="parameters" element="tns:ItemByIDResponse" />
  </wsdl:message>
  <wsdl:message name="ProgressByIDSoapIn">
    <wsdl:part name="parameters" element="tns:ProgressByID" />
  </wsdl:message>
  <wsdl:message name="ProgressByIDSoapOut">
    <wsdl:part name="parameters" element="tns:ProgressByIDResponse" />
  </wsdl:message>
  <wsdl:message name="IsTranscodingSoapIn">
    <wsdl:part name="parameters" element="tns:IsTranscoding" />
  </wsdl:message>
  <wsdl:message name="IsTranscodingSoapOut">
    <wsdl:part name="parameters" element="tns:IsTranscodingResponse" />
  </wsdl:message>
  <wsdl:message name="ItemByIndexSoapIn">
    <wsdl:part name="parameters" element="tns:ItemByIndex" />
  </wsdl:message>
  <wsdl:message name="ItemByIndexSoapOut">
    <wsdl:part name="parameters" element="tns:ItemByIndexResponse" />
  </wsdl:message>
  <wsdl:message name="RunSoapIn">
    <wsdl:part name="parameters" element="tns:Run" />
  </wsdl:message>
  <wsdl:message name="RunSoapOut">
    <wsdl:part name="parameters" element="tns:RunResponse" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfTasksInProgressSoapIn">
    <wsdl:part name="parameters" element="tns:GetNumberOfTasksInProgress" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfTasksInProgressSoapOut">
    <wsdl:part name="parameters" element="tns:GetNumberOfTasksInProgressResponse" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfTasksPendingSoapIn">
    <wsdl:part name="parameters" element="tns:GetNumberOfTasksPending" />
  </wsdl:message>
  <wsdl:message name="GetNumberOfTasksPendingSoapOut">
    <wsdl:part name="parameters" element="tns:GetNumberOfTasksPendingResponse" />
  </wsdl:message>
  <wsdl:message name="GetCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetCount" />
  </wsdl:message>
  <wsdl:message name="GetCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetCountResponse" />
  </wsdl:message>
  <wsdl:message name="ResetSoapIn">
    <wsdl:part name="parameters" element="tns:Reset" />
  </wsdl:message>
  <wsdl:message name="ResetSoapOut">
    <wsdl:part name="parameters" element="tns:ResetResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVTaskListProcessorSoap">
    <wsdl:operation name="SubmitRecompress">
      <wsdl:input message="tns:SubmitRecompressSoapIn" />
      <wsdl:output message="tns:SubmitRecompressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchRecompress">
      <wsdl:input message="tns:SubmitBatchRecompressSoapIn" />
      <wsdl:output message="tns:SubmitBatchRecompressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitConvertSSXToAVI">
      <wsdl:input message="tns:SubmitConvertSSXToAVISoapIn" />
      <wsdl:output message="tns:SubmitConvertSSXToAVISoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitChapterList">
      <wsdl:input message="tns:SubmitChapterListSoapIn" />
      <wsdl:output message="tns:SubmitChapterListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitEmail">
      <wsdl:input message="tns:SubmitEmailSoapIn" />
      <wsdl:output message="tns:SubmitEmailSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitTPSnip">
      <wsdl:input message="tns:SubmitTPSnipSoapIn" />
      <wsdl:output message="tns:SubmitTPSnipSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitFileTag">
      <wsdl:input message="tns:SubmitFileTagSoapIn" />
      <wsdl:output message="tns:SubmitFileTagSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitClip">
      <wsdl:input message="tns:SubmitClipSoapIn" />
      <wsdl:output message="tns:SubmitClipSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClip">
      <wsdl:input message="tns:SubmitBatchClipSoapIn" />
      <wsdl:output message="tns:SubmitBatchClipSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitClipAndSqueeze">
      <wsdl:input message="tns:SubmitClipAndSqueezeSoapIn" />
      <wsdl:output message="tns:SubmitClipAndSqueezeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClipAndSqueeze">
      <wsdl:input message="tns:SubmitBatchClipAndSqueezeSoapIn" />
      <wsdl:output message="tns:SubmitBatchClipAndSqueezeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Remove">
      <wsdl:input message="tns:RemoveSoapIn" />
      <wsdl:output message="tns:RemoveSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTaskByFullName">
      <wsdl:input message="tns:GetTaskByFullNameSoapIn" />
      <wsdl:output message="tns:GetTaskByFullNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTimeConstraint">
      <wsdl:input message="tns:GetTimeConstraintSoapIn" />
      <wsdl:output message="tns:GetTimeConstraintSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetTimeConstraint">
      <wsdl:input message="tns:SetTimeConstraintSoapIn" />
      <wsdl:output message="tns:SetTimeConstraintSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEnableTimeConstraint">
      <wsdl:input message="tns:GetEnableTimeConstraintSoapIn" />
      <wsdl:output message="tns:GetEnableTimeConstraintSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetEnableTimeConstraint">
      <wsdl:input message="tns:SetEnableTimeConstraintSoapIn" />
      <wsdl:output message="tns:SetEnableTimeConstraintSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveByName">
      <wsdl:input message="tns:RemoveByNameSoapIn" />
      <wsdl:output message="tns:RemoveByNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Wait">
      <wsdl:input message="tns:WaitSoapIn" />
      <wsdl:output message="tns:WaitSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Halt">
      <wsdl:input message="tns:HaltSoapIn" />
      <wsdl:output message="tns:HaltSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ItemByID">
      <wsdl:input message="tns:ItemByIDSoapIn" />
      <wsdl:output message="tns:ItemByIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ProgressByID">
      <wsdl:input message="tns:ProgressByIDSoapIn" />
      <wsdl:output message="tns:ProgressByIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IsTranscoding">
      <wsdl:input message="tns:IsTranscodingSoapIn" />
      <wsdl:output message="tns:IsTranscodingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ItemByIndex">
      <wsdl:input message="tns:ItemByIndexSoapIn" />
      <wsdl:output message="tns:ItemByIndexSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Run">
      <wsdl:input message="tns:RunSoapIn" />
      <wsdl:output message="tns:RunSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksInProgress">
      <wsdl:input message="tns:GetNumberOfTasksInProgressSoapIn" />
      <wsdl:output message="tns:GetNumberOfTasksInProgressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksPending">
      <wsdl:input message="tns:GetNumberOfTasksPendingSoapIn" />
      <wsdl:output message="tns:GetNumberOfTasksPendingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCount">
      <wsdl:input message="tns:GetCountSoapIn" />
      <wsdl:output message="tns:GetCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Reset">
      <wsdl:input message="tns:ResetSoapIn" />
      <wsdl:output message="tns:ResetSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVTaskListProcessorSoap" type="tns:BTVTaskListProcessorSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SubmitRecompress">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitRecompress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchRecompress">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchRecompress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitConvertSSXToAVI">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitConvertSSXToAVI" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitChapterList">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitChapterList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitEmail">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitEmail" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitTPSnip">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitTPSnip" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitFileTag">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitFileTag" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitClip">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitClip" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClip">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchClip" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitClipAndSqueeze">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitClipAndSqueeze" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClipAndSqueeze">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchClipAndSqueeze" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Remove">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Remove" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTaskByFullName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetTaskByFullName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTimeConstraint">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetTimeConstraint" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetTimeConstraint">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetTimeConstraint" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEnableTimeConstraint">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEnableTimeConstraint" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetEnableTimeConstraint">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetEnableTimeConstraint" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveByName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Wait">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Wait" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Halt">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Halt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ItemByID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ItemByID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProgressByID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ProgressByID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsTranscoding">
      <soap:operation soapAction="http://www.snapstream.com/WebService/IsTranscoding" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ItemByIndex">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ItemByIndex" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Run">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Run" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksInProgress">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNumberOfTasksInProgress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksPending">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNumberOfTasksPending" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCount">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Reset">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Reset" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVTaskListProcessorSoap12" type="tns:BTVTaskListProcessorSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="SubmitRecompress">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitRecompress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchRecompress">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchRecompress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitConvertSSXToAVI">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitConvertSSXToAVI" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitChapterList">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitChapterList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitEmail">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitEmail" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitTPSnip">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitTPSnip" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitFileTag">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitFileTag" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitClip">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitClip" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClip">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchClip" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitClipAndSqueeze">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitClipAndSqueeze" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SubmitBatchClipAndSqueeze">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SubmitBatchClipAndSqueeze" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Remove">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Remove" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTaskByFullName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetTaskByFullName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTimeConstraint">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetTimeConstraint" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetTimeConstraint">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetTimeConstraint" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEnableTimeConstraint">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEnableTimeConstraint" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetEnableTimeConstraint">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetEnableTimeConstraint" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveByName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Wait">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Wait" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Halt">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Halt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ItemByID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ItemByID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ProgressByID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ProgressByID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IsTranscoding">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/IsTranscoding" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ItemByIndex">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ItemByIndex" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Run">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Run" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksInProgress">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNumberOfTasksInProgress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNumberOfTasksPending">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNumberOfTasksPending" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCount">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Reset">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Reset" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVTaskListProcessor">
    <wsdl:port name="BTVTaskListProcessorSoap" binding="tns:BTVTaskListProcessorSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVBatchProcessor.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVTaskListProcessorSoap12" binding="tns:BTVTaskListProcessorSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVBatchProcessor.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>