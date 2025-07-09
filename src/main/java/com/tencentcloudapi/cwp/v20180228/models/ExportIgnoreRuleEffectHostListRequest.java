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

public class ExportIgnoreRuleEffectHostListRequest extends AbstractModel {

    /**
    * Detection item ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Filtering criteria
<li>AliasName - String - host alias</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Detection item ID 
     * @return RuleId Detection item ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Detection item ID
     * @param RuleId Detection item ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Filtering criteria
<li>AliasName - String - host alias</li> 
     * @return Filters Filtering criteria
<li>AliasName - String - host alias</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>AliasName - String - host alias</li>
     * @param Filters Filtering criteria
<li>AliasName - String - host alias</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ExportIgnoreRuleEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportIgnoreRuleEffectHostListRequest(ExportIgnoreRuleEffectHostListRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

