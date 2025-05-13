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

public class RenewWorkflowOwnerDsRequest extends AbstractModel {

    /**
    * Workflow ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Responsible Person
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * Responsible Person ID
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * Workflow ID List
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
     * Get Workflow ID 
     * @return ProjectId Workflow ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Workflow ID
     * @param ProjectId Workflow ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Responsible Person 
     * @return Owner Responsible Person
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set Responsible Person
     * @param Owner Responsible Person
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get Responsible Person ID 
     * @return OwnerId Responsible Person ID
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set Responsible Person ID
     * @param OwnerId Responsible Person ID
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
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

    public RenewWorkflowOwnerDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewWorkflowOwnerDsRequest(RenewWorkflowOwnerDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);

    }
}

