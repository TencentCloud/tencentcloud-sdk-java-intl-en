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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFolderRequest extends AbstractModel {

    /**
    * <p>Workspace name</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Folder name.</p>
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>FOLDER type</p><p>Enumeration values:</p><ul><li>FOLDER: FOLDER</li><li>GIT_FOLDER: GIT FOLDER</li></ul>
    */
    @SerializedName("FolderType")
    @Expose
    private String FolderType;

    /**
    * <p>Parent node</p>
    */
    @SerializedName("ParentFolder")
    @Expose
    private FolderLocator ParentFolder;

    /**
    * <p>git configuration. Required when FolderType is git_FOLDER.</p>
    */
    @SerializedName("GitConfig")
    @Expose
    private GitRepoConfig GitConfig;

    /**
     * Get <p>Workspace name</p> 
     * @return WorkspaceId <p>Workspace name</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace name</p>
     * @param WorkspaceId <p>Workspace name</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Folder name.</p> 
     * @return FolderName <p>Folder name.</p>
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>Folder name.</p>
     * @param FolderName <p>Folder name.</p>
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>FOLDER type</p><p>Enumeration values:</p><ul><li>FOLDER: FOLDER</li><li>GIT_FOLDER: GIT FOLDER</li></ul> 
     * @return FolderType <p>FOLDER type</p><p>Enumeration values:</p><ul><li>FOLDER: FOLDER</li><li>GIT_FOLDER: GIT FOLDER</li></ul>
     */
    public String getFolderType() {
        return this.FolderType;
    }

    /**
     * Set <p>FOLDER type</p><p>Enumeration values:</p><ul><li>FOLDER: FOLDER</li><li>GIT_FOLDER: GIT FOLDER</li></ul>
     * @param FolderType <p>FOLDER type</p><p>Enumeration values:</p><ul><li>FOLDER: FOLDER</li><li>GIT_FOLDER: GIT FOLDER</li></ul>
     */
    public void setFolderType(String FolderType) {
        this.FolderType = FolderType;
    }

    /**
     * Get <p>Parent node</p> 
     * @return ParentFolder <p>Parent node</p>
     */
    public FolderLocator getParentFolder() {
        return this.ParentFolder;
    }

    /**
     * Set <p>Parent node</p>
     * @param ParentFolder <p>Parent node</p>
     */
    public void setParentFolder(FolderLocator ParentFolder) {
        this.ParentFolder = ParentFolder;
    }

    /**
     * Get <p>git configuration. Required when FolderType is git_FOLDER.</p> 
     * @return GitConfig <p>git configuration. Required when FolderType is git_FOLDER.</p>
     */
    public GitRepoConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set <p>git configuration. Required when FolderType is git_FOLDER.</p>
     * @param GitConfig <p>git configuration. Required when FolderType is git_FOLDER.</p>
     */
    public void setGitConfig(GitRepoConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    public CreateFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFolderRequest(CreateFolderRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderType != null) {
            this.FolderType = new String(source.FolderType);
        }
        if (source.ParentFolder != null) {
            this.ParentFolder = new FolderLocator(source.ParentFolder);
        }
        if (source.GitConfig != null) {
            this.GitConfig = new GitRepoConfig(source.GitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamObj(map, prefix + "ParentFolder.", this.ParentFolder);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);

    }
}

