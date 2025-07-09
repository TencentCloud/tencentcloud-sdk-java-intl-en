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

public class ModifyBaselinePolicyRequest extends AbstractModel {

    /**
    * None
    */
    @SerializedName("Data")
    @Expose
    private BaselinePolicy Data;

    /**
    * <li>RuleName - String - required: no - rule name</li>
<li>CategoryId - int64 - required: no - customized filtering: -1 - rule category</li>
<li>RuleType - int - required: no - 0: system default; 1: customized - rule type</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Whether to select all based on the filtering criteria
    */
    @SerializedName("SelectAll")
    @Expose
    private Long SelectAll;

    /**
     * Get None 
     * @return Data None
     */
    public BaselinePolicy getData() {
        return this.Data;
    }

    /**
     * Set None
     * @param Data None
     */
    public void setData(BaselinePolicy Data) {
        this.Data = Data;
    }

    /**
     * Get <li>RuleName - String - required: no - rule name</li>
<li>CategoryId - int64 - required: no - customized filtering: -1 - rule category</li>
<li>RuleType - int - required: no - 0: system default; 1: customized - rule type</li> 
     * @return Filters <li>RuleName - String - required: no - rule name</li>
<li>CategoryId - int64 - required: no - customized filtering: -1 - rule category</li>
<li>RuleType - int - required: no - 0: system default; 1: customized - rule type</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>RuleName - String - required: no - rule name</li>
<li>CategoryId - int64 - required: no - customized filtering: -1 - rule category</li>
<li>RuleType - int - required: no - 0: system default; 1: customized - rule type</li>
     * @param Filters <li>RuleName - String - required: no - rule name</li>
<li>CategoryId - int64 - required: no - customized filtering: -1 - rule category</li>
<li>RuleType - int - required: no - 0: system default; 1: customized - rule type</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether to select all based on the filtering criteria 
     * @return SelectAll Whether to select all based on the filtering criteria
     */
    public Long getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set Whether to select all based on the filtering criteria
     * @param SelectAll Whether to select all based on the filtering criteria
     */
    public void setSelectAll(Long SelectAll) {
        this.SelectAll = SelectAll;
    }

    public ModifyBaselinePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselinePolicyRequest(ModifyBaselinePolicyRequest source) {
        if (source.Data != null) {
            this.Data = new BaselinePolicy(source.Data);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Long(source.SelectAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);

    }
}

