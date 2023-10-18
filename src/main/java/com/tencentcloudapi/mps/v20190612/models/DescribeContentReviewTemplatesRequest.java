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

public class DescribeContentReviewTemplatesRequest extends AbstractModel {

    /**
    * The IDs of the content moderation templates to query. Array length limit: 50.
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
    * Number of returned entries. Default value: 10. Maximum value: 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The filter for querying templates. If this parameter is left empty, both preset and custom templates are returned. Valid values:
* Preset
* Custom
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get The IDs of the content moderation templates to query. Array length limit: 50. 
     * @return Definitions The IDs of the content moderation templates to query. Array length limit: 50.
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set The IDs of the content moderation templates to query. Array length limit: 50.
     * @param Definitions The IDs of the content moderation templates to query. Array length limit: 50.
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
     * Get Number of returned entries. Default value: 10. Maximum value: 50. 
     * @return Limit Number of returned entries. Default value: 10. Maximum value: 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 10. Maximum value: 50.
     * @param Limit Number of returned entries. Default value: 10. Maximum value: 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The filter for querying templates. If this parameter is left empty, both preset and custom templates are returned. Valid values:
* Preset
* Custom 
     * @return Type The filter for querying templates. If this parameter is left empty, both preset and custom templates are returned. Valid values:
* Preset
* Custom
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The filter for querying templates. If this parameter is left empty, both preset and custom templates are returned. Valid values:
* Preset
* Custom
     * @param Type The filter for querying templates. If this parameter is left empty, both preset and custom templates are returned. Valid values:
* Preset
* Custom
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeContentReviewTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContentReviewTemplatesRequest(DescribeContentReviewTemplatesRequest source) {
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
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

