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

public class DescribeDsFolderTreeRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to Pull at First Level true Yes 
false No
    */
    @SerializedName("FirstLevelPull")
    @Expose
    private Boolean FirstLevelPull;

    /**
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Keyword Search
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Whether to Include Workflow true Yes 
false No
    */
    @SerializedName("IncludeWorkflow")
    @Expose
    private Boolean IncludeWorkflow;

    /**
    * Whether to Include Tasks true Yes 
false No
    */
    @SerializedName("IncludeTask")
    @Expose
    private Boolean IncludeTask;

    /**
    * Does it include virtual tasks? This parameter is effective only when IncludeTask is true, default is true
    */
    @SerializedName("IncludeVirtualTask")
    @Expose
    private Boolean IncludeVirtualTask;

    /**
    * Task directory ID
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * classification. Categorized Display  catalog. Directory Display
    */
    @SerializedName("DisplayType")
    @Expose
    private String DisplayType;

    /**
    * Does it include task directories? true means yes
false No
    */
    @SerializedName("IncludeTaskFolder")
    @Expose
    private Boolean IncludeTaskFolder;

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
     * Get Whether to Pull at First Level true Yes 
false No 
     * @return FirstLevelPull Whether to Pull at First Level true Yes 
false No
     */
    public Boolean getFirstLevelPull() {
        return this.FirstLevelPull;
    }

    /**
     * Set Whether to Pull at First Level true Yes 
false No
     * @param FirstLevelPull Whether to Pull at First Level true Yes 
false No
     */
    public void setFirstLevelPull(Boolean FirstLevelPull) {
        this.FirstLevelPull = FirstLevelPull;
    }

    /**
     * Get Folder ID 
     * @return FolderId Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
     * @param FolderId Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

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
     * Get Keyword Search 
     * @return Keyword Keyword Search
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword Search
     * @param Keyword Keyword Search
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Whether to Include Workflow true Yes 
false No 
     * @return IncludeWorkflow Whether to Include Workflow true Yes 
false No
     */
    public Boolean getIncludeWorkflow() {
        return this.IncludeWorkflow;
    }

    /**
     * Set Whether to Include Workflow true Yes 
false No
     * @param IncludeWorkflow Whether to Include Workflow true Yes 
false No
     */
    public void setIncludeWorkflow(Boolean IncludeWorkflow) {
        this.IncludeWorkflow = IncludeWorkflow;
    }

    /**
     * Get Whether to Include Tasks true Yes 
false No 
     * @return IncludeTask Whether to Include Tasks true Yes 
false No
     */
    public Boolean getIncludeTask() {
        return this.IncludeTask;
    }

    /**
     * Set Whether to Include Tasks true Yes 
false No
     * @param IncludeTask Whether to Include Tasks true Yes 
false No
     */
    public void setIncludeTask(Boolean IncludeTask) {
        this.IncludeTask = IncludeTask;
    }

    /**
     * Get Does it include virtual tasks? This parameter is effective only when IncludeTask is true, default is true 
     * @return IncludeVirtualTask Does it include virtual tasks? This parameter is effective only when IncludeTask is true, default is true
     */
    public Boolean getIncludeVirtualTask() {
        return this.IncludeVirtualTask;
    }

    /**
     * Set Does it include virtual tasks? This parameter is effective only when IncludeTask is true, default is true
     * @param IncludeVirtualTask Does it include virtual tasks? This parameter is effective only when IncludeTask is true, default is true
     */
    public void setIncludeVirtualTask(Boolean IncludeVirtualTask) {
        this.IncludeVirtualTask = IncludeVirtualTask;
    }

    /**
     * Get Task directory ID 
     * @return TaskFolderId Task directory ID
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set Task directory ID
     * @param TaskFolderId Task directory ID
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get classification. Categorized Display  catalog. Directory Display 
     * @return DisplayType classification. Categorized Display  catalog. Directory Display
     */
    public String getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set classification. Categorized Display  catalog. Directory Display
     * @param DisplayType classification. Categorized Display  catalog. Directory Display
     */
    public void setDisplayType(String DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get Does it include task directories? true means yes
false No 
     * @return IncludeTaskFolder Does it include task directories? true means yes
false No
     */
    public Boolean getIncludeTaskFolder() {
        return this.IncludeTaskFolder;
    }

    /**
     * Set Does it include task directories? true means yes
false No
     * @param IncludeTaskFolder Does it include task directories? true means yes
false No
     */
    public void setIncludeTaskFolder(Boolean IncludeTaskFolder) {
        this.IncludeTaskFolder = IncludeTaskFolder;
    }

    public DescribeDsFolderTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsFolderTreeRequest(DescribeDsFolderTreeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FirstLevelPull != null) {
            this.FirstLevelPull = new Boolean(source.FirstLevelPull);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IncludeWorkflow != null) {
            this.IncludeWorkflow = new Boolean(source.IncludeWorkflow);
        }
        if (source.IncludeTask != null) {
            this.IncludeTask = new Boolean(source.IncludeTask);
        }
        if (source.IncludeVirtualTask != null) {
            this.IncludeVirtualTask = new Boolean(source.IncludeVirtualTask);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new String(source.DisplayType);
        }
        if (source.IncludeTaskFolder != null) {
            this.IncludeTaskFolder = new Boolean(source.IncludeTaskFolder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FirstLevelPull", this.FirstLevelPull);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "IncludeWorkflow", this.IncludeWorkflow);
        this.setParamSimple(map, prefix + "IncludeTask", this.IncludeTask);
        this.setParamSimple(map, prefix + "IncludeVirtualTask", this.IncludeVirtualTask);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamSimple(map, prefix + "IncludeTaskFolder", this.IncludeTaskFolder);

    }
}

