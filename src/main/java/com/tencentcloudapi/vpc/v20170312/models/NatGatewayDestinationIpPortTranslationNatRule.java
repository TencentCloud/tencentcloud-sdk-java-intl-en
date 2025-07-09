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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayDestinationIpPortTranslationNatRule extends AbstractModel {

    /**
    * Network protocol. Available choices: `TCP`, `UDP`.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * EIP.
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * Public port.
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * Private IP.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Private port.
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * NAT gateway forwarding rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * NAT gateway ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * VPC ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The creation time of the NAT gateway forwarding rule.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Network protocol. Available choices: `TCP`, `UDP`. 
     * @return IpProtocol Network protocol. Available choices: `TCP`, `UDP`.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol. Available choices: `TCP`, `UDP`.
     * @param IpProtocol Network protocol. Available choices: `TCP`, `UDP`.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get EIP. 
     * @return PublicIpAddress EIP.
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set EIP.
     * @param PublicIpAddress EIP.
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get Public port. 
     * @return PublicPort Public port.
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set Public port.
     * @param PublicPort Public port.
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get Private IP. 
     * @return PrivateIpAddress Private IP.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Private IP.
     * @param PrivateIpAddress Private IP.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Private port. 
     * @return PrivatePort Private port.
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set Private port.
     * @param PrivatePort Private port.
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get NAT gateway forwarding rule description. 
     * @return Description NAT gateway forwarding rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set NAT gateway forwarding rule description.
     * @param Description NAT gateway forwarding rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get NAT gateway ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return NatGatewayId NAT gateway ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT gateway ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param NatGatewayId NAT gateway ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get VPC ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return VpcId VPC ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param VpcId VPC ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The creation time of the NAT gateway forwarding rule.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreatedTime The creation time of the NAT gateway forwarding rule.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set The creation time of the NAT gateway forwarding rule.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreatedTime The creation time of the NAT gateway forwarding rule.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public NatGatewayDestinationIpPortTranslationNatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayDestinationIpPortTranslationNatRule(NatGatewayDestinationIpPortTranslationNatRule source) {
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PrivatePort != null) {
            this.PrivatePort = new Long(source.PrivatePort);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

