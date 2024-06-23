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

public class WorkflowCanvasOpsDto extends AbstractModel {

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow Detail Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Parent Folder IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Associated Folder IDs
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * Task ListNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tasks")
    @Expose
    private TaskOpsDto [] Tasks;

    /**
    * Task Dependency Edge List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Links")
    @Expose
    private LinkOpsDto [] Links;

    /**
    * Workflow User Group ID, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * Workflow User Group Name, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Project nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Workflow Detail Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowDesc Workflow Detail Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow Detail Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowDesc Workflow Detail Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Workflow nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Parent Folder IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Parent Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Parent Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Parent Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Associated Folder IDs
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderIds Associated Folder IDs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set Associated Folder IDs
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FolderIds Associated Folder IDs
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get Task ListNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Tasks Task ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public TaskOpsDto [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task ListNote: This field may return null, indicating that no valid value can be obtained.
     * @param Tasks Task ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTasks(TaskOpsDto [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Task Dependency Edge List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Links Task Dependency Edge List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public LinkOpsDto [] getLinks() {
        return this.Links;
    }

    /**
     * Set Task Dependency Edge List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Links Task Dependency Edge List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLinks(LinkOpsDto [] Links) {
        this.Links = Links;
    }

    /**
     * Get Workflow User Group ID, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserGroupId Workflow User Group ID, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set Workflow User Group ID, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserGroupId Workflow User Group ID, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get Workflow User Group Name, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserGroupName Workflow User Group Name, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set Workflow User Group Name, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserGroupName Workflow User Group Name, if multiple, separated by semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project IdentifierNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectIdent Project IdentifierNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get Project nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Person in ChargeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Owner Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Owner Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerId Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerId Responsible User ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public WorkflowCanvasOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowCanvasOpsDto(WorkflowCanvasOpsDto source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskOpsDto[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskOpsDto(source.Tasks[i]);
            }
        }
        if (source.Links != null) {
            this.Links = new LinkOpsDto[source.Links.length];
            for (int i = 0; i < source.Links.length; i++) {
                this.Links[i] = new LinkOpsDto(source.Links[i]);
            }
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamArrayObj(map, prefix + "Links.", this.Links);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

