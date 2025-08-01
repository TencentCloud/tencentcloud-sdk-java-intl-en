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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogTimeSeriesStatsResponse extends AbstractModel {

    /**
    * Time range in seconds in histogram.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of slow logs in the specified time range.
    */
    @SerializedName("TimeSeries")
    @Expose
    private TimeSlice [] TimeSeries;

    /**
    * Instance CPU utilization monitoring data in the specified time range.
    */
    @SerializedName("SeriesData")
    @Expose
    private MonitorMetricSeriesData SeriesData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Time range in seconds in histogram. 
     * @return Period Time range in seconds in histogram.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Time range in seconds in histogram.
     * @param Period Time range in seconds in histogram.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of slow logs in the specified time range. 
     * @return TimeSeries Number of slow logs in the specified time range.
     */
    public TimeSlice [] getTimeSeries() {
        return this.TimeSeries;
    }

    /**
     * Set Number of slow logs in the specified time range.
     * @param TimeSeries Number of slow logs in the specified time range.
     */
    public void setTimeSeries(TimeSlice [] TimeSeries) {
        this.TimeSeries = TimeSeries;
    }

    /**
     * Get Instance CPU utilization monitoring data in the specified time range. 
     * @return SeriesData Instance CPU utilization monitoring data in the specified time range.
     */
    public MonitorMetricSeriesData getSeriesData() {
        return this.SeriesData;
    }

    /**
     * Set Instance CPU utilization monitoring data in the specified time range.
     * @param SeriesData Instance CPU utilization monitoring data in the specified time range.
     */
    public void setSeriesData(MonitorMetricSeriesData SeriesData) {
        this.SeriesData = SeriesData;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSlowLogTimeSeriesStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogTimeSeriesStatsResponse(DescribeSlowLogTimeSeriesStatsResponse source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.TimeSeries != null) {
            this.TimeSeries = new TimeSlice[source.TimeSeries.length];
            for (int i = 0; i < source.TimeSeries.length; i++) {
                this.TimeSeries[i] = new TimeSlice(source.TimeSeries[i]);
            }
        }
        if (source.SeriesData != null) {
            this.SeriesData = new MonitorMetricSeriesData(source.SeriesData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "TimeSeries.", this.TimeSeries);
        this.setParamObj(map, prefix + "SeriesData.", this.SeriesData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

