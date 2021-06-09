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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupBound extends AbstractModel{

    /**
    * Execution rule. Valid values: `ACCEPT`, `DROP`
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * IP range
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * Port range
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * Transport layer protocol. Valid values: `tcp`, `udp`, `ALL`
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * All the addresses that the security group ID represents
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * All the addresses that the address group ID represents
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * All the protocols and ports that the service group ID represents
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Execution rule. Valid values: `ACCEPT`, `DROP` 
     * @return Action Execution rule. Valid values: `ACCEPT`, `DROP`
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Execution rule. Valid values: `ACCEPT`, `DROP`
     * @param Action Execution rule. Valid values: `ACCEPT`, `DROP`
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get IP range 
     * @return CidrIp IP range
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set IP range
     * @param CidrIp IP range
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get Port range 
     * @return PortRange Port range
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Port range
     * @param PortRange Port range
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Transport layer protocol. Valid values: `tcp`, `udp`, `ALL` 
     * @return IpProtocol Transport layer protocol. Valid values: `tcp`, `udp`, `ALL`
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Transport layer protocol. Valid values: `tcp`, `udp`, `ALL`
     * @param IpProtocol Transport layer protocol. Valid values: `tcp`, `udp`, `ALL`
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get All the addresses that the security group ID represents 
     * @return Id All the addresses that the security group ID represents
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set All the addresses that the security group ID represents
     * @param Id All the addresses that the security group ID represents
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get All the addresses that the address group ID represents 
     * @return AddressModule All the addresses that the address group ID represents
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set All the addresses that the address group ID represents
     * @param AddressModule All the addresses that the address group ID represents
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get All the protocols and ports that the service group ID represents 
     * @return ServiceModule All the protocols and ports that the service group ID represents
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set All the protocols and ports that the service group ID represents
     * @param ServiceModule All the protocols and ports that the service group ID represents
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public SecurityGroupBound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupBound(SecurityGroupBound source) {
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.ServiceModule != null) {
            this.ServiceModule = new String(source.ServiceModule);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

