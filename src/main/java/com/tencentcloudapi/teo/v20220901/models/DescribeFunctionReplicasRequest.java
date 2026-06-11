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

public class DescribeFunctionReplicasRequest extends AbstractModel {

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
    * Number limit of paginated query. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting basis. Valid values: <li>created-on: Creation time.</li> Default sorting is based on the created-on attribute.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * List sort method. Valid values: <li>asc: ascending order;</li> <li>desc: sort in descending order.</li> Default value: asc.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Filtering Conditions. The maximum of Filters.Values is 20. If this parameter is left empty, it returns all function replicas under the function ID. Detailed filter criteria: <li>replica-name: Filter by function replica name. Fuzzy query is supported.</li>
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
     * Get Number limit of paginated query. Default value: 20. Maximum value: 200. 
     * @return Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number limit of paginated query. Default value: 20. Maximum value: 200.
     * @param Limit Number limit of paginated query. Default value: 20. Maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting basis. Valid values: <li>created-on: Creation time.</li> Default sorting is based on the created-on attribute. 
     * @return SortBy Sorting basis. Valid values: <li>created-on: Creation time.</li> Default sorting is based on the created-on attribute.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting basis. Valid values: <li>created-on: Creation time.</li> Default sorting is based on the created-on attribute.
     * @param SortBy Sorting basis. Valid values: <li>created-on: Creation time.</li> Default sorting is based on the created-on attribute.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get List sort method. Valid values: <li>asc: ascending order;</li> <li>desc: sort in descending order.</li> Default value: asc. 
     * @return SortOrder List sort method. Valid values: <li>asc: ascending order;</li> <li>desc: sort in descending order.</li> Default value: asc.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set List sort method. Valid values: <li>asc: ascending order;</li> <li>desc: sort in descending order.</li> Default value: asc.
     * @param SortOrder List sort method. Valid values: <li>asc: ascending order;</li> <li>desc: sort in descending order.</li> Default value: asc.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Filtering Conditions. The maximum of Filters.Values is 20. If this parameter is left empty, it returns all function replicas under the function ID. Detailed filter criteria: <li>replica-name: Filter by function replica name. Fuzzy query is supported.</li> 
     * @return Filters Filtering Conditions. The maximum of Filters.Values is 20. If this parameter is left empty, it returns all function replicas under the function ID. Detailed filter criteria: <li>replica-name: Filter by function replica name. Fuzzy query is supported.</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering Conditions. The maximum of Filters.Values is 20. If this parameter is left empty, it returns all function replicas under the function ID. Detailed filter criteria: <li>replica-name: Filter by function replica name. Fuzzy query is supported.</li>
     * @param Filters Filtering Conditions. The maximum of Filters.Values is 20. If this parameter is left empty, it returns all function replicas under the function ID. Detailed filter criteria: <li>replica-name: Filter by function replica name. Fuzzy query is supported.</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeFunctionReplicasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionReplicasRequest(DescribeFunctionReplicasRequest source) {
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
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

