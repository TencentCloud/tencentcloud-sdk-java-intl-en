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

public class DescribeTopL7CacheDataRequest extends AbstractModel {

    /**
    * Start time of the query (client time in RFC 3339)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the query (client time in RFC 3339)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Metric for time-series data query
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Specifies the number of data records to return. If `0` is passed in, all data is returned.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Time interval. Values: {min, 5min, hour, day, week}. This field is optional.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Array of site IDs
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Filter condition
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
     * Get End time of the query (client time in RFC 3339) 
     * @return EndTime End time of the query (client time in RFC 3339)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query (client time in RFC 3339)
     * @param EndTime End time of the query (client time in RFC 3339)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Metric for time-series data query 
     * @return MetricName Metric for time-series data query
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric for time-series data query
     * @param MetricName Metric for time-series data query
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Specifies the number of data records to return. If `0` is passed in, all data is returned. 
     * @return Limit Specifies the number of data records to return. If `0` is passed in, all data is returned.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the number of data records to return. If `0` is passed in, all data is returned.
     * @param Limit Specifies the number of data records to return. If `0` is passed in, all data is returned.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Time interval. Values: {min, 5min, hour, day, week}. This field is optional. 
     * @return Interval Time interval. Values: {min, 5min, hour, day, week}. This field is optional.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Time interval. Values: {min, 5min, hour, day, week}. This field is optional.
     * @param Interval Time interval. Values: {min, 5min, hour, day, week}. This field is optional.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Array of site IDs 
     * @return ZoneIds Array of site IDs
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Array of site IDs
     * @param ZoneIds Array of site IDs
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Filter condition 
     * @return Filters Filter condition
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition
     * @param Filters Filter condition
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTopL7CacheDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7CacheDataRequest(DescribeTopL7CacheDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

