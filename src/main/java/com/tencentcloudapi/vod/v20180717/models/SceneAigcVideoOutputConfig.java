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

public class SceneAigcVideoOutputConfig extends AbstractModel {

    /**
    * Storage mode. Valid values: <li>Permanent: Permanent storage. The generated image file will be stored in VOD, and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. The generated image file will not be stored in VOD, and the URL for temporary access can be obtained in the event notification.</li>
Default value: Temporary
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * Output filename, up to 64 characters. Default filename is specified generation by system.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
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
    * Specify the aspect ratio of the generated video. Input format is W:H. Valid only for product image scenarios. Options: 16:9, 9:16.
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * Generate video duration. Available values: 4, 6, 8 seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get Storage mode. Valid values: <li>Permanent: Permanent storage. The generated image file will be stored in VOD, and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. The generated image file will not be stored in VOD, and the URL for temporary access can be obtained in the event notification.</li>
Default value: Temporary 
     * @return StorageMode Storage mode. Valid values: <li>Permanent: Permanent storage. The generated image file will be stored in VOD, and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. The generated image file will not be stored in VOD, and the URL for temporary access can be obtained in the event notification.</li>
Default value: Temporary
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set Storage mode. Valid values: <li>Permanent: Permanent storage. The generated image file will be stored in VOD, and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. The generated image file will not be stored in VOD, and the URL for temporary access can be obtained in the event notification.</li>
Default value: Temporary
     * @param StorageMode Storage mode. Valid values: <li>Permanent: Permanent storage. The generated image file will be stored in VOD, and the FileId can be obtained in the event notification.</li> <li>Temporary: Temporary storage. The generated image file will not be stored in VOD, and the URL for temporary access can be obtained in the event notification.</li>
Default value: Temporary
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get Output filename, up to 64 characters. Default filename is specified generation by system. 
     * @return MediaName Output filename, up to 64 characters. Default filename is specified generation by system.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. Default filename is specified generation by system.
     * @param MediaName Output filename, up to 64 characters. Default filename is specified generation by system.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li> 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
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
     * Get Specify the aspect ratio of the generated video. Input format is W:H. Valid only for product image scenarios. Options: 16:9, 9:16. 
     * @return AspectRatio Specify the aspect ratio of the generated video. Input format is W:H. Valid only for product image scenarios. Options: 16:9, 9:16.
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set Specify the aspect ratio of the generated video. Input format is W:H. Valid only for product image scenarios. Options: 16:9, 9:16.
     * @param AspectRatio Specify the aspect ratio of the generated video. Input format is W:H. Valid only for product image scenarios. Options: 16:9, 9:16.
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get Generate video duration. Available values: 4, 6, 8 seconds. 
     * @return Duration Generate video duration. Available values: 4, 6, 8 seconds.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Generate video duration. Available values: 4, 6, 8 seconds.
     * @param Duration Generate video duration. Available values: 4, 6, 8 seconds.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public SceneAigcVideoOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcVideoOutputConfig(SceneAigcVideoOutputConfig source) {
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
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
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
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

