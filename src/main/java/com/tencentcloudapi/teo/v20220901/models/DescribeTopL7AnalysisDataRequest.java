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
    * Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic metric counted by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic metric counted by the dimension of provinces in Chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic metric counted by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic metric counted by the domain name dimension;</li>
<li> l7Flow_outFlux_url: L7 EdgeOne response traffic metric counted by the URL path dimension;</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic metric counted by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic metric counted by the client IP dimension;</li>
<li> l7Flow_outFlux_referers: L7 EdgeOne response traffic metric counted by the referer dimension;</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic metric counted by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic metric counted by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic metric counted by the operating system type dimension;</li>
<li> l7Flow_request_country: L7 access request count metric counted by the country/region dimension;</li>
<li> l7Flow_request_province: L7 access request count metric counted by the dimension of provinces in the Chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 access request count metric counted by the status code dimension;</li>
<li> l7Flow_request_domain: L7 access request count metric counted by the domain name dimension;</li>
<li> l7Flow_request_url: L7 access request count metrics counted by the URL path dimension;</li>
<li> l7Flow_request_resourceType: L7 access request count metric counted by the resource type dimension;</li>
<li> l7Flow_request_sip: L7 access request count metric counted by the client IP dimension;</li>
<li> l7Flow_request_referer: L7 access request count metric counted by the referer dimension;</li>
<li> l7Flow_request_ua_device: L7 access request count metric counted by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 access request count metric counted by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 access request count metric counted by the operating system type dimension.</li>

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
    * Indicates the top N data to be queried. The maximum value is 1000. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The detailed Key values are as follows:
<li>country: Filter by country/region. The country/region follows the <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166-1 alpha-2</a> standard. Example value: CN.</li>
<li>province: Filter by province. This parameter is supported only when the service area is the Chinese mainland. For province codes, refer to the <a href="https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">Mapping Table of Provinces Within the Chinese Mainland</a>. Example value: 22.</li>
<li>isp: Filter by ISP. This parameter is supported only when the service area is the Chinese mainland. Valid values are as follows:<br> 2: China Telecom;<br> 26: China Unicom;<br> 1046: China Mobile;<br> 3947: China Tietong;<br> 38: CERNET;<br> 43: Great Wall Broadband;<br> 0: other ISPs.</li>
<li>domain: Filter by subdomain name. Example value: www.example.com.</li>
<li>url: Filter by URL path. Example value: /content or /content/test.jpg. If the url parameter is input, up to 30 days of data can be queried.</li>
<li>referer: Filter by Referer request header. Example value: http://www.example.com/. If the referer parameter is input, up to 30 days of data can be queried.</li>
<li>resourceType: Filter by resource type, which is generally the file suffix. Example value: .jpg. If the resourceType parameter is input, up to 30 days of data can be queried;</li>
<li>protocol: Filter by HTTP protocol version. Valid values are as follows:<br> HTTP/1.0;<br> HTTP/1.1;<br> HTTP/2.0;<br> HTTP/3;<br> WebSocket.</li>
<li>socket: Filter by HTTP protocol type. Valid values are as follows:<br> HTTP: HTTP protocol;<br> HTTPS: HTTPS protocol;<br> QUIC: QUIC protocol.</li>
<li>statusCode: Filter by edge status code. If the statusCode parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> 1XX: 1xx status code;<br> 2XX: 2xx status code;<br> 3XX: 3xx status code;<br> 4XX: 4xx status code;<br> 5XX: 5xx status code;<br> An integer within the range [0,600).</li>
<li>browserType: Filter by browser type. If the browserType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Firefox: Firefox browser;<br> Chrome: Chrome browser;<br> Safari: Safari browser;<br> Other: other browser types;<br> Empty: The browser type is empty;<br> Bot: search engine crawler;<br> MicrosoftEdge: Microsoft Edge browser;<br> IE: IE browser;<br> Opera: Opera browser;<br> QQBrowser: QQ browser;<br> LBBrowser: LB browser;<br> MaxthonBrowser: Maxthon browser;<br> SouGouBrowser: Sogou browser;<br> BIDUBrowser: Baidu browser;<br> TaoBrowser: Tao browser;<br> UBrowser: UC browser.</li>
<li>deviceType: Filter by device type. If the deviceType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TV: TV device;<br> Tablet: tablet device;<br> Mobile: mobile device;<br> Desktop: desktop device;<br> Other: other device types;<br> Empty: The device type is empty.</li>
<li>operatingSystemType: Filter by operating system type. If the operatingSystemType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Linux: Linux operating system;<br> MacOS: MacOS operating system;<br> Android: Android operating system;<br> IOS: iOS operating system;<br> Windows: Windows operating system;<br> NetBSD: NetBSD;<br> ChromiumOS: ChromiumOS;<br> Bot: search engine crawler;<br> Other: other types of operating systems;<br> Empty: The operating system is empty.</li>
<li>tlsVersion: Filter by TLS version. If the tlsVersion parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TLS1.0;<br> TLS1.1;<br> TLS1.2;<br> TLS1.3.</li>
<li>ipVersion: Filter by IP version. Valid values are as follows:<br> 4: IPv4;<br> 6: IPv6.</li>
<li>cacheType: Filter by cache status. Valid values are as follows:<br> hit: The request hits the EdgeOne node cache and the resources are provided by the node cache. A partial cache hit for resources is also recorded as hit.<br> miss: The request does not hit the EdgeOne node cache and the resources are provided by the origin server.<br> dynamic: The requested resources cannot be cached or are not configured with node cache and are provided by the origin server.<br> other: unrecognizable cache status. Requests responded to by edge functions are recorded as other.</li>
<li>clientIp: Filter by client IP.</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Query period granularity. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not filled in, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Data region. Values:
<li>overseas: Regions outside the Chinese mainland</li>
<li>mainland: Chinese mainland</li>
<li>global: Global</li>If this field is not specified, the default value `global` is used.
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
     * Get Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic metric counted by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic metric counted by the dimension of provinces in Chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic metric counted by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic metric counted by the domain name dimension;</li>
<li> l7Flow_outFlux_url: L7 EdgeOne response traffic metric counted by the URL path dimension;</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic metric counted by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic metric counted by the client IP dimension;</li>
<li> l7Flow_outFlux_referers: L7 EdgeOne response traffic metric counted by the referer dimension;</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic metric counted by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic metric counted by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic metric counted by the operating system type dimension;</li>
<li> l7Flow_request_country: L7 access request count metric counted by the country/region dimension;</li>
<li> l7Flow_request_province: L7 access request count metric counted by the dimension of provinces in the Chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 access request count metric counted by the status code dimension;</li>
<li> l7Flow_request_domain: L7 access request count metric counted by the domain name dimension;</li>
<li> l7Flow_request_url: L7 access request count metrics counted by the URL path dimension;</li>
<li> l7Flow_request_resourceType: L7 access request count metric counted by the resource type dimension;</li>
<li> l7Flow_request_sip: L7 access request count metric counted by the client IP dimension;</li>
<li> l7Flow_request_referer: L7 access request count metric counted by the referer dimension;</li>
<li> l7Flow_request_ua_device: L7 access request count metric counted by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 access request count metric counted by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 access request count metric counted by the operating system type dimension.</li>
 
     * @return MetricName Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic metric counted by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic metric counted by the dimension of provinces in Chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic metric counted by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic metric counted by the domain name dimension;</li>
<li> l7Flow_outFlux_url: L7 EdgeOne response traffic metric counted by the URL path dimension;</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic metric counted by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic metric counted by the client IP dimension;</li>
<li> l7Flow_outFlux_referers: L7 EdgeOne response traffic metric counted by the referer dimension;</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic metric counted by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic metric counted by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic metric counted by the operating system type dimension;</li>
<li> l7Flow_request_country: L7 access request count metric counted by the country/region dimension;</li>
<li> l7Flow_request_province: L7 access request count metric counted by the dimension of provinces in the Chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 access request count metric counted by the status code dimension;</li>
<li> l7Flow_request_domain: L7 access request count metric counted by the domain name dimension;</li>
<li> l7Flow_request_url: L7 access request count metrics counted by the URL path dimension;</li>
<li> l7Flow_request_resourceType: L7 access request count metric counted by the resource type dimension;</li>
<li> l7Flow_request_sip: L7 access request count metric counted by the client IP dimension;</li>
<li> l7Flow_request_referer: L7 access request count metric counted by the referer dimension;</li>
<li> l7Flow_request_ua_device: L7 access request count metric counted by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 access request count metric counted by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 access request count metric counted by the operating system type dimension.</li>

     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic metric counted by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic metric counted by the dimension of provinces in Chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic metric counted by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic metric counted by the domain name dimension;</li>
<li> l7Flow_outFlux_url: L7 EdgeOne response traffic metric counted by the URL path dimension;</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic metric counted by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic metric counted by the client IP dimension;</li>
<li> l7Flow_outFlux_referers: L7 EdgeOne response traffic metric counted by the referer dimension;</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic metric counted by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic metric counted by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic metric counted by the operating system type dimension;</li>
<li> l7Flow_request_country: L7 access request count metric counted by the country/region dimension;</li>
<li> l7Flow_request_province: L7 access request count metric counted by the dimension of provinces in the Chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 access request count metric counted by the status code dimension;</li>
<li> l7Flow_request_domain: L7 access request count metric counted by the domain name dimension;</li>
<li> l7Flow_request_url: L7 access request count metrics counted by the URL path dimension;</li>
<li> l7Flow_request_resourceType: L7 access request count metric counted by the resource type dimension;</li>
<li> l7Flow_request_sip: L7 access request count metric counted by the client IP dimension;</li>
<li> l7Flow_request_referer: L7 access request count metric counted by the referer dimension;</li>
<li> l7Flow_request_ua_device: L7 access request count metric counted by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 access request count metric counted by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 access request count metric counted by the operating system type dimension.</li>

     * @param MetricName Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic metric counted by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic metric counted by the dimension of provinces in Chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic metric counted by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic metric counted by the domain name dimension;</li>
<li> l7Flow_outFlux_url: L7 EdgeOne response traffic metric counted by the URL path dimension;</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic metric counted by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic metric counted by the client IP dimension;</li>
<li> l7Flow_outFlux_referers: L7 EdgeOne response traffic metric counted by the referer dimension;</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic metric counted by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic metric counted by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic metric counted by the operating system type dimension;</li>
<li> l7Flow_request_country: L7 access request count metric counted by the country/region dimension;</li>
<li> l7Flow_request_province: L7 access request count metric counted by the dimension of provinces in the Chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 access request count metric counted by the status code dimension;</li>
<li> l7Flow_request_domain: L7 access request count metric counted by the domain name dimension;</li>
<li> l7Flow_request_url: L7 access request count metrics counted by the URL path dimension;</li>
<li> l7Flow_request_resourceType: L7 access request count metric counted by the resource type dimension;</li>
<li> l7Flow_request_sip: L7 access request count metric counted by the client IP dimension;</li>
<li> l7Flow_request_referer: L7 access request count metric counted by the referer dimension;</li>
<li> l7Flow_request_ua_device: L7 access request count metric counted by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 access request count metric counted by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 access request count metric counted by the operating system type dimension.</li>

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
     * Get Indicates the top N data to be queried. The maximum value is 1000. If this parameter is not input, the default value is 10, indicating querying the top 10 data. 
     * @return Limit Indicates the top N data to be queried. The maximum value is 1000. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Indicates the top N data to be queried. The maximum value is 1000. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     * @param Limit Indicates the top N data to be queried. The maximum value is 1000. If this parameter is not input, the default value is 10, indicating querying the top 10 data.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The detailed Key values are as follows:
<li>country: Filter by country/region. The country/region follows the <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166-1 alpha-2</a> standard. Example value: CN.</li>
<li>province: Filter by province. This parameter is supported only when the service area is the Chinese mainland. For province codes, refer to the <a href="https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">Mapping Table of Provinces Within the Chinese Mainland</a>. Example value: 22.</li>
<li>isp: Filter by ISP. This parameter is supported only when the service area is the Chinese mainland. Valid values are as follows:<br> 2: China Telecom;<br> 26: China Unicom;<br> 1046: China Mobile;<br> 3947: China Tietong;<br> 38: CERNET;<br> 43: Great Wall Broadband;<br> 0: other ISPs.</li>
<li>domain: Filter by subdomain name. Example value: www.example.com.</li>
<li>url: Filter by URL path. Example value: /content or /content/test.jpg. If the url parameter is input, up to 30 days of data can be queried.</li>
<li>referer: Filter by Referer request header. Example value: http://www.example.com/. If the referer parameter is input, up to 30 days of data can be queried.</li>
<li>resourceType: Filter by resource type, which is generally the file suffix. Example value: .jpg. If the resourceType parameter is input, up to 30 days of data can be queried;</li>
<li>protocol: Filter by HTTP protocol version. Valid values are as follows:<br> HTTP/1.0;<br> HTTP/1.1;<br> HTTP/2.0;<br> HTTP/3;<br> WebSocket.</li>
<li>socket: Filter by HTTP protocol type. Valid values are as follows:<br> HTTP: HTTP protocol;<br> HTTPS: HTTPS protocol;<br> QUIC: QUIC protocol.</li>
<li>statusCode: Filter by edge status code. If the statusCode parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> 1XX: 1xx status code;<br> 2XX: 2xx status code;<br> 3XX: 3xx status code;<br> 4XX: 4xx status code;<br> 5XX: 5xx status code;<br> An integer within the range [0,600).</li>
<li>browserType: Filter by browser type. If the browserType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Firefox: Firefox browser;<br> Chrome: Chrome browser;<br> Safari: Safari browser;<br> Other: other browser types;<br> Empty: The browser type is empty;<br> Bot: search engine crawler;<br> MicrosoftEdge: Microsoft Edge browser;<br> IE: IE browser;<br> Opera: Opera browser;<br> QQBrowser: QQ browser;<br> LBBrowser: LB browser;<br> MaxthonBrowser: Maxthon browser;<br> SouGouBrowser: Sogou browser;<br> BIDUBrowser: Baidu browser;<br> TaoBrowser: Tao browser;<br> UBrowser: UC browser.</li>
<li>deviceType: Filter by device type. If the deviceType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TV: TV device;<br> Tablet: tablet device;<br> Mobile: mobile device;<br> Desktop: desktop device;<br> Other: other device types;<br> Empty: The device type is empty.</li>
<li>operatingSystemType: Filter by operating system type. If the operatingSystemType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Linux: Linux operating system;<br> MacOS: MacOS operating system;<br> Android: Android operating system;<br> IOS: iOS operating system;<br> Windows: Windows operating system;<br> NetBSD: NetBSD;<br> ChromiumOS: ChromiumOS;<br> Bot: search engine crawler;<br> Other: other types of operating systems;<br> Empty: The operating system is empty.</li>
<li>tlsVersion: Filter by TLS version. If the tlsVersion parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TLS1.0;<br> TLS1.1;<br> TLS1.2;<br> TLS1.3.</li>
<li>ipVersion: Filter by IP version. Valid values are as follows:<br> 4: IPv4;<br> 6: IPv6.</li>
<li>cacheType: Filter by cache status. Valid values are as follows:<br> hit: The request hits the EdgeOne node cache and the resources are provided by the node cache. A partial cache hit for resources is also recorded as hit.<br> miss: The request does not hit the EdgeOne node cache and the resources are provided by the origin server.<br> dynamic: The requested resources cannot be cached or are not configured with node cache and are provided by the origin server.<br> other: unrecognizable cache status. Requests responded to by edge functions are recorded as other.</li>
<li>clientIp: Filter by client IP.</li> 
     * @return Filters Filter criteria. The detailed Key values are as follows:
<li>country: Filter by country/region. The country/region follows the <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166-1 alpha-2</a> standard. Example value: CN.</li>
<li>province: Filter by province. This parameter is supported only when the service area is the Chinese mainland. For province codes, refer to the <a href="https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">Mapping Table of Provinces Within the Chinese Mainland</a>. Example value: 22.</li>
<li>isp: Filter by ISP. This parameter is supported only when the service area is the Chinese mainland. Valid values are as follows:<br> 2: China Telecom;<br> 26: China Unicom;<br> 1046: China Mobile;<br> 3947: China Tietong;<br> 38: CERNET;<br> 43: Great Wall Broadband;<br> 0: other ISPs.</li>
<li>domain: Filter by subdomain name. Example value: www.example.com.</li>
<li>url: Filter by URL path. Example value: /content or /content/test.jpg. If the url parameter is input, up to 30 days of data can be queried.</li>
<li>referer: Filter by Referer request header. Example value: http://www.example.com/. If the referer parameter is input, up to 30 days of data can be queried.</li>
<li>resourceType: Filter by resource type, which is generally the file suffix. Example value: .jpg. If the resourceType parameter is input, up to 30 days of data can be queried;</li>
<li>protocol: Filter by HTTP protocol version. Valid values are as follows:<br> HTTP/1.0;<br> HTTP/1.1;<br> HTTP/2.0;<br> HTTP/3;<br> WebSocket.</li>
<li>socket: Filter by HTTP protocol type. Valid values are as follows:<br> HTTP: HTTP protocol;<br> HTTPS: HTTPS protocol;<br> QUIC: QUIC protocol.</li>
<li>statusCode: Filter by edge status code. If the statusCode parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> 1XX: 1xx status code;<br> 2XX: 2xx status code;<br> 3XX: 3xx status code;<br> 4XX: 4xx status code;<br> 5XX: 5xx status code;<br> An integer within the range [0,600).</li>
<li>browserType: Filter by browser type. If the browserType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Firefox: Firefox browser;<br> Chrome: Chrome browser;<br> Safari: Safari browser;<br> Other: other browser types;<br> Empty: The browser type is empty;<br> Bot: search engine crawler;<br> MicrosoftEdge: Microsoft Edge browser;<br> IE: IE browser;<br> Opera: Opera browser;<br> QQBrowser: QQ browser;<br> LBBrowser: LB browser;<br> MaxthonBrowser: Maxthon browser;<br> SouGouBrowser: Sogou browser;<br> BIDUBrowser: Baidu browser;<br> TaoBrowser: Tao browser;<br> UBrowser: UC browser.</li>
<li>deviceType: Filter by device type. If the deviceType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TV: TV device;<br> Tablet: tablet device;<br> Mobile: mobile device;<br> Desktop: desktop device;<br> Other: other device types;<br> Empty: The device type is empty.</li>
<li>operatingSystemType: Filter by operating system type. If the operatingSystemType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Linux: Linux operating system;<br> MacOS: MacOS operating system;<br> Android: Android operating system;<br> IOS: iOS operating system;<br> Windows: Windows operating system;<br> NetBSD: NetBSD;<br> ChromiumOS: ChromiumOS;<br> Bot: search engine crawler;<br> Other: other types of operating systems;<br> Empty: The operating system is empty.</li>
<li>tlsVersion: Filter by TLS version. If the tlsVersion parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TLS1.0;<br> TLS1.1;<br> TLS1.2;<br> TLS1.3.</li>
<li>ipVersion: Filter by IP version. Valid values are as follows:<br> 4: IPv4;<br> 6: IPv6.</li>
<li>cacheType: Filter by cache status. Valid values are as follows:<br> hit: The request hits the EdgeOne node cache and the resources are provided by the node cache. A partial cache hit for resources is also recorded as hit.<br> miss: The request does not hit the EdgeOne node cache and the resources are provided by the origin server.<br> dynamic: The requested resources cannot be cached or are not configured with node cache and are provided by the origin server.<br> other: unrecognizable cache status. Requests responded to by edge functions are recorded as other.</li>
<li>clientIp: Filter by client IP.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed Key values are as follows:
<li>country: Filter by country/region. The country/region follows the <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166-1 alpha-2</a> standard. Example value: CN.</li>
<li>province: Filter by province. This parameter is supported only when the service area is the Chinese mainland. For province codes, refer to the <a href="https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">Mapping Table of Provinces Within the Chinese Mainland</a>. Example value: 22.</li>
<li>isp: Filter by ISP. This parameter is supported only when the service area is the Chinese mainland. Valid values are as follows:<br> 2: China Telecom;<br> 26: China Unicom;<br> 1046: China Mobile;<br> 3947: China Tietong;<br> 38: CERNET;<br> 43: Great Wall Broadband;<br> 0: other ISPs.</li>
<li>domain: Filter by subdomain name. Example value: www.example.com.</li>
<li>url: Filter by URL path. Example value: /content or /content/test.jpg. If the url parameter is input, up to 30 days of data can be queried.</li>
<li>referer: Filter by Referer request header. Example value: http://www.example.com/. If the referer parameter is input, up to 30 days of data can be queried.</li>
<li>resourceType: Filter by resource type, which is generally the file suffix. Example value: .jpg. If the resourceType parameter is input, up to 30 days of data can be queried;</li>
<li>protocol: Filter by HTTP protocol version. Valid values are as follows:<br> HTTP/1.0;<br> HTTP/1.1;<br> HTTP/2.0;<br> HTTP/3;<br> WebSocket.</li>
<li>socket: Filter by HTTP protocol type. Valid values are as follows:<br> HTTP: HTTP protocol;<br> HTTPS: HTTPS protocol;<br> QUIC: QUIC protocol.</li>
<li>statusCode: Filter by edge status code. If the statusCode parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> 1XX: 1xx status code;<br> 2XX: 2xx status code;<br> 3XX: 3xx status code;<br> 4XX: 4xx status code;<br> 5XX: 5xx status code;<br> An integer within the range [0,600).</li>
<li>browserType: Filter by browser type. If the browserType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Firefox: Firefox browser;<br> Chrome: Chrome browser;<br> Safari: Safari browser;<br> Other: other browser types;<br> Empty: The browser type is empty;<br> Bot: search engine crawler;<br> MicrosoftEdge: Microsoft Edge browser;<br> IE: IE browser;<br> Opera: Opera browser;<br> QQBrowser: QQ browser;<br> LBBrowser: LB browser;<br> MaxthonBrowser: Maxthon browser;<br> SouGouBrowser: Sogou browser;<br> BIDUBrowser: Baidu browser;<br> TaoBrowser: Tao browser;<br> UBrowser: UC browser.</li>
<li>deviceType: Filter by device type. If the deviceType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TV: TV device;<br> Tablet: tablet device;<br> Mobile: mobile device;<br> Desktop: desktop device;<br> Other: other device types;<br> Empty: The device type is empty.</li>
<li>operatingSystemType: Filter by operating system type. If the operatingSystemType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Linux: Linux operating system;<br> MacOS: MacOS operating system;<br> Android: Android operating system;<br> IOS: iOS operating system;<br> Windows: Windows operating system;<br> NetBSD: NetBSD;<br> ChromiumOS: ChromiumOS;<br> Bot: search engine crawler;<br> Other: other types of operating systems;<br> Empty: The operating system is empty.</li>
<li>tlsVersion: Filter by TLS version. If the tlsVersion parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TLS1.0;<br> TLS1.1;<br> TLS1.2;<br> TLS1.3.</li>
<li>ipVersion: Filter by IP version. Valid values are as follows:<br> 4: IPv4;<br> 6: IPv6.</li>
<li>cacheType: Filter by cache status. Valid values are as follows:<br> hit: The request hits the EdgeOne node cache and the resources are provided by the node cache. A partial cache hit for resources is also recorded as hit.<br> miss: The request does not hit the EdgeOne node cache and the resources are provided by the origin server.<br> dynamic: The requested resources cannot be cached or are not configured with node cache and are provided by the origin server.<br> other: unrecognizable cache status. Requests responded to by edge functions are recorded as other.</li>
<li>clientIp: Filter by client IP.</li>
     * @param Filters Filter criteria. The detailed Key values are as follows:
<li>country: Filter by country/region. The country/region follows the <a href="https://baike.baidu.com/item/ISO%203166-1/5269555">ISO 3166-1 alpha-2</a> standard. Example value: CN.</li>
<li>province: Filter by province. This parameter is supported only when the service area is the Chinese mainland. For province codes, refer to the <a href="https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8">Mapping Table of Provinces Within the Chinese Mainland</a>. Example value: 22.</li>
<li>isp: Filter by ISP. This parameter is supported only when the service area is the Chinese mainland. Valid values are as follows:<br> 2: China Telecom;<br> 26: China Unicom;<br> 1046: China Mobile;<br> 3947: China Tietong;<br> 38: CERNET;<br> 43: Great Wall Broadband;<br> 0: other ISPs.</li>
<li>domain: Filter by subdomain name. Example value: www.example.com.</li>
<li>url: Filter by URL path. Example value: /content or /content/test.jpg. If the url parameter is input, up to 30 days of data can be queried.</li>
<li>referer: Filter by Referer request header. Example value: http://www.example.com/. If the referer parameter is input, up to 30 days of data can be queried.</li>
<li>resourceType: Filter by resource type, which is generally the file suffix. Example value: .jpg. If the resourceType parameter is input, up to 30 days of data can be queried;</li>
<li>protocol: Filter by HTTP protocol version. Valid values are as follows:<br> HTTP/1.0;<br> HTTP/1.1;<br> HTTP/2.0;<br> HTTP/3;<br> WebSocket.</li>
<li>socket: Filter by HTTP protocol type. Valid values are as follows:<br> HTTP: HTTP protocol;<br> HTTPS: HTTPS protocol;<br> QUIC: QUIC protocol.</li>
<li>statusCode: Filter by edge status code. If the statusCode parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> 1XX: 1xx status code;<br> 2XX: 2xx status code;<br> 3XX: 3xx status code;<br> 4XX: 4xx status code;<br> 5XX: 5xx status code;<br> An integer within the range [0,600).</li>
<li>browserType: Filter by browser type. If the browserType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Firefox: Firefox browser;<br> Chrome: Chrome browser;<br> Safari: Safari browser;<br> Other: other browser types;<br> Empty: The browser type is empty;<br> Bot: search engine crawler;<br> MicrosoftEdge: Microsoft Edge browser;<br> IE: IE browser;<br> Opera: Opera browser;<br> QQBrowser: QQ browser;<br> LBBrowser: LB browser;<br> MaxthonBrowser: Maxthon browser;<br> SouGouBrowser: Sogou browser;<br> BIDUBrowser: Baidu browser;<br> TaoBrowser: Tao browser;<br> UBrowser: UC browser.</li>
<li>deviceType: Filter by device type. If the deviceType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TV: TV device;<br> Tablet: tablet device;<br> Mobile: mobile device;<br> Desktop: desktop device;<br> Other: other device types;<br> Empty: The device type is empty.</li>
<li>operatingSystemType: Filter by operating system type. If the operatingSystemType parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> Linux: Linux operating system;<br> MacOS: MacOS operating system;<br> Android: Android operating system;<br> IOS: iOS operating system;<br> Windows: Windows operating system;<br> NetBSD: NetBSD;<br> ChromiumOS: ChromiumOS;<br> Bot: search engine crawler;<br> Other: other types of operating systems;<br> Empty: The operating system is empty.</li>
<li>tlsVersion: Filter by TLS version. If the tlsVersion parameter is input, up to 30 days of data can be queried. Valid values are as follows:<br> TLS1.0;<br> TLS1.1;<br> TLS1.2;<br> TLS1.3.</li>
<li>ipVersion: Filter by IP version. Valid values are as follows:<br> 4: IPv4;<br> 6: IPv6.</li>
<li>cacheType: Filter by cache status. Valid values are as follows:<br> hit: The request hits the EdgeOne node cache and the resources are provided by the node cache. A partial cache hit for resources is also recorded as hit.<br> miss: The request does not hit the EdgeOne node cache and the resources are provided by the origin server.<br> dynamic: The requested resources cannot be cached or are not configured with node cache and are provided by the origin server.<br> other: unrecognizable cache status. Requests responded to by edge functions are recorded as other.</li>
<li>clientIp: Filter by client IP.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query period granularity. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not filled in, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Query period granularity. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not filled in, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query period granularity. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not filled in, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Query period granularity. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not filled in, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Data region. Values:
<li>overseas: Regions outside the Chinese mainland</li>
<li>mainland: Chinese mainland</li>
<li>global: Global</li>If this field is not specified, the default value `global` is used. 
     * @return Area Data region. Values:
<li>overseas: Regions outside the Chinese mainland</li>
<li>mainland: Chinese mainland</li>
<li>global: Global</li>If this field is not specified, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data region. Values:
<li>overseas: Regions outside the Chinese mainland</li>
<li>mainland: Chinese mainland</li>
<li>global: Global</li>If this field is not specified, the default value `global` is used.
     * @param Area Data region. Values:
<li>overseas: Regions outside the Chinese mainland</li>
<li>mainland: Chinese mainland</li>
<li>global: Global</li>If this field is not specified, the default value `global` is used.
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

