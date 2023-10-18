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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * List of instance IDs (if it is empty,
it indicates to get all instances under the current account)
    */
    @SerializedName("Registryids")
    @Expose
    private String [] Registryids;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filters
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Whether to get the instances in all regions. Default value: False.
    */
    @SerializedName("AllRegion")
    @Expose
    private Boolean AllRegion;

    /**
     * Get List of instance IDs (if it is empty,
it indicates to get all instances under the current account) 
     * @return Registryids List of instance IDs (if it is empty,
it indicates to get all instances under the current account)
     */
    public String [] getRegistryids() {
        return this.Registryids;
    }

    /**
     * Set List of instance IDs (if it is empty,
it indicates to get all instances under the current account)
     * @param Registryids List of instance IDs (if it is empty,
it indicates to get all instances under the current account)
     */
    public void setRegistryids(String [] Registryids) {
        this.Registryids = Registryids;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: 20. Maximum value: 100. 
     * @return Limit Maximum number of output entries. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: 20. Maximum value: 100.
     * @param Limit Maximum number of output entries. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filters 
     * @return Filters Filters
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
     * @param Filters Filters
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Whether to get the instances in all regions. Default value: False. 
     * @return AllRegion Whether to get the instances in all regions. Default value: False.
     */
    public Boolean getAllRegion() {
        return this.AllRegion;
    }

    /**
     * Set Whether to get the instances in all regions. Default value: False.
     * @param AllRegion Whether to get the instances in all regions. Default value: False.
     */
    public void setAllRegion(Boolean AllRegion) {
        this.AllRegion = AllRegion;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Registryids != null) {
            this.Registryids = new String[source.Registryids.length];
            for (int i = 0; i < source.Registryids.length; i++) {
                this.Registryids[i] = new String(source.Registryids[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.AllRegion != null) {
            this.AllRegion = new Boolean(source.AllRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Registryids.", this.Registryids);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "AllRegion", this.AllRegion);

    }
}

