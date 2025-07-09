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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmIndicatorInfo extends AbstractModel {

    /**
    * Metric ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Alert Metrics, 0 for task failure, 1 for task execution timeout, 2 for task stop, 3 for task pause, 4 read speed, 5 write speed, 6 read throughput, 7 write throughput, 8 dirty data byte count, 9 number of dirty data entries, 10 task exception, 11 task detection anomaly, 12 restart times, 13 task delay, 14 number of restarts within the last 20 minutes, 15 transmission delay, 16 business delay, 50 offline package CPU usage rate, 51 offline package memory usage rate, 52 offline package parallelism utilization, 53 number of instances queued for offline packages, 54 real-time package resource utilization, 55 number of tasks running in real-time packages
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * Metric Threshold, 1 for the first run failure of an offline task, 2 for all retries failed of an offline task
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * Estimated timeout duration, minute level
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * Alert threshold operator, 1 Greater than, 2 Less than
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
    * Alert metric threshold unit: ms (milliseconds), s (seconds), min (minutes)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmIndicatorUnit")
    @Expose
    private String AlarmIndicatorUnit;

    /**
    * Alert Interval
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Alert interval unit: hour, minute, day
    */
    @SerializedName("DurationUnit")
    @Expose
    private String DurationUnit;

    /**
    * Maximum number of alerts within a cycle
    */
    @SerializedName("MaxTimes")
    @Expose
    private Long MaxTimes;

    /**
    * Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * Get Metric ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Metric ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Metric ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Id Metric ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Alert Metrics, 0 for task failure, 1 for task execution timeout, 2 for task stop, 3 for task pause, 4 read speed, 5 write speed, 6 read throughput, 7 write throughput, 8 dirty data byte count, 9 number of dirty data entries, 10 task exception, 11 task detection anomaly, 12 restart times, 13 task delay, 14 number of restarts within the last 20 minutes, 15 transmission delay, 16 business delay, 50 offline package CPU usage rate, 51 offline package memory usage rate, 52 offline package parallelism utilization, 53 number of instances queued for offline packages, 54 real-time package resource utilization, 55 number of tasks running in real-time packages
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmIndicator Alert Metrics, 0 for task failure, 1 for task execution timeout, 2 for task stop, 3 for task pause, 4 read speed, 5 write speed, 6 read throughput, 7 write throughput, 8 dirty data byte count, 9 number of dirty data entries, 10 task exception, 11 task detection anomaly, 12 restart times, 13 task delay, 14 number of restarts within the last 20 minutes, 15 transmission delay, 16 business delay, 50 offline package CPU usage rate, 51 offline package memory usage rate, 52 offline package parallelism utilization, 53 number of instances queued for offline packages, 54 real-time package resource utilization, 55 number of tasks running in real-time packages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set Alert Metrics, 0 for task failure, 1 for task execution timeout, 2 for task stop, 3 for task pause, 4 read speed, 5 write speed, 6 read throughput, 7 write throughput, 8 dirty data byte count, 9 number of dirty data entries, 10 task exception, 11 task detection anomaly, 12 restart times, 13 task delay, 14 number of restarts within the last 20 minutes, 15 transmission delay, 16 business delay, 50 offline package CPU usage rate, 51 offline package memory usage rate, 52 offline package parallelism utilization, 53 number of instances queued for offline packages, 54 real-time package resource utilization, 55 number of tasks running in real-time packages
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmIndicator Alert Metrics, 0 for task failure, 1 for task execution timeout, 2 for task stop, 3 for task pause, 4 read speed, 5 write speed, 6 read throughput, 7 write throughput, 8 dirty data byte count, 9 number of dirty data entries, 10 task exception, 11 task detection anomaly, 12 restart times, 13 task delay, 14 number of restarts within the last 20 minutes, 15 transmission delay, 16 business delay, 50 offline package CPU usage rate, 51 offline package memory usage rate, 52 offline package parallelism utilization, 53 number of instances queued for offline packages, 54 real-time package resource utilization, 55 number of tasks running in real-time packages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmIndicatorDesc Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmIndicatorDesc() {
        return this.AlarmIndicatorDesc;
    }

    /**
     * Set Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmIndicatorDesc Alert Metric Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmIndicatorDesc(String AlarmIndicatorDesc) {
        this.AlarmIndicatorDesc = AlarmIndicatorDesc;
    }

    /**
     * Get Metric Threshold, 1 for the first run failure of an offline task, 2 for all retries failed of an offline task
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerType Metric Threshold, 1 for the first run failure of an offline task, 2 for all retries failed of an offline task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Metric Threshold, 1 for the first run failure of an offline task, 2 for all retries failed of an offline task
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerType Metric Threshold, 1 for the first run failure of an offline task, 2 for all retries failed of an offline task
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Estimated timeout duration, minute level
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EstimatedTime Estimated timeout duration, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set Estimated timeout duration, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EstimatedTime Estimated timeout duration, minute level
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get Alert threshold operator, 1 Greater than, 2 Less than
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Alert threshold operator, 1 Greater than, 2 Less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set Alert threshold operator, 1 Greater than, 2 Less than
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Alert threshold operator, 1 Greater than, 2 Less than
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Alert metric threshold unit: ms (milliseconds), s (seconds), min (minutes)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmIndicatorUnit Alert metric threshold unit: ms (milliseconds), s (seconds), min (minutes)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getAlarmIndicatorUnit() {
        return this.AlarmIndicatorUnit;
    }

    /**
     * Set Alert metric threshold unit: ms (milliseconds), s (seconds), min (minutes)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmIndicatorUnit Alert metric threshold unit: ms (milliseconds), s (seconds), min (minutes)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmIndicatorUnit(String AlarmIndicatorUnit) {
        this.AlarmIndicatorUnit = AlarmIndicatorUnit;
    }

    /**
     * Get Alert Interval 
     * @return Duration Alert Interval
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Alert Interval
     * @param Duration Alert Interval
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Alert interval unit: hour, minute, day 
     * @return DurationUnit Alert interval unit: hour, minute, day
     */
    public String getDurationUnit() {
        return this.DurationUnit;
    }

    /**
     * Set Alert interval unit: hour, minute, day
     * @param DurationUnit Alert interval unit: hour, minute, day
     */
    public void setDurationUnit(String DurationUnit) {
        this.DurationUnit = DurationUnit;
    }

    /**
     * Get Maximum number of alerts within a cycle 
     * @return MaxTimes Maximum number of alerts within a cycle
     */
    public Long getMaxTimes() {
        return this.MaxTimes;
    }

    /**
     * Set Maximum number of alerts within a cycle
     * @param MaxTimes Maximum number of alerts within a cycle
     */
    public void setMaxTimes(Long MaxTimes) {
        this.MaxTimes = MaxTimes;
    }

    /**
     * Get Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Threshold Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Threshold Metric Threshold
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    public AlarmIndicatorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmIndicatorInfo(AlarmIndicatorInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
        if (source.AlarmIndicatorUnit != null) {
            this.AlarmIndicatorUnit = new String(source.AlarmIndicatorUnit);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.DurationUnit != null) {
            this.DurationUnit = new String(source.DurationUnit);
        }
        if (source.MaxTimes != null) {
            this.MaxTimes = new Long(source.MaxTimes);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "AlarmIndicatorUnit", this.AlarmIndicatorUnit);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "DurationUnit", this.DurationUnit);
        this.setParamSimple(map, prefix + "MaxTimes", this.MaxTimes);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

