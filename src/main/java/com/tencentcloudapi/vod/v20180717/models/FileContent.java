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
    * Object key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Last modification time in ISO8601 format, such as 2019-05-24T10:56:40Z.
    */
    @SerializedName("LastModified")
    @Expose
    private String LastModified;

    /**
    * The Entity Tag of an object is an information Tag that identifies the object content when the object is created. It can be used to check whether the object content has changed.
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * Object size in bytes.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * For enumeration values, please refer to the storage type document (https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1), such as STANDARD_IA and ARCHIVE.
    */
    @SerializedName("StorageClass")
    @Expose
    private String StorageClass;

    /**
    * Unique identifier of the media file for this file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * File classification: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> <li>Other: other files</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Optional values:
-OriginalFiles: source file
-TranscodeFiles: transcoded file
-AdaptiveDynamicStreamingFiles: Convert to adaptive bitrate stream file.
-SubtitleFiles: Subtitle file
-SampleSnapshotFiles: sampled screenshot files.
-ImageSpriteFiles: Sprite image screenshot files
-SnapshotByTimeOffsetFiles: Time point screenshot files.

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Video template ID. For template definition, please refer to transcoding template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Subtitle ID.
Only valid when FileType=SubtitleFiles.
    */
    @SerializedName("SubtitleID")
    @Expose
    private String SubtitleID;

    /**
     * Get Object key. 
     * @return Key Object key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Object key.
     * @param Key Object key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Last modification time in ISO8601 format, such as 2019-05-24T10:56:40Z. 
     * @return LastModified Last modification time in ISO8601 format, such as 2019-05-24T10:56:40Z.
     */
    public String getLastModified() {
        return this.LastModified;
    }

    /**
     * Set Last modification time in ISO8601 format, such as 2019-05-24T10:56:40Z.
     * @param LastModified Last modification time in ISO8601 format, such as 2019-05-24T10:56:40Z.
     */
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get The Entity Tag of an object is an information Tag that identifies the object content when the object is created. It can be used to check whether the object content has changed. 
     * @return ETag The Entity Tag of an object is an information Tag that identifies the object content when the object is created. It can be used to check whether the object content has changed.
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set The Entity Tag of an object is an information Tag that identifies the object content when the object is created. It can be used to check whether the object content has changed.
     * @param ETag The Entity Tag of an object is an information Tag that identifies the object content when the object is created. It can be used to check whether the object content has changed.
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get Object size in bytes. 
     * @return Size Object size in bytes.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Object size in bytes.
     * @param Size Object size in bytes.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get For enumeration values, please refer to the storage type document (https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1), such as STANDARD_IA and ARCHIVE. 
     * @return StorageClass For enumeration values, please refer to the storage type document (https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1), such as STANDARD_IA and ARCHIVE.
     */
    public String getStorageClass() {
        return this.StorageClass;
    }

    /**
     * Set For enumeration values, please refer to the storage type document (https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1), such as STANDARD_IA and ARCHIVE.
     * @param StorageClass For enumeration values, please refer to the storage type document (https://www.tencentcloud.com/document/product/436/33417?from_cn_redirect=1), such as STANDARD_IA and ARCHIVE.
     */
    public void setStorageClass(String StorageClass) {
        this.StorageClass = StorageClass;
    }

    /**
     * Get Unique identifier of the media file for this file. 
     * @return FileId Unique identifier of the media file for this file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Unique identifier of the media file for this file.
     * @param FileId Unique identifier of the media file for this file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get File classification: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> <li>Other: other files</li> 
     * @return Category File classification: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> <li>Other: other files</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set File classification: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> <li>Other: other files</li>
     * @param Category File classification: <li>Video: video file</li> <li>Audio: audio file</li> <li>Image: image file</li> <li>Other: other files</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Optional values:
-OriginalFiles: source file
-TranscodeFiles: transcoded file
-AdaptiveDynamicStreamingFiles: Convert to adaptive bitrate stream file.
-SubtitleFiles: Subtitle file
-SampleSnapshotFiles: sampled screenshot files.
-ImageSpriteFiles: Sprite image screenshot files
-SnapshotByTimeOffsetFiles: Time point screenshot files.
 
     * @return FileType Optional values:
-OriginalFiles: source file
-TranscodeFiles: transcoded file
-AdaptiveDynamicStreamingFiles: Convert to adaptive bitrate stream file.
-SubtitleFiles: Subtitle file
-SampleSnapshotFiles: sampled screenshot files.
-ImageSpriteFiles: Sprite image screenshot files
-SnapshotByTimeOffsetFiles: Time point screenshot files.

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Optional values:
-OriginalFiles: source file
-TranscodeFiles: transcoded file
-AdaptiveDynamicStreamingFiles: Convert to adaptive bitrate stream file.
-SubtitleFiles: Subtitle file
-SampleSnapshotFiles: sampled screenshot files.
-ImageSpriteFiles: Sprite image screenshot files
-SnapshotByTimeOffsetFiles: Time point screenshot files.

     * @param FileType Optional values:
-OriginalFiles: source file
-TranscodeFiles: transcoded file
-AdaptiveDynamicStreamingFiles: Convert to adaptive bitrate stream file.
-SubtitleFiles: Subtitle file
-SampleSnapshotFiles: sampled screenshot files.
-ImageSpriteFiles: Sprite image screenshot files
-SnapshotByTimeOffsetFiles: Time point screenshot files.

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Video template ID. For template definition, please refer to transcoding template. 
     * @return Definition Video template ID. For template definition, please refer to transcoding template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Video template ID. For template definition, please refer to transcoding template.
     * @param Definition Video template ID. For template definition, please refer to transcoding template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Subtitle ID.
Only valid when FileType=SubtitleFiles. 
     * @return SubtitleID Subtitle ID.
Only valid when FileType=SubtitleFiles.
     */
    public String getSubtitleID() {
        return this.SubtitleID;
    }

    /**
     * Set Subtitle ID.
Only valid when FileType=SubtitleFiles.
     * @param SubtitleID Subtitle ID.
Only valid when FileType=SubtitleFiles.
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

