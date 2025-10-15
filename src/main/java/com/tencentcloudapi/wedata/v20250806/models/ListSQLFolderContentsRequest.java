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

public class ListSQLFolderContentsRequest extends AbstractModel {

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Parent folder path, /aaa/bbb/ccc. path header must include a slash. pass / to query the root directory.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * Folder name or script name search.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Queries only the folder.
    */
    @SerializedName("OnlyFolderNode")
    @Expose
    private Boolean OnlyFolderNode;

    /**
    * Specifies whether to query only scripts created by the user themselves.
    */
    @SerializedName("OnlyUserSelfScript")
    @Expose
    private Boolean OnlyUserSelfScript;

    /**
    * Access permission: SHARED, PRIVATE.
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

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
     * Get Parent folder path, /aaa/bbb/ccc. path header must include a slash. pass / to query the root directory. 
     * @return ParentFolderPath Parent folder path, /aaa/bbb/ccc. path header must include a slash. pass / to query the root directory.
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set Parent folder path, /aaa/bbb/ccc. path header must include a slash. pass / to query the root directory.
     * @param ParentFolderPath Parent folder path, /aaa/bbb/ccc. path header must include a slash. pass / to query the root directory.
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get Folder name or script name search. 
     * @return Keyword Folder name or script name search.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Folder name or script name search.
     * @param Keyword Folder name or script name search.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Queries only the folder. 
     * @return OnlyFolderNode Queries only the folder.
     */
    public Boolean getOnlyFolderNode() {
        return this.OnlyFolderNode;
    }

    /**
     * Set Queries only the folder.
     * @param OnlyFolderNode Queries only the folder.
     */
    public void setOnlyFolderNode(Boolean OnlyFolderNode) {
        this.OnlyFolderNode = OnlyFolderNode;
    }

    /**
     * Get Specifies whether to query only scripts created by the user themselves. 
     * @return OnlyUserSelfScript Specifies whether to query only scripts created by the user themselves.
     */
    public Boolean getOnlyUserSelfScript() {
        return this.OnlyUserSelfScript;
    }

    /**
     * Set Specifies whether to query only scripts created by the user themselves.
     * @param OnlyUserSelfScript Specifies whether to query only scripts created by the user themselves.
     */
    public void setOnlyUserSelfScript(Boolean OnlyUserSelfScript) {
        this.OnlyUserSelfScript = OnlyUserSelfScript;
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

    public ListSQLFolderContentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSQLFolderContentsRequest(ListSQLFolderContentsRequest source) {
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
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
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
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

