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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopL7AnalysisDataRequest extends AbstractModel {

    /**
    * The start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Metrics to query. Valid values: 
<li>`l7Flow_outFlux_country`: Query traffic by country/region;</li>
<li>`l7Flow_outFlux_statusCode`: Query traffic by status code;</li>
<li>`l7Flow_outFlux_domain`: Query traffic by domain;</li>
<li>`l7Flow_outFlux_url`: Query traffic by URL;</li>
<li>`l7Flow_outFlux_resourceType`: Query traffic by resource type;</li>
<li>`l7Flow_outFlux_sip`: Query traffic by source IP;</li>
<li>`l7Flow_outFlux_referers`: Query traffic by refer information;</li>
<li>`l7Flow_outFlux_ua_device`: Query traffic by device;</li>
<li>`l7Flow_outFlux_ua_browser`: Query traffic by browser;</li>
<li>`l7Flow_outFlux_us_os`: Query traffic by OS;</li>
<li>`l7Flow_request_country`: Query requests by country/region;</li>
<li>`l7Flow_request_statusCode`: Query requests by status code;</li>
<li>`l7Flow_request_domain`: Query requests by domain;</li>
<li>`l7Flow_request_url`: Query requests by URL;</li>
<li>`l7Flow_request_resourceType`: Query requests by resource type;</li>
<li>`l7Flow_request_sip`: Query requests by source IP;</li>
<li>`l7Flow_request_referer`: Query requests by refer information;</li>
<li>`l7Flow_request_ua_device`: Query requests by device;</li>
<li>`l7Flow_request_ua_browser`: Query requests by browser;</li>
<li>`l7Flow_request_us_os`: Query requests by OS.</li>

    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * ZoneId set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Queries the top N data entries. Maximum value: 1000. Top 10 data entries will be queried if this field is not specified.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters
<li>`country`<br>Filter by the <strong> Country/Region</strong>. The country/region follows <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166</a> specification. </li>
<li>`province`<br>Filter by the <strong>specified province name</strong>. It’s only available when `Area` is `mainland`.</li>
<li>`isp`<br>:   Filter by the specified ISP. It’s only available when `Area` is `mainland`.<br>Values: <br>`2`: CTCC; <br>`26`: CUCC; <br>`1046`: CMCC; <br>`3947`: CTT; <br>`38`: CERNET; <br>`43`: GWBN; <br>`0`: Others.</li>
<li>`domain`<br>: Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`url`:<br>Filter by the <strong>specified URL Path (such as `/content` or `content/test.jpg`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`referer`:<br>Filter by the specified <strong>Referer header</strong>, such as `example.com`.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`resourceType`:<br>Filter by the specified <strong>resource file type</strong>, such as `jpg`, `css`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`protocol`:<br> Filter by the specified <strong>HTTP protocol</strong> version <br>Values: <br>`HTTP/1.0`: HTTP 1.0;<br>`HTTP/1.1`: HTTP 1.1;<br>`HTTP/2.0`: HTTP 2.0;<br>`HTTP/3.0`: HTTP 3.0;<br>`WebSocket`: WebSocket.</li>
<li>`socket`:<br>Filter by the specified <strong>HTTP protocol type</strong> <br>Values:<br>`HTTP`: HTTP protocol; <br>`HTTPS`: HTTPS protocol;<br>`QUIC`: QUIC protocol.
<li>`statusCode`:<br> Filter by the <strong> Status Code</strong><br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>1XX: Status code of type 1xx <br>100: 100 status code <br>101: 101 status code <br>102: 102 status code <br>2XX: Status code of type 2xx <br>200: 200 status code <br>201: 201 status code <br>202: 202 status code <br>203: 203 status code <br>204: 204 status code <br>205: 205 status code <br>206: 206 status code <br>207: 207 status code <br>3XX: Status code of type 3xx <br>300: 300 status code <br>301: 301 status code <br>302: 302 status code <br>303: 303 status code <br>304: 304 status code <br>305: 305 status code <br>307: 307 status code <br>4XX: Status code of type 4xx <br>400: 400 status code <br>401: 401 status code <br>402: 402 status code <br>403: 403 status code <br>404: 404 status code <br>405: 405 status code <br>406: 406 status code <br>407: 407 status code <br>408: 408 status code <br>409: 409 status code <br>410: 410 status code <br>411: 411 status code <br>412: 412 status code <br>412: 413 Status Code <br>414: 414 status code <br>415: 415 status code <br>416: 416 status code <br>417: 417 status code <br>422: 422 status code <br>423: 423 status code <br>424: 424 status code <br>426: 426 status code <br>451: 451 status code <br>5XX: Status code of type 5xx <br>500: 500 status code <br>501: 501 status code <br>502:502 status code <br>503: 503 status code <br>504: 504 status code <br>505: 505 status code <br>506: 506 status code <br>507: 507 status code <br>510: 510 status code <br>514: 514 status code <br>544: 544 Status Code. </li>
<li>`browserType`:<br>Filter by the specified <strong>browser type</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li><br>Values: <br>`Firefox`: Firefox browser; <br>`Chrome`: Chrome browser; <br>`Safari`: Safari browser; <br>`MicrosoftEdge`: Microsoft Edge browser; <br>`IE`: IE browser; <br>`Opera`: Opera browser; <br>`QQBrowser`: QQ browser; <br>`LBBrowser`: LB browser; <br>`MaxthonBrowser`: Maxthon browser; <br>`SouGouBrowser`: Sogou browser; <br>`BIDUBrowser`: Baidu browser; <br>`TaoBrowser`: Tao browser; <br>`UBrowser`: UC browser; <br>`Other`: Other browsers; <br>`Empty`: The browser type is not specified; <br>`Bot`: Web crawler.</li>
<li>`deviceType`:<br>Filter by the <strong>device type</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>`TV`: TV; <br>`Tablet`: Tablet;<br>`Mobile`: Mobile phone; <br>`Desktop`: Desktop device;<br>`Other`: Other device;<br>`Empty`: Device type not specified.</li>
<li>`operatingSystemType`:<br>Filter by the <strong>operating system</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`Linux`: Linux OS; <br>`MacOS`: Mac OS;<br>`Android`: Android OS;<br>`IOS`: iOS OS;<br>`Windows`: Windows OS;<br>`NetBSD`: NetBSD OS;<br>`ChromiumOS`: Chromium OS; <br>`Bot`: Web crawler:<br>`Other`: Other OS;   <br>`Empty`: The OS is not specified.</li>
<li>`tlsVersion`:<br>Filter by the <strong>TLS version</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`TLS1.0`: TLS 1.0;<br>`TLS1.1`: TLS 1.1; <br>`TLS1.2`: TLS 1.2;<br>`TLS1.3`: TLS 1.3.</li>
<li>`ipVersion`<br>Filter by the <strong>specified IP version. <br>Values: <br>`4`: IPv4; <br>`6`: IPv6.
<li>`tagKey`<br>Filter by the <strong>Tag Key</strong>. </li>
<li>`tagValue`<br>Filter by the <strong>Tag Value</strong>. </li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Geolocation scope. Values:
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get The start time. 
     * @return StartTime The start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time.
     * @param StartTime The start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. 
     * @return EndTime The end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time.
     * @param EndTime The end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Metrics to query. Valid values: 
<li>`l7Flow_outFlux_country`: Query traffic by country/region;</li>
<li>`l7Flow_outFlux_statusCode`: Query traffic by status code;</li>
<li>`l7Flow_outFlux_domain`: Query traffic by domain;</li>
<li>`l7Flow_outFlux_url`: Query traffic by URL;</li>
<li>`l7Flow_outFlux_resourceType`: Query traffic by resource type;</li>
<li>`l7Flow_outFlux_sip`: Query traffic by source IP;</li>
<li>`l7Flow_outFlux_referers`: Query traffic by refer information;</li>
<li>`l7Flow_outFlux_ua_device`: Query traffic by device;</li>
<li>`l7Flow_outFlux_ua_browser`: Query traffic by browser;</li>
<li>`l7Flow_outFlux_us_os`: Query traffic by OS;</li>
<li>`l7Flow_request_country`: Query requests by country/region;</li>
<li>`l7Flow_request_statusCode`: Query requests by status code;</li>
<li>`l7Flow_request_domain`: Query requests by domain;</li>
<li>`l7Flow_request_url`: Query requests by URL;</li>
<li>`l7Flow_request_resourceType`: Query requests by resource type;</li>
<li>`l7Flow_request_sip`: Query requests by source IP;</li>
<li>`l7Flow_request_referer`: Query requests by refer information;</li>
<li>`l7Flow_request_ua_device`: Query requests by device;</li>
<li>`l7Flow_request_ua_browser`: Query requests by browser;</li>
<li>`l7Flow_request_us_os`: Query requests by OS.</li>
 
     * @return MetricName Metrics to query. Valid values: 
<li>`l7Flow_outFlux_country`: Query traffic by country/region;</li>
<li>`l7Flow_outFlux_statusCode`: Query traffic by status code;</li>
<li>`l7Flow_outFlux_domain`: Query traffic by domain;</li>
<li>`l7Flow_outFlux_url`: Query traffic by URL;</li>
<li>`l7Flow_outFlux_resourceType`: Query traffic by resource type;</li>
<li>`l7Flow_outFlux_sip`: Query traffic by source IP;</li>
<li>`l7Flow_outFlux_referers`: Query traffic by refer information;</li>
<li>`l7Flow_outFlux_ua_device`: Query traffic by device;</li>
<li>`l7Flow_outFlux_ua_browser`: Query traffic by browser;</li>
<li>`l7Flow_outFlux_us_os`: Query traffic by OS;</li>
<li>`l7Flow_request_country`: Query requests by country/region;</li>
<li>`l7Flow_request_statusCode`: Query requests by status code;</li>
<li>`l7Flow_request_domain`: Query requests by domain;</li>
<li>`l7Flow_request_url`: Query requests by URL;</li>
<li>`l7Flow_request_resourceType`: Query requests by resource type;</li>
<li>`l7Flow_request_sip`: Query requests by source IP;</li>
<li>`l7Flow_request_referer`: Query requests by refer information;</li>
<li>`l7Flow_request_ua_device`: Query requests by device;</li>
<li>`l7Flow_request_ua_browser`: Query requests by browser;</li>
<li>`l7Flow_request_us_os`: Query requests by OS.</li>

     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metrics to query. Valid values: 
<li>`l7Flow_outFlux_country`: Query traffic by country/region;</li>
<li>`l7Flow_outFlux_statusCode`: Query traffic by status code;</li>
<li>`l7Flow_outFlux_domain`: Query traffic by domain;</li>
<li>`l7Flow_outFlux_url`: Query traffic by URL;</li>
<li>`l7Flow_outFlux_resourceType`: Query traffic by resource type;</li>
<li>`l7Flow_outFlux_sip`: Query traffic by source IP;</li>
<li>`l7Flow_outFlux_referers`: Query traffic by refer information;</li>
<li>`l7Flow_outFlux_ua_device`: Query traffic by device;</li>
<li>`l7Flow_outFlux_ua_browser`: Query traffic by browser;</li>
<li>`l7Flow_outFlux_us_os`: Query traffic by OS;</li>
<li>`l7Flow_request_country`: Query requests by country/region;</li>
<li>`l7Flow_request_statusCode`: Query requests by status code;</li>
<li>`l7Flow_request_domain`: Query requests by domain;</li>
<li>`l7Flow_request_url`: Query requests by URL;</li>
<li>`l7Flow_request_resourceType`: Query requests by resource type;</li>
<li>`l7Flow_request_sip`: Query requests by source IP;</li>
<li>`l7Flow_request_referer`: Query requests by refer information;</li>
<li>`l7Flow_request_ua_device`: Query requests by device;</li>
<li>`l7Flow_request_ua_browser`: Query requests by browser;</li>
<li>`l7Flow_request_us_os`: Query requests by OS.</li>

     * @param MetricName Metrics to query. Valid values: 
<li>`l7Flow_outFlux_country`: Query traffic by country/region;</li>
<li>`l7Flow_outFlux_statusCode`: Query traffic by status code;</li>
<li>`l7Flow_outFlux_domain`: Query traffic by domain;</li>
<li>`l7Flow_outFlux_url`: Query traffic by URL;</li>
<li>`l7Flow_outFlux_resourceType`: Query traffic by resource type;</li>
<li>`l7Flow_outFlux_sip`: Query traffic by source IP;</li>
<li>`l7Flow_outFlux_referers`: Query traffic by refer information;</li>
<li>`l7Flow_outFlux_ua_device`: Query traffic by device;</li>
<li>`l7Flow_outFlux_ua_browser`: Query traffic by browser;</li>
<li>`l7Flow_outFlux_us_os`: Query traffic by OS;</li>
<li>`l7Flow_request_country`: Query requests by country/region;</li>
<li>`l7Flow_request_statusCode`: Query requests by status code;</li>
<li>`l7Flow_request_domain`: Query requests by domain;</li>
<li>`l7Flow_request_url`: Query requests by URL;</li>
<li>`l7Flow_request_resourceType`: Query requests by resource type;</li>
<li>`l7Flow_request_sip`: Query requests by source IP;</li>
<li>`l7Flow_request_referer`: Query requests by refer information;</li>
<li>`l7Flow_request_ua_device`: Query requests by device;</li>
<li>`l7Flow_request_ua_browser`: Query requests by browser;</li>
<li>`l7Flow_request_us_os`: Query requests by OS.</li>

     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get ZoneId set. This parameter is required. 
     * @return ZoneIds ZoneId set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set ZoneId set. This parameter is required.
     * @param ZoneIds ZoneId set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Queries the top N data entries. Maximum value: 1000. Top 10 data entries will be queried if this field is not specified. 
     * @return Limit Queries the top N data entries. Maximum value: 1000. Top 10 data entries will be queried if this field is not specified.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Queries the top N data entries. Maximum value: 1000. Top 10 data entries will be queried if this field is not specified.
     * @param Limit Queries the top N data entries. Maximum value: 1000. Top 10 data entries will be queried if this field is not specified.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters
<li>`country`<br>Filter by the <strong> Country/Region</strong>. The country/region follows <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166</a> specification. </li>
<li>`province`<br>Filter by the <strong>specified province name</strong>. It’s only available when `Area` is `mainland`.</li>
<li>`isp`<br>:   Filter by the specified ISP. It’s only available when `Area` is `mainland`.<br>Values: <br>`2`: CTCC; <br>`26`: CUCC; <br>`1046`: CMCC; <br>`3947`: CTT; <br>`38`: CERNET; <br>`43`: GWBN; <br>`0`: Others.</li>
<li>`domain`<br>: Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`url`:<br>Filter by the <strong>specified URL Path (such as `/content` or `content/test.jpg`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`referer`:<br>Filter by the specified <strong>Referer header</strong>, such as `example.com`.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`resourceType`:<br>Filter by the specified <strong>resource file type</strong>, such as `jpg`, `css`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`protocol`:<br> Filter by the specified <strong>HTTP protocol</strong> version <br>Values: <br>`HTTP/1.0`: HTTP 1.0;<br>`HTTP/1.1`: HTTP 1.1;<br>`HTTP/2.0`: HTTP 2.0;<br>`HTTP/3.0`: HTTP 3.0;<br>`WebSocket`: WebSocket.</li>
<li>`socket`:<br>Filter by the specified <strong>HTTP protocol type</strong> <br>Values:<br>`HTTP`: HTTP protocol; <br>`HTTPS`: HTTPS protocol;<br>`QUIC`: QUIC protocol.
<li>`statusCode`:<br> Filter by the <strong> Status Code</strong><br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>1XX: Status code of type 1xx <br>100: 100 status code <br>101: 101 status code <br>102: 102 status code <br>2XX: Status code of type 2xx <br>200: 200 status code <br>201: 201 status code <br>202: 202 status code <br>203: 203 status code <br>204: 204 status code <br>205: 205 status code <br>206: 206 status code <br>207: 207 status code <br>3XX: Status code of type 3xx <br>300: 300 status code <br>301: 301 status code <br>302: 302 status code <br>303: 303 status code <br>304: 304 status code <br>305: 305 status code <br>307: 307 status code <br>4XX: Status code of type 4xx <br>400: 400 status code <br>401: 401 status code <br>402: 402 status code <br>403: 403 status code <br>404: 404 status code <br>405: 405 status code <br>406: 406 status code <br>407: 407 status code <br>408: 408 status code <br>409: 409 status code <br>410: 410 status code <br>411: 411 status code <br>412: 412 status code <br>412: 413 Status Code <br>414: 414 status code <br>415: 415 status code <br>416: 416 status code <br>417: 417 status code <br>422: 422 status code <br>423: 423 status code <br>424: 424 status code <br>426: 426 status code <br>451: 451 status code <br>5XX: Status code of type 5xx <br>500: 500 status code <br>501: 501 status code <br>502:502 status code <br>503: 503 status code <br>504: 504 status code <br>505: 505 status code <br>506: 506 status code <br>507: 507 status code <br>510: 510 status code <br>514: 514 status code <br>544: 544 Status Code. </li>
<li>`browserType`:<br>Filter by the specified <strong>browser type</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li><br>Values: <br>`Firefox`: Firefox browser; <br>`Chrome`: Chrome browser; <br>`Safari`: Safari browser; <br>`MicrosoftEdge`: Microsoft Edge browser; <br>`IE`: IE browser; <br>`Opera`: Opera browser; <br>`QQBrowser`: QQ browser; <br>`LBBrowser`: LB browser; <br>`MaxthonBrowser`: Maxthon browser; <br>`SouGouBrowser`: Sogou browser; <br>`BIDUBrowser`: Baidu browser; <br>`TaoBrowser`: Tao browser; <br>`UBrowser`: UC browser; <br>`Other`: Other browsers; <br>`Empty`: The browser type is not specified; <br>`Bot`: Web crawler.</li>
<li>`deviceType`:<br>Filter by the <strong>device type</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>`TV`: TV; <br>`Tablet`: Tablet;<br>`Mobile`: Mobile phone; <br>`Desktop`: Desktop device;<br>`Other`: Other device;<br>`Empty`: Device type not specified.</li>
<li>`operatingSystemType`:<br>Filter by the <strong>operating system</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`Linux`: Linux OS; <br>`MacOS`: Mac OS;<br>`Android`: Android OS;<br>`IOS`: iOS OS;<br>`Windows`: Windows OS;<br>`NetBSD`: NetBSD OS;<br>`ChromiumOS`: Chromium OS; <br>`Bot`: Web crawler:<br>`Other`: Other OS;   <br>`Empty`: The OS is not specified.</li>
<li>`tlsVersion`:<br>Filter by the <strong>TLS version</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`TLS1.0`: TLS 1.0;<br>`TLS1.1`: TLS 1.1; <br>`TLS1.2`: TLS 1.2;<br>`TLS1.3`: TLS 1.3.</li>
<li>`ipVersion`<br>Filter by the <strong>specified IP version. <br>Values: <br>`4`: IPv4; <br>`6`: IPv6.
<li>`tagKey`<br>Filter by the <strong>Tag Key</strong>. </li>
<li>`tagValue`<br>Filter by the <strong>Tag Value</strong>. </li> 
     * @return Filters Filters
<li>`country`<br>Filter by the <strong> Country/Region</strong>. The country/region follows <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166</a> specification. </li>
<li>`province`<br>Filter by the <strong>specified province name</strong>. It’s only available when `Area` is `mainland`.</li>
<li>`isp`<br>:   Filter by the specified ISP. It’s only available when `Area` is `mainland`.<br>Values: <br>`2`: CTCC; <br>`26`: CUCC; <br>`1046`: CMCC; <br>`3947`: CTT; <br>`38`: CERNET; <br>`43`: GWBN; <br>`0`: Others.</li>
<li>`domain`<br>: Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`url`:<br>Filter by the <strong>specified URL Path (such as `/content` or `content/test.jpg`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`referer`:<br>Filter by the specified <strong>Referer header</strong>, such as `example.com`.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`resourceType`:<br>Filter by the specified <strong>resource file type</strong>, such as `jpg`, `css`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`protocol`:<br> Filter by the specified <strong>HTTP protocol</strong> version <br>Values: <br>`HTTP/1.0`: HTTP 1.0;<br>`HTTP/1.1`: HTTP 1.1;<br>`HTTP/2.0`: HTTP 2.0;<br>`HTTP/3.0`: HTTP 3.0;<br>`WebSocket`: WebSocket.</li>
<li>`socket`:<br>Filter by the specified <strong>HTTP protocol type</strong> <br>Values:<br>`HTTP`: HTTP protocol; <br>`HTTPS`: HTTPS protocol;<br>`QUIC`: QUIC protocol.
<li>`statusCode`:<br> Filter by the <strong> Status Code</strong><br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>1XX: Status code of type 1xx <br>100: 100 status code <br>101: 101 status code <br>102: 102 status code <br>2XX: Status code of type 2xx <br>200: 200 status code <br>201: 201 status code <br>202: 202 status code <br>203: 203 status code <br>204: 204 status code <br>205: 205 status code <br>206: 206 status code <br>207: 207 status code <br>3XX: Status code of type 3xx <br>300: 300 status code <br>301: 301 status code <br>302: 302 status code <br>303: 303 status code <br>304: 304 status code <br>305: 305 status code <br>307: 307 status code <br>4XX: Status code of type 4xx <br>400: 400 status code <br>401: 401 status code <br>402: 402 status code <br>403: 403 status code <br>404: 404 status code <br>405: 405 status code <br>406: 406 status code <br>407: 407 status code <br>408: 408 status code <br>409: 409 status code <br>410: 410 status code <br>411: 411 status code <br>412: 412 status code <br>412: 413 Status Code <br>414: 414 status code <br>415: 415 status code <br>416: 416 status code <br>417: 417 status code <br>422: 422 status code <br>423: 423 status code <br>424: 424 status code <br>426: 426 status code <br>451: 451 status code <br>5XX: Status code of type 5xx <br>500: 500 status code <br>501: 501 status code <br>502:502 status code <br>503: 503 status code <br>504: 504 status code <br>505: 505 status code <br>506: 506 status code <br>507: 507 status code <br>510: 510 status code <br>514: 514 status code <br>544: 544 Status Code. </li>
<li>`browserType`:<br>Filter by the specified <strong>browser type</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li><br>Values: <br>`Firefox`: Firefox browser; <br>`Chrome`: Chrome browser; <br>`Safari`: Safari browser; <br>`MicrosoftEdge`: Microsoft Edge browser; <br>`IE`: IE browser; <br>`Opera`: Opera browser; <br>`QQBrowser`: QQ browser; <br>`LBBrowser`: LB browser; <br>`MaxthonBrowser`: Maxthon browser; <br>`SouGouBrowser`: Sogou browser; <br>`BIDUBrowser`: Baidu browser; <br>`TaoBrowser`: Tao browser; <br>`UBrowser`: UC browser; <br>`Other`: Other browsers; <br>`Empty`: The browser type is not specified; <br>`Bot`: Web crawler.</li>
<li>`deviceType`:<br>Filter by the <strong>device type</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>`TV`: TV; <br>`Tablet`: Tablet;<br>`Mobile`: Mobile phone; <br>`Desktop`: Desktop device;<br>`Other`: Other device;<br>`Empty`: Device type not specified.</li>
<li>`operatingSystemType`:<br>Filter by the <strong>operating system</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`Linux`: Linux OS; <br>`MacOS`: Mac OS;<br>`Android`: Android OS;<br>`IOS`: iOS OS;<br>`Windows`: Windows OS;<br>`NetBSD`: NetBSD OS;<br>`ChromiumOS`: Chromium OS; <br>`Bot`: Web crawler:<br>`Other`: Other OS;   <br>`Empty`: The OS is not specified.</li>
<li>`tlsVersion`:<br>Filter by the <strong>TLS version</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`TLS1.0`: TLS 1.0;<br>`TLS1.1`: TLS 1.1; <br>`TLS1.2`: TLS 1.2;<br>`TLS1.3`: TLS 1.3.</li>
<li>`ipVersion`<br>Filter by the <strong>specified IP version. <br>Values: <br>`4`: IPv4; <br>`6`: IPv6.
<li>`tagKey`<br>Filter by the <strong>Tag Key</strong>. </li>
<li>`tagValue`<br>Filter by the <strong>Tag Value</strong>. </li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
<li>`country`<br>Filter by the <strong> Country/Region</strong>. The country/region follows <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166</a> specification. </li>
<li>`province`<br>Filter by the <strong>specified province name</strong>. It’s only available when `Area` is `mainland`.</li>
<li>`isp`<br>:   Filter by the specified ISP. It’s only available when `Area` is `mainland`.<br>Values: <br>`2`: CTCC; <br>`26`: CUCC; <br>`1046`: CMCC; <br>`3947`: CTT; <br>`38`: CERNET; <br>`43`: GWBN; <br>`0`: Others.</li>
<li>`domain`<br>: Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`url`:<br>Filter by the <strong>specified URL Path (such as `/content` or `content/test.jpg`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`referer`:<br>Filter by the specified <strong>Referer header</strong>, such as `example.com`.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`resourceType`:<br>Filter by the specified <strong>resource file type</strong>, such as `jpg`, `css`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`protocol`:<br> Filter by the specified <strong>HTTP protocol</strong> version <br>Values: <br>`HTTP/1.0`: HTTP 1.0;<br>`HTTP/1.1`: HTTP 1.1;<br>`HTTP/2.0`: HTTP 2.0;<br>`HTTP/3.0`: HTTP 3.0;<br>`WebSocket`: WebSocket.</li>
<li>`socket`:<br>Filter by the specified <strong>HTTP protocol type</strong> <br>Values:<br>`HTTP`: HTTP protocol; <br>`HTTPS`: HTTPS protocol;<br>`QUIC`: QUIC protocol.
<li>`statusCode`:<br> Filter by the <strong> Status Code</strong><br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>1XX: Status code of type 1xx <br>100: 100 status code <br>101: 101 status code <br>102: 102 status code <br>2XX: Status code of type 2xx <br>200: 200 status code <br>201: 201 status code <br>202: 202 status code <br>203: 203 status code <br>204: 204 status code <br>205: 205 status code <br>206: 206 status code <br>207: 207 status code <br>3XX: Status code of type 3xx <br>300: 300 status code <br>301: 301 status code <br>302: 302 status code <br>303: 303 status code <br>304: 304 status code <br>305: 305 status code <br>307: 307 status code <br>4XX: Status code of type 4xx <br>400: 400 status code <br>401: 401 status code <br>402: 402 status code <br>403: 403 status code <br>404: 404 status code <br>405: 405 status code <br>406: 406 status code <br>407: 407 status code <br>408: 408 status code <br>409: 409 status code <br>410: 410 status code <br>411: 411 status code <br>412: 412 status code <br>412: 413 Status Code <br>414: 414 status code <br>415: 415 status code <br>416: 416 status code <br>417: 417 status code <br>422: 422 status code <br>423: 423 status code <br>424: 424 status code <br>426: 426 status code <br>451: 451 status code <br>5XX: Status code of type 5xx <br>500: 500 status code <br>501: 501 status code <br>502:502 status code <br>503: 503 status code <br>504: 504 status code <br>505: 505 status code <br>506: 506 status code <br>507: 507 status code <br>510: 510 status code <br>514: 514 status code <br>544: 544 Status Code. </li>
<li>`browserType`:<br>Filter by the specified <strong>browser type</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li><br>Values: <br>`Firefox`: Firefox browser; <br>`Chrome`: Chrome browser; <br>`Safari`: Safari browser; <br>`MicrosoftEdge`: Microsoft Edge browser; <br>`IE`: IE browser; <br>`Opera`: Opera browser; <br>`QQBrowser`: QQ browser; <br>`LBBrowser`: LB browser; <br>`MaxthonBrowser`: Maxthon browser; <br>`SouGouBrowser`: Sogou browser; <br>`BIDUBrowser`: Baidu browser; <br>`TaoBrowser`: Tao browser; <br>`UBrowser`: UC browser; <br>`Other`: Other browsers; <br>`Empty`: The browser type is not specified; <br>`Bot`: Web crawler.</li>
<li>`deviceType`:<br>Filter by the <strong>device type</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>`TV`: TV; <br>`Tablet`: Tablet;<br>`Mobile`: Mobile phone; <br>`Desktop`: Desktop device;<br>`Other`: Other device;<br>`Empty`: Device type not specified.</li>
<li>`operatingSystemType`:<br>Filter by the <strong>operating system</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`Linux`: Linux OS; <br>`MacOS`: Mac OS;<br>`Android`: Android OS;<br>`IOS`: iOS OS;<br>`Windows`: Windows OS;<br>`NetBSD`: NetBSD OS;<br>`ChromiumOS`: Chromium OS; <br>`Bot`: Web crawler:<br>`Other`: Other OS;   <br>`Empty`: The OS is not specified.</li>
<li>`tlsVersion`:<br>Filter by the <strong>TLS version</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`TLS1.0`: TLS 1.0;<br>`TLS1.1`: TLS 1.1; <br>`TLS1.2`: TLS 1.2;<br>`TLS1.3`: TLS 1.3.</li>
<li>`ipVersion`<br>Filter by the <strong>specified IP version. <br>Values: <br>`4`: IPv4; <br>`6`: IPv6.
<li>`tagKey`<br>Filter by the <strong>Tag Key</strong>. </li>
<li>`tagValue`<br>Filter by the <strong>Tag Value</strong>. </li>
     * @param Filters Filters
<li>`country`<br>Filter by the <strong> Country/Region</strong>. The country/region follows <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166</a> specification. </li>
<li>`province`<br>Filter by the <strong>specified province name</strong>. It’s only available when `Area` is `mainland`.</li>
<li>`isp`<br>:   Filter by the specified ISP. It’s only available when `Area` is `mainland`.<br>Values: <br>`2`: CTCC; <br>`26`: CUCC; <br>`1046`: CMCC; <br>`3947`: CTT; <br>`38`: CERNET; <br>`43`: GWBN; <br>`0`: Others.</li>
<li>`domain`<br>: Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`url`:<br>Filter by the <strong>specified URL Path (such as `/content` or `content/test.jpg`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`referer`:<br>Filter by the specified <strong>Referer header</strong>, such as `example.com`.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`resourceType`:<br>Filter by the specified <strong>resource file type</strong>, such as `jpg`, `css`. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li>
<li>`protocol`:<br> Filter by the specified <strong>HTTP protocol</strong> version <br>Values: <br>`HTTP/1.0`: HTTP 1.0;<br>`HTTP/1.1`: HTTP 1.1;<br>`HTTP/2.0`: HTTP 2.0;<br>`HTTP/3.0`: HTTP 3.0;<br>`WebSocket`: WebSocket.</li>
<li>`socket`:<br>Filter by the specified <strong>HTTP protocol type</strong> <br>Values:<br>`HTTP`: HTTP protocol; <br>`HTTPS`: HTTPS protocol;<br>`QUIC`: QUIC protocol.
<li>`statusCode`:<br> Filter by the <strong> Status Code</strong><br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>1XX: Status code of type 1xx <br>100: 100 status code <br>101: 101 status code <br>102: 102 status code <br>2XX: Status code of type 2xx <br>200: 200 status code <br>201: 201 status code <br>202: 202 status code <br>203: 203 status code <br>204: 204 status code <br>205: 205 status code <br>206: 206 status code <br>207: 207 status code <br>3XX: Status code of type 3xx <br>300: 300 status code <br>301: 301 status code <br>302: 302 status code <br>303: 303 status code <br>304: 304 status code <br>305: 305 status code <br>307: 307 status code <br>4XX: Status code of type 4xx <br>400: 400 status code <br>401: 401 status code <br>402: 402 status code <br>403: 403 status code <br>404: 404 status code <br>405: 405 status code <br>406: 406 status code <br>407: 407 status code <br>408: 408 status code <br>409: 409 status code <br>410: 410 status code <br>411: 411 status code <br>412: 412 status code <br>412: 413 Status Code <br>414: 414 status code <br>415: 415 status code <br>416: 416 status code <br>417: 417 status code <br>422: 422 status code <br>423: 423 status code <br>424: 424 status code <br>426: 426 status code <br>451: 451 status code <br>5XX: Status code of type 5xx <br>500: 500 status code <br>501: 501 status code <br>502:502 status code <br>503: 503 status code <br>504: 504 status code <br>505: 505 status code <br>506: 506 status code <br>507: 507 status code <br>510: 510 status code <br>514: 514 status code <br>544: 544 Status Code. </li>
<li>`browserType`:<br>Filter by the specified <strong>browser type</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.</li><br>Values: <br>`Firefox`: Firefox browser; <br>`Chrome`: Chrome browser; <br>`Safari`: Safari browser; <br>`MicrosoftEdge`: Microsoft Edge browser; <br>`IE`: IE browser; <br>`Opera`: Opera browser; <br>`QQBrowser`: QQ browser; <br>`LBBrowser`: LB browser; <br>`MaxthonBrowser`: Maxthon browser; <br>`SouGouBrowser`: Sogou browser; <br>`BIDUBrowser`: Baidu browser; <br>`TaoBrowser`: Tao browser; <br>`UBrowser`: UC browser; <br>`Other`: Other browsers; <br>`Empty`: The browser type is not specified; <br>`Bot`: Web crawler.</li>
<li>`deviceType`:<br>Filter by the <strong>device type</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values:<br>`TV`: TV; <br>`Tablet`: Tablet;<br>`Mobile`: Mobile phone; <br>`Desktop`: Desktop device;<br>`Other`: Other device;<br>`Empty`: Device type not specified.</li>
<li>`operatingSystemType`:<br>Filter by the <strong>operating system</strong>.<br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`Linux`: Linux OS; <br>`MacOS`: Mac OS;<br>`Android`: Android OS;<br>`IOS`: iOS OS;<br>`Windows`: Windows OS;<br>`NetBSD`: NetBSD OS;<br>`ChromiumOS`: Chromium OS; <br>`Bot`: Web crawler:<br>`Other`: Other OS;   <br>`Empty`: The OS is not specified.</li>
<li>`tlsVersion`:<br>Filter by the <strong>TLS version</strong>. <br>If this parameter is specified, the max query period is the last 30 days.<br>The <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query scope stated in the service package specifications</a> of the site (if `ZoneIds` specified) becomes invalid.<br>Values: <br>`TLS1.0`: TLS 1.0;<br>`TLS1.1`: TLS 1.1; <br>`TLS1.2`: TLS 1.2;<br>`TLS1.3`: TLS 1.3.</li>
<li>`ipVersion`<br>Filter by the <strong>specified IP version. <br>Values: <br>`4`: IPv4; <br>`6`: IPv6.
<li>`tagKey`<br>Filter by the <strong>Tag Key</strong>. </li>
<li>`tagValue`<br>Filter by the <strong>Tag Value</strong>. </li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days. 
     * @return Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     * @param Interval The query time granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minute;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the interval between the start time and end time as follows: 1-minute granularity applies for a 1-hour interval, 5-minute granularity for a 2-day interval, 1-hour granularity for a 7-day interval, and 1-day granularity for an interval of over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Geolocation scope. Values:
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used. 
     * @return Area Geolocation scope. Values:
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Geolocation scope. Values:
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     * @param Area Geolocation scope. Values:
<li>`overseas`: Regions outside the Chinese mainland</li>
<li>`mainland`: Chinese mainland</li>
<li>`global`: Global</li>If this field is not specified, the default value `global` is used.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTopL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7AnalysisDataRequest(DescribeTopL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

