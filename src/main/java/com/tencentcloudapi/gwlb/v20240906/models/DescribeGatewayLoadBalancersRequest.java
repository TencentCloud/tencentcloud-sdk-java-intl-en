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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayLoadBalancersRequest extends AbstractModel {

    /**
    * GWLB instance ID. Batch filtering is supported with a maximum of 20 instance IDs.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Number of GWLB instances returned in a batch, with a default value of 20 and a maximum value of 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset for returning the list of GWLB instances, with a default value of 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria for querying the CLB details list. For each request, the maximum value of Filters is 10, and the maximum value of Filter.Values is 100.Filter.Name and Filter.Values are both required. Detailed filter criteria are as follows:- name - String - required: No - (filter criteria) filter by GWLB instance name, such as "gwlb-xxxx".- VpcId - String - required: No - (filter criteria) filter by the VPC to which the GWLB instance belongs, such as "vpc-bhqk****".
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Search field, for fuzzy matching of name and VIP.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get GWLB instance ID. Batch filtering is supported with a maximum of 20 instance IDs. 
     * @return LoadBalancerIds GWLB instance ID. Batch filtering is supported with a maximum of 20 instance IDs.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set GWLB instance ID. Batch filtering is supported with a maximum of 20 instance IDs.
     * @param LoadBalancerIds GWLB instance ID. Batch filtering is supported with a maximum of 20 instance IDs.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Number of GWLB instances returned in a batch, with a default value of 20 and a maximum value of 100. 
     * @return Limit Number of GWLB instances returned in a batch, with a default value of 20 and a maximum value of 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of GWLB instances returned in a batch, with a default value of 20 and a maximum value of 100.
     * @param Limit Number of GWLB instances returned in a batch, with a default value of 20 and a maximum value of 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting offset for returning the list of GWLB instances, with a default value of 0. 
     * @return Offset Starting offset for returning the list of GWLB instances, with a default value of 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset for returning the list of GWLB instances, with a default value of 0.
     * @param Offset Starting offset for returning the list of GWLB instances, with a default value of 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria for querying the CLB details list. For each request, the maximum value of Filters is 10, and the maximum value of Filter.Values is 100.Filter.Name and Filter.Values are both required. Detailed filter criteria are as follows:- name - String - required: No - (filter criteria) filter by GWLB instance name, such as "gwlb-xxxx".- VpcId - String - required: No - (filter criteria) filter by the VPC to which the GWLB instance belongs, such as "vpc-bhqk****". 
     * @return Filters Filter criteria for querying the CLB details list. For each request, the maximum value of Filters is 10, and the maximum value of Filter.Values is 100.Filter.Name and Filter.Values are both required. Detailed filter criteria are as follows:- name - String - required: No - (filter criteria) filter by GWLB instance name, such as "gwlb-xxxx".- VpcId - String - required: No - (filter criteria) filter by the VPC to which the GWLB instance belongs, such as "vpc-bhqk****".
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria for querying the CLB details list. For each request, the maximum value of Filters is 10, and the maximum value of Filter.Values is 100.Filter.Name and Filter.Values are both required. Detailed filter criteria are as follows:- name - String - required: No - (filter criteria) filter by GWLB instance name, such as "gwlb-xxxx".- VpcId - String - required: No - (filter criteria) filter by the VPC to which the GWLB instance belongs, such as "vpc-bhqk****".
     * @param Filters Filter criteria for querying the CLB details list. For each request, the maximum value of Filters is 10, and the maximum value of Filter.Values is 100.Filter.Name and Filter.Values are both required. Detailed filter criteria are as follows:- name - String - required: No - (filter criteria) filter by GWLB instance name, such as "gwlb-xxxx".- VpcId - String - required: No - (filter criteria) filter by the VPC to which the GWLB instance belongs, such as "vpc-bhqk****".
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Search field, for fuzzy matching of name and VIP. 
     * @return SearchKey Search field, for fuzzy matching of name and VIP.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search field, for fuzzy matching of name and VIP.
     * @param SearchKey Search field, for fuzzy matching of name and VIP.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeGatewayLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayLoadBalancersRequest(DescribeGatewayLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
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
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

