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

public class DescribeJustInTimeTranscodeTemplatesRequest extends AbstractModel {

    /**
    * Template name filter condition, array length limit: 100.
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template type filter conditions, optional values:
<li>Preset: system preset task flow template;</li>
<li>Custom: user-defined task flow template. </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Paging offset, default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Returns the number of records, default value: 10, maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Template name filter condition, array length limit: 100. 
     * @return Names Template name filter condition, array length limit: 100.
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set Template name filter condition, array length limit: 100.
     * @param Names Template name filter condition, array length limit: 100.
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template type filter conditions, optional values:
<li>Preset: system preset task flow template;</li>
<li>Custom: user-defined task flow template. </li> 
     * @return Type Template type filter conditions, optional values:
<li>Preset: system preset task flow template;</li>
<li>Custom: user-defined task flow template. </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type filter conditions, optional values:
<li>Preset: system preset task flow template;</li>
<li>Custom: user-defined task flow template. </li>
     * @param Type Template type filter conditions, optional values:
<li>Preset: system preset task flow template;</li>
<li>Custom: user-defined task flow template. </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Paging offset, default value: 0. 
     * @return Offset Paging offset, default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset, default value: 0.
     * @param Offset Paging offset, default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Returns the number of records, default value: 10, maximum value: 100. 
     * @return Limit Returns the number of records, default value: 10, maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Returns the number of records, default value: 10, maximum value: 100.
     * @param Limit Returns the number of records, default value: 10, maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeJustInTimeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJustInTimeTranscodeTemplatesRequest(DescribeJustInTimeTranscodeTemplatesRequest source) {
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

