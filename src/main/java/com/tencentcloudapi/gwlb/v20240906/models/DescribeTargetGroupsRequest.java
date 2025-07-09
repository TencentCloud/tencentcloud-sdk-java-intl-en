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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsRequest extends AbstractModel {

    /**
    * Target group ID, which is mutually exclusive with Filters.
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * Limit on the number of displayed entries. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting display offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criterion array, which supports TargetGroupVpcId and TargetGroupName.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Target group ID, which is mutually exclusive with Filters. 
     * @return TargetGroupIds Target group ID, which is mutually exclusive with Filters.
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set Target group ID, which is mutually exclusive with Filters.
     * @param TargetGroupIds Target group ID, which is mutually exclusive with Filters.
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get Limit on the number of displayed entries. Default value: 20. 
     * @return Limit Limit on the number of displayed entries. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on the number of displayed entries. Default value: 20.
     * @param Limit Limit on the number of displayed entries. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting display offset. 
     * @return Offset Starting display offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting display offset.
     * @param Offset Starting display offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criterion array, which supports TargetGroupVpcId and TargetGroupName. 
     * @return Filters Filter criterion array, which supports TargetGroupVpcId and TargetGroupName.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criterion array, which supports TargetGroupVpcId and TargetGroupName.
     * @param Filters Filter criterion array, which supports TargetGroupVpcId and TargetGroupName.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTargetGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupsRequest(DescribeTargetGroupsRequest source) {
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

