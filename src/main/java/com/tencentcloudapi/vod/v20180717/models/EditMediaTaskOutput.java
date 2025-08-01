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

public class EditMediaTaskOutput extends AbstractModel {

    /**
    * File type, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Media file playback address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Media file ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Output filename of up to 64 characters, which is generated by the system by default.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, which means "Other".</li>
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get File type, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileType File type, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileType File type, such as mp4 and flv.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Media file playback address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileUrl Media file playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set Media file playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileUrl Media file playback address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get Media file ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FileId Media file ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FileId Media file ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Output filename of up to 64 characters, which is generated by the system by default.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MediaName Output filename of up to 64 characters, which is generated by the system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename of up to 64 characters, which is generated by the system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MediaName Output filename of up to 64 characters, which is generated by the system by default.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, which means "Other".</li>
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, which means "Other".</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, which means "Other".</li>
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, which means "Other".</li>
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public EditMediaTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaTaskOutput(EditMediaTaskOutput source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

