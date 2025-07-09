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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFunctionRulesRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>rule-id: Exact match by [rule ID].</li>
<li>function-id: Exact match by [function ID].</li>
<li>remark: Fuzzy match by [rule description].</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>rule-id: Exact match by [rule ID].</li>
<li>function-id: Exact match by [function ID].</li>
<li>remark: Fuzzy match by [rule description].</li> 
     * @return Filters Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>rule-id: Exact match by [rule ID].</li>
<li>function-id: Exact match by [function ID].</li>
<li>remark: Fuzzy match by [rule description].</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>rule-id: Exact match by [rule ID].</li>
<li>function-id: Exact match by [function ID].</li>
<li>remark: Fuzzy match by [rule description].</li>
     * @param Filters Filter criteria list. There is an AND relationship between different criteria. The maximum number of Filters.Values is 20. The detailed filter criteria are as follows:
<li>rule-id: Exact match by [rule ID].</li>
<li>function-id: Exact match by [function ID].</li>
<li>remark: Fuzzy match by [rule description].</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeFunctionRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionRulesRequest(DescribeFunctionRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

