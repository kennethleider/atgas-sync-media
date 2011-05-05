<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:element name="GetLastSuccessfulUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastSuccessfulUpdateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastSuccessfulUpdateResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastAttemptedUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastAttemptedUpdateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastAttemptedUpdateResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextAttemptedUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextAttemptedUpdateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetNextAttemptedUpdateResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StartUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StartUpdateResponse">
        <s:complexType />
      </s:element>
      <s:element name="CancelUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelUpdateResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetProperty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="val" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetPropertyResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetProgress">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProgressResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetProgressResult" type="s:unsignedInt" />
            <s:element minOccurs="0" maxOccurs="1" name="state" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="message" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TVTVUpdate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TVTVUpdateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="TVTVUpdateResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRemoteRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRemoteRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetRemoteRecordingsResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetLastSuccessfulUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastSuccessfulUpdate" />
  </wsdl:message>
  <wsdl:message name="GetLastSuccessfulUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastSuccessfulUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="GetLastAttemptedUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastAttemptedUpdate" />
  </wsdl:message>
  <wsdl:message name="GetLastAttemptedUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastAttemptedUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextAttemptedUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextAttemptedUpdate" />
  </wsdl:message>
  <wsdl:message name="GetNextAttemptedUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextAttemptedUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="StartUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:StartUpdate" />
  </wsdl:message>
  <wsdl:message name="StartUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:StartUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="CancelUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:CancelUpdate" />
  </wsdl:message>
  <wsdl:message name="CancelUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:CancelUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="SetPropertySoapIn">
    <wsdl:part name="parameters" element="tns:SetProperty" />
  </wsdl:message>
  <wsdl:message name="SetPropertySoapOut">
    <wsdl:part name="parameters" element="tns:SetPropertyResponse" />
  </wsdl:message>
  <wsdl:message name="GetProgressSoapIn">
    <wsdl:part name="parameters" element="tns:GetProgress" />
  </wsdl:message>
  <wsdl:message name="GetProgressSoapOut">
    <wsdl:part name="parameters" element="tns:GetProgressResponse" />
  </wsdl:message>
  <wsdl:message name="TVTVUpdateSoapIn">
    <wsdl:part name="parameters" element="tns:TVTVUpdate" />
  </wsdl:message>
  <wsdl:message name="TVTVUpdateSoapOut">
    <wsdl:part name="parameters" element="tns:TVTVUpdateResponse" />
  </wsdl:message>
  <wsdl:message name="GetRemoteRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetRemoteRecordings" />
  </wsdl:message>
  <wsdl:message name="GetRemoteRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetRemoteRecordingsResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVGuideUpdaterSoap">
    <wsdl:operation name="GetLastSuccessfulUpdate">
      <wsdl:input message="tns:GetLastSuccessfulUpdateSoapIn" />
      <wsdl:output message="tns:GetLastSuccessfulUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLastAttemptedUpdate">
      <wsdl:input message="tns:GetLastAttemptedUpdateSoapIn" />
      <wsdl:output message="tns:GetLastAttemptedUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextAttemptedUpdate">
      <wsdl:input message="tns:GetNextAttemptedUpdateSoapIn" />
      <wsdl:output message="tns:GetNextAttemptedUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="StartUpdate">
      <wsdl:input message="tns:StartUpdateSoapIn" />
      <wsdl:output message="tns:StartUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelUpdate">
      <wsdl:input message="tns:CancelUpdateSoapIn" />
      <wsdl:output message="tns:CancelUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetProperty">
      <wsdl:input message="tns:SetPropertySoapIn" />
      <wsdl:output message="tns:SetPropertySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProgress">
      <wsdl:input message="tns:GetProgressSoapIn" />
      <wsdl:output message="tns:GetProgressSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TVTVUpdate">
      <wsdl:input message="tns:TVTVUpdateSoapIn" />
      <wsdl:output message="tns:TVTVUpdateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRemoteRecordings">
      <wsdl:input message="tns:GetRemoteRecordingsSoapIn" />
      <wsdl:output message="tns:GetRemoteRecordingsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVGuideUpdaterSoap" type="tns:BTVGuideUpdaterSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetLastSuccessfulUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastSuccessfulUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastAttemptedUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastAttemptedUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextAttemptedUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNextAttemptedUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="StartUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/StartUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/CancelUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetProperty">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetProperty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProgress">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetProgress" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TVTVUpdate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/TVTVUpdate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRemoteRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRemoteRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVGuideUpdaterSoap12" type="tns:BTVGuideUpdaterSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetLastSuccessfulUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastSuccessfulUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastAttemptedUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastAttemptedUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextAttemptedUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNextAttemptedUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="StartUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/StartUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/CancelUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetProperty">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetProperty" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProgress">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetProgress" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TVTVUpdate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/TVTVUpdate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRemoteRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRemoteRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVGuideUpdater">
    <wsdl:port name="BTVGuideUpdaterSoap" binding="tns:BTVGuideUpdaterSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVGuideUpdater.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVGuideUpdaterSoap12" binding="tns:BTVGuideUpdaterSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVGuideUpdater.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>