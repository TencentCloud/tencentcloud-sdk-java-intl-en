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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQTopicsRequest extends AbstractModel {

    /**
    * Offset for query.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Query limit.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Filter by topic type. Valid values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`.
    */
    @SerializedName("FilterType")
    @Expose
    private String [] FilterType;

    /**
    * Search by topic name. Fuzzy query is supported.
    */
    @SerializedName("FilterName")
    @Expose
    private String FilterName;

    /**
    * Filters by subscription consumer group name.
    */
    @SerializedName("FilterGroup")
    @Expose
    private String FilterGroup;

    /**
    * Tag filter
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
     * Get Offset for query. 
     * @return Offset Offset for query.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset for query.
     * @param Offset Offset for query.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Query limit. 
     * @return Limit Query limit.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Query limit.
     * @param Limit Query limit.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace. 
     * @return NamespaceId Namespace.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace.
     * @param NamespaceId Namespace.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Filter by topic type. Valid values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`. 
     * @return FilterType Filter by topic type. Valid values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`.
     */
    public String [] getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Filter by topic type. Valid values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`.
     * @param FilterType Filter by topic type. Valid values: `Normal`, `GlobalOrder`, `PartitionedOrder`, `Transaction`.
     */
    public void setFilterType(String [] FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Search by topic name. Fuzzy query is supported. 
     * @return FilterName Search by topic name. Fuzzy query is supported.
     */
    public String getFilterName() {
        return this.FilterName;
    }

    /**
     * Set Search by topic name. Fuzzy query is supported.
     * @param FilterName Search by topic name. Fuzzy query is supported.
     */
    public void setFilterName(String FilterName) {
        this.FilterName = FilterName;
    }

    /**
     * Get Filters by subscription consumer group name. 
     * @return FilterGroup Filters by subscription consumer group name.
     */
    public String getFilterGroup() {
        return this.FilterGroup;
    }

    /**
     * Set Filters by subscription consumer group name.
     * @param FilterGroup Filters by subscription consumer group name.
     */
    public void setFilterGroup(String FilterGroup) {
        this.FilterGroup = FilterGroup;
    }

    /**
     * Get Tag filter 
     * @return TagFilters Tag filter
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter
     * @param TagFilters Tag filter
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeRocketMQTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopicsRequest(DescribeRocketMQTopicsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.FilterType != null) {
            this.FilterType = new String[source.FilterType.length];
            for (int i = 0; i < source.FilterType.length; i++) {
                this.FilterType[i] = new String(source.FilterType[i]);
            }
        }
        if (source.FilterName != null) {
            this.FilterName = new String(source.FilterName);
        }
        if (source.FilterGroup != null) {
            this.FilterGroup = new String(source.FilterGroup);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamArraySimple(map, prefix + "FilterType.", this.FilterType);
        this.setParamSimple(map, prefix + "FilterName", this.FilterName);
        this.setParamSimple(map, prefix + "FilterGroup", this.FilterGroup);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

