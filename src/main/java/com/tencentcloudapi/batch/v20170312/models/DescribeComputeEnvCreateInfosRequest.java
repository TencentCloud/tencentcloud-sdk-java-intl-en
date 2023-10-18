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

public class DescribeComputeEnvCreateInfosRequest extends AbstractModel {

    /**
    * List of compute environment IDs, which cannot be specified together with the `Filters` parameter.
    */
    @SerializedName("EnvIds")
    @Expose
    private String [] EnvIds;

    /**
    * Filter conditions
<li> `zone` - String - Optional - Filter by the availability zone.</li>
<li> `env-id` - String - Optional - Filter by the compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by the compute environment name.</li>
It cannot be specified together with `EnvIds`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get List of compute environment IDs, which cannot be specified together with the `Filters` parameter. 
     * @return EnvIds List of compute environment IDs, which cannot be specified together with the `Filters` parameter.
     */
    public String [] getEnvIds() {
        return this.EnvIds;
    }

    /**
     * Set List of compute environment IDs, which cannot be specified together with the `Filters` parameter.
     * @param EnvIds List of compute environment IDs, which cannot be specified together with the `Filters` parameter.
     */
    public void setEnvIds(String [] EnvIds) {
        this.EnvIds = EnvIds;
    }

    /**
     * Get Filter conditions
<li> `zone` - String - Optional - Filter by the availability zone.</li>
<li> `env-id` - String - Optional - Filter by the compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by the compute environment name.</li>
It cannot be specified together with `EnvIds`. 
     * @return Filters Filter conditions
<li> `zone` - String - Optional - Filter by the availability zone.</li>
<li> `env-id` - String - Optional - Filter by the compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by the compute environment name.</li>
It cannot be specified together with `EnvIds`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions
<li> `zone` - String - Optional - Filter by the availability zone.</li>
<li> `env-id` - String - Optional - Filter by the compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by the compute environment name.</li>
It cannot be specified together with `EnvIds`.
     * @param Filters Filter conditions
<li> `zone` - String - Optional - Filter by the availability zone.</li>
<li> `env-id` - String - Optional - Filter by the compute environment ID.</li>
<li> `env-name` - String - Optional - Filter by the compute environment name.</li>
It cannot be specified together with `EnvIds`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    public DescribeComputeEnvCreateInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComputeEnvCreateInfosRequest(DescribeComputeEnvCreateInfosRequest source) {
        if (source.EnvIds != null) {
            this.EnvIds = new String[source.EnvIds.length];
            for (int i = 0; i < source.EnvIds.length; i++) {
                this.EnvIds[i] = new String(source.EnvIds[i]);
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
        this.setParamArraySimple(map, prefix + "EnvIds.", this.EnvIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

