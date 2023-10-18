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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewL7DataRequest extends AbstractModel {

    /**
    * Client time in RFC 3339 format
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Client time in RFC 3339 format
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Supported metrics for data query:
`l7Flow_outFlux`: Access traffic
`l7Flow_request`: Access requests
`l7Flow_outBandwidth`: Access bandwidth
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Time interval. Valid values: {min, 5min, hour, day, week}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * List of `ZoneId` values. This parameter takes effect only when querying in the zone/domain dimension.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * List of `Domain` values. This parameter takes effect only when querying in the domain dimension.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * Protocol type. Valid values: {http,http2,https,all}
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Client time in RFC 3339 format 
     * @return StartTime Client time in RFC 3339 format
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Client time in RFC 3339 format
     * @param StartTime Client time in RFC 3339 format
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Client time in RFC 3339 format 
     * @return EndTime Client time in RFC 3339 format
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Client time in RFC 3339 format
     * @param EndTime Client time in RFC 3339 format
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Supported metrics for data query:
`l7Flow_outFlux`: Access traffic
`l7Flow_request`: Access requests
`l7Flow_outBandwidth`: Access bandwidth 
     * @return MetricNames Supported metrics for data query:
`l7Flow_outFlux`: Access traffic
`l7Flow_request`: Access requests
`l7Flow_outBandwidth`: Access bandwidth
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Supported metrics for data query:
`l7Flow_outFlux`: Access traffic
`l7Flow_request`: Access requests
`l7Flow_outBandwidth`: Access bandwidth
     * @param MetricNames Supported metrics for data query:
`l7Flow_outFlux`: Access traffic
`l7Flow_request`: Access requests
`l7Flow_outBandwidth`: Access bandwidth
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Time interval. Valid values: {min, 5min, hour, day, week} 
     * @return Interval Time interval. Valid values: {min, 5min, hour, day, week}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time interval. Valid values: {min, 5min, hour, day, week}
     * @param Interval Time interval. Valid values: {min, 5min, hour, day, week}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get List of `ZoneId` values. This parameter takes effect only when querying in the zone/domain dimension. 
     * @return ZoneIds List of `ZoneId` values. This parameter takes effect only when querying in the zone/domain dimension.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of `ZoneId` values. This parameter takes effect only when querying in the zone/domain dimension.
     * @param ZoneIds List of `ZoneId` values. This parameter takes effect only when querying in the zone/domain dimension.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get List of `Domain` values. This parameter takes effect only when querying in the domain dimension. 
     * @return Domains List of `Domain` values. This parameter takes effect only when querying in the domain dimension.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of `Domain` values. This parameter takes effect only when querying in the domain dimension.
     * @param Domains List of `Domain` values. This parameter takes effect only when querying in the domain dimension.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Protocol type. Valid values: {http,http2,https,all} 
     * @return Protocol Protocol type. Valid values: {http,http2,https,all}
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type. Valid values: {http,http2,https,all}
     * @param Protocol Protocol type. Valid values: {http,http2,https,all}
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

