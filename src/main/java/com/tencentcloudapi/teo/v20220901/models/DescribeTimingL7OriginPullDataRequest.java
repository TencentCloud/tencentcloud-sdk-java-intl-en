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
    * Site ID set. This parameter is required. You can input up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permissions for all site resources of this interface.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from EdgeOne node to origin server direction, unit: Byte;</li>
<li>l7Flow_outBandwidth_hy: Request bandwidth from EdgeOne node to origin server direction, unit: bps;</li>
<li>l7Flow_request_hy: request count from EdgeOne node to origin server direction, unit: count.</li>
<li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node, measurement unit: Byte;</li>
<li>l7Flow_inBandwidth_hy: Response bandwidth from the origin to the EdgeOne node, unit: bps.</li></ul>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

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
    * Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed filter criteria are as follows:
<ul><li><strong>domain</strong>: domain name requested by the client. If EdgeOne is connected via wildcard domain access, the data records the wildcard domain name rather than the specific domain name.</li><li><strong>originStatusCode</strong>: Origin status code. This filter item is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.<br>Options for the corresponding Value are as follows:<ul><li><code>1xx</code>: Status codes of type 1xx;</li><li><code>2xx</code>: Status codes of type 2xx;</li><li><code>3xx</code>: Status codes of type 3xx;</li><li><code>4xx</code>: Status codes of type 4xx;</li><li><code>5xx</code>: Status codes of type 5xx;</li><li>Integers within the range <code>[0, 600)</code> (excluding 600).</li></ul></li></ul>
**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * <p>Query dimension name. Valid values:</p><ul><li><strong>domain</strong>: Domain name requested by the client. If the domain is connected to EdgeOne as a wildcard domain, it is recorded as a wildcard domain in the data.<br>When using the domain dimension, you must include the <code>domain</code> filter item in <code>Filters</code>, and specify no more than 100 domain names to be queried in the list.</li><li><strong>origin-status-code</strong>: Origin-pull status codes, such as 200 and 404.<br>This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin-pull status code categories, such as 2xx and 4xx.<br>This dimension is supported only when <code>MetricNames =["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is empty, data is aggregated by the <code>AppId</code> dimension by default, and only one set of data is returned.</p><p>If <code>DimensionName</code> is not empty, data is grouped by the specified query dimension and the corresponding time series data is returned. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li>In the returned data, <code>TimingDataRecords.TypeKey</code> is the specific origin-pull status code, such as 200.</li><li>In the returned data, <code>TimingDataRecords.TypeValue</code> is the time series data for this status code.</li></ul></ul>
<strong>Note</strong>: Concurrent calls are forbidden when specifying DimensionName for queries. If the query frequency limit is exceeded, an error <code><strong>InvalidParameter.ActionInProgress</strong></code> will be returned.
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
     * Get Site ID set. This parameter is required. You can input up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permissions for all site resources of this interface. 
     * @return ZoneIds Site ID set. This parameter is required. You can input up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permissions for all site resources of this interface.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required. You can input up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permissions for all site resources of this interface.
     * @param ZoneIds Site ID set. This parameter is required. You can input up to 100 site IDs. To query data of all sites under the Tencent Cloud root account, use `*` instead. To query account-level data, you need permissions for all site resources of this interface.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from EdgeOne node to origin server direction, unit: Byte;</li>
<li>l7Flow_outBandwidth_hy: Request bandwidth from EdgeOne node to origin server direction, unit: bps;</li>
<li>l7Flow_request_hy: request count from EdgeOne node to origin server direction, unit: count.</li>
<li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node, measurement unit: Byte;</li>
<li>l7Flow_inBandwidth_hy: Response bandwidth from the origin to the EdgeOne node, unit: bps.</li></ul> 
     * @return MetricNames Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from EdgeOne node to origin server direction, unit: Byte;</li>
<li>l7Flow_outBandwidth_hy: Request bandwidth from EdgeOne node to origin server direction, unit: bps;</li>
<li>l7Flow_request_hy: request count from EdgeOne node to origin server direction, unit: count.</li>
<li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node, measurement unit: Byte;</li>
<li>l7Flow_inBandwidth_hy: Response bandwidth from the origin to the EdgeOne node, unit: bps.</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from EdgeOne node to origin server direction, unit: Byte;</li>
<li>l7Flow_outBandwidth_hy: Request bandwidth from EdgeOne node to origin server direction, unit: bps;</li>
<li>l7Flow_request_hy: request count from EdgeOne node to origin server direction, unit: count.</li>
<li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node, measurement unit: Byte;</li>
<li>l7Flow_inBandwidth_hy: Response bandwidth from the origin to the EdgeOne node, unit: bps.</li></ul>
     * @param MetricNames Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from EdgeOne node to origin server direction, unit: Byte;</li>
<li>l7Flow_outBandwidth_hy: Request bandwidth from EdgeOne node to origin server direction, unit: bps;</li>
<li>l7Flow_request_hy: request count from EdgeOne node to origin server direction, unit: count.</li>
<li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node, measurement unit: Byte;</li>
<li>l7Flow_inBandwidth_hy: Response bandwidth from the origin to the EdgeOne node, unit: bps.</li></ul>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

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
     * Get Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed filter criteria are as follows:
<ul><li><strong>domain</strong>: domain name requested by the client. If EdgeOne is connected via wildcard domain access, the data records the wildcard domain name rather than the specific domain name.</li><li><strong>originStatusCode</strong>: Origin status code. This filter item is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.<br>Options for the corresponding Value are as follows:<ul><li><code>1xx</code>: Status codes of type 1xx;</li><li><code>2xx</code>: Status codes of type 2xx;</li><li><code>3xx</code>: Status codes of type 3xx;</li><li><code>4xx</code>: Status codes of type 4xx;</li><li><code>5xx</code>: Status codes of type 5xx;</li><li>Integers within the range <code>[0, 600)</code> (excluding 600).</li></ul></li></ul>
**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported. 
     * @return Filters Filter criteria. The detailed filter criteria are as follows:
<ul><li><strong>domain</strong>: domain name requested by the client. If EdgeOne is connected via wildcard domain access, the data records the wildcard domain name rather than the specific domain name.</li><li><strong>originStatusCode</strong>: Origin status code. This filter item is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.<br>Options for the corresponding Value are as follows:<ul><li><code>1xx</code>: Status codes of type 1xx;</li><li><code>2xx</code>: Status codes of type 2xx;</li><li><code>3xx</code>: Status codes of type 3xx;</li><li><code>4xx</code>: Status codes of type 4xx;</li><li><code>5xx</code>: Status codes of type 5xx;</li><li>Integers within the range <code>[0, 600)</code> (excluding 600).</li></ul></li></ul>
**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed filter criteria are as follows:
<ul><li><strong>domain</strong>: domain name requested by the client. If EdgeOne is connected via wildcard domain access, the data records the wildcard domain name rather than the specific domain name.</li><li><strong>originStatusCode</strong>: Origin status code. This filter item is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.<br>Options for the corresponding Value are as follows:<ul><li><code>1xx</code>: Status codes of type 1xx;</li><li><code>2xx</code>: Status codes of type 2xx;</li><li><code>3xx</code>: Status codes of type 3xx;</li><li><code>4xx</code>: Status codes of type 4xx;</li><li><code>5xx</code>: Status codes of type 5xx;</li><li>Integers within the range <code>[0, 600)</code> (excluding 600).</li></ul></li></ul>
**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     * @param Filters Filter criteria. The detailed filter criteria are as follows:
<ul><li><strong>domain</strong>: domain name requested by the client. If EdgeOne is connected via wildcard domain access, the data records the wildcard domain name rather than the specific domain name.</li><li><strong>originStatusCode</strong>: Origin status code. This filter item is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.<br>Options for the corresponding Value are as follows:<ul><li><code>1xx</code>: Status codes of type 1xx;</li><li><code>2xx</code>: Status codes of type 2xx;</li><li><code>3xx</code>: Status codes of type 3xx;</li><li><code>4xx</code>: Status codes of type 4xx;</li><li><code>5xx</code>: Status codes of type 5xx;</li><li>Integers within the range <code>[0, 600)</code> (excluding 600).</li></ul></li></ul>
**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Query dimension name. Valid values:</p><ul><li><strong>domain</strong>: Domain name requested by the client. If the domain is connected to EdgeOne as a wildcard domain, it is recorded as a wildcard domain in the data.<br>When using the domain dimension, you must include the <code>domain</code> filter item in <code>Filters</code>, and specify no more than 100 domain names to be queried in the list.</li><li><strong>origin-status-code</strong>: Origin-pull status codes, such as 200 and 404.<br>This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin-pull status code categories, such as 2xx and 4xx.<br>This dimension is supported only when <code>MetricNames =["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is empty, data is aggregated by the <code>AppId</code> dimension by default, and only one set of data is returned.</p><p>If <code>DimensionName</code> is not empty, data is grouped by the specified query dimension and the corresponding time series data is returned. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li>In the returned data, <code>TimingDataRecords.TypeKey</code> is the specific origin-pull status code, such as 200.</li><li>In the returned data, <code>TimingDataRecords.TypeValue</code> is the time series data for this status code.</li></ul></ul>
<strong>Note</strong>: Concurrent calls are forbidden when specifying DimensionName for queries. If the query frequency limit is exceeded, an error <code><strong>InvalidParameter.ActionInProgress</strong></code> will be returned. 
     * @return DimensionName <p>Query dimension name. Valid values:</p><ul><li><strong>domain</strong>: Domain name requested by the client. If the domain is connected to EdgeOne as a wildcard domain, it is recorded as a wildcard domain in the data.<br>When using the domain dimension, you must include the <code>domain</code> filter item in <code>Filters</code>, and specify no more than 100 domain names to be queried in the list.</li><li><strong>origin-status-code</strong>: Origin-pull status codes, such as 200 and 404.<br>This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin-pull status code categories, such as 2xx and 4xx.<br>This dimension is supported only when <code>MetricNames =["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is empty, data is aggregated by the <code>AppId</code> dimension by default, and only one set of data is returned.</p><p>If <code>DimensionName</code> is not empty, data is grouped by the specified query dimension and the corresponding time series data is returned. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li>In the returned data, <code>TimingDataRecords.TypeKey</code> is the specific origin-pull status code, such as 200.</li><li>In the returned data, <code>TimingDataRecords.TypeValue</code> is the time series data for this status code.</li></ul></ul>
<strong>Note</strong>: Concurrent calls are forbidden when specifying DimensionName for queries. If the query frequency limit is exceeded, an error <code><strong>InvalidParameter.ActionInProgress</strong></code> will be returned.
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set <p>Query dimension name. Valid values:</p><ul><li><strong>domain</strong>: Domain name requested by the client. If the domain is connected to EdgeOne as a wildcard domain, it is recorded as a wildcard domain in the data.<br>When using the domain dimension, you must include the <code>domain</code> filter item in <code>Filters</code>, and specify no more than 100 domain names to be queried in the list.</li><li><strong>origin-status-code</strong>: Origin-pull status codes, such as 200 and 404.<br>This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin-pull status code categories, such as 2xx and 4xx.<br>This dimension is supported only when <code>MetricNames =["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is empty, data is aggregated by the <code>AppId</code> dimension by default, and only one set of data is returned.</p><p>If <code>DimensionName</code> is not empty, data is grouped by the specified query dimension and the corresponding time series data is returned. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li>In the returned data, <code>TimingDataRecords.TypeKey</code> is the specific origin-pull status code, such as 200.</li><li>In the returned data, <code>TimingDataRecords.TypeValue</code> is the time series data for this status code.</li></ul></ul>
<strong>Note</strong>: Concurrent calls are forbidden when specifying DimensionName for queries. If the query frequency limit is exceeded, an error <code><strong>InvalidParameter.ActionInProgress</strong></code> will be returned.
     * @param DimensionName <p>Query dimension name. Valid values:</p><ul><li><strong>domain</strong>: Domain name requested by the client. If the domain is connected to EdgeOne as a wildcard domain, it is recorded as a wildcard domain in the data.<br>When using the domain dimension, you must include the <code>domain</code> filter item in <code>Filters</code>, and specify no more than 100 domain names to be queried in the list.</li><li><strong>origin-status-code</strong>: Origin-pull status codes, such as 200 and 404.<br>This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin-pull status code categories, such as 2xx and 4xx.<br>This dimension is supported only when <code>MetricNames =["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is empty, data is aggregated by the <code>AppId</code> dimension by default, and only one set of data is returned.</p><p>If <code>DimensionName</code> is not empty, data is grouped by the specified query dimension and the corresponding time series data is returned. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li>In the returned data, <code>TimingDataRecords.TypeKey</code> is the specific origin-pull status code, such as 200.</li><li>In the returned data, <code>TimingDataRecords.TypeValue</code> is the time series data for this status code.</li></ul></ul>
<strong>Note</strong>: Concurrent calls are forbidden when specifying DimensionName for queries. If the query frequency limit is exceeded, an error <code><strong>InvalidParameter.ActionInProgress</strong></code> will be returned.
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    public DescribeTimingL7OriginPullDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7OriginPullDataRequest(DescribeTimingL7OriginPullDataRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);

    }
}

