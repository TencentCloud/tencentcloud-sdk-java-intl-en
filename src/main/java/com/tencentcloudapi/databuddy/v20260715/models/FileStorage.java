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

public class FileStorage extends AbstractModel {

    /**
    * Storage type
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * Storage path
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * File content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Storage type 
     * @return StorageType Storage type
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type
     * @param StorageType Storage type
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Storage path 
     * @return StoragePath Storage path
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set Storage path
     * @param StoragePath Storage path
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get File content 
     * @return Content File content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set File content
     * @param Content File content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FileStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileStorage(FileStorage source) {
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

