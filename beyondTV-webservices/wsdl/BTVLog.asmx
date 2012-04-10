<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:element name="LogError">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="ulErrorCode" type="s:unsignedInt" />
            <s:element minOccurs="1" maxOccurs="1" name="bUnique" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="bUniqueDesc" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrErrStr" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogErrorResponse">
        <s:complexType />
      </s:element>
      <s:element name="WriteChange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrSetting" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrOldValue" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrNewValue" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteChangeResponse">
        <s:complexType />
      </s:element>
      <s:element name="WriteLogMessagesToDisk">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteLogMessagesToDiskResponse">
        <s:complexType />
      </s:element>
      <s:element name="WriteLog">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrMsg" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteLogResponse">
        <s:complexType />
      </s:element>
      <s:element name="WriteLogUser">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrMsg" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteLogUserResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetNextError">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="startTime" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextErrorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNextErrorResult" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="timestamp" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="errorCode" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextMessage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pqwStart" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextMessageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNextMessageResult" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pqwStart" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextErrorWithDescription">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="startTime" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNextErrorWithDescriptionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNextErrorWithDescriptionResult" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="timestamp" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="errorCode" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DismissError">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="timestamp" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="errorCode" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DismissErrorResponse">
        <s:complexType />
      </s:element>
      <s:element name="DismissAllErrors">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DismissAllErrorsResponse">
        <s:complexType />
      </s:element>
      <s:element name="IgnoreError">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="errorCode" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="IgnoreErrorResponse">
        <s:complexType />
      </s:element>
      <s:element name="ReactivateIgnoredErrors">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReactivateIgnoredErrorsResponse">
        <s:complexType />
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="LogErrorSoapIn">
    <wsdl:part name="parameters" element="tns:LogError" />
  </wsdl:message>
  <wsdl:message name="LogErrorSoapOut">
    <wsdl:part name="parameters" element="tns:LogErrorResponse" />
  </wsdl:message>
  <wsdl:message name="WriteChangeSoapIn">
    <wsdl:part name="parameters" element="tns:WriteChange" />
  </wsdl:message>
  <wsdl:message name="WriteChangeSoapOut">
    <wsdl:part name="parameters" element="tns:WriteChangeResponse" />
  </wsdl:message>
  <wsdl:message name="WriteLogMessagesToDiskSoapIn">
    <wsdl:part name="parameters" element="tns:WriteLogMessagesToDisk" />
  </wsdl:message>
  <wsdl:message name="WriteLogMessagesToDiskSoapOut">
    <wsdl:part name="parameters" element="tns:WriteLogMessagesToDiskResponse" />
  </wsdl:message>
  <wsdl:message name="WriteLogSoapIn">
    <wsdl:part name="parameters" element="tns:WriteLog" />
  </wsdl:message>
  <wsdl:message name="WriteLogSoapOut">
    <wsdl:part name="parameters" element="tns:WriteLogResponse" />
  </wsdl:message>
  <wsdl:message name="WriteLogUserSoapIn">
    <wsdl:part name="parameters" element="tns:WriteLogUser" />
  </wsdl:message>
  <wsdl:message name="WriteLogUserSoapOut">
    <wsdl:part name="parameters" element="tns:WriteLogUserResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextErrorSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextError" />
  </wsdl:message>
  <wsdl:message name="GetNextErrorSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextErrorResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextMessageSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextMessage" />
  </wsdl:message>
  <wsdl:message name="GetNextMessageSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextMessageResponse" />
  </wsdl:message>
  <wsdl:message name="GetNextErrorWithDescriptionSoapIn">
    <wsdl:part name="parameters" element="tns:GetNextErrorWithDescription" />
  </wsdl:message>
  <wsdl:message name="GetNextErrorWithDescriptionSoapOut">
    <wsdl:part name="parameters" element="tns:GetNextErrorWithDescriptionResponse" />
  </wsdl:message>
  <wsdl:message name="DismissErrorSoapIn">
    <wsdl:part name="parameters" element="tns:DismissError" />
  </wsdl:message>
  <wsdl:message name="DismissErrorSoapOut">
    <wsdl:part name="parameters" element="tns:DismissErrorResponse" />
  </wsdl:message>
  <wsdl:message name="DismissAllErrorsSoapIn">
    <wsdl:part name="parameters" element="tns:DismissAllErrors" />
  </wsdl:message>
  <wsdl:message name="DismissAllErrorsSoapOut">
    <wsdl:part name="parameters" element="tns:DismissAllErrorsResponse" />
  </wsdl:message>
  <wsdl:message name="IgnoreErrorSoapIn">
    <wsdl:part name="parameters" element="tns:IgnoreError" />
  </wsdl:message>
  <wsdl:message name="IgnoreErrorSoapOut">
    <wsdl:part name="parameters" element="tns:IgnoreErrorResponse" />
  </wsdl:message>
  <wsdl:message name="ReactivateIgnoredErrorsSoapIn">
    <wsdl:part name="parameters" element="tns:ReactivateIgnoredErrors" />
  </wsdl:message>
  <wsdl:message name="ReactivateIgnoredErrorsSoapOut">
    <wsdl:part name="parameters" element="tns:ReactivateIgnoredErrorsResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVLogSoap">
    <wsdl:operation name="LogError">
      <wsdl:input message="tns:LogErrorSoapIn" />
      <wsdl:output message="tns:LogErrorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteChange">
      <wsdl:input message="tns:WriteChangeSoapIn" />
      <wsdl:output message="tns:WriteChangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteLogMessagesToDisk">
      <wsdl:input message="tns:WriteLogMessagesToDiskSoapIn" />
      <wsdl:output message="tns:WriteLogMessagesToDiskSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteLog">
      <wsdl:input message="tns:WriteLogSoapIn" />
      <wsdl:output message="tns:WriteLogSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteLogUser">
      <wsdl:input message="tns:WriteLogUserSoapIn" />
      <wsdl:output message="tns:WriteLogUserSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextError">
      <wsdl:input message="tns:GetNextErrorSoapIn" />
      <wsdl:output message="tns:GetNextErrorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextMessage">
      <wsdl:input message="tns:GetNextMessageSoapIn" />
      <wsdl:output message="tns:GetNextMessageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNextErrorWithDescription">
      <wsdl:input message="tns:GetNextErrorWithDescriptionSoapIn" />
      <wsdl:output message="tns:GetNextErrorWithDescriptionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DismissError">
      <wsdl:input message="tns:DismissErrorSoapIn" />
      <wsdl:output message="tns:DismissErrorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DismissAllErrors">
      <wsdl:input message="tns:DismissAllErrorsSoapIn" />
      <wsdl:output message="tns:DismissAllErrorsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="IgnoreError">
      <wsdl:input message="tns:IgnoreErrorSoapIn" />
      <wsdl:output message="tns:IgnoreErrorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReactivateIgnoredErrors">
      <wsdl:input message="tns:ReactivateIgnoredErrorsSoapIn" />
      <wsdl:output message="tns:ReactivateIgnoredErrorsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVLogSoap" type="tns:BTVLogSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="LogError">
      <soap:operation soapAction="http://www.snapstream.com/WebService/LogError" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteChange">
      <soap:operation soapAction="http://www.snapstream.com/WebService/WriteChange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLogMessagesToDisk">
      <soap:operation soapAction="http://www.snapstream.com/WebService/WriteLogMessagesToDisk" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLog">
      <soap:operation soapAction="http://www.snapstream.com/WebService/WriteLog" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLogUser">
      <soap:operation soapAction="http://www.snapstream.com/WebService/WriteLogUser" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextError">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNextError" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMessage">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNextMessage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextErrorWithDescription">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNextErrorWithDescription" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DismissError">
      <soap:operation soapAction="http://www.snapstream.com/WebService/DismissError" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DismissAllErrors">
      <soap:operation soapAction="http://www.snapstream.com/WebService/DismissAllErrors" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IgnoreError">
      <soap:operation soapAction="http://www.snapstream.com/WebService/IgnoreError" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReactivateIgnoredErrors">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ReactivateIgnoredErrors" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVLogSoap12" type="tns:BTVLogSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="LogError">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/LogError" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteChange">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/WriteChange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLogMessagesToDisk">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/WriteLogMessagesToDisk" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLog">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/WriteLog" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteLogUser">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/WriteLogUser" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextError">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNextError" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextMessage">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNextMessage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNextErrorWithDescription">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNextErrorWithDescription" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DismissError">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/DismissError" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DismissAllErrors">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/DismissAllErrors" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="IgnoreError">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/IgnoreError" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReactivateIgnoredErrors">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ReactivateIgnoredErrors" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVLog">
    <wsdl:port name="BTVLogSoap" binding="tns:BTVLogSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVLog.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVLogSoap12" binding="tns:BTVLogSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVLog.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>