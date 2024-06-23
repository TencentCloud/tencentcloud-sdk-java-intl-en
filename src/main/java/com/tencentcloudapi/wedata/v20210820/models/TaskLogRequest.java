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

public class TaskLogRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Start timestamp, unit: milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp, unit: milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Number of log pulls, default 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Log sorting, desc for descending, asc for ascending
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * Real-time task 201 Offline task 202 Default is real-time task
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

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
     * Get Start timestamp, unit: milliseconds 
     * @return StartTime Start timestamp, unit: milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp, unit: milliseconds
     * @param StartTime Start timestamp, unit: milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp, unit: milliseconds 
     * @return EndTime End timestamp, unit: milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp, unit: milliseconds
     * @param EndTime End timestamp, unit: milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Number of log pulls, default 100 
     * @return Limit Number of log pulls, default 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of log pulls, default 100
     * @param Limit Number of log pulls, default 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Log sorting, desc for descending, asc for ascending 
     * @return OrderType Log sorting, desc for descending, asc for ascending
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set Log sorting, desc for descending, asc for ascending
     * @param OrderType Log sorting, desc for descending, asc for ascending
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get Real-time task 201 Offline task 202 Default is real-time task 
     * @return TaskType Real-time task 201 Offline task 202 Default is real-time task
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Real-time task 201 Offline task 202 Default is real-time task
     * @param TaskType Real-time task 201 Offline task 202 Default is real-time task
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public TaskLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogRequest(TaskLogRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

