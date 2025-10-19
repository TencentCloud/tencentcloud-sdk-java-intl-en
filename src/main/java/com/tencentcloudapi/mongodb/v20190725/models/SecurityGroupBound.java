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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupBound extends AbstractModel {

    /**
    * Execution policy.
- ACCEPT: allow. Access requests for the port can be released.
- DROP: reject. Data packets are discarded without any response.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Inbound IP address or IP range for database access.
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * Port for database access.
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * Transport layer protocol: TCP.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * Security group ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Parameter template ID for the IP address or IP address group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/ip) to obtain the parameter template IP address details.
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * Parameter template ID for the protocol port or protocol port group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/protoport) to obtain the parameter template protocol port details.
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * Security group description information.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Execution policy.
- ACCEPT: allow. Access requests for the port can be released.
- DROP: reject. Data packets are discarded without any response. 
     * @return Action Execution policy.
- ACCEPT: allow. Access requests for the port can be released.
- DROP: reject. Data packets are discarded without any response.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Execution policy.
- ACCEPT: allow. Access requests for the port can be released.
- DROP: reject. Data packets are discarded without any response.
     * @param Action Execution policy.
- ACCEPT: allow. Access requests for the port can be released.
- DROP: reject. Data packets are discarded without any response.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Inbound IP address or IP range for database access. 
     * @return CidrIp Inbound IP address or IP range for database access.
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set Inbound IP address or IP range for database access.
     * @param CidrIp Inbound IP address or IP range for database access.
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get Port for database access. 
     * @return PortRange Port for database access.
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Port for database access.
     * @param PortRange Port for database access.
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get Transport layer protocol: TCP. 
     * @return IpProtocol Transport layer protocol: TCP.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Transport layer protocol: TCP.
     * @param IpProtocol Transport layer protocol: TCP.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get Security group ID. 
     * @return Id Security group ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Security group ID.
     * @param Id Security group ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Parameter template ID for the IP address or IP address group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/ip) to obtain the parameter template IP address details. 
     * @return AddressModule Parameter template ID for the IP address or IP address group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/ip) to obtain the parameter template IP address details.
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set Parameter template ID for the IP address or IP address group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/ip) to obtain the parameter template IP address details.
     * @param AddressModule Parameter template ID for the IP address or IP address group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/ip) to obtain the parameter template IP address details.
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get Parameter template ID for the protocol port or protocol port group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/protoport) to obtain the parameter template protocol port details. 
     * @return ServiceModule Parameter template ID for the protocol port or protocol port group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/protoport) to obtain the parameter template protocol port details.
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set Parameter template ID for the protocol port or protocol port group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/protoport) to obtain the parameter template protocol port details.
     * @param ServiceModule Parameter template ID for the protocol port or protocol port group. Log in to the [parameter template console](https://console.cloud.tencent.com/vpc/template/protoport) to obtain the parameter template protocol port details.
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get Security group description information. 
     * @return Desc Security group description information.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Security group description information.
     * @param Desc Security group description information.
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

