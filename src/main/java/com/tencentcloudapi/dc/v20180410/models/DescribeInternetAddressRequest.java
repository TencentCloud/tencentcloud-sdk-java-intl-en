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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInternetAddressRequest extends AbstractModel{

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Filter conditions:
<li>AddrType, address type. Valid values: 0: BGP; 1: China Telecom; 2: China Mobile; 3: China Unicom</li>
<li>AddrProto, address protocol. Valid values: 0: IPv4; 1: IPv6</li>
<li>Status, address status. Valid values: 0: in use; 1: disabled; 2: returned</li>
<li>Subnet, public IP address array</li>
<InstanceIds>Public IP address ID array</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Filter conditions:
<li>AddrType, address type. Valid values: 0: BGP; 1: China Telecom; 2: China Mobile; 3: China Unicom</li>
<li>AddrProto, address protocol. Valid values: 0: IPv4; 1: IPv6</li>
<li>Status, address status. Valid values: 0: in use; 1: disabled; 2: returned</li>
<li>Subnet, public IP address array</li>
<InstanceIds>Public IP address ID array</li> 
     * @return Filters Filter conditions:
<li>AddrType, address type. Valid values: 0: BGP; 1: China Telecom; 2: China Mobile; 3: China Unicom</li>
<li>AddrProto, address protocol. Valid values: 0: IPv4; 1: IPv6</li>
<li>Status, address status. Valid values: 0: in use; 1: disabled; 2: returned</li>
<li>Subnet, public IP address array</li>
<InstanceIds>Public IP address ID array</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions:
<li>AddrType, address type. Valid values: 0: BGP; 1: China Telecom; 2: China Mobile; 3: China Unicom</li>
<li>AddrProto, address protocol. Valid values: 0: IPv4; 1: IPv6</li>
<li>Status, address status. Valid values: 0: in use; 1: disabled; 2: returned</li>
<li>Subnet, public IP address array</li>
<InstanceIds>Public IP address ID array</li>
     * @param Filters Filter conditions:
<li>AddrType, address type. Valid values: 0: BGP; 1: China Telecom; 2: China Mobile; 3: China Unicom</li>
<li>AddrProto, address protocol. Valid values: 0: IPv4; 1: IPv6</li>
<li>Status, address status. Valid values: 0: in use; 1: disabled; 2: returned</li>
<li>Subnet, public IP address array</li>
<InstanceIds>Public IP address ID array</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

