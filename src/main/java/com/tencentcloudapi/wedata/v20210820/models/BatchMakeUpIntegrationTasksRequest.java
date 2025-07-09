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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchMakeUpIntegrationTasksRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Task Type, 201 for Real-time Task, 202 for Offline Task
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Data Supplement Start Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Data Supplement End Time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Task ID 
     * @return TaskIds Task ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task ID
     * @param TaskIds Task ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Task Type, 201 for Real-time Task, 202 for Offline Task 
     * @return TaskType Task Type, 201 for Real-time Task, 202 for Offline Task
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type, 201 for Real-time Task, 202 for Offline Task
     * @param TaskType Task Type, 201 for Real-time Task, 202 for Offline Task
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Data Supplement Start Time 
     * @return StartTime Data Supplement Start Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Data Supplement Start Time
     * @param StartTime Data Supplement Start Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Data Supplement End Time 
     * @return EndTime Data Supplement End Time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Data Supplement End Time
     * @param EndTime Data Supplement End Time
     */
    public void setEndTime(String EndTime) {
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

    public BatchMakeUpIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchMakeUpIntegrationTasksRequest(BatchMakeUpIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

