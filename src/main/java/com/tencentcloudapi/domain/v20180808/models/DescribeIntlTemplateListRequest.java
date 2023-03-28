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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntlTemplateListRequest extends AbstractModel{

    /**
    * The offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The maximum number of entries.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The domain registrant keyword for exact match.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * The type. Valid values: `all` (all types), `I` (individual), `E` (organization).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get The offset. 
     * @return Offset The offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset.
     * @param Offset The offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The maximum number of entries. 
     * @return Limit The maximum number of entries.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of entries.
     * @param Limit The maximum number of entries.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The domain registrant keyword for exact match. 
     * @return Keyword The domain registrant keyword for exact match.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set The domain registrant keyword for exact match.
     * @param Keyword The domain registrant keyword for exact match.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get The type. Valid values: `all` (all types), `I` (individual), `E` (organization). 
     * @return Type The type. Valid values: `all` (all types), `I` (individual), `E` (organization).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type. Valid values: `all` (all types), `I` (individual), `E` (organization).
     * @param Type The type. Valid values: `all` (all types), `I` (individual), `E` (organization).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeIntlTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntlTemplateListRequest(DescribeIntlTemplateListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

