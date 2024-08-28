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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIgnoreRuleEffectHostListRequest extends AbstractModel {

    /**
    * Pagination parameters (The maximum quantity is 100)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Detection Item ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Filter criteria
<li>AliasName - String - host alias</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Host tag name
    */
    @SerializedName("TagNames")
    @Expose
    private String [] TagNames;

    /**
     * Get Pagination parameters (The maximum quantity is 100) 
     * @return Limit Pagination parameters (The maximum quantity is 100)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters (The maximum quantity is 100)
     * @param Limit Pagination parameters (The maximum quantity is 100)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameter 
     * @return Offset Pagination parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameter
     * @param Offset Pagination parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Detection Item ID 
     * @return RuleId Detection Item ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Detection Item ID
     * @param RuleId Detection Item ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Filter criteria
<li>AliasName - String - host alias</li> 
     * @return Filters Filter criteria
<li>AliasName - String - host alias</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>AliasName - String - host alias</li>
     * @param Filters Filter criteria
<li>AliasName - String - host alias</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Host tag name 
     * @return TagNames Host tag name
     */
    public String [] getTagNames() {
        return this.TagNames;
    }

    /**
     * Set Host tag name
     * @param TagNames Host tag name
     */
    public void setTagNames(String [] TagNames) {
        this.TagNames = TagNames;
    }

    public DescribeIgnoreRuleEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIgnoreRuleEffectHostListRequest(DescribeIgnoreRuleEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.TagNames != null) {
            this.TagNames = new String[source.TagNames.length];
            for (int i = 0; i < source.TagNames.length; i++) {
                this.TagNames[i] = new String(source.TagNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "TagNames.", this.TagNames);

    }
}

