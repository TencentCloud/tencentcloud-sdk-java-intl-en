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

public class FolderOpsDto extends AbstractModel {

    /**
    * Folder IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Folder NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Update timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Parent Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * Total Workflows
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Workflow ListNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Workflows")
    @Expose
    private WorkflowCanvasOpsDto [] Workflows;

    /**
    * Total Subfolders
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalFolders")
    @Expose
    private Long TotalFolders;

    /**
    * Subfolder List
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FoldersList")
    @Expose
    private String FoldersList;

    /**
    * Search typeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FindType")
    @Expose
    private String FindType;

    /**
     * Get Folder IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Id Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param Id Folder IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Folder NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Folder NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Update timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Parent Folder ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParentsFolderId Parent Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set Parent Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParentsFolderId Parent Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get Total Workflows
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Total Total Workflows
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total Workflows
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Total Total Workflows
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Workflow ListNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Workflows Workflow ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public WorkflowCanvasOpsDto [] getWorkflows() {
        return this.Workflows;
    }

    /**
     * Set Workflow ListNote: This field may return null, indicating that no valid value can be obtained.
     * @param Workflows Workflow ListNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWorkflows(WorkflowCanvasOpsDto [] Workflows) {
        this.Workflows = Workflows;
    }

    /**
     * Get Total Subfolders
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalFolders Total Subfolders
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalFolders() {
        return this.TotalFolders;
    }

    /**
     * Set Total Subfolders
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalFolders Total Subfolders
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalFolders(Long TotalFolders) {
        this.TotalFolders = TotalFolders;
    }

    /**
     * Get Subfolder List
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FoldersList Subfolder List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFoldersList() {
        return this.FoldersList;
    }

    /**
     * Set Subfolder List
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FoldersList Subfolder List
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFoldersList(String FoldersList) {
        this.FoldersList = FoldersList;
    }

    /**
     * Get Search typeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FindType Search typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFindType() {
        return this.FindType;
    }

    /**
     * Set Search typeNote: This field may return null, indicating that no valid value can be obtained.
     * @param FindType Search typeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFindType(String FindType) {
        this.FindType = FindType;
    }

    public FolderOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FolderOpsDto(FolderOpsDto source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ParentsFolderId != null) {
            this.ParentsFolderId = new String(source.ParentsFolderId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Workflows != null) {
            this.Workflows = new WorkflowCanvasOpsDto[source.Workflows.length];
            for (int i = 0; i < source.Workflows.length; i++) {
                this.Workflows[i] = new WorkflowCanvasOpsDto(source.Workflows[i]);
            }
        }
        if (source.TotalFolders != null) {
            this.TotalFolders = new Long(source.TotalFolders);
        }
        if (source.FoldersList != null) {
            this.FoldersList = new String(source.FoldersList);
        }
        if (source.FindType != null) {
            this.FindType = new String(source.FindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ParentsFolderId", this.ParentsFolderId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Workflows.", this.Workflows);
        this.setParamSimple(map, prefix + "TotalFolders", this.TotalFolders);
        this.setParamSimple(map, prefix + "FoldersList", this.FoldersList);
        this.setParamSimple(map, prefix + "FindType", this.FindType);

    }
}

