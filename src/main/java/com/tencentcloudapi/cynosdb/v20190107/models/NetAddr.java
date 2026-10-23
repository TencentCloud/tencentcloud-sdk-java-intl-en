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

public class NetAddr extends AbstractModel {

    /**
    * Private IP address
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port number
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Public network domain name.
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public network port number.
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Network type (ro: read-only, rw/ha: read-write)
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Subnet ID.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * VPC ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Public IP address
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * Public network status.
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * Instance group ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
     * Get Private IP address 
     * @return Vip Private IP address
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private IP address
     * @param Vip Private IP address
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port number 
     * @return Vport Private network port number
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port number
     * @param Vport Private network port number
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Public network domain name. 
     * @return WanDomain Public network domain name.
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public network domain name.
     * @param WanDomain Public network domain name.
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public network port number. 
     * @return WanPort Public network port number.
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port number.
     * @param WanPort Public network port number.
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Network type (ro: read-only, rw/ha: read-write) 
     * @return NetType Network type (ro: read-only, rw/ha: read-write)
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type (ro: read-only, rw/ha: read-write)
     * @param NetType Network type (ro: read-only, rw/ha: read-write)
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Subnet ID. 
     * @return UniqSubnetId Subnet ID.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID.
     * @param UniqSubnetId Subnet ID.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get VPC ID 
     * @return UniqVpcId VPC ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID
     * @param UniqVpcId VPC ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Description information 
     * @return Description Description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information
     * @param Description Description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get Public network status. 
     * @return WanStatus Public network status.
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set Public network status.
     * @param WanStatus Public network status.
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
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

    public NetAddr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAddr(NetAddr source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);

    }
}

