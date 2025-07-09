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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBashPoliciesRequest extends AbstractModel {

    /**
    * Quantity of returned entries. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filtering criteria
<li>Name - String - required: no - rule name</li>
<li>Rule - String - required: no - rule content</li>
<li>Level - Int - required: no - threat level</li>
<li>White - Int - required: no - allowlist type</li>
<li>Category - Int - required: no - policy type</li>
<li>BashAction - Int - required: no - action</li>
<li>Enable - Int - required: no - enabling status</li>
<li>Id - Int - required: no - policy ID</li>
<li>PolicyId - Int - required: no - policy ID</li>
<li>RuleId - Int - required: no - rule ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Quantity of returned entries. The maximum value is 100. 
     * @return Limit Quantity of returned entries. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returned entries. The maximum value is 100.
     * @param Limit Quantity of returned entries. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filtering criteria
<li>Name - String - required: no - rule name</li>
<li>Rule - String - required: no - rule content</li>
<li>Level - Int - required: no - threat level</li>
<li>White - Int - required: no - allowlist type</li>
<li>Category - Int - required: no - policy type</li>
<li>BashAction - Int - required: no - action</li>
<li>Enable - Int - required: no - enabling status</li>
<li>Id - Int - required: no - policy ID</li>
<li>PolicyId - Int - required: no - policy ID</li>
<li>RuleId - Int - required: no - rule ID</li> 
     * @return Filters Filtering criteria
<li>Name - String - required: no - rule name</li>
<li>Rule - String - required: no - rule content</li>
<li>Level - Int - required: no - threat level</li>
<li>White - Int - required: no - allowlist type</li>
<li>Category - Int - required: no - policy type</li>
<li>BashAction - Int - required: no - action</li>
<li>Enable - Int - required: no - enabling status</li>
<li>Id - Int - required: no - policy ID</li>
<li>PolicyId - Int - required: no - policy ID</li>
<li>RuleId - Int - required: no - rule ID</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>Name - String - required: no - rule name</li>
<li>Rule - String - required: no - rule content</li>
<li>Level - Int - required: no - threat level</li>
<li>White - Int - required: no - allowlist type</li>
<li>Category - Int - required: no - policy type</li>
<li>BashAction - Int - required: no - action</li>
<li>Enable - Int - required: no - enabling status</li>
<li>Id - Int - required: no - policy ID</li>
<li>PolicyId - Int - required: no - policy ID</li>
<li>RuleId - Int - required: no - rule ID</li>
     * @param Filters Filtering criteria
<li>Name - String - required: no - rule name</li>
<li>Rule - String - required: no - rule content</li>
<li>Level - Int - required: no - threat level</li>
<li>White - Int - required: no - allowlist type</li>
<li>Category - Int - required: no - policy type</li>
<li>BashAction - Int - required: no - action</li>
<li>Enable - Int - required: no - enabling status</li>
<li>Id - Int - required: no - policy ID</li>
<li>PolicyId - Int - required: no - policy ID</li>
<li>RuleId - Int - required: no - rule ID</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeBashPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBashPoliciesRequest(DescribeBashPoliciesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

