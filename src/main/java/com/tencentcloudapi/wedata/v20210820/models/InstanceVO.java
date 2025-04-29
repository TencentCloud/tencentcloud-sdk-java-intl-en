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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceVO extends AbstractModel {

    /**
    * Unique identifier of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Responsible person list.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InChargeList")
    @Expose
    private String [] InChargeList;

    /**
    * Task ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task type

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private TaskTypeOpsDto TaskType;

    /**
    * Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskCycleType")
    @Expose
    private String TaskCycleType;

    /**
    * Instance data time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Specifies the limit on the number of retries issued each time a running failure occurs.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TryLimit")
    @Expose
    private Long TryLimit;

    /**
    * Number of retries after failure.
Will be reset to 0 and then recounted when triggered for execution by once again manually rerunning or using a supplementary entry instance and other methods.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tries")
    @Expose
    private Long Tries;

    /**
    * Cumulative running times.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalRunNum")
    @Expose
    private Long TotalRunNum;

    /**
    * Instance type.

-0 indicates the supplementary entry type.
-1 indicates a periodic instance.
-2 indicates a non-periodic instance.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Indicates the status of an instance.

-[0]Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]: running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceState")
    @Expose
    private Long InstanceState;

    /**
    * Start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
    * Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SchedulerTime")
    @Expose
    private String SchedulerTime;

    /**
    * Execution resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * Resource group name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecutorGroupName")
    @Expose
    private String ExecutorGroupName;

    /**
     * Get Unique identifier of an instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceKey Unique identifier of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Unique identifier of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceKey Unique identifier of an instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Folder ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderId Folder ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderId Folder ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Folder name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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
     * Get Responsible person list.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InChargeList Responsible person list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getInChargeList() {
        return this.InChargeList;
    }

    /**
     * Set Responsible person list.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InChargeList Responsible person list.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInChargeList(String [] InChargeList) {
        this.InChargeList = InChargeList;
    }

    /**
     * Get Task ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task type

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskTypeOpsDto getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(TaskTypeOpsDto TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskCycleType Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskCycleType() {
        return this.TaskCycleType;
    }

    /**
     * Set Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskCycleType Task cycle type.
Supports filtering multiple conditions with an or relationship between them.
* O: ONEOFF_CYCLE
* Y: YEAR_CYCLE
* M: MONTH_CYCLE
* W: WEEK_CYCLE
* D: DAY_CYCLE
* H: HOUR_CYCLE
* I: MINUTE_CYCLE
* C: CRONTAB_CYCLE
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskCycleType(String TaskCycleType) {
        this.TaskCycleType = TaskCycleType;
    }

    /**
     * Get Instance data time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurRunDate Instance data time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Instance data time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurRunDate Instance data time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Specifies the limit on the number of retries issued each time a running failure occurs.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TryLimit Specifies the limit on the number of retries issued each time a running failure occurs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTryLimit() {
        return this.TryLimit;
    }

    /**
     * Set Specifies the limit on the number of retries issued each time a running failure occurs.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TryLimit Specifies the limit on the number of retries issued each time a running failure occurs.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTryLimit(Long TryLimit) {
        this.TryLimit = TryLimit;
    }

    /**
     * Get Number of retries after failure.
Will be reset to 0 and then recounted when triggered for execution by once again manually rerunning or using a supplementary entry instance and other methods.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tries Number of retries after failure.
Will be reset to 0 and then recounted when triggered for execution by once again manually rerunning or using a supplementary entry instance and other methods.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTries() {
        return this.Tries;
    }

    /**
     * Set Number of retries after failure.
Will be reset to 0 and then recounted when triggered for execution by once again manually rerunning or using a supplementary entry instance and other methods.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tries Number of retries after failure.
Will be reset to 0 and then recounted when triggered for execution by once again manually rerunning or using a supplementary entry instance and other methods.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTries(Long Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Cumulative running times.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalRunNum Cumulative running times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalRunNum() {
        return this.TotalRunNum;
    }

    /**
     * Set Cumulative running times.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalRunNum Cumulative running times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalRunNum(Long TotalRunNum) {
        this.TotalRunNum = TotalRunNum;
    }

    /**
     * Get Instance type.

-0 indicates the supplementary entry type.
-1 indicates a periodic instance.
-2 indicates a non-periodic instance.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance type.

-0 indicates the supplementary entry type.
-1 indicates a periodic instance.
-2 indicates a non-periodic instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.

-0 indicates the supplementary entry type.
-1 indicates a periodic instance.
-2 indicates a non-periodic instance.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance type.

-0 indicates the supplementary entry type.
-1 indicates a periodic instance.
-2 indicates a non-periodic instance.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Indicates the status of an instance.

-[0]Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]: running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceState Indicates the status of an instance.

-[0]Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]: running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Indicates the status of an instance.

-[0]Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]: running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceState Indicates the status of an instance.

-[0]Indicates waiting for event.
-[12] indicates waiting for upstream.
-[6, 7, 9, 10, 18] indicates awaiting execution.
-[1, 19, 22]: running.
-[21] indicates skipping running.
-[3] indicates retry on failure.
-[8, 4, 5, 13] indicates a failure.
-[2] indicates a success.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceState(Long InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operation completion time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Operation completion time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Time spent.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CostTime Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CostTime Time spent.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SchedulerTime Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSchedulerTime() {
        return this.SchedulerTime;
    }

    /**
     * Set Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SchedulerTime Planned scheduling time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSchedulerTime(String SchedulerTime) {
        this.SchedulerTime = SchedulerTime;
    }

    /**
     * Get Execution resource group ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutorGroupId Execution resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set Execution resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutorGroupId Execution resource group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get Resource group name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecutorGroupName Resource group name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExecutorGroupName() {
        return this.ExecutorGroupName;
    }

    /**
     * Set Resource group name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecutorGroupName Resource group name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecutorGroupName(String ExecutorGroupName) {
        this.ExecutorGroupName = ExecutorGroupName;
    }

    public InstanceVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceVO(InstanceVO source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.InChargeList != null) {
            this.InChargeList = new String[source.InChargeList.length];
            for (int i = 0; i < source.InChargeList.length; i++) {
                this.InChargeList[i] = new String(source.InChargeList[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new TaskTypeOpsDto(source.TaskType);
        }
        if (source.TaskCycleType != null) {
            this.TaskCycleType = new String(source.TaskCycleType);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.TryLimit != null) {
            this.TryLimit = new Long(source.TryLimit);
        }
        if (source.Tries != null) {
            this.Tries = new Long(source.Tries);
        }
        if (source.TotalRunNum != null) {
            this.TotalRunNum = new Long(source.TotalRunNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new Long(source.InstanceState);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
        if (source.SchedulerTime != null) {
            this.SchedulerTime = new String(source.SchedulerTime);
        }
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.ExecutorGroupName != null) {
            this.ExecutorGroupName = new String(source.ExecutorGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamArraySimple(map, prefix + "InChargeList.", this.InChargeList);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "TaskType.", this.TaskType);
        this.setParamSimple(map, prefix + "TaskCycleType", this.TaskCycleType);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "TryLimit", this.TryLimit);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "TotalRunNum", this.TotalRunNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "SchedulerTime", this.SchedulerTime);
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "ExecutorGroupName", this.ExecutorGroupName);

    }
}

