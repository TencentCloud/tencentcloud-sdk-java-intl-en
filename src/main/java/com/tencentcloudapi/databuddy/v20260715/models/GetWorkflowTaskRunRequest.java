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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWorkflowTaskRunRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Task running ID, which can be obtained through ListWorkflowTaskRuns. Required</p>
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * <p>Built-in workflow task run list options (for FOR_EACH task use only). Optional</p>
    */
    @SerializedName("InnerWorkflowTaskRunListOption")
    @Expose
    private InnerWorkflowTaskRunListOption InnerWorkflowTaskRunListOption;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Task running ID, which can be obtained through ListWorkflowTaskRuns. Required</p> 
     * @return WorkflowTaskRunId <p>Task running ID, which can be obtained through ListWorkflowTaskRuns. Required</p>
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>Task running ID, which can be obtained through ListWorkflowTaskRuns. Required</p>
     * @param WorkflowTaskRunId <p>Task running ID, which can be obtained through ListWorkflowTaskRuns. Required</p>
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get <p>Built-in workflow task run list options (for FOR_EACH task use only). Optional</p> 
     * @return InnerWorkflowTaskRunListOption <p>Built-in workflow task run list options (for FOR_EACH task use only). Optional</p>
     */
    public InnerWorkflowTaskRunListOption getInnerWorkflowTaskRunListOption() {
        return this.InnerWorkflowTaskRunListOption;
    }

    /**
     * Set <p>Built-in workflow task run list options (for FOR_EACH task use only). Optional</p>
     * @param InnerWorkflowTaskRunListOption <p>Built-in workflow task run list options (for FOR_EACH task use only). Optional</p>
     */
    public void setInnerWorkflowTaskRunListOption(InnerWorkflowTaskRunListOption InnerWorkflowTaskRunListOption) {
        this.InnerWorkflowTaskRunListOption = InnerWorkflowTaskRunListOption;
    }

    public GetWorkflowTaskRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWorkflowTaskRunRequest(GetWorkflowTaskRunRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
        }
        if (source.InnerWorkflowTaskRunListOption != null) {
            this.InnerWorkflowTaskRunListOption = new InnerWorkflowTaskRunListOption(source.InnerWorkflowTaskRunListOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamObj(map, prefix + "InnerWorkflowTaskRunListOption.", this.InnerWorkflowTaskRunListOption);

    }
}

