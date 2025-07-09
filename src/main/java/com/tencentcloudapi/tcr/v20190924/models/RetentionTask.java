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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionTask extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Rule execution ID
    */
    @SerializedName("ExecutionId")
    @Expose
    private Long ExecutionId;

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task execution status. Valid values: Failed, Succeed, Stopped, InProgress.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Total number of tags
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of retained tags
    */
    @SerializedName("Retained")
    @Expose
    private Long Retained;

    /**
    * Application repository
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

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
     * Get Rule execution ID 
     * @return ExecutionId Rule execution ID
     */
    public Long getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set Rule execution ID
     * @param ExecutionId Rule execution ID
     */
    public void setExecutionId(Long ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task execution status. Valid values: Failed, Succeed, Stopped, InProgress. 
     * @return Status Task execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     * @param Status Task execution status. Valid values: Failed, Succeed, Stopped, InProgress.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Total number of tags 
     * @return Total Total number of tags
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of tags
     * @param Total Total number of tags
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of retained tags 
     * @return Retained Number of retained tags
     */
    public Long getRetained() {
        return this.Retained;
    }

    /**
     * Set Number of retained tags
     * @param Retained Number of retained tags
     */
    public void setRetained(Long Retained) {
        this.Retained = Retained;
    }

    /**
     * Get Application repository 
     * @return Repository Application repository
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set Application repository
     * @param Repository Application repository
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    public RetentionTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionTask(RetentionTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new Long(source.ExecutionId);
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
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Retained != null) {
            this.Retained = new Long(source.Retained);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Retained", this.Retained);
        this.setParamSimple(map, prefix + "Repository", this.Repository);

    }
}

