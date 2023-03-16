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

public class InstanceNetInfo extends AbstractModel{

    /**
    * 
    */
    @SerializedName("InstanceGroupType")
    @Expose
    private String InstanceGroupType;

    /**
    * 
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
     * Get  
     * @return InstanceGroupType 
     */
    public String getInstanceGroupType() {
        return this.InstanceGroupType;
    }

    /**
     * Set 
     * @param InstanceGroupType 
     */
    public void setInstanceGroupType(String InstanceGroupType) {
        this.InstanceGroupType = InstanceGroupType;
    }

    /**
     * Get  
     * @return InstanceGroupId 
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 
     * @param InstanceGroupId 
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get  
     * @return SubnetId 
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 
     * @param SubnetId 
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get  
     * @return NetType 
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 
     * @param NetType 
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get  
     * @return Vip 
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 
     * @param Vip 
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get  
     * @return Vport 
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 
     * @param Vport 
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get  
     * @return WanDomain 
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 
     * @param WanDomain 
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get  
     * @return WanIP 
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 
     * @param WanIP 
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get  
     * @return WanPort 
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 
     * @param WanPort 
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get  
     * @return WanStatus 
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 
     * @param WanStatus 
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

