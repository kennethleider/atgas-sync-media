<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="GetActiveRecordings">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetActiveRecordingsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetActiveRecordingsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetActiveRecordingsWithChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetActiveRecordingsWithChannelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetActiveRecordingsWithChannelResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEngines">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEnginesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEnginesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEnginesWithChannel">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEnginesWithChannelResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEnginesWithChannelResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetSources">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sources" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetSourcesResponse">
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
  </wsdl:types>
  <wsdl:message name="GetActiveRecordingsSoapIn">
    <wsdl:part name="parameters" element="tns:GetActiveRecordings" />
  </wsdl:message>
  <wsdl:message name="GetActiveRecordingsSoapOut">
    <wsdl:part name="parameters" element="tns:GetActiveRecordingsResponse" />
  </wsdl:message>
  <wsdl:message name="GetActiveRecordingsWithChannelSoapIn">
    <wsdl:part name="parameters" element="tns:GetActiveRecordingsWithChannel" />
  </wsdl:message>
  <wsdl:message name="GetActiveRecordingsWithChannelSoapOut">
    <wsdl:part name="parameters" element="tns:GetActiveRecordingsWithChannelResponse" />
  </wsdl:message>
  <wsdl:message name="GetEnginesSoapIn">
    <wsdl:part name="parameters" element="tns:GetEngines" />
  </wsdl:message>
  <wsdl:message name="GetEnginesSoapOut">
    <wsdl:part name="parameters" element="tns:GetEnginesResponse" />
  </wsdl:message>
  <wsdl:message name="GetEnginesWithChannelSoapIn">
    <wsdl:part name="parameters" element="tns:GetEnginesWithChannel" />
  </wsdl:message>
  <wsdl:message name="GetEnginesWithChannelSoapOut">
    <wsdl:part name="parameters" element="tns:GetEnginesWithChannelResponse" />
  </wsdl:message>
  <wsdl:message name="SetSourcesSoapIn">
    <wsdl:part name="parameters" element="tns:SetSources" />
  </wsdl:message>
  <wsdl:message name="SetSourcesSoapOut">
    <wsdl:part name="parameters" element="tns:SetSourcesResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVDispatcherSoap">
    <wsdl:operation name="GetActiveRecordings">
      <wsdl:input message="tns:GetActiveRecordingsSoapIn" />
      <wsdl:output message="tns:GetActiveRecordingsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetActiveRecordingsWithChannel">
      <wsdl:input message="tns:GetActiveRecordingsWithChannelSoapIn" />
      <wsdl:output message="tns:GetActiveRecordingsWithChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEngines">
      <wsdl:input message="tns:GetEnginesSoapIn" />
      <wsdl:output message="tns:GetEnginesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEnginesWithChannel">
      <wsdl:input message="tns:GetEnginesWithChannelSoapIn" />
      <wsdl:output message="tns:GetEnginesWithChannelSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetSources">
      <wsdl:input message="tns:SetSourcesSoapIn" />
      <wsdl:output message="tns:SetSourcesSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVDispatcherSoap" type="tns:BTVDispatcherSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetActiveRecordings">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetActiveRecordings" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetActiveRecordingsWithChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetActiveRecordingsWithChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEngines">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEngines" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEnginesWithChannel">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEnginesWithChannel" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetSources">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetSources" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVDispatcherSoap12" type="tns:BTVDispatcherSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetActiveRecordings">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetActiveRecordings" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetActiveRecordingsWithChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetActiveRecordingsWithChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEngines">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEngines" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEnginesWithChannel">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEnginesWithChannel" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetSources">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetSources" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVDispatcher">
    <wsdl:port name="BTVDispatcherSoap" binding="tns:BTVDispatcherSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVDispatcher.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVDispatcherSoap12" binding="tns:BTVDispatcherSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVDispatcher.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>