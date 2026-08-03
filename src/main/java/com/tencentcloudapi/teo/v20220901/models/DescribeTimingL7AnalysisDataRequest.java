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
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Metric list. Valid values:</p><li>l7Flow_outFlux: L7 EdgeOne response traffic. Measurement unit: Byte;</li><li>l7Flow_inFlux: L7 client request traffic. Measurement unit: Byte;</li><li>l7Flow_flux: L7 total access traffic (EdgeOne response + client request). Measurement unit: Byte;</li><li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Measurement unit: bps;</li><li>l7Flow_inBandwidth: L7 client request bandwidth. Measurement unit: bps;</li><li>l7Flow_bandwidth: L7 total access bandwidth (EdgeOne response + client request). Measurement unit: bps;</li><li>l7Flow_request: L7 client request count. Measurement unit: count;</li><li>l7Flow_avgResponseTime: L7 average response time. Measurement unit: ms;</li><li>l7Flow_avgFirstByteResponseTime: L7 average first byte response time. Measurement unit: ms;</li><li>l7Flow_requestRate: L7 client request rate. Measurement unit: qps.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the notice: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. A maximum of 100 site IDs can be imported. To query all site data under the Tencent Cloud root account, use <code>*</code> as a replacement. Querying account-level data requires permission to all site resources of this interface.</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>Query time granularity.</p><p>Enumeration values:</p><ul><li>min: 1 minute</li><li>5min: 5 minutes</li><li>hour: 1 hour</li><li>day: 1 day</li></ul><p>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.</p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>Filter conditions used when filtering data. For available filter options, refer to the <a href="https://www.tencentcloud.com/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945">Analytics Filter Options</a> for L7 client traffic, bandwidth, and request counts.<br>To limit the query to specific sites or content identifiers, pass the corresponding values in the <code>ZoneIds.N</code> parameter separately.</p>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * <p>The region to which the data belongs. This parameter is deprecated. To filter data by client region, use <code>Filters.country</code> instead.</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p> 
     * @return EndTime <p>End time. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     * @param EndTime <p>End time. The query time range (<code>EndTime</code> - <code>StartTime</code>) must be less than or equal to 31 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Metric list. Valid values:</p><li>l7Flow_outFlux: L7 EdgeOne response traffic. Measurement unit: Byte;</li><li>l7Flow_inFlux: L7 client request traffic. Measurement unit: Byte;</li><li>l7Flow_flux: L7 total access traffic (EdgeOne response + client request). Measurement unit: Byte;</li><li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Measurement unit: bps;</li><li>l7Flow_inBandwidth: L7 client request bandwidth. Measurement unit: bps;</li><li>l7Flow_bandwidth: L7 total access bandwidth (EdgeOne response + client request). Measurement unit: bps;</li><li>l7Flow_request: L7 client request count. Measurement unit: count;</li><li>l7Flow_avgResponseTime: L7 average response time. Measurement unit: ms;</li><li>l7Flow_avgFirstByteResponseTime: L7 average first byte response time. Measurement unit: ms;</li><li>l7Flow_requestRate: L7 client request rate. Measurement unit: qps.</li> 
     * @return MetricNames <p>Metric list. Valid values:</p><li>l7Flow_outFlux: L7 EdgeOne response traffic. Measurement unit: Byte;</li><li>l7Flow_inFlux: L7 client request traffic. Measurement unit: Byte;</li><li>l7Flow_flux: L7 total access traffic (EdgeOne response + client request). Measurement unit: Byte;</li><li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Measurement unit: bps;</li><li>l7Flow_inBandwidth: L7 client request bandwidth. Measurement unit: bps;</li><li>l7Flow_bandwidth: L7 total access bandwidth (EdgeOne response + client request). Measurement unit: bps;</li><li>l7Flow_request: L7 client request count. Measurement unit: count;</li><li>l7Flow_avgResponseTime: L7 average response time. Measurement unit: ms;</li><li>l7Flow_avgFirstByteResponseTime: L7 average first byte response time. Measurement unit: ms;</li><li>l7Flow_requestRate: L7 client request rate. Measurement unit: qps.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>Metric list. Valid values:</p><li>l7Flow_outFlux: L7 EdgeOne response traffic. Measurement unit: Byte;</li><li>l7Flow_inFlux: L7 client request traffic. Measurement unit: Byte;</li><li>l7Flow_flux: L7 total access traffic (EdgeOne response + client request). Measurement unit: Byte;</li><li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Measurement unit: bps;</li><li>l7Flow_inBandwidth: L7 client request bandwidth. Measurement unit: bps;</li><li>l7Flow_bandwidth: L7 total access bandwidth (EdgeOne response + client request). Measurement unit: bps;</li><li>l7Flow_request: L7 client request count. Measurement unit: count;</li><li>l7Flow_avgResponseTime: L7 average response time. Measurement unit: ms;</li><li>l7Flow_avgFirstByteResponseTime: L7 average first byte response time. Measurement unit: ms;</li><li>l7Flow_requestRate: L7 client request rate. Measurement unit: qps.</li>
     * @param MetricNames <p>Metric list. Valid values:</p><li>l7Flow_outFlux: L7 EdgeOne response traffic. Measurement unit: Byte;</li><li>l7Flow_inFlux: L7 client request traffic. Measurement unit: Byte;</li><li>l7Flow_flux: L7 total access traffic (EdgeOne response + client request). Measurement unit: Byte;</li><li>l7Flow_outBandwidth: L7 EdgeOne response bandwidth. Measurement unit: bps;</li><li>l7Flow_inBandwidth: L7 client request bandwidth. Measurement unit: bps;</li><li>l7Flow_bandwidth: L7 total access bandwidth (EdgeOne response + client request). Measurement unit: bps;</li><li>l7Flow_request: L7 client request count. Measurement unit: count;</li><li>l7Flow_avgResponseTime: L7 average response time. Measurement unit: ms;</li><li>l7Flow_avgFirstByteResponseTime: L7 average first byte response time. Measurement unit: ms;</li><li>l7Flow_requestRate: L7 client request rate. Measurement unit: qps.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the notice: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. A maximum of 100 site IDs can be imported. To query all site data under the Tencent Cloud root account, use <code>*</code> as a replacement. Querying account-level data requires permission to all site resources of this interface.</p> 
     * @return ZoneIds <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the notice: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. A maximum of 100 site IDs can be imported. To query all site data under the Tencent Cloud root account, use <code>*</code> as a replacement. Querying account-level data requires permission to all site resources of this interface.</p>
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the notice: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. A maximum of 100 site IDs can be imported. To query all site data under the Tencent Cloud root account, use <code>*</code> as a replacement. Querying account-level data requires permission to all site resources of this interface.</p>
     * @param ZoneIds <p>Site ID set. This parameter will change from optional to required after May 30, 2024. For details, see the notice: <a href="https://www.tencentcloud.com/document/product/1552/104902?from_cn_redirect=1">[Tencent Cloud EdgeOne] Cloud API Change Notification</a>. A maximum of 100 site IDs can be imported. To query all site data under the Tencent Cloud root account, use <code>*</code> as a replacement. Querying account-level data requires permission to all site resources of this interface.</p>
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Query time granularity.</p><p>Enumeration values:</p><ul><li>min: 1 minute</li><li>5min: 5 minutes</li><li>hour: 1 hour</li><li>day: 1 day</li></ul><p>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.</p> 
     * @return Interval <p>Query time granularity.</p><p>Enumeration values:</p><ul><li>min: 1 minute</li><li>5min: 5 minutes</li><li>hour: 1 hour</li><li>day: 1 day</li></ul><p>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.</p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Query time granularity.</p><p>Enumeration values:</p><ul><li>min: 1 minute</li><li>5min: 5 minutes</li><li>hour: 1 hour</li><li>day: 1 day</li></ul><p>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.</p>
     * @param Interval <p>Query time granularity.</p><p>Enumeration values:</p><ul><li>min: 1 minute</li><li>5min: 5 minutes</li><li>hour: 1 hour</li><li>day: 1 day</li></ul><p>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.</p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Filter conditions used when filtering data. For available filter options, refer to the <a href="https://www.tencentcloud.com/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945">Analytics Filter Options</a> for L7 client traffic, bandwidth, and request counts.<br>To limit the query to specific sites or content identifiers, pass the corresponding values in the <code>ZoneIds.N</code> parameter separately.</p> 
     * @return Filters <p>Filter conditions used when filtering data. For available filter options, refer to the <a href="https://www.tencentcloud.com/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945">Analytics Filter Options</a> for L7 client traffic, bandwidth, and request counts.<br>To limit the query to specific sites or content identifiers, pass the corresponding values in the <code>ZoneIds.N</code> parameter separately.</p>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions used when filtering data. For available filter options, refer to the <a href="https://www.tencentcloud.com/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945">Analytics Filter Options</a> for L7 client traffic, bandwidth, and request counts.<br>To limit the query to specific sites or content identifiers, pass the corresponding values in the <code>ZoneIds.N</code> parameter separately.</p>
     * @param Filters <p>Filter conditions used when filtering data. For available filter options, refer to the <a href="https://www.tencentcloud.com/document/product/1552/98219?from_cn_redirect=1#1aaf1150-55a4-4b4d-b103-3a8317ac7945">Analytics Filter Options</a> for L7 client traffic, bandwidth, and request counts.<br>To limit the query to specific sites or content identifiers, pass the corresponding values in the <code>ZoneIds.N</code> parameter separately.</p>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>The region to which the data belongs. This parameter is deprecated. To filter data by client region, use <code>Filters.country</code> instead.</p> 
     * @return Area <p>The region to which the data belongs. This parameter is deprecated. To filter data by client region, use <code>Filters.country</code> instead.</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>The region to which the data belongs. This parameter is deprecated. To filter data by client region, use <code>Filters.country</code> instead.</p>
     * @param Area <p>The region to which the data belongs. This parameter is deprecated. To filter data by client region, use <code>Filters.country</code> instead.</p>
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

