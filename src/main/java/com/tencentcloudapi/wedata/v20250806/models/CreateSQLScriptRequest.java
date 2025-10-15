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

public class CreateSQLScriptRequest extends AbstractModel {

    /**
    * Script name.
    */
    @SerializedName("ScriptName")
    @Expose
    private String ScriptName;

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Parent folder path, /aaa/bbb/ccc. root directory is empty string or /.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Specifies the script configuration for data exploration.
    */
    @SerializedName("ScriptConfig")
    @Expose
    private SQLScriptConfig ScriptConfig;

    /**
    * Specifies the script content, if any, needs to be base64 encoded.
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * Access permission: SHARED, PRIVATE.
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
     * Get Script name. 
     * @return ScriptName Script name.
     */
    public String getScriptName() {
        return this.ScriptName;
    }

    /**
     * Set Script name.
     * @param ScriptName Script name.
     */
    public void setScriptName(String ScriptName) {
        this.ScriptName = ScriptName;
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
     * Get Parent folder path, /aaa/bbb/ccc. root directory is empty string or /. 
     * @return ParentFolderPath Parent folder path, /aaa/bbb/ccc. root directory is empty string or /.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, /aaa/bbb/ccc. root directory is empty string or /.
     * @param ParentFolderPath Parent folder path, /aaa/bbb/ccc. root directory is empty string or /.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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
     * Get Specifies the script content, if any, needs to be base64 encoded. 
     * @return ScriptContent Specifies the script content, if any, needs to be base64 encoded.
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set Specifies the script content, if any, needs to be base64 encoded.
     * @param ScriptContent Specifies the script content, if any, needs to be base64 encoded.
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get Access permission: SHARED, PRIVATE. 
     * @return AccessScope Access permission: SHARED, PRIVATE.
     */
    public String getAccessScope() {
        return this.AccessScope;
    }

    /**
     * Set Access permission: SHARED, PRIVATE.
     * @param AccessScope Access permission: SHARED, PRIVATE.
     */
    public void setAccessScope(String AccessScope) {
        this.AccessScope = AccessScope;
    }

    public CreateSQLScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSQLScriptRequest(CreateSQLScriptRequest source) {
        if (source.ScriptName != null) {
            this.ScriptName = new String(source.ScriptName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.ScriptConfig != null) {
            this.ScriptConfig = new SQLScriptConfig(source.ScriptConfig);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScriptName", this.ScriptName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "ScriptConfig.", this.ScriptConfig);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

