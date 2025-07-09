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

public class BatchDeleteIntegrationTasksRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

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
    * Whether to delete development state tasks. By default, development state is not deleted, 0 means do not delete, 1 means delete
    */
    @SerializedName("DeleteKFFlag")
    @Expose
    private Long DeleteKFFlag;

    /**
    * Operation Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This batch operation involves tasks for auditing
    */
    @SerializedName("TaskNames")
    @Expose
    private String [] TaskNames;

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
     * Get Whether to delete development state tasks. By default, development state is not deleted, 0 means do not delete, 1 means delete 
     * @return DeleteKFFlag Whether to delete development state tasks. By default, development state is not deleted, 0 means do not delete, 1 means delete
     */
    public Long getDeleteKFFlag() {
        return this.DeleteKFFlag;
    }

    /**
     * Set Whether to delete development state tasks. By default, development state is not deleted, 0 means do not delete, 1 means delete
     * @param DeleteKFFlag Whether to delete development state tasks. By default, development state is not deleted, 0 means do not delete, 1 means delete
     */
    public void setDeleteKFFlag(Long DeleteKFFlag) {
        this.DeleteKFFlag = DeleteKFFlag;
    }

    /**
     * Get Operation Name 
     * @return Name Operation Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Operation Name
     * @param Name Operation Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This batch operation involves tasks for auditing 
     * @return TaskNames This batch operation involves tasks for auditing
     */
    public String [] getTaskNames() {
        return this.TaskNames;
    }

    /**
     * Set This batch operation involves tasks for auditing
     * @param TaskNames This batch operation involves tasks for auditing
     */
    public void setTaskNames(String [] TaskNames) {
        this.TaskNames = TaskNames;
    }

    public BatchDeleteIntegrationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteIntegrationTasksRequest(BatchDeleteIntegrationTasksRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeleteKFFlag != null) {
            this.DeleteKFFlag = new Long(source.DeleteKFFlag);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskNames != null) {
            this.TaskNames = new String[source.TaskNames.length];
            for (int i = 0; i < source.TaskNames.length; i++) {
                this.TaskNames[i] = new String(source.TaskNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeleteKFFlag", this.DeleteKFFlag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "TaskNames.", this.TaskNames);

    }
}

