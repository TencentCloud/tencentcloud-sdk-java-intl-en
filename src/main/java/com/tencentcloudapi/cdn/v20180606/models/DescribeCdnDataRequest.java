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

public class DescribeCdnDataRequest extends AbstractModel{

    /**
    * Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the metric to query, which can be:
`flux`: Traffic (in bytes)
`fluxIn`: Upstream traffic (in bytes), only used for the `ecdn` product
`fluxOut`: Downstream traffic (in bytes), only used for the `ecdn` product
`bandwidth`: Bandwidth (in bps)
`bandwidthIn`: Upstream bandwidth (in bps), only used for the `ecdn` product
`bandwidthOut`: Downstream bandwidth (in bps), only used for the `ecdn` product
`request`: Number of requests
`hitRequest`: Number of hit requests
`requestHitRate`: Request hit rate (in % with two decimal digits)
`hitFlux`: Hit traffic (in bytes)
`fluxHitRate`: Traffic hit rate (in % with two decimal digits)
`statusCode`: Status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx status codes and the data for status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx status codes and the data for status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx status codes and the data for status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx status codes and the data for status codes starting with 5 (in entries)
Specifies the status code to query. The return will be empty if the status code has never been generated.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Specifies the list of domain names to be queried
You can specify one or more domain names.
Up to 30 domain names can be queried in one request.
If this parameter is not specified, it means to query all domain names under the current account.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
Note that `Project` will be ignored if `Domains` is specified.
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * Sampling interval. The available options vary for different query period. See below: 
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * The aggregate data for multiple domain names is returned by default (false) during a multi-domain-name query.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported).
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * Specifies an ISP when you query the CDN data within the Chinese mainland. If this is left blank, all ISPs will be queried.
To view ISP codes, see [ISP Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8)
Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * Specifies a province when you query the CDN data within the Chinese mainland. If this is left blank, all provinces will be queried.
Specifies a country/region when you query the CDN data outside the Chinese mainland. If this is left blank, all countries/regions will be queried.
To view codes of provinces or countries/regions, see [Province Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8).
When `Area` is `mainland`, you can query by the province. Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
    */
    @SerializedName("District")
    @Expose
    private Long District;

    /**
    * Specifies the protocol to be queried; if you leave it blank, all protocols will be queried.
`all`: All protocols
`http`: Query HTTP data
`https`: Query HTTPS data
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Specifies the data source to be queried. It’s only open to beta users now. 
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * Specifies the IP protocol to be queried. If it’s not specified, data of all IP protocols are returned.
`all`: All protocols
`ipv4`: Query IPv4 data
`ipv6`: Query IPv6 data
If `IpProtocol` is specified, `District` parameter can not be specified at the same time.
Note: `ipv4` and `ipv6` are only available to beta users. 
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * Specifies the service area. If it’s not specified, CDN data of the Chinese mainland are returned.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specify whether to query by the region of the server or client. This parameter is valid only when `Area` is `overseas`.
`server`: Query by the location of server (Tencent Cloud CDN nodes)
`client`: Query by the location of the client (where the request devices are located)
    */
    @SerializedName("AreaType")
    @Expose
    private String AreaType;

    /**
    * Specifies the product to query, either `cdn` (default) or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Specifies a time zone to query. The default time zone is UTC+08:00.
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
     * Get Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days. 
     * @return StartTime Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     * @param StartTime Start time of the query, e.g., 2018-09-04 10:40:00.
The specified start time will be rounded down based on the granularity parameter `Interval`. For example, if you set the start time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days. 
     * @return EndTime End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     * @param EndTime End time of the query, e.g. 2018-09-04 10:40:00.
The specified end time will be rounded down based on the granularity parameter `Interval`. For example, if you set the end time to 2018-09-04 10:40:00 with 1-hour granularity, the time will be rounded down to 2018-09-04 10:00:00.
The period between the start time and end time can be up to 90 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the metric to query, which can be:
`flux`: Traffic (in bytes)
`fluxIn`: Upstream traffic (in bytes), only used for the `ecdn` product
`fluxOut`: Downstream traffic (in bytes), only used for the `ecdn` product
`bandwidth`: Bandwidth (in bps)
`bandwidthIn`: Upstream bandwidth (in bps), only used for the `ecdn` product
`bandwidthOut`: Downstream bandwidth (in bps), only used for the `ecdn` product
`request`: Number of requests
`hitRequest`: Number of hit requests
`requestHitRate`: Request hit rate (in % with two decimal digits)
`hitFlux`: Hit traffic (in bytes)
`fluxHitRate`: Traffic hit rate (in % with two decimal digits)
`statusCode`: Status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx status codes and the data for status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx status codes and the data for status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx status codes and the data for status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx status codes and the data for status codes starting with 5 (in entries)
Specifies the status code to query. The return will be empty if the status code has never been generated. 
     * @return Metric Specifies the metric to query, which can be:
`flux`: Traffic (in bytes)
`fluxIn`: Upstream traffic (in bytes), only used for the `ecdn` product
`fluxOut`: Downstream traffic (in bytes), only used for the `ecdn` product
`bandwidth`: Bandwidth (in bps)
`bandwidthIn`: Upstream bandwidth (in bps), only used for the `ecdn` product
`bandwidthOut`: Downstream bandwidth (in bps), only used for the `ecdn` product
`request`: Number of requests
`hitRequest`: Number of hit requests
`requestHitRate`: Request hit rate (in % with two decimal digits)
`hitFlux`: Hit traffic (in bytes)
`fluxHitRate`: Traffic hit rate (in % with two decimal digits)
`statusCode`: Status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx status codes and the data for status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx status codes and the data for status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx status codes and the data for status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx status codes and the data for status codes starting with 5 (in entries)
Specifies the status code to query. The return will be empty if the status code has never been generated.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Specifies the metric to query, which can be:
`flux`: Traffic (in bytes)
`fluxIn`: Upstream traffic (in bytes), only used for the `ecdn` product
`fluxOut`: Downstream traffic (in bytes), only used for the `ecdn` product
`bandwidth`: Bandwidth (in bps)
`bandwidthIn`: Upstream bandwidth (in bps), only used for the `ecdn` product
`bandwidthOut`: Downstream bandwidth (in bps), only used for the `ecdn` product
`request`: Number of requests
`hitRequest`: Number of hit requests
`requestHitRate`: Request hit rate (in % with two decimal digits)
`hitFlux`: Hit traffic (in bytes)
`fluxHitRate`: Traffic hit rate (in % with two decimal digits)
`statusCode`: Status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx status codes and the data for status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx status codes and the data for status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx status codes and the data for status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx status codes and the data for status codes starting with 5 (in entries)
Specifies the status code to query. The return will be empty if the status code has never been generated.
     * @param Metric Specifies the metric to query, which can be:
`flux`: Traffic (in bytes)
`fluxIn`: Upstream traffic (in bytes), only used for the `ecdn` product
`fluxOut`: Downstream traffic (in bytes), only used for the `ecdn` product
`bandwidth`: Bandwidth (in bps)
`bandwidthIn`: Upstream bandwidth (in bps), only used for the `ecdn` product
`bandwidthOut`: Downstream bandwidth (in bps), only used for the `ecdn` product
`request`: Number of requests
`hitRequest`: Number of hit requests
`requestHitRate`: Request hit rate (in % with two decimal digits)
`hitFlux`: Hit traffic (in bytes)
`fluxHitRate`: Traffic hit rate (in % with two decimal digits)
`statusCode`: Status code. The aggregate data for 2xx, 3xx, 4xx, and 5xx status codes will be returned (in entries)
`2xx`: Returns the aggregate list of 2xx status codes and the data for status codes starting with 2 (in entries)
`3xx`: Returns the aggregate list of 3xx status codes and the data for status codes starting with 3 (in entries)
`4xx`: Returns the aggregate list of 4xx status codes and the data for status codes starting with 4 (in entries)
`5xx`: Returns the aggregate list of 5xx status codes and the data for status codes starting with 5 (in entries)
Specifies the status code to query. The return will be empty if the status code has never been generated.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Specifies the list of domain names to be queried
You can specify one or more domain names.
Up to 30 domain names can be queried in one request.
If this parameter is not specified, it means to query all domain names under the current account. 
     * @return Domains Specifies the list of domain names to be queried
You can specify one or more domain names.
Up to 30 domain names can be queried in one request.
If this parameter is not specified, it means to query all domain names under the current account.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to be queried
You can specify one or more domain names.
Up to 30 domain names can be queried in one request.
If this parameter is not specified, it means to query all domain names under the current account.
     * @param Domains Specifies the list of domain names to be queried
You can specify one or more domain names.
Up to 30 domain names can be queried in one request.
If this parameter is not specified, it means to query all domain names under the current account.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
Note that `Project` will be ignored if `Domains` is specified. 
     * @return Project Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
Note that `Project` will be ignored if `Domains` is specified.
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
Note that `Project` will be ignored if `Domains` is specified.
     * @param Project Specifies the project ID to be queried. [Check project ID in the console](https://console.cloud.tencent.com/project)
Note that `Project` will be ignored if `Domains` is specified.
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get Sampling interval. The available options vary for different query period. See below: 
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days. 
     * @return Interval Sampling interval. The available options vary for different query period. See below: 
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling interval. The available options vary for different query period. See below: 
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     * @param Interval Sampling interval. The available options vary for different query period. See below: 
`min`: Return data with 1-minute granularity. It’s available when the query period is  within 24 hours and `Area` is `mainland`.
`5min`: Return data with 5-minute granularity. It’s available when the query period is within 31 days.
`hour`: Return data with 1-hour granularity. It’s available when the query period is within 31 days.
`day`: Return data with 1-day granularity. It’s available when the query period is longer than 31 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get The aggregate data for multiple domain names is returned by default (false) during a multi-domain-name query.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported). 
     * @return Detail The aggregate data for multiple domain names is returned by default (false) during a multi-domain-name query.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported).
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set The aggregate data for multiple domain names is returned by default (false) during a multi-domain-name query.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported).
     * @param Detail The aggregate data for multiple domain names is returned by default (false) during a multi-domain-name query.
You can set it to true to return the details for each Domain (the statusCode metric is currently not supported).
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Specifies an ISP when you query the CDN data within the Chinese mainland. If this is left blank, all ISPs will be queried.
To view ISP codes, see [ISP Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8)
Note that only one of `District`, `Isp` and `IpProtocol` can be specified. 
     * @return Isp Specifies an ISP when you query the CDN data within the Chinese mainland. If this is left blank, all ISPs will be queried.
To view ISP codes, see [ISP Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8)
Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set Specifies an ISP when you query the CDN data within the Chinese mainland. If this is left blank, all ISPs will be queried.
To view ISP codes, see [ISP Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8)
Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     * @param Isp Specifies an ISP when you query the CDN data within the Chinese mainland. If this is left blank, all ISPs will be queried.
To view ISP codes, see [ISP Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8)
Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get Specifies a province when you query the CDN data within the Chinese mainland. If this is left blank, all provinces will be queried.
Specifies a country/region when you query the CDN data outside the Chinese mainland. If this is left blank, all countries/regions will be queried.
To view codes of provinces or countries/regions, see [Province Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8).
When `Area` is `mainland`, you can query by the province. Note that only one of `District`, `Isp` and `IpProtocol` can be specified. 
     * @return District Specifies a province when you query the CDN data within the Chinese mainland. If this is left blank, all provinces will be queried.
Specifies a country/region when you query the CDN data outside the Chinese mainland. If this is left blank, all countries/regions will be queried.
To view codes of provinces or countries/regions, see [Province Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8).
When `Area` is `mainland`, you can query by the province. Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     */
    public Long getDistrict() {
        return this.District;
    }

    /**
     * Set Specifies a province when you query the CDN data within the Chinese mainland. If this is left blank, all provinces will be queried.
Specifies a country/region when you query the CDN data outside the Chinese mainland. If this is left blank, all countries/regions will be queried.
To view codes of provinces or countries/regions, see [Province Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8).
When `Area` is `mainland`, you can query by the province. Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     * @param District Specifies a province when you query the CDN data within the Chinese mainland. If this is left blank, all provinces will be queried.
Specifies a country/region when you query the CDN data outside the Chinese mainland. If this is left blank, all countries/regions will be queried.
To view codes of provinces or countries/regions, see [Province Code Mappings](https://intl.cloud.tencent.com/document/product/228/6316?from_cn_redirect=1#.E5.8C.BA.E5.9F.9F-.2F-.E8.BF.90.E8.90.A5.E5.95.86.E6.98.A0.E5.B0.84.E8.A1.A8).
When `Area` is `mainland`, you can query by the province. Note that only one of `District`, `Isp` and `IpProtocol` can be specified.
     */
    public void setDistrict(Long District) {
        this.District = District;
    }

    /**
     * Get Specifies the protocol to be queried; if you leave it blank, all protocols will be queried.
`all`: All protocols
`http`: Query HTTP data
`https`: Query HTTPS data 
     * @return Protocol Specifies the protocol to be queried; if you leave it blank, all protocols will be queried.
`all`: All protocols
`http`: Query HTTP data
`https`: Query HTTPS data
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Specifies the protocol to be queried; if you leave it blank, all protocols will be queried.
`all`: All protocols
`http`: Query HTTP data
`https`: Query HTTPS data
     * @param Protocol Specifies the protocol to be queried; if you leave it blank, all protocols will be queried.
`all`: All protocols
`http`: Query HTTP data
`https`: Query HTTPS data
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Specifies the data source to be queried. It’s only open to beta users now.  
     * @return DataSource Specifies the data source to be queried. It’s only open to beta users now. 
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Specifies the data source to be queried. It’s only open to beta users now. 
     * @param DataSource Specifies the data source to be queried. It’s only open to beta users now. 
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get Specifies the IP protocol to be queried. If it’s not specified, data of all IP protocols are returned.
`all`: All protocols
`ipv4`: Query IPv4 data
`ipv6`: Query IPv6 data
If `IpProtocol` is specified, `District` parameter can not be specified at the same time.
Note: `ipv4` and `ipv6` are only available to beta users.  
     * @return IpProtocol Specifies the IP protocol to be queried. If it’s not specified, data of all IP protocols are returned.
`all`: All protocols
`ipv4`: Query IPv4 data
`ipv6`: Query IPv6 data
If `IpProtocol` is specified, `District` parameter can not be specified at the same time.
Note: `ipv4` and `ipv6` are only available to beta users. 
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Specifies the IP protocol to be queried. If it’s not specified, data of all IP protocols are returned.
`all`: All protocols
`ipv4`: Query IPv4 data
`ipv6`: Query IPv6 data
If `IpProtocol` is specified, `District` parameter can not be specified at the same time.
Note: `ipv4` and `ipv6` are only available to beta users. 
     * @param IpProtocol Specifies the IP protocol to be queried. If it’s not specified, data of all IP protocols are returned.
`all`: All protocols
`ipv4`: Query IPv4 data
`ipv6`: Query IPv6 data
If `IpProtocol` is specified, `District` parameter can not be specified at the same time.
Note: `ipv4` and `ipv6` are only available to beta users. 
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get Specifies the service area. If it’s not specified, CDN data of the Chinese mainland are returned.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland. 
     * @return Area Specifies the service area. If it’s not specified, CDN data of the Chinese mainland are returned.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies the service area. If it’s not specified, CDN data of the Chinese mainland are returned.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     * @param Area Specifies the service area. If it’s not specified, CDN data of the Chinese mainland are returned.
`mainland`: Query CDN data in the Chinese mainland.
`overseas`: Query CDN data outside the Chinese mainland.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specify whether to query by the region of the server or client. This parameter is valid only when `Area` is `overseas`.
`server`: Query by the location of server (Tencent Cloud CDN nodes)
`client`: Query by the location of the client (where the request devices are located) 
     * @return AreaType Specify whether to query by the region of the server or client. This parameter is valid only when `Area` is `overseas`.
`server`: Query by the location of server (Tencent Cloud CDN nodes)
`client`: Query by the location of the client (where the request devices are located)
     */
    public String getAreaType() {
        return this.AreaType;
    }

    /**
     * Set Specify whether to query by the region of the server or client. This parameter is valid only when `Area` is `overseas`.
`server`: Query by the location of server (Tencent Cloud CDN nodes)
`client`: Query by the location of the client (where the request devices are located)
     * @param AreaType Specify whether to query by the region of the server or client. This parameter is valid only when `Area` is `overseas`.
`server`: Query by the location of server (Tencent Cloud CDN nodes)
`client`: Query by the location of the client (where the request devices are located)
     */
    public void setAreaType(String AreaType) {
        this.AreaType = AreaType;
    }

    /**
     * Get Specifies the product to query, either `cdn` (default) or `ecdn`. 
     * @return Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Specifies the product to query, either `cdn` (default) or `ecdn`.
     * @param Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Specifies a time zone to query. The default time zone is UTC+08:00. 
     * @return TimeZone Specifies a time zone to query. The default time zone is UTC+08:00.
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set Specifies a time zone to query. The default time zone is UTC+08:00.
     * @param TimeZone Specifies a time zone to query. The default time zone is UTC+08:00.
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public DescribeCdnDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnDataRequest(DescribeCdnDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new Long(source.Project);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Detail != null) {
            this.Detail = new Boolean(source.Detail);
        }
        if (source.Isp != null) {
            this.Isp = new Long(source.Isp);
        }
        if (source.District != null) {
            this.District = new Long(source.District);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.AreaType != null) {
            this.AreaType = new String(source.AreaType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AreaType", this.AreaType);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

