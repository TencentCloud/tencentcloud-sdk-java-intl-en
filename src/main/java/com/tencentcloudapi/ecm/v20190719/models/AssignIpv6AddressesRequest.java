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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6AddressesRequest extends AbstractModel {

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * ENI instance ID, such as `eni-1snva0vd`. Currently, only the primary ENI will be assigned the ID.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * List of specified IPv6 addresses. You can specify up to 10 IPv6 addresses at a time. The quota is calculated together with that of `Ipv6AddressCount`, a required input parameter alternative to this one.
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * Number of automatically assigned IPv6 addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with that of `Ipv6Addresses`, a required input parameter alternative to this one.
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * Ipv6 ISP. Valid values:
`CTCC`: China Telecom
`CUCC`: China Unicom
`CMCC`: China Mobile
    */
    @SerializedName("Ipv6ISP")
    @Expose
    private String Ipv6ISP;

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get ENI instance ID, such as `eni-1snva0vd`. Currently, only the primary ENI will be assigned the ID. 
     * @return NetworkInterfaceId ENI instance ID, such as `eni-1snva0vd`. Currently, only the primary ENI will be assigned the ID.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ENI instance ID, such as `eni-1snva0vd`. Currently, only the primary ENI will be assigned the ID.
     * @param NetworkInterfaceId ENI instance ID, such as `eni-1snva0vd`. Currently, only the primary ENI will be assigned the ID.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get List of specified IPv6 addresses. You can specify up to 10 IPv6 addresses at a time. The quota is calculated together with that of `Ipv6AddressCount`, a required input parameter alternative to this one. 
     * @return Ipv6Addresses List of specified IPv6 addresses. You can specify up to 10 IPv6 addresses at a time. The quota is calculated together with that of `Ipv6AddressCount`, a required input parameter alternative to this one.
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set List of specified IPv6 addresses. You can specify up to 10 IPv6 addresses at a time. The quota is calculated together with that of `Ipv6AddressCount`, a required input parameter alternative to this one.
     * @param Ipv6Addresses List of specified IPv6 addresses. You can specify up to 10 IPv6 addresses at a time. The quota is calculated together with that of `Ipv6AddressCount`, a required input parameter alternative to this one.
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get Number of automatically assigned IPv6 addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with that of `Ipv6Addresses`, a required input parameter alternative to this one. 
     * @return Ipv6AddressCount Number of automatically assigned IPv6 addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with that of `Ipv6Addresses`, a required input parameter alternative to this one.
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set Number of automatically assigned IPv6 addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with that of `Ipv6Addresses`, a required input parameter alternative to this one.
     * @param Ipv6AddressCount Number of automatically assigned IPv6 addresses. The total number of private IP addresses cannot exceed the quota. The quota is calculated together with that of `Ipv6Addresses`, a required input parameter alternative to this one.
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get Ipv6 ISP. Valid values:
`CTCC`: China Telecom
`CUCC`: China Unicom
`CMCC`: China Mobile 
     * @return Ipv6ISP Ipv6 ISP. Valid values:
`CTCC`: China Telecom
`CUCC`: China Unicom
`CMCC`: China Mobile
     */
    public String getIpv6ISP() {
        return this.Ipv6ISP;
    }

    /**
     * Set Ipv6 ISP. Valid values:
`CTCC`: China Telecom
`CUCC`: China Unicom
`CMCC`: China Mobile
     * @param Ipv6ISP Ipv6 ISP. Valid values:
`CTCC`: China Telecom
`CUCC`: China Unicom
`CMCC`: China Mobile
     */
    public void setIpv6ISP(String Ipv6ISP) {
        this.Ipv6ISP = Ipv6ISP;
    }

    public AssignIpv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6AddressesRequest(AssignIpv6AddressesRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new Ipv6Address[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new Ipv6Address(source.Ipv6Addresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.Ipv6ISP != null) {
            this.Ipv6ISP = new String(source.Ipv6ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "Ipv6ISP", this.Ipv6ISP);

    }
}

