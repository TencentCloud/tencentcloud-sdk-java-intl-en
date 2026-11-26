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

public class DescribeInferenceServiceMonitorDataRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Inference service ID. You can input up to 10 inference service IDs.</p>
    */
    @SerializedName("ServiceIds")
    @Expose
    private String [] ServiceIds;

    /**
    * <p>Metric list. A maximum of 10 metrics are supported. Valid values: <li>cpu_usage_average: average CPU usage rate, unit: %, metric type: Float;</li><li>cpu_usage_max: maximum CPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_average: average GPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_max: maximum GPU usage rate, unit: %, metric type: Float;</li><li>instance_num_average: average number of instances, unit: count, metric type: Float;</li><li>instance_num_max: maximum number of instances, unit: count, metric type: Float;</li><li>gpu_memory_usage_max: maximum GPU VRAM usage rate, unit: %, metric type: Float;</li><li>memory_usage_average: average memory usage rate, unit: %, metric type: Float;</li><li>memory_usage_max: maximum memory usage rate, unit: %, metric type: Float;</li></p>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time. The query time range (<code>EndTime - StartTime</code>) must be less than or equal to 30 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Query time granularity. Valid values:</p><li>min: 1 minute, supporting queries within 1 day;</li><li>5min: 5 minutes, supporting queries within 7 days;</li><li>hour: 1 hour, supporting queries within 30 days;</li><li>day: 1 day, supporting queries within 30 days;</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Inference service ID. You can input up to 10 inference service IDs.</p> 
     * @return ServiceIds <p>Inference service ID. You can input up to 10 inference service IDs.</p>
     */
    public String [] getServiceIds() {
        return this.ServiceIds;
    }

    /**
     * Set <p>Inference service ID. You can input up to 10 inference service IDs.</p>
     * @param ServiceIds <p>Inference service ID. You can input up to 10 inference service IDs.</p>
     */
    public void setServiceIds(String [] ServiceIds) {
        this.ServiceIds = ServiceIds;
    }

    /**
     * Get <p>Metric list. A maximum of 10 metrics are supported. Valid values: <li>cpu_usage_average: average CPU usage rate, unit: %, metric type: Float;</li><li>cpu_usage_max: maximum CPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_average: average GPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_max: maximum GPU usage rate, unit: %, metric type: Float;</li><li>instance_num_average: average number of instances, unit: count, metric type: Float;</li><li>instance_num_max: maximum number of instances, unit: count, metric type: Float;</li><li>gpu_memory_usage_max: maximum GPU VRAM usage rate, unit: %, metric type: Float;</li><li>memory_usage_average: average memory usage rate, unit: %, metric type: Float;</li><li>memory_usage_max: maximum memory usage rate, unit: %, metric type: Float;</li></p> 
     * @return MetricNames <p>Metric list. A maximum of 10 metrics are supported. Valid values: <li>cpu_usage_average: average CPU usage rate, unit: %, metric type: Float;</li><li>cpu_usage_max: maximum CPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_average: average GPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_max: maximum GPU usage rate, unit: %, metric type: Float;</li><li>instance_num_average: average number of instances, unit: count, metric type: Float;</li><li>instance_num_max: maximum number of instances, unit: count, metric type: Float;</li><li>gpu_memory_usage_max: maximum GPU VRAM usage rate, unit: %, metric type: Float;</li><li>memory_usage_average: average memory usage rate, unit: %, metric type: Float;</li><li>memory_usage_max: maximum memory usage rate, unit: %, metric type: Float;</li></p>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set <p>Metric list. A maximum of 10 metrics are supported. Valid values: <li>cpu_usage_average: average CPU usage rate, unit: %, metric type: Float;</li><li>cpu_usage_max: maximum CPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_average: average GPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_max: maximum GPU usage rate, unit: %, metric type: Float;</li><li>instance_num_average: average number of instances, unit: count, metric type: Float;</li><li>instance_num_max: maximum number of instances, unit: count, metric type: Float;</li><li>gpu_memory_usage_max: maximum GPU VRAM usage rate, unit: %, metric type: Float;</li><li>memory_usage_average: average memory usage rate, unit: %, metric type: Float;</li><li>memory_usage_max: maximum memory usage rate, unit: %, metric type: Float;</li></p>
     * @param MetricNames <p>Metric list. A maximum of 10 metrics are supported. Valid values: <li>cpu_usage_average: average CPU usage rate, unit: %, metric type: Float;</li><li>cpu_usage_max: maximum CPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_average: average GPU usage rate, unit: %, metric type: Float;</li><li>gpu_usage_max: maximum GPU usage rate, unit: %, metric type: Float;</li><li>instance_num_average: average number of instances, unit: count, metric type: Float;</li><li>instance_num_max: maximum number of instances, unit: count, metric type: Float;</li><li>gpu_memory_usage_max: maximum GPU VRAM usage rate, unit: %, metric type: Float;</li><li>memory_usage_average: average memory usage rate, unit: %, metric type: Float;</li><li>memory_usage_max: maximum memory usage rate, unit: %, metric type: Float;</li></p>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time. The query time range (<code>EndTime - StartTime</code>) must be less than or equal to 30 days.</p> 
     * @return EndTime <p>End time. The query time range (<code>EndTime - StartTime</code>) must be less than or equal to 30 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time. The query time range (<code>EndTime - StartTime</code>) must be less than or equal to 30 days.</p>
     * @param EndTime <p>End time. The query time range (<code>EndTime - StartTime</code>) must be less than or equal to 30 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Query time granularity. Valid values:</p><li>min: 1 minute, supporting queries within 1 day;</li><li>5min: 5 minutes, supporting queries within 7 days;</li><li>hour: 1 hour, supporting queries within 30 days;</li><li>day: 1 day, supporting queries within 30 days;</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days. 
     * @return Interval <p>Query time granularity. Valid values:</p><li>min: 1 minute, supporting queries within 1 day;</li><li>5min: 5 minutes, supporting queries within 7 days;</li><li>hour: 1 hour, supporting queries within 30 days;</li><li>day: 1 day, supporting queries within 30 days;</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Query time granularity. Valid values:</p><li>min: 1 minute, supporting queries within 1 day;</li><li>5min: 5 minutes, supporting queries within 7 days;</li><li>hour: 1 hour, supporting queries within 30 days;</li><li>day: 1 day, supporting queries within 30 days;</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     * @param Interval <p>Query time granularity. Valid values:</p><li>min: 1 minute, supporting queries within 1 day;</li><li>5min: 5 minutes, supporting queries within 7 days;</li><li>hour: 1 hour, supporting queries within 30 days;</li><li>day: 1 day, supporting queries within 30 days;</li>If this parameter is not input, the granularity will be automatically calculated based on the interval between the start time and end time. Specifically, data will be queried with a granularity of min, 5min, hour, and day respectively when the period is no more than 2 hours, no more than 2 days, no more than 7 days, and over 7 days.
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    public DescribeInferenceServiceMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServiceMonitorDataRequest(DescribeInferenceServiceMonitorDataRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ServiceIds != null) {
            this.ServiceIds = new String[source.ServiceIds.length];
            for (int i = 0; i < source.ServiceIds.length; i++) {
                this.ServiceIds[i] = new String(source.ServiceIds[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ServiceIds.", this.ServiceIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

