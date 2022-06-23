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

public class DisassociateNatGatewayAddressRequest extends AbstractModel{

    /**
    * The ID of the NAT gateway, such as `nat-df45454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Array of the EIPs to be unbound from the NAT gateway.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

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
     * Get Array of the EIPs to be unbound from the NAT gateway. 
     * @return PublicIpAddresses Array of the EIPs to be unbound from the NAT gateway.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set Array of the EIPs to be unbound from the NAT gateway.
     * @param PublicIpAddresses Array of the EIPs to be unbound from the NAT gateway.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    public DisassociateNatGatewayAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateNatGatewayAddressRequest(DisassociateNatGatewayAddressRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);

    }
}

