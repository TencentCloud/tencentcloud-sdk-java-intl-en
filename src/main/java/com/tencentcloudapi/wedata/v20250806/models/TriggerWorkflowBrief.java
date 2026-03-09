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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerWorkflowBrief extends AbstractModel {

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID.
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
    * Number of Tasks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Scheduling configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkflowTriggerConfig")
    @Expose
    private WorkflowTriggerConfig WorkflowTriggerConfig;

    /**
    * Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * Workflow parameter.
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowId Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Task ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowId Task ID.
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
     * Get Number of Tasks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskCount Number of Tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of Tasks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskCount Number of Tasks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get Folder ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderId Folder ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Folder name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FolderName Folder name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Scheduling configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkflowTriggerConfig Scheduling configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkflowTriggerConfig getWorkflowTriggerConfig() {
        return this.WorkflowTriggerConfig;
    }

    /**
     * Set Scheduling configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkflowTriggerConfig Scheduling configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkflowTriggerConfig(WorkflowTriggerConfig WorkflowTriggerConfig) {
        this.WorkflowTriggerConfig = WorkflowTriggerConfig;
    }

    /**
     * Get Responsible person.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserNameInCharge Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserNameInCharge Responsible person.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserUinInCharge Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserUinInCharge Responsible person ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get Workflow parameter. 
     * @return WorkflowParams Workflow parameter.
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set Workflow parameter.
     * @param WorkflowParams Workflow parameter.
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    public TriggerWorkflowBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowBrief(TriggerWorkflowBrief source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowTriggerConfig != null) {
            this.WorkflowTriggerConfig = new WorkflowTriggerConfig(source.WorkflowTriggerConfig);
        }
        if (source.UserNameInCharge != null) {
            this.UserNameInCharge = new String(source.UserNameInCharge);
        }
        if (source.UserUinInCharge != null) {
            this.UserUinInCharge = new String(source.UserUinInCharge);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamObj(map, prefix + "WorkflowTriggerConfig.", this.WorkflowTriggerConfig);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);

    }
}

