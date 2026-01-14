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
    * Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand).</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod.</li>.
Default value: Temporary.
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Output filename, up to 64 characters. default filename is assigned by the system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * File Type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File Url.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * File ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Meta Data.
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
     * Get Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand).</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod.</li>.
Default value: Temporary. 
     * @return StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand).</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod.</li>.
Default value: Temporary.
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand).</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod.</li>.
Default value: Temporary.
     * @param StorageMode Storage mode. valid values: <li>Permanent: Permanent storage. the generated image file will be stored in VOD (video on demand).</li> <li>Temporary: Temporary storage. the generated image file will not be stored in vod.</li>.
Default value: Temporary.
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Output filename, up to 64 characters. default filename is assigned by the system. 
     * @return MediaName Output filename, up to 64 characters. default filename is assigned by the system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. default filename is assigned by the system.
     * @param MediaName Output filename, up to 64 characters. default filename is assigned by the system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>. 
     * @return ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     * @param ClassId Category ID, used to categorize and manage media. you can create a category and obtain the category ID via the [create classification](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) api.
<Li>Default value: 0, indicating other categories.</li>.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime The expiry date of the output file. files will be deleted longer than this time. default is no expiration. format according to ISO 8601 standard. for details, see [ISO date format description](https://www.tencentcloud.comom/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get File Type. 
     * @return FileType File Type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File Type.
     * @param FileType File Type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File Url. 
     * @return FileUrl File Url.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set File Url.
     * @param FileUrl File Url.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get File ID. 
     * @return FileId File ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID.
     * @param FileId File ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Meta Data. 
     * @return MetaData Meta Data.
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Meta Data.
     * @param MetaData Meta Data.
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

