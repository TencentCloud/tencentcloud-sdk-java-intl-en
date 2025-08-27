/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic aggregated by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic aggregated by the dimension of provinces in chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic aggregated by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic aggregated by the domain name dimension;</li>
<li>l7Flow_outFlux_url: L7 EdgeOne response traffic aggregated by url path dimension.</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic aggregated by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic aggregated by the client IP dimension;</li>
<li>l7Flow_outFlux_referers: L7 EdgeOne response traffic aggregated by referer dimension.</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic aggregated by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic aggregated by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic aggregated by the operating system type dimension;</li>
<li> l7Flow_outFlux_ua: L7 EdgeOne response traffic aggregated by the User-Agent dimension;</li>
<li> l7Flow_request_country: L7 request count aggregated by the country/region dimension;</li>
<li> l7Flow_request_province: L7 request count aggregated by the dimension of provinces in the chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 request count aggregated by the status code dimension;</li>
<li> l7Flow_request_domain: L7 request count aggregated by the domain name dimension;</li>
<li>l7Flow_request_url: L7 request count aggregated by url Path dimension.</li>
<li> l7Flow_request_resourceType: L7 request count aggregated by resource type dimension;</li>
<li> l7Flow_request_sip: L7 request count aggregated by the client IP dimension;</li>
<li>l7Flow_request_referer: L7 request count aggregated by referer dimension.</li>
<li> l7Flow_request_ua_device: L7 request count aggregated by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 request count aggregated by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 request count aggregated by the operating system type dimension.</li>
<li> l7Flow_request_ua: L7 request count aggregated by the User-Agent dimension.</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Site ID list. This parameter is required. A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
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
    * Filtering conditions used when querying data. Refer to the [Filtering Conditions for Analytics](https://www.tencentcloud.com/document/product/1145/56985) document for the available filters applicable to L7 client traffic, bandwidth and requests.  
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Query time granularity. This parameter is deprecated.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Data region. This parameter is deprecated. Please filter data by client region in `Filters.country`.
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
     * Get End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days. 
     * @return EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     * @param EndTime End time. The query time range (`EndTime` - `StartTime`) must be less than or equal to 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic aggregated by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic aggregated by the dimension of provinces in chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic aggregated by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic aggregated by the domain name dimension;</li>
<li>l7Flow_outFlux_url: L7 EdgeOne response traffic aggregated by url path dimension.</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic aggregated by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic aggregated by the client IP dimension;</li>
<li>l7Flow_outFlux_referers: L7 EdgeOne response traffic aggregated by referer dimension.</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic aggregated by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic aggregated by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic aggregated by the operating system type dimension;</li>
<li> l7Flow_outFlux_ua: L7 EdgeOne response traffic aggregated by the User-Agent dimension;</li>
<li> l7Flow_request_country: L7 request count aggregated by the country/region dimension;</li>
<li> l7Flow_request_province: L7 request count aggregated by the dimension of provinces in the chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 request count aggregated by the status code dimension;</li>
<li> l7Flow_request_domain: L7 request count aggregated by the domain name dimension;</li>
<li>l7Flow_request_url: L7 request count aggregated by url Path dimension.</li>
<li> l7Flow_request_resourceType: L7 request count aggregated by resource type dimension;</li>
<li> l7Flow_request_sip: L7 request count aggregated by the client IP dimension;</li>
<li>l7Flow_request_referer: L7 request count aggregated by referer dimension.</li>
<li> l7Flow_request_ua_device: L7 request count aggregated by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 request count aggregated by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 request count aggregated by the operating system type dimension.</li>
<li> l7Flow_request_ua: L7 request count aggregated by the User-Agent dimension.</li> 
     * @return MetricName Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic aggregated by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic aggregated by the dimension of provinces in chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic aggregated by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic aggregated by the domain name dimension;</li>
<li>l7Flow_outFlux_url: L7 EdgeOne response traffic aggregated by url path dimension.</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic aggregated by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic aggregated by the client IP dimension;</li>
<li>l7Flow_outFlux_referers: L7 EdgeOne response traffic aggregated by referer dimension.</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic aggregated by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic aggregated by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic aggregated by the operating system type dimension;</li>
<li> l7Flow_outFlux_ua: L7 EdgeOne response traffic aggregated by the User-Agent dimension;</li>
<li> l7Flow_request_country: L7 request count aggregated by the country/region dimension;</li>
<li> l7Flow_request_province: L7 request count aggregated by the dimension of provinces in the chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 request count aggregated by the status code dimension;</li>
<li> l7Flow_request_domain: L7 request count aggregated by the domain name dimension;</li>
<li>l7Flow_request_url: L7 request count aggregated by url Path dimension.</li>
<li> l7Flow_request_resourceType: L7 request count aggregated by resource type dimension;</li>
<li> l7Flow_request_sip: L7 request count aggregated by the client IP dimension;</li>
<li>l7Flow_request_referer: L7 request count aggregated by referer dimension.</li>
<li> l7Flow_request_ua_device: L7 request count aggregated by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 request count aggregated by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 request count aggregated by the operating system type dimension.</li>
<li> l7Flow_request_ua: L7 request count aggregated by the User-Agent dimension.</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic aggregated by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic aggregated by the dimension of provinces in chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic aggregated by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic aggregated by the domain name dimension;</li>
<li>l7Flow_outFlux_url: L7 EdgeOne response traffic aggregated by url path dimension.</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic aggregated by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic aggregated by the client IP dimension;</li>
<li>l7Flow_outFlux_referers: L7 EdgeOne response traffic aggregated by referer dimension.</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic aggregated by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic aggregated by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic aggregated by the operating system type dimension;</li>
<li> l7Flow_outFlux_ua: L7 EdgeOne response traffic aggregated by the User-Agent dimension;</li>
<li> l7Flow_request_country: L7 request count aggregated by the country/region dimension;</li>
<li> l7Flow_request_province: L7 request count aggregated by the dimension of provinces in the chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 request count aggregated by the status code dimension;</li>
<li> l7Flow_request_domain: L7 request count aggregated by the domain name dimension;</li>
<li>l7Flow_request_url: L7 request count aggregated by url Path dimension.</li>
<li> l7Flow_request_resourceType: L7 request count aggregated by resource type dimension;</li>
<li> l7Flow_request_sip: L7 request count aggregated by the client IP dimension;</li>
<li>l7Flow_request_referer: L7 request count aggregated by referer dimension.</li>
<li> l7Flow_request_ua_device: L7 request count aggregated by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 request count aggregated by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 request count aggregated by the operating system type dimension.</li>
<li> l7Flow_request_ua: L7 request count aggregated by the User-Agent dimension.</li>
     * @param MetricName Queried metric. Valid values:
<li> l7Flow_outFlux_country: L7 EdgeOne response traffic aggregated by the country/region dimension;</li>
<li> l7Flow_outFlux_province: L7 EdgeOne response traffic aggregated by the dimension of provinces in chinese mainland;</li>
<li> l7Flow_outFlux_statusCode: L7 EdgeOne response traffic aggregated by the status code dimension;</li>
<li> l7Flow_outFlux_domain: L7 EdgeOne response traffic aggregated by the domain name dimension;</li>
<li>l7Flow_outFlux_url: L7 EdgeOne response traffic aggregated by url path dimension.</li>
<li> l7Flow_outFlux_resourceType: L7 EdgeOne response traffic aggregated by the resource type dimension;</li>
<li> l7Flow_outFlux_sip: L7 EdgeOne response traffic aggregated by the client IP dimension;</li>
<li>l7Flow_outFlux_referers: L7 EdgeOne response traffic aggregated by referer dimension.</li>
<li> l7Flow_outFlux_ua_device: L7 EdgeOne response traffic aggregated by the device type dimension;</li>
<li> l7Flow_outFlux_ua_browser: L7 EdgeOne response traffic aggregated by the browser type dimension;</li>
<li> l7Flow_outFlux_ua_os: L7 EdgeOne response traffic aggregated by the operating system type dimension;</li>
<li> l7Flow_outFlux_ua: L7 EdgeOne response traffic aggregated by the User-Agent dimension;</li>
<li> l7Flow_request_country: L7 request count aggregated by the country/region dimension;</li>
<li> l7Flow_request_province: L7 request count aggregated by the dimension of provinces in the chinese mainland;</li>
<li> l7Flow_request_statusCode: L7 request count aggregated by the status code dimension;</li>
<li> l7Flow_request_domain: L7 request count aggregated by the domain name dimension;</li>
<li>l7Flow_request_url: L7 request count aggregated by url Path dimension.</li>
<li> l7Flow_request_resourceType: L7 request count aggregated by resource type dimension;</li>
<li> l7Flow_request_sip: L7 request count aggregated by the client IP dimension;</li>
<li>l7Flow_request_referer: L7 request count aggregated by referer dimension.</li>
<li> l7Flow_request_ua_device: L7 request count aggregated by the device type dimension;</li>
<li> l7Flow_request_ua_browser: L7 request count aggregated by the browser type dimension;</li>
<li> l7Flow_request_ua_os: L7 request count aggregated by the operating system type dimension.</li>
<li> l7Flow_request_ua: L7 request count aggregated by the User-Agent dimension.</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Site ID list. This parameter is required. A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API. 
     * @return ZoneIds Site ID list. This parameter is required. A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID list. This parameter is required. A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
     * @param ZoneIds Site ID list. This parameter is required. A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
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
     * Get Filtering conditions used when querying data. Refer to the [Filtering Conditions for Analytics](https://www.tencentcloud.com/document/product/1145/56985) document for the available filters applicable to L7 client traffic, bandwidth and requests.   
     * @return Filters Filtering conditions used when querying data. Refer to the [Filtering Conditions for Analytics](https://www.tencentcloud.com/document/product/1145/56985) document for the available filters applicable to L7 client traffic, bandwidth and requests.  
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering conditions used when querying data. Refer to the [Filtering Conditions for Analytics](https://www.tencentcloud.com/document/product/1145/56985) document for the available filters applicable to L7 client traffic, bandwidth and requests.  
     * @param Filters Filtering conditions used when querying data. Refer to the [Filtering Conditions for Analytics](https://www.tencentcloud.com/document/product/1145/56985) document for the available filters applicable to L7 client traffic, bandwidth and requests.  
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query time granularity. This parameter is deprecated. 
     * @return Interval Query time granularity. This parameter is deprecated.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Query time granularity. This parameter is deprecated.
     * @param Interval Query time granularity. This parameter is deprecated.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Data region. This parameter is deprecated. Please filter data by client region in `Filters.country`. 
     * @return Area Data region. This parameter is deprecated. Please filter data by client region in `Filters.country`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data region. This parameter is deprecated. Please filter data by client region in `Filters.country`.
     * @param Area Data region. This parameter is deprecated. Please filter data by client region in `Filters.country`.
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

