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

public class ListCodeFolderContentsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Parent folder path, such as /aaa/bbb/ccc. path header must include a slash. pass / for the root directory.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Folder name or code file name.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Queries folder only.
    */
    @SerializedName("OnlyFolderNode")
    @Expose
    private Boolean OnlyFolderNode;

    /**
    * Specifies whether to query only code script created by user themselves.
    */
    @SerializedName("OnlyUserSelfScript")
    @Expose
    private Boolean OnlyUserSelfScript;

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
     * Get Parent folder path, such as /aaa/bbb/ccc. path header must include a slash. pass / for the root directory. 
     * @return ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. path header must include a slash. pass / for the root directory.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, such as /aaa/bbb/ccc. path header must include a slash. pass / for the root directory.
     * @param ParentFolderPath Parent folder path, such as /aaa/bbb/ccc. path header must include a slash. pass / for the root directory.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Folder name or code file name. 
     * @return Keyword Folder name or code file name.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Folder name or code file name.
     * @param Keyword Folder name or code file name.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Queries folder only. 
     * @return OnlyFolderNode Queries folder only.
     */
    public Boolean getOnlyFolderNode() {
        return this.OnlyFolderNode;
    }

    /**
     * Set Queries folder only.
     * @param OnlyFolderNode Queries folder only.
     */
    public void setOnlyFolderNode(Boolean OnlyFolderNode) {
        this.OnlyFolderNode = OnlyFolderNode;
    }

    /**
     * Get Specifies whether to query only code script created by user themselves. 
     * @return OnlyUserSelfScript Specifies whether to query only code script created by user themselves.
     */
    public Boolean getOnlyUserSelfScript() {
        return this.OnlyUserSelfScript;
    }

    /**
     * Set Specifies whether to query only code script created by user themselves.
     * @param OnlyUserSelfScript Specifies whether to query only code script created by user themselves.
     */
    public void setOnlyUserSelfScript(Boolean OnlyUserSelfScript) {
        this.OnlyUserSelfScript = OnlyUserSelfScript;
    }

    public ListCodeFolderContentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCodeFolderContentsRequest(ListCodeFolderContentsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.OnlyFolderNode != null) {
            this.OnlyFolderNode = new Boolean(source.OnlyFolderNode);
        }
        if (source.OnlyUserSelfScript != null) {
            this.OnlyUserSelfScript = new Boolean(source.OnlyUserSelfScript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "OnlyFolderNode", this.OnlyFolderNode);
        this.setParamSimple(map, prefix + "OnlyUserSelfScript", this.OnlyUserSelfScript);

    }
}

