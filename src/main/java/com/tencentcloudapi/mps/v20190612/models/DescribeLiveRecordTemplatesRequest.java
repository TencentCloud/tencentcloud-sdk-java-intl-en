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

public class DescribeLiveRecordTemplatesRequest extends AbstractModel {

    /**
    * Specifies the recording template unique identifier filter condition, with an array length limit of 100.
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
    * Indicates the template type filter condition. If left empty, all templates are returned. Valid values:
* Preset: System preset template;
* Custom
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the recording template identifier filter condition, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Specifies the recording template unique identifier filter condition, with an array length limit of 100. 
     * @return Definitions Specifies the recording template unique identifier filter condition, with an array length limit of 100.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set Specifies the recording template unique identifier filter condition, with an array length limit of 100.
     * @param Definitions Specifies the recording template unique identifier filter condition, with an array length limit of 100.
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
     * Get Indicates the template type filter condition. If left empty, all templates are returned. Valid values:
* Preset: System preset template;
* Custom 
     * @return Type Indicates the template type filter condition. If left empty, all templates are returned. Valid values:
* Preset: System preset template;
* Custom
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Indicates the template type filter condition. If left empty, all templates are returned. Valid values:
* Preset: System preset template;
* Custom
     * @param Type Indicates the template type filter condition. If left empty, all templates are returned. Valid values:
* Preset: System preset template;
* Custom
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the recording template identifier filter condition, with a length limit of 64 characters. 
     * @return Name Specifies the recording template identifier filter condition, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the recording template identifier filter condition, with a length limit of 64 characters.
     * @param Name Specifies the recording template identifier filter condition, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeLiveRecordTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveRecordTemplatesRequest(DescribeLiveRecordTemplatesRequest source) {
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

