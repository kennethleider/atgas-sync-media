<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:element name="Startup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StartupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="StartupResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Shutdown">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ShutdownResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ShutdownResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Repair">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RepairResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RepairResult" type="tns:ArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="Terminate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TerminateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="TerminateResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="StartupSoapIn">
    <wsdl:part name="parameters" element="tns:Startup" />
  </wsdl:message>
  <wsdl:message name="StartupSoapOut">
    <wsdl:part name="parameters" element="tns:StartupResponse" />
  </wsdl:message>
  <wsdl:message name="ShutdownSoapIn">
    <wsdl:part name="parameters" element="tns:Shutdown" />
  </wsdl:message>
  <wsdl:message name="ShutdownSoapOut">
    <wsdl:part name="parameters" element="tns:ShutdownResponse" />
  </wsdl:message>
  <wsdl:message name="RepairSoapIn">
    <wsdl:part name="parameters" element="tns:Repair" />
  </wsdl:message>
  <wsdl:message name="RepairSoapOut">
    <wsdl:part name="parameters" element="tns:RepairResponse" />
  </wsdl:message>
  <wsdl:message name="TerminateSoapIn">
    <wsdl:part name="parameters" element="tns:Terminate" />
  </wsdl:message>
  <wsdl:message name="TerminateSoapOut">
    <wsdl:part name="parameters" element="tns:TerminateResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVWebServiceManagerSoap">
    <wsdl:operation name="Startup">
      <wsdl:input message="tns:StartupSoapIn" />
      <wsdl:output message="tns:StartupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Shutdown">
      <wsdl:input message="tns:ShutdownSoapIn" />
      <wsdl:output message="tns:ShutdownSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Repair">
      <wsdl:input message="tns:RepairSoapIn" />
      <wsdl:output message="tns:RepairSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Terminate">
      <wsdl:input message="tns:TerminateSoapIn" />
      <wsdl:output message="tns:TerminateSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVWebServiceManagerSoap" type="tns:BTVWebServiceManagerSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Startup">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Startup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Shutdown">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Shutdown" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repair">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Repair" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Terminate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Terminate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVWebServiceManagerSoap12" type="tns:BTVWebServiceManagerSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Startup">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Startup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Shutdown">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Shutdown" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Repair">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Repair" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Terminate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Terminate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVWebServiceManager">
    <wsdl:port name="BTVWebServiceManagerSoap" binding="tns:BTVWebServiceManagerSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVWebServiceManager.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVWebServiceManagerSoap12" binding="tns:BTVWebServiceManagerSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVWebServiceManager.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>