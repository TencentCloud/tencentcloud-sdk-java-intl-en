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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Inbound extends AbstractModel {

    /**
    * Policy, which can be ACCEPT or DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Source IP or IP range, such as 192.168.0.0/16
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * Port
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * Network protocol. UDP and TCP are supported.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * The direction of the rule, which is INPUT for inbound rules
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * Address module
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * Rule description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Policy, which can be ACCEPT or DROP 
     * @return Action Policy, which can be ACCEPT or DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy, which can be ACCEPT or DROP
     * @param Action Policy, which can be ACCEPT or DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Source IP or IP range, such as 192.168.0.0/16 
     * @return CidrIp Source IP or IP range, such as 192.168.0.0/16
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set Source IP or IP range, such as 192.168.0.0/16
     * @param CidrIp Source IP or IP range, such as 192.168.0.0/16
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get Port 
     * @return PortRange Port
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Port
     * @param PortRange Port
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Network protocol. UDP and TCP are supported. 
     * @return IpProtocol Network protocol. UDP and TCP are supported.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol. UDP and TCP are supported.
     * @param IpProtocol Network protocol. UDP and TCP are supported.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get The direction of the rule, which is INPUT for inbound rules 
     * @return Dir The direction of the rule, which is INPUT for inbound rules
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set The direction of the rule, which is INPUT for inbound rules
     * @param Dir The direction of the rule, which is INPUT for inbound rules
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get Address module 
     * @return AddressModule Address module
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set Address module
     * @param AddressModule Address module
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get Rule description 
     * @return Desc Rule description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Rule description
     * @param Desc Rule description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Inbound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Inbound(Inbound source) {
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
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
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
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

