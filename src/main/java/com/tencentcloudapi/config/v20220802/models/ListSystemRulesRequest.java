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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSystemRulesRequest extends AbstractModel {

    /**
    * Quantity per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Current Page
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Search keywords. Searches by ID, name, tag, or description are supported.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
     * Get Quantity per page 
     * @return Limit Quantity per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity per page
     * @param Limit Quantity per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Current Page 
     * @return Offset Current Page
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Current Page
     * @param Offset Current Page
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Search keywords. Searches by ID, name, tag, or description are supported. 
     * @return Keyword Search keywords. Searches by ID, name, tag, or description are supported.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search keywords. Searches by ID, name, tag, or description are supported.
     * @param Keyword Search keywords. Searches by ID, name, tag, or description are supported.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    public ListSystemRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSystemRulesRequest(ListSystemRulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

