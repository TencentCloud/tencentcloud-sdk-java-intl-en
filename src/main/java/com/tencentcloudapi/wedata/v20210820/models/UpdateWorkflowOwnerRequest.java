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

public class UpdateWorkflowOwnerRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Workflow IDs
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * Person in charge, separated by ';'
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Person in Charge UserId, separated by ';'
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

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
     * Get Workflow IDs 
     * @return WorkflowIds Workflow IDs
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set Workflow IDs
     * @param WorkflowIds Workflow IDs
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get Person in charge, separated by ';' 
     * @return Owner Person in charge, separated by ';'
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Person in charge, separated by ';'
     * @param Owner Person in charge, separated by ';'
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Person in Charge UserId, separated by ';' 
     * @return OwnerId Person in Charge UserId, separated by ';'
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Person in Charge UserId, separated by ';'
     * @param OwnerId Person in Charge UserId, separated by ';'
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public UpdateWorkflowOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowOwnerRequest(UpdateWorkflowOwnerRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

