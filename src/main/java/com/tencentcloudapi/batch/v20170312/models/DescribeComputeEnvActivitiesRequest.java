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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvActivitiesRequest extends AbstractModel {

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of returned items
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter
<li> `compute-node-id` - String - Optional - Filter by the compute node ID.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of returned items 
     * @return Limit Maximum number of returned items
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned items
     * @param Limit Maximum number of returned items
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter
<li> `compute-node-id` - String - Optional - Filter by the compute node ID.</li> 
     * @return Filters Filter
<li> `compute-node-id` - String - Optional - Filter by the compute node ID.</li>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li> `compute-node-id` - String - Optional - Filter by the compute node ID.</li>
     * @param Filters Filter
<li> `compute-node-id` - String - Optional - Filter by the compute node ID.</li>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    public DescribeComputeEnvActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComputeEnvActivitiesRequest(DescribeComputeEnvActivitiesRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

