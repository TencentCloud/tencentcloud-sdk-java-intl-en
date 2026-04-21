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

public class ListTriggerTaskRunBrief extends AbstractModel {

    /**
    * Running ID of the task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Running ID of the workflow
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * Waiting duration, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * Planned scheduling time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleTime")
    @Expose
    private String ScheduleTime;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * Running end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * Running time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * Times of automatic retry
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * Error code description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Number of manual rerun attempts by the user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * Task running status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskExecutionState")
    @Expose
    private String TaskExecutionState;

    /**
    * Whether it is the most recent run
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLatestExecution")
    @Expose
    private Boolean IsLatestExecution;

    /**
     * Get Running ID of the task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionId Running ID of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Running ID of the task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionId Running ID of the task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Workflow ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Running ID of the workflow
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowExecutionId Running ID of the workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set Running ID of the workflow
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowExecutionId Running ID of the workflow
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Trigger Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TriggerType Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TriggerType Trigger Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get Waiting duration, in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WaitTime Waiting duration, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set Waiting duration, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WaitTime Waiting duration, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get Operating Account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteUserUin Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteUserUin Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get Planned scheduling time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScheduleTime Planned scheduling time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScheduleTime() {
        return this.ScheduleTime;
    }

    /**
     * Set Planned scheduling time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScheduleTime Planned scheduling time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScheduleTime(String ScheduleTime) {
        this.ScheduleTime = ScheduleTime;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionStartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionStartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get Running end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionEndTime Running end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set Running end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionEndTime Running end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get Running time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutionTime Running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set Running time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutionTime Running time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get Times of automatic retry
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetryTimes Times of automatic retry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set Times of automatic retry
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetryTimes Times of automatic retry
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get Error code description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrorCodeStr Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrorCodeStr Error code description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Number of manual rerun attempts by the user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RerunTimes Number of manual rerun attempts by the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set Number of manual rerun attempts by the user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RerunTimes Number of manual rerun attempts by the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get Task running status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskExecutionState Task running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskExecutionState() {
        return this.TaskExecutionState;
    }

    /**
     * Set Task running status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskExecutionState Task running status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskExecutionState(String TaskExecutionState) {
        this.TaskExecutionState = TaskExecutionState;
    }

    /**
     * Get Whether it is the most recent run
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsLatestExecution Whether it is the most recent run
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsLatestExecution() {
        return this.IsLatestExecution;
    }

    /**
     * Set Whether it is the most recent run
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsLatestExecution Whether it is the most recent run
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLatestExecution(Boolean IsLatestExecution) {
        this.IsLatestExecution = IsLatestExecution;
    }

    public ListTriggerTaskRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggerTaskRunBrief(ListTriggerTaskRunBrief source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.ScheduleTime != null) {
            this.ScheduleTime = new String(source.ScheduleTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.TaskExecutionState != null) {
            this.TaskExecutionState = new String(source.TaskExecutionState);
        }
        if (source.IsLatestExecution != null) {
            this.IsLatestExecution = new Boolean(source.IsLatestExecution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "ScheduleTime", this.ScheduleTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "TaskExecutionState", this.TaskExecutionState);
        this.setParamSimple(map, prefix + "IsLatestExecution", this.IsLatestExecution);

    }
}

