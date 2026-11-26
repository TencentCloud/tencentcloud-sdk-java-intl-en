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

public class DescribeOriginGroupRequest extends AbstractModel {

    /**
    * Site ID. This parameter is required.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Paginated query offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit. If not specified, the default value is 20. Value range: 1-1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>origin-group-id: filter by origin group ID. Fuzzy queries are not supported. The origin group ID format is: origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a;</li><li>origin-group-name: filter by origin group name. When fuzzy search is used, only one origin group name can be filled in.</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get Site ID. This parameter is required. 
     * @return ZoneId Site ID. This parameter is required.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. This parameter is required.
     * @param ZoneId Site ID. This parameter is required.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Paginated query offset. Default value: 0. 
     * @return Offset Paginated query offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paginated query offset. Default value: 0.
     * @param Offset Paginated query offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Paginated query limit. If not specified, the default value is 20. Value range: 1-1000. 
     * @return Limit Paginated query limit. If not specified, the default value is 20. Value range: 1-1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit. If not specified, the default value is 20. Value range: 1-1000.
     * @param Limit Paginated query limit. If not specified, the default value is 20. Value range: 1-1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>origin-group-id: filter by origin group ID. Fuzzy queries are not supported. The origin group ID format is: origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a;</li><li>origin-group-name: filter by origin group name. When fuzzy search is used, only one origin group name can be filled in.</li> 
     * @return Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>origin-group-id: filter by origin group ID. Fuzzy queries are not supported. The origin group ID format is: origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a;</li><li>origin-group-name: filter by origin group name. When fuzzy search is used, only one origin group name can be filled in.</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>origin-group-id: filter by origin group ID. Fuzzy queries are not supported. The origin group ID format is: origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a;</li><li>origin-group-name: filter by origin group name. When fuzzy search is used, only one origin group name can be filled in.</li>
     * @param Filters Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria are as follows:
<li>origin-group-id: filter by origin group ID. Fuzzy queries are not supported. The origin group ID format is: origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a;</li><li>origin-group-name: filter by origin group name. When fuzzy search is used, only one origin group name can be filled in.</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOriginGroupRequest(DescribeOriginGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

