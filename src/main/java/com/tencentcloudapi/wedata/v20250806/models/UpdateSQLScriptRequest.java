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

public class UpdateSQLScriptRequest extends AbstractModel {

    /**
    * Script Id.
    */
    @SerializedName("ScriptId")
    @Expose
    private String ScriptId;

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies the script configuration for data exploration.
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * Specifies the script content, needs to be Base64 encoded.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
     * Get Script Id. 
     * @return ScriptId Script Id.
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script Id.
     * @param ScriptId Script Id.
     */
    public void setScriptId(String ScriptId) {
        this.ScriptId = ScriptId;
    }

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
     * Get Specifies the script configuration for data exploration. 
     * @return ScriptConfig Specifies the script configuration for data exploration.
     */
    public SQLScriptConfig getScriptConfig() {
        return this.ScriptConfig;
    }

    /**
     * Set Specifies the script configuration for data exploration.
     * @param ScriptConfig Specifies the script configuration for data exploration.
     */
    public void setScriptConfig(SQLScriptConfig ScriptConfig) {
        this.ScriptConfig = ScriptConfig;
    }

    /**
     * Get Specifies the script content, needs to be Base64 encoded. 
     * @return ScriptContent Specifies the script content, needs to be Base64 encoded.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Specifies the script content, needs to be Base64 encoded.
     * @param ScriptContent Specifies the script content, needs to be Base64 encoded.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    public UpdateSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSQLScriptRequest(UpdateSQLScriptRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);

    }
}

