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

public class DescribeOverviewL7DataRequest extends AbstractModel {

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Queried metric. Valid values:
<li>l7Flow_outFlux: EdgeOne response traffic;</li>
<li>l7Flow_inFlux: EdgeOne request traffic;</li>
<li>l7Flow_outBandwidth: EdgeOne response bandwidth;</li>
<li>l7Flow_inBandwidth: EdgeOne request traffic;</li>
<li>l7Flow_hit_outFlux: cache hit traffic;</li>
<li>l7Flow_request: number of access requests;</li>
<li>l7Flow_flux: upstream and downstream traffic of access requests;</li>
<li>l7Flow_bandwidth: upstream and downstream bandwidths of access requests.</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Site ID set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Queried domain name set. This parameter has been deprecated.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Protocol type of the query. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol;</li>
<li>http2: HTTP/2 protocol;</li>
<li>all: all protocols.</li>If this parameter is not input, the default value `all` is used. This parameter is not yet effective.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Time granularity of the query. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter criteria. The detailed Key values of filter criteria are as follows:
<li>socket:<br>   Filter by [<strong>HTTP protocol type</strong>].<br>   Valid values:<br>   HTTP: HTTP protocol; <br>   HTTPS: HTTPS protocol;<br>   QUIC: QUIC protocol.</li>
<li>domain<br>?? Filter by [<strong>domain name</strong>].</li>
<li>tagKey<br>?? Filter by [<strong>tag key</strong>].</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].</li>
    */
    @SerializedName("Filters")
    @Expose
    private QueryCondition [] Filters;

    /**
    * Data ownership area. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Queried metric. Valid values:
<li>l7Flow_outFlux: EdgeOne response traffic;</li>
<li>l7Flow_inFlux: EdgeOne request traffic;</li>
<li>l7Flow_outBandwidth: EdgeOne response bandwidth;</li>
<li>l7Flow_inBandwidth: EdgeOne request traffic;</li>
<li>l7Flow_hit_outFlux: cache hit traffic;</li>
<li>l7Flow_request: number of access requests;</li>
<li>l7Flow_flux: upstream and downstream traffic of access requests;</li>
<li>l7Flow_bandwidth: upstream and downstream bandwidths of access requests.</li> 
     * @return MetricNames Queried metric. Valid values:
<li>l7Flow_outFlux: EdgeOne response traffic;</li>
<li>l7Flow_inFlux: EdgeOne request traffic;</li>
<li>l7Flow_outBandwidth: EdgeOne response bandwidth;</li>
<li>l7Flow_inBandwidth: EdgeOne request traffic;</li>
<li>l7Flow_hit_outFlux: cache hit traffic;</li>
<li>l7Flow_request: number of access requests;</li>
<li>l7Flow_flux: upstream and downstream traffic of access requests;</li>
<li>l7Flow_bandwidth: upstream and downstream bandwidths of access requests.</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Queried metric. Valid values:
<li>l7Flow_outFlux: EdgeOne response traffic;</li>
<li>l7Flow_inFlux: EdgeOne request traffic;</li>
<li>l7Flow_outBandwidth: EdgeOne response bandwidth;</li>
<li>l7Flow_inBandwidth: EdgeOne request traffic;</li>
<li>l7Flow_hit_outFlux: cache hit traffic;</li>
<li>l7Flow_request: number of access requests;</li>
<li>l7Flow_flux: upstream and downstream traffic of access requests;</li>
<li>l7Flow_bandwidth: upstream and downstream bandwidths of access requests.</li>
     * @param MetricNames Queried metric. Valid values:
<li>l7Flow_outFlux: EdgeOne response traffic;</li>
<li>l7Flow_inFlux: EdgeOne request traffic;</li>
<li>l7Flow_outBandwidth: EdgeOne response bandwidth;</li>
<li>l7Flow_inBandwidth: EdgeOne request traffic;</li>
<li>l7Flow_hit_outFlux: cache hit traffic;</li>
<li>l7Flow_request: number of access requests;</li>
<li>l7Flow_flux: upstream and downstream traffic of access requests;</li>
<li>l7Flow_bandwidth: upstream and downstream bandwidths of access requests.</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Site ID set. This parameter is required. 
     * @return ZoneIds Site ID set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Site ID set. This parameter is required.
     * @param ZoneIds Site ID set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Queried domain name set. This parameter has been deprecated. 
     * @return Domains Queried domain name set. This parameter has been deprecated.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Queried domain name set. This parameter has been deprecated.
     * @param Domains Queried domain name set. This parameter has been deprecated.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Protocol type of the query. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol;</li>
<li>http2: HTTP/2 protocol;</li>
<li>all: all protocols.</li>If this parameter is not input, the default value `all` is used. This parameter is not yet effective. 
     * @return Protocol Protocol type of the query. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol;</li>
<li>http2: HTTP/2 protocol;</li>
<li>all: all protocols.</li>If this parameter is not input, the default value `all` is used. This parameter is not yet effective.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type of the query. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol;</li>
<li>http2: HTTP/2 protocol;</li>
<li>all: all protocols.</li>If this parameter is not input, the default value `all` is used. This parameter is not yet effective.
     * @param Protocol Protocol type of the query. Valid values:
<li>http: HTTP protocol;</li>
<li>https: HTTPS protocol;</li>
<li>http2: HTTP/2 protocol;</li>
<li>all: all protocols.</li>If this parameter is not input, the default value `all` is used. This parameter is not yet effective.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Time granularity of the query. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days. 
     * @return Interval Time granularity of the query. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time granularity of the query. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.
     * @param Interval Time granularity of the query. Valid values:
<li>min: 1 minute;</li>
<li>5min: 5 minutes;</li>
<li>hour: 1 hour;</li>
<li>day: 1 day.</li>If this parameter is not input, the granularity will be automatically inferred based on the interval between the start time and end time. Specifically, the granularity value is min, 5min, hour, and day respectively for queries of data within 1 hour, within 2 days, within 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter criteria. The detailed Key values of filter criteria are as follows:
<li>socket:<br>   Filter by [<strong>HTTP protocol type</strong>].<br>   Valid values:<br>   HTTP: HTTP protocol; <br>   HTTPS: HTTPS protocol;<br>   QUIC: QUIC protocol.</li>
<li>domain<br>?? Filter by [<strong>domain name</strong>].</li>
<li>tagKey<br>?? Filter by [<strong>tag key</strong>].</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].</li> 
     * @return Filters Filter criteria. The detailed Key values of filter criteria are as follows:
<li>socket:<br>   Filter by [<strong>HTTP protocol type</strong>].<br>   Valid values:<br>   HTTP: HTTP protocol; <br>   HTTPS: HTTPS protocol;<br>   QUIC: QUIC protocol.</li>
<li>domain<br>?? Filter by [<strong>domain name</strong>].</li>
<li>tagKey<br>?? Filter by [<strong>tag key</strong>].</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].</li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The detailed Key values of filter criteria are as follows:
<li>socket:<br>   Filter by [<strong>HTTP protocol type</strong>].<br>   Valid values:<br>   HTTP: HTTP protocol; <br>   HTTPS: HTTPS protocol;<br>   QUIC: QUIC protocol.</li>
<li>domain<br>?? Filter by [<strong>domain name</strong>].</li>
<li>tagKey<br>?? Filter by [<strong>tag key</strong>].</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].</li>
     * @param Filters Filter criteria. The detailed Key values of filter criteria are as follows:
<li>socket:<br>   Filter by [<strong>HTTP protocol type</strong>].<br>   Valid values:<br>   HTTP: HTTP protocol; <br>   HTTPS: HTTPS protocol;<br>   QUIC: QUIC protocol.</li>
<li>domain<br>?? Filter by [<strong>domain name</strong>].</li>
<li>tagKey<br>?? Filter by [<strong>tag key</strong>].</li>
<li>tagValue<br>?? Filter by [<strong>tag value</strong>].</li>
     */
    public void setFilters(QueryCondition [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Data ownership area. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used. 
     * @return Area Data ownership area. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Data ownership area. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     * @param Area Data ownership area. Valid values:
<li>overseas: global (excluding the Chinese mainland) data;</li>
<li>mainland: Chinese mainland data;</li>
<li>global: global data.</li>If this parameter is not input, the default value `global` is used.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeOverviewL7DataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewL7DataRequest(DescribeOverviewL7DataRequest source) {
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
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
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
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

