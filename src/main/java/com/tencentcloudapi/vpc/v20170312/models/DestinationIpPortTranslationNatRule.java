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

public class DestinationIpPortTranslationNatRule extends AbstractModel{

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
    * Private network address.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Private network port.
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
     * Get Private network address. 
     * @return PrivateIpAddress Private network address.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Private network address.
     * @param PrivateIpAddress Private network address.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Private network port. 
     * @return PrivatePort Private network port.
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set Private network port.
     * @param PrivatePort Private network port.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

