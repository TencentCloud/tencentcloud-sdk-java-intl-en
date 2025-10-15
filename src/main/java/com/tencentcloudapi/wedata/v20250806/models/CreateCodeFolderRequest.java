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

public class CreateCodeFolderRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Folder name.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * Parent folder path, such as /aaa/bbb/ccc. the path must start with a slash. use / for the root directory.
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

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

    public CreateCodeFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodeFolderRequest(CreateCodeFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);

    }
}

