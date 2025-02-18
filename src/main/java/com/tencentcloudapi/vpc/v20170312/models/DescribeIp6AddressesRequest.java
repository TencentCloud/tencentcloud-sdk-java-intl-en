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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIp6AddressesRequest extends AbstractModel {

    /**
    * List of unique IDs that identify IPv6 instances. The unique ID of an IPv6 instance is in the format of `eip-11112222`. Parameters `Ip6AddressIds` and `Filters` cannot be specified at the same time.
    */
    @SerializedName("Ip6AddressIds")
    @Expose
    private String [] Ip6AddressIds;

    /**
    * Each request can have up to 10 `Filters` values and 100 `Filter.Values` values. Parameters `AddressIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li>address-ip - String - Required: No - (Filter condition) Filter by the IP address of IPv6 instances.</li>
<li>network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of ENIs.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get List of unique IDs that identify IPv6 instances. The unique ID of an IPv6 instance is in the format of `eip-11112222`. Parameters `Ip6AddressIds` and `Filters` cannot be specified at the same time. 
     * @return Ip6AddressIds List of unique IDs that identify IPv6 instances. The unique ID of an IPv6 instance is in the format of `eip-11112222`. Parameters `Ip6AddressIds` and `Filters` cannot be specified at the same time.
     */
    public String [] getIp6AddressIds() {
        return this.Ip6AddressIds;
    }

    /**
     * Set List of unique IDs that identify IPv6 instances. The unique ID of an IPv6 instance is in the format of `eip-11112222`. Parameters `Ip6AddressIds` and `Filters` cannot be specified at the same time.
     * @param Ip6AddressIds List of unique IDs that identify IPv6 instances. The unique ID of an IPv6 instance is in the format of `eip-11112222`. Parameters `Ip6AddressIds` and `Filters` cannot be specified at the same time.
     */
    public void setIp6AddressIds(String [] Ip6AddressIds) {
        this.Ip6AddressIds = Ip6AddressIds;
    }

    /**
     * Get Each request can have up to 10 `Filters` values and 100 `Filter.Values` values. Parameters `AddressIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li>address-ip - String - Required: No - (Filter condition) Filter by the IP address of IPv6 instances.</li>
<li>network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of ENIs.</li> 
     * @return Filters Each request can have up to 10 `Filters` values and 100 `Filter.Values` values. Parameters `AddressIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li>address-ip - String - Required: No - (Filter condition) Filter by the IP address of IPv6 instances.</li>
<li>network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of ENIs.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Each request can have up to 10 `Filters` values and 100 `Filter.Values` values. Parameters `AddressIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li>address-ip - String - Required: No - (Filter condition) Filter by the IP address of IPv6 instances.</li>
<li>network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of ENIs.</li>
     * @param Filters Each request can have up to 10 `Filters` values and 100 `Filter.Values` values. Parameters `AddressIds` and `Filters` cannot be specified at the same time. The specific filter conditions are as follows:
<li>address-ip - String - Required: No - (Filter condition) Filter by the IP address of IPv6 instances.</li>
<li>network-interface-id - String - Required: No - (Filter condition) Filter by the unique ID of ENIs.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/11646?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIp6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIp6AddressesRequest(DescribeIp6AddressesRequest source) {
        if (source.Ip6AddressIds != null) {
            this.Ip6AddressIds = new String[source.Ip6AddressIds.length];
            for (int i = 0; i < source.Ip6AddressIds.length; i++) {
                this.Ip6AddressIds[i] = new String(source.Ip6AddressIds[i]);
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
        this.setParamArraySimple(map, prefix + "Ip6AddressIds.", this.Ip6AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

