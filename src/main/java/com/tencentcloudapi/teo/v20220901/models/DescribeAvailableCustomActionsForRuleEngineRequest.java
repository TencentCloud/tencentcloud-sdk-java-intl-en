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

public class DescribeAvailableCustomActionsForRuleEngineRequest extends AbstractModel {

    /**
    * <p>Zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Filter criteria. Multiple conditions have an AND relationship. The maximum number of Filters.Values is 20. If this parameter is left empty, return all available rule engine custom configurations under the current site. Detailed filter criteria:</p><li>action-id: Filter by the unique identification ID of the custom configuration.</li><li>name: Filter by the name of the custom configuration.</a></li>Fuzzy query only supports filtering fields named <code>name</code>.<p></p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>Paginated query limit.</p><p>Value ranges from 0 to 1000.</p><p>Default value: 20.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Paging offset.</p><p>Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting field. Valid values:</p><li>action-id: Sort by custom configuration unique identification ID.</li><li>create-time: Sort by custom configuration creation time.</li>Default value: <code>action-id</code>.<p></p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>Sorting method. Valid values:</p><li>asc: ascending sort;</li><li>desc: sort in descending order.</li>Default value: desc.<p></p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Filter criteria. Multiple conditions have an AND relationship. The maximum number of Filters.Values is 20. If this parameter is left empty, return all available rule engine custom configurations under the current site. Detailed filter criteria:</p><li>action-id: Filter by the unique identification ID of the custom configuration.</li><li>name: Filter by the name of the custom configuration.</a></li>Fuzzy query only supports filtering fields named <code>name</code>.<p></p> 
     * @return Filters <p>Filter criteria. Multiple conditions have an AND relationship. The maximum number of Filters.Values is 20. If this parameter is left empty, return all available rule engine custom configurations under the current site. Detailed filter criteria:</p><li>action-id: Filter by the unique identification ID of the custom configuration.</li><li>name: Filter by the name of the custom configuration.</a></li>Fuzzy query only supports filtering fields named <code>name</code>.<p></p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria. Multiple conditions have an AND relationship. The maximum number of Filters.Values is 20. If this parameter is left empty, return all available rule engine custom configurations under the current site. Detailed filter criteria:</p><li>action-id: Filter by the unique identification ID of the custom configuration.</li><li>name: Filter by the name of the custom configuration.</a></li>Fuzzy query only supports filtering fields named <code>name</code>.<p></p>
     * @param Filters <p>Filter criteria. Multiple conditions have an AND relationship. The maximum number of Filters.Values is 20. If this parameter is left empty, return all available rule engine custom configurations under the current site. Detailed filter criteria:</p><li>action-id: Filter by the unique identification ID of the custom configuration.</li><li>name: Filter by the name of the custom configuration.</a></li>Fuzzy query only supports filtering fields named <code>name</code>.<p></p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Paginated query limit.</p><p>Value ranges from 0 to 1000.</p><p>Default value: 20.</p> 
     * @return Limit <p>Paginated query limit.</p><p>Value ranges from 0 to 1000.</p><p>Default value: 20.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Paginated query limit.</p><p>Value ranges from 0 to 1000.</p><p>Default value: 20.</p>
     * @param Limit <p>Paginated query limit.</p><p>Value ranges from 0 to 1000.</p><p>Default value: 20.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Paging offset.</p><p>Default value: 0.</p> 
     * @return Offset <p>Paging offset.</p><p>Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset.</p><p>Default value: 0.</p>
     * @param Offset <p>Paging offset.</p><p>Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting field. Valid values:</p><li>action-id: Sort by custom configuration unique identification ID.</li><li>create-time: Sort by custom configuration creation time.</li>Default value: <code>action-id</code>.<p></p> 
     * @return SortBy <p>Sorting field. Valid values:</p><li>action-id: Sort by custom configuration unique identification ID.</li><li>create-time: Sort by custom configuration creation time.</li>Default value: <code>action-id</code>.<p></p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>Sorting field. Valid values:</p><li>action-id: Sort by custom configuration unique identification ID.</li><li>create-time: Sort by custom configuration creation time.</li>Default value: <code>action-id</code>.<p></p>
     * @param SortBy <p>Sorting field. Valid values:</p><li>action-id: Sort by custom configuration unique identification ID.</li><li>create-time: Sort by custom configuration creation time.</li>Default value: <code>action-id</code>.<p></p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>Sorting method. Valid values:</p><li>asc: ascending sort;</li><li>desc: sort in descending order.</li>Default value: desc.<p></p> 
     * @return SortOrder <p>Sorting method. Valid values:</p><li>asc: ascending sort;</li><li>desc: sort in descending order.</li>Default value: desc.<p></p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Sorting method. Valid values:</p><li>asc: ascending sort;</li><li>desc: sort in descending order.</li>Default value: desc.<p></p>
     * @param SortOrder <p>Sorting method. Valid values:</p><li>asc: ascending sort;</li><li>desc: sort in descending order.</li>Default value: desc.<p></p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeAvailableCustomActionsForRuleEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableCustomActionsForRuleEngineRequest(DescribeAvailableCustomActionsForRuleEngineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

