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

public class TaskInstanceDetail extends AbstractModel {

    /**
    * Specifies the project id.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **Instance unique id**.

    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Folder ID.


    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Specifies the folder name.

    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Workflow ID.

    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.


    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Task ID


    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.


    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Specifies the id corresponding to taskType.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task type


    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * Specifies the instance data time.

    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Instance status.
-WAIT_EVENT: wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
-RUNNING. specifies the running status.
- SKIP_RUNNING: specifies whether to SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
-EXPIRED: indicates a failure.
-COMPLETED: success.

    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Specifies the instance type.

-0 indicates the replenishment type.
-Indicates a periodic instance.
-2 indicates a non-periodic instance.

    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * owner uin list.


    */
    @SerializedName("OwnerUinList")
    @Expose
    private String [] OwnerUinList;

    /**
    * Cumulative running times.

    */
    @SerializedName("TotalRunNum")
    @Expose
    private Long TotalRunNum;

    /**
    * Retry count limit when execution fails each time.

    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * **Failure Retry Count** - The number of retry attempts after a failure. When the instance is triggered again through methods such as manual rerun or backfill, this counter is reset to 0 and starts counting again.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * Time spent, in milliseconds.

    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * Start time.

    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operation completion time.

    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Scheduled dispatch time.

    */
    @SerializedName("SchedulerTime")
    @Expose
    private String SchedulerTime;

    /**
    * Latest update time of the instance. format: yyyy-MM-dd HH:MM:ss.

    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
    * Execution resource group ID.

    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Resource group name.

    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
    * Brief task failure information.

    */
    @SerializedName("JobErrorMsg")
    @Expose
    private String JobErrorMsg;

    /**
     * Get Specifies the project id.
 
     * @return ProjectId Specifies the project id.

     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Specifies the project id.

     * @param ProjectId Specifies the project id.

     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **Instance unique id**.
 
     * @return InstanceKey **Instance unique id**.

     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set **Instance unique id**.

     * @param InstanceKey **Instance unique id**.

     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Folder ID.

 
     * @return FolderId Folder ID.


     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.


     * @param FolderId Folder ID.


     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Specifies the folder name.
 
     * @return FolderName Specifies the folder name.

     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Specifies the folder name.

     * @param FolderName Specifies the folder name.

     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Workflow ID.
 
     * @return WorkflowId Workflow ID.

     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.

     * @param WorkflowId Workflow ID.

     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name.

 
     * @return WorkflowName Workflow name.


     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.


     * @param WorkflowName Workflow name.


     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Task ID

 
     * @return TaskId Task ID


     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID


     * @param TaskId Task ID


     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.

 
     * @return TaskName Task name.


     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.


     * @param TaskName Task name.


     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Specifies the id corresponding to taskType. 
     * @return TaskTypeId Specifies the id corresponding to taskType.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Specifies the id corresponding to taskType.
     * @param TaskTypeId Specifies the id corresponding to taskType.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task type

 
     * @return TaskType Task type


     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type


     * @param TaskType Task type


     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based 
     * @return CycleType Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     * @param CycleType Task Cycle Type

* ONEOFF_CYCLE: One-time

* YEAR_CYCLE: Yearly

* MONTH_CYCLE: Monthly

* WEEK_CYCLE: Weekly

* DAY_CYCLE: Daily

* HOUR_CYCLE: Hourly

* MINUTE_CYCLE: Minute-level

* CRONTAB_CYCLE: Crontab expression-based
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get Specifies the instance data time.
 
     * @return CurRunDate Specifies the instance data time.

     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Specifies the instance data time.

     * @param CurRunDate Specifies the instance data time.

     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Instance status.
-WAIT_EVENT: wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
-RUNNING. specifies the running status.
- SKIP_RUNNING: specifies whether to SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
-EXPIRED: indicates a failure.
-COMPLETED: success.
 
     * @return InstanceState Instance status.
-WAIT_EVENT: wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
-RUNNING. specifies the running status.
- SKIP_RUNNING: specifies whether to SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
-EXPIRED: indicates a failure.
-COMPLETED: success.

     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status.
-WAIT_EVENT: wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
-RUNNING. specifies the running status.
- SKIP_RUNNING: specifies whether to SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
-EXPIRED: indicates a failure.
-COMPLETED: success.

     * @param InstanceState Instance status.
-WAIT_EVENT: wait for event.
-WAIT_UPSTREAM: waiting for upstream.
- WAIT_RUN: awaiting execution.
-RUNNING. specifies the running status.
- SKIP_RUNNING: specifies whether to SKIP RUNNING.
- FAILED_RETRY: RETRY on failure.
-EXPIRED: indicates a failure.
-COMPLETED: success.

     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Specifies the instance type.

-0 indicates the replenishment type.
-Indicates a periodic instance.
-2 indicates a non-periodic instance.
 
     * @return InstanceType Specifies the instance type.

-0 indicates the replenishment type.
-Indicates a periodic instance.
-2 indicates a non-periodic instance.

     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the instance type.

-0 indicates the replenishment type.
-Indicates a periodic instance.
-2 indicates a non-periodic instance.

     * @param InstanceType Specifies the instance type.

-0 indicates the replenishment type.
-Indicates a periodic instance.
-2 indicates a non-periodic instance.

     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get owner uin list.

 
     * @return OwnerUinList owner uin list.


     */
    public String [] getOwnerUinList() {
        return this.OwnerUinList;
    }

    /**
     * Set owner uin list.


     * @param OwnerUinList owner uin list.


     */
    public void setOwnerUinList(String [] OwnerUinList) {
        this.OwnerUinList = OwnerUinList;
    }

    /**
     * Get Cumulative running times.
 
     * @return TotalRunNum Cumulative running times.

     */
    public Long getTotalRunNum() {
        return this.TotalRunNum;
    }

    /**
     * Set Cumulative running times.

     * @param TotalRunNum Cumulative running times.

     */
    public void setTotalRunNum(Long TotalRunNum) {
        this.TotalRunNum = TotalRunNum;
    }

    /**
     * Get Retry count limit when execution fails each time.
 
     * @return TryLimit Retry count limit when execution fails each time.

     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Retry count limit when execution fails each time.

     * @param TryLimit Retry count limit when execution fails each time.

     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get **Failure Retry Count** - The number of retry attempts after a failure. When the instance is triggered again through methods such as manual rerun or backfill, this counter is reset to 0 and starts counting again. 
     * @return Tries **Failure Retry Count** - The number of retry attempts after a failure. When the instance is triggered again through methods such as manual rerun or backfill, this counter is reset to 0 and starts counting again.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set **Failure Retry Count** - The number of retry attempts after a failure. When the instance is triggered again through methods such as manual rerun or backfill, this counter is reset to 0 and starts counting again.
     * @param Tries **Failure Retry Count** - The number of retry attempts after a failure. When the instance is triggered again through methods such as manual rerun or backfill, this counter is reset to 0 and starts counting again.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Time spent, in milliseconds.
 
     * @return CostTime Time spent, in milliseconds.

     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time spent, in milliseconds.

     * @param CostTime Time spent, in milliseconds.

     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Start time.
 
     * @return StartTime Start time.

     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.

     * @param StartTime Start time.

     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operation completion time.
 
     * @return EndTime Operation completion time.

     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Operation completion time.

     * @param EndTime Operation completion time.

     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Scheduled dispatch time.
 
     * @return SchedulerTime Scheduled dispatch time.

     */
    public String getSchedulerTime() {
        return this.SchedulerTime;
    }

    /**
     * Set Scheduled dispatch time.

     * @param SchedulerTime Scheduled dispatch time.

     */
    public void setSchedulerTime(String SchedulerTime) {
        this.SchedulerTime = SchedulerTime;
    }

    /**
     * Get Latest update time of the instance. format: yyyy-MM-dd HH:MM:ss.
 
     * @return LastUpdateTime Latest update time of the instance. format: yyyy-MM-dd HH:MM:ss.

     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Latest update time of the instance. format: yyyy-MM-dd HH:MM:ss.

     * @param LastUpdateTime Latest update time of the instance. format: yyyy-MM-dd HH:MM:ss.

     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Execution resource group ID.
 
     * @return ExecutorGroupId Execution resource group ID.

     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Execution resource group ID.

     * @param ExecutorGroupId Execution resource group ID.

     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Resource group name.
 
     * @return ExecutorGroupName Resource group name.

     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Resource group name.

     * @param ExecutorGroupName Resource group name.

     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    /**
     * Get Brief task failure information.
 
     * @return JobErrorMsg Brief task failure information.

     */
    public String getJobErrorMsg() {
        return this.JobErrorMsg;
    }

    /**
     * Set Brief task failure information.

     * @param JobErrorMsg Brief task failure information.

     */
    public void setJobErrorMsg(String JobErrorMsg) {
        this.JobErrorMsg = JobErrorMsg;
    }

    public TaskInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceDetail(TaskInstanceDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.OwnerUinList != null) {
            this.OwnerUinList = new String[source.OwnerUinList.length];
            for (int i = 0; i < source.OwnerUinList.length; i++) {
                this.OwnerUinList[i] = new String(source.OwnerUinList[i]);
            }
        }
        if (source.TotalRunNum != null) {
            this.TotalRunNum = new Long(source.TotalRunNum);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SchedulerTime != null) {
            this.SchedulerTime = new String(source.SchedulerTime);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
        if (source.JobErrorMsg != null) {
            this.JobErrorMsg = new String(source.JobErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "OwnerUinList.", this.OwnerUinList);
        this.setParamSimple(map, prefix + "TotalRunNum", this.TotalRunNum);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SchedulerTime", this.SchedulerTime);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);
        this.setParamSimple(map, prefix + "JobErrorMsg", this.JobErrorMsg);

    }
}

