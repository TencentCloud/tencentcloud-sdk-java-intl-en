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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubtitleEmbedTemplatesRequest extends AbstractModel {

    /**
    * <p>Unique identifiers of intelligent caption templates for filtering. The array can contain up to 100 unique identifiers.</p>
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * <p>Paging offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filtering condition for the template type. Leave it blank to return all. Valid values:</p><ul><li>Preset: system preset template;</li><li>Custom: user-defined template.</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Condition for filtering subtitle suppression templates by ID. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Unique identifiers of intelligent caption templates for filtering. The array can contain up to 100 unique identifiers.</p> 
     * @return Definitions <p>Unique identifiers of intelligent caption templates for filtering. The array can contain up to 100 unique identifiers.</p>
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set <p>Unique identifiers of intelligent caption templates for filtering. The array can contain up to 100 unique identifiers.</p>
     * @param Definitions <p>Unique identifiers of intelligent caption templates for filtering. The array can contain up to 100 unique identifiers.</p>
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get <p>Paging offset. Default value: 0.</p> 
     * @return Offset <p>Paging offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset. Default value: 0.</p>
     * @param Offset <p>Paging offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of returned entries. Default value: 10. Maximum value: 100.</p> 
     * @return Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     * @param Limit <p>Number of returned entries. Default value: 10. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filtering condition for the template type. Leave it blank to return all. Valid values:</p><ul><li>Preset: system preset template;</li><li>Custom: user-defined template.</li></ul> 
     * @return Type <p>Filtering condition for the template type. Leave it blank to return all. Valid values:</p><ul><li>Preset: system preset template;</li><li>Custom: user-defined template.</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Filtering condition for the template type. Leave it blank to return all. Valid values:</p><ul><li>Preset: system preset template;</li><li>Custom: user-defined template.</li></ul>
     * @param Type <p>Filtering condition for the template type. Leave it blank to return all. Valid values:</p><ul><li>Preset: system preset template;</li><li>Custom: user-defined template.</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Condition for filtering subtitle suppression templates by ID. Length limit: 64 characters.</p> 
     * @return Name <p>Condition for filtering subtitle suppression templates by ID. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Condition for filtering subtitle suppression templates by ID. Length limit: 64 characters.</p>
     * @param Name <p>Condition for filtering subtitle suppression templates by ID. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeSubtitleEmbedTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubtitleEmbedTemplatesRequest(DescribeSubtitleEmbedTemplatesRequest source) {
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

