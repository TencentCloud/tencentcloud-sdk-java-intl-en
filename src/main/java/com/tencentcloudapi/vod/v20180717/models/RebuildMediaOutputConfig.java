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

public class RebuildMediaOutputConfig extends AbstractModel {

    /**
    * Output filename, up to 64 characters. By default, the system specifies the generated filename.
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
    * Expiry date of the output file. The file will be deleted after this time. By default, it never expires. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Output filename, up to 64 characters. By default, the system specifies the generated filename. 
     * @return MediaName Output filename, up to 64 characters. By default, the system specifies the generated filename.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output filename, up to 64 characters. By default, the system specifies the generated filename.
     * @param MediaName Output filename, up to 64 characters. By default, the system specifies the generated filename.
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
     * Get Expiry date of the output file. The file will be deleted after this time. By default, it never expires. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime Expiry date of the output file. The file will be deleted after this time. By default, it never expires. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiry date of the output file. The file will be deleted after this time. By default, it never expires. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime Expiry date of the output file. The file will be deleted after this time. By default, it never expires. The format follows the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public RebuildMediaOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaOutputConfig(RebuildMediaOutputConfig source) {
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
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

