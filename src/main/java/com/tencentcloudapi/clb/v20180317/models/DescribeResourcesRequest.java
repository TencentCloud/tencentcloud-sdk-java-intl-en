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

public class DescribeResourcesRequest extends AbstractModel {

    /**
    * Number of returned AZ resources. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Starting offset of the returned AZ resource list. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Conditions for querying the list of availability zone resources. Detailed filter criteria are as follows:<li>master-zone -- String - Required: No - (Filter criterion) Filter by region type, such as ap-guangzhou-2.</li><li>ip-version -- String - Required: No - (Filter criterion) Filter by IP type. Valid values: IPv4, IPv6, IPv6_Nat.</li><li> isp -- String - Required: No - (Filter criterion) Filter by ISP type, such as BGP, CMCC, CUCC, and CTCC.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Number of returned AZ resources. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned AZ resources. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned AZ resources. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned AZ resources. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Starting offset of the returned AZ resource list. Default value: 0. 
     * @return Offset Starting offset of the returned AZ resource list. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the returned AZ resource list. Default value: 0.
     * @param Offset Starting offset of the returned AZ resource list. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Conditions for querying the list of availability zone resources. Detailed filter criteria are as follows:<li>master-zone -- String - Required: No - (Filter criterion) Filter by region type, such as ap-guangzhou-2.</li><li>ip-version -- String - Required: No - (Filter criterion) Filter by IP type. Valid values: IPv4, IPv6, IPv6_Nat.</li><li> isp -- String - Required: No - (Filter criterion) Filter by ISP type, such as BGP, CMCC, CUCC, and CTCC.</li> 
     * @return Filters Conditions for querying the list of availability zone resources. Detailed filter criteria are as follows:<li>master-zone -- String - Required: No - (Filter criterion) Filter by region type, such as ap-guangzhou-2.</li><li>ip-version -- String - Required: No - (Filter criterion) Filter by IP type. Valid values: IPv4, IPv6, IPv6_Nat.</li><li> isp -- String - Required: No - (Filter criterion) Filter by ISP type, such as BGP, CMCC, CUCC, and CTCC.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Conditions for querying the list of availability zone resources. Detailed filter criteria are as follows:<li>master-zone -- String - Required: No - (Filter criterion) Filter by region type, such as ap-guangzhou-2.</li><li>ip-version -- String - Required: No - (Filter criterion) Filter by IP type. Valid values: IPv4, IPv6, IPv6_Nat.</li><li> isp -- String - Required: No - (Filter criterion) Filter by ISP type, such as BGP, CMCC, CUCC, and CTCC.</li>
     * @param Filters Conditions for querying the list of availability zone resources. Detailed filter criteria are as follows:<li>master-zone -- String - Required: No - (Filter criterion) Filter by region type, such as ap-guangzhou-2.</li><li>ip-version -- String - Required: No - (Filter criterion) Filter by IP type. Valid values: IPv4, IPv6, IPv6_Nat.</li><li> isp -- String - Required: No - (Filter criterion) Filter by ISP type, such as BGP, CMCC, CUCC, and CTCC.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcesRequest(DescribeResourcesRequest source) {
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

