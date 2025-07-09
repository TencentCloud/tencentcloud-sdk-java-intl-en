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

public class QualityEnhanceTaskOutput extends AbstractModel {

    /**
    * File types such as mp4, flv, etc.
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
    * Media file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Output file name, up to 64 characters. By default, the generated file name is specified by the system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Classification ID is used to classify media. You can create a classification through the [Create Classification](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get File types such as mp4, flv, etc. 
     * @return FileType File types such as mp4, flv, etc.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File types such as mp4, flv, etc.
     * @param FileType File types such as mp4, flv, etc.
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
     * Get Output file name, up to 64 characters. By default, the generated file name is specified by the system. 
     * @return MediaName Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     * @param MediaName Output file name, up to 64 characters. By default, the generated file name is specified by the system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Classification ID is used to classify media. You can create a classification through the [Create Classification](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li> 
     * @return ClassId Classification ID is used to classify media. You can create a classification through the [Create Classification](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Classification ID is used to classify media. You can create a classification through the [Create Classification](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     * @param ClassId Classification ID is used to classify media. You can create a classification through the [Create Classification](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface to obtain the classification ID. 
<li>Default value: 0, indicating other categories. </li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return ExpireTime The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param ExpireTime The expiration time of the output file. The file will be deleted after this time. The default is permanent and not expired. The format is expressed in accordance with the ISO 8601 standard. For details, see [ISO Date Format Description](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public QualityEnhanceTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityEnhanceTaskOutput(QualityEnhanceTaskOutput source) {
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

