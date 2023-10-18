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

public class DescribeWatermarkTemplatesRequest extends AbstractModel {

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Watermark type filter. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Unique ID filter of watermarking templates. Array length limit: 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Watermark type filter. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li> 
     * @return Type Watermark type filter. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Watermark type filter. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     * @param Type Watermark type filter. Valid values:
<li>image: image watermark;</li>
<li>text: text watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Unique ID filter of watermarking templates. Array length limit: 100. 
     * @return Definitions Unique ID filter of watermarking templates. Array length limit: 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Unique ID filter of watermarking templates. Array length limit: 100.
     * @param Definitions Unique ID filter of watermarking templates. Array length limit: 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li> 
     * @return Limit Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li>
     * @param Limit Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeWatermarkTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWatermarkTemplatesRequest(DescribeWatermarkTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

