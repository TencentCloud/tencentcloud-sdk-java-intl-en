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

public class SceneAigcImageTaskOutputFileInfo extends AbstractModel {

    /**
    * Storage mode. Valid values: <li>Permanent: retained permanently;</li> <li>Temporary: temporary storage;</li>

    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Output filename, up to 64 characters. Default filename is specified generation by system. Valid when StorageMode is Permanent.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API. Valid when StorageMode is Permanent.

    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * File type, such as mp4, flv.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Media file playback address.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Media file ID. Valid when StorageMode is Permanent.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Output video meta information. Valid when StorageMode is Permanent.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get Storage mode. Valid values: <li>Permanent: retained permanently;</li> <li>Temporary: temporary storage;</li>
 
     * @return StorageMode Storage mode. Valid values: <li>Permanent: retained permanently;</li> <li>Temporary: temporary storage;</li>

     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage mode. Valid values: <li>Permanent: retained permanently;</li> <li>Temporary: temporary storage;</li>

     * @param StorageMode Storage mode. Valid values: <li>Permanent: retained permanently;</li> <li>Temporary: temporary storage;</li>

     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Output filename, up to 64 characters. Default filename is specified generation by system. Valid when StorageMode is Permanent. 
     * @return MediaName Output filename, up to 64 characters. Default filename is specified generation by system. Valid when StorageMode is Permanent.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. Default filename is specified generation by system. Valid when StorageMode is Permanent.
     * @param MediaName Output filename, up to 64 characters. Default filename is specified generation by system. Valid when StorageMode is Permanent.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API. Valid when StorageMode is Permanent.
 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API. Valid when StorageMode is Permanent.

     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API. Valid when StorageMode is Permanent.

     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API. Valid when StorageMode is Permanent.

     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime Expiry date of the output file. Files will be deleted longer than this time. Default is no expiration. Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get File type, such as mp4, flv. 
     * @return FileType File type, such as mp4, flv.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, such as mp4, flv.
     * @param FileType File type, such as mp4, flv.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Media file playback address. 
     * @return FileUrl Media file playback address.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Media file playback address.
     * @param FileUrl Media file playback address.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Media file ID. Valid when StorageMode is Permanent. 
     * @return FileId Media file ID. Valid when StorageMode is Permanent.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID. Valid when StorageMode is Permanent.
     * @param FileId Media file ID. Valid when StorageMode is Permanent.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Output video meta information. Valid when StorageMode is Permanent. 
     * @return MetaData Output video meta information. Valid when StorageMode is Permanent.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Output video meta information. Valid when StorageMode is Permanent.
     * @param MetaData Output video meta information. Valid when StorageMode is Permanent.
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    public SceneAigcImageTaskOutputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTaskOutputFileInfo(SceneAigcImageTaskOutputFileInfo source) {
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

