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

public class WorkflowFolder extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder ID.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Specifies the absolute path of the folder.
    */
    @SerializedName("FolderPath")
    @Expose
    private String FolderPath;

    /**
    * Creator ID.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

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
     * Get Folder ID. 
     * @return FolderId Folder ID.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID.
     * @param FolderId Folder ID.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Specifies the absolute path of the folder. 
     * @return FolderPath Specifies the absolute path of the folder.
     */
    public String getFolderPath() {
        return this.FolderPath;
    }

    /**
     * Set Specifies the absolute path of the folder.
     * @param FolderPath Specifies the absolute path of the folder.
     */
    public void setFolderPath(String FolderPath) {
        this.FolderPath = FolderPath;
    }

    /**
     * Get Creator ID. 
     * @return CreateUserUin Creator ID.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator ID.
     * @param CreateUserUin Creator ID.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    public WorkflowFolder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowFolder(WorkflowFolder source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderPath != null) {
            this.FolderPath = new String(source.FolderPath);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderPath", this.FolderPath);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);

    }
}

