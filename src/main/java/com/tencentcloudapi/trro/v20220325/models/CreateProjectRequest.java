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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * Project name, up to 24 characters.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project description, up to 120 characters, default is empty if not filled.
    */
    @SerializedName("ProjectDescription")
    @Expose
    private String ProjectDescription;

    /**
    * Permission mode, black for blocklist, white for allowlist. defaults to black if not specified.
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
     * Get Project name, up to 24 characters. 
     * @return ProjectName Project name, up to 24 characters.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name, up to 24 characters.
     * @param ProjectName Project name, up to 24 characters.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project description, up to 120 characters, default is empty if not filled. 
     * @return ProjectDescription Project description, up to 120 characters, default is empty if not filled.
     */
    public String getProjectDescription() {
        return this.ProjectDescription;
    }

    /**
     * Set Project description, up to 120 characters, default is empty if not filled.
     * @param ProjectDescription Project description, up to 120 characters, default is empty if not filled.
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    /**
     * Get Permission mode, black for blocklist, white for allowlist. defaults to black if not specified. 
     * @return PolicyMode Permission mode, black for blocklist, white for allowlist. defaults to black if not specified.
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set Permission mode, black for blocklist, white for allowlist. defaults to black if not specified.
     * @param PolicyMode Permission mode, black for blocklist, white for allowlist. defaults to black if not specified.
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDescription != null) {
            this.ProjectDescription = new String(source.ProjectDescription);
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDescription", this.ProjectDescription);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);

    }
}

