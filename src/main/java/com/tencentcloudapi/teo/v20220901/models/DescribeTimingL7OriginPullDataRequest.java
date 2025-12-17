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

public class DescribeTimingL7OriginPullDataRequest extends AbstractModel {

    /**
    * Start time.
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
    * Metric list. Valid values:.
<li>l7Flow_outFlux_hy: specifies the request traffic from the EdgeOne node to the origin server. Unit: byte.</li>
<li>l7Flow_outBandwidth_hy: specifies the request bandwidth from EdgeOne node to origin server. Unit: bps.</li>
<li>l7Flow_request_hy: specifies the request count from EdgeOne node to origin server. Unit: times.</li>
<li>l7Flow_inFlux_hy: specifies the response traffic from the origin server to the EdgeOne node. Unit: byte.</li>
<li>l7Flow_inBandwidth_hy: specifies the response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li>

    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Time granularity of the query. Valid values:
<Li>min: 1 minute.</li><Li>5min: 5 minutes;</li><Li>hour: 1 hour;</li><li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter conditions. Details:
<li>domain: specifies the domain name in client requests. When the domain is onboarded via a wildcard, the recorded value is the wildcard domain itself, not the specific subdomain.</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
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
     * Get Metric list. Valid values:.
<li>l7Flow_outFlux_hy: specifies the request traffic from the EdgeOne node to the origin server. Unit: byte.</li>
<li>l7Flow_outBandwidth_hy: specifies the request bandwidth from EdgeOne node to origin server. Unit: bps.</li>
<li>l7Flow_request_hy: specifies the request count from EdgeOne node to origin server. Unit: times.</li>
<li>l7Flow_inFlux_hy: specifies the response traffic from the origin server to the EdgeOne node. Unit: byte.</li>
<li>l7Flow_inBandwidth_hy: specifies the response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li>
 
     * @return MetricNames Metric list. Valid values:.
<li>l7Flow_outFlux_hy: specifies the request traffic from the EdgeOne node to the origin server. Unit: byte.</li>
<li>l7Flow_outBandwidth_hy: specifies the request bandwidth from EdgeOne node to origin server. Unit: bps.</li>
<li>l7Flow_request_hy: specifies the request count from EdgeOne node to origin server. Unit: times.</li>
<li>l7Flow_inFlux_hy: specifies the response traffic from the origin server to the EdgeOne node. Unit: byte.</li>
<li>l7Flow_inBandwidth_hy: specifies the response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li>

     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric list. Valid values:.
<li>l7Flow_outFlux_hy: specifies the request traffic from the EdgeOne node to the origin server. Unit: byte.</li>
<li>l7Flow_outBandwidth_hy: specifies the request bandwidth from EdgeOne node to origin server. Unit: bps.</li>
<li>l7Flow_request_hy: specifies the request count from EdgeOne node to origin server. Unit: times.</li>
<li>l7Flow_inFlux_hy: specifies the response traffic from the origin server to the EdgeOne node. Unit: byte.</li>
<li>l7Flow_inBandwidth_hy: specifies the response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li>

     * @param MetricNames Metric list. Valid values:.
<li>l7Flow_outFlux_hy: specifies the request traffic from the EdgeOne node to the origin server. Unit: byte.</li>
<li>l7Flow_outBandwidth_hy: specifies the request bandwidth from EdgeOne node to origin server. Unit: bps.</li>
<li>l7Flow_request_hy: specifies the request count from EdgeOne node to origin server. Unit: times.</li>
<li>l7Flow_inFlux_hy: specifies the response traffic from the origin server to the EdgeOne node. Unit: byte.</li>
<li>l7Flow_inBandwidth_hy: specifies the response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li>

     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this interface. 
     * @return ZoneIds Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this interface.
     * @param ZoneIds Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Time granularity of the query. Valid values:
<Li>min: 1 minute.</li><Li>5min: 5 minutes;</li><Li>hour: 1 hour;</li><li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. Valid values:
<Li>min: 1 minute.</li><Li>5min: 5 minutes;</li><Li>hour: 1 hour;</li><li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<Li>min: 1 minute.</li><Li>5min: 5 minutes;</li><Li>hour: 1 hour;</li><li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Time granularity of the query. Valid values:
<Li>min: 1 minute.</li><Li>5min: 5 minutes;</li><Li>hour: 1 hour;</li><li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter conditions. Details:
<li>domain: specifies the domain name in client requests. When the domain is onboarded via a wildcard, the recorded value is the wildcard domain itself, not the specific subdomain.</li> 
     * @return Filters Filter conditions. Details:
<li>domain: specifies the domain name in client requests. When the domain is onboarded via a wildcard, the recorded value is the wildcard domain itself, not the specific subdomain.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. Details:
<li>domain: specifies the domain name in client requests. When the domain is onboarded via a wildcard, the recorded value is the wildcard domain itself, not the specific subdomain.</li>
     * @param Filters Filter conditions. Details:
<li>domain: specifies the domain name in client requests. When the domain is onboarded via a wildcard, the recorded value is the wildcard domain itself, not the specific subdomain.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTimingL7OriginPullDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7OriginPullDataRequest(DescribeTimingL7OriginPullDataRequest source) {
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

    }
}

