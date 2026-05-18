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

public class DescribeBlindWatermarkTemplatesRequest extends AbstractModel {

    /**
    * VOD application ID. Starting from December 25, 2023, customers who activate on-demand services must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Filtering condition for the unique identifier of the digital watermark template. The array length cannot exceed 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
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
<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VOD application ID. Starting from December 25, 2023, customers who activate on-demand services must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application). 
     * @return SubAppId VOD application ID. Starting from December 25, 2023, customers who activate on-demand services must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD application ID. Starting from December 25, 2023, customers who activate on-demand services must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).
     * @param SubAppId VOD application ID. Starting from December 25, 2023, customers who activate on-demand services must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created application).
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Filtering condition for the unique identifier of the digital watermark template. The array length cannot exceed 100. 
     * @return Definitions Filtering condition for the unique identifier of the digital watermark template. The array length cannot exceed 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Filtering condition for the unique identifier of the digital watermark template. The array length cannot exceed 100.
     * @param Definitions Filtering condition for the unique identifier of the digital watermark template. The array length cannot exceed 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-nagra: NAGRA forensics watermark.</li>
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
<li>Default value: 10.</li>
<li>Maximum value: 100.</li> 
     * @return Limit Number of returned entries
<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries
<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     * @param Limit Number of returned entries
<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeBlindWatermarkTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlindWatermarkTemplatesRequest(DescribeBlindWatermarkTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

