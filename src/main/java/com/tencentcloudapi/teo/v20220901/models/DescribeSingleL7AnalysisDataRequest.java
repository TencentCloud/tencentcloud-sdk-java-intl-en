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

public class DescribeSingleL7AnalysisDataRequest extends AbstractModel{

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
    * The query metric. Values:
<li>`l7Flow_singleIpRequest`: Number of requests from a single IP.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * List of sites
If it's not specified, all sites are selected by default, and the query period must be within the last 30 days. 
Enter the IDs of sites to query. The maximum query period is determined by the <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query period</a> of the bound plan. 
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filters
<li>`country`:<br>   Filter by the specified <strong>country code</strong>. <a href="https://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166</a> country codes are used.</li>
<li>`domain`<br>   Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`protocol`:<br>   Filter by the specified <strong>HTTP protocol</strong><br>   Values:<br>   `HTTP/1.0`: HTTP 1.0<br>   `HTTP/1.1`: HTTP 1.1<br>   `HTTP/2.0`: HTTP 2.0<br>   `HTTP/3.0`: HTTP 3.0<br>   `WebSocket`: WebSocket</li>
<li>tagKey<br>   Filter by the specified <strong>tag key</strong></li>
<li>tagValue<br>   Filter by the specified <strong>tag value</strong></li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

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
     * Get The query metric. Values:
<li>`l7Flow_singleIpRequest`: Number of requests from a single IP.</li> 
     * @return MetricNames The query metric. Values:
<li>`l7Flow_singleIpRequest`: Number of requests from a single IP.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set The query metric. Values:
<li>`l7Flow_singleIpRequest`: Number of requests from a single IP.</li>
     * @param MetricNames The query metric. Values:
<li>`l7Flow_singleIpRequest`: Number of requests from a single IP.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get List of sites
If it's not specified, all sites are selected by default, and the query period must be within the last 30 days. 
Enter the IDs of sites to query. The maximum query period is determined by the <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query period</a> of the bound plan.  
     * @return ZoneIds List of sites
If it's not specified, all sites are selected by default, and the query period must be within the last 30 days. 
Enter the IDs of sites to query. The maximum query period is determined by the <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query period</a> of the bound plan. 
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of sites
If it's not specified, all sites are selected by default, and the query period must be within the last 30 days. 
Enter the IDs of sites to query. The maximum query period is determined by the <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query period</a> of the bound plan. 
     * @param ZoneIds List of sites
If it's not specified, all sites are selected by default, and the query period must be within the last 30 days. 
Enter the IDs of sites to query. The maximum query period is determined by the <a href="https://intl.cloud.tencent.com/document/product/1552/77380?from_cn_redirect=1#edgeone-.E5.A5.97.E9.A4.90">max data query period</a> of the bound plan. 
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filters
<li>`country`:<br>   Filter by the specified <strong>country code</strong>. <a href="https://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166</a> country codes are used.</li>
<li>`domain`<br>   Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`protocol`:<br>   Filter by the specified <strong>HTTP protocol</strong><br>   Values:<br>   `HTTP/1.0`: HTTP 1.0<br>   `HTTP/1.1`: HTTP 1.1<br>   `HTTP/2.0`: HTTP 2.0<br>   `HTTP/3.0`: HTTP 3.0<br>   `WebSocket`: WebSocket</li>
<li>tagKey<br>   Filter by the specified <strong>tag key</strong></li>
<li>tagValue<br>   Filter by the specified <strong>tag value</strong></li> 
     * @return Filters Filters
<li>`country`:<br>   Filter by the specified <strong>country code</strong>. <a href="https://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166</a> country codes are used.</li>
<li>`domain`<br>   Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`protocol`:<br>   Filter by the specified <strong>HTTP protocol</strong><br>   Values:<br>   `HTTP/1.0`: HTTP 1.0<br>   `HTTP/1.1`: HTTP 1.1<br>   `HTTP/2.0`: HTTP 2.0<br>   `HTTP/3.0`: HTTP 3.0<br>   `WebSocket`: WebSocket</li>
<li>tagKey<br>   Filter by the specified <strong>tag key</strong></li>
<li>tagValue<br>   Filter by the specified <strong>tag value</strong></li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
<li>`country`:<br>   Filter by the specified <strong>country code</strong>. <a href="https://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166</a> country codes are used.</li>
<li>`domain`<br>   Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`protocol`:<br>   Filter by the specified <strong>HTTP protocol</strong><br>   Values:<br>   `HTTP/1.0`: HTTP 1.0<br>   `HTTP/1.1`: HTTP 1.1<br>   `HTTP/2.0`: HTTP 2.0<br>   `HTTP/3.0`: HTTP 3.0<br>   `WebSocket`: WebSocket</li>
<li>tagKey<br>   Filter by the specified <strong>tag key</strong></li>
<li>tagValue<br>   Filter by the specified <strong>tag value</strong></li>
     * @param Filters Filters
<li>`country`:<br>   Filter by the specified <strong>country code</strong>. <a href="https://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166</a> country codes are used.</li>
<li>`domain`<br>   Filter by the specified <strong>sub-domain name</strong>, such as `test.example.com`</li>
<li>`protocol`:<br>   Filter by the specified <strong>HTTP protocol</strong><br>   Values:<br>   `HTTP/1.0`: HTTP 1.0<br>   `HTTP/1.1`: HTTP 1.1<br>   `HTTP/2.0`: HTTP 2.0<br>   `HTTP/3.0`: HTTP 3.0<br>   `WebSocket`: WebSocket</li>
<li>tagKey<br>   Filter by the specified <strong>tag key</strong></li>
<li>tagValue<br>   Filter by the specified <strong>tag value</strong></li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`. 
     * @return Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     * @param Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: 1 day.</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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

    public DescribeSingleL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSingleL7AnalysisDataRequest(DescribeSingleL7AnalysisDataRequest source) {
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
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

