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

public class KillWorkflowRunRequest extends AbstractModel {

    /**
    * <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Workflow ID. You can obtain it through ListWorkflows. Required</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>List of workflow running IDs pending termination. You can obtain it through ListWorkflowRuns</p>
    */
    @SerializedName("WorkflowRunIds")
    @Expose
    private String [] WorkflowRunIds;

    /**
    * <p>Whether to terminate all running instances in the workflow that have not entered the final state. Optional. false by default.</p>
    */
    @SerializedName("KillAllRuns")
    @Expose
    private Boolean KillAllRuns;

    /**
    * <p>Whether to terminate only the running that is in the Waiting (Pending) state. Optional. false by default</p>
    */
    @SerializedName("OnlyKillPendingRuns")
    @Expose
    private Boolean OnlyKillPendingRuns;

    /**
     * Get <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p> 
     * @return WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     * @param WorkspaceId <p>Workspace ID, which can be obtained through ListWorkspaces. Required.</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Workflow ID. You can obtain it through ListWorkflows. Required</p> 
     * @return WorkflowId <p>Workflow ID. You can obtain it through ListWorkflows. Required</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow ID. You can obtain it through ListWorkflows. Required</p>
     * @param WorkflowId <p>Workflow ID. You can obtain it through ListWorkflows. Required</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>List of workflow running IDs pending termination. You can obtain it through ListWorkflowRuns</p> 
     * @return WorkflowRunIds <p>List of workflow running IDs pending termination. You can obtain it through ListWorkflowRuns</p>
     */
    public String [] getWorkflowRunIds() {
        return this.WorkflowRunIds;
    }

    /**
     * Set <p>List of workflow running IDs pending termination. You can obtain it through ListWorkflowRuns</p>
     * @param WorkflowRunIds <p>List of workflow running IDs pending termination. You can obtain it through ListWorkflowRuns</p>
     */
    public void setWorkflowRunIds(String [] WorkflowRunIds) {
        this.WorkflowRunIds = WorkflowRunIds;
    }

    /**
     * Get <p>Whether to terminate all running instances in the workflow that have not entered the final state. Optional. false by default.</p> 
     * @return KillAllRuns <p>Whether to terminate all running instances in the workflow that have not entered the final state. Optional. false by default.</p>
     */
    public Boolean getKillAllRuns() {
        return this.KillAllRuns;
    }

    /**
     * Set <p>Whether to terminate all running instances in the workflow that have not entered the final state. Optional. false by default.</p>
     * @param KillAllRuns <p>Whether to terminate all running instances in the workflow that have not entered the final state. Optional. false by default.</p>
     */
    public void setKillAllRuns(Boolean KillAllRuns) {
        this.KillAllRuns = KillAllRuns;
    }

    /**
     * Get <p>Whether to terminate only the running that is in the Waiting (Pending) state. Optional. false by default</p> 
     * @return OnlyKillPendingRuns <p>Whether to terminate only the running that is in the Waiting (Pending) state. Optional. false by default</p>
     */
    public Boolean getOnlyKillPendingRuns() {
        return this.OnlyKillPendingRuns;
    }

    /**
     * Set <p>Whether to terminate only the running that is in the Waiting (Pending) state. Optional. false by default</p>
     * @param OnlyKillPendingRuns <p>Whether to terminate only the running that is in the Waiting (Pending) state. Optional. false by default</p>
     */
    public void setOnlyKillPendingRuns(Boolean OnlyKillPendingRuns) {
        this.OnlyKillPendingRuns = OnlyKillPendingRuns;
    }

    public KillWorkflowRunRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KillWorkflowRunRequest(KillWorkflowRunRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunIds != null) {
            this.WorkflowRunIds = new String[source.WorkflowRunIds.length];
            for (int i = 0; i < source.WorkflowRunIds.length; i++) {
                this.WorkflowRunIds[i] = new String(source.WorkflowRunIds[i]);
            }
        }
        if (source.KillAllRuns != null) {
            this.KillAllRuns = new Boolean(source.KillAllRuns);
        }
        if (source.OnlyKillPendingRuns != null) {
            this.OnlyKillPendingRuns = new Boolean(source.OnlyKillPendingRuns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "WorkflowRunIds.", this.WorkflowRunIds);
        this.setParamSimple(map, prefix + "KillAllRuns", this.KillAllRuns);
        this.setParamSimple(map, prefix + "OnlyKillPendingRuns", this.OnlyKillPendingRuns);

    }
}

