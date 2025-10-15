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

public class UpdateWorkflowFolderRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder ID. obtain through the ListWorkflowFolders API.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Specifies the folder name after update.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

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
     * Get Folder ID. obtain through the ListWorkflowFolders API. 
     * @return FolderId Folder ID. obtain through the ListWorkflowFolders API.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID. obtain through the ListWorkflowFolders API.
     * @param FolderId Folder ID. obtain through the ListWorkflowFolders API.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Specifies the folder name after update. 
     * @return FolderName Specifies the folder name after update.
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set Specifies the folder name after update.
     * @param FolderName Specifies the folder name after update.
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public UpdateWorkflowFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowFolderRequest(UpdateWorkflowFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);

    }
}

