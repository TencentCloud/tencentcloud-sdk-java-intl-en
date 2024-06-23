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

public class BatchStartIntegrationTasksRequest extends AbstractModel {

    /**
    * Task Type, 201 for real-time tasks, 202 for offline tasks
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Batch run integration tasks, currently only used in real-time integration
    */
    @SerializedName("StartTaskInfoSet")
    @Expose
    private StartTaskInfo [] StartTaskInfoSet;

    /**
     * Get Task Type, 201 for real-time tasks, 202 for offline tasks 
     * @return TaskType Task Type, 201 for real-time tasks, 202 for offline tasks
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type, 201 for real-time tasks, 202 for offline tasks
     * @param TaskType Task Type, 201 for real-time tasks, 202 for offline tasks
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
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
     * Get Batch run integration tasks, currently only used in real-time integration 
     * @return StartTaskInfoSet Batch run integration tasks, currently only used in real-time integration
     */
    public StartTaskInfo [] getStartTaskInfoSet() {
        return this.StartTaskInfoSet;
    }

    /**
     * Set Batch run integration tasks, currently only used in real-time integration
     * @param StartTaskInfoSet Batch run integration tasks, currently only used in real-time integration
     */
    public void setStartTaskInfoSet(StartTaskInfo [] StartTaskInfoSet) {
        this.StartTaskInfoSet = StartTaskInfoSet;
    }

    public BatchStartIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchStartIntegrationTasksRequest(BatchStartIntegrationTasksRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.StartTaskInfoSet != null) {
            this.StartTaskInfoSet = new StartTaskInfo[source.StartTaskInfoSet.length];
            for (int i = 0; i < source.StartTaskInfoSet.length; i++) {
                this.StartTaskInfoSet[i] = new StartTaskInfo(source.StartTaskInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "StartTaskInfoSet.", this.StartTaskInfoSet);

    }
}

