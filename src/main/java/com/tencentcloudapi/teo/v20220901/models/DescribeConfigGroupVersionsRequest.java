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

public class DescribeConfigGroupVersionsRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Configuration group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Filter criteria. The maximum number of `Filters.Values` is 20. If this parameter is left empty, all version information under the selected configuration group is returned. Detailed filter criteria:
<li>version-id: Filter by version ID;</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * The offset of paginated query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit. Default value: 20, maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Configuration group ID. 
     * @return GroupId Configuration group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Configuration group ID.
     * @param GroupId Configuration group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Filter criteria. The maximum number of `Filters.Values` is 20. If this parameter is left empty, all version information under the selected configuration group is returned. Detailed filter criteria:
<li>version-id: Filter by version ID;</li> 
     * @return Filters Filter criteria. The maximum number of `Filters.Values` is 20. If this parameter is left empty, all version information under the selected configuration group is returned. Detailed filter criteria:
<li>version-id: Filter by version ID;</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum number of `Filters.Values` is 20. If this parameter is left empty, all version information under the selected configuration group is returned. Detailed filter criteria:
<li>version-id: Filter by version ID;</li>
     * @param Filters Filter criteria. The maximum number of `Filters.Values` is 20. If this parameter is left empty, all version information under the selected configuration group is returned. Detailed filter criteria:
<li>version-id: Filter by version ID;</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
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
     * Get Paginated query limit. Default value: 20, maximum value: 100. 
     * @return Limit Paginated query limit. Default value: 20, maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit. Default value: 20, maximum value: 100.
     * @param Limit Paginated query limit. Default value: 20, maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeConfigGroupVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigGroupVersionsRequest(DescribeConfigGroupVersionsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

