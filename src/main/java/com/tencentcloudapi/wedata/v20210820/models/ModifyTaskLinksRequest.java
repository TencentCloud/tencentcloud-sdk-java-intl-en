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

public class ModifyTaskLinksRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Parent Task ID
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * Subtask ID
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * Subtask Workflow
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Parent Task Workflow
    */
    @SerializedName("RealFromWorkflowId")
    @Expose
    private String RealFromWorkflowId;

    /**
    * Dependency Relationship Between Parent and Child Tasks
    */
    @SerializedName("LinkDependencyType")
    @Expose
    private String LinkDependencyType;

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
     * Get Parent Task ID 
     * @return TaskFrom Parent Task ID
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set Parent Task ID
     * @param TaskFrom Parent Task ID
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get Subtask ID 
     * @return TaskTo Subtask ID
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set Subtask ID
     * @param TaskTo Subtask ID
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get Subtask Workflow 
     * @return WorkflowId Subtask Workflow
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Subtask Workflow
     * @param WorkflowId Subtask Workflow
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Parent Task Workflow 
     * @return RealFromWorkflowId Parent Task Workflow
     */
    public String getRealFromWorkflowId() {
        return this.RealFromWorkflowId;
    }

    /**
     * Set Parent Task Workflow
     * @param RealFromWorkflowId Parent Task Workflow
     */
    public void setRealFromWorkflowId(String RealFromWorkflowId) {
        this.RealFromWorkflowId = RealFromWorkflowId;
    }

    /**
     * Get Dependency Relationship Between Parent and Child Tasks 
     * @return LinkDependencyType Dependency Relationship Between Parent and Child Tasks
     */
    public String getLinkDependencyType() {
        return this.LinkDependencyType;
    }

    /**
     * Set Dependency Relationship Between Parent and Child Tasks
     * @param LinkDependencyType Dependency Relationship Between Parent and Child Tasks
     */
    public void setLinkDependencyType(String LinkDependencyType) {
        this.LinkDependencyType = LinkDependencyType;
    }

    public ModifyTaskLinksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskLinksRequest(ModifyTaskLinksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.RealFromWorkflowId != null) {
            this.RealFromWorkflowId = new String(source.RealFromWorkflowId);
        }
        if (source.LinkDependencyType != null) {
            this.LinkDependencyType = new String(source.LinkDependencyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "RealFromWorkflowId", this.RealFromWorkflowId);
        this.setParamSimple(map, prefix + "LinkDependencyType", this.LinkDependencyType);

    }
}

