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

public class ComposeMediaTaskOutput extends AbstractModel {

    /**
    * File type, for example, mp4 and mp3.
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
    * Filename, which contains up to 64 characters.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. You can create a category through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API to obtain the category ID.
<li>Default value: 0, indicate other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get File type, for example, mp4 and mp3. 
     * @return FileType File type, for example, mp4 and mp3.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type, for example, mp4 and mp3.
     * @param FileType File type, for example, mp4 and mp3.
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
     * Get Filename, which contains up to 64 characters. 
     * @return MediaName Filename, which contains up to 64 characters.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Filename, which contains up to 64 characters.
     * @param MediaName Filename, which contains up to 64 characters.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API to obtain the category ID.
<li>Default value: 0, indicate other categories.</li> 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API to obtain the category ID.
<li>Default value: 0, indicate other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API to obtain the category ID.
<li>Default value: 0, indicate other categories.</li>
     * @param ClassId Category ID, used to categorize and manage media. You can create a category through the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API to obtain the category ID.
<li>Default value: 0, indicate other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime Expiry date of the output file. The file will be deleted after this time. It never expires by default. Format according to the ISO 8601 standard representation. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public ComposeMediaTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaTaskOutput(ComposeMediaTaskOutput source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
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
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

