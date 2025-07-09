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

public class DeleteTaskAlarmRegularRequest extends AbstractModel {

    /**
    * Primary key ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Type (201 represents Real-time task, 202 represents Offline task)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get Primary key ID 
     * @return Id Primary key ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Primary key ID
     * @param Id Primary key ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get Task Type (201 represents Real-time task, 202 represents Offline task) 
     * @return TaskType Task Type (201 represents Real-time task, 202 represents Offline task)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type (201 represents Real-time task, 202 represents Offline task)
     * @param TaskType Task Type (201 represents Real-time task, 202 represents Offline task)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public DeleteTaskAlarmRegularRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskAlarmRegularRequest(DeleteTaskAlarmRegularRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

