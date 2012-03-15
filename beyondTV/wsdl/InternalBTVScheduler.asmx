<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:element name="GetEpisodesByKeywordWithLimit">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="l" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="s" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="limit" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeywordWithLimitResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByKeywordWithLimitResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastIndexChanged">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="l" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="s" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastIndexChangedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastIndexChangedResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddNotificationRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="l" type="s:long" />
            <s:element minOccurs="0" maxOccurs="1" name="s" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="episodes" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddNotificationRecordingsResponse">
        <s:complexType />
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetEpisodesByKeywordWithLimitSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithLimit" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordWithLimitSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithLimitResponse" />
  </wsdl:message>
  <wsdl:message name="GetLastIndexChangedSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastIndexChanged" />
  </wsdl:message>
  <wsdl:message name="GetLastIndexChangedSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastIndexChangedResponse" />
  </wsdl:message>
  <wsdl:message name="AddNotificationRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:AddNotificationRecordings" />
  </wsdl:message>
  <wsdl:message name="AddNotificationRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:AddNotificationRecordingsResponse" />
  </wsdl:message>
  <wsdl:portType name="InternalBTVSchedulerSoap">
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <wsdl:input message="tns:GetEpisodesByKeywordWithLimitSoapIn" />
      <wsdl:output message="tns:GetEpisodesByKeywordWithLimitSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLastIndexChanged">
      <wsdl:input message="tns:GetLastIndexChangedSoapIn" />
      <wsdl:output message="tns:GetLastIndexChangedSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddNotificationRecordings">
      <wsdl:input message="tns:AddNotificationRecordingsSoapIn" />
      <wsdl:output message="tns:AddNotificationRecordingsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="InternalBTVSchedulerSoap" type="tns:InternalBTVSchedulerSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastIndexChanged">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastIndexChanged" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddNotificationRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddNotificationRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="InternalBTVSchedulerSoap12" type="tns:InternalBTVSchedulerSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastIndexChanged">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastIndexChanged" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddNotificationRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddNotificationRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="InternalBTVScheduler">
    <wsdl:port name="InternalBTVSchedulerSoap" binding="tns:InternalBTVSchedulerSoap">
      <soap:address location="http://localhost:8129/wsdl/InternalBTVScheduler.asmx" />
    </wsdl:port>
    <wsdl:port name="InternalBTVSchedulerSoap12" binding="tns:InternalBTVSchedulerSoap12">
      <soap12:address location="http://localhost:8129/wsdl/InternalBTVScheduler.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>