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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordingRuleTaskRequest extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Source metric topic id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Target metric topic id.</p>
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * <p>Task Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Task start status. 1: Enabled, 2: Disabled</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>Schedule start time, Unix timestamp, in milliseconds</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * <p>Scheduling interval (minutes), supported range (0,1440] minutes.</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>Execution Delay (Seconds)</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>Metric name</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>Execution statement (PromQL)</p>
    */
    @SerializedName("RecordingRuleContent")
    @Expose
    private String RecordingRuleContent;

    /**
    * <p>Custom metric name</p>
    */
    @SerializedName("CustomMetricLabels")
    @Expose
    private MetricLabel [] CustomMetricLabels;

    /**
    * <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Source metric topic id</p> 
     * @return TopicId <p>Source metric topic id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Source metric topic id</p>
     * @param TopicId <p>Source metric topic id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Target metric topic id.</p> 
     * @return DstTopicId <p>Target metric topic id.</p>
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set <p>Target metric topic id.</p>
     * @param DstTopicId <p>Target metric topic id.</p>
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get <p>Task Name</p> 
     * @return Name <p>Task Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Task Name</p>
     * @param Name <p>Task Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Task start status. 1: Enabled, 2: Disabled</p> 
     * @return EnableFlag <p>Task start status. 1: Enabled, 2: Disabled</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>Task start status. 1: Enabled, 2: Disabled</p>
     * @param EnableFlag <p>Task start status. 1: Enabled, 2: Disabled</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>Schedule start time, Unix timestamp, in milliseconds</p> 
     * @return ProcessStartTime <p>Schedule start time, Unix timestamp, in milliseconds</p>
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>Schedule start time, Unix timestamp, in milliseconds</p>
     * @param ProcessStartTime <p>Schedule start time, Unix timestamp, in milliseconds</p>
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>Scheduling interval (minutes), supported range (0,1440] minutes.</p> 
     * @return ProcessPeriod <p>Scheduling interval (minutes), supported range (0,1440] minutes.</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>Scheduling interval (minutes), supported range (0,1440] minutes.</p>
     * @param ProcessPeriod <p>Scheduling interval (minutes), supported range (0,1440] minutes.</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>Execution Delay (Seconds)</p> 
     * @return ProcessDelay <p>Execution Delay (Seconds)</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>Execution Delay (Seconds)</p>
     * @param ProcessDelay <p>Execution Delay (Seconds)</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>Metric name</p> 
     * @return MetricName <p>Metric name</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>Metric name</p>
     * @param MetricName <p>Metric name</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>Execution statement (PromQL)</p> 
     * @return RecordingRuleContent <p>Execution statement (PromQL)</p>
     */
    public String getRecordingRuleContent() {
        return this.RecordingRuleContent;
    }

    /**
     * Set <p>Execution statement (PromQL)</p>
     * @param RecordingRuleContent <p>Execution statement (PromQL)</p>
     */
    public void setRecordingRuleContent(String RecordingRuleContent) {
        this.RecordingRuleContent = RecordingRuleContent;
    }

    /**
     * Get <p>Custom metric name</p> 
     * @return CustomMetricLabels <p>Custom metric name</p>
     */
    public MetricLabel [] getCustomMetricLabels() {
        return this.CustomMetricLabels;
    }

    /**
     * Set <p>Custom metric name</p>
     * @param CustomMetricLabels <p>Custom metric name</p>
     */
    public void setCustomMetricLabels(MetricLabel [] CustomMetricLabels) {
        this.CustomMetricLabels = CustomMetricLabels;
    }

    /**
     * Get <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p> 
     * @return HasServicesLog <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     * @param HasServicesLog <p>Whether to enable service log shipping. Valid values: 1: disable; 2: enable.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyRecordingRuleTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordingRuleTaskRequest(ModifyRecordingRuleTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnableFlag != null) {
            this.EnableFlag = new Long(source.EnableFlag);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new Long(source.ProcessStartTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.RecordingRuleContent != null) {
            this.RecordingRuleContent = new String(source.RecordingRuleContent);
        }
        if (source.CustomMetricLabels != null) {
            this.CustomMetricLabels = new MetricLabel[source.CustomMetricLabels.length];
            for (int i = 0; i < source.CustomMetricLabels.length; i++) {
                this.CustomMetricLabels[i] = new MetricLabel(source.CustomMetricLabels[i]);
            }
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "RecordingRuleContent", this.RecordingRuleContent);
        this.setParamArrayObj(map, prefix + "CustomMetricLabels.", this.CustomMetricLabels);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

