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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSandboxDLPSystemRuleListRequest extends AbstractModel {

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items per page. Default value: 10. Upper limit: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria.
Supported filter items:
RuleName: fuzzy search by rule name
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

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
     * Get Number of items per page. Default value: 10. Upper limit: 200. 
     * @return Limit Number of items per page. Default value: 10. Upper limit: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items per page. Default value: 10. Upper limit: 200.
     * @param Limit Number of items per page. Default value: 10. Upper limit: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria.
Supported filter items:
RuleName: fuzzy search by rule name 
     * @return Filters Filter criteria.
Supported filter items:
RuleName: fuzzy search by rule name
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
Supported filter items:
RuleName: fuzzy search by rule name
     * @param Filters Filter criteria.
Supported filter items:
RuleName: fuzzy search by rule name
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSandboxDLPSystemRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSandboxDLPSystemRuleListRequest(DescribeSandboxDLPSystemRuleListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

