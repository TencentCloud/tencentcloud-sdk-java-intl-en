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

public class RecordingRuleTaskInfo extends AbstractModel {

    /**
    * Pre-aggregation task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Source Log Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Pre-aggregation task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Task Update Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Task status: 1: Running 2: Stopped 3: Error - Source log topic not found 4: Error - Target topic not found

5: Access permission issue 6: Internal failure 7: Other faults
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task status: 1 Enabled, 2 Disabled
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * Schedule Start Time
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private Long ProcessStartTime;

    /**
    * Scheduling Interval (Minutes)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * Execution Delay (Seconds)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * Pre-aggregation search statement.
    */
    @SerializedName("RecordingRuleContent")
    @Expose
    private String RecordingRuleContent;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Custom metric name.
    */
    @SerializedName("CustomMetricLabels")
    @Expose
    private MetricLabel [] CustomMetricLabels;

    /**
    * YAML configuration file ID.
    */
    @SerializedName("YamlId")
    @Expose
    private String YamlId;

    /**
    * YAML configuration file name.
    */
    @SerializedName("YamlConfigName")
    @Expose
    private String YamlConfigName;

    /**
    * Target log topic ID
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
     * Get Pre-aggregation task ID. 
     * @return TaskId Pre-aggregation task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Pre-aggregation task ID.
     * @param TaskId Pre-aggregation task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Source Log Topic ID 
     * @return TopicId Source Log Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Source Log Topic ID
     * @param TopicId Source Log Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Pre-aggregation task name. 
     * @return Name Pre-aggregation task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pre-aggregation task name.
     * @param Name Pre-aggregation task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creation Time 
     * @return CreateTime Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time
     * @param CreateTime Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Task Update Time 
     * @return UpdateTime Task Update Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Task Update Time
     * @param UpdateTime Task Update Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Task status: 1: Running 2: Stopped 3: Error - Source log topic not found 4: Error - Target topic not found

5: Access permission issue 6: Internal failure 7: Other faults 
     * @return Status Task status: 1: Running 2: Stopped 3: Error - Source log topic not found 4: Error - Target topic not found

5: Access permission issue 6: Internal failure 7: Other faults
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status: 1: Running 2: Stopped 3: Error - Source log topic not found 4: Error - Target topic not found

5: Access permission issue 6: Internal failure 7: Other faults
     * @param Status Task status: 1: Running 2: Stopped 3: Error - Source log topic not found 4: Error - Target topic not found

5: Access permission issue 6: Internal failure 7: Other faults
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task status: 1 Enabled, 2 Disabled 
     * @return EnableFlag Task status: 1 Enabled, 2 Disabled
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set Task status: 1 Enabled, 2 Disabled
     * @param EnableFlag Task status: 1 Enabled, 2 Disabled
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get Schedule Start Time 
     * @return ProcessStartTime Schedule Start Time
     */
    public Long getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set Schedule Start Time
     * @param ProcessStartTime Schedule Start Time
     */
    public void setProcessStartTime(Long ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get Scheduling Interval (Minutes) 
     * @return ProcessPeriod Scheduling Interval (Minutes)
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set Scheduling Interval (Minutes)
     * @param ProcessPeriod Scheduling Interval (Minutes)
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get Execution Delay (Seconds) 
     * @return ProcessDelay Execution Delay (Seconds)
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set Execution Delay (Seconds)
     * @param ProcessDelay Execution Delay (Seconds)
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get Whether to enable service log shipping. Valid values: 1: disable; 2: enable. 
     * @return HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     * @param HasServicesLog Whether to enable service log shipping. Valid values: 1: disable; 2: enable.
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get Pre-aggregation search statement. 
     * @return RecordingRuleContent Pre-aggregation search statement.
     */
    public String getRecordingRuleContent() {
        return this.RecordingRuleContent;
    }

    /**
     * Set Pre-aggregation search statement.
     * @param RecordingRuleContent Pre-aggregation search statement.
     */
    public void setRecordingRuleContent(String RecordingRuleContent) {
        this.RecordingRuleContent = RecordingRuleContent;
    }

    /**
     * Get Metric name 
     * @return MetricName Metric name
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name
     * @param MetricName Metric name
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Custom metric name. 
     * @return CustomMetricLabels Custom metric name.
     */
    public MetricLabel [] getCustomMetricLabels() {
        return this.CustomMetricLabels;
    }

    /**
     * Set Custom metric name.
     * @param CustomMetricLabels Custom metric name.
     */
    public void setCustomMetricLabels(MetricLabel [] CustomMetricLabels) {
        this.CustomMetricLabels = CustomMetricLabels;
    }

    /**
     * Get YAML configuration file ID. 
     * @return YamlId YAML configuration file ID.
     */
    public String getYamlId() {
        return this.YamlId;
    }

    /**
     * Set YAML configuration file ID.
     * @param YamlId YAML configuration file ID.
     */
    public void setYamlId(String YamlId) {
        this.YamlId = YamlId;
    }

    /**
     * Get YAML configuration file name. 
     * @return YamlConfigName YAML configuration file name.
     */
    public String getYamlConfigName() {
        return this.YamlConfigName;
    }

    /**
     * Set YAML configuration file name.
     * @param YamlConfigName YAML configuration file name.
     */
    public void setYamlConfigName(String YamlConfigName) {
        this.YamlConfigName = YamlConfigName;
    }

    /**
     * Get Target log topic ID 
     * @return DstTopicId Target log topic ID
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set Target log topic ID
     * @param DstTopicId Target log topic ID
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    public RecordingRuleTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordingRuleTaskInfo(RecordingRuleTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.RecordingRuleContent != null) {
            this.RecordingRuleContent = new String(source.RecordingRuleContent);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.CustomMetricLabels != null) {
            this.CustomMetricLabels = new MetricLabel[source.CustomMetricLabels.length];
            for (int i = 0; i < source.CustomMetricLabels.length; i++) {
                this.CustomMetricLabels[i] = new MetricLabel(source.CustomMetricLabels[i]);
            }
        }
        if (source.YamlId != null) {
            this.YamlId = new String(source.YamlId);
        }
        if (source.YamlConfigName != null) {
            this.YamlConfigName = new String(source.YamlConfigName);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "RecordingRuleContent", this.RecordingRuleContent);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "CustomMetricLabels.", this.CustomMetricLabels);
        this.setParamSimple(map, prefix + "YamlId", this.YamlId);
        this.setParamSimple(map, prefix + "YamlConfigName", this.YamlConfigName);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);

    }
}

