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

public class CcBlackWhiteIpPolicy extends AbstractModel{

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
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Blocklist/Allowlist IP address
    */
    @SerializedName("BlackWhiteIp")
    @Expose
    private String BlackWhiteIp;

    /**
    * Mask
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

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
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP). 
     * @return Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     * @param Type IP type. Valid values: `black` (blocklisted IP), `white`(allowlisted IP).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Blocklist/Allowlist IP address 
     * @return BlackWhiteIp Blocklist/Allowlist IP address
     */
    public String getBlackWhiteIp() {
        return this.BlackWhiteIp;
    }

    /**
     * Set Blocklist/Allowlist IP address
     * @param BlackWhiteIp Blocklist/Allowlist IP address
     */
    public void setBlackWhiteIp(String BlackWhiteIp) {
        this.BlackWhiteIp = BlackWhiteIp;
    }

    /**
     * Get Mask 
     * @return Mask Mask
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set Mask
     * @param Mask Mask
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
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

    public CcBlackWhiteIpPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcBlackWhiteIpPolicy(CcBlackWhiteIpPolicy source) {
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.BlackWhiteIp != null) {
            this.BlackWhiteIp = new String(source.BlackWhiteIp);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "BlackWhiteIp", this.BlackWhiteIp);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

