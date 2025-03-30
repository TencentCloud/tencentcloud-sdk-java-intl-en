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

public class DescribeSmartSubtitleTemplatesRequest extends AbstractModel {

    /**
    * Condition for filtering smart subtitle templates by unique identifier. The array can contain up to 10 unique identifiers.
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
    * Number of returned entries. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Condition for filtering templates by type. If this field is not specified, all templates are returned. Valid values:
* Preset: system preset template
* Custom: user-defined template
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Condition for filtering smart subtitle templates by ID. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Condition for filtering smart subtitle templates by unique identifier. The array can contain up to 10 unique identifiers. 
     * @return Definitions Condition for filtering smart subtitle templates by unique identifier. The array can contain up to 10 unique identifiers.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Condition for filtering smart subtitle templates by unique identifier. The array can contain up to 10 unique identifiers.
     * @param Definitions Condition for filtering smart subtitle templates by unique identifier. The array can contain up to 10 unique identifiers.
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
     * Get Number of returned entries. Default value: 10. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Condition for filtering templates by type. If this field is not specified, all templates are returned. Valid values:
* Preset: system preset template
* Custom: user-defined template 
     * @return Type Condition for filtering templates by type. If this field is not specified, all templates are returned. Valid values:
* Preset: system preset template
* Custom: user-defined template
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Condition for filtering templates by type. If this field is not specified, all templates are returned. Valid values:
* Preset: system preset template
* Custom: user-defined template
     * @param Type Condition for filtering templates by type. If this field is not specified, all templates are returned. Valid values:
* Preset: system preset template
* Custom: user-defined template
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Condition for filtering smart subtitle templates by ID. Length limit: 64 characters. 
     * @return Name Condition for filtering smart subtitle templates by ID. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Condition for filtering smart subtitle templates by ID. Length limit: 64 characters.
     * @param Name Condition for filtering smart subtitle templates by ID. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeSmartSubtitleTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmartSubtitleTemplatesRequest(DescribeSmartSubtitleTemplatesRequest source) {
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

