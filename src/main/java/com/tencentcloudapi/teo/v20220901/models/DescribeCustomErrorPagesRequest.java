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

public class DescribeCustomErrorPagesRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria Name values are as follows: <li>page-id: filter by page ID;</li><li>name: filter by page name;</li><li>description: filter by page description;</li><li>content-type: filter by page type.</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>Paginated query offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Paginated query limit. Default value: 20. Maximum value: 1000.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria Name values are as follows: <li>page-id: filter by page ID;</li><li>name: filter by page name;</li><li>description: filter by page description;</li><li>content-type: filter by page type.</li></p> 
     * @return Filters <p>Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria Name values are as follows: <li>page-id: filter by page ID;</li><li>name: filter by page name;</li><li>description: filter by page description;</li><li>content-type: filter by page type.</li></p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria Name values are as follows: <li>page-id: filter by page ID;</li><li>name: filter by page name;</li><li>description: filter by page description;</li><li>content-type: filter by page type.</li></p>
     * @param Filters <p>Filter criteria. The maximum value of Filters.Values is 20. The detailed filter criteria Name values are as follows: <li>page-id: filter by page ID;</li><li>name: filter by page name;</li><li>description: filter by page description;</li><li>content-type: filter by page type.</li></p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Paginated query offset. Default value: 0.</p> 
     * @return Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paginated query offset. Default value: 0.</p>
     * @param Offset <p>Paginated query offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Paginated query limit. Default value: 20. Maximum value: 1000.</p> 
     * @return Limit <p>Paginated query limit. Default value: 20. Maximum value: 1000.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit. Default value: 20. Maximum value: 1000.</p>
     * @param Limit <p>Paginated query limit. Default value: 20. Maximum value: 1000.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCustomErrorPagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomErrorPagesRequest(DescribeCustomErrorPagesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

