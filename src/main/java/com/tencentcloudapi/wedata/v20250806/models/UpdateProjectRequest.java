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

public class UpdateProjectRequest extends AbstractModel {

    /**
    * Modify the project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project display name can be a chinese name and must be unique within the tenant scope.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Remarks
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Project leader id.
    */
    @SerializedName("ProjectOwnerUin")
    @Expose
    private String ProjectOwnerUin;

    /**
     * Get Modify the project ID. 
     * @return ProjectId Modify the project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Modify the project ID.
     * @param ProjectId Modify the project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project display name can be a chinese name and must be unique within the tenant scope. 
     * @return DisplayName Project display name can be a chinese name and must be unique within the tenant scope.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Project display name can be a chinese name and must be unique within the tenant scope.
     * @param DisplayName Project display name can be a chinese name and must be unique within the tenant scope.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Remarks 
     * @return Description Remarks
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
     * @param Description Remarks
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Project leader id. 
     * @return ProjectOwnerUin Project leader id.
     */
    public String getProjectOwnerUin() {
        return this.ProjectOwnerUin;
    }

    /**
     * Set Project leader id.
     * @param ProjectOwnerUin Project leader id.
     */
    public void setProjectOwnerUin(String ProjectOwnerUin) {
        this.ProjectOwnerUin = ProjectOwnerUin;
    }

    public UpdateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateProjectRequest(UpdateProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectOwnerUin != null) {
            this.ProjectOwnerUin = new String(source.ProjectOwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectOwnerUin", this.ProjectOwnerUin);

    }
}

