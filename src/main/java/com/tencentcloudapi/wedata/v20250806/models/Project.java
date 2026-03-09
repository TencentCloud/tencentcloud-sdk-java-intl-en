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

public class Project extends AbstractModel {

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project id, english name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project display name, can be chinese name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Project creator id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * Project responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectOwnerUin")
    @Expose
    private String ProjectOwnerUin;

    /**
    * Project status: 0: disabled, 1: enabled, -3: disabled, 2: enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Project mode, SIMPLE: SIMPLE mode STANDARD: STANDARD mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project id, english name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project id, english name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project id, english name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project id, english name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project display name, can be chinese name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Project display name, can be chinese name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Project display name, can be chinese name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Project display name, can be chinese name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Project creator id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatorUin Project creator id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Project creator id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatorUin Project creator id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Project responsible person id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectOwnerUin Project responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectOwnerUin() {
        return this.ProjectOwnerUin;
    }

    /**
     * Set Project responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectOwnerUin Project responsible person id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectOwnerUin(String ProjectOwnerUin) {
        this.ProjectOwnerUin = ProjectOwnerUin;
    }

    /**
     * Get Project status: 0: disabled, 1: enabled, -3: disabled, 2: enabled. 
     * @return Status Project status: 0: disabled, 1: enabled, -3: disabled, 2: enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Project status: 0: disabled, 1: enabled, -3: disabled, 2: enabled.
     * @param Status Project status: 0: disabled, 1: enabled, -3: disabled, 2: enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Project mode, SIMPLE: SIMPLE mode STANDARD: STANDARD mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectModel Project mode, SIMPLE: SIMPLE mode STANDARD: STANDARD mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set Project mode, SIMPLE: SIMPLE mode STANDARD: STANDARD mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectModel Project mode, SIMPLE: SIMPLE mode STANDARD: STANDARD mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.ProjectOwnerUin != null) {
            this.ProjectOwnerUin = new String(source.ProjectOwnerUin);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "ProjectOwnerUin", this.ProjectOwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);

    }
}

