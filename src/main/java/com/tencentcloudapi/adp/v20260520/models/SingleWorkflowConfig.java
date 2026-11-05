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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleWorkflowConfig extends AbstractModel {

    /**
    * <p>Whether to enable async workflow</p>
    */
    @SerializedName("AsyncWorkflow")
    @Expose
    private Boolean AsyncWorkflow;

    /**
    * <p>Status Release status (UNPUBLISHED: to be released PUBLISHING: publishing PUBLISHED: released PUBLISHED_FAIL: release failure; DRAFT: to be debugged)</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Workflow description</p>
    */
    @SerializedName("WorkflowDescription")
    @Expose
    private String WorkflowDescription;

    /**
    * <p>Workflow Id</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>Workflow name.</p>
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>Whether the workflow is enabled</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>Whether to enable async workflow</p> 
     * @return AsyncWorkflow <p>Whether to enable async workflow</p>
     */
    public Boolean getAsyncWorkflow() {
        return this.AsyncWorkflow;
    }

    /**
     * Set <p>Whether to enable async workflow</p>
     * @param AsyncWorkflow <p>Whether to enable async workflow</p>
     */
    public void setAsyncWorkflow(Boolean AsyncWorkflow) {
        this.AsyncWorkflow = AsyncWorkflow;
    }

    /**
     * Get <p>Status Release status (UNPUBLISHED: to be released PUBLISHING: publishing PUBLISHED: released PUBLISHED_FAIL: release failure; DRAFT: to be debugged)</p> 
     * @return Status <p>Status Release status (UNPUBLISHED: to be released PUBLISHING: publishing PUBLISHED: released PUBLISHED_FAIL: release failure; DRAFT: to be debugged)</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status Release status (UNPUBLISHED: to be released PUBLISHING: publishing PUBLISHED: released PUBLISHED_FAIL: release failure; DRAFT: to be debugged)</p>
     * @param Status <p>Status Release status (UNPUBLISHED: to be released PUBLISHING: publishing PUBLISHED: released PUBLISHED_FAIL: release failure; DRAFT: to be debugged)</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Workflow description</p> 
     * @return WorkflowDescription <p>Workflow description</p>
     */
    public String getWorkflowDescription() {
        return this.WorkflowDescription;
    }

    /**
     * Set <p>Workflow description</p>
     * @param WorkflowDescription <p>Workflow description</p>
     */
    public void setWorkflowDescription(String WorkflowDescription) {
        this.WorkflowDescription = WorkflowDescription;
    }

    /**
     * Get <p>Workflow Id</p> 
     * @return WorkflowId <p>Workflow Id</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>Workflow Id</p>
     * @param WorkflowId <p>Workflow Id</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>Workflow name.</p> 
     * @return WorkflowName <p>Workflow name.</p>
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>Workflow name.</p>
     * @param WorkflowName <p>Workflow name.</p>
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>Whether the workflow is enabled</p> 
     * @return Enabled <p>Whether the workflow is enabled</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether the workflow is enabled</p>
     * @param Enabled <p>Whether the workflow is enabled</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public SingleWorkflowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleWorkflowConfig(SingleWorkflowConfig source) {
        if (source.AsyncWorkflow != null) {
            this.AsyncWorkflow = new Boolean(source.AsyncWorkflow);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.WorkflowDescription != null) {
            this.WorkflowDescription = new String(source.WorkflowDescription);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncWorkflow", this.AsyncWorkflow);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WorkflowDescription", this.WorkflowDescription);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

