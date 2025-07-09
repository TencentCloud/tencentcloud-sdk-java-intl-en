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

public class WorkflowExtOpsDto extends AbstractModel {

    /**
    * Number of Tasks Count
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * File NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * Person in ChargeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Person in charge userId\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

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
    * Workflow DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkFlowDesc")
    @Expose
    private String WorkFlowDesc;

    /**
    * Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WorkFlowName")
    @Expose
    private String WorkFlowName;

    /**
    * Workflow file id\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow statusNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Workflow creation time\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Number of Tasks Count
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskCount Number of Tasks Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of Tasks Count
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TaskCount Number of Tasks Count
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get File NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set File NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderName File NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get Workflow IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkFlowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkFlowId Workflow IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
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
     * Get Person in charge userId\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerId Person in charge userId\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Person in charge userId\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerId Person in charge userId\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
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
     * Get Workflow DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkFlowDesc Workflow DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkFlowDesc() {
        return this.WorkFlowDesc;
    }

    /**
     * Set Workflow DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkFlowDesc Workflow DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkFlowDesc(String WorkFlowDesc) {
        this.WorkFlowDesc = WorkFlowDesc;
    }

    /**
     * Get Workflow nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return WorkFlowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getWorkFlowName() {
        return this.WorkFlowName;
    }

    /**
     * Set Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param WorkFlowName Workflow nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkFlowName(String WorkFlowName) {
        this.WorkFlowName = WorkFlowName;
    }

    /**
     * Get Workflow file id\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Workflow file id\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Workflow file id\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Workflow file id\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Workflow statusNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Status Workflow statusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow statusNote: This field may return null, indicating that no valid value can be obtained.
     * @param Status Workflow statusNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Workflow creation time\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Workflow creation time\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Workflow creation time\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Workflow creation time\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ModifyTime Last update time\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last update time\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param ModifyTime Last update time\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public WorkflowExtOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowExtOpsDto(WorkflowExtOpsDto source) {
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
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
        if (source.WorkFlowDesc != null) {
            this.WorkFlowDesc = new String(source.WorkFlowDesc);
        }
        if (source.WorkFlowName != null) {
            this.WorkFlowName = new String(source.WorkFlowName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "WorkFlowDesc", this.WorkFlowDesc);
        this.setParamSimple(map, prefix + "WorkFlowName", this.WorkFlowName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

