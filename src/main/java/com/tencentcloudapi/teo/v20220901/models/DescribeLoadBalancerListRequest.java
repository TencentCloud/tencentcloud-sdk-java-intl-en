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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancerListRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Offset of paginated query. Default value: 0.		
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Paginated query limit. Default value: 20, maximum value: 100.	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter criteria. The maximum value of Filters.Values is 20. If this parameter is left empty, all LoadBalancer information under the current zone ID will be returned. The detailed filter criteria are as follows:
<li>InstanceName: Filter by LoadBalancer name.</li>
<li>InstanceId: Filter by LoadBalancer ID.</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Offset of paginated query. Default value: 0.		 
     * @return Offset Offset of paginated query. Default value: 0.		
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset of paginated query. Default value: 0.		
     * @param Offset Offset of paginated query. Default value: 0.		
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Paginated query limit. Default value: 20, maximum value: 100.	 
     * @return Limit Paginated query limit. Default value: 20, maximum value: 100.	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Paginated query limit. Default value: 20, maximum value: 100.	
     * @param Limit Paginated query limit. Default value: 20, maximum value: 100.	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter criteria. The maximum value of Filters.Values is 20. If this parameter is left empty, all LoadBalancer information under the current zone ID will be returned. The detailed filter criteria are as follows:
<li>InstanceName: Filter by LoadBalancer name.</li>
<li>InstanceId: Filter by LoadBalancer ID.</li>
 
     * @return Filters Filter criteria. The maximum value of Filters.Values is 20. If this parameter is left empty, all LoadBalancer information under the current zone ID will be returned. The detailed filter criteria are as follows:
<li>InstanceName: Filter by LoadBalancer name.</li>
<li>InstanceId: Filter by LoadBalancer ID.</li>

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. The maximum value of Filters.Values is 20. If this parameter is left empty, all LoadBalancer information under the current zone ID will be returned. The detailed filter criteria are as follows:
<li>InstanceName: Filter by LoadBalancer name.</li>
<li>InstanceId: Filter by LoadBalancer ID.</li>

     * @param Filters Filter criteria. The maximum value of Filters.Values is 20. If this parameter is left empty, all LoadBalancer information under the current zone ID will be returned. The detailed filter criteria are as follows:
<li>InstanceName: Filter by LoadBalancer name.</li>
<li>InstanceId: Filter by LoadBalancer ID.</li>

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoadBalancerListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancerListRequest(DescribeLoadBalancerListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

