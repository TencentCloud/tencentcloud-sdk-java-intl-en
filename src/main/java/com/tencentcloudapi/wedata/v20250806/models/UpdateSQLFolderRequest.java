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

public class UpdateSQLFolderRequest extends AbstractModel {

    /**
    * Folder ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Folder name.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Access permission: SHARED, PRIVATE.
    */
    @SerializedName("AccessScope")
    @Expose
    private String AccessScope;

    /**
     * Get Folder ID 
     * @return FolderId Folder ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
     * @param FolderId Folder ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Folder name. 
     * @return FolderName Folder name.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Folder name.
     * @param FolderName Folder name.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
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

    public UpdateSQLFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSQLFolderRequest(UpdateSQLFolderRequest source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AccessScope != null) {
            this.AccessScope = new String(source.AccessScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AccessScope", this.AccessScope);

    }
}

