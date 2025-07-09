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

public class SubmitTaskTestRunRequest extends AbstractModel {

    /**
    * taskId list
    */
    @SerializedName("TaskIds")
    @Expose
    private String TaskIds;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID
    */
    @SerializedName("WorkFlowId")
    @Expose
    private String WorkFlowId;

    /**
    * Workflow name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Workflow Task List
    */
    @SerializedName("Tasks")
    @Expose
    private StageCloudApiRequest [] Tasks;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Runtime Parameters, JSON format of map
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * Script Content
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Version number
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get taskId list 
     * @return TaskIds taskId list
     */
    public String getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set taskId list
     * @param TaskIds taskId list
     */
    public void setTaskIds(String TaskIds) {
        this.TaskIds = TaskIds;
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
     * Get Workflow ID 
     * @return WorkFlowId Workflow ID
     */
    public String getWorkFlowId() {
        return this.WorkFlowId;
    }

    /**
     * Set Workflow ID
     * @param WorkFlowId Workflow ID
     */
    public void setWorkFlowId(String WorkFlowId) {
        this.WorkFlowId = WorkFlowId;
    }

    /**
     * Get Workflow name 
     * @return Name Workflow name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Workflow name
     * @param Name Workflow name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Workflow Task List 
     * @return Tasks Workflow Task List
     */
    public StageCloudApiRequest [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Workflow Task List
     * @param Tasks Workflow Task List
     */
    public void setTasks(StageCloudApiRequest [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Runtime Parameters, JSON format of map 
     * @return RunParams Runtime Parameters, JSON format of map
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set Runtime Parameters, JSON format of map
     * @param RunParams Runtime Parameters, JSON format of map
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get Script Content 
     * @return ScriptContent Script Content
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script Content
     * @param ScriptContent Script Content
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Version number 
     * @return VersionId Version number
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Version number
     * @param VersionId Version number
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public SubmitTaskTestRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTaskTestRunRequest(SubmitTaskTestRunRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String(source.TaskIds);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkFlowId != null) {
            this.WorkFlowId = new String(source.WorkFlowId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tasks != null) {
            this.Tasks = new StageCloudApiRequest[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new StageCloudApiRequest(source.Tasks[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskIds", this.TaskIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkFlowId", this.WorkFlowId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

