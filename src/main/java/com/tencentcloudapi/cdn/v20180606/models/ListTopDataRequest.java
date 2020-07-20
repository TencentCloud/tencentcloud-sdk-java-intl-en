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

public class ListTopDataRequest extends AbstractModel{

    /**
    * Query start time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the start date.
Data generated after or at 00:00:00 on the start date will be returned
Only data for the last 90 days can be queried
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the end date.
Data generated before or at 23:59:59 on the end date will be returned
`EndTime` must be later than or equal to `StartTime`
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Object representing the sort criteria. The following objects are supported:
url: sorts by access URL (including the query string). Supported filters are `flux` and `request`
path: sorts by access URL (excluding the query string). Supported filters are `flux` and `request` (whitelist-based feature)
district: sorts by district. Supported filters are `flux` and `request`
isp: sorts by ISP. Supported filters are `flux` and `request`
host: sorts by domain name access data. Supported filters are `flux`, `request`, `bandwidth`, `fluxHitRate`, 2XX, 3XX, 4XX, 5XX, and `statusCode`
originHost: sorts by domain name origin-pull data. Supported filters are `flux`, `request`, `bandwidth`, `origin_2XX`, `origin_3XX`, `origin_4XX`, `origin_5XX`, and `OriginStatusCode`
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Metric name used for sorting:
flux: If Metric is `host`, it indicates the access traffic; if Metric is `originHost`, it indicates the origin-pull traffic.
bandwidth: If Metric is `host`, it indicates the access bandwidth; if Metric is `originHost`, it indicates the origin-pull bandwidth.
request: If Metric is `host`, it indicates the number of access requests; if Metric is `originHost`, it indicates the number of origin-pull requests.
fluxHitRate: Average traffic hit rate
2XX: access 2XX status code
3XX: access 3XX status code
4XX: access 4XX status code
5XX: access 5XX status code
origin_2XX: origin-pull 2XX status code
origin_3XX: origin-pull 3XX status code
origin_4XX: origin-pull 4XX status code
origin_5XX: origin-pull 5XX status code
statusCode: statistics of a specific access status code which is specified in the `Code` parameter.
OriginStatusCode: statistics of a specific origin-pull status code which is specified in the `Code` parameter.
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
    */
    @SerializedName("Project")
    @Expose
    private Long Project;

    /**
    * Default is `false` for multi–domain name queries, which returns sorted results of all domain names. 
If `Metric` is `url`, `path`, `district`, or `isp` and `Filter` is `flux` or `request`, it can be set to `true` to return the sorted results of each domain.
    */
    @SerializedName("Detail")
    @Expose
    private Boolean Detail;

    /**
    * When Filter is `statusCode` or `OriginStatusCode`, enter a code to query and sort results.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Specifies a service region for the query. If it is left blank, CDN data within Mainland China will be queried.
`mainland`: specifies to query CDN data within Mainland China;
`overseas`: specifies to query CDN data outside Mainland China. Supported metrics are `url`, `district`, `host`, and `originHost`. If `Metric` is `originHost`, supported filters are `flux`, `request`, and `bandwidth`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * The region type can be specified only when you query CDN data outside Mainland China and `Metric` is `district` or `host`; if you leave it empty, data of the service region will be queried (only applicable when `Area` is `overseas` and `Metric` is `district` or `host`)
server: specifies to query data of service region (where a CDN node is located)
client: specifies to query data of the client region (where a user request device is located). If `Metric` is `host`, `Filter` can only be `flux`, `request`, or `bandwidth`
    */
    @SerializedName("AreaType")
    @Expose
    private String AreaType;

    /**
     * Get Query start time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the start date.
Data generated after or at 00:00:00 on the start date will be returned
Only data for the last 90 days can be queried 
     * @return StartTime Query start time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the start date.
Data generated after or at 00:00:00 on the start date will be returned
Only data for the last 90 days can be queried
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the start date.
Data generated after or at 00:00:00 on the start date will be returned
Only data for the last 90 days can be queried
     * @param StartTime Query start time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the start date.
Data generated after or at 00:00:00 on the start date will be returned
Only data for the last 90 days can be queried
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the end date.
Data generated before or at 23:59:59 on the end date will be returned
`EndTime` must be later than or equal to `StartTime` 
     * @return EndTime Query end time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the end date.
Data generated before or at 23:59:59 on the end date will be returned
`EndTime` must be later than or equal to `StartTime`
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the end date.
Data generated before or at 23:59:59 on the end date will be returned
`EndTime` must be later than or equal to `StartTime`
     * @param EndTime Query end time in the format of `yyyy-MM-dd HH:mm:ss`
Only supports data query at daily granularity. The date in the input parameter is used as the end date.
Data generated before or at 23:59:59 on the end date will be returned
`EndTime` must be later than or equal to `StartTime`
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Object representing the sort criteria. The following objects are supported:
url: sorts by access URL (including the query string). Supported filters are `flux` and `request`
path: sorts by access URL (excluding the query string). Supported filters are `flux` and `request` (whitelist-based feature)
district: sorts by district. Supported filters are `flux` and `request`
isp: sorts by ISP. Supported filters are `flux` and `request`
host: sorts by domain name access data. Supported filters are `flux`, `request`, `bandwidth`, `fluxHitRate`, 2XX, 3XX, 4XX, 5XX, and `statusCode`
originHost: sorts by domain name origin-pull data. Supported filters are `flux`, `request`, `bandwidth`, `origin_2XX`, `origin_3XX`, `origin_4XX`, `origin_5XX`, and `OriginStatusCode` 
     * @return Metric Object representing the sort criteria. The following objects are supported:
url: sorts by access URL (including the query string). Supported filters are `flux` and `request`
path: sorts by access URL (excluding the query string). Supported filters are `flux` and `request` (whitelist-based feature)
district: sorts by district. Supported filters are `flux` and `request`
isp: sorts by ISP. Supported filters are `flux` and `request`
host: sorts by domain name access data. Supported filters are `flux`, `request`, `bandwidth`, `fluxHitRate`, 2XX, 3XX, 4XX, 5XX, and `statusCode`
originHost: sorts by domain name origin-pull data. Supported filters are `flux`, `request`, `bandwidth`, `origin_2XX`, `origin_3XX`, `origin_4XX`, `origin_5XX`, and `OriginStatusCode`
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Object representing the sort criteria. The following objects are supported:
url: sorts by access URL (including the query string). Supported filters are `flux` and `request`
path: sorts by access URL (excluding the query string). Supported filters are `flux` and `request` (whitelist-based feature)
district: sorts by district. Supported filters are `flux` and `request`
isp: sorts by ISP. Supported filters are `flux` and `request`
host: sorts by domain name access data. Supported filters are `flux`, `request`, `bandwidth`, `fluxHitRate`, 2XX, 3XX, 4XX, 5XX, and `statusCode`
originHost: sorts by domain name origin-pull data. Supported filters are `flux`, `request`, `bandwidth`, `origin_2XX`, `origin_3XX`, `origin_4XX`, `origin_5XX`, and `OriginStatusCode`
     * @param Metric Object representing the sort criteria. The following objects are supported:
url: sorts by access URL (including the query string). Supported filters are `flux` and `request`
path: sorts by access URL (excluding the query string). Supported filters are `flux` and `request` (whitelist-based feature)
district: sorts by district. Supported filters are `flux` and `request`
isp: sorts by ISP. Supported filters are `flux` and `request`
host: sorts by domain name access data. Supported filters are `flux`, `request`, `bandwidth`, `fluxHitRate`, 2XX, 3XX, 4XX, 5XX, and `statusCode`
originHost: sorts by domain name origin-pull data. Supported filters are `flux`, `request`, `bandwidth`, `origin_2XX`, `origin_3XX`, `origin_4XX`, `origin_5XX`, and `OriginStatusCode`
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Metric name used for sorting:
flux: If Metric is `host`, it indicates the access traffic; if Metric is `originHost`, it indicates the origin-pull traffic.
bandwidth: If Metric is `host`, it indicates the access bandwidth; if Metric is `originHost`, it indicates the origin-pull bandwidth.
request: If Metric is `host`, it indicates the number of access requests; if Metric is `originHost`, it indicates the number of origin-pull requests.
fluxHitRate: Average traffic hit rate
2XX: access 2XX status code
3XX: access 3XX status code
4XX: access 4XX status code
5XX: access 5XX status code
origin_2XX: origin-pull 2XX status code
origin_3XX: origin-pull 3XX status code
origin_4XX: origin-pull 4XX status code
origin_5XX: origin-pull 5XX status code
statusCode: statistics of a specific access status code which is specified in the `Code` parameter.
OriginStatusCode: statistics of a specific origin-pull status code which is specified in the `Code` parameter. 
     * @return Filter Metric name used for sorting:
flux: If Metric is `host`, it indicates the access traffic; if Metric is `originHost`, it indicates the origin-pull traffic.
bandwidth: If Metric is `host`, it indicates the access bandwidth; if Metric is `originHost`, it indicates the origin-pull bandwidth.
request: If Metric is `host`, it indicates the number of access requests; if Metric is `originHost`, it indicates the number of origin-pull requests.
fluxHitRate: Average traffic hit rate
2XX: access 2XX status code
3XX: access 3XX status code
4XX: access 4XX status code
5XX: access 5XX status code
origin_2XX: origin-pull 2XX status code
origin_3XX: origin-pull 3XX status code
origin_4XX: origin-pull 4XX status code
origin_5XX: origin-pull 5XX status code
statusCode: statistics of a specific access status code which is specified in the `Code` parameter.
OriginStatusCode: statistics of a specific origin-pull status code which is specified in the `Code` parameter.
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set Metric name used for sorting:
flux: If Metric is `host`, it indicates the access traffic; if Metric is `originHost`, it indicates the origin-pull traffic.
bandwidth: If Metric is `host`, it indicates the access bandwidth; if Metric is `originHost`, it indicates the origin-pull bandwidth.
request: If Metric is `host`, it indicates the number of access requests; if Metric is `originHost`, it indicates the number of origin-pull requests.
fluxHitRate: Average traffic hit rate
2XX: access 2XX status code
3XX: access 3XX status code
4XX: access 4XX status code
5XX: access 5XX status code
origin_2XX: origin-pull 2XX status code
origin_3XX: origin-pull 3XX status code
origin_4XX: origin-pull 4XX status code
origin_5XX: origin-pull 5XX status code
statusCode: statistics of a specific access status code which is specified in the `Code` parameter.
OriginStatusCode: statistics of a specific origin-pull status code which is specified in the `Code` parameter.
     * @param Filter Metric name used for sorting:
flux: If Metric is `host`, it indicates the access traffic; if Metric is `originHost`, it indicates the origin-pull traffic.
bandwidth: If Metric is `host`, it indicates the access bandwidth; if Metric is `originHost`, it indicates the origin-pull bandwidth.
request: If Metric is `host`, it indicates the number of access requests; if Metric is `originHost`, it indicates the number of origin-pull requests.
fluxHitRate: Average traffic hit rate
2XX: access 2XX status code
3XX: access 3XX status code
4XX: access 4XX status code
5XX: access 5XX status code
origin_2XX: origin-pull 2XX status code
origin_3XX: origin-pull 3XX status code
origin_4XX: origin-pull 4XX status code
origin_5XX: origin-pull 5XX status code
statusCode: statistics of a specific access status code which is specified in the `Code` parameter.
OriginStatusCode: statistics of a specific origin-pull status code which is specified in the `Code` parameter.
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time. 
     * @return Domains Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     * @param Domains Specifies the list of domain names to be queried; up to 30 domain names can be queried at a time.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored. 
     * @return Project Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     */
    public Long getProject() {
        return this.Project;
    }

    /**
     * Set Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     * @param Project Specifies the project ID to be queried, which can be viewed [here](https://console.cloud.tencent.com/project)
Please note that if domain names are specified, this parameter will be ignored.
     */
    public void setProject(Long Project) {
        this.Project = Project;
    }

    /**
     * Get Default is `false` for multi–domain name queries, which returns sorted results of all domain names. 
If `Metric` is `url`, `path`, `district`, or `isp` and `Filter` is `flux` or `request`, it can be set to `true` to return the sorted results of each domain. 
     * @return Detail Default is `false` for multi–domain name queries, which returns sorted results of all domain names. 
If `Metric` is `url`, `path`, `district`, or `isp` and `Filter` is `flux` or `request`, it can be set to `true` to return the sorted results of each domain.
     */
    public Boolean getDetail() {
        return this.Detail;
    }

    /**
     * Set Default is `false` for multi–domain name queries, which returns sorted results of all domain names. 
If `Metric` is `url`, `path`, `district`, or `isp` and `Filter` is `flux` or `request`, it can be set to `true` to return the sorted results of each domain.
     * @param Detail Default is `false` for multi–domain name queries, which returns sorted results of all domain names. 
If `Metric` is `url`, `path`, `district`, or `isp` and `Filter` is `flux` or `request`, it can be set to `true` to return the sorted results of each domain.
     */
    public void setDetail(Boolean Detail) {
        this.Detail = Detail;
    }

    /**
     * Get When Filter is `statusCode` or `OriginStatusCode`, enter a code to query and sort results. 
     * @return Code When Filter is `statusCode` or `OriginStatusCode`, enter a code to query and sort results.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set When Filter is `statusCode` or `OriginStatusCode`, enter a code to query and sort results.
     * @param Code When Filter is `statusCode` or `OriginStatusCode`, enter a code to query and sort results.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Specifies a service region for the query. If it is left blank, CDN data within Mainland China will be queried.
`mainland`: specifies to query CDN data within Mainland China;
`overseas`: specifies to query CDN data outside Mainland China. Supported metrics are `url`, `district`, `host`, and `originHost`. If `Metric` is `originHost`, supported filters are `flux`, `request`, and `bandwidth`. 
     * @return Area Specifies a service region for the query. If it is left blank, CDN data within Mainland China will be queried.
`mainland`: specifies to query CDN data within Mainland China;
`overseas`: specifies to query CDN data outside Mainland China. Supported metrics are `url`, `district`, `host`, and `originHost`. If `Metric` is `originHost`, supported filters are `flux`, `request`, and `bandwidth`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies a service region for the query. If it is left blank, CDN data within Mainland China will be queried.
`mainland`: specifies to query CDN data within Mainland China;
`overseas`: specifies to query CDN data outside Mainland China. Supported metrics are `url`, `district`, `host`, and `originHost`. If `Metric` is `originHost`, supported filters are `flux`, `request`, and `bandwidth`.
     * @param Area Specifies a service region for the query. If it is left blank, CDN data within Mainland China will be queried.
`mainland`: specifies to query CDN data within Mainland China;
`overseas`: specifies to query CDN data outside Mainland China. Supported metrics are `url`, `district`, `host`, and `originHost`. If `Metric` is `originHost`, supported filters are `flux`, `request`, and `bandwidth`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get The region type can be specified only when you query CDN data outside Mainland China and `Metric` is `district` or `host`; if you leave it empty, data of the service region will be queried (only applicable when `Area` is `overseas` and `Metric` is `district` or `host`)
server: specifies to query data of service region (where a CDN node is located)
client: specifies to query data of the client region (where a user request device is located). If `Metric` is `host`, `Filter` can only be `flux`, `request`, or `bandwidth` 
     * @return AreaType The region type can be specified only when you query CDN data outside Mainland China and `Metric` is `district` or `host`; if you leave it empty, data of the service region will be queried (only applicable when `Area` is `overseas` and `Metric` is `district` or `host`)
server: specifies to query data of service region (where a CDN node is located)
client: specifies to query data of the client region (where a user request device is located). If `Metric` is `host`, `Filter` can only be `flux`, `request`, or `bandwidth`
     */
    public String getAreaType() {
        return this.AreaType;
    }

    /**
     * Set The region type can be specified only when you query CDN data outside Mainland China and `Metric` is `district` or `host`; if you leave it empty, data of the service region will be queried (only applicable when `Area` is `overseas` and `Metric` is `district` or `host`)
server: specifies to query data of service region (where a CDN node is located)
client: specifies to query data of the client region (where a user request device is located). If `Metric` is `host`, `Filter` can only be `flux`, `request`, or `bandwidth`
     * @param AreaType The region type can be specified only when you query CDN data outside Mainland China and `Metric` is `district` or `host`; if you leave it empty, data of the service region will be queried (only applicable when `Area` is `overseas` and `Metric` is `district` or `host`)
server: specifies to query data of service region (where a CDN node is located)
client: specifies to query data of the client region (where a user request device is located). If `Metric` is `host`, `Filter` can only be `flux`, `request`, or `bandwidth`
     */
    public void setAreaType(String AreaType) {
        this.AreaType = AreaType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Project", this.Project);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "AreaType", this.AreaType);

    }
}

