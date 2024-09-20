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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskGroupInstance extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("TaskGroupInstanceId")
    @Expose
    private Long TaskGroupInstanceId;

    /**
    * Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceObjectId")
    @Expose
    private String TaskGroupInstanceObjectId;

    /**
    * Instance action execution status

    */
    @SerializedName("TaskGroupInstanceStatus")
    @Expose
    private Long TaskGroupInstanceStatus;

    /**
    * Instance creation time
    */
    @SerializedName("TaskGroupInstanceCreateTime")
    @Expose
    private String TaskGroupInstanceCreateTime;

    /**
    * Instance update time
    */
    @SerializedName("TaskGroupInstanceUpdateTime")
    @Expose
    private String TaskGroupInstanceUpdateTime;

    /**
    * Status. 0: no status; 1: successful; 2: failed; 3: terminated; 4: skipped.
    */
    @SerializedName("TaskGroupInstanceStatusType")
    @Expose
    private Long TaskGroupInstanceStatusType;

    /**
    * Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceStartTime")
    @Expose
    private String TaskGroupInstanceStartTime;

    /**
    * Execution end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceEndTime")
    @Expose
    private String TaskGroupInstanceEndTime;

    /**
    * Instance action execution log
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceExecuteLog")
    @Expose
    private String TaskGroupInstanceExecuteLog;

    /**
    * Whether the instance can be retried
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceIsRedo")
    @Expose
    private Boolean TaskGroupInstanceIsRedo;

    /**
    * Action instance execution time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskGroupInstanceExecuteTime")
    @Expose
    private Long TaskGroupInstanceExecuteTime;

    /**
     * Get Instance ID 
     * @return TaskGroupInstanceId Instance ID
     */
    public Long getTaskGroupInstanceId() {
        return this.TaskGroupInstanceId;
    }

    /**
     * Set Instance ID
     * @param TaskGroupInstanceId Instance ID
     */
    public void setTaskGroupInstanceId(Long TaskGroupInstanceId) {
        this.TaskGroupInstanceId = TaskGroupInstanceId;
    }

    /**
     * Get Instance ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceObjectId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupInstanceObjectId() {
        return this.TaskGroupInstanceObjectId;
    }

    /**
     * Set Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceObjectId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstanceObjectId(String TaskGroupInstanceObjectId) {
        this.TaskGroupInstanceObjectId = TaskGroupInstanceObjectId;
    }

    /**
     * Get Instance action execution status
 
     * @return TaskGroupInstanceStatus Instance action execution status

     */
    public Long getTaskGroupInstanceStatus() {
        return this.TaskGroupInstanceStatus;
    }

    /**
     * Set Instance action execution status

     * @param TaskGroupInstanceStatus Instance action execution status

     */
    public void setTaskGroupInstanceStatus(Long TaskGroupInstanceStatus) {
        this.TaskGroupInstanceStatus = TaskGroupInstanceStatus;
    }

    /**
     * Get Instance creation time 
     * @return TaskGroupInstanceCreateTime Instance creation time
     */
    public String getTaskGroupInstanceCreateTime() {
        return this.TaskGroupInstanceCreateTime;
    }

    /**
     * Set Instance creation time
     * @param TaskGroupInstanceCreateTime Instance creation time
     */
    public void setTaskGroupInstanceCreateTime(String TaskGroupInstanceCreateTime) {
        this.TaskGroupInstanceCreateTime = TaskGroupInstanceCreateTime;
    }

    /**
     * Get Instance update time 
     * @return TaskGroupInstanceUpdateTime Instance update time
     */
    public String getTaskGroupInstanceUpdateTime() {
        return this.TaskGroupInstanceUpdateTime;
    }

    /**
     * Set Instance update time
     * @param TaskGroupInstanceUpdateTime Instance update time
     */
    public void setTaskGroupInstanceUpdateTime(String TaskGroupInstanceUpdateTime) {
        this.TaskGroupInstanceUpdateTime = TaskGroupInstanceUpdateTime;
    }

    /**
     * Get Status. 0: no status; 1: successful; 2: failed; 3: terminated; 4: skipped. 
     * @return TaskGroupInstanceStatusType Status. 0: no status; 1: successful; 2: failed; 3: terminated; 4: skipped.
     */
    public Long getTaskGroupInstanceStatusType() {
        return this.TaskGroupInstanceStatusType;
    }

    /**
     * Set Status. 0: no status; 1: successful; 2: failed; 3: terminated; 4: skipped.
     * @param TaskGroupInstanceStatusType Status. 0: no status; 1: successful; 2: failed; 3: terminated; 4: skipped.
     */
    public void setTaskGroupInstanceStatusType(Long TaskGroupInstanceStatusType) {
        this.TaskGroupInstanceStatusType = TaskGroupInstanceStatusType;
    }

    /**
     * Get Execution start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceStartTime Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupInstanceStartTime() {
        return this.TaskGroupInstanceStartTime;
    }

    /**
     * Set Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceStartTime Execution start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstanceStartTime(String TaskGroupInstanceStartTime) {
        this.TaskGroupInstanceStartTime = TaskGroupInstanceStartTime;
    }

    /**
     * Get Execution end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceEndTime Execution end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskGroupInstanceEndTime() {
        return this.TaskGroupInstanceEndTime;
    }

    /**
     * Set Execution end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceEndTime Execution end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstanceEndTime(String TaskGroupInstanceEndTime) {
        this.TaskGroupInstanceEndTime = TaskGroupInstanceEndTime;
    }

    /**
     * Get Instance action execution log
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceExecuteLog Instance action execution log
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getTaskGroupInstanceExecuteLog() {
        return this.TaskGroupInstanceExecuteLog;
    }

    /**
     * Set Instance action execution log
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceExecuteLog Instance action execution log
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setTaskGroupInstanceExecuteLog(String TaskGroupInstanceExecuteLog) {
        this.TaskGroupInstanceExecuteLog = TaskGroupInstanceExecuteLog;
    }

    /**
     * Get Whether the instance can be retried
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceIsRedo Whether the instance can be retried
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTaskGroupInstanceIsRedo() {
        return this.TaskGroupInstanceIsRedo;
    }

    /**
     * Set Whether the instance can be retried
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceIsRedo Whether the instance can be retried
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstanceIsRedo(Boolean TaskGroupInstanceIsRedo) {
        this.TaskGroupInstanceIsRedo = TaskGroupInstanceIsRedo;
    }

    /**
     * Get Action instance execution time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskGroupInstanceExecuteTime Action instance execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskGroupInstanceExecuteTime() {
        return this.TaskGroupInstanceExecuteTime;
    }

    /**
     * Set Action instance execution time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskGroupInstanceExecuteTime Action instance execution time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskGroupInstanceExecuteTime(Long TaskGroupInstanceExecuteTime) {
        this.TaskGroupInstanceExecuteTime = TaskGroupInstanceExecuteTime;
    }

    public TaskGroupInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskGroupInstance(TaskGroupInstance source) {
        if (source.TaskGroupInstanceId != null) {
            this.TaskGroupInstanceId = new Long(source.TaskGroupInstanceId);
        }
        if (source.TaskGroupInstanceObjectId != null) {
            this.TaskGroupInstanceObjectId = new String(source.TaskGroupInstanceObjectId);
        }
        if (source.TaskGroupInstanceStatus != null) {
            this.TaskGroupInstanceStatus = new Long(source.TaskGroupInstanceStatus);
        }
        if (source.TaskGroupInstanceCreateTime != null) {
            this.TaskGroupInstanceCreateTime = new String(source.TaskGroupInstanceCreateTime);
        }
        if (source.TaskGroupInstanceUpdateTime != null) {
            this.TaskGroupInstanceUpdateTime = new String(source.TaskGroupInstanceUpdateTime);
        }
        if (source.TaskGroupInstanceStatusType != null) {
            this.TaskGroupInstanceStatusType = new Long(source.TaskGroupInstanceStatusType);
        }
        if (source.TaskGroupInstanceStartTime != null) {
            this.TaskGroupInstanceStartTime = new String(source.TaskGroupInstanceStartTime);
        }
        if (source.TaskGroupInstanceEndTime != null) {
            this.TaskGroupInstanceEndTime = new String(source.TaskGroupInstanceEndTime);
        }
        if (source.TaskGroupInstanceExecuteLog != null) {
            this.TaskGroupInstanceExecuteLog = new String(source.TaskGroupInstanceExecuteLog);
        }
        if (source.TaskGroupInstanceIsRedo != null) {
            this.TaskGroupInstanceIsRedo = new Boolean(source.TaskGroupInstanceIsRedo);
        }
        if (source.TaskGroupInstanceExecuteTime != null) {
            this.TaskGroupInstanceExecuteTime = new Long(source.TaskGroupInstanceExecuteTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskGroupInstanceId", this.TaskGroupInstanceId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceObjectId", this.TaskGroupInstanceObjectId);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatus", this.TaskGroupInstanceStatus);
        this.setParamSimple(map, prefix + "TaskGroupInstanceCreateTime", this.TaskGroupInstanceCreateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceUpdateTime", this.TaskGroupInstanceUpdateTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStatusType", this.TaskGroupInstanceStatusType);
        this.setParamSimple(map, prefix + "TaskGroupInstanceStartTime", this.TaskGroupInstanceStartTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceEndTime", this.TaskGroupInstanceEndTime);
        this.setParamSimple(map, prefix + "TaskGroupInstanceExecuteLog", this.TaskGroupInstanceExecuteLog);
        this.setParamSimple(map, prefix + "TaskGroupInstanceIsRedo", this.TaskGroupInstanceIsRedo);
        this.setParamSimple(map, prefix + "TaskGroupInstanceExecuteTime", this.TaskGroupInstanceExecuteTime);

    }
}

