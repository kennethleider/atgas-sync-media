<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="Logon">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="networkLicense" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogonResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="LogonResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ChangePassword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="oldPassword" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="newPassword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ChangePasswordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ChangePasswordResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RenewLogonSession">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RenewLogonSessionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="RenewLogonSessionResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogonRemote">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="networkLicense" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogonRemoteResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="LogonRemoteResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AcceptAuthenticateRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clientToken" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AcceptAuthenticateRequestResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AcceptAuthenticateRequestResult" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AcceptClientResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="oldClientToken" type="s:base64Binary" />
            <s:element minOccurs="0" maxOccurs="1" name="clientToken" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AcceptClientResponseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AcceptClientResponseResult" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogonWindowsAuth">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="networkLicense" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="clientToken" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogonWindowsAuthResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="LogonWindowsAuthResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="PrincipalServerName">
        <s:complexType />
      </s:element>
      <s:element name="PrincipalServerNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="PrincipalServerNameResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CleanupLogin">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="clientToken" type="s:base64Binary" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CleanupLoginResponse">
        <s:complexType />
      </s:element>
      <s:element name="Logoff">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ticket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogoffResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetPermissionsForTicket">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPermissionsForTicketResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPermissionsForTicketResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CanChangePassword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CanChangePasswordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="CanChangePasswordResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetVersionNumber">
        <s:complexType />
      </s:element>
      <s:element name="GetVersionNumberResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVersionNumberResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogLinkInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="macAddress" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="authticket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LogLinkInfoResponse">
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
  <wsdl:message name="LogonSoapIn">
    <wsdl:part name="parameters" element="tns:Logon" />
  </wsdl:message>
  <wsdl:message name="LogonSoapOut">
    <wsdl:part name="parameters" element="tns:LogonResponse" />
  </wsdl:message>
  <wsdl:message name="ChangePasswordSoapIn">
    <wsdl:part name="parameters" element="tns:ChangePassword" />
  </wsdl:message>
  <wsdl:message name="ChangePasswordSoapOut">
    <wsdl:part name="parameters" element="tns:ChangePasswordResponse" />
  </wsdl:message>
  <wsdl:message name="RenewLogonSessionSoapIn">
    <wsdl:part name="parameters" element="tns:RenewLogonSession" />
  </wsdl:message>
  <wsdl:message name="RenewLogonSessionSoapOut">
    <wsdl:part name="parameters" element="tns:RenewLogonSessionResponse" />
  </wsdl:message>
  <wsdl:message name="LogonRemoteSoapIn">
    <wsdl:part name="parameters" element="tns:LogonRemote" />
  </wsdl:message>
  <wsdl:message name="LogonRemoteSoapOut">
    <wsdl:part name="parameters" element="tns:LogonRemoteResponse" />
  </wsdl:message>
  <wsdl:message name="AcceptAuthenticateRequestSoapIn">
    <wsdl:part name="parameters" element="tns:AcceptAuthenticateRequest" />
  </wsdl:message>
  <wsdl:message name="AcceptAuthenticateRequestSoapOut">
    <wsdl:part name="parameters" element="tns:AcceptAuthenticateRequestResponse" />
  </wsdl:message>
  <wsdl:message name="AcceptClientResponseSoapIn">
    <wsdl:part name="parameters" element="tns:AcceptClientResponse" />
  </wsdl:message>
  <wsdl:message name="AcceptClientResponseSoapOut">
    <wsdl:part name="parameters" element="tns:AcceptClientResponseResponse" />
  </wsdl:message>
  <wsdl:message name="LogonWindowsAuthSoapIn">
    <wsdl:part name="parameters" element="tns:LogonWindowsAuth" />
  </wsdl:message>
  <wsdl:message name="LogonWindowsAuthSoapOut">
    <wsdl:part name="parameters" element="tns:LogonWindowsAuthResponse" />
  </wsdl:message>
  <wsdl:message name="PrincipalServerNameSoapIn">
    <wsdl:part name="parameters" element="tns:PrincipalServerName" />
  </wsdl:message>
  <wsdl:message name="PrincipalServerNameSoapOut">
    <wsdl:part name="parameters" element="tns:PrincipalServerNameResponse" />
  </wsdl:message>
  <wsdl:message name="CleanupLoginSoapIn">
    <wsdl:part name="parameters" element="tns:CleanupLogin" />
  </wsdl:message>
  <wsdl:message name="CleanupLoginSoapOut">
    <wsdl:part name="parameters" element="tns:CleanupLoginResponse" />
  </wsdl:message>
  <wsdl:message name="LogoffSoapIn">
    <wsdl:part name="parameters" element="tns:Logoff" />
  </wsdl:message>
  <wsdl:message name="LogoffSoapOut">
    <wsdl:part name="parameters" element="tns:LogoffResponse" />
  </wsdl:message>
  <wsdl:message name="GetPermissionsForTicketSoapIn">
    <wsdl:part name="parameters" element="tns:GetPermissionsForTicket" />
  </wsdl:message>
  <wsdl:message name="GetPermissionsForTicketSoapOut">
    <wsdl:part name="parameters" element="tns:GetPermissionsForTicketResponse" />
  </wsdl:message>
  <wsdl:message name="CanChangePasswordSoapIn">
    <wsdl:part name="parameters" element="tns:CanChangePassword" />
  </wsdl:message>
  <wsdl:message name="CanChangePasswordSoapOut">
    <wsdl:part name="parameters" element="tns:CanChangePasswordResponse" />
  </wsdl:message>
  <wsdl:message name="GetVersionNumberSoapIn">
    <wsdl:part name="parameters" element="tns:GetVersionNumber" />
  </wsdl:message>
  <wsdl:message name="GetVersionNumberSoapOut">
    <wsdl:part name="parameters" element="tns:GetVersionNumberResponse" />
  </wsdl:message>
  <wsdl:message name="LogLinkInfoSoapIn">
    <wsdl:part name="parameters" element="tns:LogLinkInfo" />
  </wsdl:message>
  <wsdl:message name="LogLinkInfoSoapOut">
    <wsdl:part name="parameters" element="tns:LogLinkInfoResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVLicenseManagerSoap">
    <wsdl:operation name="Logon">
      <wsdl:input message="tns:LogonSoapIn" />
      <wsdl:output message="tns:LogonSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ChangePassword">
      <wsdl:input message="tns:ChangePasswordSoapIn" />
      <wsdl:output message="tns:ChangePasswordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RenewLogonSession">
      <wsdl:input message="tns:RenewLogonSessionSoapIn" />
      <wsdl:output message="tns:RenewLogonSessionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="LogonRemote">
      <wsdl:input message="tns:LogonRemoteSoapIn" />
      <wsdl:output message="tns:LogonRemoteSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AcceptAuthenticateRequest">
      <wsdl:input message="tns:AcceptAuthenticateRequestSoapIn" />
      <wsdl:output message="tns:AcceptAuthenticateRequestSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AcceptClientResponse">
      <wsdl:input message="tns:AcceptClientResponseSoapIn" />
      <wsdl:output message="tns:AcceptClientResponseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="LogonWindowsAuth">
      <wsdl:input message="tns:LogonWindowsAuthSoapIn" />
      <wsdl:output message="tns:LogonWindowsAuthSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="PrincipalServerName">
      <wsdl:input message="tns:PrincipalServerNameSoapIn" />
      <wsdl:output message="tns:PrincipalServerNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CleanupLogin">
      <wsdl:input message="tns:CleanupLoginSoapIn" />
      <wsdl:output message="tns:CleanupLoginSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Logoff">
      <wsdl:input message="tns:LogoffSoapIn" />
      <wsdl:output message="tns:LogoffSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPermissionsForTicket">
      <wsdl:input message="tns:GetPermissionsForTicketSoapIn" />
      <wsdl:output message="tns:GetPermissionsForTicketSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CanChangePassword">
      <wsdl:input message="tns:CanChangePasswordSoapIn" />
      <wsdl:output message="tns:CanChangePasswordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVersionNumber">
      <wsdl:input message="tns:GetVersionNumberSoapIn" />
      <wsdl:output message="tns:GetVersionNumberSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="LogLinkInfo">
      <wsdl:input message="tns:LogLinkInfoSoapIn" />
      <wsdl:output message="tns:LogLinkInfoSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVLicenseManagerSoap" type="tns:BTVLicenseManagerSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Logon">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Logon" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ChangePassword">
      <soap:operation soapAction="http://www.snapstream.com/WebService/ChangePassword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RenewLogonSession">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RenewLogonSession" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogonRemote">
      <soap:operation soapAction="http://www.snapstream.com/WebService/LogonRemote" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AcceptAuthenticateRequest">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AcceptAuthenticateRequest" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AcceptClientResponse">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AcceptClientResponse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogonWindowsAuth">
      <soap:operation soapAction="http://www.snapstream.com/WebService/LogonWindowsAuth" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PrincipalServerName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/PrincipalServerName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CleanupLogin">
      <soap:operation soapAction="http://www.snapstream.com/WebService/CleanupLogin" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Logoff">
      <soap:operation soapAction="http://www.snapstream.com/WebService/Logoff" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPermissionsForTicket">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPermissionsForTicket" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CanChangePassword">
      <soap:operation soapAction="http://www.snapstream.com/WebService/CanChangePassword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVersionNumber">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetVersionNumber" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogLinkInfo">
      <soap:operation soapAction="http://www.snapstream.com/WebService/LogLinkInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVLicenseManagerSoap12" type="tns:BTVLicenseManagerSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Logon">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Logon" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ChangePassword">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/ChangePassword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RenewLogonSession">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RenewLogonSession" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogonRemote">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/LogonRemote" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AcceptAuthenticateRequest">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AcceptAuthenticateRequest" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AcceptClientResponse">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AcceptClientResponse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogonWindowsAuth">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/LogonWindowsAuth" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="PrincipalServerName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/PrincipalServerName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CleanupLogin">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/CleanupLogin" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Logoff">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/Logoff" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPermissionsForTicket">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPermissionsForTicket" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CanChangePassword">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/CanChangePassword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVersionNumber">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetVersionNumber" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LogLinkInfo">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/LogLinkInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVLicenseManager">
    <wsdl:port name="BTVLicenseManagerSoap" binding="tns:BTVLicenseManagerSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVLicenseManager.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVLicenseManagerSoap12" binding="tns:BTVLicenseManagerSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVLicenseManager.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>