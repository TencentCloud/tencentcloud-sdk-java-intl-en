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
    * Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from the EdgeOne node to the origin server. Unit: Byte.</li><li>l7Flow_outBandwidth_hy: Request bandwidth from the EdgeOne node to the origin server. Unit: bps.</li><li>l7Flow_request_hy: Number of requests from the EdgeOne node to the origin server. Unit: count.</li><li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node. Unit: Byte.</li><li>l7Flow_inBandwidth_hy: Response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li></ul>
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
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not specified, the granularity will be automatically inferred based on the time range between the start time and end time. Specifically, the granularity will be min, 5min, hour, and day when the time range is within 2 hours, within 2 days, within 7 days, and exceeding 7 days, respectively.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. Detailed filter criteria:
<ul><li><strong>domain</strong>: The requested domain name from the client. If accessing EdgeOne via a wildcard domain, the data records the wildcard domain name rather than the specific subdomain.</li><li><strong>originStatusCode</strong>: Origin status code. This filter is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.
Valid values:<ul><li><code>1xx</code>: Status codes in the 1xx range.</li><li><code>2xx</code>: Status codes in the 2xx range.</li><li><code>3xx</code>: Status codes in the 3xx range.</li><li><code>4xx</code>: Status codes in the 4xx range.</li><li><code>5xx</code>: Status codes in the 5xx range.</li><li>Any integer in the range <code>[0, 600)</code>.</li></ul></li></ul>**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Query dimension name. Valid values:
<ul><li><strong>domain</strong>: The domain name requested by the client. If EdgeOne is accessed via a wildcard domain name, the data records the wildcard domain name.
When using the domain dimension, the <code>Filters</code> parameter must include the <code>domain</code> filter item, specifying a list of up to 100 domain names.</li><li><strong>origin-status-code</strong>: Origin status code, such as 200 or 404.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin status code category, such as 2xx or 4xx.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is left empty, data is aggregated by the <code>AppId</code> dimension by default, returning a single set of data.</p><p>If <code>DimensionName</code> is specified, time series data is returned grouped by the specified dimension. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li><code>TimingDataRecords.TypeKey</code> in the returned data is the specific origin status code, such as 200.</li><li><code>TimingDataRecords.TypeValue</code> in the returned data is the time series data corresponding to that status code.</li></ul></ul><p><strong>Note</strong>: When <code>DimensionName</code> is specified, concurrent calls are not allowed. Exceeding the query rate limit will return the error <code><strong>InvalidParameter.ActionInProgress</strong></code>.</p>
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
     * Get Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API. 
     * @return ZoneIds Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     * @param ZoneIds Site ID set. This parameter is required. A maximum of 100 zone-ids can be imported. Use `*` to query data for all sites under the Tencent Cloud root account. Querying account-level data requires permissions for all site resources in this API.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from the EdgeOne node to the origin server. Unit: Byte.</li><li>l7Flow_outBandwidth_hy: Request bandwidth from the EdgeOne node to the origin server. Unit: bps.</li><li>l7Flow_request_hy: Number of requests from the EdgeOne node to the origin server. Unit: count.</li><li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node. Unit: Byte.</li><li>l7Flow_inBandwidth_hy: Response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li></ul> 
     * @return MetricNames Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from the EdgeOne node to the origin server. Unit: Byte.</li><li>l7Flow_outBandwidth_hy: Request bandwidth from the EdgeOne node to the origin server. Unit: bps.</li><li>l7Flow_request_hy: Number of requests from the EdgeOne node to the origin server. Unit: count.</li><li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node. Unit: Byte.</li><li>l7Flow_inBandwidth_hy: Response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li></ul>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from the EdgeOne node to the origin server. Unit: Byte.</li><li>l7Flow_outBandwidth_hy: Request bandwidth from the EdgeOne node to the origin server. Unit: bps.</li><li>l7Flow_request_hy: Number of requests from the EdgeOne node to the origin server. Unit: count.</li><li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node. Unit: Byte.</li><li>l7Flow_inBandwidth_hy: Response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li></ul>
     * @param MetricNames Metric list. Valid values:
<ul><li>l7Flow_outFlux_hy: Request traffic from the EdgeOne node to the origin server. Unit: Byte.</li><li>l7Flow_outBandwidth_hy: Request bandwidth from the EdgeOne node to the origin server. Unit: bps.</li><li>l7Flow_request_hy: Number of requests from the EdgeOne node to the origin server. Unit: count.</li><li>l7Flow_inFlux_hy: Response traffic from the origin server to the EdgeOne node. Unit: Byte.</li><li>l7Flow_inBandwidth_hy: Response bandwidth from the origin server to the EdgeOne node. Unit: bps.</li></ul>
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
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not specified, the granularity will be automatically inferred based on the time range between the start time and end time. Specifically, the granularity will be min, 5min, hour, and day when the time range is within 2 hours, within 2 days, within 7 days, and exceeding 7 days, respectively. 
     * @return Interval Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not specified, the granularity will be automatically inferred based on the time range between the start time and end time. Specifically, the granularity will be min, 5min, hour, and day when the time range is within 2 hours, within 2 days, within 7 days, and exceeding 7 days, respectively.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not specified, the granularity will be automatically inferred based on the time range between the start time and end time. Specifically, the granularity will be min, 5min, hour, and day when the time range is within 2 hours, within 2 days, within 7 days, and exceeding 7 days, respectively.
     * @param Interval Time granularity of the query. Valid values:
<ul><li>min: 1 minute;</li><li>5min: 5 minutes;</li><li>hour: 1 hour;</li><li>day: 1 day.</li></ul>If this parameter is not specified, the granularity will be automatically inferred based on the time range between the start time and end time. Specifically, the granularity will be min, 5min, hour, and day when the time range is within 2 hours, within 2 days, within 7 days, and exceeding 7 days, respectively.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. Detailed filter criteria:
<ul><li><strong>domain</strong>: The requested domain name from the client. If accessing EdgeOne via a wildcard domain, the data records the wildcard domain name rather than the specific subdomain.</li><li><strong>originStatusCode</strong>: Origin status code. This filter is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.
Valid values:<ul><li><code>1xx</code>: Status codes in the 1xx range.</li><li><code>2xx</code>: Status codes in the 2xx range.</li><li><code>3xx</code>: Status codes in the 3xx range.</li><li><code>4xx</code>: Status codes in the 4xx range.</li><li><code>5xx</code>: Status codes in the 5xx range.</li><li>Any integer in the range <code>[0, 600)</code>.</li></ul></li></ul>**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported. 
     * @return Filters Filter criteria. Detailed filter criteria:
<ul><li><strong>domain</strong>: The requested domain name from the client. If accessing EdgeOne via a wildcard domain, the data records the wildcard domain name rather than the specific subdomain.</li><li><strong>originStatusCode</strong>: Origin status code. This filter is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.
Valid values:<ul><li><code>1xx</code>: Status codes in the 1xx range.</li><li><code>2xx</code>: Status codes in the 2xx range.</li><li><code>3xx</code>: Status codes in the 3xx range.</li><li><code>4xx</code>: Status codes in the 4xx range.</li><li><code>5xx</code>: Status codes in the 5xx range.</li><li>Any integer in the range <code>[0, 600)</code>.</li></ul></li></ul>**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. Detailed filter criteria:
<ul><li><strong>domain</strong>: The requested domain name from the client. If accessing EdgeOne via a wildcard domain, the data records the wildcard domain name rather than the specific subdomain.</li><li><strong>originStatusCode</strong>: Origin status code. This filter is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.
Valid values:<ul><li><code>1xx</code>: Status codes in the 1xx range.</li><li><code>2xx</code>: Status codes in the 2xx range.</li><li><code>3xx</code>: Status codes in the 3xx range.</li><li><code>4xx</code>: Status codes in the 4xx range.</li><li><code>5xx</code>: Status codes in the 5xx range.</li><li>Any integer in the range <code>[0, 600)</code>.</li></ul></li></ul>**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     * @param Filters Filter criteria. Detailed filter criteria:
<ul><li><strong>domain</strong>: The requested domain name from the client. If accessing EdgeOne via a wildcard domain, the data records the wildcard domain name rather than the specific subdomain.</li><li><strong>originStatusCode</strong>: Origin status code. This filter is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.
Valid values:<ul><li><code>1xx</code>: Status codes in the 1xx range.</li><li><code>2xx</code>: Status codes in the 2xx range.</li><li><code>3xx</code>: Status codes in the 3xx range.</li><li><code>4xx</code>: Status codes in the 4xx range.</li><li><code>5xx</code>: Status codes in the 5xx range.</li><li>Any integer in the range <code>[0, 600)</code>.</li></ul></li></ul>**Note**: When <code>DimensionName</code> is not empty, only the <code>equals</code> operator is supported.
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query dimension name. Valid values:
<ul><li><strong>domain</strong>: The domain name requested by the client. If EdgeOne is accessed via a wildcard domain name, the data records the wildcard domain name.
When using the domain dimension, the <code>Filters</code> parameter must include the <code>domain</code> filter item, specifying a list of up to 100 domain names.</li><li><strong>origin-status-code</strong>: Origin status code, such as 200 or 404.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin status code category, such as 2xx or 4xx.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is left empty, data is aggregated by the <code>AppId</code> dimension by default, returning a single set of data.</p><p>If <code>DimensionName</code> is specified, time series data is returned grouped by the specified dimension. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li><code>TimingDataRecords.TypeKey</code> in the returned data is the specific origin status code, such as 200.</li><li><code>TimingDataRecords.TypeValue</code> in the returned data is the time series data corresponding to that status code.</li></ul></ul><p><strong>Note</strong>: When <code>DimensionName</code> is specified, concurrent calls are not allowed. Exceeding the query rate limit will return the error <code><strong>InvalidParameter.ActionInProgress</strong></code>.</p> 
     * @return DimensionName Query dimension name. Valid values:
<ul><li><strong>domain</strong>: The domain name requested by the client. If EdgeOne is accessed via a wildcard domain name, the data records the wildcard domain name.
When using the domain dimension, the <code>Filters</code> parameter must include the <code>domain</code> filter item, specifying a list of up to 100 domain names.</li><li><strong>origin-status-code</strong>: Origin status code, such as 200 or 404.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin status code category, such as 2xx or 4xx.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is left empty, data is aggregated by the <code>AppId</code> dimension by default, returning a single set of data.</p><p>If <code>DimensionName</code> is specified, time series data is returned grouped by the specified dimension. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li><code>TimingDataRecords.TypeKey</code> in the returned data is the specific origin status code, such as 200.</li><li><code>TimingDataRecords.TypeValue</code> in the returned data is the time series data corresponding to that status code.</li></ul></ul><p><strong>Note</strong>: When <code>DimensionName</code> is specified, concurrent calls are not allowed. Exceeding the query rate limit will return the error <code><strong>InvalidParameter.ActionInProgress</strong></code>.</p>
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set Query dimension name. Valid values:
<ul><li><strong>domain</strong>: The domain name requested by the client. If EdgeOne is accessed via a wildcard domain name, the data records the wildcard domain name.
When using the domain dimension, the <code>Filters</code> parameter must include the <code>domain</code> filter item, specifying a list of up to 100 domain names.</li><li><strong>origin-status-code</strong>: Origin status code, such as 200 or 404.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin status code category, such as 2xx or 4xx.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is left empty, data is aggregated by the <code>AppId</code> dimension by default, returning a single set of data.</p><p>If <code>DimensionName</code> is specified, time series data is returned grouped by the specified dimension. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li><code>TimingDataRecords.TypeKey</code> in the returned data is the specific origin status code, such as 200.</li><li><code>TimingDataRecords.TypeValue</code> in the returned data is the time series data corresponding to that status code.</li></ul></ul><p><strong>Note</strong>: When <code>DimensionName</code> is specified, concurrent calls are not allowed. Exceeding the query rate limit will return the error <code><strong>InvalidParameter.ActionInProgress</strong></code>.</p>
     * @param DimensionName Query dimension name. Valid values:
<ul><li><strong>domain</strong>: The domain name requested by the client. If EdgeOne is accessed via a wildcard domain name, the data records the wildcard domain name.
When using the domain dimension, the <code>Filters</code> parameter must include the <code>domain</code> filter item, specifying a list of up to 100 domain names.</li><li><strong>origin-status-code</strong>: Origin status code, such as 200 or 404.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li><li><strong>origin-status-code-category</strong>: Origin status code category, such as 2xx or 4xx.
This dimension is supported only when <code>MetricNames = ["l7Flow_request_hy"]</code>.</li></ul><p>If <code>DimensionName</code> is left empty, data is aggregated by the <code>AppId</code> dimension by default, returning a single set of data.</p><p>If <code>DimensionName</code> is specified, time series data is returned grouped by the specified dimension. For example:</p><ul>When <code>DimensionName = origin-status-code</code>:<ul><li><code>TimingDataRecords.TypeKey</code> in the returned data is the specific origin status code, such as 200.</li><li><code>TimingDataRecords.TypeValue</code> in the returned data is the time series data corresponding to that status code.</li></ul></ul><p><strong>Note</strong>: When <code>DimensionName</code> is specified, concurrent calls are not allowed. Exceeding the query rate limit will return the error <code><strong>InvalidParameter.ActionInProgress</strong></code>.</p>
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

