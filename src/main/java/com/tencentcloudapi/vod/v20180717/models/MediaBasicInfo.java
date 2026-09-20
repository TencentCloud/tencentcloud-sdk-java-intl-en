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
    * Media file name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Media file description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Media file creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time of media file (operations such as modifying video properties and initiating video processing will trigger update of media file information) in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Expiry date of the media file in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted. "9999-12-31T23:59:59Z" means it never expires.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Category ID of the media file.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Category name of the media file.
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * Category path of the media file. Categories are separated by "-", for example "New first-level category - New secondary category".
    */
    @SerializedName("ClassPath")
    @Expose
    private String ClassPath;

    /**
    * Thumbnail URL of the media file.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Muxing format of the media file, such as mp4 and flv.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * URL address of the original media file.
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * Source information of the media file.
    */
    @SerializedName("SourceInfo")
    @Expose
    private MediaSourceData SourceInfo;

    /**
    * Storage region of media files, for example, ap-chongqing. See region list.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Media storage path.
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * Tag information of a media file.
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * Unique identifier of the live streaming recording file.
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * File status: Normal: normal, Forbidden: blocked.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Storage class of a media file
<li> STANDARD: standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li> ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
     * Get Media file name. 
     * @return Name Media file name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media file name.
     * @param Name Media file name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Media file description. 
     * @return Description Media file description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Media file description.
     * @param Description Media file description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Media file creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Media file creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Media file creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Media file creation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest update time of media file (operations such as modifying video properties and initiating video processing will trigger update of media file information) in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Latest update time of media file (operations such as modifying video properties and initiating video processing will trigger update of media file information) in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time of media file (operations such as modifying video properties and initiating video processing will trigger update of media file information) in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Latest update time of media file (operations such as modifying video properties and initiating video processing will trigger update of media file information) in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Expiry date of the media file in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted. "9999-12-31T23:59:59Z" means it never expires. 
     * @return ExpireTime Expiry date of the media file in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted. "9999-12-31T23:59:59Z" means it never expires.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiry date of the media file in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted. "9999-12-31T23:59:59Z" means it never expires.
     * @param ExpireTime Expiry date of the media file in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). After expiry, the media file and its related resources (transcoding results, sprites) will be permanently deleted. "9999-12-31T23:59:59Z" means it never expires.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Category ID of the media file. 
     * @return ClassId Category ID of the media file.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID of the media file.
     * @param ClassId Category ID of the media file.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Category name of the media file. 
     * @return ClassName Category name of the media file.
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set Category name of the media file.
     * @param ClassName Category name of the media file.
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get Category path of the media file. Categories are separated by "-", for example "New first-level category - New secondary category". 
     * @return ClassPath Category path of the media file. Categories are separated by "-", for example "New first-level category - New secondary category".
     */
    public String getClassPath() {
        return this.ClassPath;
    }

    /**
     * Set Category path of the media file. Categories are separated by "-", for example "New first-level category - New secondary category".
     * @param ClassPath Category path of the media file. Categories are separated by "-", for example "New first-level category - New secondary category".
     */
    public void setClassPath(String ClassPath) {
        this.ClassPath = ClassPath;
    }

    /**
     * Get Thumbnail URL of the media file. 
     * @return CoverUrl Thumbnail URL of the media file.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Thumbnail URL of the media file.
     * @param CoverUrl Thumbnail URL of the media file.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Muxing format of the media file, such as mp4 and flv. 
     * @return Type Muxing format of the media file, such as mp4 and flv.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Muxing format of the media file, such as mp4 and flv.
     * @param Type Muxing format of the media file, such as mp4 and flv.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get URL address of the original media file. 
     * @return MediaUrl URL address of the original media file.
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set URL address of the original media file.
     * @param MediaUrl URL address of the original media file.
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get Source information of the media file. 
     * @return SourceInfo Source information of the media file.
     */
    public MediaSourceData getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set Source information of the media file.
     * @param SourceInfo Source information of the media file.
     */
    public void setSourceInfo(MediaSourceData SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get Storage region of media files, for example, ap-chongqing. See region list. 
     * @return StorageRegion Storage region of media files, for example, ap-chongqing. See region list.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Storage region of media files, for example, ap-chongqing. See region list.
     * @param StorageRegion Storage region of media files, for example, ap-chongqing. See region list.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Media storage path. 
     * @return StoragePath Media storage path.
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set Media storage path.
     * @param StoragePath Media storage path.
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get Tag information of a media file. 
     * @return TagSet Tag information of a media file.
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag information of a media file.
     * @param TagSet Tag information of a media file.
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Unique identifier of the live streaming recording file. 
     * @return Vid Unique identifier of the live streaming recording file.
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set Unique identifier of the live streaming recording file.
     * @param Vid Unique identifier of the live streaming recording file.
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li> 
     * @return Category File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     * @param Category File type:
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get File status: Normal: normal, Forbidden: blocked. 
     * @return Status File status: Normal: normal, Forbidden: blocked.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set File status: Normal: normal, Forbidden: blocked.
     * @param Status File status: Normal: normal, Forbidden: blocked.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Storage class of a media file
<li> STANDARD: standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li> ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li> 
     * @return StorageClass Storage class of a media file
<li> STANDARD: standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li> ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set Storage class of a media file
<li> STANDARD: standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li> ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
     * @param StorageClass Storage class of a media file
<li> STANDARD: standard storage.</li>
<li> STANDARD_IA: Infrequent storage.</li>
<li> ARCHIVE: Archive storage.</li>
<li> DEEP_ARCHIVE: Deep archive storage.</li>
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

