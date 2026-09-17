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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileContent extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 
    */
    @SerializedName("LastModified")
    @Expose
    private String LastModified;

    /**
    * 
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * 
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("SubtitleID")
    @Expose
    private String SubtitleID;

    /**
     * Get  
     * @return Key 
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 
     * @param Key 
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get  
     * @return LastModified 
     */
    public String getLastModified() {
        return this.LastModified;
    }

    /**
     * Set 
     * @param LastModified 
     */
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get  
     * @return ETag 
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set 
     * @param ETag 
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get  
     * @return Size 
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 
     * @param Size 
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get  
     * @return StorageClass 
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set 
     * @param StorageClass 
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return Category 
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 
     * @param Category 
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get  
     * @return FileType 
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 
     * @param FileType 
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return SubtitleID 
     */
    public String getSubtitleID() {
        return this.SubtitleID;
    }

    /**
     * Set 
     * @param SubtitleID 
     */
    public void setSubtitleID(String SubtitleID) {
        this.SubtitleID = SubtitleID;
    }

    public FileContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileContent(FileContent source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.LastModified != null) {
            this.LastModified = new String(source.LastModified);
        }
        if (source.ETag != null) {
            this.ETag = new String(source.ETag);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubtitleID != null) {
            this.SubtitleID = new String(source.SubtitleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);
        this.setParamSimple(map, prefix + "ETag", this.ETag);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubtitleID", this.SubtitleID);

    }
}

