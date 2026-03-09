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

public class GetMyWorkflowMaxPermissionRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Authorization entity ID.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * Authorize entity type, folder/workflow.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

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
     * Get Authorization entity ID. 
     * @return EntityId Authorization entity ID.
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set Authorization entity ID.
     * @param EntityId Authorization entity ID.
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get Authorize entity type, folder/workflow. 
     * @return EntityType Authorize entity type, folder/workflow.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Authorize entity type, folder/workflow.
     * @param EntityType Authorize entity type, folder/workflow.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    public GetMyWorkflowMaxPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMyWorkflowMaxPermissionRequest(GetMyWorkflowMaxPermissionRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);

    }
}

