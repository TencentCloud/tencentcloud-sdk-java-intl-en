/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeMediaTaskOutput extends AbstractModel{

    /**
    * File type, such as mp4 and mp3.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Media file playback address.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * Filename of up to 64 characters.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get File type, such as mp4 and mp3. 
     * @return FileType File type, such as mp4 and mp3.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, such as mp4 and mp3.
     * @param FileType File type, such as mp4 and mp3.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get Media file ID. 
     * @return FileId Media file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID.
     * @param FileId Media file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
     * Get Filename of up to 64 characters. 
     * @return MediaName Filename of up to 64 characters.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Filename of up to 64 characters.
     * @param MediaName Filename of up to 64 characters.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li> 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param ExpireTime Expiration time of output media file in ISO 8601 format, after which the file will be deleted. Files will never expire by default. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

