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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimingL4DataRequest extends AbstractModel{

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
`l4Flow_connections`: Access connections
`l4Flow_flux`: Access traffic
`l4Flow_inFlux`: Inbound traffic
`l4Flow_outFlux`: Outbound traffic
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * List of site IDs
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * This field has been disused. Use `ProxyIds` instead.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * This field is not supported currently.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Time interval. Valid values: {min, 5min, hour, day}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * This field is not supported currently. Use `Filter` instead.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Supported filters: `proxyd`, `ruleId`
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * List of layer-4 proxies
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

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
`l4Flow_connections`: Access connections
`l4Flow_flux`: Access traffic
`l4Flow_inFlux`: Inbound traffic
`l4Flow_outFlux`: Outbound traffic 
     * @return MetricNames Supported metrics for data query:
`l4Flow_connections`: Access connections
`l4Flow_flux`: Access traffic
`l4Flow_inFlux`: Inbound traffic
`l4Flow_outFlux`: Outbound traffic
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Supported metrics for data query:
`l4Flow_connections`: Access connections
`l4Flow_flux`: Access traffic
`l4Flow_inFlux`: Inbound traffic
`l4Flow_outFlux`: Outbound traffic
     * @param MetricNames Supported metrics for data query:
`l4Flow_connections`: Access connections
`l4Flow_flux`: Access traffic
`l4Flow_inFlux`: Inbound traffic
`l4Flow_outFlux`: Outbound traffic
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get List of site IDs 
     * @return ZoneIds List of site IDs
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set List of site IDs
     * @param ZoneIds List of site IDs
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get This field has been disused. Use `ProxyIds` instead. 
     * @return InstanceIds This field has been disused. Use `ProxyIds` instead.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set This field has been disused. Use `ProxyIds` instead.
     * @param InstanceIds This field has been disused. Use `ProxyIds` instead.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get This field is not supported currently. 
     * @return Protocol This field is not supported currently.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set This field is not supported currently.
     * @param Protocol This field is not supported currently.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Time interval. Valid values: {min, 5min, hour, day} 
     * @return Interval Time interval. Valid values: {min, 5min, hour, day}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time interval. Valid values: {min, 5min, hour, day}
     * @param Interval Time interval. Valid values: {min, 5min, hour, day}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get This field is not supported currently. Use `Filter` instead. 
     * @return RuleId This field is not supported currently. Use `Filter` instead.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set This field is not supported currently. Use `Filter` instead.
     * @param RuleId This field is not supported currently. Use `Filter` instead.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Supported filters: `proxyd`, `ruleId` 
     * @return Filters Supported filters: `proxyd`, `ruleId`
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Supported filters: `proxyd`, `ruleId`
     * @param Filters Supported filters: `proxyd`, `ruleId`
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get List of layer-4 proxies 
     * @return ProxyIds List of layer-4 proxies
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set List of layer-4 proxies
     * @param ProxyIds List of layer-4 proxies
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    public DescribeTimingL4DataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL4DataRequest(DescribeTimingL4DataRequest source) {
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
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);

    }
}

