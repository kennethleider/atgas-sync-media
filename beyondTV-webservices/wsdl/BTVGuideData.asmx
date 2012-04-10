<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:element name="GetLastUpdateTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastUpdateTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastUpdateTimeResult" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDataExtents">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDataExtentsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetDataExtentsResult" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="maximum" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeyword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeywordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByKeywordResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetEpisodesByKeywordWithLimit">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="limit" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeywordWithLimitResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByKeywordWithLimitResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeywordWithOptions">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="titleSearch" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="descSearch" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="actorSearch" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="limit" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByKeywordWithOptionsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByKeywordWithOptionsResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByKeyword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByKeywordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesByKeywordResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByKeywordWithLimit">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="keyword" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="limit" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByKeywordWithLimitResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesByKeywordWithLimitResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeByStationAndTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="time" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodeByStationAndTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodeByStationAndTimeResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesBySeriesID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="epgID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesBySeriesIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesBySeriesIDResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFirstEpisodeBySeriesID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="epgID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFirstEpisodeBySeriesIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFirstEpisodeBySeriesIDResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndTimeRanges">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelIDStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelIDEnd" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="timeStart" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="timeEnd" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndTimeRangesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByStationAndTimeRangesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndSeriesID2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="epgID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndSeriesID2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByStationAndSeriesID2Result" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByStationResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFirstEpisodeByStationAndSeriesID2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="epgID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFirstEpisodeByStationAndSeriesID2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFirstEpisodeByStationAndSeriesID2Result" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByRange2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelIDStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelIDEnd" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="timeStart" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="timeEnd" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByRange2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByRange2Result" type="tns:ArrayOfArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ArrayOfString" nillable="true" type="tns:ArrayOfString" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="string" nillable="true" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetEpisodesByRange3">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="channels" type="tns:ArrayOfString" />
            <s:element minOccurs="1" maxOccurs="1" name="timeStart" type="s:unsignedLong" />
            <s:element minOccurs="1" maxOccurs="1" name="timeEnd" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByRange3Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByRange3Result" type="tns:ArrayOfArrayOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCollection">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCollectionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesCollectionResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCount2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCount2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetSeriesCount2Result" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeries2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="uiStart" type="s:unsignedInt" />
            <s:element minOccurs="1" maxOccurs="1" name="uiResults" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeries2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeries2Result" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchByTitle2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="partialTitle" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchByTitle2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SearchByTitle2Result" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCategories">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrCategory" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCategoriesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCategoriesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByCategory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrCategory" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bstrSubcategory" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByCategoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesByCategoryResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndSeriesID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="uniqueChannelID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="epgID" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="time" type="s:unsignedLong" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetEpisodesByStationAndSeriesIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetEpisodesByStationAndSeriesIDResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetSeriesCountResult" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByRange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="uiStart" type="s:unsignedInt" />
            <s:element minOccurs="1" maxOccurs="1" name="uiEnd" type="s:unsignedInt" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByRangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesByRangeResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchByTitle">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="partialTitle" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchByTitleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="SearchByTitleResult" type="s:unsignedInt" />
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
  <wsdl:message name="GetLastUpdateTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastUpdateTime" />
  </wsdl:message>
  <wsdl:message name="GetLastUpdateTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastUpdateTimeResponse" />
  </wsdl:message>
  <wsdl:message name="GetDataExtentsSoapIn">
    <wsdl:part name="parameters" element="tns:GetDataExtents" />
  </wsdl:message>
  <wsdl:message name="GetDataExtentsSoapOut">
    <wsdl:part name="parameters" element="tns:GetDataExtentsResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeyword" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordWithLimitSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithLimit" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordWithLimitSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithLimitResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordWithOptionsSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithOptions" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByKeywordWithOptionsSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByKeywordWithOptionsResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByKeywordSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesByKeyword" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByKeywordSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesByKeywordResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByKeywordWithLimitSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesByKeywordWithLimit" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByKeywordWithLimitSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesByKeywordWithLimitResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeByStationAndTimeSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodeByStationAndTime" />
  </wsdl:message>
  <wsdl:message name="GetEpisodeByStationAndTimeSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodeByStationAndTimeResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesBySeriesIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesBySeriesID" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesBySeriesIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesBySeriesIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetFirstEpisodeBySeriesIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetFirstEpisodeBySeriesID" />
  </wsdl:message>
  <wsdl:message name="GetFirstEpisodeBySeriesIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetFirstEpisodeBySeriesIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndTimeRangesSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndTimeRanges" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndTimeRangesSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndTimeRangesResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndSeriesID2SoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndSeriesID2" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndSeriesID2SoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndSeriesID2Response" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStation" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationResponse" />
  </wsdl:message>
  <wsdl:message name="GetFirstEpisodeByStationAndSeriesID2SoapIn">
    <wsdl:part name="parameters" element="tns:GetFirstEpisodeByStationAndSeriesID2" />
  </wsdl:message>
  <wsdl:message name="GetFirstEpisodeByStationAndSeriesID2SoapOut">
    <wsdl:part name="parameters" element="tns:GetFirstEpisodeByStationAndSeriesID2Response" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByRange2SoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByRange2" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByRange2SoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByRange2Response" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByRange3SoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByRange3" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByRange3SoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByRange3Response" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCollectionSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesCollection" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCollectionSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesCollectionResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCount2SoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesCount2" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCount2SoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesCount2Response" />
  </wsdl:message>
  <wsdl:message name="GetSeries2SoapIn">
    <wsdl:part name="parameters" element="tns:GetSeries2" />
  </wsdl:message>
  <wsdl:message name="GetSeries2SoapOut">
    <wsdl:part name="parameters" element="tns:GetSeries2Response" />
  </wsdl:message>
  <wsdl:message name="SearchByTitle2SoapIn">
    <wsdl:part name="parameters" element="tns:SearchByTitle2" />
  </wsdl:message>
  <wsdl:message name="SearchByTitle2SoapOut">
    <wsdl:part name="parameters" element="tns:SearchByTitle2Response" />
  </wsdl:message>
  <wsdl:message name="GetCategoriesSoapIn">
    <wsdl:part name="parameters" element="tns:GetCategories" />
  </wsdl:message>
  <wsdl:message name="GetCategoriesSoapOut">
    <wsdl:part name="parameters" element="tns:GetCategoriesResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByCategorySoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesByCategory" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByCategorySoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesByCategoryResponse" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndSeriesIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndSeriesID" />
  </wsdl:message>
  <wsdl:message name="GetEpisodesByStationAndSeriesIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetEpisodesByStationAndSeriesIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesCount" />
  </wsdl:message>
  <wsdl:message name="GetSeriesCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesCountResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByRangeSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesByRange" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByRangeSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesByRangeResponse" />
  </wsdl:message>
  <wsdl:message name="SearchByTitleSoapIn">
    <wsdl:part name="parameters" element="tns:SearchByTitle" />
  </wsdl:message>
  <wsdl:message name="SearchByTitleSoapOut">
    <wsdl:part name="parameters" element="tns:SearchByTitleResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVGuideDataSoap">
    <wsdl:operation name="GetLastUpdateTime">
      <wsdl:input message="tns:GetLastUpdateTimeSoapIn" />
      <wsdl:output message="tns:GetLastUpdateTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDataExtents">
      <wsdl:input message="tns:GetDataExtentsSoapIn" />
      <wsdl:output message="tns:GetDataExtentsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeyword">
      <wsdl:input message="tns:GetEpisodesByKeywordSoapIn" />
      <wsdl:output message="tns:GetEpisodesByKeywordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <wsdl:input message="tns:GetEpisodesByKeywordWithLimitSoapIn" />
      <wsdl:output message="tns:GetEpisodesByKeywordWithLimitSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithOptions">
      <wsdl:input message="tns:GetEpisodesByKeywordWithOptionsSoapIn" />
      <wsdl:output message="tns:GetEpisodesByKeywordWithOptionsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeyword">
      <wsdl:input message="tns:GetSeriesByKeywordSoapIn" />
      <wsdl:output message="tns:GetSeriesByKeywordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeywordWithLimit">
      <wsdl:input message="tns:GetSeriesByKeywordWithLimitSoapIn" />
      <wsdl:output message="tns:GetSeriesByKeywordWithLimitSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeByStationAndTime">
      <wsdl:input message="tns:GetEpisodeByStationAndTimeSoapIn" />
      <wsdl:output message="tns:GetEpisodeByStationAndTimeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesBySeriesID">
      <wsdl:input message="tns:GetEpisodesBySeriesIDSoapIn" />
      <wsdl:output message="tns:GetEpisodesBySeriesIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeBySeriesID">
      <wsdl:input message="tns:GetFirstEpisodeBySeriesIDSoapIn" />
      <wsdl:output message="tns:GetFirstEpisodeBySeriesIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndTimeRanges">
      <wsdl:input message="tns:GetEpisodesByStationAndTimeRangesSoapIn" />
      <wsdl:output message="tns:GetEpisodesByStationAndTimeRangesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID2">
      <wsdl:input message="tns:GetEpisodesByStationAndSeriesID2SoapIn" />
      <wsdl:output message="tns:GetEpisodesByStationAndSeriesID2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStation">
      <wsdl:input message="tns:GetEpisodesByStationSoapIn" />
      <wsdl:output message="tns:GetEpisodesByStationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeByStationAndSeriesID2">
      <wsdl:input message="tns:GetFirstEpisodeByStationAndSeriesID2SoapIn" />
      <wsdl:output message="tns:GetFirstEpisodeByStationAndSeriesID2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange2">
      <wsdl:input message="tns:GetEpisodesByRange2SoapIn" />
      <wsdl:output message="tns:GetEpisodesByRange2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange3">
      <wsdl:input message="tns:GetEpisodesByRange3SoapIn" />
      <wsdl:output message="tns:GetEpisodesByRange3SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCollection">
      <wsdl:input message="tns:GetSeriesCollectionSoapIn" />
      <wsdl:output message="tns:GetSeriesCollectionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount2">
      <wsdl:input message="tns:GetSeriesCount2SoapIn" />
      <wsdl:output message="tns:GetSeriesCount2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeries2">
      <wsdl:input message="tns:GetSeries2SoapIn" />
      <wsdl:output message="tns:GetSeries2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle2">
      <wsdl:input message="tns:SearchByTitle2SoapIn" />
      <wsdl:output message="tns:SearchByTitle2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCategories">
      <wsdl:input message="tns:GetCategoriesSoapIn" />
      <wsdl:output message="tns:GetCategoriesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByCategory">
      <wsdl:input message="tns:GetSeriesByCategorySoapIn" />
      <wsdl:output message="tns:GetSeriesByCategorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID">
      <wsdl:input message="tns:GetEpisodesByStationAndSeriesIDSoapIn" />
      <wsdl:output message="tns:GetEpisodesByStationAndSeriesIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount">
      <wsdl:input message="tns:GetSeriesCountSoapIn" />
      <wsdl:output message="tns:GetSeriesCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByRange">
      <wsdl:input message="tns:GetSeriesByRangeSoapIn" />
      <wsdl:output message="tns:GetSeriesByRangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle">
      <wsdl:input message="tns:SearchByTitleSoapIn" />
      <wsdl:output message="tns:SearchByTitleSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVGuideDataSoap" type="tns:BTVGuideDataSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetLastUpdateTime">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastUpdateTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDataExtents">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetDataExtents" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeyword">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeyword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithOptions">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithOptions" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeyword">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByKeyword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeywordWithLimit">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeByStationAndTime">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeByStationAndTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesBySeriesID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesBySeriesID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeBySeriesID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFirstEpisodeBySeriesID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndTimeRanges">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndTimeRanges" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStation">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeByStationAndSeriesID2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFirstEpisodeByStationAndSeriesID2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByRange2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange3">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByRange3" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCollection">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCollection" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCount2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeries2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeries2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SearchByTitle2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCategories">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetCategories" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByCategory">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByCategory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByRange">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByRange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SearchByTitle" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVGuideDataSoap12" type="tns:BTVGuideDataSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetLastUpdateTime">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastUpdateTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDataExtents">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetDataExtents" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeyword">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeyword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithLimit">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByKeywordWithOptions">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByKeywordWithOptions" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeyword">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByKeyword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByKeywordWithLimit">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByKeywordWithLimit" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodeByStationAndTime">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodeByStationAndTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesBySeriesID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesBySeriesID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeBySeriesID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFirstEpisodeBySeriesID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndTimeRanges">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndTimeRanges" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStation">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFirstEpisodeByStationAndSeriesID2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFirstEpisodeByStationAndSeriesID2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByRange2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByRange3">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByRange3" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCollection">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCollection" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCount2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeries2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeries2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SearchByTitle2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCategories">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetCategories" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByCategory">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByCategory" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetEpisodesByStationAndSeriesID">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetEpisodesByStationAndSeriesID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesCount">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByRange">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesByRange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchByTitle">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SearchByTitle" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVGuideData">
    <wsdl:port name="BTVGuideDataSoap" binding="tns:BTVGuideDataSoap">
      <soap:address location="http://localhost:8129/wsdl/BTVGuideData.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVGuideDataSoap12" binding="tns:BTVGuideDataSoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVGuideData.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>