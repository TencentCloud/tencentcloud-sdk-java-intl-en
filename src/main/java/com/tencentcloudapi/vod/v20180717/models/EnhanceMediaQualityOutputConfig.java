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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnhanceMediaQualityOutputConfig extends AbstractModel {

    /**
    * Output file name, up to 64 characters. The system will specify the file name by default
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Category ID, used for media classification management, can be obtained by [creating a category](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface, create a category, get the category ID.
<li>Default value: 0, which means other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The expiration time of the output file, the file will be deleted after this time, the default is never to expire, the format is in accordance with the ISO 8601 standard, see [ISO date format description](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Output file name, up to 64 characters. The system will specify the file name by default 
     * @return MediaName Output file name, up to 64 characters. The system will specify the file name by default
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Output file name, up to 64 characters. The system will specify the file name by default
     * @param MediaName Output file name, up to 64 characters. The system will specify the file name by default
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get Category ID, used for media classification management, can be obtained by [creating a category](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface, create a category, get the category ID.
<li>Default value: 0, which means other categories.</li> 
     * @return ClassId Category ID, used for media classification management, can be obtained by [creating a category](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface, create a category, get the category ID.
<li>Default value: 0, which means other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used for media classification management, can be obtained by [creating a category](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface, create a category, get the category ID.
<li>Default value: 0, which means other categories.</li>
     * @param ClassId Category ID, used for media classification management, can be obtained by [creating a category](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) interface, create a category, get the category ID.
<li>Default value: 0, which means other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The expiration time of the output file, the file will be deleted after this time, the default is never to expire, the format is in accordance with the ISO 8601 standard, see [ISO date format description](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime The expiration time of the output file, the file will be deleted after this time, the default is never to expire, the format is in accordance with the ISO 8601 standard, see [ISO date format description](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the output file, the file will be deleted after this time, the default is never to expire, the format is in accordance with the ISO 8601 standard, see [ISO date format description](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime The expiration time of the output file, the file will be deleted after this time, the default is never to expire, the format is in accordance with the ISO 8601 standard, see [ISO date format description](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public EnhanceMediaQualityOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceMediaQualityOutputConfig(EnhanceMediaQualityOutputConfig source) {
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

