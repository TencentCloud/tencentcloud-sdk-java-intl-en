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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskData extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Reason for failure
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Progress (0-1)
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Task operation type. A batch task type starts with "Batch".
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Operation type Chinese description
    */
    @SerializedName("ActionZhDesc")
    @Expose
    private String ActionZhDesc;

    /**
    * Task type. 1. Simple 2. Complex 3. Subtask
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Task resource ID (invalid for complex tasks)
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Total number of tasks (valid only for complex tasks)
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Successful Tasks (valid only for complex tasks)
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of failed tasks (valid only for complex tasks)
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * Number of running tasks (valid only for complex tasks)
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * Task start time.
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * Task creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update task time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * Task running time in milliseconds.
    */
    @SerializedName("Runtime")
    @Expose
    private Long Runtime;

    /**
    * Device ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Device name.
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Channel name
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED 
     * @return Status Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     * @param Status Task status. 1: NEW, 2: RUNNING, 3: COMPLETED, 4: FAILED
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Reason for failure 
     * @return FailReason Reason for failure
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Reason for failure
     * @param FailReason Reason for failure
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Progress (0-1) 
     * @return Progress Progress (0-1)
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Progress (0-1)
     * @param Progress Progress (0-1)
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task operation type. A batch task type starts with "Batch". 
     * @return Action Task operation type. A batch task type starts with "Batch".
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Task operation type. A batch task type starts with "Batch".
     * @param Action Task operation type. A batch task type starts with "Batch".
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Operation type Chinese description 
     * @return ActionZhDesc Operation type Chinese description
     */
    public String getActionZhDesc() {
        return this.ActionZhDesc;
    }

    /**
     * Set Operation type Chinese description
     * @param ActionZhDesc Operation type Chinese description
     */
    public void setActionZhDesc(String ActionZhDesc) {
        this.ActionZhDesc = ActionZhDesc;
    }

    /**
     * Get Task type. 1. Simple 2. Complex 3. Subtask 
     * @return TaskType Task type. 1. Simple 2. Complex 3. Subtask
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. 1. Simple 2. Complex 3. Subtask
     * @param TaskType Task type. 1. Simple 2. Complex 3. Subtask
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Task resource ID (invalid for complex tasks) 
     * @return ResourceId Task resource ID (invalid for complex tasks)
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Task resource ID (invalid for complex tasks)
     * @param ResourceId Task resource ID (invalid for complex tasks)
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Total number of tasks (valid only for complex tasks) 
     * @return Total Total number of tasks (valid only for complex tasks)
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of tasks (valid only for complex tasks)
     * @param Total Total number of tasks (valid only for complex tasks)
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Successful Tasks (valid only for complex tasks) 
     * @return SuccessCount Successful Tasks (valid only for complex tasks)
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Successful Tasks (valid only for complex tasks)
     * @param SuccessCount Successful Tasks (valid only for complex tasks)
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of failed tasks (valid only for complex tasks) 
     * @return FailCount Number of failed tasks (valid only for complex tasks)
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set Number of failed tasks (valid only for complex tasks)
     * @param FailCount Number of failed tasks (valid only for complex tasks)
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get Number of running tasks (valid only for complex tasks) 
     * @return RunningCount Number of running tasks (valid only for complex tasks)
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Number of running tasks (valid only for complex tasks)
     * @param RunningCount Number of running tasks (valid only for complex tasks)
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Task start time. 
     * @return StartedAt Task start time.
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set Task start time.
     * @param StartedAt Task start time.
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get Task creation time 
     * @return CreatedAt Task creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Task creation time
     * @param CreatedAt Task creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update task time. 
     * @return UpdatedAt Update task time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update task time.
     * @param UpdatedAt Update task time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get Task running time in milliseconds. 
     * @return Runtime Task running time in milliseconds.
     */
    public Long getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Task running time in milliseconds.
     * @param Runtime Task running time in milliseconds.
     */
    public void setRuntime(Long Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Device ID 
     * @return DeviceId Device ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID
     * @param DeviceId Device ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Device name. 
     * @return DeviceName Device name.
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set Device name.
     * @param DeviceName Device name.
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Channel name 
     * @return ChannelName Channel name
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set Channel name
     * @param ChannelName Channel name
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public TaskData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskData(TaskData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionZhDesc != null) {
            this.ActionZhDesc = new String(source.ActionZhDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Runtime != null) {
            this.Runtime = new Long(source.Runtime);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionZhDesc", this.ActionZhDesc);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

