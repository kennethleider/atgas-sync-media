<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://microsoft.com/wsdl/types/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://www.snapstream.com/types" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="GetShowLimitsByGuid">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetShowLimitsByGuidResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetShowLimitsByGuidResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMaxDaysByGuid">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMaxDaysByGuidResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetMaxDaysByGuidResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetShowLimitsByGuid">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
            <s:element minOccurs="1" maxOccurs="1" name="limit" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetShowLimitsByGuidResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetDaysLimitsByGuid">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
            <s:element minOccurs="1" maxOccurs="1" name="days" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetDaysLimitsByGuidResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetDriveLimits">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s2:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetDriveLimitsResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetDriveLimitsByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDriveLimitsByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDriveLimitsByNameResult" type="s2:PVSPropertyBag" />
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
  <wsdl:message name="GetShowLimitsByGuidSoapIn">
    <wsdl:part name="parameters" element="tns:GetShowLimitsByGuid" />
  </wsdl:message>
  <wsdl:message name="GetShowLimitsByGuidSoapOut">
    <wsdl:part name="parameters" element="tns:GetShowLimitsByGuidResponse" />
  </wsdl:message>
  <wsdl:message name="GetMaxDaysByGuidSoapIn">
    <wsdl:part name="parameters" element="tns:GetMaxDaysByGuid" />
  </wsdl:message>
  <wsdl:message name="GetMaxDaysByGuidSoapOut">
    <wsdl:part name="parameters" element="tns:GetMaxDaysByGuidResponse" />
  </wsdl:message>
  <wsdl:message name="SetShowLimitsByGuidSoapIn">
    <wsdl:part name="parameters" element="tns:SetShowLimitsByGuid" />
  </wsdl:message>
  <wsdl:message name="SetShowLimitsByGuidSoapOut">
    <wsdl:part name="parameters" element="tns:SetShowLimitsByGuidResponse" />
  </wsdl:message>
  <wsdl:message name="SetDaysLimitsByGuidSoapIn">
    <wsdl:part name="parameters" element="tns:SetDaysLimitsByGuid" />
  </wsdl:message>
  <wsdl:message name="SetDaysLimitsByGuidSoapOut">
    <wsdl:part name="parameters" element="tns:SetDaysLimitsByGuidResponse" />
  </wsdl:message>
  <wsdl:message name="SetDriveLimitsSoapIn">
    <wsdl:part name="parameters" element="tns:SetDriveLimits" />
  </wsdl:message>
  <wsdl:message name="SetDriveLimitsSoapOut">
    <wsdl:part name="parameters" element="tns:SetDriveLimitsResponse" />
  </wsdl:message>
  <wsdl:message name="GetDriveLimitsByNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetDriveLimitsByName" />
  </wsdl:message>
  <wsdl:message name="GetDriveLimitsByNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetDriveLimitsByNameResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVExpirationSoap">
    <wsdl:operation name="GetShowLimitsByGuid">
      <wsdl:input message="tns:GetShowLimitsByGuidSoapIn" />
      <wsdl:output message="tns:GetShowLimitsByGuidSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMaxDaysByGuid">
      <wsdl:input message="tns:GetMaxDaysByGuidSoapIn" />
      <wsdl:output message="tns:GetMaxDaysByGuidSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetShowLimitsByGuid">
      <wsdl:input message="tns:SetShowLimitsByGuidSoapIn" />
      <wsdl:output message="tns:SetShowLimitsByGuidSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetDaysLimitsByGuid">
      <wsdl:input message="tns:SetDaysLimitsByGuidSoapIn" />
      <wsdl:output message="tns:SetDaysLimitsByGuidSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetDriveLimits">
      <wsdl:input message="tns:SetDriveLimitsSoapIn" />
      <wsdl:output message="tns:SetDriveLimitsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDriveLimitsByName">
      <wsdl:input message="tns:GetDriveLimitsByNameSoapIn" />
      <wsdl:output message="tns:GetDriveLimitsByNameSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVExpirationSoap" type="tns:BTVExpirationSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetShowLimitsByGuid">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetShowLimitsByGuid" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMaxDaysByGuid">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetMaxDaysByGuid" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetShowLimitsByGuid">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetShowLimitsByGuid" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDaysLimitsByGuid">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetDaysLimitsByGuid" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDriveLimits">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetDriveLimits" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDriveLimitsByName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetDriveLimitsByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVExpirationSoap12" type="tns:BTVExpirationSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetShowLimitsByGuid">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetShowLimitsByGuid" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMaxDaysByGuid">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetMaxDaysByGuid" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetShowLimitsByGuid">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetShowLimitsByGuid" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDaysLimitsByGuid">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetDaysLimitsByGuid" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDriveLimits">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetDriveLimits" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDriveLimitsByName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetDriveLimitsByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVExpiration">
    <wsdl:port name="BTVExpirationSoap" binding="tns:BTVExpirationSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVExpiration.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVExpirationSoap12" binding="tns:BTVExpirationSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVExpiration.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>