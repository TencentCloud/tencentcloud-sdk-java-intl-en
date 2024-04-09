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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAliasDomainsRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The paginated query limit. Default value: 20. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions. The maximum value for Filters.Values is 20. The detailed conditions are as follows:
<li>target-name: Filter by the target domain name;</li>
<li>alias-name: Filter by the alias of the domain name.</li>Fuzzy queries are only supported for the field name alias-name.
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The page offset. Default value: 0 
     * @return Offset The page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The page offset. Default value: 0
     * @param Offset The page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The paginated query limit. Default value: 20. Maximum value: 1000. 
     * @return Limit The paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The paginated query limit. Default value: 20. Maximum value: 1000.
     * @param Limit The paginated query limit. Default value: 20. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions. The maximum value for Filters.Values is 20. The detailed conditions are as follows:
<li>target-name: Filter by the target domain name;</li>
<li>alias-name: Filter by the alias of the domain name.</li>Fuzzy queries are only supported for the field name alias-name. 
     * @return Filters Filter conditions. The maximum value for Filters.Values is 20. The detailed conditions are as follows:
<li>target-name: Filter by the target domain name;</li>
<li>alias-name: Filter by the alias of the domain name.</li>Fuzzy queries are only supported for the field name alias-name.
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The maximum value for Filters.Values is 20. The detailed conditions are as follows:
<li>target-name: Filter by the target domain name;</li>
<li>alias-name: Filter by the alias of the domain name.</li>Fuzzy queries are only supported for the field name alias-name.
     * @param Filters Filter conditions. The maximum value for Filters.Values is 20. The detailed conditions are as follows:
<li>target-name: Filter by the target domain name;</li>
<li>alias-name: Filter by the alias of the domain name.</li>Fuzzy queries are only supported for the field name alias-name.
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAliasDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAliasDomainsRequest(DescribeAliasDomainsRequest source) {
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

