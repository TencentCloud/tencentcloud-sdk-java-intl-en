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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CfwNatDnatRule extends AbstractModel {

    /**
    * Network protocol. Valid values: TCP or UDP.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * Elastic IP.
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
    * Private address.
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
    * The description of NAT firewall forwarding rules.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Network protocol. Valid values: TCP or UDP. 
     * @return IpProtocol Network protocol. Valid values: TCP or UDP.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol. Valid values: TCP or UDP.
     * @param IpProtocol Network protocol. Valid values: TCP or UDP.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get Elastic IP. 
     * @return PublicIpAddress Elastic IP.
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set Elastic IP.
     * @param PublicIpAddress Elastic IP.
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
     * Get Private address. 
     * @return PrivateIpAddress Private address.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Private address.
     * @param PrivateIpAddress Private address.
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
     * Get The description of NAT firewall forwarding rules. 
     * @return Description The description of NAT firewall forwarding rules.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The description of NAT firewall forwarding rules.
     * @param Description The description of NAT firewall forwarding rules.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CfwNatDnatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CfwNatDnatRule(CfwNatDnatRule source) {
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

