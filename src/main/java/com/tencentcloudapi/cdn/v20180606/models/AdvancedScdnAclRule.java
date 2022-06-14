/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedScdnAclRule extends AbstractModel{

    /**
    * Keyword. Valid values:
`protocol`: HTTP protocol
`httpVersion`: HTTP version
`method`: request method
`ip`: requester IP
`ipAsn`: ASN of the requester IP
`ipCountry`: country/region of the requester IP
`ipArea`: region of the requester IP
`xForwardFor`: X-Forward-For request header
`directory`: path
`index`: homepage
`path`: full path of a file
`file`: file extension
`param`: request parameter
`referer`: Referer request header
`cookie`: Cookie request header
`userAgent`: User-Agent request header
`head`: custom request header
    */
    @SerializedName("MatchKey")
    @Expose
    private String MatchKey;

    /**
    * Logical operator. Valid values:
`exclude`: the keyword is not included
`include`: the keyword is included
`notequal`: not the same as the keyword
`equal`: the same as the keyword
`matching`: the prefix is matched
`null`: empty or does not exist
    */
    @SerializedName("LogicOperator")
    @Expose
    private String LogicOperator;

    /**
    * Match value
When `MatchKey` is `protocol`,
Values: `HTTP` and `HTTPS`.

When `MatchKey` is `httpVersion`,
Values: `HTTP/1.0`, `HTTP/1.1`, `HTTP/1.2`, `HTTP/2`, and `HTTP/3`.

When `MatchKey` is `method`,
Values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.

When `MatchKey` is `ipCountry`, valid values include:
`OTHER`: other countries/regions
`VE`: Venezuela
`UY`: Uruguay
`SR`: Suriname
`PY`: Paraguay
`PE`: Peru
`GY`: Guyana
`EC`: Ecuador
`CO`: Colombia
`CL`: Chile
`BR`: Brazil
`BO`: Bolivia
`AR`: Argentina
`NZ`: New Zealand
`WS`: Samoa
`VU`: Vanuatu
`TV`: Tuvalu
`TO`: Tonga
`TK`: Tokelau
`PW`: Palau
`NU`: Niue
`NR`: Nauru
`KI`: Kiribati
`GU`: Guam
`FM`: Micronesia
`AU`: Australia
`US`: United States
`PR`: Puerto Rico
`DO`: Dominican Republic
`CR`: Costa Rica
`AS`: American Samoa
`AG`: Antigua and Barbuda
`PA`: Panama
`NI`: Nicaragua
`MX`: Mexico
`JM`: Jamaica
`HT`: Haiti
`HN`: Honduras
`GT`: Guatemala
`GP`: Guadeloupe
`GL`: Greenland
`GD`: Grenada
`CU`: Cuba
`CA`: Canada
`BZ`: Belize
`BS`: Bahamas
`BM`: Bermuda
`BB`: Barbados
`AW`: Aruba
`AI`: Anguilla
`VA`: Vatican
`SK`: Slovakia
`RU`: Russia
`GB`: United Kingdom
`CZ`: Czech Republic
`UA`: Ukraine
`TR`: Turkey
`SI`: Slovenia
`SE`: Sweden
`RS`: Republic of Serbia
`RO`: Romania
`PT`: Portugal
`PL`: Poland
`NO`: Norway
`NL`: Netherlands
`MT`: Malta
`MK`: Macedonia
`ME`: Montenegro
`MD`: Moldova
`MC`: Monaco
`LV`: Latvia
`LU`: Luxembourg
`LT`: Lithuania
`LI`: Liechtenstein
`KZ`: Kazakhstan
`IT`: Italy
`IS`: Iceland
`IE`: Ireland
`HU`: Hungary
`HR`: Croatia
`GR`: Greece
`GI`: Gibraltar
`GG`: Guernsey
`GE`: Georgia
`FR`: France
`FI`: Finland
`ES`: Spain
`EE`: Estonia
`DK`: Denmark
`DE`: Germany
`CY`: Cyprus
`CH`: Switzerland
`BY`: Belarus
`BG`: Bulgaria
`BE`: Belgium
`AZ`: Azerbaijan
`AT`: Austria
`AM`: Armenia
`AL`: Albania
`AD`: Andorra
`TL`: East Timor
`SY`: Syria
`SA`: Saudi Arabia
`PS`: Palestine
`LK`: Sri Lanka
`LK`: Sri Lanka
`KP`: North Korea
`KG`: Kyrgyzstan
`HK`: Hong Kong, China
`BN`: Brunei
`BD`: Bangladesh
`AE`: United Arab Emirates
`YE`: Yemen
`VN`: Vietnam
`UZ`: Uzbekistan
`TW`: Taiwan, China
`TM`: Turkmenistan
`TJ`: Tajikistan
`TH`: Thailand
`SG`: Singapore
`QA`: Qatar
`PK`: Pakistan
`PH`: Philippines
`OM`: Oman
`NP`: Nepal
`MY`: Malaysia
`MV`: Maldives
`MO`: Macao, China
`MN`: Mongolia
`MM`: Myanmar
`LB`: Lebanon
`KW`: Kuwait
`KR`: South Korea
`KH`: Cambodia
`JP`: Japan
`JO`: Jordan
`IR`: Iran
`IQ`: Iraq
`IN`: India
`IL`: Israel
`ID`: Indonesia
`CN`: China
`BT`: Bhutan
`BH`: Bahrain
`AF`: Afghanistan
`LY`: Libya
`CD`: Democratic Republic of the Congo
`RE`: La Réunion
`SZ`: Swaziland
`ZW`: Zimbabwe
`ZM`: Zambia
`YT`: Mayotte
`UG`: Uganda
`TZ`: Tanzania
`TN`: Tunisia
`TG`: Togo
`TD`: Chad
`SO`: Somalia
`SN`: Senegal
`SD`: Sudan
`SC`: Seychelles
`RW`: Rwanda
`NG`: Nigeria
`NE`: Niger
`NA`: Namibia
`MZ`: Mozambique
`MW`: Malawi
`MU`: Mauritius
`MR`: Mauritania
`ML`: Mali
`MG`: Madagascar
`MA`: Morocco
`LS`: Lesotho
`LR`: Liberia
`KM`: Comoros
`KE`: Kenya
`GN`: Guinea
`GM`: Gambia
`GH`: Ghana
`GA`: Gabon
`ET`: Ethiopia
`ER`: Eritrea
`EG`: Egypt
`DZ`: Algeria
`DJ`: Djibouti
`CM`: Cameroon
`CG`: Republic of the Congo
`BW`: Botswana
`BJ`: Benin
`BI`: Burundi
`AO`: Angola

When MatchKey is `ipArea`, valid values include:
`OTHER`: other areas
`AS`: Asia
`EU`: Europe
`AN`: Antarctica
`AF`: Africa
`OC`: Oceania
`NA`: North America
`SA`: South America

When MatchKey is `index`,
valid value is `/;/index.html`.
    */
    @SerializedName("MatchValue")
    @Expose
    private String [] MatchValue;

    /**
    * Whether to distinguish uppercase or lowercase letters. `true`: case sensitive; `false`: case insensitive.
    */
    @SerializedName("CaseSensitive")
    @Expose
    private Boolean CaseSensitive;

    /**
    * This field is required when `MatchKey` is `param` or `cookie`. For `param`, it indicates a key value of the request parameter if MatchKey is `param`, while a key value of the Cookie request header if MatchKey is `cookie`.
    */
    @SerializedName("MatchKeyParam")
    @Expose
    private String MatchKeyParam;

    /**
     * Get Keyword. Valid values:
`protocol`: HTTP protocol
`httpVersion`: HTTP version
`method`: request method
`ip`: requester IP
`ipAsn`: ASN of the requester IP
`ipCountry`: country/region of the requester IP
`ipArea`: region of the requester IP
`xForwardFor`: X-Forward-For request header
`directory`: path
`index`: homepage
`path`: full path of a file
`file`: file extension
`param`: request parameter
`referer`: Referer request header
`cookie`: Cookie request header
`userAgent`: User-Agent request header
`head`: custom request header 
     * @return MatchKey Keyword. Valid values:
`protocol`: HTTP protocol
`httpVersion`: HTTP version
`method`: request method
`ip`: requester IP
`ipAsn`: ASN of the requester IP
`ipCountry`: country/region of the requester IP
`ipArea`: region of the requester IP
`xForwardFor`: X-Forward-For request header
`directory`: path
`index`: homepage
`path`: full path of a file
`file`: file extension
`param`: request parameter
`referer`: Referer request header
`cookie`: Cookie request header
`userAgent`: User-Agent request header
`head`: custom request header
     */
    public String getMatchKey() {
        return this.MatchKey;
    }

    /**
     * Set Keyword. Valid values:
`protocol`: HTTP protocol
`httpVersion`: HTTP version
`method`: request method
`ip`: requester IP
`ipAsn`: ASN of the requester IP
`ipCountry`: country/region of the requester IP
`ipArea`: region of the requester IP
`xForwardFor`: X-Forward-For request header
`directory`: path
`index`: homepage
`path`: full path of a file
`file`: file extension
`param`: request parameter
`referer`: Referer request header
`cookie`: Cookie request header
`userAgent`: User-Agent request header
`head`: custom request header
     * @param MatchKey Keyword. Valid values:
`protocol`: HTTP protocol
`httpVersion`: HTTP version
`method`: request method
`ip`: requester IP
`ipAsn`: ASN of the requester IP
`ipCountry`: country/region of the requester IP
`ipArea`: region of the requester IP
`xForwardFor`: X-Forward-For request header
`directory`: path
`index`: homepage
`path`: full path of a file
`file`: file extension
`param`: request parameter
`referer`: Referer request header
`cookie`: Cookie request header
`userAgent`: User-Agent request header
`head`: custom request header
     */
    public void setMatchKey(String MatchKey) {
        this.MatchKey = MatchKey;
    }

    /**
     * Get Logical operator. Valid values:
`exclude`: the keyword is not included
`include`: the keyword is included
`notequal`: not the same as the keyword
`equal`: the same as the keyword
`matching`: the prefix is matched
`null`: empty or does not exist 
     * @return LogicOperator Logical operator. Valid values:
`exclude`: the keyword is not included
`include`: the keyword is included
`notequal`: not the same as the keyword
`equal`: the same as the keyword
`matching`: the prefix is matched
`null`: empty or does not exist
     */
    public String getLogicOperator() {
        return this.LogicOperator;
    }

    /**
     * Set Logical operator. Valid values:
`exclude`: the keyword is not included
`include`: the keyword is included
`notequal`: not the same as the keyword
`equal`: the same as the keyword
`matching`: the prefix is matched
`null`: empty or does not exist
     * @param LogicOperator Logical operator. Valid values:
`exclude`: the keyword is not included
`include`: the keyword is included
`notequal`: not the same as the keyword
`equal`: the same as the keyword
`matching`: the prefix is matched
`null`: empty or does not exist
     */
    public void setLogicOperator(String LogicOperator) {
        this.LogicOperator = LogicOperator;
    }

    /**
     * Get Match value
When `MatchKey` is `protocol`,
Values: `HTTP` and `HTTPS`.

When `MatchKey` is `httpVersion`,
Values: `HTTP/1.0`, `HTTP/1.1`, `HTTP/1.2`, `HTTP/2`, and `HTTP/3`.

When `MatchKey` is `method`,
Values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.

When `MatchKey` is `ipCountry`, valid values include:
`OTHER`: other countries/regions
`VE`: Venezuela
`UY`: Uruguay
`SR`: Suriname
`PY`: Paraguay
`PE`: Peru
`GY`: Guyana
`EC`: Ecuador
`CO`: Colombia
`CL`: Chile
`BR`: Brazil
`BO`: Bolivia
`AR`: Argentina
`NZ`: New Zealand
`WS`: Samoa
`VU`: Vanuatu
`TV`: Tuvalu
`TO`: Tonga
`TK`: Tokelau
`PW`: Palau
`NU`: Niue
`NR`: Nauru
`KI`: Kiribati
`GU`: Guam
`FM`: Micronesia
`AU`: Australia
`US`: United States
`PR`: Puerto Rico
`DO`: Dominican Republic
`CR`: Costa Rica
`AS`: American Samoa
`AG`: Antigua and Barbuda
`PA`: Panama
`NI`: Nicaragua
`MX`: Mexico
`JM`: Jamaica
`HT`: Haiti
`HN`: Honduras
`GT`: Guatemala
`GP`: Guadeloupe
`GL`: Greenland
`GD`: Grenada
`CU`: Cuba
`CA`: Canada
`BZ`: Belize
`BS`: Bahamas
`BM`: Bermuda
`BB`: Barbados
`AW`: Aruba
`AI`: Anguilla
`VA`: Vatican
`SK`: Slovakia
`RU`: Russia
`GB`: United Kingdom
`CZ`: Czech Republic
`UA`: Ukraine
`TR`: Turkey
`SI`: Slovenia
`SE`: Sweden
`RS`: Republic of Serbia
`RO`: Romania
`PT`: Portugal
`PL`: Poland
`NO`: Norway
`NL`: Netherlands
`MT`: Malta
`MK`: Macedonia
`ME`: Montenegro
`MD`: Moldova
`MC`: Monaco
`LV`: Latvia
`LU`: Luxembourg
`LT`: Lithuania
`LI`: Liechtenstein
`KZ`: Kazakhstan
`IT`: Italy
`IS`: Iceland
`IE`: Ireland
`HU`: Hungary
`HR`: Croatia
`GR`: Greece
`GI`: Gibraltar
`GG`: Guernsey
`GE`: Georgia
`FR`: France
`FI`: Finland
`ES`: Spain
`EE`: Estonia
`DK`: Denmark
`DE`: Germany
`CY`: Cyprus
`CH`: Switzerland
`BY`: Belarus
`BG`: Bulgaria
`BE`: Belgium
`AZ`: Azerbaijan
`AT`: Austria
`AM`: Armenia
`AL`: Albania
`AD`: Andorra
`TL`: East Timor
`SY`: Syria
`SA`: Saudi Arabia
`PS`: Palestine
`LK`: Sri Lanka
`LK`: Sri Lanka
`KP`: North Korea
`KG`: Kyrgyzstan
`HK`: Hong Kong, China
`BN`: Brunei
`BD`: Bangladesh
`AE`: United Arab Emirates
`YE`: Yemen
`VN`: Vietnam
`UZ`: Uzbekistan
`TW`: Taiwan, China
`TM`: Turkmenistan
`TJ`: Tajikistan
`TH`: Thailand
`SG`: Singapore
`QA`: Qatar
`PK`: Pakistan
`PH`: Philippines
`OM`: Oman
`NP`: Nepal
`MY`: Malaysia
`MV`: Maldives
`MO`: Macao, China
`MN`: Mongolia
`MM`: Myanmar
`LB`: Lebanon
`KW`: Kuwait
`KR`: South Korea
`KH`: Cambodia
`JP`: Japan
`JO`: Jordan
`IR`: Iran
`IQ`: Iraq
`IN`: India
`IL`: Israel
`ID`: Indonesia
`CN`: China
`BT`: Bhutan
`BH`: Bahrain
`AF`: Afghanistan
`LY`: Libya
`CD`: Democratic Republic of the Congo
`RE`: La Réunion
`SZ`: Swaziland
`ZW`: Zimbabwe
`ZM`: Zambia
`YT`: Mayotte
`UG`: Uganda
`TZ`: Tanzania
`TN`: Tunisia
`TG`: Togo
`TD`: Chad
`SO`: Somalia
`SN`: Senegal
`SD`: Sudan
`SC`: Seychelles
`RW`: Rwanda
`NG`: Nigeria
`NE`: Niger
`NA`: Namibia
`MZ`: Mozambique
`MW`: Malawi
`MU`: Mauritius
`MR`: Mauritania
`ML`: Mali
`MG`: Madagascar
`MA`: Morocco
`LS`: Lesotho
`LR`: Liberia
`KM`: Comoros
`KE`: Kenya
`GN`: Guinea
`GM`: Gambia
`GH`: Ghana
`GA`: Gabon
`ET`: Ethiopia
`ER`: Eritrea
`EG`: Egypt
`DZ`: Algeria
`DJ`: Djibouti
`CM`: Cameroon
`CG`: Republic of the Congo
`BW`: Botswana
`BJ`: Benin
`BI`: Burundi
`AO`: Angola

When MatchKey is `ipArea`, valid values include:
`OTHER`: other areas
`AS`: Asia
`EU`: Europe
`AN`: Antarctica
`AF`: Africa
`OC`: Oceania
`NA`: North America
`SA`: South America

When MatchKey is `index`,
valid value is `/;/index.html`. 
     * @return MatchValue Match value
When `MatchKey` is `protocol`,
Values: `HTTP` and `HTTPS`.

When `MatchKey` is `httpVersion`,
Values: `HTTP/1.0`, `HTTP/1.1`, `HTTP/1.2`, `HTTP/2`, and `HTTP/3`.

When `MatchKey` is `method`,
Values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.

When `MatchKey` is `ipCountry`, valid values include:
`OTHER`: other countries/regions
`VE`: Venezuela
`UY`: Uruguay
`SR`: Suriname
`PY`: Paraguay
`PE`: Peru
`GY`: Guyana
`EC`: Ecuador
`CO`: Colombia
`CL`: Chile
`BR`: Brazil
`BO`: Bolivia
`AR`: Argentina
`NZ`: New Zealand
`WS`: Samoa
`VU`: Vanuatu
`TV`: Tuvalu
`TO`: Tonga
`TK`: Tokelau
`PW`: Palau
`NU`: Niue
`NR`: Nauru
`KI`: Kiribati
`GU`: Guam
`FM`: Micronesia
`AU`: Australia
`US`: United States
`PR`: Puerto Rico
`DO`: Dominican Republic
`CR`: Costa Rica
`AS`: American Samoa
`AG`: Antigua and Barbuda
`PA`: Panama
`NI`: Nicaragua
`MX`: Mexico
`JM`: Jamaica
`HT`: Haiti
`HN`: Honduras
`GT`: Guatemala
`GP`: Guadeloupe
`GL`: Greenland
`GD`: Grenada
`CU`: Cuba
`CA`: Canada
`BZ`: Belize
`BS`: Bahamas
`BM`: Bermuda
`BB`: Barbados
`AW`: Aruba
`AI`: Anguilla
`VA`: Vatican
`SK`: Slovakia
`RU`: Russia
`GB`: United Kingdom
`CZ`: Czech Republic
`UA`: Ukraine
`TR`: Turkey
`SI`: Slovenia
`SE`: Sweden
`RS`: Republic of Serbia
`RO`: Romania
`PT`: Portugal
`PL`: Poland
`NO`: Norway
`NL`: Netherlands
`MT`: Malta
`MK`: Macedonia
`ME`: Montenegro
`MD`: Moldova
`MC`: Monaco
`LV`: Latvia
`LU`: Luxembourg
`LT`: Lithuania
`LI`: Liechtenstein
`KZ`: Kazakhstan
`IT`: Italy
`IS`: Iceland
`IE`: Ireland
`HU`: Hungary
`HR`: Croatia
`GR`: Greece
`GI`: Gibraltar
`GG`: Guernsey
`GE`: Georgia
`FR`: France
`FI`: Finland
`ES`: Spain
`EE`: Estonia
`DK`: Denmark
`DE`: Germany
`CY`: Cyprus
`CH`: Switzerland
`BY`: Belarus
`BG`: Bulgaria
`BE`: Belgium
`AZ`: Azerbaijan
`AT`: Austria
`AM`: Armenia
`AL`: Albania
`AD`: Andorra
`TL`: East Timor
`SY`: Syria
`SA`: Saudi Arabia
`PS`: Palestine
`LK`: Sri Lanka
`LK`: Sri Lanka
`KP`: North Korea
`KG`: Kyrgyzstan
`HK`: Hong Kong, China
`BN`: Brunei
`BD`: Bangladesh
`AE`: United Arab Emirates
`YE`: Yemen
`VN`: Vietnam
`UZ`: Uzbekistan
`TW`: Taiwan, China
`TM`: Turkmenistan
`TJ`: Tajikistan
`TH`: Thailand
`SG`: Singapore
`QA`: Qatar
`PK`: Pakistan
`PH`: Philippines
`OM`: Oman
`NP`: Nepal
`MY`: Malaysia
`MV`: Maldives
`MO`: Macao, China
`MN`: Mongolia
`MM`: Myanmar
`LB`: Lebanon
`KW`: Kuwait
`KR`: South Korea
`KH`: Cambodia
`JP`: Japan
`JO`: Jordan
`IR`: Iran
`IQ`: Iraq
`IN`: India
`IL`: Israel
`ID`: Indonesia
`CN`: China
`BT`: Bhutan
`BH`: Bahrain
`AF`: Afghanistan
`LY`: Libya
`CD`: Democratic Republic of the Congo
`RE`: La Réunion
`SZ`: Swaziland
`ZW`: Zimbabwe
`ZM`: Zambia
`YT`: Mayotte
`UG`: Uganda
`TZ`: Tanzania
`TN`: Tunisia
`TG`: Togo
`TD`: Chad
`SO`: Somalia
`SN`: Senegal
`SD`: Sudan
`SC`: Seychelles
`RW`: Rwanda
`NG`: Nigeria
`NE`: Niger
`NA`: Namibia
`MZ`: Mozambique
`MW`: Malawi
`MU`: Mauritius
`MR`: Mauritania
`ML`: Mali
`MG`: Madagascar
`MA`: Morocco
`LS`: Lesotho
`LR`: Liberia
`KM`: Comoros
`KE`: Kenya
`GN`: Guinea
`GM`: Gambia
`GH`: Ghana
`GA`: Gabon
`ET`: Ethiopia
`ER`: Eritrea
`EG`: Egypt
`DZ`: Algeria
`DJ`: Djibouti
`CM`: Cameroon
`CG`: Republic of the Congo
`BW`: Botswana
`BJ`: Benin
`BI`: Burundi
`AO`: Angola

When MatchKey is `ipArea`, valid values include:
`OTHER`: other areas
`AS`: Asia
`EU`: Europe
`AN`: Antarctica
`AF`: Africa
`OC`: Oceania
`NA`: North America
`SA`: South America

When MatchKey is `index`,
valid value is `/;/index.html`.
     */
    public String [] getMatchValue() {
        return this.MatchValue;
    }

    /**
     * Set Match value
When `MatchKey` is `protocol`,
Values: `HTTP` and `HTTPS`.

When `MatchKey` is `httpVersion`,
Values: `HTTP/1.0`, `HTTP/1.1`, `HTTP/1.2`, `HTTP/2`, and `HTTP/3`.

When `MatchKey` is `method`,
Values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.

When `MatchKey` is `ipCountry`, valid values include:
`OTHER`: other countries/regions
`VE`: Venezuela
`UY`: Uruguay
`SR`: Suriname
`PY`: Paraguay
`PE`: Peru
`GY`: Guyana
`EC`: Ecuador
`CO`: Colombia
`CL`: Chile
`BR`: Brazil
`BO`: Bolivia
`AR`: Argentina
`NZ`: New Zealand
`WS`: Samoa
`VU`: Vanuatu
`TV`: Tuvalu
`TO`: Tonga
`TK`: Tokelau
`PW`: Palau
`NU`: Niue
`NR`: Nauru
`KI`: Kiribati
`GU`: Guam
`FM`: Micronesia
`AU`: Australia
`US`: United States
`PR`: Puerto Rico
`DO`: Dominican Republic
`CR`: Costa Rica
`AS`: American Samoa
`AG`: Antigua and Barbuda
`PA`: Panama
`NI`: Nicaragua
`MX`: Mexico
`JM`: Jamaica
`HT`: Haiti
`HN`: Honduras
`GT`: Guatemala
`GP`: Guadeloupe
`GL`: Greenland
`GD`: Grenada
`CU`: Cuba
`CA`: Canada
`BZ`: Belize
`BS`: Bahamas
`BM`: Bermuda
`BB`: Barbados
`AW`: Aruba
`AI`: Anguilla
`VA`: Vatican
`SK`: Slovakia
`RU`: Russia
`GB`: United Kingdom
`CZ`: Czech Republic
`UA`: Ukraine
`TR`: Turkey
`SI`: Slovenia
`SE`: Sweden
`RS`: Republic of Serbia
`RO`: Romania
`PT`: Portugal
`PL`: Poland
`NO`: Norway
`NL`: Netherlands
`MT`: Malta
`MK`: Macedonia
`ME`: Montenegro
`MD`: Moldova
`MC`: Monaco
`LV`: Latvia
`LU`: Luxembourg
`LT`: Lithuania
`LI`: Liechtenstein
`KZ`: Kazakhstan
`IT`: Italy
`IS`: Iceland
`IE`: Ireland
`HU`: Hungary
`HR`: Croatia
`GR`: Greece
`GI`: Gibraltar
`GG`: Guernsey
`GE`: Georgia
`FR`: France
`FI`: Finland
`ES`: Spain
`EE`: Estonia
`DK`: Denmark
`DE`: Germany
`CY`: Cyprus
`CH`: Switzerland
`BY`: Belarus
`BG`: Bulgaria
`BE`: Belgium
`AZ`: Azerbaijan
`AT`: Austria
`AM`: Armenia
`AL`: Albania
`AD`: Andorra
`TL`: East Timor
`SY`: Syria
`SA`: Saudi Arabia
`PS`: Palestine
`LK`: Sri Lanka
`LK`: Sri Lanka
`KP`: North Korea
`KG`: Kyrgyzstan
`HK`: Hong Kong, China
`BN`: Brunei
`BD`: Bangladesh
`AE`: United Arab Emirates
`YE`: Yemen
`VN`: Vietnam
`UZ`: Uzbekistan
`TW`: Taiwan, China
`TM`: Turkmenistan
`TJ`: Tajikistan
`TH`: Thailand
`SG`: Singapore
`QA`: Qatar
`PK`: Pakistan
`PH`: Philippines
`OM`: Oman
`NP`: Nepal
`MY`: Malaysia
`MV`: Maldives
`MO`: Macao, China
`MN`: Mongolia
`MM`: Myanmar
`LB`: Lebanon
`KW`: Kuwait
`KR`: South Korea
`KH`: Cambodia
`JP`: Japan
`JO`: Jordan
`IR`: Iran
`IQ`: Iraq
`IN`: India
`IL`: Israel
`ID`: Indonesia
`CN`: China
`BT`: Bhutan
`BH`: Bahrain
`AF`: Afghanistan
`LY`: Libya
`CD`: Democratic Republic of the Congo
`RE`: La Réunion
`SZ`: Swaziland
`ZW`: Zimbabwe
`ZM`: Zambia
`YT`: Mayotte
`UG`: Uganda
`TZ`: Tanzania
`TN`: Tunisia
`TG`: Togo
`TD`: Chad
`SO`: Somalia
`SN`: Senegal
`SD`: Sudan
`SC`: Seychelles
`RW`: Rwanda
`NG`: Nigeria
`NE`: Niger
`NA`: Namibia
`MZ`: Mozambique
`MW`: Malawi
`MU`: Mauritius
`MR`: Mauritania
`ML`: Mali
`MG`: Madagascar
`MA`: Morocco
`LS`: Lesotho
`LR`: Liberia
`KM`: Comoros
`KE`: Kenya
`GN`: Guinea
`GM`: Gambia
`GH`: Ghana
`GA`: Gabon
`ET`: Ethiopia
`ER`: Eritrea
`EG`: Egypt
`DZ`: Algeria
`DJ`: Djibouti
`CM`: Cameroon
`CG`: Republic of the Congo
`BW`: Botswana
`BJ`: Benin
`BI`: Burundi
`AO`: Angola

When MatchKey is `ipArea`, valid values include:
`OTHER`: other areas
`AS`: Asia
`EU`: Europe
`AN`: Antarctica
`AF`: Africa
`OC`: Oceania
`NA`: North America
`SA`: South America

When MatchKey is `index`,
valid value is `/;/index.html`.
     * @param MatchValue Match value
When `MatchKey` is `protocol`,
Values: `HTTP` and `HTTPS`.

When `MatchKey` is `httpVersion`,
Values: `HTTP/1.0`, `HTTP/1.1`, `HTTP/1.2`, `HTTP/2`, and `HTTP/3`.

When `MatchKey` is `method`,
Values: `HEAD`, `GET`, `POST`, `PUT`, `OPTIONS`, `TRACE`, `DELETE`, `PATCH` and `CONNECT`.

When `MatchKey` is `ipCountry`, valid values include:
`OTHER`: other countries/regions
`VE`: Venezuela
`UY`: Uruguay
`SR`: Suriname
`PY`: Paraguay
`PE`: Peru
`GY`: Guyana
`EC`: Ecuador
`CO`: Colombia
`CL`: Chile
`BR`: Brazil
`BO`: Bolivia
`AR`: Argentina
`NZ`: New Zealand
`WS`: Samoa
`VU`: Vanuatu
`TV`: Tuvalu
`TO`: Tonga
`TK`: Tokelau
`PW`: Palau
`NU`: Niue
`NR`: Nauru
`KI`: Kiribati
`GU`: Guam
`FM`: Micronesia
`AU`: Australia
`US`: United States
`PR`: Puerto Rico
`DO`: Dominican Republic
`CR`: Costa Rica
`AS`: American Samoa
`AG`: Antigua and Barbuda
`PA`: Panama
`NI`: Nicaragua
`MX`: Mexico
`JM`: Jamaica
`HT`: Haiti
`HN`: Honduras
`GT`: Guatemala
`GP`: Guadeloupe
`GL`: Greenland
`GD`: Grenada
`CU`: Cuba
`CA`: Canada
`BZ`: Belize
`BS`: Bahamas
`BM`: Bermuda
`BB`: Barbados
`AW`: Aruba
`AI`: Anguilla
`VA`: Vatican
`SK`: Slovakia
`RU`: Russia
`GB`: United Kingdom
`CZ`: Czech Republic
`UA`: Ukraine
`TR`: Turkey
`SI`: Slovenia
`SE`: Sweden
`RS`: Republic of Serbia
`RO`: Romania
`PT`: Portugal
`PL`: Poland
`NO`: Norway
`NL`: Netherlands
`MT`: Malta
`MK`: Macedonia
`ME`: Montenegro
`MD`: Moldova
`MC`: Monaco
`LV`: Latvia
`LU`: Luxembourg
`LT`: Lithuania
`LI`: Liechtenstein
`KZ`: Kazakhstan
`IT`: Italy
`IS`: Iceland
`IE`: Ireland
`HU`: Hungary
`HR`: Croatia
`GR`: Greece
`GI`: Gibraltar
`GG`: Guernsey
`GE`: Georgia
`FR`: France
`FI`: Finland
`ES`: Spain
`EE`: Estonia
`DK`: Denmark
`DE`: Germany
`CY`: Cyprus
`CH`: Switzerland
`BY`: Belarus
`BG`: Bulgaria
`BE`: Belgium
`AZ`: Azerbaijan
`AT`: Austria
`AM`: Armenia
`AL`: Albania
`AD`: Andorra
`TL`: East Timor
`SY`: Syria
`SA`: Saudi Arabia
`PS`: Palestine
`LK`: Sri Lanka
`LK`: Sri Lanka
`KP`: North Korea
`KG`: Kyrgyzstan
`HK`: Hong Kong, China
`BN`: Brunei
`BD`: Bangladesh
`AE`: United Arab Emirates
`YE`: Yemen
`VN`: Vietnam
`UZ`: Uzbekistan
`TW`: Taiwan, China
`TM`: Turkmenistan
`TJ`: Tajikistan
`TH`: Thailand
`SG`: Singapore
`QA`: Qatar
`PK`: Pakistan
`PH`: Philippines
`OM`: Oman
`NP`: Nepal
`MY`: Malaysia
`MV`: Maldives
`MO`: Macao, China
`MN`: Mongolia
`MM`: Myanmar
`LB`: Lebanon
`KW`: Kuwait
`KR`: South Korea
`KH`: Cambodia
`JP`: Japan
`JO`: Jordan
`IR`: Iran
`IQ`: Iraq
`IN`: India
`IL`: Israel
`ID`: Indonesia
`CN`: China
`BT`: Bhutan
`BH`: Bahrain
`AF`: Afghanistan
`LY`: Libya
`CD`: Democratic Republic of the Congo
`RE`: La Réunion
`SZ`: Swaziland
`ZW`: Zimbabwe
`ZM`: Zambia
`YT`: Mayotte
`UG`: Uganda
`TZ`: Tanzania
`TN`: Tunisia
`TG`: Togo
`TD`: Chad
`SO`: Somalia
`SN`: Senegal
`SD`: Sudan
`SC`: Seychelles
`RW`: Rwanda
`NG`: Nigeria
`NE`: Niger
`NA`: Namibia
`MZ`: Mozambique
`MW`: Malawi
`MU`: Mauritius
`MR`: Mauritania
`ML`: Mali
`MG`: Madagascar
`MA`: Morocco
`LS`: Lesotho
`LR`: Liberia
`KM`: Comoros
`KE`: Kenya
`GN`: Guinea
`GM`: Gambia
`GH`: Ghana
`GA`: Gabon
`ET`: Ethiopia
`ER`: Eritrea
`EG`: Egypt
`DZ`: Algeria
`DJ`: Djibouti
`CM`: Cameroon
`CG`: Republic of the Congo
`BW`: Botswana
`BJ`: Benin
`BI`: Burundi
`AO`: Angola

When MatchKey is `ipArea`, valid values include:
`OTHER`: other areas
`AS`: Asia
`EU`: Europe
`AN`: Antarctica
`AF`: Africa
`OC`: Oceania
`NA`: North America
`SA`: South America

When MatchKey is `index`,
valid value is `/;/index.html`.
     */
    public void setMatchValue(String [] MatchValue) {
        this.MatchValue = MatchValue;
    }

    /**
     * Get Whether to distinguish uppercase or lowercase letters. `true`: case sensitive; `false`: case insensitive. 
     * @return CaseSensitive Whether to distinguish uppercase or lowercase letters. `true`: case sensitive; `false`: case insensitive.
     */
    public Boolean getCaseSensitive() {
        return this.CaseSensitive;
    }

    /**
     * Set Whether to distinguish uppercase or lowercase letters. `true`: case sensitive; `false`: case insensitive.
     * @param CaseSensitive Whether to distinguish uppercase or lowercase letters. `true`: case sensitive; `false`: case insensitive.
     */
    public void setCaseSensitive(Boolean CaseSensitive) {
        this.CaseSensitive = CaseSensitive;
    }

    /**
     * Get This field is required when `MatchKey` is `param` or `cookie`. For `param`, it indicates a key value of the request parameter if MatchKey is `param`, while a key value of the Cookie request header if MatchKey is `cookie`. 
     * @return MatchKeyParam This field is required when `MatchKey` is `param` or `cookie`. For `param`, it indicates a key value of the request parameter if MatchKey is `param`, while a key value of the Cookie request header if MatchKey is `cookie`.
     */
    public String getMatchKeyParam() {
        return this.MatchKeyParam;
    }

    /**
     * Set This field is required when `MatchKey` is `param` or `cookie`. For `param`, it indicates a key value of the request parameter if MatchKey is `param`, while a key value of the Cookie request header if MatchKey is `cookie`.
     * @param MatchKeyParam This field is required when `MatchKey` is `param` or `cookie`. For `param`, it indicates a key value of the request parameter if MatchKey is `param`, while a key value of the Cookie request header if MatchKey is `cookie`.
     */
    public void setMatchKeyParam(String MatchKeyParam) {
        this.MatchKeyParam = MatchKeyParam;
    }

    public AdvancedScdnAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedScdnAclRule(AdvancedScdnAclRule source) {
        if (source.MatchKey != null) {
            this.MatchKey = new String(source.MatchKey);
        }
        if (source.LogicOperator != null) {
            this.LogicOperator = new String(source.LogicOperator);
        }
        if (source.MatchValue != null) {
            this.MatchValue = new String[source.MatchValue.length];
            for (int i = 0; i < source.MatchValue.length; i++) {
                this.MatchValue[i] = new String(source.MatchValue[i]);
            }
        }
        if (source.CaseSensitive != null) {
            this.CaseSensitive = new Boolean(source.CaseSensitive);
        }
        if (source.MatchKeyParam != null) {
            this.MatchKeyParam = new String(source.MatchKeyParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchKey", this.MatchKey);
        this.setParamSimple(map, prefix + "LogicOperator", this.LogicOperator);
        this.setParamArraySimple(map, prefix + "MatchValue.", this.MatchValue);
        this.setParamSimple(map, prefix + "CaseSensitive", this.CaseSensitive);
        this.setParamSimple(map, prefix + "MatchKeyParam", this.MatchKeyParam);

    }
}

