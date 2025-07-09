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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel {

    /**
    * Project id of the target project to modify.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Modified project name, leave blank if not modifying.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Modified project description, leave blank if not modifying.
    */
    @SerializedName("ProjectDescription")
    @Expose
    private String ProjectDescription;

    /**
    * The modified permission mode, black for blocklist, white for allowlist. if not specified, no modification will be made.
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
     * Get Project id of the target project to modify. 
     * @return ProjectId Project id of the target project to modify.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id of the target project to modify.
     * @param ProjectId Project id of the target project to modify.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Modified project name, leave blank if not modifying. 
     * @return ProjectName Modified project name, leave blank if not modifying.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Modified project name, leave blank if not modifying.
     * @param ProjectName Modified project name, leave blank if not modifying.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Modified project description, leave blank if not modifying. 
     * @return ProjectDescription Modified project description, leave blank if not modifying.
     */
    public String getProjectDescription() {
        return this.ProjectDescription;
    }

    /**
     * Set Modified project description, leave blank if not modifying.
     * @param ProjectDescription Modified project description, leave blank if not modifying.
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    /**
     * Get The modified permission mode, black for blocklist, white for allowlist. if not specified, no modification will be made. 
     * @return PolicyMode The modified permission mode, black for blocklist, white for allowlist. if not specified, no modification will be made.
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set The modified permission mode, black for blocklist, white for allowlist. if not specified, no modification will be made.
     * @param PolicyMode The modified permission mode, black for blocklist, white for allowlist. if not specified, no modification will be made.
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDescription", this.ProjectDescription);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);

    }
}

