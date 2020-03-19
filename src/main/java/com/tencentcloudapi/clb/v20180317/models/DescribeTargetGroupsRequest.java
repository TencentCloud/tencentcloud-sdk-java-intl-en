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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupsRequest extends AbstractModel{

    /**
    * Target group ID, which is exclusive of `Filters`.
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * Limit of the number of displayed results. Default value: 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting display offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter array, which is exclusive of `TargetGroupIds`. Valid values: TargetGroupVpcId, TargetGroupName
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Target group ID, which is exclusive of `Filters`. 
     * @return TargetGroupIds Target group ID, which is exclusive of `Filters`.
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set Target group ID, which is exclusive of `Filters`.
     * @param TargetGroupIds Target group ID, which is exclusive of `Filters`.
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get Limit of the number of displayed results. Default value: 20 
     * @return Limit Limit of the number of displayed results. Default value: 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit of the number of displayed results. Default value: 20
     * @param Limit Limit of the number of displayed results. Default value: 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting display offset 
     * @return Offset Starting display offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting display offset
     * @param Offset Starting display offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter array, which is exclusive of `TargetGroupIds`. Valid values: TargetGroupVpcId, TargetGroupName 
     * @return Filters Filter array, which is exclusive of `TargetGroupIds`. Valid values: TargetGroupVpcId, TargetGroupName
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter array, which is exclusive of `TargetGroupIds`. Valid values: TargetGroupVpcId, TargetGroupName
     * @param Filters Filter array, which is exclusive of `TargetGroupIds`. Valid values: TargetGroupVpcId, TargetGroupName
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

