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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourceGroupMetricsRequest extends AbstractModel {

    /**
    * Execution resource group id.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Start time of usage trend (ms). default last hour.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Usage trend end time (ms), default current.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Metrics and dimensions.

-all.
-task metrics.
-system metrics.
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * Metric collection granularity, in minutes, default 1 minute.
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * Get Execution resource group id. 
     * @return ResourceGroupId Execution resource group id.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set Execution resource group id.
     * @param ResourceGroupId Execution resource group id.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Start time of usage trend (ms). default last hour. 
     * @return StartTime Start time of usage trend (ms). default last hour.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of usage trend (ms). default last hour.
     * @param StartTime Start time of usage trend (ms). default last hour.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Usage trend end time (ms), default current. 
     * @return EndTime Usage trend end time (ms), default current.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Usage trend end time (ms), default current.
     * @param EndTime Usage trend end time (ms), default current.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Metrics and dimensions.

-all.
-task metrics.
-system metrics. 
     * @return MetricType Metrics and dimensions.

-all.
-task metrics.
-system metrics.
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set Metrics and dimensions.

-all.
-task metrics.
-system metrics.
     * @param MetricType Metrics and dimensions.

-all.
-task metrics.
-system metrics.
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get Metric collection granularity, in minutes, default 1 minute. 
     * @return Granularity Metric collection granularity, in minutes, default 1 minute.
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Metric collection granularity, in minutes, default 1 minute.
     * @param Granularity Metric collection granularity, in minutes, default 1 minute.
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    public GetResourceGroupMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourceGroupMetricsRequest(GetResourceGroupMetricsRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.Granularity != null) {
            this.Granularity = new Long(source.Granularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

