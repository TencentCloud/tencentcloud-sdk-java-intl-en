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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Inbound extends AbstractModel{

    /**
    * Policy. Valid values: ACCEPT, DROP.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * All the addresses that the address group ID represents.
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * Source IP or IP address range, such as 192.168.0.0/16.
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * Description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Network protocol, such as UDP and TCP, etc.
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * Port.
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * All the protocols and ports that the service group ID represents.
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * All the addresses that the security group ID represents.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Policy. Valid values: ACCEPT, DROP. 
     * @return Action Policy. Valid values: ACCEPT, DROP.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy. Valid values: ACCEPT, DROP.
     * @param Action Policy. Valid values: ACCEPT, DROP.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get All the addresses that the address group ID represents. 
     * @return AddressModule All the addresses that the address group ID represents.
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set All the addresses that the address group ID represents.
     * @param AddressModule All the addresses that the address group ID represents.
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get Source IP or IP address range, such as 192.168.0.0/16. 
     * @return CidrIp Source IP or IP address range, such as 192.168.0.0/16.
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set Source IP or IP address range, such as 192.168.0.0/16.
     * @param CidrIp Source IP or IP address range, such as 192.168.0.0/16.
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get Description. 
     * @return Desc Description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description.
     * @param Desc Description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Network protocol, such as UDP and TCP, etc. 
     * @return IpProtocol Network protocol, such as UDP and TCP, etc.
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set Network protocol, such as UDP and TCP, etc.
     * @param IpProtocol Network protocol, such as UDP and TCP, etc.
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get Port. 
     * @return PortRange Port.
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set Port.
     * @param PortRange Port.
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get All the protocols and ports that the service group ID represents. 
     * @return ServiceModule All the protocols and ports that the service group ID represents.
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set All the protocols and ports that the service group ID represents.
     * @param ServiceModule All the protocols and ports that the service group ID represents.
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get All the addresses that the security group ID represents. 
     * @return Id All the addresses that the security group ID represents.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set All the addresses that the security group ID represents.
     * @param Id All the addresses that the security group ID represents.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

