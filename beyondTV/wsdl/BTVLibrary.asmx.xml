<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.snapstream.com/WebService" xmlns:s1="http://www.snapstream.com/types" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s2="http://microsoft.com/wsdl/types/" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.snapstream.com/WebService" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.snapstream.com/WebService">
      <s:import namespace="http://www.snapstream.com/types" />
      <s:import namespace="http://microsoft.com/wsdl/types/" />
      <s:element name="GetFolders">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folderName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFoldersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFoldersResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfPVSPropertyBag">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="PVSPropertyBag" nillable="true" type="s1:PVSPropertyBag" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetFoldersByRange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folderName" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFoldersByRangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFoldersByRangeResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folderName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFolderResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastChange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetLastChangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetLastChangeResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFolder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sFolder" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFolderResponse">
        <s:complexType />
      </s:element>
      <s:element name="AddFolder2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sFolder" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="bRecurse" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFolder2Response">
        <s:complexType />
      </s:element>
      <s:element name="AddFolder3">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sFolder" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="bRecurse" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="bManaged" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddFolder3Response">
        <s:complexType />
      </s:element>
      <s:element name="RemoveFolder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="sFolder" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RemoveFolderResponse">
        <s:complexType />
      </s:element>
      <s:element name="EditMedia">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fullName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="bag" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditMediaResponse">
        <s:complexType />
      </s:element>
      <s:element name="SetUserSpecificProperty">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fullName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="property" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="value" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SetUserSpecificPropertyResponse">
        <s:complexType />
      </s:element>
      <s:element name="DeleteMedia">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fullName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DeleteMediaResponse">
        <s:complexType />
      </s:element>
      <s:element name="GetAllClipsWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:simpleType name="LibraryHideOption">
        <s:restriction base="s:string">
          <s:enumeration value="ReplaceShowSqueezed" />
          <s:enumeration value="ReplaceOriginals" />
          <s:enumeration value="Originals" />
          <s:enumeration value="ShowSqueezed" />
          <s:enumeration value="None" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="LibrarySort">
        <s:restriction base="s:string">
          <s:enumeration value="Duration" />
          <s:enumeration value="FileName" />
          <s:enumeration value="Name" />
          <s:enumeration value="OriginalAirDate" />
          <s:enumeration value="DateRecorded" />
          <s:enumeration value="FileType" />
        </s:restriction>
      </s:simpleType>
      <s:simpleType name="LibrarySortOrder">
        <s:restriction base="s:string">
          <s:enumeration value="Descending" />
          <s:enumeration value="Ascending" />
        </s:restriction>
      </s:simpleType>
      <s:element name="GetAllClipsWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllClipsWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyClips">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMyClipsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMyClipsResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClips">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClipsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetClipsResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllMediaWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetAllMediaWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetAllMediaWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMedia">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMediaResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMediaResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewClipsByDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewClipsByDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FlatViewClipsByDateResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FlatViewByDateResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByDate2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="index" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByDate2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FlatViewByDate2Result" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByTitle">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FlatViewByTitleResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FlatViewByTitleResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeries">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByRange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesByRangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesByRangeResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsBySeriesWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="series" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsBySeriesWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemsBySeriesWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="series" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetSeriesWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetSeriesWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByFolderWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folder" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByFolderWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemsByFolderWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolderWithFilter">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folder" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="hide" type="tns:LibraryHideOption" />
            <s:element minOccurs="1" maxOccurs="1" name="sort" type="tns:LibrarySort" />
            <s:element minOccurs="1" maxOccurs="1" name="order" type="tns:LibrarySortOrder" />
            <s:element minOccurs="1" maxOccurs="1" name="start" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="count" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolderWithFilterResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFolderWithFilterResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="totalCount" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsBySeries">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="series" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsBySeriesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemsBySeriesResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByFolder">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folder" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByFolderResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemsByFolderResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByJob">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="job" type="s2:guid" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemsByJobResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemsByJobResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMediaByFullName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="fullName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetMediaByFullNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetMediaByFullNameResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDriveInformationByName">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="driveName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDriveInformationByNameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDriveInformationByNameResult" type="s1:PVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCC">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="search" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pageNumber" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="resultsPerPage" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="titleSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="descSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="ccSearch" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightEnd" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AdvancedSearchCCResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="numberOfPages" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="numberOfResults" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCWithSuggestion">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="search" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="pageNumber" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="resultsPerPage" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="titleSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="descSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="ccSearch" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightEnd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionEnd" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCWithSuggestionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AdvancedSearchCCWithSuggestionResult" type="tns:ArrayOfPVSPropertyBag" />
            <s:element minOccurs="1" maxOccurs="1" name="numberOfPages" type="s:int" />
            <s:element minOccurs="1" maxOccurs="1" name="numberOfResults" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestion" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionFormatted" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOldestUnlockedMediaDateTicks">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetOldestUnlockedMediaDateTicksResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetOldestUnlockedMediaDateTicksResult" type="s:long" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="search" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="titleSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="descSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="ccSearch" type="s:boolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AdvancedSearchCCCountResult" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCCountWithSuggestion">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="search" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="titleSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="descSearch" type="s:boolean" />
            <s:element minOccurs="1" maxOccurs="1" name="ccSearch" type="s:boolean" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionEnd" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AdvancedSearchCCCountWithSuggestionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="AdvancedSearchCCCountWithSuggestionResult" type="s:int" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestion" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="suggestionFormatted" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LuceneHighlightString">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="inputString" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="query" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightStart" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="highlightEnd" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="LuceneHighlightStringResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="LuceneHighlightStringResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetStatsInformation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetStatsInformationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetStatsInformationResult" type="tns:ArrayOfPVSPropertyBag" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolderMediaCount">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="authTicket" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="folderName" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFolderMediaCountResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="GetFolderMediaCountResult" type="s:int" />
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
    <s:schema elementFormDefault="qualified" targetNamespace="http://microsoft.com/wsdl/types/">
      <s:simpleType name="guid">
        <s:restriction base="s:string">
          <s:pattern value="[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" />
        </s:restriction>
      </s:simpleType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetFoldersSoapIn">
    <wsdl:part name="parameters" element="tns:GetFolders" />
  </wsdl:message>
  <wsdl:message name="GetFoldersSoapOut">
    <wsdl:part name="parameters" element="tns:GetFoldersResponse" />
  </wsdl:message>
  <wsdl:message name="GetFoldersByRangeSoapIn">
    <wsdl:part name="parameters" element="tns:GetFoldersByRange" />
  </wsdl:message>
  <wsdl:message name="GetFoldersByRangeSoapOut">
    <wsdl:part name="parameters" element="tns:GetFoldersByRangeResponse" />
  </wsdl:message>
  <wsdl:message name="GetFolderSoapIn">
    <wsdl:part name="parameters" element="tns:GetFolder" />
  </wsdl:message>
  <wsdl:message name="GetFolderSoapOut">
    <wsdl:part name="parameters" element="tns:GetFolderResponse" />
  </wsdl:message>
  <wsdl:message name="GetLastChangeSoapIn">
    <wsdl:part name="parameters" element="tns:GetLastChange" />
  </wsdl:message>
  <wsdl:message name="GetLastChangeSoapOut">
    <wsdl:part name="parameters" element="tns:GetLastChangeResponse" />
  </wsdl:message>
  <wsdl:message name="AddFolderSoapIn">
    <wsdl:part name="parameters" element="tns:AddFolder" />
  </wsdl:message>
  <wsdl:message name="AddFolderSoapOut">
    <wsdl:part name="parameters" element="tns:AddFolderResponse" />
  </wsdl:message>
  <wsdl:message name="AddFolder2SoapIn">
    <wsdl:part name="parameters" element="tns:AddFolder2" />
  </wsdl:message>
  <wsdl:message name="AddFolder2SoapOut">
    <wsdl:part name="parameters" element="tns:AddFolder2Response" />
  </wsdl:message>
  <wsdl:message name="AddFolder3SoapIn">
    <wsdl:part name="parameters" element="tns:AddFolder3" />
  </wsdl:message>
  <wsdl:message name="AddFolder3SoapOut">
    <wsdl:part name="parameters" element="tns:AddFolder3Response" />
  </wsdl:message>
  <wsdl:message name="RemoveFolderSoapIn">
    <wsdl:part name="parameters" element="tns:RemoveFolder" />
  </wsdl:message>
  <wsdl:message name="RemoveFolderSoapOut">
    <wsdl:part name="parameters" element="tns:RemoveFolderResponse" />
  </wsdl:message>
  <wsdl:message name="EditMediaSoapIn">
    <wsdl:part name="parameters" element="tns:EditMedia" />
  </wsdl:message>
  <wsdl:message name="EditMediaSoapOut">
    <wsdl:part name="parameters" element="tns:EditMediaResponse" />
  </wsdl:message>
  <wsdl:message name="SetUserSpecificPropertySoapIn">
    <wsdl:part name="parameters" element="tns:SetUserSpecificProperty" />
  </wsdl:message>
  <wsdl:message name="SetUserSpecificPropertySoapOut">
    <wsdl:part name="parameters" element="tns:SetUserSpecificPropertyResponse" />
  </wsdl:message>
  <wsdl:message name="DeleteMediaSoapIn">
    <wsdl:part name="parameters" element="tns:DeleteMedia" />
  </wsdl:message>
  <wsdl:message name="DeleteMediaSoapOut">
    <wsdl:part name="parameters" element="tns:DeleteMediaResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllClipsWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllClipsWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetAllClipsWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllClipsWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetMyClipsSoapIn">
    <wsdl:part name="parameters" element="tns:GetMyClips" />
  </wsdl:message>
  <wsdl:message name="GetMyClipsSoapOut">
    <wsdl:part name="parameters" element="tns:GetMyClipsResponse" />
  </wsdl:message>
  <wsdl:message name="GetClipsSoapIn">
    <wsdl:part name="parameters" element="tns:GetClips" />
  </wsdl:message>
  <wsdl:message name="GetClipsSoapOut">
    <wsdl:part name="parameters" element="tns:GetClipsResponse" />
  </wsdl:message>
  <wsdl:message name="GetAllMediaWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetAllMediaWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetAllMediaWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetAllMediaWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetMediaSoapIn">
    <wsdl:part name="parameters" element="tns:GetMedia" />
  </wsdl:message>
  <wsdl:message name="GetMediaSoapOut">
    <wsdl:part name="parameters" element="tns:GetMediaResponse" />
  </wsdl:message>
  <wsdl:message name="FlatViewClipsByDateSoapIn">
    <wsdl:part name="parameters" element="tns:FlatViewClipsByDate" />
  </wsdl:message>
  <wsdl:message name="FlatViewClipsByDateSoapOut">
    <wsdl:part name="parameters" element="tns:FlatViewClipsByDateResponse" />
  </wsdl:message>
  <wsdl:message name="FlatViewByDateSoapIn">
    <wsdl:part name="parameters" element="tns:FlatViewByDate" />
  </wsdl:message>
  <wsdl:message name="FlatViewByDateSoapOut">
    <wsdl:part name="parameters" element="tns:FlatViewByDateResponse" />
  </wsdl:message>
  <wsdl:message name="FlatViewByDate2SoapIn">
    <wsdl:part name="parameters" element="tns:FlatViewByDate2" />
  </wsdl:message>
  <wsdl:message name="FlatViewByDate2SoapOut">
    <wsdl:part name="parameters" element="tns:FlatViewByDate2Response" />
  </wsdl:message>
  <wsdl:message name="FlatViewByTitleSoapIn">
    <wsdl:part name="parameters" element="tns:FlatViewByTitle" />
  </wsdl:message>
  <wsdl:message name="FlatViewByTitleSoapOut">
    <wsdl:part name="parameters" element="tns:FlatViewByTitleResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeries" />
  </wsdl:message>
  <wsdl:message name="GetSeriesSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByRangeSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesByRange" />
  </wsdl:message>
  <wsdl:message name="GetSeriesByRangeSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesByRangeResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemsBySeriesWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemsBySeriesWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetItemsBySeriesWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemsBySeriesWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetSeriesWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetSeriesWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetSeriesWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetSeriesWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemsByFolderWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemsByFolderWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetItemsByFolderWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemsByFolderWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetFolderWithFilterSoapIn">
    <wsdl:part name="parameters" element="tns:GetFolderWithFilter" />
  </wsdl:message>
  <wsdl:message name="GetFolderWithFilterSoapOut">
    <wsdl:part name="parameters" element="tns:GetFolderWithFilterResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemsBySeriesSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemsBySeries" />
  </wsdl:message>
  <wsdl:message name="GetItemsBySeriesSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemsBySeriesResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemsByFolderSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemsByFolder" />
  </wsdl:message>
  <wsdl:message name="GetItemsByFolderSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemsByFolderResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemsByJobSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemsByJob" />
  </wsdl:message>
  <wsdl:message name="GetItemsByJobSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemsByJobResponse" />
  </wsdl:message>
  <wsdl:message name="GetMediaByFullNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetMediaByFullName" />
  </wsdl:message>
  <wsdl:message name="GetMediaByFullNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetMediaByFullNameResponse" />
  </wsdl:message>
  <wsdl:message name="GetDriveInformationByNameSoapIn">
    <wsdl:part name="parameters" element="tns:GetDriveInformationByName" />
  </wsdl:message>
  <wsdl:message name="GetDriveInformationByNameSoapOut">
    <wsdl:part name="parameters" element="tns:GetDriveInformationByNameResponse" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCSoapIn">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCC" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCSoapOut">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCResponse" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCWithSuggestionSoapIn">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCWithSuggestion" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCWithSuggestionSoapOut">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCWithSuggestionResponse" />
  </wsdl:message>
  <wsdl:message name="GetOldestUnlockedMediaDateTicksSoapIn">
    <wsdl:part name="parameters" element="tns:GetOldestUnlockedMediaDateTicks" />
  </wsdl:message>
  <wsdl:message name="GetOldestUnlockedMediaDateTicksSoapOut">
    <wsdl:part name="parameters" element="tns:GetOldestUnlockedMediaDateTicksResponse" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCCountSoapIn">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCCount" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCCountSoapOut">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCCountResponse" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCCountWithSuggestionSoapIn">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCCountWithSuggestion" />
  </wsdl:message>
  <wsdl:message name="AdvancedSearchCCCountWithSuggestionSoapOut">
    <wsdl:part name="parameters" element="tns:AdvancedSearchCCCountWithSuggestionResponse" />
  </wsdl:message>
  <wsdl:message name="LuceneHighlightStringSoapIn">
    <wsdl:part name="parameters" element="tns:LuceneHighlightString" />
  </wsdl:message>
  <wsdl:message name="LuceneHighlightStringSoapOut">
    <wsdl:part name="parameters" element="tns:LuceneHighlightStringResponse" />
  </wsdl:message>
  <wsdl:message name="GetStatsInformationSoapIn">
    <wsdl:part name="parameters" element="tns:GetStatsInformation" />
  </wsdl:message>
  <wsdl:message name="GetStatsInformationSoapOut">
    <wsdl:part name="parameters" element="tns:GetStatsInformationResponse" />
  </wsdl:message>
  <wsdl:message name="GetFolderMediaCountSoapIn">
    <wsdl:part name="parameters" element="tns:GetFolderMediaCount" />
  </wsdl:message>
  <wsdl:message name="GetFolderMediaCountSoapOut">
    <wsdl:part name="parameters" element="tns:GetFolderMediaCountResponse" />
  </wsdl:message>
  <wsdl:portType name="BTVLibrarySoap">
    <wsdl:operation name="GetFolders">
      <wsdl:input message="tns:GetFoldersSoapIn" />
      <wsdl:output message="tns:GetFoldersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFoldersByRange">
      <wsdl:input message="tns:GetFoldersByRangeSoapIn" />
      <wsdl:output message="tns:GetFoldersByRangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFolder">
      <wsdl:input message="tns:GetFolderSoapIn" />
      <wsdl:output message="tns:GetFolderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetLastChange">
      <wsdl:input message="tns:GetLastChangeSoapIn" />
      <wsdl:output message="tns:GetLastChangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFolder">
      <wsdl:input message="tns:AddFolderSoapIn" />
      <wsdl:output message="tns:AddFolderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFolder2">
      <wsdl:input message="tns:AddFolder2SoapIn" />
      <wsdl:output message="tns:AddFolder2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddFolder3">
      <wsdl:input message="tns:AddFolder3SoapIn" />
      <wsdl:output message="tns:AddFolder3SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RemoveFolder">
      <wsdl:input message="tns:RemoveFolderSoapIn" />
      <wsdl:output message="tns:RemoveFolderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditMedia">
      <wsdl:input message="tns:EditMediaSoapIn" />
      <wsdl:output message="tns:EditMediaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SetUserSpecificProperty">
      <wsdl:input message="tns:SetUserSpecificPropertySoapIn" />
      <wsdl:output message="tns:SetUserSpecificPropertySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DeleteMedia">
      <wsdl:input message="tns:DeleteMediaSoapIn" />
      <wsdl:output message="tns:DeleteMediaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllClipsWithFilter">
      <wsdl:input message="tns:GetAllClipsWithFilterSoapIn" />
      <wsdl:output message="tns:GetAllClipsWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMyClips">
      <wsdl:input message="tns:GetMyClipsSoapIn" />
      <wsdl:output message="tns:GetMyClipsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetClips">
      <wsdl:input message="tns:GetClipsSoapIn" />
      <wsdl:output message="tns:GetClipsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetAllMediaWithFilter">
      <wsdl:input message="tns:GetAllMediaWithFilterSoapIn" />
      <wsdl:output message="tns:GetAllMediaWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMedia">
      <wsdl:input message="tns:GetMediaSoapIn" />
      <wsdl:output message="tns:GetMediaSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FlatViewClipsByDate">
      <wsdl:input message="tns:FlatViewClipsByDateSoapIn" />
      <wsdl:output message="tns:FlatViewClipsByDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate">
      <wsdl:input message="tns:FlatViewByDateSoapIn" />
      <wsdl:output message="tns:FlatViewByDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate2">
      <wsdl:input message="tns:FlatViewByDate2SoapIn" />
      <wsdl:output message="tns:FlatViewByDate2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FlatViewByTitle">
      <wsdl:input message="tns:FlatViewByTitleSoapIn" />
      <wsdl:output message="tns:FlatViewByTitleSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeries">
      <wsdl:input message="tns:GetSeriesSoapIn" />
      <wsdl:output message="tns:GetSeriesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesByRange">
      <wsdl:input message="tns:GetSeriesByRangeSoapIn" />
      <wsdl:output message="tns:GetSeriesByRangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemsBySeriesWithFilter">
      <wsdl:input message="tns:GetItemsBySeriesWithFilterSoapIn" />
      <wsdl:output message="tns:GetItemsBySeriesWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetSeriesWithFilter">
      <wsdl:input message="tns:GetSeriesWithFilterSoapIn" />
      <wsdl:output message="tns:GetSeriesWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolderWithFilter">
      <wsdl:input message="tns:GetItemsByFolderWithFilterSoapIn" />
      <wsdl:output message="tns:GetItemsByFolderWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFolderWithFilter">
      <wsdl:input message="tns:GetFolderWithFilterSoapIn" />
      <wsdl:output message="tns:GetFolderWithFilterSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemsBySeries">
      <wsdl:input message="tns:GetItemsBySeriesSoapIn" />
      <wsdl:output message="tns:GetItemsBySeriesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolder">
      <wsdl:input message="tns:GetItemsByFolderSoapIn" />
      <wsdl:output message="tns:GetItemsByFolderSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemsByJob">
      <wsdl:input message="tns:GetItemsByJobSoapIn" />
      <wsdl:output message="tns:GetItemsByJobSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetMediaByFullName">
      <wsdl:input message="tns:GetMediaByFullNameSoapIn" />
      <wsdl:output message="tns:GetMediaByFullNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetDriveInformationByName">
      <wsdl:input message="tns:GetDriveInformationByNameSoapIn" />
      <wsdl:output message="tns:GetDriveInformationByNameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCC">
      <wsdl:input message="tns:AdvancedSearchCCSoapIn" />
      <wsdl:output message="tns:AdvancedSearchCCSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCWithSuggestion">
      <wsdl:input message="tns:AdvancedSearchCCWithSuggestionSoapIn" />
      <wsdl:output message="tns:AdvancedSearchCCWithSuggestionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetOldestUnlockedMediaDateTicks">
      <wsdl:input message="tns:GetOldestUnlockedMediaDateTicksSoapIn" />
      <wsdl:output message="tns:GetOldestUnlockedMediaDateTicksSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCount">
      <wsdl:input message="tns:AdvancedSearchCCCountSoapIn" />
      <wsdl:output message="tns:AdvancedSearchCCCountSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCountWithSuggestion">
      <wsdl:input message="tns:AdvancedSearchCCCountWithSuggestionSoapIn" />
      <wsdl:output message="tns:AdvancedSearchCCCountWithSuggestionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="LuceneHighlightString">
      <wsdl:input message="tns:LuceneHighlightStringSoapIn" />
      <wsdl:output message="tns:LuceneHighlightStringSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetStatsInformation">
      <wsdl:input message="tns:GetStatsInformationSoapIn" />
      <wsdl:output message="tns:GetStatsInformationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFolderMediaCount">
      <wsdl:input message="tns:GetFolderMediaCountSoapIn" />
      <wsdl:output message="tns:GetFolderMediaCountSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="BTVLibrarySoap" type="tns:BTVLibrarySoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetFolders">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFolders" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFoldersByRange">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFoldersByRange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolder">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFolder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastChange">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetLastChange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddFolder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddFolder2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder3">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AddFolder3" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveFolder">
      <soap:operation soapAction="http://www.snapstream.com/WebService/RemoveFolder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditMedia">
      <soap:operation soapAction="http://www.snapstream.com/WebService/EditMedia" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetUserSpecificProperty">
      <soap:operation soapAction="http://www.snapstream.com/WebService/SetUserSpecificProperty" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteMedia">
      <soap:operation soapAction="http://www.snapstream.com/WebService/DeleteMedia" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllClipsWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetAllClipsWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyClips">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetMyClips" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClips">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetClips" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllMediaWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetAllMediaWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMedia">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetMedia" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewClipsByDate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/FlatViewClipsByDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate">
      <soap:operation soapAction="http://www.snapstream.com/WebService/FlatViewByDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate2">
      <soap:operation soapAction="http://www.snapstream.com/WebService/FlatViewByDate2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByTitle">
      <soap:operation soapAction="http://www.snapstream.com/WebService/FlatViewByTitle" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeries">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeries" style="document" />
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
    <wsdl:operation name="GetItemsBySeriesWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetItemsBySeriesWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetSeriesWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolderWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetItemsByFolderWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolderWithFilter">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFolderWithFilter" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsBySeries">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetItemsBySeries" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolder">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetItemsByFolder" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByJob">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetItemsByJob" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMediaByFullName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetMediaByFullName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDriveInformationByName">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetDriveInformationByName" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCC">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCC" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCWithSuggestion">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCWithSuggestion" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOldestUnlockedMediaDateTicks">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetOldestUnlockedMediaDateTicks" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCount">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCountWithSuggestion">
      <soap:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCCountWithSuggestion" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LuceneHighlightString">
      <soap:operation soapAction="http://www.snapstream.com/WebService/LuceneHighlightString" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStatsInformation">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetStatsInformation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolderMediaCount">
      <soap:operation soapAction="http://www.snapstream.com/WebService/GetFolderMediaCount" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="BTVLibrarySoap12" type="tns:BTVLibrarySoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetFolders">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFolders" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFoldersByRange">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFoldersByRange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolder">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFolder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetLastChange">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetLastChange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddFolder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddFolder2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddFolder3">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AddFolder3" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RemoveFolder">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/RemoveFolder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditMedia">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/EditMedia" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SetUserSpecificProperty">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/SetUserSpecificProperty" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DeleteMedia">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/DeleteMedia" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllClipsWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetAllClipsWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMyClips">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetMyClips" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClips">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetClips" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetAllMediaWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetAllMediaWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMedia">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetMedia" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewClipsByDate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/FlatViewClipsByDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/FlatViewByDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByDate2">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/FlatViewByDate2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FlatViewByTitle">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/FlatViewByTitle" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeries">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeries" style="document" />
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
    <wsdl:operation name="GetItemsBySeriesWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetItemsBySeriesWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetSeriesWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetSeriesWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolderWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetItemsByFolderWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolderWithFilter">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFolderWithFilter" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsBySeries">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetItemsBySeries" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByFolder">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetItemsByFolder" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemsByJob">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetItemsByJob" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetMediaByFullName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetMediaByFullName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetDriveInformationByName">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetDriveInformationByName" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCC">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCC" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCWithSuggestion">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCWithSuggestion" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetOldestUnlockedMediaDateTicks">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetOldestUnlockedMediaDateTicks" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCount">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AdvancedSearchCCCountWithSuggestion">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/AdvancedSearchCCCountWithSuggestion" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="LuceneHighlightString">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/LuceneHighlightString" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetStatsInformation">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetStatsInformation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFolderMediaCount">
      <soap12:operation soapAction="http://www.snapstream.com/WebService/GetFolderMediaCount" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="BTVLibrary">
    <wsdl:port name="BTVLibrarySoap" binding="tns:BTVLibrarySoap">
      <soap:address location="http://localhost:8129/wsdl/BTVLibrary.asmx" />
    </wsdl:port>
    <wsdl:port name="BTVLibrarySoap12" binding="tns:BTVLibrarySoap12">
      <soap12:address location="http://localhost:8129/wsdl/BTVLibrary.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>