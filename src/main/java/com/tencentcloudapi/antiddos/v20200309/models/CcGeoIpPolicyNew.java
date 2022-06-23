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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcGeoIpPolicyNew extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol. Valid values: `HTTP` and `HTTPS`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Action. Valid values: `drop` and `alg`.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Region type. Valid values: `china`, `oversea` and `customized`.
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * ID list of regions to be blocked
    */
    @SerializedName("AreaList")
    @Expose
    private Long [] AreaList;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol. Valid values: `HTTP` and `HTTPS`. 
     * @return Protocol Protocol. Valid values: `HTTP` and `HTTPS`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: `HTTP` and `HTTPS`.
     * @param Protocol Protocol. Valid values: `HTTP` and `HTTPS`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Action. Valid values: `drop` and `alg`. 
     * @return Action Action. Valid values: `drop` and `alg`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: `drop` and `alg`.
     * @param Action Action. Valid values: `drop` and `alg`.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Region type. Valid values: `china`, `oversea` and `customized`. 
     * @return RegionType Region type. Valid values: `china`, `oversea` and `customized`.
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set Region type. Valid values: `china`, `oversea` and `customized`.
     * @param RegionType Region type. Valid values: `china`, `oversea` and `customized`.
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get ID list of regions to be blocked 
     * @return AreaList ID list of regions to be blocked
     */
    public Long [] getAreaList() {
        return this.AreaList;
    }

    /**
     * Set ID list of regions to be blocked
     * @param AreaList ID list of regions to be blocked
     */
    public void setAreaList(Long [] AreaList) {
        this.AreaList = AreaList;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public CcGeoIpPolicyNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcGeoIpPolicyNew(CcGeoIpPolicyNew source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.AreaList != null) {
            this.AreaList = new Long[source.AreaList.length];
            for (int i = 0; i < source.AreaList.length; i++) {
                this.AreaList[i] = new Long(source.AreaList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamArraySimple(map, prefix + "AreaList.", this.AreaList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

