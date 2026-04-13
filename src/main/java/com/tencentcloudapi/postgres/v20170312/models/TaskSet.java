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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSet extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Specifies the task type.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Specifies the instance ID of the task instance.
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Start time of the task.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Specifies the task Running status, including Running, Success, WaitSwitch, Fail, Pause.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Indicates the progress of task execution, with a value range of 0-100.
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * Specifies the task details.
    */
    @SerializedName("TaskDetail")
    @Expose
    private TaskDetail TaskDetail;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Specifies the task type. 
     * @return TaskType Specifies the task type.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Specifies the task type.
     * @param TaskType Specifies the task type.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Specifies the instance ID of the task instance. 
     * @return DBInstanceId Specifies the instance ID of the task instance.
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID of the task instance.
     * @param DBInstanceId Specifies the instance ID of the task instance.
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Start time of the task. 
     * @return StartTime Start time of the task.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of the task.
     * @param StartTime Start time of the task.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time. 
     * @return EndTime Task end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time.
     * @param EndTime Task end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specifies the task Running status, including Running, Success, WaitSwitch, Fail, Pause. 
     * @return Status Specifies the task Running status, including Running, Success, WaitSwitch, Fail, Pause.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Specifies the task Running status, including Running, Success, WaitSwitch, Fail, Pause.
     * @param Status Specifies the task Running status, including Running, Success, WaitSwitch, Fail, Pause.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Indicates the progress of task execution, with a value range of 0-100. 
     * @return Progress Indicates the progress of task execution, with a value range of 0-100.
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Indicates the progress of task execution, with a value range of 0-100.
     * @param Progress Indicates the progress of task execution, with a value range of 0-100.
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Specifies the task details. 
     * @return TaskDetail Specifies the task details.
     */
    public TaskDetail getTaskDetail() {
        return this.TaskDetail;
    }

    /**
     * Set Specifies the task details.
     * @param TaskDetail Specifies the task details.
     */
    public void setTaskDetail(TaskDetail TaskDetail) {
        this.TaskDetail = TaskDetail;
    }

    public TaskSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSet(TaskSet source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TaskDetail != null) {
            this.TaskDetail = new TaskDetail(source.TaskDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "TaskDetail.", this.TaskDetail);

    }
}

