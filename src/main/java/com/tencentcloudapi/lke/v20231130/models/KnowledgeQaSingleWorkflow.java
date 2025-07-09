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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeQaSingleWorkflow extends AbstractModel {

    /**
    * Workflow ID.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * Workflow name.
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * Workflow description.
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * Workflow status, publishing status (UNPUBLISHED; PUBLISHING; PUBLISHED; FAIL).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether to enable workflow.
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * Whether to enable asynchronous call of the workflow.
    */
    @SerializedName("AsyncWorkflow")
    @Expose
    private Boolean AsyncWorkflow;

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
     * Get Workflow name. 
     * @return WorkflowName Workflow name.
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set Workflow name.
     * @param WorkflowName Workflow name.
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get Workflow description. 
     * @return WorkflowDesc Workflow description.
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set Workflow description.
     * @param WorkflowDesc Workflow description.
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get Workflow status, publishing status (UNPUBLISHED; PUBLISHING; PUBLISHED; FAIL). 
     * @return Status Workflow status, publishing status (UNPUBLISHED; PUBLISHING; PUBLISHED; FAIL).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Workflow status, publishing status (UNPUBLISHED; PUBLISHING; PUBLISHED; FAIL).
     * @param Status Workflow status, publishing status (UNPUBLISHED; PUBLISHING; PUBLISHED; FAIL).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to enable workflow. 
     * @return IsEnable Whether to enable workflow.
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Whether to enable workflow.
     * @param IsEnable Whether to enable workflow.
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get Whether to enable asynchronous call of the workflow. 
     * @return AsyncWorkflow Whether to enable asynchronous call of the workflow.
     */
    public Boolean getAsyncWorkflow() {
        return this.AsyncWorkflow;
    }

    /**
     * Set Whether to enable asynchronous call of the workflow.
     * @param AsyncWorkflow Whether to enable asynchronous call of the workflow.
     */
    public void setAsyncWorkflow(Boolean AsyncWorkflow) {
        this.AsyncWorkflow = AsyncWorkflow;
    }

    public KnowledgeQaSingleWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaSingleWorkflow(KnowledgeQaSingleWorkflow source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.AsyncWorkflow != null) {
            this.AsyncWorkflow = new Boolean(source.AsyncWorkflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "AsyncWorkflow", this.AsyncWorkflow);

    }
}

