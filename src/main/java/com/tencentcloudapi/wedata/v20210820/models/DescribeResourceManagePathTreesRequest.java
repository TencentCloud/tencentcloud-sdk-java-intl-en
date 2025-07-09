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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceManagePathTreesRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Name, for search
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * File Type
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Folder Type
personal individual
project Item
resource
    */
    @SerializedName("DirType")
    @Expose
    private String DirType;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Name, for search 
     * @return Name Name, for search
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name, for search
     * @param Name Name, for search
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get File Type 
     * @return FileType File Type
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File Type
     * @param FileType File Type
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Folder Type
personal individual
project Item
resource 
     * @return DirType Folder Type
personal individual
project Item
resource
     */
    public String getDirType() {
        return this.DirType;
    }

    /**
     * Set Folder Type
personal individual
project Item
resource
     * @param DirType Folder Type
personal individual
project Item
resource
     */
    public void setDirType(String DirType) {
        this.DirType = DirType;
    }

    public DescribeResourceManagePathTreesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceManagePathTreesRequest(DescribeResourceManagePathTreesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.DirType != null) {
            this.DirType = new String(source.DirType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "DirType", this.DirType);

    }
}

