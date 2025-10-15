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

public class RunSQLScriptRequest extends AbstractModel {

    /**
    * Script id.
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
    * Script content. executed by default if not transmitted. requires Base64 encoding if transmitted.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Advanced running parameter, JSON format base64 encode.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get Script id. 
     * @return ScriptId Script id.
     */
    public String getScriptId() {
        return this.ScriptId;
    }

    /**
     * Set Script id.
     * @param ScriptId Script id.
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
     * Get Script content. executed by default if not transmitted. requires Base64 encoding if transmitted. 
     * @return ScriptContent Script content. executed by default if not transmitted. requires Base64 encoding if transmitted.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Script content. executed by default if not transmitted. requires Base64 encoding if transmitted.
     * @param ScriptContent Script content. executed by default if not transmitted. requires Base64 encoding if transmitted.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Advanced running parameter, JSON format base64 encode. 
     * @return Params Advanced running parameter, JSON format base64 encode.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Advanced running parameter, JSON format base64 encode.
     * @param Params Advanced running parameter, JSON format base64 encode.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public RunSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunSQLScriptRequest(RunSQLScriptRequest source) {
        if (source.ScriptId != null) {
            this.ScriptId = new String(source.ScriptId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptId", this.ScriptId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

