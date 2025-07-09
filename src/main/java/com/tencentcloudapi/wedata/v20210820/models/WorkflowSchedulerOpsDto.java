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

public class WorkflowSchedulerOpsDto extends AbstractModel {

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * CreatorNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Latency, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * Start Time, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * Task Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * Start TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specified Running Time, Specified Time: e.g., Monday:1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * Scheduling Cycle Type, Time Unit
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Scheduling Period, Interval Step unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Task Instance Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow Self-Dependency
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * Scheduling Plan Interpretation
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * First Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * Latest Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CreatorNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Creator CreatorNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set CreatorNote: This field may return null, indicating that no valid value can be obtained.
     * @param Creator CreatorNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Modification TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifyTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Modification TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Latency, unit=minute
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DelayTime Latency, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Latency, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DelayTime Latency, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get Start Time, unit=minute
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return StartupTime Start Time, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set Start Time, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     * @param StartupTime Start Time, unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get Task Dependency Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SelfDepend Task Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set Task Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SelfDepend Task Dependency Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get Start TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Start TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param EndTime End timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specified Running Time, Specified Time: e.g., Monday:1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskAction Specified Running Time, Specified Time: e.g., Monday:1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set Specified Running Time, Specified Time: e.g., Monday:1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskAction Specified Running Time, Specified Time: e.g., Monday:1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get Scheduling Cycle Type, Time Unit
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleType Scheduling Cycle Type, Time Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Scheduling Cycle Type, Time Unit
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleType Scheduling Cycle Type, Time Unit
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Scheduling Period, Interval Step unit=minute
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CycleStep Scheduling Period, Interval Step unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set Scheduling Period, Interval Step unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CycleStep Scheduling Period, Interval Step unit=minute
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CrontabExpression Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CrontabExpression Scheduling Cron Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionStartTime Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionStartTime Execution Time Left Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecutionEndTime Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecutionEndTime Execution Time Right Closed Interval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Task Instance Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceInitStrategy Task Instance Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set Task Instance Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceInitStrategy Task Instance Initialization Strategy
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow Self-Dependency
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DependencyWorkflow Workflow Self-Dependency
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set Workflow Self-Dependency
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DependencyWorkflow Workflow Self-Dependency
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get Scheduling Plan Interpretation
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SchedulerDesc Scheduling Plan Interpretation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set Scheduling Plan Interpretation
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SchedulerDesc Scheduling Plan Interpretation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get First Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FirstSubmitTime First Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set First Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FirstSubmitTime First Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get Latest Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LatestSubmitTime Latest Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set Latest Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LatestSubmitTime Latest Submission Time of Workflow
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    public WorkflowSchedulerOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerOpsDto(WorkflowSchedulerOpsDto source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);

    }
}

