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
    * (Required) Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The paginated query offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on paginated queries. Value range: 1-1000. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters. Each filter can have up to 20 entries. See below for details:
<li>`origin-group-id`<br>Filter by the <strong>origin group ID</strong>. Format: `origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a`<br>Fuzzy query is not supported</li><li>`origin-group-name`<br>Filter by the <strong>origin group name</strong><br>Fuzzy query is supported. When fuzzy query is used, only one origin groupsource site group name is supported</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get (Required) Site ID 
     * @return ZoneId (Required) Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set (Required) Site ID
     * @param ZoneId (Required) Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The paginated query offset. Default value: 0 
     * @return Offset The paginated query offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The paginated query offset. Default value: 0
     * @param Offset The paginated query offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit on paginated queries. Value range: 1-1000. Default value: 20. 
     * @return Limit Limit on paginated queries. Value range: 1-1000. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on paginated queries. Value range: 1-1000. Default value: 20.
     * @param Limit Limit on paginated queries. Value range: 1-1000. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters. Each filter can have up to 20 entries. See below for details:
<li>`origin-group-id`<br>Filter by the <strong>origin group ID</strong>. Format: `origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a`<br>Fuzzy query is not supported</li><li>`origin-group-name`<br>Filter by the <strong>origin group name</strong><br>Fuzzy query is supported. When fuzzy query is used, only one origin groupsource site group name is supported</li> 
     * @return Filters Filters. Each filter can have up to 20 entries. See below for details:
<li>`origin-group-id`<br>Filter by the <strong>origin group ID</strong>. Format: `origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a`<br>Fuzzy query is not supported</li><li>`origin-group-name`<br>Filter by the <strong>origin group name</strong><br>Fuzzy query is supported. When fuzzy query is used, only one origin groupsource site group name is supported</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters. Each filter can have up to 20 entries. See below for details:
<li>`origin-group-id`<br>Filter by the <strong>origin group ID</strong>. Format: `origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a`<br>Fuzzy query is not supported</li><li>`origin-group-name`<br>Filter by the <strong>origin group name</strong><br>Fuzzy query is supported. When fuzzy query is used, only one origin groupsource site group name is supported</li>
     * @param Filters Filters. Each filter can have up to 20 entries. See below for details:
<li>`origin-group-id`<br>Filter by the <strong>origin group ID</strong>. Format: `origin-2ccgtb24-7dc5-46s2-9r3e-95825d53dwe3a`<br>Fuzzy query is not supported</li><li>`origin-group-name`<br>Filter by the <strong>origin group name</strong><br>Fuzzy query is supported. When fuzzy query is used, only one origin groupsource site group name is supported</li>
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

