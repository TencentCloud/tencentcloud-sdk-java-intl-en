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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNetInfo extends AbstractModel {

    /**
    * Network type.
    */
    @SerializedName("InstanceGroupType")
    @Expose
    private String InstanceGroupType;

    /**
    * Instance group ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * Specifies the virtual private cloud ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Specifies the subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Network type. valid values: 0 (basic network), 1 (vpc network), 2 (blackstone network).
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * VPC IP.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * VPC port.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Specifies the public network domain name.
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public IP address
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Public network port.
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Public network enabled status.
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
     * Get Network type. 
     * @return InstanceGroupType Network type.
     */
    public String getInstanceGroupType() {
        return this.InstanceGroupType;
    }

    /**
     * Set Network type.
     * @param InstanceGroupType Network type.
     */
    public void setInstanceGroupType(String InstanceGroupType) {
        this.InstanceGroupType = InstanceGroupType;
    }

    /**
     * Get Instance group ID 
     * @return InstanceGroupId Instance group ID
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID
     * @param InstanceGroupId Instance group ID
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Specifies the virtual private cloud ID. 
     * @return VpcId Specifies the virtual private cloud ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the virtual private cloud ID.
     * @param VpcId Specifies the virtual private cloud ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Specifies the subnet ID. 
     * @return SubnetId Specifies the subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Specifies the subnet ID.
     * @param SubnetId Specifies the subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Network type. valid values: 0 (basic network), 1 (vpc network), 2 (blackstone network). 
     * @return NetType Network type. valid values: 0 (basic network), 1 (vpc network), 2 (blackstone network).
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. valid values: 0 (basic network), 1 (vpc network), 2 (blackstone network).
     * @param NetType Network type. valid values: 0 (basic network), 1 (vpc network), 2 (blackstone network).
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get VPC IP. 
     * @return Vip VPC IP.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set VPC IP.
     * @param Vip VPC IP.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get VPC port. 
     * @return Vport VPC port.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set VPC port.
     * @param Vport VPC port.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Specifies the public network domain name. 
     * @return WanDomain Specifies the public network domain name.
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Specifies the public network domain name.
     * @param WanDomain Specifies the public network domain name.
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public IP address 
     * @return WanIP Public IP address
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set Public IP address
     * @param WanIP Public IP address
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get Public network port. 
     * @return WanPort Public network port.
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port.
     * @param WanPort Public network port.
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Public network enabled status. 
     * @return WanStatus Public network enabled status.
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network enabled status.
     * @param WanStatus Public network enabled status.
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    public InstanceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetInfo(InstanceNetInfo source) {
        if (source.InstanceGroupType != null) {
            this.InstanceGroupType = new String(source.InstanceGroupType);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupType", this.InstanceGroupType);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);

    }
}

