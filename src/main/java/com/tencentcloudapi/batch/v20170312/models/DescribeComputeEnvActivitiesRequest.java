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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvActivitiesRequest extends AbstractModel{

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
    * Number of returned results
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter
<li> compute-node-id - String - Required: No - (Filter) Filter by compute node ID.</li>
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
     * Get Number of returned results 
     * @return Limit Number of returned results
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results
     * @param Limit Number of returned results
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter
<li> compute-node-id - String - Required: No - (Filter) Filter by compute node ID.</li> 
     * @return Filters Filter
<li> compute-node-id - String - Required: No - (Filter) Filter by compute node ID.</li>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li> compute-node-id - String - Required: No - (Filter) Filter by compute node ID.</li>
     * @param Filters Filter
<li> compute-node-id - String - Required: No - (Filter) Filter by compute node ID.</li>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
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

