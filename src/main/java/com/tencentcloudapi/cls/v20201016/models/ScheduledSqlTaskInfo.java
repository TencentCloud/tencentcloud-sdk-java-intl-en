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

public class ScheduledSqlTaskInfo extends AbstractModel {

    /**
    * <p>ScheduledSql task id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>ScheduledSql task name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Source log topic id.</p>
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * <p>source log topic name</p>
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * <p>Scheduled SQL analysis target topic</p>
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

    /**
    * <p>Task creation time. Format: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Task update time. Format: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Task status, 1: Running 2: Stopped 3: Exception - Source log topic not found 4: Exception - Target topic not found</p><p>5: Access permission issue 6: Internal fault 7: Other faults</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Task status: 1 Enabled, 2 Disabled</p>
    */
    @SerializedName("EnableFlag")
    @Expose
    private Long EnableFlag;

    /**
    * <p>Query statement</p>
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * <p>Schedule start time. Format: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * <p>Schedule Type: 1 Continuous Running 2 Specified Time Range</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>Schedule End Time, format: yyyy-MM-dd HH:mm:ss, required when process_type=2</p>
    */
    @SerializedName("ProcessEndTime")
    @Expose
    private String ProcessEndTime;

    /**
    * <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * <p>Query Time Window. @m-15m, @m, meaning the last 15 minutes</p>
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * <p>Syntax rules. 0: Lucene syntax, 1: CQL syntax</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>Whether the delivery service log is enabled. 1: Turn off, 2: Turn on.</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Full-text search tag. 1: Off, 2: On.</p>
    */
    @SerializedName("FullQuery")
    @Expose
    private Long FullQuery;

    /**
    * <p>Scheduling cycle time unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
    */
    @SerializedName("ProcessPeriodUnit")
    @Expose
    private Long ProcessPeriodUnit;

    /**
     * Get <p>ScheduledSql task id</p> 
     * @return TaskId <p>ScheduledSql task id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>ScheduledSql task id</p>
     * @param TaskId <p>ScheduledSql task id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>ScheduledSql task name</p> 
     * @return Name <p>ScheduledSql task name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>ScheduledSql task name</p>
     * @param Name <p>ScheduledSql task name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Source log topic id.</p> 
     * @return SrcTopicId <p>Source log topic id.</p>
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set <p>Source log topic id.</p>
     * @param SrcTopicId <p>Source log topic id.</p>
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get <p>source log topic name</p> 
     * @return SrcTopicName <p>source log topic name</p>
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set <p>source log topic name</p>
     * @param SrcTopicName <p>source log topic name</p>
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get <p>Scheduled SQL analysis target topic</p> 
     * @return DstResource <p>Scheduled SQL analysis target topic</p>
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set <p>Scheduled SQL analysis target topic</p>
     * @param DstResource <p>Scheduled SQL analysis target topic</p>
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
    }

    /**
     * Get <p>Task creation time. Format: yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>Task creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Task creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>Task creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Task update time. Format: yyyy-MM-dd HH:mm:ss</p> 
     * @return UpdateTime <p>Task update time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Task update time. Format: yyyy-MM-dd HH:mm:ss</p>
     * @param UpdateTime <p>Task update time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Task status, 1: Running 2: Stopped 3: Exception - Source log topic not found 4: Exception - Target topic not found</p><p>5: Access permission issue 6: Internal fault 7: Other faults</p> 
     * @return Status <p>Task status, 1: Running 2: Stopped 3: Exception - Source log topic not found 4: Exception - Target topic not found</p><p>5: Access permission issue 6: Internal fault 7: Other faults</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status, 1: Running 2: Stopped 3: Exception - Source log topic not found 4: Exception - Target topic not found</p><p>5: Access permission issue 6: Internal fault 7: Other faults</p>
     * @param Status <p>Task status, 1: Running 2: Stopped 3: Exception - Source log topic not found 4: Exception - Target topic not found</p><p>5: Access permission issue 6: Internal fault 7: Other faults</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Task status: 1 Enabled, 2 Disabled</p> 
     * @return EnableFlag <p>Task status: 1 Enabled, 2 Disabled</p>
     */
    public Long getEnableFlag() {
        return this.EnableFlag;
    }

    /**
     * Set <p>Task status: 1 Enabled, 2 Disabled</p>
     * @param EnableFlag <p>Task status: 1 Enabled, 2 Disabled</p>
     */
    public void setEnableFlag(Long EnableFlag) {
        this.EnableFlag = EnableFlag;
    }

    /**
     * Get <p>Query statement</p> 
     * @return ScheduledSqlContent <p>Query statement</p>
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set <p>Query statement</p>
     * @param ScheduledSqlContent <p>Query statement</p>
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get <p>Schedule start time. Format: yyyy-MM-dd HH:mm:ss</p> 
     * @return ProcessStartTime <p>Schedule start time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set <p>Schedule start time. Format: yyyy-MM-dd HH:mm:ss</p>
     * @param ProcessStartTime <p>Schedule start time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get <p>Schedule Type: 1 Continuous Running 2 Specified Time Range</p> 
     * @return ProcessType <p>Schedule Type: 1 Continuous Running 2 Specified Time Range</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>Schedule Type: 1 Continuous Running 2 Specified Time Range</p>
     * @param ProcessType <p>Schedule Type: 1 Continuous Running 2 Specified Time Range</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>Schedule End Time, format: yyyy-MM-dd HH:mm:ss, required when process_type=2</p> 
     * @return ProcessEndTime <p>Schedule End Time, format: yyyy-MM-dd HH:mm:ss, required when process_type=2</p>
     */
    public String getProcessEndTime() {
        return this.ProcessEndTime;
    }

    /**
     * Set <p>Schedule End Time, format: yyyy-MM-dd HH:mm:ss, required when process_type=2</p>
     * @param ProcessEndTime <p>Schedule End Time, format: yyyy-MM-dd HH:mm:ss, required when process_type=2</p>
     */
    public void setProcessEndTime(String ProcessEndTime) {
        this.ProcessEndTime = ProcessEndTime;
    }

    /**
     * Get <p>Scheduling Interval (Minutes), 1-1440 minutes</p> 
     * @return ProcessPeriod <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     */
    public Long getProcessPeriod() {
        return this.ProcessPeriod;
    }

    /**
     * Set <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     * @param ProcessPeriod <p>Scheduling Interval (Minutes), 1-1440 minutes</p>
     */
    public void setProcessPeriod(Long ProcessPeriod) {
        this.ProcessPeriod = ProcessPeriod;
    }

    /**
     * Get <p>Query Time Window. @m-15m, @m, meaning the last 15 minutes</p> 
     * @return ProcessTimeWindow <p>Query Time Window. @m-15m, @m, meaning the last 15 minutes</p>
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set <p>Query Time Window. @m-15m, @m, meaning the last 15 minutes</p>
     * @param ProcessTimeWindow <p>Query Time Window. @m-15m, @m, meaning the last 15 minutes</p>
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
    }

    /**
     * Get <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p> 
     * @return ProcessDelay <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     */
    public Long getProcessDelay() {
        return this.ProcessDelay;
    }

    /**
     * Set <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     * @param ProcessDelay <p>Execution delay (seconds), 0-120 seconds, default 60 seconds</p>
     */
    public void setProcessDelay(Long ProcessDelay) {
        this.ProcessDelay = ProcessDelay;
    }

    /**
     * Get <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p> 
     * @return SrcTopicRegion <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     * @param SrcTopicRegion <p>Regional information of the source topicId. For supported regions, see the <a href="https://www.tencentcloud.com/document/api/614/56474?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a> document.</p>
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get <p>Syntax rules. 0: Lucene syntax, 1: CQL syntax</p> 
     * @return SyntaxRule <p>Syntax rules. 0: Lucene syntax, 1: CQL syntax</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>Syntax rules. 0: Lucene syntax, 1: CQL syntax</p>
     * @param SyntaxRule <p>Syntax rules. 0: Lucene syntax, 1: CQL syntax</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>Whether the delivery service log is enabled. 1: Turn off, 2: Turn on.</p> 
     * @return HasServicesLog <p>Whether the delivery service log is enabled. 1: Turn off, 2: Turn on.</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether the delivery service log is enabled. 1: Turn off, 2: Turn on.</p>
     * @param HasServicesLog <p>Whether the delivery service log is enabled. 1: Turn off, 2: Turn on.</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>Full-text search tag. 1: Off, 2: On.</p> 
     * @return FullQuery <p>Full-text search tag. 1: Off, 2: On.</p>
     */
    public Long getFullQuery() {
        return this.FullQuery;
    }

    /**
     * Set <p>Full-text search tag. 1: Off, 2: On.</p>
     * @param FullQuery <p>Full-text search tag. 1: Off, 2: On.</p>
     */
    public void setFullQuery(Long FullQuery) {
        this.FullQuery = FullQuery;
    }

    /**
     * Get <p>Scheduling cycle time unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p> 
     * @return ProcessPeriodUnit <p>Scheduling cycle time unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     */
    public Long getProcessPeriodUnit() {
        return this.ProcessPeriodUnit;
    }

    /**
     * Set <p>Scheduling cycle time unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     * @param ProcessPeriodUnit <p>Scheduling cycle time unit</p><p>Value ranges from 1 to 2</p><p>Default value: 1</p><p>Default value 1 (minute), other value 2 (second)</p>
     */
    public void setProcessPeriodUnit(Long ProcessPeriodUnit) {
        this.ProcessPeriodUnit = ProcessPeriodUnit;
    }

    public ScheduledSqlTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledSqlTaskInfo(ScheduledSqlTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SrcTopicId != null) {
            this.SrcTopicId = new String(source.SrcTopicId);
        }
        if (source.SrcTopicName != null) {
            this.SrcTopicName = new String(source.SrcTopicName);
        }
        if (source.DstResource != null) {
            this.DstResource = new ScheduledSqlResouceInfo(source.DstResource);
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
        if (source.ScheduledSqlContent != null) {
            this.ScheduledSqlContent = new String(source.ScheduledSqlContent);
        }
        if (source.ProcessStartTime != null) {
            this.ProcessStartTime = new String(source.ProcessStartTime);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.ProcessEndTime != null) {
            this.ProcessEndTime = new String(source.ProcessEndTime);
        }
        if (source.ProcessPeriod != null) {
            this.ProcessPeriod = new Long(source.ProcessPeriod);
        }
        if (source.ProcessTimeWindow != null) {
            this.ProcessTimeWindow = new String(source.ProcessTimeWindow);
        }
        if (source.ProcessDelay != null) {
            this.ProcessDelay = new Long(source.ProcessDelay);
        }
        if (source.SrcTopicRegion != null) {
            this.SrcTopicRegion = new String(source.SrcTopicRegion);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.FullQuery != null) {
            this.FullQuery = new Long(source.FullQuery);
        }
        if (source.ProcessPeriodUnit != null) {
            this.ProcessPeriodUnit = new Long(source.ProcessPeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SrcTopicId", this.SrcTopicId);
        this.setParamSimple(map, prefix + "SrcTopicName", this.SrcTopicName);
        this.setParamObj(map, prefix + "DstResource.", this.DstResource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EnableFlag", this.EnableFlag);
        this.setParamSimple(map, prefix + "ScheduledSqlContent", this.ScheduledSqlContent);
        this.setParamSimple(map, prefix + "ProcessStartTime", this.ProcessStartTime);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "ProcessEndTime", this.ProcessEndTime);
        this.setParamSimple(map, prefix + "ProcessPeriod", this.ProcessPeriod);
        this.setParamSimple(map, prefix + "ProcessTimeWindow", this.ProcessTimeWindow);
        this.setParamSimple(map, prefix + "ProcessDelay", this.ProcessDelay);
        this.setParamSimple(map, prefix + "SrcTopicRegion", this.SrcTopicRegion);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "FullQuery", this.FullQuery);
        this.setParamSimple(map, prefix + "ProcessPeriodUnit", this.ProcessPeriodUnit);

    }
}

