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

public class DescribeDistributionL4AccessDataRequest extends AbstractModel{

    /**
    * Query start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Query metric. Vaules: 
<li>`l4Flow_connection_distribution`: Distribution of connection duration</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * IDs of sites to be queried. All sites will be selected if this field is not specified.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period ≤ 1 hour**: 1-minute granularity; **1 hour < query period ≤ 2 days**: 5-minute granularity; **2 days < query period ≤ 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Filter conditions. See below for details: 
<li>`ruleId`:<br>   Filter by the <strong>forwarding rule ID</strong><br>   Type: String<br>   Required: No</li>
<li>`proxyId`:<br>   Filter by the <strong>L4 proxy ID</strong><br>   Type: String<br>   Required: No</li>
    */
    @SerializedName("QueryConditions")
    @Expose
    private QueryCondition [] QueryConditions;

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
     * Get Query start time 
     * @return StartTime Query start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time
     * @param StartTime Query start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time 
     * @return EndTime Query end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time
     * @param EndTime Query end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Query metric. Vaules: 
<li>`l4Flow_connection_distribution`: Distribution of connection duration</li> 
     * @return MetricNames Query metric. Vaules: 
<li>`l4Flow_connection_distribution`: Distribution of connection duration</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Query metric. Vaules: 
<li>`l4Flow_connection_distribution`: Distribution of connection duration</li>
     * @param MetricNames Query metric. Vaules: 
<li>`l4Flow_connection_distribution`: Distribution of connection duration</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get IDs of sites to be queried. All sites will be selected if this field is not specified. 
     * @return ZoneIds IDs of sites to be queried. All sites will be selected if this field is not specified.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set IDs of sites to be queried. All sites will be selected if this field is not specified.
     * @param ZoneIds IDs of sites to be queried. All sites will be selected if this field is not specified.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period ≤ 1 hour**: 1-minute granularity; **1 hour < query period ≤ 2 days**: 5-minute granularity; **2 days < query period ≤ 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity. 
     * @return Interval The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period ≤ 1 hour**: 1-minute granularity; **1 hour < query period ≤ 2 days**: 5-minute granularity; **2 days < query period ≤ 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period ≤ 1 hour**: 1-minute granularity; **1 hour < query period ≤ 2 days**: 5-minute granularity; **2 days < query period ≤ 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     * @param Interval The query granularity. Values:
<li>`min`: 1 minute</li>
<li>`5min`: 5 minutes</li>
<li>`hour`: 1 hour</li>
<li>`day`: 1 day</li>If this field is not specified, the granularity is determined based on the query period. **Query period ≤ 1 hour**: 1-minute granularity; **1 hour < query period ≤ 2 days**: 5-minute granularity; **2 days < query period ≤ 7 days**: 1 hour granularity; **Query period > 7 days**: 1 day granularity.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Filter conditions. See below for details: 
<li>`ruleId`:<br>   Filter by the <strong>forwarding rule ID</strong><br>   Type: String<br>   Required: No</li>
<li>`proxyId`:<br>   Filter by the <strong>L4 proxy ID</strong><br>   Type: String<br>   Required: No</li> 
     * @return QueryConditions Filter conditions. See below for details: 
<li>`ruleId`:<br>   Filter by the <strong>forwarding rule ID</strong><br>   Type: String<br>   Required: No</li>
<li>`proxyId`:<br>   Filter by the <strong>L4 proxy ID</strong><br>   Type: String<br>   Required: No</li>
     */
    public QueryCondition [] getQueryConditions() {
        return this.QueryConditions;
    }

    /**
     * Set Filter conditions. See below for details: 
<li>`ruleId`:<br>   Filter by the <strong>forwarding rule ID</strong><br>   Type: String<br>   Required: No</li>
<li>`proxyId`:<br>   Filter by the <strong>L4 proxy ID</strong><br>   Type: String<br>   Required: No</li>
     * @param QueryConditions Filter conditions. See below for details: 
<li>`ruleId`:<br>   Filter by the <strong>forwarding rule ID</strong><br>   Type: String<br>   Required: No</li>
<li>`proxyId`:<br>   Filter by the <strong>L4 proxy ID</strong><br>   Type: String<br>   Required: No</li>
     */
    public void setQueryConditions(QueryCondition [] QueryConditions) {
        this.QueryConditions = QueryConditions;
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

    public DescribeDistributionL4AccessDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDistributionL4AccessDataRequest(DescribeDistributionL4AccessDataRequest source) {
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
        if (source.QueryConditions != null) {
            this.QueryConditions = new QueryCondition[source.QueryConditions.length];
            for (int i = 0; i < source.QueryConditions.length; i++) {
                this.QueryConditions[i] = new QueryCondition(source.QueryConditions[i]);
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
        this.setParamArrayObj(map, prefix + "QueryConditions.", this.QueryConditions);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

