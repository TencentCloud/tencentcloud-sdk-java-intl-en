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

public class DescribeTimingL7AnalysisDataRequest extends AbstractModel {

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
    * Metric list. Valid values:
<Li>l7Flow_outFlux: L7 EdgeOne response traffic. Unit: byte;</li><Li>l7Flow_inFlux: L7 client request traffic. Unit: byte;</li><Li>l7Flow_flux: L7 total traffic (including EdgeOne response traffic and client request traffic). Unit: byte;</li><Li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Unit: bps;</li><Li>l7Flow_inBandwidth: L7 client request bandwidth. Unit: bps;</li><Li>l7Flow_bandwidth: L7 total bandwidth (including EdgeOne response bandwidth and client request bandwidth). Unit: bps;</li><Li>l7Flow_request: L7 request count. Unit: times;</li><Li>l7Flow_avgResponseTime: Average L7 edge response time. Unit: ms (milliseconds);</li><Li>l7Flow_avgFirstByteResponseTime: Average L7 edge first byte response time. Unit: ms.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID list. The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980). A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

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
    * Filter criteria used when filtering data. valid values refer to the available filter options for L7 access traffic, bandwidth, and request count in the [metric analysis filtering condition description](https://www.tencentcloud.comom/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945).
If needed, limit the site or content identifier by importing the corresponding value in the `ZoneIds.N` parameter.
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Data ownership region. this parameter is deprecated. please filter data by client region in `Filters.country`.
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
     * Get Metric list. Valid values:
<Li>l7Flow_outFlux: L7 EdgeOne response traffic. Unit: byte;</li><Li>l7Flow_inFlux: L7 client request traffic. Unit: byte;</li><Li>l7Flow_flux: L7 total traffic (including EdgeOne response traffic and client request traffic). Unit: byte;</li><Li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Unit: bps;</li><Li>l7Flow_inBandwidth: L7 client request bandwidth. Unit: bps;</li><Li>l7Flow_bandwidth: L7 total bandwidth (including EdgeOne response bandwidth and client request bandwidth). Unit: bps;</li><Li>l7Flow_request: L7 request count. Unit: times;</li><Li>l7Flow_avgResponseTime: Average L7 edge response time. Unit: ms (milliseconds);</li><Li>l7Flow_avgFirstByteResponseTime: Average L7 edge first byte response time. Unit: ms.</li> 
     * @return MetricNames Metric list. Valid values:
<Li>l7Flow_outFlux: L7 EdgeOne response traffic. Unit: byte;</li><Li>l7Flow_inFlux: L7 client request traffic. Unit: byte;</li><Li>l7Flow_flux: L7 total traffic (including EdgeOne response traffic and client request traffic). Unit: byte;</li><Li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Unit: bps;</li><Li>l7Flow_inBandwidth: L7 client request bandwidth. Unit: bps;</li><Li>l7Flow_bandwidth: L7 total bandwidth (including EdgeOne response bandwidth and client request bandwidth). Unit: bps;</li><Li>l7Flow_request: L7 request count. Unit: times;</li><Li>l7Flow_avgResponseTime: Average L7 edge response time. Unit: ms (milliseconds);</li><Li>l7Flow_avgFirstByteResponseTime: Average L7 edge first byte response time. Unit: ms.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric list. Valid values:
<Li>l7Flow_outFlux: L7 EdgeOne response traffic. Unit: byte;</li><Li>l7Flow_inFlux: L7 client request traffic. Unit: byte;</li><Li>l7Flow_flux: L7 total traffic (including EdgeOne response traffic and client request traffic). Unit: byte;</li><Li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Unit: bps;</li><Li>l7Flow_inBandwidth: L7 client request bandwidth. Unit: bps;</li><Li>l7Flow_bandwidth: L7 total bandwidth (including EdgeOne response bandwidth and client request bandwidth). Unit: bps;</li><Li>l7Flow_request: L7 request count. Unit: times;</li><Li>l7Flow_avgResponseTime: Average L7 edge response time. Unit: ms (milliseconds);</li><Li>l7Flow_avgFirstByteResponseTime: Average L7 edge first byte response time. Unit: ms.</li>
     * @param MetricNames Metric list. Valid values:
<Li>l7Flow_outFlux: L7 EdgeOne response traffic. Unit: byte;</li><Li>l7Flow_inFlux: L7 client request traffic. Unit: byte;</li><Li>l7Flow_flux: L7 total traffic (including EdgeOne response traffic and client request traffic). Unit: byte;</li><Li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Unit: bps;</li><Li>l7Flow_inBandwidth: L7 client request bandwidth. Unit: bps;</li><Li>l7Flow_bandwidth: L7 total bandwidth (including EdgeOne response bandwidth and client request bandwidth). Unit: bps;</li><Li>l7Flow_request: L7 request count. Unit: times;</li><Li>l7Flow_avgResponseTime: Average L7 edge response time. Unit: ms (milliseconds);</li><Li>l7Flow_avgFirstByteResponseTime: Average L7 edge first byte response time. Unit: ms.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID list. The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980). A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API. 
     * @return ZoneIds Site ID list. The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980). A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID list. The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980). A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
     * @param ZoneIds Site ID list. The parameter will change from optional to mandatory after May 30, 2024.Refer to [Cloud API Change Notification](https://www.tencentcloud.com/document/product/1145/59980). A maximum of 100 site IDs can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. To query account-level data, you must have resource permissions for all sites in this API.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
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
     * Get Filter criteria used when filtering data. valid values refer to the available filter options for L7 access traffic, bandwidth, and request count in the [metric analysis filtering condition description](https://www.tencentcloud.comom/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945).
If needed, limit the site or content identifier by importing the corresponding value in the `ZoneIds.N` parameter. 
     * @return Filters Filter criteria used when filtering data. valid values refer to the available filter options for L7 access traffic, bandwidth, and request count in the [metric analysis filtering condition description](https://www.tencentcloud.comom/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945).
If needed, limit the site or content identifier by importing the corresponding value in the `ZoneIds.N` parameter.
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria used when filtering data. valid values refer to the available filter options for L7 access traffic, bandwidth, and request count in the [metric analysis filtering condition description](https://www.tencentcloud.comom/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945).
If needed, limit the site or content identifier by importing the corresponding value in the `ZoneIds.N` parameter.
     * @param Filters Filter criteria used when filtering data. valid values refer to the available filter options for L7 access traffic, bandwidth, and request count in the [metric analysis filtering condition description](https://www.tencentcloud.comom/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945).
If needed, limit the site or content identifier by importing the corresponding value in the `ZoneIds.N` parameter.
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data ownership region. this parameter is deprecated. please filter data by client region in `Filters.country`. 
     * @return Area Data ownership region. this parameter is deprecated. please filter data by client region in `Filters.country`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership region. this parameter is deprecated. please filter data by client region in `Filters.country`.
     * @param Area Data ownership region. this parameter is deprecated. please filter data by client region in `Filters.country`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTimingL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataRequest(DescribeTimingL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.Filters != null) {
            this.Filters = new QueryCondition[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryCondition(source.Filters[i]);
            }
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
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

