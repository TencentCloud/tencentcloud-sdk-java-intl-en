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

public class EventListenerTaskInfo extends AbstractModel {

    /**
    * Task ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Workflow id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Task type name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Project ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
     * Get Task ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task Name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task Name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Workflow id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Workflow id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Workflow id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowName Workflow name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Task type id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Task type name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Project ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task cycle type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CycleType Task cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set Task cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CycleType Task cycle type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    public EventListenerTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListenerTaskInfo(EventListenerTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);

    }
}

