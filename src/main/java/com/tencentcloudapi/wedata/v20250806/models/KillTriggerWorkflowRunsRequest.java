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

public class KillTriggerWorkflowRunsRequest extends AbstractModel {

    /**
    * Project ID.	
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Specifies the workflow execution ID to be stopped.
    */
    @SerializedName("WorkflowExecutionIdList")
    @Expose
    private String [] WorkflowExecutionIdList;

    /**
    * When specifying an empty workflow run, whether all terminate running workflow execution.	
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * Whether to stop only waiting workflow runs when specifying empty workflow runs.
    */
    @SerializedName("Pending")
    @Expose
    private Boolean Pending;

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
     * Get Workflow ID. 
     * @return WorkflowId Workflow ID.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow ID.
     * @param WorkflowId Workflow ID.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get Specifies the workflow execution ID to be stopped. 
     * @return WorkflowExecutionIdList Specifies the workflow execution ID to be stopped.
     */
    public String [] getWorkflowExecutionIdList() {
        return this.WorkflowExecutionIdList;
    }

    /**
     * Set Specifies the workflow execution ID to be stopped.
     * @param WorkflowExecutionIdList Specifies the workflow execution ID to be stopped.
     */
    public void setWorkflowExecutionIdList(String [] WorkflowExecutionIdList) {
        this.WorkflowExecutionIdList = WorkflowExecutionIdList;
    }

    /**
     * Get When specifying an empty workflow run, whether all terminate running workflow execution.	 
     * @return All When specifying an empty workflow run, whether all terminate running workflow execution.	
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set When specifying an empty workflow run, whether all terminate running workflow execution.	
     * @param All When specifying an empty workflow run, whether all terminate running workflow execution.	
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get Whether to stop only waiting workflow runs when specifying empty workflow runs. 
     * @return Pending Whether to stop only waiting workflow runs when specifying empty workflow runs.
     */
    public Boolean getPending() {
        return this.Pending;
    }

    /**
     * Set Whether to stop only waiting workflow runs when specifying empty workflow runs.
     * @param Pending Whether to stop only waiting workflow runs when specifying empty workflow runs.
     */
    public void setPending(Boolean Pending) {
        this.Pending = Pending;
    }

    public KillTriggerWorkflowRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillTriggerWorkflowRunsRequest(KillTriggerWorkflowRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionIdList != null) {
            this.WorkflowExecutionIdList = new String[source.WorkflowExecutionIdList.length];
            for (int i = 0; i < source.WorkflowExecutionIdList.length; i++) {
                this.WorkflowExecutionIdList[i] = new String(source.WorkflowExecutionIdList[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Pending != null) {
            this.Pending = new Boolean(source.Pending);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "WorkflowExecutionIdList.", this.WorkflowExecutionIdList);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "Pending", this.Pending);

    }
}

