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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInstanceView extends AbstractModel{

    /**
    * Task instance index
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

    /**
    * Task instance state
    */
    @SerializedName("TaskInstanceState")
    @Expose
    private String TaskInstanceState;

    /**
    * Exit code after application execution is completed
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ExitCode")
    @Expose
    private Long ExitCode;

    /**
    * Task instance state reason. If the task instance fails, the reason for the failure will be logged.
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * The `InstanceId` of the compute node (e.g., CVM instance) where the task instance is running. This field is empty if the task instance is not running or has already been completed and will change when the task instance is retried.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ComputeNodeInstanceId")
    @Expose
    private String ComputeNodeInstanceId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Start time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("LaunchTime")
    @Expose
    private String LaunchTime;

    /**
    * Running start time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RunningTime")
    @Expose
    private String RunningTime;

    /**
    * Task end time
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Redirection information
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * Task instance state reason details. If the task instance fails, the reason for the failure will be logged
    */
    @SerializedName("StateDetailedReason")
    @Expose
    private String StateDetailedReason;

    /**
     * Get Task instance index 
     * @return TaskInstanceIndex Task instance index
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set Task instance index
     * @param TaskInstanceIndex Task instance index
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Get Task instance state 
     * @return TaskInstanceState Task instance state
     */
    public String getTaskInstanceState() {
        return this.TaskInstanceState;
    }

    /**
     * Set Task instance state
     * @param TaskInstanceState Task instance state
     */
    public void setTaskInstanceState(String TaskInstanceState) {
        this.TaskInstanceState = TaskInstanceState;
    }

    /**
     * Get Exit code after application execution is completed
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ExitCode Exit code after application execution is completed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getExitCode() {
        return this.ExitCode;
    }

    /**
     * Set Exit code after application execution is completed
Note: This field may return `null`, indicating that no valid value was found.
     * @param ExitCode Exit code after application execution is completed
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * Get Task instance state reason. If the task instance fails, the reason for the failure will be logged. 
     * @return StateReason Task instance state reason. If the task instance fails, the reason for the failure will be logged.
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set Task instance state reason. If the task instance fails, the reason for the failure will be logged.
     * @param StateReason Task instance state reason. If the task instance fails, the reason for the failure will be logged.
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get The `InstanceId` of the compute node (e.g., CVM instance) where the task instance is running. This field is empty if the task instance is not running or has already been completed and will change when the task instance is retried.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ComputeNodeInstanceId The `InstanceId` of the compute node (e.g., CVM instance) where the task instance is running. This field is empty if the task instance is not running or has already been completed and will change when the task instance is retried.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getComputeNodeInstanceId() {
        return this.ComputeNodeInstanceId;
    }

    /**
     * Set The `InstanceId` of the compute node (e.g., CVM instance) where the task instance is running. This field is empty if the task instance is not running or has already been completed and will change when the task instance is retried.
Note: This field may return `null`, indicating that no valid value was found.
     * @param ComputeNodeInstanceId The `InstanceId` of the compute node (e.g., CVM instance) where the task instance is running. This field is empty if the task instance is not running or has already been completed and will change when the task instance is retried.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setComputeNodeInstanceId(String ComputeNodeInstanceId) {
        this.ComputeNodeInstanceId = ComputeNodeInstanceId;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Start time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return LaunchTime Start time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getLaunchTime() {
        return this.LaunchTime;
    }

    /**
     * Set Start time
Note: This field may return `null`, indicating that no valid value was found.
     * @param LaunchTime Start time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setLaunchTime(String LaunchTime) {
        this.LaunchTime = LaunchTime;
    }

    /**
     * Get Running start time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RunningTime Running start time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRunningTime() {
        return this.RunningTime;
    }

    /**
     * Set Running start time
Note: This field may return `null`, indicating that no valid value was found.
     * @param RunningTime Running start time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRunningTime(String RunningTime) {
        this.RunningTime = RunningTime;
    }

    /**
     * Get Task end time
Note: This field may return `null`, indicating that no valid value was found. 
     * @return EndTime Task end time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
Note: This field may return `null`, indicating that no valid value was found.
     * @param EndTime Task end time
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Redirection information 
     * @return RedirectInfo Redirection information
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set Redirection information
     * @param RedirectInfo Redirection information
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get Task instance state reason details. If the task instance fails, the reason for the failure will be logged 
     * @return StateDetailedReason Task instance state reason details. If the task instance fails, the reason for the failure will be logged
     */
    public String getStateDetailedReason() {
        return this.StateDetailedReason;
    }

    /**
     * Set Task instance state reason details. If the task instance fails, the reason for the failure will be logged
     * @param StateDetailedReason Task instance state reason details. If the task instance fails, the reason for the failure will be logged
     */
    public void setStateDetailedReason(String StateDetailedReason) {
        this.StateDetailedReason = StateDetailedReason;
    }

    public TaskInstanceView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInstanceView(TaskInstanceView source) {
        if (source.TaskInstanceIndex != null) {
            this.TaskInstanceIndex = new Long(source.TaskInstanceIndex);
        }
        if (source.TaskInstanceState != null) {
            this.TaskInstanceState = new String(source.TaskInstanceState);
        }
        if (source.ExitCode != null) {
            this.ExitCode = new Long(source.ExitCode);
        }
        if (source.StateReason != null) {
            this.StateReason = new String(source.StateReason);
        }
        if (source.ComputeNodeInstanceId != null) {
            this.ComputeNodeInstanceId = new String(source.ComputeNodeInstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LaunchTime != null) {
            this.LaunchTime = new String(source.LaunchTime);
        }
        if (source.RunningTime != null) {
            this.RunningTime = new String(source.RunningTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new RedirectInfo(source.RedirectInfo);
        }
        if (source.StateDetailedReason != null) {
            this.StateDetailedReason = new String(source.StateDetailedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "TaskInstanceState", this.TaskInstanceState);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "ComputeNodeInstanceId", this.ComputeNodeInstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LaunchTime", this.LaunchTime);
        this.setParamSimple(map, prefix + "RunningTime", this.RunningTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamSimple(map, prefix + "StateDetailedReason", this.StateDetailedReason);

    }
}

