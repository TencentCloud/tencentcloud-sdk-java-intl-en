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

public class GetCodeFileRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Code file ID. the parameter value comes from the CreateCodeFile API response.
    */
    @SerializedName("CodeFileId")
    @Expose
    private String CodeFileId;

    /**
    * true: return file content and configuration. false: only return configuration message. default false.
    */
    @SerializedName("IncludeContent")
    @Expose
    private Boolean IncludeContent;

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
     * Get Code file ID. the parameter value comes from the CreateCodeFile API response. 
     * @return CodeFileId Code file ID. the parameter value comes from the CreateCodeFile API response.
     */
    public String getCodeFileId() {
        return this.CodeFileId;
    }

    /**
     * Set Code file ID. the parameter value comes from the CreateCodeFile API response.
     * @param CodeFileId Code file ID. the parameter value comes from the CreateCodeFile API response.
     */
    public void setCodeFileId(String CodeFileId) {
        this.CodeFileId = CodeFileId;
    }

    /**
     * Get true: return file content and configuration. false: only return configuration message. default false. 
     * @return IncludeContent true: return file content and configuration. false: only return configuration message. default false.
     */
    public Boolean getIncludeContent() {
        return this.IncludeContent;
    }

    /**
     * Set true: return file content and configuration. false: only return configuration message. default false.
     * @param IncludeContent true: return file content and configuration. false: only return configuration message. default false.
     */
    public void setIncludeContent(Boolean IncludeContent) {
        this.IncludeContent = IncludeContent;
    }

    public GetCodeFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCodeFileRequest(GetCodeFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeFileId != null) {
            this.CodeFileId = new String(source.CodeFileId);
        }
        if (source.IncludeContent != null) {
            this.IncludeContent = new Boolean(source.IncludeContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeFileId", this.CodeFileId);
        this.setParamSimple(map, prefix + "IncludeContent", this.IncludeContent);

    }
}

