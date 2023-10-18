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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServersRequest extends AbstractModel {

    /**
    * Queries the project ID to which the origin server belongs. -1: all projects.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Origin server IP or domain name to be queried. The fuzzy match is supported.
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity of values to return. The default value is 20 and the maximum value is 50.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the origin servers tagged any of them will be pulled.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * Filter conditions. The value of the `name` of the `filter` (RealServerName, RealServerIP)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Queries the project ID to which the origin server belongs. -1: all projects. 
     * @return ProjectId Queries the project ID to which the origin server belongs. -1: all projects.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Queries the project ID to which the origin server belongs. -1: all projects.
     * @param ProjectId Queries the project ID to which the origin server belongs. -1: all projects.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Origin server IP or domain name to be queried. The fuzzy match is supported. 
     * @return SearchValue Origin server IP or domain name to be queried. The fuzzy match is supported.
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set Origin server IP or domain name to be queried. The fuzzy match is supported.
     * @param SearchValue Origin server IP or domain name to be queried. The fuzzy match is supported.
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity of values to return. The default value is 20 and the maximum value is 50. 
     * @return Limit Quantity of values to return. The default value is 20 and the maximum value is 50.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of values to return. The default value is 20 and the maximum value is 50.
     * @param Limit Quantity of values to return. The default value is 20 and the maximum value is 50.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the origin servers tagged any of them will be pulled. 
     * @return TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the origin servers tagged any of them will be pulled.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the origin servers tagged any of them will be pulled.
     * @param TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the origin servers tagged any of them will be pulled.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Filter conditions. The value of the `name` of the `filter` (RealServerName, RealServerIP) 
     * @return Filters Filter conditions. The value of the `name` of the `filter` (RealServerName, RealServerIP)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. The value of the `name` of the `filter` (RealServerName, RealServerIP)
     * @param Filters Filter conditions. The value of the `name` of the `filter` (RealServerName, RealServerIP)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRealServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServersRequest(DescribeRealServersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

