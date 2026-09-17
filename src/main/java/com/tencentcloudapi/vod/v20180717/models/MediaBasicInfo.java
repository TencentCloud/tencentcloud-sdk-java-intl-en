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

public class MediaBasicInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * 
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * 
    */
    @SerializedName("SourceInfo")
    @Expose
    private MediaSourceData SourceInfo;

    /**
    * 
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * 
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * 
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * 
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Description 
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ClassName 
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 
     * @param ClassName 
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get  
     * @return ClassPath 
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set 
     * @param ClassPath 
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get  
     * @return CoverUrl 
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set 
     * @param CoverUrl 
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return MediaUrl 
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set 
     * @param MediaUrl 
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get  
     * @return SourceInfo 
     */
    public MediaSourceData getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 
     * @param SourceInfo 
     */
    public void setSourceInfo(MediaSourceData SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get  
     * @return StorageRegion 
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 
     * @param StorageRegion 
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get  
     * @return StoragePath 
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set 
     * @param StoragePath 
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get  
     * @return TagSet 
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 
     * @param TagSet 
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get  
     * @return Vid 
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set 
     * @param Vid 
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
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
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public MediaBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaBasicInfo(MediaBasicInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassPath != null) {
            this.ClassPath = new String(source.ClassPath);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MediaUrl != null) {
            this.MediaUrl = new String(source.MediaUrl);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new MediaSourceData(source.SourceInfo);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StorageClass != null) {
            this.StorageClass = new String(source.StorageClass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassPath", this.ClassPath);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StorageClass", this.StorageClass);

    }
}

