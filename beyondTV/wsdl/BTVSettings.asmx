<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="GetNetURL">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetNetURLResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNetURLResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetValidRecordingFormats">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetValidRecordingFormatsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetValidRecordingFormatsResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProperty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPropertyResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsBool">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsBoolResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetPropertyAsBoolResult" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsInt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsIntResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetPropertyAsIntResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsDouble">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyAsDoubleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetPropertyAsDoubleResult" type="s:double" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetProperty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="valueString" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetPropertyResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetPropertyAsBool">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="val" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetPropertyAsBoolResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetPropertyAsInt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="val" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetPropertyAsIntResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetPropertyAsDouble">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="val" type="s:double" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetPropertyAsDoubleResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetPropertyBagCollection">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetPropertyBagCollectionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetPropertyBagCollectionResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetProfiles">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProfilesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProfilesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDevices">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDevicesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDevicesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetProfiles">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="bSaveFile" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetProfilesResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetDevices">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bags" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetDevicesResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetRadioLineup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetRadioLineupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetRadioLineupResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteSettingsToDisk">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="WriteSettingsToDiskResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetUnifiedLineup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUnifiedLineupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUnifiedLineupResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUnifiedLineupDisplayedChannels">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUnifiedLineupDisplayedChannelsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUnifiedLineupDisplayedChannelsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserLineups">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserLineupsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUserLineupsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBaseLineups">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBaseLineupsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBaseLineupsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeature">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFeatureResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFeatureResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOEMCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOEMCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetOEMCodeResult" type="s:int" />
          </s:sequence>
        </s:complexType>
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
  <wsdl:message name="GetNetURLSoapIn">
    <wsdl:part name="parameters" element="tns:GetNetURL" />
  </wsdl:message>
  <wsdl:message name="GetNetURLSoapOut">
    <wsdl:part name="parameters" element="tns:GetNetURLResponse" />
  </wsdl:message>
  <wsdl:message name="GetValidRecordingFormatsSoapIn">
    <wsdl:part name="parameters" element="tns:GetValidRecordingFormats" />
  </wsdl:message>
  <wsdl:message name="GetValidRecordingFormatsSoapOut">
    <wsdl:part name="parameters" element="tns:GetValidRecordingFormatsResponse" />
  </wsdl:message>
  <wsdl:message name="GetPropertySoapIn">
    <wsdl:part name="parameters" element="tns:GetProperty" />
  </wsdl:message>
  <wsdl:message name="GetPropertySoapOut">
    <wsdl:part name="parameters" element="tns:GetPropertyResponse" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsBoolSoapIn">
    <wsdl:part name="parameters" element="tns:GetPropertyAsBool" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsBoolSoapOut">
    <wsdl:part name="parameters" element="tns:GetPropertyAsBoolResponse" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsIntSoapIn">
    <wsdl:part name="parameters" element="tns:GetPropertyAsInt" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsIntSoapOut">
    <wsdl:part name="parameters" element="tns:GetPropertyAsIntResponse" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsDoubleSoapIn">
    <wsdl:part name="parameters" element="tns:GetPropertyAsDouble" />
  </wsdl:message>
  <wsdl:message name="GetPropertyAsDoubleSoapOut">
    <wsdl:part name="parameters" element="tns:GetPropertyAsDoubleResponse" />
  </wsdl:message>
  <wsdl:message name="SetPropertySoapIn">
    <wsdl:part name="parameters" element="tns:SetProperty" />
  </wsdl:message>
  <wsdl:message name="SetPropertySoapOut">
    <wsdl:part name="parameters" element="tns:SetPropertyResponse" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsBoolSoapIn">
    <wsdl:part name="parameters" element="tns:SetPropertyAsBool" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsBoolSoapOut">
    <wsdl:part name="parameters" element="tns:SetPropertyAsBoolResponse" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsIntSoapIn">
    <wsdl:part name="parameters" element="tns:SetPropertyAsInt" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsIntSoapOut">
    <wsdl:part name="parameters" element="tns:SetPropertyAsIntResponse" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsDoubleSoapIn">
    <wsdl:part name="parameters" element="tns:SetPropertyAsDouble" />
  </wsdl:message>
  <wsdl:message name="SetPropertyAsDoubleSoapOut">
    <wsdl:part name="parameters" element="tns:SetPropertyAsDoubleResponse" />
  </wsdl:message>
  <wsdl:message name="GetPropertyBagCollectionSoapIn">
    <wsdl:part name="parameters" element="tns:GetPropertyBagCollection" />
  </wsdl:message>
  <wsdl:message name="GetPropertyBagCollectionSoapOut">
    <wsdl:part name="parameters" element="tns:GetPropertyBagCollectionResponse" />
  </wsdl:message>
  <wsdl:message name="GetProfilesSoapIn">
    <wsdl:part name="parameters" element="tns:GetProfiles" />
  </wsdl:message>
  <wsdl:message name="GetProfilesSoapOut">
    <wsdl:part name="parameters" element="tns:GetProfilesResponse" />
  </wsdl:message>
  <wsdl:message name="GetDevicesSoapIn">
    <wsdl:part name="parameters" element="tns:GetDevices" />
  </wsdl:message>
  <wsdl:message name="GetDevicesSoapOut">
    <wsdl:part name="parameters" element="tns:GetDevicesResponse" />
  </wsdl:message>
  <wsdl:message name="SetProfilesSoapIn">
    <wsdl:part name="parameters" element="tns:SetProfiles" />
  </wsdl:message>
  <wsdl:message name="SetProfilesSoapOut">
    <wsdl:part name="parameters" element="tns:SetProfilesResponse" />
  </wsdl:message>
  <wsdl:message name="SetDevicesSoapIn">
    <wsdl:part name="parameters" element="tns:SetDevices" />
  </wsdl:message>
  <wsdl:message name="SetDevicesSoapOut">
    <wsdl:part name="parameters" element="tns:SetDevicesResponse" />
  </wsdl:message>
  <wsdl:message name="GetRadioLineupSoapIn">
    <wsdl:part name="parameters" element="tns:GetRadioLineup" />
  </wsdl:message>
  <wsdl:message name="GetRadioLineupSoapOut">
    <wsdl:part name="parameters" element="tns:GetRadioLineupResponse" />
  </wsdl:message>
  <wsdl:message name="WriteSettingsToDiskSoapIn">
    <wsdl:part name="parameters" element="tns:WriteSettingsToDisk" />
  </wsdl:message>
  <wsdl:message name="WriteSettingsToDiskSoapOut">
    <wsdl:part name="parameters" element="tns:WriteSettingsToDiskResponse" />
  </wsdl:message>
  <wsdl:message name="GetUnifiedLineupSoapIn">
    <wsdl:part name="parameters" element="tns:GetUnifiedLineup" />
  </wsdl:message>
  <wsdl:message name="GetUnifiedLineupSoapOut">
    <wsdl:part name="parameters" element="tns:GetUnifiedLineupResponse" />
  </wsdl:message>
  <wsdl:message name="GetUnifiedLineupDisplayedChannelsSoapIn">
    <wsdl:part name="parameters" element="tns:GetUnifiedLineupDisplayedChannels" />
  </wsdl:message>
  <wsdl:message name="GetUnifiedLineupDisplayedChannelsSoapOut">
    <wsdl:part name="parameters" element="tns:GetUnifiedLineupDisplayedChannelsResponse" />
  </wsdl:message>
  <wsdl:message name="GetUserLineupsSoapIn">
    <wsdl:part name="parameters" element="tns:GetUserLineups" />
  </wsdl:message>
  <wsdl:message name="GetUserLineupsSoapOut">
    <wsdl:part name="parameters" element="tns:GetUserLineupsResponse" />
  </wsdl:message>
  <wsdl:message name="GetBaseLineupsSoapIn">
    <wsdl:part name="parameters" element="tns:GetBaseLineups" />
  </wsdl:message>
  <wsdl:message name="GetBaseLineupsSoapOut">
    <wsdl:part name="parameters" element="tns:GetBaseLineupsResponse" />
  </wsdl:message>
  <wsdl:message name="GetFeatureSoapIn">
    <wsdl:part name="parameters" element="tns:GetFeature" />
  </wsdl:message>
  <wsdl:message name="GetFeatureSoapOut">
    <wsdl:part name="parameters" element="tns:GetFeatureResponse" />
  </wsdl:message>
  <wsdl:message name="GetOEMCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetOEMCode" />
  </wsdl:message>
  <wsdl:message name="GetOEMCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetOEMCodeResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVSettingsSoap">
    <wsdl:operation name="GetNetURL">
      <wsdl:input message="tns:GetNetURLSoapIn" />
      <wsdl:output message="tns:GetNetURLSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetValidRecordingFormats">
      <wsdl:input message="tns:GetValidRecordingFormatsSoapIn" />
      <wsdl:output message="tns:GetValidRecordingFormatsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProperty">
      <wsdl:input message="tns:GetPropertySoapIn" />
      <wsdl:output message="tns:GetPropertySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsBool">
      <wsdl:input message="tns:GetPropertyAsBoolSoapIn" />
      <wsdl:output message="tns:GetPropertyAsBoolSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsInt">
      <wsdl:input message="tns:GetPropertyAsIntSoapIn" />
      <wsdl:output message="tns:GetPropertyAsIntSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsDouble">
      <wsdl:input message="tns:GetPropertyAsDoubleSoapIn" />
      <wsdl:output message="tns:GetPropertyAsDoubleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetProperty">
      <wsdl:input message="tns:SetPropertySoapIn" />
      <wsdl:output message="tns:SetPropertySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsBool">
      <wsdl:input message="tns:SetPropertyAsBoolSoapIn" />
      <wsdl:output message="tns:SetPropertyAsBoolSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsInt">
      <wsdl:input message="tns:SetPropertyAsIntSoapIn" />
      <wsdl:output message="tns:SetPropertyAsIntSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsDouble">
      <wsdl:input message="tns:SetPropertyAsDoubleSoapIn" />
      <wsdl:output message="tns:SetPropertyAsDoubleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetPropertyBagCollection">
      <wsdl:input message="tns:GetPropertyBagCollectionSoapIn" />
      <wsdl:output message="tns:GetPropertyBagCollectionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetProfiles">
      <wsdl:input message="tns:GetProfilesSoapIn" />
      <wsdl:output message="tns:GetProfilesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDevices">
      <wsdl:input message="tns:GetDevicesSoapIn" />
      <wsdl:output message="tns:GetDevicesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetProfiles">
      <wsdl:input message="tns:SetProfilesSoapIn" />
      <wsdl:output message="tns:SetProfilesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetDevices">
      <wsdl:input message="tns:SetDevicesSoapIn" />
      <wsdl:output message="tns:SetDevicesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetRadioLineup">
      <wsdl:input message="tns:GetRadioLineupSoapIn" />
      <wsdl:output message="tns:GetRadioLineupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="WriteSettingsToDisk">
      <wsdl:input message="tns:WriteSettingsToDiskSoapIn" />
      <wsdl:output message="tns:WriteSettingsToDiskSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineup">
      <wsdl:input message="tns:GetUnifiedLineupSoapIn" />
      <wsdl:output message="tns:GetUnifiedLineupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineupDisplayedChannels">
      <wsdl:input message="tns:GetUnifiedLineupDisplayedChannelsSoapIn" />
      <wsdl:output message="tns:GetUnifiedLineupDisplayedChannelsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUserLineups">
      <wsdl:input message="tns:GetUserLineupsSoapIn" />
      <wsdl:output message="tns:GetUserLineupsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBaseLineups">
      <wsdl:input message="tns:GetBaseLineupsSoapIn" />
      <wsdl:output message="tns:GetBaseLineupsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFeature">
      <wsdl:input message="tns:GetFeatureSoapIn" />
      <wsdl:output message="tns:GetFeatureSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOEMCode">
      <wsdl:input message="tns:GetOEMCodeSoapIn" />
      <wsdl:output message="tns:GetOEMCodeSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVSettingsSoap" type="tns:BTVSettingsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetNetURL">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetNetURL" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetValidRecordingFormats">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetValidRecordingFormats" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProperty">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetProperty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsBool">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsBool" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsInt">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsInt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsDouble">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsDouble" style="document" />
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
    <wsdl:operation name="SetPropertyAsBool">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsBool" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsInt">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsInt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsDouble">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsDouble" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyBagCollection">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetPropertyBagCollection" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProfiles">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetProfiles" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDevices">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetDevices" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetProfiles">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetProfiles" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDevices">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetDevices" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRadioLineup">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetRadioLineup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteSettingsToDisk">
      <soap:operation soapAction="http://www.snapstream.com/WebService/WriteSettingsToDisk" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineup">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetUnifiedLineup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineupDisplayedChannels">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetUnifiedLineupDisplayedChannels" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserLineups">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetUserLineups" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBaseLineups">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetBaseLineups" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeature">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFeature" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOEMCode">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetOEMCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVSettingsSoap12" type="tns:BTVSettingsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetNetURL">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetNetURL" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetValidRecordingFormats">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetValidRecordingFormats" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProperty">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetProperty" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsBool">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsBool" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsInt">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsInt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyAsDouble">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPropertyAsDouble" style="document" />
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
    <wsdl:operation name="SetPropertyAsBool">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsBool" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsInt">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsInt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetPropertyAsDouble">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetPropertyAsDouble" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetPropertyBagCollection">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetPropertyBagCollection" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetProfiles">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetProfiles" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDevices">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetDevices" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetProfiles">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetProfiles" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetDevices">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetDevices" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetRadioLineup">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetRadioLineup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="WriteSettingsToDisk">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/WriteSettingsToDisk" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineup">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetUnifiedLineup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUnifiedLineupDisplayedChannels">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetUnifiedLineupDisplayedChannels" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserLineups">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetUserLineups" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBaseLineups">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetBaseLineups" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFeature">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFeature" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOEMCode">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetOEMCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVSettings">
    <wsdl:port name="BTVSettingsSoap" binding="tns:BTVSettingsSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVSettings.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVSettingsSoap12" binding="tns:BTVSettingsSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVSettings.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>