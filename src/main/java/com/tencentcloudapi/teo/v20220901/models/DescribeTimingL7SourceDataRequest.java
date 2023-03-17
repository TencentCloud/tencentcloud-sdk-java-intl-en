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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimingL7SourceDataRequest extends AbstractModel{

    /**
    * Start time of the query period.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of metrics. Values:
<li>`l7Flow_outFlux_hy`: EdgeOne request traffic</li>
<li>`l7Flow_outBandwidth_hy`: EdgeOne request bandwidth</li>
<li>`l7Flow_inFlux_hy`: Origin response traffic</li>
<li>`l7Flow_inBandwidth_hy`: Origin response bandwidth</li>
<li>`l7Flow_request_hy`: Origin-pull requests</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * List of sites to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period < 1 hour**: 1-minute granularity; **1 hour < query period < 2 days**: 5-minute granularity; **2 days < query period < 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter conditions. See below for details: 
<li>`domain`:<br>   Filter by <strong>the origin domain</strong><br>   Type: String<br>   Required: No</li>
<li>`origin`:<br>   Filter by <strong>the origin</strong><br>   Type: String<br>   Required: No</li>
<li>`originGroup`:<br>   Filter by <strong>the origin group</strong>, such as origin-xxxxx.<br>   Type: String<br>   Required: No</li>
<li>`flowType`:<br>   Filter by <strong>the origin response type</strong>. This parameter takes precedence over `MetricNames.N`.<br>   Type: String<br>   Required: No<br>   Values:<br>   `inFlow`: Origin response data, corresponding to `l7Flow_inFlux_hy`, `l7Flow_inBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.<br>   `outFlow`: EdgeOne request data, corresponding to `l7Flow_outFlux_hy`, `l7Flow_outBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

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
     * Get Start time of the query period. 
     * @return StartTime Start time of the query period.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query period.
     * @param StartTime Start time of the query period.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the query period. 
     * @return EndTime End time of the query period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query period.
     * @param EndTime End time of the query period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of metrics. Values:
<li>`l7Flow_outFlux_hy`: EdgeOne request traffic</li>
<li>`l7Flow_outBandwidth_hy`: EdgeOne request bandwidth</li>
<li>`l7Flow_inFlux_hy`: Origin response traffic</li>
<li>`l7Flow_inBandwidth_hy`: Origin response bandwidth</li>
<li>`l7Flow_request_hy`: Origin-pull requests</li> 
     * @return MetricNames List of metrics. Values:
<li>`l7Flow_outFlux_hy`: EdgeOne request traffic</li>
<li>`l7Flow_outBandwidth_hy`: EdgeOne request bandwidth</li>
<li>`l7Flow_inFlux_hy`: Origin response traffic</li>
<li>`l7Flow_inBandwidth_hy`: Origin response bandwidth</li>
<li>`l7Flow_request_hy`: Origin-pull requests</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set List of metrics. Values:
<li>`l7Flow_outFlux_hy`: EdgeOne request traffic</li>
<li>`l7Flow_outBandwidth_hy`: EdgeOne request bandwidth</li>
<li>`l7Flow_inFlux_hy`: Origin response traffic</li>
<li>`l7Flow_inBandwidth_hy`: Origin response bandwidth</li>
<li>`l7Flow_request_hy`: Origin-pull requests</li>
     * @param MetricNames List of metrics. Values:
<li>`l7Flow_outFlux_hy`: EdgeOne request traffic</li>
<li>`l7Flow_outBandwidth_hy`: EdgeOne request bandwidth</li>
<li>`l7Flow_inFlux_hy`: Origin response traffic</li>
<li>`l7Flow_inBandwidth_hy`: Origin response bandwidth</li>
<li>`l7Flow_request_hy`: Origin-pull requests</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get List of sites to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of sites to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds List of sites to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period < 1 hour**: 1-minute granularity; **1 hour < query period < 2 days**: 5-minute granularity; **2 days < query period < 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity. 
     * @return Interval The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period < 1 hour**: 1-minute granularity; **1 hour < query period < 2 days**: 5-minute granularity; **2 days < query period < 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period < 1 hour**: 1-minute granularity; **1 hour < query period < 2 days**: 5-minute granularity; **2 days < query period < 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     * @param Interval The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period < 1 hour**: 1-minute granularity; **1 hour < query period < 2 days**: 5-minute granularity; **2 days < query period < 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter conditions. See below for details: 
<li>`domain`:<br>   Filter by <strong>the origin domain</strong><br>   Type: String<br>   Required: No</li>
<li>`origin`:<br>   Filter by <strong>the origin</strong><br>   Type: String<br>   Required: No</li>
<li>`originGroup`:<br>   Filter by <strong>the origin group</strong>, such as origin-xxxxx.<br>   Type: String<br>   Required: No</li>
<li>`flowType`:<br>   Filter by <strong>the origin response type</strong>. This parameter takes precedence over `MetricNames.N`.<br>   Type: String<br>   Required: No<br>   Values:<br>   `inFlow`: Origin response data, corresponding to `l7Flow_inFlux_hy`, `l7Flow_inBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.<br>   `outFlow`: EdgeOne request data, corresponding to `l7Flow_outFlux_hy`, `l7Flow_outBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.</li> 
     * @return Filters Filter conditions. See below for details: 
<li>`domain`:<br>   Filter by <strong>the origin domain</strong><br>   Type: String<br>   Required: No</li>
<li>`origin`:<br>   Filter by <strong>the origin</strong><br>   Type: String<br>   Required: No</li>
<li>`originGroup`:<br>   Filter by <strong>the origin group</strong>, such as origin-xxxxx.<br>   Type: String<br>   Required: No</li>
<li>`flowType`:<br>   Filter by <strong>the origin response type</strong>. This parameter takes precedence over `MetricNames.N`.<br>   Type: String<br>   Required: No<br>   Values:<br>   `inFlow`: Origin response data, corresponding to `l7Flow_inFlux_hy`, `l7Flow_inBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.<br>   `outFlow`: EdgeOne request data, corresponding to `l7Flow_outFlux_hy`, `l7Flow_outBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. See below for details: 
<li>`domain`:<br>   Filter by <strong>the origin domain</strong><br>   Type: String<br>   Required: No</li>
<li>`origin`:<br>   Filter by <strong>the origin</strong><br>   Type: String<br>   Required: No</li>
<li>`originGroup`:<br>   Filter by <strong>the origin group</strong>, such as origin-xxxxx.<br>   Type: String<br>   Required: No</li>
<li>`flowType`:<br>   Filter by <strong>the origin response type</strong>. This parameter takes precedence over `MetricNames.N`.<br>   Type: String<br>   Required: No<br>   Values:<br>   `inFlow`: Origin response data, corresponding to `l7Flow_inFlux_hy`, `l7Flow_inBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.<br>   `outFlow`: EdgeOne request data, corresponding to `l7Flow_outFlux_hy`, `l7Flow_outBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.</li>
     * @param Filters Filter conditions. See below for details: 
<li>`domain`:<br>   Filter by <strong>the origin domain</strong><br>   Type: String<br>   Required: No</li>
<li>`origin`:<br>   Filter by <strong>the origin</strong><br>   Type: String<br>   Required: No</li>
<li>`originGroup`:<br>   Filter by <strong>the origin group</strong>, such as origin-xxxxx.<br>   Type: String<br>   Required: No</li>
<li>`flowType`:<br>   Filter by <strong>the origin response type</strong>. This parameter takes precedence over `MetricNames.N`.<br>   Type: String<br>   Required: No<br>   Values:<br>   `inFlow`: Origin response data, corresponding to `l7Flow_inFlux_hy`, `l7Flow_inBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.<br>   `outFlow`: EdgeOne request data, corresponding to `l7Flow_outFlux_hy`, `l7Flow_outBandwidth_hy` and `l7Flow_request_hy` in `MetricNames.N`.</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
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

    public DescribeTimingL7SourceDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7SourceDataRequest(DescribeTimingL7SourceDataRequest source) {
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

