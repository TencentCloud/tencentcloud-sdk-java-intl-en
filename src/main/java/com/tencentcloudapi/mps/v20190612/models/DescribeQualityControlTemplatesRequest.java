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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQualityControlTemplatesRequest extends AbstractModel {

    /**
    * Filter condition for media quality inspection template unique identifiers, with an array length limit of 100.
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries.

<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * "Preset": preset template, "Custom": custom template
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Filter condition for media quality inspection template identifiers, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Filter condition for media quality inspection template unique identifiers, with an array length limit of 100. 
     * @return Definitions Filter condition for media quality inspection template unique identifiers, with an array length limit of 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Filter condition for media quality inspection template unique identifiers, with an array length limit of 100.
     * @param Definitions Filter condition for media quality inspection template unique identifiers, with an array length limit of 100.
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries.

<li>Default value: 10.</li>
<li>Maximum value: 100.</li> 
     * @return Limit Number of returned entries.

<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries.

<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     * @param Limit Number of returned entries.

<li>Default value: 10.</li>
<li>Maximum value: 100.</li>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get "Preset": preset template, "Custom": custom template 
     * @return Type "Preset": preset template, "Custom": custom template
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set "Preset": preset template, "Custom": custom template
     * @param Type "Preset": preset template, "Custom": custom template
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Filter condition for media quality inspection template identifiers, with a length limit of 64 characters. 
     * @return Name Filter condition for media quality inspection template identifiers, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter condition for media quality inspection template identifiers, with a length limit of 64 characters.
     * @param Name Filter condition for media quality inspection template identifiers, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeQualityControlTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQualityControlTemplatesRequest(DescribeQualityControlTemplatesRequest source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

