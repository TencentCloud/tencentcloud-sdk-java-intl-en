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

public class TaskListItem extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task name
    */
    @SerializedName("TaskTitle")
    @Expose
    private String TaskTitle;

    /**
    * Task description
    */
    @SerializedName("TaskDescription")
    @Expose
    private String TaskDescription;

    /**
    * Task tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTag")
    @Expose
    private String TaskTag;

    /**
    * Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * Task creation time
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * Task update time
    */
    @SerializedName("TaskUpdateTime")
    @Expose
    private String TaskUpdateTime;

    /**
    * 0: not started; 1: in progress; 2: completed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPreCheckStatus")
    @Expose
    private Long TaskPreCheckStatus;

    /**
    * Whether the environmental check is passed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskPreCheckSuccess")
    @Expose
    private Boolean TaskPreCheckSuccess;

    /**
    * Whether the experiment result meets expectations. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskExpect")
    @Expose
    private Long TaskExpect;

    /**
    * ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Verification item ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyId")
    @Expose
    private Long VerifyId;

    /**
    * Status. 0: no status; 1: successful; 2: failed; 3: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatusType")
    @Expose
    private Long TaskStatusType;

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name 
     * @return TaskTitle Task name
     */
    public String getTaskTitle() {
        return this.TaskTitle;
    }

    /**
     * Set Task name
     * @param TaskTitle Task name
     */
    public void setTaskTitle(String TaskTitle) {
        this.TaskTitle = TaskTitle;
    }

    /**
     * Get Task description 
     * @return TaskDescription Task description
     */
    public String getTaskDescription() {
        return this.TaskDescription;
    }

    /**
     * Set Task description
     * @param TaskDescription Task description
     */
    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    /**
     * Get Task tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTag Task tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskTag() {
        return this.TaskTag;
    }

    /**
     * Set Task tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTag Task tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTag(String TaskTag) {
        this.TaskTag = TaskTag;
    }

    /**
     * Get Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended) 
     * @return TaskStatus Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     * @param TaskStatus Task status (1001: not started; 1002: in progress; 1003: paused; 1004: ended)
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task creation time 
     * @return TaskCreateTime Task creation time
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set Task creation time
     * @param TaskCreateTime Task creation time
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get Task update time 
     * @return TaskUpdateTime Task update time
     */
    public String getTaskUpdateTime() {
        return this.TaskUpdateTime;
    }

    /**
     * Set Task update time
     * @param TaskUpdateTime Task update time
     */
    public void setTaskUpdateTime(String TaskUpdateTime) {
        this.TaskUpdateTime = TaskUpdateTime;
    }

    /**
     * Get 0: not started; 1: in progress; 2: completed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPreCheckStatus 0: not started; 1: in progress; 2: completed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskPreCheckStatus() {
        return this.TaskPreCheckStatus;
    }

    /**
     * Set 0: not started; 1: in progress; 2: completed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPreCheckStatus 0: not started; 1: in progress; 2: completed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPreCheckStatus(Long TaskPreCheckStatus) {
        this.TaskPreCheckStatus = TaskPreCheckStatus;
    }

    /**
     * Get Whether the environmental check is passed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskPreCheckSuccess Whether the environmental check is passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTaskPreCheckSuccess() {
        return this.TaskPreCheckSuccess;
    }

    /**
     * Set Whether the environmental check is passed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskPreCheckSuccess Whether the environmental check is passed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskPreCheckSuccess(Boolean TaskPreCheckSuccess) {
        this.TaskPreCheckSuccess = TaskPreCheckSuccess;
    }

    /**
     * Get Whether the experiment result meets expectations. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskExpect Whether the experiment result meets expectations. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskExpect() {
        return this.TaskExpect;
    }

    /**
     * Set Whether the experiment result meets expectations. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskExpect Whether the experiment result meets expectations. 1: expectations met; 2: expectations not met.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskExpect(Long TaskExpect) {
        this.TaskExpect = TaskExpect;
    }

    /**
     * Get ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId ID of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Name of the associated application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Verification item ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerifyId Verification item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVerifyId() {
        return this.VerifyId;
    }

    /**
     * Set Verification item ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerifyId Verification item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyId(Long VerifyId) {
        this.VerifyId = VerifyId;
    }

    /**
     * Get Status. 0: no status; 1: successful; 2: failed; 3: terminated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatusType Status. 0: no status; 1: successful; 2: failed; 3: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskStatusType() {
        return this.TaskStatusType;
    }

    /**
     * Set Status. 0: no status; 1: successful; 2: failed; 3: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatusType Status. 0: no status; 1: successful; 2: failed; 3: terminated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatusType(Long TaskStatusType) {
        this.TaskStatusType = TaskStatusType;
    }

    public TaskListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskListItem(TaskListItem source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskTitle != null) {
            this.TaskTitle = new String(source.TaskTitle);
        }
        if (source.TaskDescription != null) {
            this.TaskDescription = new String(source.TaskDescription);
        }
        if (source.TaskTag != null) {
            this.TaskTag = new String(source.TaskTag);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskUpdateTime != null) {
            this.TaskUpdateTime = new String(source.TaskUpdateTime);
        }
        if (source.TaskPreCheckStatus != null) {
            this.TaskPreCheckStatus = new Long(source.TaskPreCheckStatus);
        }
        if (source.TaskPreCheckSuccess != null) {
            this.TaskPreCheckSuccess = new Boolean(source.TaskPreCheckSuccess);
        }
        if (source.TaskExpect != null) {
            this.TaskExpect = new Long(source.TaskExpect);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.VerifyId != null) {
            this.VerifyId = new Long(source.VerifyId);
        }
        if (source.TaskStatusType != null) {
            this.TaskStatusType = new Long(source.TaskStatusType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTitle", this.TaskTitle);
        this.setParamSimple(map, prefix + "TaskDescription", this.TaskDescription);
        this.setParamSimple(map, prefix + "TaskTag", this.TaskTag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskUpdateTime", this.TaskUpdateTime);
        this.setParamSimple(map, prefix + "TaskPreCheckStatus", this.TaskPreCheckStatus);
        this.setParamSimple(map, prefix + "TaskPreCheckSuccess", this.TaskPreCheckSuccess);
        this.setParamSimple(map, prefix + "TaskExpect", this.TaskExpect);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VerifyId", this.VerifyId);
        this.setParamSimple(map, prefix + "TaskStatusType", this.TaskStatusType);

    }
}

