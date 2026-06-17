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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupListRequest extends AbstractModel {

    /**
    * <p>Target group ID array.</p>
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * <p>Filter condition array. Support TargetGroupVpcId and TargetGroupName. Mutually exclusive with TargetGroupIds. Prioritize target group ID.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Starting display offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of entries displayed per page.</p><p>Value ranges from 0 to 100.</p><p>The default value is 20.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Target group ID array.</p> 
     * @return TargetGroupIds <p>Target group ID array.</p>
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set <p>Target group ID array.</p>
     * @param TargetGroupIds <p>Target group ID array.</p>
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get <p>Filter condition array. Support TargetGroupVpcId and TargetGroupName. Mutually exclusive with TargetGroupIds. Prioritize target group ID.</p> 
     * @return Filters <p>Filter condition array. Support TargetGroupVpcId and TargetGroupName. Mutually exclusive with TargetGroupIds. Prioritize target group ID.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter condition array. Support TargetGroupVpcId and TargetGroupName. Mutually exclusive with TargetGroupIds. Prioritize target group ID.</p>
     * @param Filters <p>Filter condition array. Support TargetGroupVpcId and TargetGroupName. Mutually exclusive with TargetGroupIds. Prioritize target group ID.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Starting display offset.</p> 
     * @return Offset <p>Starting display offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Starting display offset.</p>
     * @param Offset <p>Starting display offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of entries displayed per page.</p><p>Value ranges from 0 to 100.</p><p>The default value is 20.</p> 
     * @return Limit <p>Number of entries displayed per page.</p><p>Value ranges from 0 to 100.</p><p>The default value is 20.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of entries displayed per page.</p><p>Value ranges from 0 to 100.</p><p>The default value is 20.</p>
     * @param Limit <p>Number of entries displayed per page.</p><p>Value ranges from 0 to 100.</p><p>The default value is 20.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTargetGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupListRequest(DescribeTargetGroupListRequest source) {
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

