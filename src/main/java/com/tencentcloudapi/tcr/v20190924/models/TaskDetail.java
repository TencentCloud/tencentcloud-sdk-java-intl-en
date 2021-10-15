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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDetail extends AbstractModel{

    /**
    * Task
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task UUID
    */
    @SerializedName("TaskUUID")
    @Expose
    private String TaskUUID;

    /**
    * Task status
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Task details
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * Start time of the task
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * End time of the task
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
     * Get Task 
     * @return TaskName Task
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task
     * @param TaskName Task
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task UUID 
     * @return TaskUUID Task UUID
     */
    public String getTaskUUID() {
        return this.TaskUUID;
    }

    /**
     * Set Task UUID
     * @param TaskUUID Task UUID
     */
    public void setTaskUUID(String TaskUUID) {
        this.TaskUUID = TaskUUID;
    }

    /**
     * Get Task status 
     * @return TaskStatus Task status
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status
     * @param TaskStatus Task status
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Task details
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TaskMessage Task details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set Task details
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TaskMessage Task details
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get Start time of the task 
     * @return CreatedTime Start time of the task
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Start time of the task
     * @param CreatedTime Start time of the task
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get End time of the task
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FinishedTime End time of the task
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set End time of the task
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FinishedTime End time of the task
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    public TaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDetail(TaskDetail source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskUUID != null) {
            this.TaskUUID = new String(source.TaskUUID);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskMessage != null) {
            this.TaskMessage = new String(source.TaskMessage);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskUUID", this.TaskUUID);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);

    }
}

