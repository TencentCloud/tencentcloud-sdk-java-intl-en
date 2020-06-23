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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackagesRequest extends AbstractModel{

    /**
    * The bandwidth package ID. Batch operation is supported.
    */
    @SerializedName("BandwidthPackageIds")
    @Expose
    private String [] BandwidthPackageIds;

    /**
    * The upper limit for `Filters` in each request is 10. `BandwidthPackageIds` and `Filters` cannot be specified at the same time. The specific filtering conditions are as follows:
<li> bandwidth-package_id - String - Required: No - (Filter condition) Filter by the unique ID of the bandwidth package.</li>
<li> bandwidth-package-name - String - Required: No - (Filter condition) Filter by the bandwidth package name. Fuzzy filtering is not supported.</li>
<li> network-type - String - Required: No - (Filter condition) Filter by the bandwidth package type. Types include 'BGP', 'SINGLEISP', and 'ANYCAST'.</li>
<li> charge-type - String - Required: No - (Filter condition) Filter by the bandwidth package billing type. Billing types include 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - Required: No - (Filter condition) Filter by the bandwidth package resource type. Resource types include 'Address' and 'LoadBalance'</li>
<li> resource.resource-id - String - Required: No - (Filter condition) Filter by the bandwidth package resource ID, such as 'eip-xxxx', 'lb-xxxx'</li>
<li> resource.address-ip - String - Required: No - (Filter condition) Filter by the bandwidth package resource IP.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Queries bandwidth package offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Queries the limit on the number of bandwidth packages
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The bandwidth package ID. Batch operation is supported. 
     * @return BandwidthPackageIds The bandwidth package ID. Batch operation is supported.
     */
    public String [] getBandwidthPackageIds() {
        return this.BandwidthPackageIds;
    }

    /**
     * Set The bandwidth package ID. Batch operation is supported.
     * @param BandwidthPackageIds The bandwidth package ID. Batch operation is supported.
     */
    public void setBandwidthPackageIds(String [] BandwidthPackageIds) {
        this.BandwidthPackageIds = BandwidthPackageIds;
    }

    /**
     * Get The upper limit for `Filters` in each request is 10. `BandwidthPackageIds` and `Filters` cannot be specified at the same time. The specific filtering conditions are as follows:
<li> bandwidth-package_id - String - Required: No - (Filter condition) Filter by the unique ID of the bandwidth package.</li>
<li> bandwidth-package-name - String - Required: No - (Filter condition) Filter by the bandwidth package name. Fuzzy filtering is not supported.</li>
<li> network-type - String - Required: No - (Filter condition) Filter by the bandwidth package type. Types include 'BGP', 'SINGLEISP', and 'ANYCAST'.</li>
<li> charge-type - String - Required: No - (Filter condition) Filter by the bandwidth package billing type. Billing types include 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - Required: No - (Filter condition) Filter by the bandwidth package resource type. Resource types include 'Address' and 'LoadBalance'</li>
<li> resource.resource-id - String - Required: No - (Filter condition) Filter by the bandwidth package resource ID, such as 'eip-xxxx', 'lb-xxxx'</li>
<li> resource.address-ip - String - Required: No - (Filter condition) Filter by the bandwidth package resource IP.</li> 
     * @return Filters The upper limit for `Filters` in each request is 10. `BandwidthPackageIds` and `Filters` cannot be specified at the same time. The specific filtering conditions are as follows:
<li> bandwidth-package_id - String - Required: No - (Filter condition) Filter by the unique ID of the bandwidth package.</li>
<li> bandwidth-package-name - String - Required: No - (Filter condition) Filter by the bandwidth package name. Fuzzy filtering is not supported.</li>
<li> network-type - String - Required: No - (Filter condition) Filter by the bandwidth package type. Types include 'BGP', 'SINGLEISP', and 'ANYCAST'.</li>
<li> charge-type - String - Required: No - (Filter condition) Filter by the bandwidth package billing type. Billing types include 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - Required: No - (Filter condition) Filter by the bandwidth package resource type. Resource types include 'Address' and 'LoadBalance'</li>
<li> resource.resource-id - String - Required: No - (Filter condition) Filter by the bandwidth package resource ID, such as 'eip-xxxx', 'lb-xxxx'</li>
<li> resource.address-ip - String - Required: No - (Filter condition) Filter by the bandwidth package resource IP.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The upper limit for `Filters` in each request is 10. `BandwidthPackageIds` and `Filters` cannot be specified at the same time. The specific filtering conditions are as follows:
<li> bandwidth-package_id - String - Required: No - (Filter condition) Filter by the unique ID of the bandwidth package.</li>
<li> bandwidth-package-name - String - Required: No - (Filter condition) Filter by the bandwidth package name. Fuzzy filtering is not supported.</li>
<li> network-type - String - Required: No - (Filter condition) Filter by the bandwidth package type. Types include 'BGP', 'SINGLEISP', and 'ANYCAST'.</li>
<li> charge-type - String - Required: No - (Filter condition) Filter by the bandwidth package billing type. Billing types include 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - Required: No - (Filter condition) Filter by the bandwidth package resource type. Resource types include 'Address' and 'LoadBalance'</li>
<li> resource.resource-id - String - Required: No - (Filter condition) Filter by the bandwidth package resource ID, such as 'eip-xxxx', 'lb-xxxx'</li>
<li> resource.address-ip - String - Required: No - (Filter condition) Filter by the bandwidth package resource IP.</li>
     * @param Filters The upper limit for `Filters` in each request is 10. `BandwidthPackageIds` and `Filters` cannot be specified at the same time. The specific filtering conditions are as follows:
<li> bandwidth-package_id - String - Required: No - (Filter condition) Filter by the unique ID of the bandwidth package.</li>
<li> bandwidth-package-name - String - Required: No - (Filter condition) Filter by the bandwidth package name. Fuzzy filtering is not supported.</li>
<li> network-type - String - Required: No - (Filter condition) Filter by the bandwidth package type. Types include 'BGP', 'SINGLEISP', and 'ANYCAST'.</li>
<li> charge-type - String - Required: No - (Filter condition) Filter by the bandwidth package billing type. Billing types include 'TOP5_POSTPAID_BY_MONTH' and 'PERCENT95_POSTPAID_BY_MONTH'</li>
<li> resource.resource-type - String - Required: No - (Filter condition) Filter by the bandwidth package resource type. Resource types include 'Address' and 'LoadBalance'</li>
<li> resource.resource-id - String - Required: No - (Filter condition) Filter by the bandwidth package resource ID, such as 'eip-xxxx', 'lb-xxxx'</li>
<li> resource.address-ip - String - Required: No - (Filter condition) Filter by the bandwidth package resource IP.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Queries bandwidth package offset 
     * @return Offset Queries bandwidth package offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Queries bandwidth package offset
     * @param Offset Queries bandwidth package offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Queries the limit on the number of bandwidth packages 
     * @return Limit Queries the limit on the number of bandwidth packages
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Queries the limit on the number of bandwidth packages
     * @param Limit Queries the limit on the number of bandwidth packages
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BandwidthPackageIds.", this.BandwidthPackageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

