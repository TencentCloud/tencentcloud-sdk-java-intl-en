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

public class DescribeAdaptiveDynamicStreamingTemplatesRequest extends AbstractModel {

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Unique id filter of transcoding to adaptive bitrate streaming templates. array length limit: 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Pagination offset. default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. default value: 10. maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Template type filter. valid values:.
<Li>Preset: system preset template;</li>.
<Li>Custom: user-defined template.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Unique id filter of transcoding to adaptive bitrate streaming templates. array length limit: 100. 
     * @return Definitions Unique id filter of transcoding to adaptive bitrate streaming templates. array length limit: 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Unique id filter of transcoding to adaptive bitrate streaming templates. array length limit: 100.
     * @param Definitions Unique id filter of transcoding to adaptive bitrate streaming templates. array length limit: 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Pagination offset. default value: 0. 
     * @return Offset Pagination offset. default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. default value: 0.
     * @param Offset Pagination offset. default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. default value: 10. maximum value: 100. 
     * @return Limit Number of returned entries. default value: 10. maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. default value: 10. maximum value: 100.
     * @param Limit Number of returned entries. default value: 10. maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Template type filter. valid values:.
<Li>Preset: system preset template;</li>.
<Li>Custom: user-defined template.</li>. 
     * @return Type Template type filter. valid values:.
<Li>Preset: system preset template;</li>.
<Li>Custom: user-defined template.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type filter. valid values:.
<Li>Preset: system preset template;</li>.
<Li>Custom: user-defined template.</li>.
     * @param Type Template type filter. valid values:.
<Li>Preset: system preset template;</li>.
<Li>Custom: user-defined template.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeAdaptiveDynamicStreamingTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAdaptiveDynamicStreamingTemplatesRequest(DescribeAdaptiveDynamicStreamingTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

