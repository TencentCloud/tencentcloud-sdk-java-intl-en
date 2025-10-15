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

public class CreateCodeFileRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Filename of the code file.
    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Specifies the code file configuration.
    */
    @SerializedName("CodeFileConfig")
    @Expose
    private CodeFileConfig CodeFileConfig;

    /**
    * Specifies the code file content.
    */
    @SerializedName("CodeFileContent")
    @Expose
    private String CodeFileContent;

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
     * Get Filename of the code file. 
     * @return CodeFileName Filename of the code file.
     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set Filename of the code file.
     * @param CodeFileName Filename of the code file.
     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
    }

    /**
     * Get Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory. 
     * @return ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
     * @param ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Specifies the code file configuration. 
     * @return CodeFileConfig Specifies the code file configuration.
     */
    public CodeFileConfig getCodeFileConfig() {
        return this.CodeFileConfig;
    }

    /**
     * Set Specifies the code file configuration.
     * @param CodeFileConfig Specifies the code file configuration.
     */
    public void setCodeFileConfig(CodeFileConfig CodeFileConfig) {
        this.CodeFileConfig = CodeFileConfig;
    }

    /**
     * Get Specifies the code file content. 
     * @return CodeFileContent Specifies the code file content.
     */
    public String getCodeFileContent() {
        return this.CodeFileContent;
    }

    /**
     * Set Specifies the code file content.
     * @param CodeFileContent Specifies the code file content.
     */
    public void setCodeFileContent(String CodeFileContent) {
        this.CodeFileContent = CodeFileContent;
    }

    public CreateCodeFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodeFileRequest(CreateCodeFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.CodeFileConfig != null) {
            this.CodeFileConfig = new CodeFileConfig(source.CodeFileConfig);
        }
        if (source.CodeFileContent != null) {
            this.CodeFileContent = new String(source.CodeFileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "CodeFileConfig.", this.CodeFileConfig);
        this.setParamSimple(map, prefix + "CodeFileContent", this.CodeFileContent);

    }
}

