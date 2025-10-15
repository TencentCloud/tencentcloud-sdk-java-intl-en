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

public class GetOpsWorkflowRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow Id, can be obtained through the ListOpsWorkflows api.
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

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
     * Get Workflow Id, can be obtained through the ListOpsWorkflows api. 
     * @return WorkflowId Workflow Id, can be obtained through the ListOpsWorkflows api.
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set Workflow Id, can be obtained through the ListOpsWorkflows api.
     * @param WorkflowId Workflow Id, can be obtained through the ListOpsWorkflows api.
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    public GetOpsWorkflowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOpsWorkflowRequest(GetOpsWorkflowRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);

    }
}

