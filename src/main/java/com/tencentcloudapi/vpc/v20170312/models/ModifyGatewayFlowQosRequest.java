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

public class ModifyGatewayFlowQosRequest extends AbstractModel{

    /**
    * Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Bandwidth limit value in Mbps. Valid values: >0: Set the limit to the specified value. 0: Block all traffic. -1: No bandwidth limit.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * CVM private IP addresses with limited bandwidth.
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

    /**
     * Get Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`. 
     * @return GatewayId Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     * @param GatewayId Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Bandwidth limit value in Mbps. Valid values: >0: Set the limit to the specified value. 0: Block all traffic. -1: No bandwidth limit. 
     * @return Bandwidth Bandwidth limit value in Mbps. Valid values: >0: Set the limit to the specified value. 0: Block all traffic. -1: No bandwidth limit.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth limit value in Mbps. Valid values: >0: Set the limit to the specified value. 0: Block all traffic. -1: No bandwidth limit.
     * @param Bandwidth Bandwidth limit value in Mbps. Valid values: >0: Set the limit to the specified value. 0: Block all traffic. -1: No bandwidth limit.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get CVM private IP addresses with limited bandwidth. 
     * @return IpAddresses CVM private IP addresses with limited bandwidth.
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set CVM private IP addresses with limited bandwidth.
     * @param IpAddresses CVM private IP addresses with limited bandwidth.
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
    }

    public ModifyGatewayFlowQosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGatewayFlowQosRequest(ModifyGatewayFlowQosRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpAddresses != null) {
            this.IpAddresses = new String[source.IpAddresses.length];
            for (int i = 0; i < source.IpAddresses.length; i++) {
                this.IpAddresses[i] = new String(source.IpAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);

    }
}

