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

public class DescribeWatermarkTemplatesRequest extends AbstractModel{

    /**
    * Unique ID filter of watermarking templates. Array length limit: 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

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
    * Number of returned entries
<li>Default value: 10;</li>
<li>Maximum value: 100.</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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

    /**
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

