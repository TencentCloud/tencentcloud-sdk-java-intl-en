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

public class ProjectRequest extends AbstractModel {

    /**
    * Project id, english name, starts with a letter, can contain letters, numbers, and underscores, and must not exceed 32 characters.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * The project display name can be a chinese name, starts with a letter, and can contain letters, numbers, and underscores, with a maximum of 32 characters.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Project mode, SIMPLE (default): SIMPLE mode STANDARD: STANDARD mode.
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
     * Get Project id, english name, starts with a letter, can contain letters, numbers, and underscores, and must not exceed 32 characters. 
     * @return ProjectName Project id, english name, starts with a letter, can contain letters, numbers, and underscores, and must not exceed 32 characters.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project id, english name, starts with a letter, can contain letters, numbers, and underscores, and must not exceed 32 characters.
     * @param ProjectName Project id, english name, starts with a letter, can contain letters, numbers, and underscores, and must not exceed 32 characters.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get The project display name can be a chinese name, starts with a letter, and can contain letters, numbers, and underscores, with a maximum of 32 characters. 
     * @return DisplayName The project display name can be a chinese name, starts with a letter, and can contain letters, numbers, and underscores, with a maximum of 32 characters.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set The project display name can be a chinese name, starts with a letter, and can contain letters, numbers, and underscores, with a maximum of 32 characters.
     * @param DisplayName The project display name can be a chinese name, starts with a letter, and can contain letters, numbers, and underscores, with a maximum of 32 characters.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Project mode, SIMPLE (default): SIMPLE mode STANDARD: STANDARD mode. 
     * @return ProjectModel Project mode, SIMPLE (default): SIMPLE mode STANDARD: STANDARD mode.
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set Project mode, SIMPLE (default): SIMPLE mode STANDARD: STANDARD mode.
     * @param ProjectModel Project mode, SIMPLE (default): SIMPLE mode STANDARD: STANDARD mode.
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    public ProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectRequest(ProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);

    }
}

