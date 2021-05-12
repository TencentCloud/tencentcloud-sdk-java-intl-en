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

public class AssociateNatGatewayAddressRequest extends AbstractModel{

    /**
    * The ID of the NAT gateway, such as `nat-df45454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The number of EIPs you want to apply for. The system will create the same number of EIPs as you require. Either `AddressCount` or `PublicAddresses` must be passed in.
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * Array of the EIPs bound to the NAT gateway. Either `AddressCount` or `PublicAddresses` must be passed in.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * The availability zone of the EIP, which is passed in when the EIP is automatically assigned.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get The ID of the NAT gateway, such as `nat-df45454`. 
     * @return NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The ID of the NAT gateway, such as `nat-df45454`.
     * @param NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get The number of EIPs you want to apply for. The system will create the same number of EIPs as you require. Either `AddressCount` or `PublicAddresses` must be passed in. 
     * @return AddressCount The number of EIPs you want to apply for. The system will create the same number of EIPs as you require. Either `AddressCount` or `PublicAddresses` must be passed in.
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set The number of EIPs you want to apply for. The system will create the same number of EIPs as you require. Either `AddressCount` or `PublicAddresses` must be passed in.
     * @param AddressCount The number of EIPs you want to apply for. The system will create the same number of EIPs as you require. Either `AddressCount` or `PublicAddresses` must be passed in.
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get Array of the EIPs bound to the NAT gateway. Either `AddressCount` or `PublicAddresses` must be passed in. 
     * @return PublicIpAddresses Array of the EIPs bound to the NAT gateway. Either `AddressCount` or `PublicAddresses` must be passed in.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Array of the EIPs bound to the NAT gateway. Either `AddressCount` or `PublicAddresses` must be passed in.
     * @param PublicIpAddresses Array of the EIPs bound to the NAT gateway. Either `AddressCount` or `PublicAddresses` must be passed in.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get The availability zone of the EIP, which is passed in when the EIP is automatically assigned. 
     * @return Zone The availability zone of the EIP, which is passed in when the EIP is automatically assigned.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone of the EIP, which is passed in when the EIP is automatically assigned.
     * @param Zone The availability zone of the EIP, which is passed in when the EIP is automatically assigned.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public AssociateNatGatewayAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateNatGatewayAddressRequest(AssociateNatGatewayAddressRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

