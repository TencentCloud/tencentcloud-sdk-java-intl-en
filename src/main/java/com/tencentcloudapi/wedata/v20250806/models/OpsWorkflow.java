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

public class OpsWorkflow extends AbstractModel {

    /**
    * Number of Tasks
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * folder name.

    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Workflow folder id.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow id.
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
    * Specifies the workflow type.
-cycle period.
-manual.
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

    /**
    * Workflow description.

    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Responsible user id, multiple ';' separators.

    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project name.


    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Workflow creation time.

    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time. specifies development and production updates.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Last updated by, including development and production updates.
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
     * Get Number of Tasks 
     * @return TaskCount Number of Tasks
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of Tasks
     * @param TaskCount Number of Tasks
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get folder name.
 
     * @return FolderName folder name.

     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set folder name.

     * @param FolderName folder name.

     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Workflow folder id. 
     * @return FolderId Workflow folder id.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Workflow folder id.
     * @param FolderId Workflow folder id.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow id. 
     * @return WorkflowId Workflow id.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow id.
     * @param WorkflowId Workflow id.
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
     * Get Specifies the workflow type.
-cycle period.
-manual. 
     * @return WorkflowType Specifies the workflow type.
-cycle period.
-manual.
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set Specifies the workflow type.
-cycle period.
-manual.
     * @param WorkflowType Specifies the workflow type.
-cycle period.
-manual.
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    /**
     * Get Workflow description.
 
     * @return WorkflowDesc Workflow description.

     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.

     * @param WorkflowDesc Workflow description.

     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Responsible user id, multiple ';' separators.
 
     * @return OwnerUin Responsible user id, multiple ';' separators.

     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Responsible user id, multiple ';' separators.

     * @param OwnerUin Responsible user id, multiple ';' separators.

     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name.

 
     * @return ProjectName Project name.


     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.


     * @param ProjectName Project name.


     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid 
     * @return Status Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     * @param Status Workflow Status

* ALL_RUNNING: All running (all workflows are in scheduling state)

* ALL_FREEZED: All paused

* ALL_STOPPTED: All stopped

* PART_RUNNING: Partially running (some workflows are running, others not)

* ALL_NO_RUNNING: All not scheduled

* ALL_INVALID: All invalid
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Workflow creation time.
 
     * @return CreateTime Workflow creation time.

     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Workflow creation time.

     * @param CreateTime Workflow creation time.

     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest update time. specifies development and production updates. 
     * @return UpdateTime Latest update time. specifies development and production updates.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time. specifies development and production updates.
     * @param UpdateTime Latest update time. specifies development and production updates.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Last updated by, including development and production updates. 
     * @return UpdateUserUin Last updated by, including development and production updates.
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set Last updated by, including development and production updates.
     * @param UpdateUserUin Last updated by, including development and production updates.
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    public OpsWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsWorkflow(OpsWorkflow source) {
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);

    }
}

