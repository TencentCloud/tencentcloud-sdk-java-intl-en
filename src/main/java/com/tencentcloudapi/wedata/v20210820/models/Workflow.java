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

public class Workflow extends AbstractModel {

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project Identifier
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * RemarksNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow name
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Parent Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow User Group ID If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserGroupId")
    @Expose
    private String UserGroupId;

    /**
    * Workflow User Group Name If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserGroupName")
    @Expose
    private String UserGroupName;

    /**
     * Get Workflow ID 
     * @return WorkflowId Workflow ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID
     * @param WorkflowId Workflow ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Person in Charge
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Owner Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Owner Person in Charge
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerId Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerId Responsible Person ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
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
     * Get Project Identifier 
     * @return ProjectIdent Project Identifier
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set Project Identifier
     * @param ProjectIdent Project Identifier
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get RemarksNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkflowDesc RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set RemarksNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkflowDesc RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Workflow name 
     * @return WorkflowName Workflow name
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name
     * @param WorkflowName Workflow name
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Parent Folder ID 
     * @return FolderId Parent Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Parent Folder ID
     * @param FolderId Parent Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow User Group ID If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserGroupId Workflow User Group ID If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set Workflow User Group ID If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserGroupId Workflow User Group ID If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserGroupId(String UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get Workflow User Group Name If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserGroupName Workflow User Group Name If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserGroupName() {
        return this.UserGroupName;
    }

    /**
     * Set Workflow User Group Name If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserGroupName Workflow User Group Name If there are multiple, separate with semicolons: a;b;c
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserGroupName(String UserGroupName) {
        this.UserGroupName = UserGroupName;
    }

    public Workflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Workflow(Workflow source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
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
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new String(source.UserGroupId);
        }
        if (source.UserGroupName != null) {
            this.UserGroupName = new String(source.UserGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamSimple(map, prefix + "UserGroupName", this.UserGroupName);

    }
}

