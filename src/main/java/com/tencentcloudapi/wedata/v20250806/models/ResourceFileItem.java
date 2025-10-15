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

public class ResourceFileItem extends AbstractModel {

    /**
    * Resource file ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource file name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Specifies the resource file type.
    */
    @SerializedName("FileExtensionType")
    @Expose
    private String FileExtensionType;

    /**
    * Resource path
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
     * Get Resource file ID. 
     * @return ResourceId Resource file ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource file ID.
     * @param ResourceId Resource file ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource file name. 
     * @return ResourceName Resource file name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource file name.
     * @param ResourceName Resource file name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Specifies the resource file type. 
     * @return FileExtensionType Specifies the resource file type.
     */
    public String getFileExtensionType() {
        return this.FileExtensionType;
    }

    /**
     * Set Specifies the resource file type.
     * @param FileExtensionType Specifies the resource file type.
     */
    public void setFileExtensionType(String FileExtensionType) {
        this.FileExtensionType = FileExtensionType;
    }

    /**
     * Get Resource path 
     * @return LocalPath Resource path
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set Resource path
     * @param LocalPath Resource path
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    public ResourceFileItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFileItem(ResourceFileItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.FileExtensionType != null) {
            this.FileExtensionType = new String(source.FileExtensionType);
        }
        if (source.LocalPath != null) {
            this.LocalPath = new String(source.LocalPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "FileExtensionType", this.FileExtensionType);
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);

    }
}

