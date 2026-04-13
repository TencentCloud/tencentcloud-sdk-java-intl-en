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

public class DescribeFunctionComponentBindingsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The limit of paginated query. Default value: 20. Maximum value: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. The maximum number of Filters.Values is 20. Detailed filter criteria:
<li>Name: Filter by the bound variable name. Fuzzy query is supported.</li>
<li>type: Filter by binding type. Fuzzy queries are not supported.</li>

    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

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
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get The offset of paginated query. Default value: 0. 
     * @return Offset The offset of paginated query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset of paginated query. Default value: 0.
     * @param Offset The offset of paginated query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The limit of paginated query. Default value: 20. Maximum value: 1,000. 
     * @return Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The limit of paginated query. Default value: 20. Maximum value: 1,000.
     * @param Limit The limit of paginated query. Default value: 20. Maximum value: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. The maximum number of Filters.Values is 20. Detailed filter criteria:
<li>Name: Filter by the bound variable name. Fuzzy query is supported.</li>
<li>type: Filter by binding type. Fuzzy queries are not supported.</li>
 
     * @return Filters Filter conditions. The maximum number of Filters.Values is 20. Detailed filter criteria:
<li>Name: Filter by the bound variable name. Fuzzy query is supported.</li>
<li>type: Filter by binding type. Fuzzy queries are not supported.</li>

     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The maximum number of Filters.Values is 20. Detailed filter criteria:
<li>Name: Filter by the bound variable name. Fuzzy query is supported.</li>
<li>type: Filter by binding type. Fuzzy queries are not supported.</li>

     * @param Filters Filter conditions. The maximum number of Filters.Values is 20. Detailed filter criteria:
<li>Name: Filter by the bound variable name. Fuzzy query is supported.</li>
<li>type: Filter by binding type. Fuzzy queries are not supported.</li>

     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeFunctionComponentBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionComponentBindingsRequest(DescribeFunctionComponentBindingsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

