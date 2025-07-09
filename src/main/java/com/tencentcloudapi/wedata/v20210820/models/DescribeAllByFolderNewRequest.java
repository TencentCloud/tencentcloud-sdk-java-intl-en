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

public class DescribeAllByFolderNewRequest extends AbstractModel {

    /**
    * Folder Attributes
    */
    @SerializedName("Folder")
    @Expose
    private FolderOpsDto Folder;

    /**
    * Workflow List
    */
    @SerializedName("Workflows")
    @Expose
    private WorkflowCanvasOpsDto [] Workflows;

    /**
    * Target File ID
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * Keyword
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
    * Parent File ID
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * Pull Folder List
    */
    @SerializedName("IsAddWorkflow")
    @Expose
    private String IsAddWorkflow;

    /**
    * Task Status
    */
    @SerializedName("TaskStates")
    @Expose
    private String [] TaskStates;

    /**
    * Search type
    */
    @SerializedName("FindType")
    @Expose
    private String FindType;

    /**
    * Access type
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * Operator Name
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * Operator ID
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

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
    * Index Page Number
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total Data
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Basic Request Information
    */
    @SerializedName("RequestBaseInfo")
    @Expose
    private ProjectBaseInfoOpsRequest RequestBaseInfo;

    /**
    * Whether to Calculate Total
    */
    @SerializedName("IsCount")
    @Expose
    private Boolean IsCount;

    /**
     * Get Folder Attributes 
     * @return Folder Folder Attributes
     */
    public FolderOpsDto getFolder() {
        return this.Folder;
    }

    /**
     * Set Folder Attributes
     * @param Folder Folder Attributes
     */
    public void setFolder(FolderOpsDto Folder) {
        this.Folder = Folder;
    }

    /**
     * Get Workflow List 
     * @return Workflows Workflow List
     */
    public WorkflowCanvasOpsDto [] getWorkflows() {
        return this.Workflows;
    }

    /**
     * Set Workflow List
     * @param Workflows Workflow List
     */
    public void setWorkflows(WorkflowCanvasOpsDto [] Workflows) {
        this.Workflows = Workflows;
    }

    /**
     * Get Target File ID 
     * @return TargetFolderId Target File ID
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set Target File ID
     * @param TargetFolderId Target File ID
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get Keyword 
     * @return KeyWords Keyword
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set Keyword
     * @param KeyWords Keyword
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get Parent File ID 
     * @return ParentsFolderId Parent File ID
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set Parent File ID
     * @param ParentsFolderId Parent File ID
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get Pull Folder List 
     * @return IsAddWorkflow Pull Folder List
     */
    public String getIsAddWorkflow() {
        return this.IsAddWorkflow;
    }

    /**
     * Set Pull Folder List
     * @param IsAddWorkflow Pull Folder List
     */
    public void setIsAddWorkflow(String IsAddWorkflow) {
        this.IsAddWorkflow = IsAddWorkflow;
    }

    /**
     * Get Task Status 
     * @return TaskStates Task Status
     */
    public String [] getTaskStates() {
        return this.TaskStates;
    }

    /**
     * Set Task Status
     * @param TaskStates Task Status
     */
    public void setTaskStates(String [] TaskStates) {
        this.TaskStates = TaskStates;
    }

    /**
     * Get Search type 
     * @return FindType Search type
     */
    public String getFindType() {
        return this.FindType;
    }

    /**
     * Set Search type
     * @param FindType Search type
     */
    public void setFindType(String FindType) {
        this.FindType = FindType;
    }

    /**
     * Get Access type 
     * @return OptType Access type
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set Access type
     * @param OptType Access type
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get Operator Name 
     * @return OperatorName Operator Name
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set Operator Name
     * @param OperatorName Operator Name
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get Operator ID 
     * @return OperatorId Operator ID
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set Operator ID
     * @param OperatorId Operator ID
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
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
     * Get Index Page Number 
     * @return PageIndex Index Page Number
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set Index Page Number
     * @param PageIndex Index Page Number
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total Data 
     * @return Count Total Data
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total Data
     * @param Count Total Data
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Basic Request Information 
     * @return RequestBaseInfo Basic Request Information
     */
    public ProjectBaseInfoOpsRequest getRequestBaseInfo() {
        return this.RequestBaseInfo;
    }

    /**
     * Set Basic Request Information
     * @param RequestBaseInfo Basic Request Information
     */
    public void setRequestBaseInfo(ProjectBaseInfoOpsRequest RequestBaseInfo) {
        this.RequestBaseInfo = RequestBaseInfo;
    }

    /**
     * Get Whether to Calculate Total 
     * @return IsCount Whether to Calculate Total
     */
    public Boolean getIsCount() {
        return this.IsCount;
    }

    /**
     * Set Whether to Calculate Total
     * @param IsCount Whether to Calculate Total
     */
    public void setIsCount(Boolean IsCount) {
        this.IsCount = IsCount;
    }

    public DescribeAllByFolderNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllByFolderNewRequest(DescribeAllByFolderNewRequest source) {
        if (source.Folder != null) {
            this.Folder = new FolderOpsDto(source.Folder);
        }
        if (source.Workflows != null) {
            this.Workflows = new WorkflowCanvasOpsDto[source.Workflows.length];
            for (int i = 0; i < source.Workflows.length; i++) {
                this.Workflows[i] = new WorkflowCanvasOpsDto(source.Workflows[i]);
            }
        }
        if (source.TargetFolderId != null) {
            this.TargetFolderId = new String(source.TargetFolderId);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String(source.KeyWords);
        }
        if (source.ParentsFolderId != null) {
            this.ParentsFolderId = new String(source.ParentsFolderId);
        }
        if (source.IsAddWorkflow != null) {
            this.IsAddWorkflow = new String(source.IsAddWorkflow);
        }
        if (source.TaskStates != null) {
            this.TaskStates = new String[source.TaskStates.length];
            for (int i = 0; i < source.TaskStates.length; i++) {
                this.TaskStates[i] = new String(source.TaskStates[i]);
            }
        }
        if (source.FindType != null) {
            this.FindType = new String(source.FindType);
        }
        if (source.OptType != null) {
            this.OptType = new String(source.OptType);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
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
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestBaseInfo != null) {
            this.RequestBaseInfo = new ProjectBaseInfoOpsRequest(source.RequestBaseInfo);
        }
        if (source.IsCount != null) {
            this.IsCount = new Boolean(source.IsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Folder.", this.Folder);
        this.setParamArrayObj(map, prefix + "Workflows.", this.Workflows);
        this.setParamSimple(map, prefix + "TargetFolderId", this.TargetFolderId);
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);
        this.setParamSimple(map, prefix + "ParentsFolderId", this.ParentsFolderId);
        this.setParamSimple(map, prefix + "IsAddWorkflow", this.IsAddWorkflow);
        this.setParamArraySimple(map, prefix + "TaskStates.", this.TaskStates);
        this.setParamSimple(map, prefix + "FindType", this.FindType);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "RequestBaseInfo.", this.RequestBaseInfo);
        this.setParamSimple(map, prefix + "IsCount", this.IsCount);

    }
}

