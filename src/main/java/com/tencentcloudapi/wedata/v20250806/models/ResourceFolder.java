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

public class ResourceFolder extends AbstractModel {

    /**
    * Resource folder ID.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Creator ID.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Creator's name.
    */
    @SerializedName("CreateUserName")
    @Expose
    private String CreateUserName;

    /**
    * Specifies the folder path.
    */
    @SerializedName("FolderPath")
    @Expose
    private String FolderPath;

    /**
    * Folder name.
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
     * Get Resource folder ID. 
     * @return FolderId Resource folder ID.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Resource folder ID.
     * @param FolderId Resource folder ID.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
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

    /**
     * Get Creator's name. 
     * @return CreateUserName Creator's name.
     */
    public String getCreateUserName() {
        return this.CreateUserName;
    }

    /**
     * Set Creator's name.
     * @param CreateUserName Creator's name.
     */
    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    /**
     * Get Specifies the folder path. 
     * @return FolderPath Specifies the folder path.
     */
    public String getFolderPath() {
        return this.FolderPath;
    }

    /**
     * Set Specifies the folder path.
     * @param FolderPath Specifies the folder path.
     */
    public void setFolderPath(String FolderPath) {
        this.FolderPath = FolderPath;
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

    public ResourceFolder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFolder(ResourceFolder source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateUserName != null) {
            this.CreateUserName = new String(source.CreateUserName);
        }
        if (source.FolderPath != null) {
            this.FolderPath = new String(source.FolderPath);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateUserName", this.CreateUserName);
        this.setParamSimple(map, prefix + "FolderPath", this.FolderPath);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);

    }
}

