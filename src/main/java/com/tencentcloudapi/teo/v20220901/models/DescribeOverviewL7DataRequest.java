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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewL7DataRequest extends AbstractModel {

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
    * The metric to query. Values:
<li>`l7Flow_outFlux`: Traffic used for EdegOne responses</li>
<li>`l7Flow_inFlux`: Traffic used for EdegOne requests</li>
<li>`l7Flow_outBandwidth`: Bandwidth used for EdegOne responses</li>
<li>`l7Flow_inBandwidth`: Bandwidth used for EdegOne requests</li>
<li>`l7Flow_hit_outFlux`: Traffic used for cache hit</li>
<li>`l7Flow_request`: Access requests</li>
<li>`l7Flow_flux`: Upstream and downstream traffic used for client access</li>
<li>`l7Flow_bandwidth`: Upstream and downstream bandwidth used for client access</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * ZoneId set. This parameter is required.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Queried domain name set. This parameter has been discarded.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The protocol type. Values:
<li>`http`: HTTP protocol;</li>
<li>`https`: HTTPS protocol;</li>
<li>`http2`: HTTP2 protocol;</li>
<li>`all`: All protocols. </li>If it's not specified, `all` is used. This parameter is not yet available now.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: One day</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filtering condition. The detailed filtering condition key values are as follows: 
<li>socket: Filter based on HTTP protocol type. Corresponding value options: <br> HTTP: HTTP protocol; <br> HTTPS: HTTPS protocol; <br> QUIC: QUIC protocol. </li>
<li>domains: Filter based on domain name. </li>
<li>tagKey: Filter based on Tag Key. </li>
<li>tagValue: Filter based on Tag Value. </li>
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
     * Get The metric to query. Values:
<li>`l7Flow_outFlux`: Traffic used for EdegOne responses</li>
<li>`l7Flow_inFlux`: Traffic used for EdegOne requests</li>
<li>`l7Flow_outBandwidth`: Bandwidth used for EdegOne responses</li>
<li>`l7Flow_inBandwidth`: Bandwidth used for EdegOne requests</li>
<li>`l7Flow_hit_outFlux`: Traffic used for cache hit</li>
<li>`l7Flow_request`: Access requests</li>
<li>`l7Flow_flux`: Upstream and downstream traffic used for client access</li>
<li>`l7Flow_bandwidth`: Upstream and downstream bandwidth used for client access</li> 
     * @return MetricNames The metric to query. Values:
<li>`l7Flow_outFlux`: Traffic used for EdegOne responses</li>
<li>`l7Flow_inFlux`: Traffic used for EdegOne requests</li>
<li>`l7Flow_outBandwidth`: Bandwidth used for EdegOne responses</li>
<li>`l7Flow_inBandwidth`: Bandwidth used for EdegOne requests</li>
<li>`l7Flow_hit_outFlux`: Traffic used for cache hit</li>
<li>`l7Flow_request`: Access requests</li>
<li>`l7Flow_flux`: Upstream and downstream traffic used for client access</li>
<li>`l7Flow_bandwidth`: Upstream and downstream bandwidth used for client access</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set The metric to query. Values:
<li>`l7Flow_outFlux`: Traffic used for EdegOne responses</li>
<li>`l7Flow_inFlux`: Traffic used for EdegOne requests</li>
<li>`l7Flow_outBandwidth`: Bandwidth used for EdegOne responses</li>
<li>`l7Flow_inBandwidth`: Bandwidth used for EdegOne requests</li>
<li>`l7Flow_hit_outFlux`: Traffic used for cache hit</li>
<li>`l7Flow_request`: Access requests</li>
<li>`l7Flow_flux`: Upstream and downstream traffic used for client access</li>
<li>`l7Flow_bandwidth`: Upstream and downstream bandwidth used for client access</li>
     * @param MetricNames The metric to query. Values:
<li>`l7Flow_outFlux`: Traffic used for EdegOne responses</li>
<li>`l7Flow_inFlux`: Traffic used for EdegOne requests</li>
<li>`l7Flow_outBandwidth`: Bandwidth used for EdegOne responses</li>
<li>`l7Flow_inBandwidth`: Bandwidth used for EdegOne requests</li>
<li>`l7Flow_hit_outFlux`: Traffic used for cache hit</li>
<li>`l7Flow_request`: Access requests</li>
<li>`l7Flow_flux`: Upstream and downstream traffic used for client access</li>
<li>`l7Flow_bandwidth`: Upstream and downstream bandwidth used for client access</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get ZoneId set. This parameter is required. 
     * @return ZoneIds ZoneId set. This parameter is required.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set ZoneId set. This parameter is required.
     * @param ZoneIds ZoneId set. This parameter is required.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Queried domain name set. This parameter has been discarded. 
     * @return Domains Queried domain name set. This parameter has been discarded.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Queried domain name set. This parameter has been discarded.
     * @param Domains Queried domain name set. This parameter has been discarded.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The protocol type. Values:
<li>`http`: HTTP protocol;</li>
<li>`https`: HTTPS protocol;</li>
<li>`http2`: HTTP2 protocol;</li>
<li>`all`: All protocols. </li>If it's not specified, `all` is used. This parameter is not yet available now. 
     * @return Protocol The protocol type. Values:
<li>`http`: HTTP protocol;</li>
<li>`https`: HTTPS protocol;</li>
<li>`http2`: HTTP2 protocol;</li>
<li>`all`: All protocols. </li>If it's not specified, `all` is used. This parameter is not yet available now.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set The protocol type. Values:
<li>`http`: HTTP protocol;</li>
<li>`https`: HTTPS protocol;</li>
<li>`http2`: HTTP2 protocol;</li>
<li>`all`: All protocols. </li>If it's not specified, `all` is used. This parameter is not yet available now.
     * @param Protocol The protocol type. Values:
<li>`http`: HTTP protocol;</li>
<li>`https`: HTTPS protocol;</li>
<li>`http2`: HTTP2 protocol;</li>
<li>`all`: All protocols. </li>If it's not specified, `all` is used. This parameter is not yet available now.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: One day</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`. 
     * @return Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: One day</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: One day</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     * @param Interval The query granularity. Values:
<li>`min`: 1 minute;</li>
<li>`5min`: 5 minutes;</li>
<li>`hour`: 1 hour;</li>
<li>`day`: One day</li>If this field is not specified, the granularity will be determined based on the query period. <br>Period <= 1 hour: `min`; <br>1 hour < Period <= 2 days: `5min`; <br>2 days < period <= 7 days: `hour`; <br>Period > 7 days: `day`.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filtering condition. The detailed filtering condition key values are as follows: 
<li>socket: Filter based on HTTP protocol type. Corresponding value options: <br> HTTP: HTTP protocol; <br> HTTPS: HTTPS protocol; <br> QUIC: QUIC protocol. </li>
<li>domains: Filter based on domain name. </li>
<li>tagKey: Filter based on Tag Key. </li>
<li>tagValue: Filter based on Tag Value. </li> 
     * @return Filters Filtering condition. The detailed filtering condition key values are as follows: 
<li>socket: Filter based on HTTP protocol type. Corresponding value options: <br> HTTP: HTTP protocol; <br> HTTPS: HTTPS protocol; <br> QUIC: QUIC protocol. </li>
<li>domains: Filter based on domain name. </li>
<li>tagKey: Filter based on Tag Key. </li>
<li>tagValue: Filter based on Tag Value. </li>
     */
    public QueryCondition [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering condition. The detailed filtering condition key values are as follows: 
<li>socket: Filter based on HTTP protocol type. Corresponding value options: <br> HTTP: HTTP protocol; <br> HTTPS: HTTPS protocol; <br> QUIC: QUIC protocol. </li>
<li>domains: Filter based on domain name. </li>
<li>tagKey: Filter based on Tag Key. </li>
<li>tagValue: Filter based on Tag Value. </li>
     * @param Filters Filtering condition. The detailed filtering condition key values are as follows: 
<li>socket: Filter based on HTTP protocol type. Corresponding value options: <br> HTTP: HTTP protocol; <br> HTTPS: HTTPS protocol; <br> QUIC: QUIC protocol. </li>
<li>domains: Filter based on domain name. </li>
<li>tagKey: Filter based on Tag Key. </li>
<li>tagValue: Filter based on Tag Value. </li>
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

