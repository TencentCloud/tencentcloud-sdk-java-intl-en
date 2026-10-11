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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorMetricItem extends AbstractModel {

    /**
    * Monitoring Metric Types. There are three types: 1. RUN_DURATION (running time) 2. WAIT_DURATION (waiting duration) 3. COMPLETION_TIME (completion time)
    */
    @SerializedName("MetricType")
    @Expose
    private String MetricType;

    /**
    * Alarm threshold in milliseconds. For COMPLETION_TIME: calculated from 00:00 of the current day.
    */
    @SerializedName("WarningThreshold")
    @Expose
    private String WarningThreshold;

    /**
    * Timeout threshold in milliseconds. For COMPLETION_TIME, it is calculated from 00:00 of the current day.
    */
    @SerializedName("TimeoutThreshold")
    @Expose
    private String TimeoutThreshold;

    /**
     * Get Monitoring Metric Types. There are three types: 1. RUN_DURATION (running time) 2. WAIT_DURATION (waiting duration) 3. COMPLETION_TIME (completion time) 
     * @return MetricType Monitoring Metric Types. There are three types: 1. RUN_DURATION (running time) 2. WAIT_DURATION (waiting duration) 3. COMPLETION_TIME (completion time)
     */
    public String getMetricType() {
        return this.MetricType;
    }

    /**
     * Set Monitoring Metric Types. There are three types: 1. RUN_DURATION (running time) 2. WAIT_DURATION (waiting duration) 3. COMPLETION_TIME (completion time)
     * @param MetricType Monitoring Metric Types. There are three types: 1. RUN_DURATION (running time) 2. WAIT_DURATION (waiting duration) 3. COMPLETION_TIME (completion time)
     */
    public void setMetricType(String MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get Alarm threshold in milliseconds. For COMPLETION_TIME: calculated from 00:00 of the current day. 
     * @return WarningThreshold Alarm threshold in milliseconds. For COMPLETION_TIME: calculated from 00:00 of the current day.
     */
    public String getWarningThreshold() {
        return this.WarningThreshold;
    }

    /**
     * Set Alarm threshold in milliseconds. For COMPLETION_TIME: calculated from 00:00 of the current day.
     * @param WarningThreshold Alarm threshold in milliseconds. For COMPLETION_TIME: calculated from 00:00 of the current day.
     */
    public void setWarningThreshold(String WarningThreshold) {
        this.WarningThreshold = WarningThreshold;
    }

    /**
     * Get Timeout threshold in milliseconds. For COMPLETION_TIME, it is calculated from 00:00 of the current day. 
     * @return TimeoutThreshold Timeout threshold in milliseconds. For COMPLETION_TIME, it is calculated from 00:00 of the current day.
     */
    public String getTimeoutThreshold() {
        return this.TimeoutThreshold;
    }

    /**
     * Set Timeout threshold in milliseconds. For COMPLETION_TIME, it is calculated from 00:00 of the current day.
     * @param TimeoutThreshold Timeout threshold in milliseconds. For COMPLETION_TIME, it is calculated from 00:00 of the current day.
     */
    public void setTimeoutThreshold(String TimeoutThreshold) {
        this.TimeoutThreshold = TimeoutThreshold;
    }

    public MonitorMetricItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorMetricItem(MonitorMetricItem source) {
        if (source.MetricType != null) {
            this.MetricType = new String(source.MetricType);
        }
        if (source.WarningThreshold != null) {
            this.WarningThreshold = new String(source.WarningThreshold);
        }
        if (source.TimeoutThreshold != null) {
            this.TimeoutThreshold = new String(source.TimeoutThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "WarningThreshold", this.WarningThreshold);
        this.setParamSimple(map, prefix + "TimeoutThreshold", this.TimeoutThreshold);

    }
}

