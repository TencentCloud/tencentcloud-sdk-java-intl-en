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

public class RunTasksByMultiWorkflowRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow ID List
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * Whether to supplement intermediate instances 0. Do not supplement 1. Supplement instance
    */
    @SerializedName("EnableMakeUp")
    @Expose
    private Long EnableMakeUp;

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
     * Get Workflow ID List 
     * @return WorkflowIds Workflow ID List
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set Workflow ID List
     * @param WorkflowIds Workflow ID List
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get Whether to supplement intermediate instances 0. Do not supplement 1. Supplement instance 
     * @return EnableMakeUp Whether to supplement intermediate instances 0. Do not supplement 1. Supplement instance
     */
    public Long getEnableMakeUp() {
        return this.EnableMakeUp;
    }

    /**
     * Set Whether to supplement intermediate instances 0. Do not supplement 1. Supplement instance
     * @param EnableMakeUp Whether to supplement intermediate instances 0. Do not supplement 1. Supplement instance
     */
    public void setEnableMakeUp(Long EnableMakeUp) {
        this.EnableMakeUp = EnableMakeUp;
    }

    public RunTasksByMultiWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunTasksByMultiWorkflowRequest(RunTasksByMultiWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.EnableMakeUp != null) {
            this.EnableMakeUp = new Long(source.EnableMakeUp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "EnableMakeUp", this.EnableMakeUp);

    }
}

