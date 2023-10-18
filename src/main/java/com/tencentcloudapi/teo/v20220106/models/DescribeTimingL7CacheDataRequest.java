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

public class DescribeTimingL7CacheDataRequest extends AbstractModel {

    /**
    * Start time of the query (client time in RFC 3339)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Start time of the query (client time in RFC 3339)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Supported metrics for data query:
`l7Cache_outFlux`: Access traffic
`l7Cache_request`: Access requests
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Time interval. Values: {min, 5min, hour, day, week}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * List of site IDs
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter condition:
{Key: "cacheType", Value: ["hit"], Operator: "equals"}: Filter by data responded from EdgeOne
{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}: Filter by data responded from the origin server
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Start time of the query (client time in RFC 3339) 
     * @return StartTime Start time of the query (client time in RFC 3339)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the query (client time in RFC 3339)
     * @param StartTime Start time of the query (client time in RFC 3339)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Start time of the query (client time in RFC 3339) 
     * @return EndTime Start time of the query (client time in RFC 3339)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Start time of the query (client time in RFC 3339)
     * @param EndTime Start time of the query (client time in RFC 3339)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Supported metrics for data query:
`l7Cache_outFlux`: Access traffic
`l7Cache_request`: Access requests 
     * @return MetricNames Supported metrics for data query:
`l7Cache_outFlux`: Access traffic
`l7Cache_request`: Access requests
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Supported metrics for data query:
`l7Cache_outFlux`: Access traffic
`l7Cache_request`: Access requests
     * @param MetricNames Supported metrics for data query:
`l7Cache_outFlux`: Access traffic
`l7Cache_request`: Access requests
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Time interval. Values: {min, 5min, hour, day, week} 
     * @return Interval Time interval. Values: {min, 5min, hour, day, week}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time interval. Values: {min, 5min, hour, day, week}
     * @param Interval Time interval. Values: {min, 5min, hour, day, week}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
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
     * Get Filter condition:
{Key: "cacheType", Value: ["hit"], Operator: "equals"}: Filter by data responded from EdgeOne
{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}: Filter by data responded from the origin server 
     * @return Filters Filter condition:
{Key: "cacheType", Value: ["hit"], Operator: "equals"}: Filter by data responded from EdgeOne
{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}: Filter by data responded from the origin server
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition:
{Key: "cacheType", Value: ["hit"], Operator: "equals"}: Filter by data responded from EdgeOne
{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}: Filter by data responded from the origin server
     * @param Filters Filter condition:
{Key: "cacheType", Value: ["hit"], Operator: "equals"}: Filter by data responded from EdgeOne
{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}: Filter by data responded from the origin server
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTimingL7CacheDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7CacheDataRequest(DescribeTimingL7CacheDataRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

