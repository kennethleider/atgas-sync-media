<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://microsoft.com/wsdl/types/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="AddNotification">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="prop" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sendTestEmail" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddNotificationResponse">
        <s:complexType />
      </s:element>
      <s:element name="EditNotification">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="prop" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sendTestEmail" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditNotificationResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveNotification">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveNotificationResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetNotifications">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNotificationsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="pbstrProps" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNotification">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNotificationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNotificationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSavedGuideSearches">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSavedGuideSearchesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSavedGuideSearchesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSavedGuideSearch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSavedGuideSearchResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSavedGuideSearchResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddGuideSearch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="prop" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sendTestEmail" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddGuideSearchResponse">
        <s:complexType />
      </s:element>
      <s:element name="EditGuideSearch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="prop" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="sendTestEmail" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditGuideSearchResponse">
        <s:complexType />
      </s:element>
      <s:element name="RemoveGuideSearch">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="guid" type="s1:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveGuideSearchResponse">
        <s:complexType />
      </s:element>
    </s:schema>
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="AddNotificationSoapIn">
    <wsdl:part name="parameters" element="tns:AddNotification" />
  </wsdl:message>
  <wsdl:message name="AddNotificationSoapOut">
    <wsdl:part name="parameters" element="tns:AddNotificationResponse" />
  </wsdl:message>
  <wsdl:message name="EditNotificationSoapIn">
    <wsdl:part name="parameters" element="tns:EditNotification" />
  </wsdl:message>
  <wsdl:message name="EditNotificationSoapOut">
    <wsdl:part name="parameters" element="tns:EditNotificationResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveNotificationSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveNotification" />
  </wsdl:message>
  <wsdl:message name="RemoveNotificationSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveNotificationResponse" />
  </wsdl:message>
  <wsdl:message name="GetNotificationsSoapIn">
    <wsdl:part name="parameters" element="tns:GetNotifications" />
  </wsdl:message>
  <wsdl:message name="GetNotificationsSoapOut">
    <wsdl:part name="parameters" element="tns:GetNotificationsResponse" />
  </wsdl:message>
  <wsdl:message name="GetNotificationSoapIn">
    <wsdl:part name="parameters" element="tns:GetNotification" />
  </wsdl:message>
  <wsdl:message name="GetNotificationSoapOut">
    <wsdl:part name="parameters" element="tns:GetNotificationResponse" />
  </wsdl:message>
  <wsdl:message name="GetSavedGuideSearchesSoapIn">
    <wsdl:part name="parameters" element="tns:GetSavedGuideSearches" />
  </wsdl:message>
  <wsdl:message name="GetSavedGuideSearchesSoapOut">
    <wsdl:part name="parameters" element="tns:GetSavedGuideSearchesResponse" />
  </wsdl:message>
  <wsdl:message name="GetSavedGuideSearchSoapIn">
    <wsdl:part name="parameters" element="tns:GetSavedGuideSearch" />
  </wsdl:message>
  <wsdl:message name="GetSavedGuideSearchSoapOut">
    <wsdl:part name="parameters" element="tns:GetSavedGuideSearchResponse" />
  </wsdl:message>
  <wsdl:message name="AddGuideSearchSoapIn">
    <wsdl:part name="parameters" element="tns:AddGuideSearch" />
  </wsdl:message>
  <wsdl:message name="AddGuideSearchSoapOut">
    <wsdl:part name="parameters" element="tns:AddGuideSearchResponse" />
  </wsdl:message>
  <wsdl:message name="EditGuideSearchSoapIn">
    <wsdl:part name="parameters" element="tns:EditGuideSearch" />
  </wsdl:message>
  <wsdl:message name="EditGuideSearchSoapOut">
    <wsdl:part name="parameters" element="tns:EditGuideSearchResponse" />
  </wsdl:message>
  <wsdl:message name="RemoveGuideSearchSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveGuideSearch" />
  </wsdl:message>
  <wsdl:message name="RemoveGuideSearchSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveGuideSearchResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVNotifierSoap">
    <wsdl:operation name="AddNotification">
      <wsdl:input message="tns:AddNotificationSoapIn" />
      <wsdl:output message="tns:AddNotificationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditNotification">
      <wsdl:input message="tns:EditNotificationSoapIn" />
      <wsdl:output message="tns:EditNotificationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveNotification">
      <wsdl:input message="tns:RemoveNotificationSoapIn" />
      <wsdl:output message="tns:RemoveNotificationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNotifications">
      <wsdl:input message="tns:GetNotificationsSoapIn" />
      <wsdl:output message="tns:GetNotificationsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNotification">
      <wsdl:input message="tns:GetNotificationSoapIn" />
      <wsdl:output message="tns:GetNotificationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearches">
      <wsdl:input message="tns:GetSavedGuideSearchesSoapIn" />
      <wsdl:output message="tns:GetSavedGuideSearchesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearch">
      <wsdl:input message="tns:GetSavedGuideSearchSoapIn" />
      <wsdl:output message="tns:GetSavedGuideSearchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddGuideSearch">
      <wsdl:input message="tns:AddGuideSearchSoapIn" />
      <wsdl:output message="tns:AddGuideSearchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditGuideSearch">
      <wsdl:input message="tns:EditGuideSearchSoapIn" />
      <wsdl:output message="tns:EditGuideSearchSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveGuideSearch">
      <wsdl:input message="tns:RemoveGuideSearchSoapIn" />
      <wsdl:output message="tns:RemoveGuideSearchSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVNotifierSoap" type="tns:BTVNotifierSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="AddNotification">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddNotification" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditNotification">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EditNotification" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveNotification">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveNotification" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNotifications">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNotifications" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNotification">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNotification" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearches">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSavedGuideSearches" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearch">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSavedGuideSearch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddGuideSearch">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddGuideSearch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditGuideSearch">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EditGuideSearch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveGuideSearch">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveGuideSearch" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVNotifierSoap12" type="tns:BTVNotifierSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="AddNotification">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddNotification" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditNotification">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EditNotification" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveNotification">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveNotification" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNotifications">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNotifications" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNotification">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNotification" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearches">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSavedGuideSearches" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSavedGuideSearch">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSavedGuideSearch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddGuideSearch">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddGuideSearch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditGuideSearch">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EditGuideSearch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveGuideSearch">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveGuideSearch" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVNotifier">
    <wsdl:port name="BTVNotifierSoap" binding="tns:BTVNotifierSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVNotifier.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVNotifierSoap12" binding="tns:BTVNotifierSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVNotifier.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>