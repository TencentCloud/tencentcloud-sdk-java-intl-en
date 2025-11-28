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
    * Specifies the conditions for querying the availability zone resource list. detailed filter criteria are as follows:.
- master-zone
Filters by regional availability zone, for example: ap-guangzhou-2.
Type: String.
Required: No
- ip-version
Filter by [IP type], such as IPv4.
Type: String.
Required: No
Valid values: IPv4, IPv6, IPv6_Nat.
- isp
Filters by [ISP type], for example: BGP.
Type: String.
Required: No
Optional. valid values: BGP, CMCC (china mobile), CUCC (china unicom), CTCC (china telecom), BGP_PRO, INTERNAL (private network).
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
     * Get Specifies the conditions for querying the availability zone resource list. detailed filter criteria are as follows:.
- master-zone
Filters by regional availability zone, for example: ap-guangzhou-2.
Type: String.
Required: No
- ip-version
Filter by [IP type], such as IPv4.
Type: String.
Required: No
Valid values: IPv4, IPv6, IPv6_Nat.
- isp
Filters by [ISP type], for example: BGP.
Type: String.
Required: No
Optional. valid values: BGP, CMCC (china mobile), CUCC (china unicom), CTCC (china telecom), BGP_PRO, INTERNAL (private network). 
     * @return Filters Specifies the conditions for querying the availability zone resource list. detailed filter criteria are as follows:.
- master-zone
Filters by regional availability zone, for example: ap-guangzhou-2.
Type: String.
Required: No
- ip-version
Filter by [IP type], such as IPv4.
Type: String.
Required: No
Valid values: IPv4, IPv6, IPv6_Nat.
- isp
Filters by [ISP type], for example: BGP.
Type: String.
Required: No
Optional. valid values: BGP, CMCC (china mobile), CUCC (china unicom), CTCC (china telecom), BGP_PRO, INTERNAL (private network).
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Specifies the conditions for querying the availability zone resource list. detailed filter criteria are as follows:.
- master-zone
Filters by regional availability zone, for example: ap-guangzhou-2.
Type: String.
Required: No
- ip-version
Filter by [IP type], such as IPv4.
Type: String.
Required: No
Valid values: IPv4, IPv6, IPv6_Nat.
- isp
Filters by [ISP type], for example: BGP.
Type: String.
Required: No
Optional. valid values: BGP, CMCC (china mobile), CUCC (china unicom), CTCC (china telecom), BGP_PRO, INTERNAL (private network).
     * @param Filters Specifies the conditions for querying the availability zone resource list. detailed filter criteria are as follows:.
- master-zone
Filters by regional availability zone, for example: ap-guangzhou-2.
Type: String.
Required: No
- ip-version
Filter by [IP type], such as IPv4.
Type: String.
Required: No
Valid values: IPv4, IPv6, IPv6_Nat.
- isp
Filters by [ISP type], for example: BGP.
Type: String.
Required: No
Optional. valid values: BGP, CMCC (china mobile), CUCC (china unicom), CTCC (china telecom), BGP_PRO, INTERNAL (private network).
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

