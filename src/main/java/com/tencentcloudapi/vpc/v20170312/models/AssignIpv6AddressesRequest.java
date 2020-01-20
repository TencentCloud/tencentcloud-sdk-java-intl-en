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

public class AssignIpv6AddressesRequest extends AbstractModel{

    /**
    * The `ID` of the ENI instance, such as `eni-m6dyj72l`.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * The specified `IPv6` address list. You can specify a maximum of 10 at one time. The quota is calculated together with the `Ipv6AddressCount` input parameter.
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * The number of automatically assigned `IPv6` addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with the `Ipv6Addresses` input parameter.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
     * Get The `ID` of the ENI instance, such as `eni-m6dyj72l`. 
     * @return NetworkInterfaceId The `ID` of the ENI instance, such as `eni-m6dyj72l`.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set The `ID` of the ENI instance, such as `eni-m6dyj72l`.
     * @param NetworkInterfaceId The `ID` of the ENI instance, such as `eni-m6dyj72l`.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get The specified `IPv6` address list. You can specify a maximum of 10 at one time. The quota is calculated together with the `Ipv6AddressCount` input parameter. 
     * @return Ipv6Addresses The specified `IPv6` address list. You can specify a maximum of 10 at one time. The quota is calculated together with the `Ipv6AddressCount` input parameter.
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set The specified `IPv6` address list. You can specify a maximum of 10 at one time. The quota is calculated together with the `Ipv6AddressCount` input parameter.
     * @param Ipv6Addresses The specified `IPv6` address list. You can specify a maximum of 10 at one time. The quota is calculated together with the `Ipv6AddressCount` input parameter.
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get The number of automatically assigned `IPv6` addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with the `Ipv6Addresses` input parameter. 
     * @return Ipv6AddressCount The number of automatically assigned `IPv6` addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with the `Ipv6Addresses` input parameter.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set The number of automatically assigned `IPv6` addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with the `Ipv6Addresses` input parameter.
     * @param Ipv6AddressCount The number of automatically assigned `IPv6` addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with the `Ipv6Addresses` input parameter.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

