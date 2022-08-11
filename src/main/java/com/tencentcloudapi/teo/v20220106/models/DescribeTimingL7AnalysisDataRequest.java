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

public class DescribeTimingL7AnalysisDataRequest extends AbstractModel{

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
    * Array of `ZoneId` values
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Array of `ZoneId` values 
     * @return ZoneIds Array of `ZoneId` values
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Array of `ZoneId` values
     * @param ZoneIds Array of `ZoneId` values
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filter 
     * @return Filters Filter
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
     * @param Filters Filter
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTimingL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7AnalysisDataRequest(DescribeTimingL7AnalysisDataRequest source) {
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

