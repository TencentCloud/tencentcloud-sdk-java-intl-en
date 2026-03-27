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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicy extends AbstractModel {

    /**
    * Policy, ACCEPT or DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Destination IP or IP range, for example 172.16.0.0/12
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * port or port range
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * Network protocol supports UDP, TCP, etc.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * Rule direction, OUTPUT - Outbound Rules, INPUT - Inbound Rules
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
     * Get Policy, ACCEPT or DROP 
     * @return Action Policy, ACCEPT or DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy, ACCEPT or DROP
     * @param Action Policy, ACCEPT or DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Destination IP or IP range, for example 172.16.0.0/12 
     * @return CidrIp Destination IP or IP range, for example 172.16.0.0/12
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set Destination IP or IP range, for example 172.16.0.0/12
     * @param CidrIp Destination IP or IP range, for example 172.16.0.0/12
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get port or port range 
     * @return PortRange port or port range
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set port or port range
     * @param PortRange port or port range
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Network protocol supports UDP, TCP, etc. 
     * @return IpProtocol Network protocol supports UDP, TCP, etc.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol supports UDP, TCP, etc.
     * @param IpProtocol Network protocol supports UDP, TCP, etc.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get Rule direction, OUTPUT - Outbound Rules, INPUT - Inbound Rules 
     * @return Dir Rule direction, OUTPUT - Outbound Rules, INPUT - Inbound Rules
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set Rule direction, OUTPUT - Outbound Rules, INPUT - Inbound Rules
     * @param Dir Rule direction, OUTPUT - Outbound Rules, INPUT - Inbound Rules
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public SecurityGroupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicy(SecurityGroupPolicy source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CidrIp != null) {
            this.CidrIp = new String(source.CidrIp);
        }
        if (source.PortRange != null) {
            this.PortRange = new String(source.PortRange);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}

