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

public class DescribeProxyGroupListRequest extends AbstractModel {

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. The default value is 20. The maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Project ID. Value range:
-1: all projects of this user
0: default project
Other values: specified project
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Filter condition   
Each request can have a maximum of 5 filter conditions for `Filter.Values`.
`RealServerRegion` - String - Required: No - Filter by origin server region. You can also check the value of `RegionId` returned by the `DescribeDestRegions` API.
`PackageType` - String - Required: No - Filter by type of connection groups, which can be `Thunder` (general connection group) or `Accelerator` (silver connection group).
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connection groups tagged any of them will be pulled.
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. The default value is 20. The maximum value is 100. 
     * @return Limit Number of returned results. The default value is 20. The maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. The default value is 20. The maximum value is 100.
     * @param Limit Number of returned results. The default value is 20. The maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Project ID. Value range:
-1: all projects of this user
0: default project
Other values: specified project 
     * @return ProjectId Project ID. Value range:
-1: all projects of this user
0: default project
Other values: specified project
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Value range:
-1: all projects of this user
0: default project
Other values: specified project
     * @param ProjectId Project ID. Value range:
-1: all projects of this user
0: default project
Other values: specified project
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Filter condition   
Each request can have a maximum of 5 filter conditions for `Filter.Values`.
`RealServerRegion` - String - Required: No - Filter by origin server region. You can also check the value of `RegionId` returned by the `DescribeDestRegions` API.
`PackageType` - String - Required: No - Filter by type of connection groups, which can be `Thunder` (general connection group) or `Accelerator` (silver connection group). 
     * @return Filters Filter condition   
Each request can have a maximum of 5 filter conditions for `Filter.Values`.
`RealServerRegion` - String - Required: No - Filter by origin server region. You can also check the value of `RegionId` returned by the `DescribeDestRegions` API.
`PackageType` - String - Required: No - Filter by type of connection groups, which can be `Thunder` (general connection group) or `Accelerator` (silver connection group).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition   
Each request can have a maximum of 5 filter conditions for `Filter.Values`.
`RealServerRegion` - String - Required: No - Filter by origin server region. You can also check the value of `RegionId` returned by the `DescribeDestRegions` API.
`PackageType` - String - Required: No - Filter by type of connection groups, which can be `Thunder` (general connection group) or `Accelerator` (silver connection group).
     * @param Filters Filter condition   
Each request can have a maximum of 5 filter conditions for `Filter.Values`.
`RealServerRegion` - String - Required: No - Filter by origin server region. You can also check the value of `RegionId` returned by the `DescribeDestRegions` API.
`PackageType` - String - Required: No - Filter by type of connection groups, which can be `Thunder` (general connection group) or `Accelerator` (silver connection group).
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connection groups tagged any of them will be pulled. 
     * @return TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connection groups tagged any of them will be pulled.
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connection groups tagged any of them will be pulled.
     * @param TagSet Tag list. If this field exists, the list of the resources with the tag will be pulled.
It supports up to 5 tags. If there are two or more tags, the connection groups tagged any of them will be pulled.
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    public DescribeProxyGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyGroupListRequest(DescribeProxyGroupListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

