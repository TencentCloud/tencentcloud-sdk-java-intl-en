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

public class CreateWorkflowPermissionsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Authorize entity ID.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * Authorized entity type, folder/workflow.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * Authorization information array.
    */
    @SerializedName("PermissionList")
    @Expose
    private WorkflowPermission [] PermissionList;

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
     * Get Authorize entity ID. 
     * @return EntityId Authorize entity ID.
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set Authorize entity ID.
     * @param EntityId Authorize entity ID.
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get Authorized entity type, folder/workflow. 
     * @return EntityType Authorized entity type, folder/workflow.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Authorized entity type, folder/workflow.
     * @param EntityType Authorized entity type, folder/workflow.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get Authorization information array. 
     * @return PermissionList Authorization information array.
     */
    public WorkflowPermission [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set Authorization information array.
     * @param PermissionList Authorization information array.
     */
    public void setPermissionList(WorkflowPermission [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    public CreateWorkflowPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowPermissionsRequest(CreateWorkflowPermissionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new WorkflowPermission[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new WorkflowPermission(source.PermissionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamArrayObj(map, prefix + "PermissionList.", this.PermissionList);

    }
}

