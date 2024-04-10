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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledSqlTaskInfo extends AbstractModel {

    /**
    * ScheduledSql task id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * ScheduledSql task name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Source Log Topic ID
    */
    @SerializedName("SrcTopicId")
    @Expose
    private String SrcTopicId;

    /**
    * Source Log Topic Name
    */
    @SerializedName("SrcTopicName")
    @Expose
    private String SrcTopicName;

    /**
    * Scheduled SQL analysis of target topic
    */
    @SerializedName("DstResource")
    @Expose
    private ScheduledSqlResouceInfo DstResource;

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
    * Task status: 1: Running 2: Stop 3: Exception - Source log topic not found 4: Exception - target topic not found5: Access permission issue 6: Internal failure 7: Other faults
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
    * Queries statements
    */
    @SerializedName("ScheduledSqlContent")
    @Expose
    private String ScheduledSqlContent;

    /**
    * Schedule Start Time
    */
    @SerializedName("ProcessStartTime")
    @Expose
    private String ProcessStartTime;

    /**
    * Schedule Type: 1 Continuous Running 2 Specified Time Range
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * Schedule End Time, required when process_type=2
    */
    @SerializedName("ProcessEndTime")
    @Expose
    private String ProcessEndTime;

    /**
    * Scheduling Interval (Minutes)
    */
    @SerializedName("ProcessPeriod")
    @Expose
    private Long ProcessPeriod;

    /**
    * Query Time Window. @m-15m, @m, meaning the last 15 minutes
    */
    @SerializedName("ProcessTimeWindow")
    @Expose
    private String ProcessTimeWindow;

    /**
    * Execution Delay (Seconds)
    */
    @SerializedName("ProcessDelay")
    @Expose
    private Long ProcessDelay;

    /**
    * Source Topic ID Region Information
    */
    @SerializedName("SrcTopicRegion")
    @Expose
    private String SrcTopicRegion;

    /**
    * Syntax Rules: 0 Lucene syntax, 1 CQL syntaxNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get ScheduledSql task id 
     * @return TaskId ScheduledSql task id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ScheduledSql task id
     * @param TaskId ScheduledSql task id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get ScheduledSql task name 
     * @return Name ScheduledSql task name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ScheduledSql task name
     * @param Name ScheduledSql task name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Source Log Topic ID 
     * @return SrcTopicId Source Log Topic ID
     */
    public String getSrcTopicId() {
        return this.SrcTopicId;
    }

    /**
     * Set Source Log Topic ID
     * @param SrcTopicId Source Log Topic ID
     */
    public void setSrcTopicId(String SrcTopicId) {
        this.SrcTopicId = SrcTopicId;
    }

    /**
     * Get Source Log Topic Name 
     * @return SrcTopicName Source Log Topic Name
     */
    public String getSrcTopicName() {
        return this.SrcTopicName;
    }

    /**
     * Set Source Log Topic Name
     * @param SrcTopicName Source Log Topic Name
     */
    public void setSrcTopicName(String SrcTopicName) {
        this.SrcTopicName = SrcTopicName;
    }

    /**
     * Get Scheduled SQL analysis of target topic 
     * @return DstResource Scheduled SQL analysis of target topic
     */
    public ScheduledSqlResouceInfo getDstResource() {
        return this.DstResource;
    }

    /**
     * Set Scheduled SQL analysis of target topic
     * @param DstResource Scheduled SQL analysis of target topic
     */
    public void setDstResource(ScheduledSqlResouceInfo DstResource) {
        this.DstResource = DstResource;
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
     * Get Task status: 1: Running 2: Stop 3: Exception - Source log topic not found 4: Exception - target topic not found5: Access permission issue 6: Internal failure 7: Other faults 
     * @return Status Task status: 1: Running 2: Stop 3: Exception - Source log topic not found 4: Exception - target topic not found5: Access permission issue 6: Internal failure 7: Other faults
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status: 1: Running 2: Stop 3: Exception - Source log topic not found 4: Exception - target topic not found5: Access permission issue 6: Internal failure 7: Other faults
     * @param Status Task status: 1: Running 2: Stop 3: Exception - Source log topic not found 4: Exception - target topic not found5: Access permission issue 6: Internal failure 7: Other faults
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
     * Get Queries statements 
     * @return ScheduledSqlContent Queries statements
     */
    public String getScheduledSqlContent() {
        return this.ScheduledSqlContent;
    }

    /**
     * Set Queries statements
     * @param ScheduledSqlContent Queries statements
     */
    public void setScheduledSqlContent(String ScheduledSqlContent) {
        this.ScheduledSqlContent = ScheduledSqlContent;
    }

    /**
     * Get Schedule Start Time 
     * @return ProcessStartTime Schedule Start Time
     */
    public String getProcessStartTime() {
        return this.ProcessStartTime;
    }

    /**
     * Set Schedule Start Time
     * @param ProcessStartTime Schedule Start Time
     */
    public void setProcessStartTime(String ProcessStartTime) {
        this.ProcessStartTime = ProcessStartTime;
    }

    /**
     * Get Schedule Type: 1 Continuous Running 2 Specified Time Range 
     * @return ProcessType Schedule Type: 1 Continuous Running 2 Specified Time Range
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Schedule Type: 1 Continuous Running 2 Specified Time Range
     * @param ProcessType Schedule Type: 1 Continuous Running 2 Specified Time Range
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get Schedule End Time, required when process_type=2 
     * @return ProcessEndTime Schedule End Time, required when process_type=2
     */
    public String getProcessEndTime() {
        return this.ProcessEndTime;
    }

    /**
     * Set Schedule End Time, required when process_type=2
     * @param ProcessEndTime Schedule End Time, required when process_type=2
     */
    public void setProcessEndTime(String ProcessEndTime) {
        this.ProcessEndTime = ProcessEndTime;
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
     * Get Query Time Window. @m-15m, @m, meaning the last 15 minutes 
     * @return ProcessTimeWindow Query Time Window. @m-15m, @m, meaning the last 15 minutes
     */
    public String getProcessTimeWindow() {
        return this.ProcessTimeWindow;
    }

    /**
     * Set Query Time Window. @m-15m, @m, meaning the last 15 minutes
     * @param ProcessTimeWindow Query Time Window. @m-15m, @m, meaning the last 15 minutes
     */
    public void setProcessTimeWindow(String ProcessTimeWindow) {
        this.ProcessTimeWindow = ProcessTimeWindow;
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
     * Get Source Topic ID Region Information 
     * @return SrcTopicRegion Source Topic ID Region Information
     */
    public String getSrcTopicRegion() {
        return this.SrcTopicRegion;
    }

    /**
     * Set Source Topic ID Region Information
     * @param SrcTopicRegion Source Topic ID Region Information
     */
    public void setSrcTopicRegion(String SrcTopicRegion) {
        this.SrcTopicRegion = SrcTopicRegion;
    }

    /**
     * Get Syntax Rules: 0 Lucene syntax, 1 CQL syntaxNote: This field may return null, indicating that no valid values can be obtained. 
     * @return SyntaxRule Syntax Rules: 0 Lucene syntax, 1 CQL syntaxNote: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Syntax Rules: 0 Lucene syntax, 1 CQL syntaxNote: This field may return null, indicating that no valid values can be obtained.
     * @param SyntaxRule Syntax Rules: 0 Lucene syntax, 1 CQL syntaxNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
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

    }
}

