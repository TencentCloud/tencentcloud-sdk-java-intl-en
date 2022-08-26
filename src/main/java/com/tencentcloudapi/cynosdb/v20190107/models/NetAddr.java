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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAddr extends AbstractModel{

    /**
    * Private network IP
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Private network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Public network domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * Network type. Valid values: `ro` (read-only), `rw` or `ha` (read-write)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Private network IP
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vip Private network IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Private network IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vip Private network IP
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Private network port number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Vport Private network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Private network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Vport Private network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Public network domain name
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WanDomain Public network domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public network domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WanDomain Public network domain name
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public network port number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WanPort Public network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WanPort Public network port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get Network type. Valid values: `ro` (read-only), `rw` or `ha` (read-write)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NetType Network type. Valid values: `ro` (read-only), `rw` or `ha` (read-write)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. Valid values: `ro` (read-only), `rw` or `ha` (read-write)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NetType Network type. Valid values: `ro` (read-only), `rw` or `ha` (read-write)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqSubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqSubnetId Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get VPC ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UniqVpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UniqVpcId VPC ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    }
}

