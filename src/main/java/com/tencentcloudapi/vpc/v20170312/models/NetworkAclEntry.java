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

public class NetworkAclEntry extends AbstractModel {

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Protocol. Valid values: TCP, UDP, ICMP, ALL.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port. Valid values: all, single port, range. When Protocol takes the value `ALL` or `ICMP`, Port cannot be specified.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IP range or IP address (mutually exclusive).
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * CIDR block or IPv6 address (mutually exclusive).
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * ACCEPT or DROP.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule description, which is up to 100 bytes.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Protocol. Valid values: TCP, UDP, ICMP, ALL. 
     * @return Protocol Protocol. Valid values: TCP, UDP, ICMP, ALL.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: TCP, UDP, ICMP, ALL.
     * @param Protocol Protocol. Valid values: TCP, UDP, ICMP, ALL.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port. Valid values: all, single port, range. When Protocol takes the value `ALL` or `ICMP`, Port cannot be specified. 
     * @return Port Port. Valid values: all, single port, range. When Protocol takes the value `ALL` or `ICMP`, Port cannot be specified.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port. Valid values: all, single port, range. When Protocol takes the value `ALL` or `ICMP`, Port cannot be specified.
     * @param Port Port. Valid values: all, single port, range. When Protocol takes the value `ALL` or `ICMP`, Port cannot be specified.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IP range or IP address (mutually exclusive). 
     * @return CidrBlock IP range or IP address (mutually exclusive).
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set IP range or IP address (mutually exclusive).
     * @param CidrBlock IP range or IP address (mutually exclusive).
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get CIDR block or IPv6 address (mutually exclusive). 
     * @return Ipv6CidrBlock CIDR block or IPv6 address (mutually exclusive).
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set CIDR block or IPv6 address (mutually exclusive).
     * @param Ipv6CidrBlock CIDR block or IPv6 address (mutually exclusive).
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get ACCEPT or DROP. 
     * @return Action ACCEPT or DROP.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set ACCEPT or DROP.
     * @param Action ACCEPT or DROP.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Rule description, which is up to 100 bytes. 
     * @return Description Rule description, which is up to 100 bytes.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description, which is up to 100 bytes.
     * @param Description Rule description, which is up to 100 bytes.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public NetworkAclEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAclEntry(NetworkAclEntry source) {
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

