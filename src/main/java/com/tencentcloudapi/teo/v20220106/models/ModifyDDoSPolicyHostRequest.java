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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSPolicyHostRequest extends AbstractModel{

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Second-level domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Whether to enable content acceleration. Values: `on` (enable content acceleration), and `off` (disable content acceleration). It can be used together with `SecurityType`.
    */
    @SerializedName("AccelerateType")
    @Expose
    private String AccelerateType;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Whether to enable security protection. Values: `on` (enable security protection) and `off` (disable security protection). It can be used together with `AccelerateType`.
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Second-level domain name 
     * @return Host Second-level domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Second-level domain name
     * @param Host Second-level domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Whether to enable content acceleration. Values: `on` (enable content acceleration), and `off` (disable content acceleration). It can be used together with `SecurityType`. 
     * @return AccelerateType Whether to enable content acceleration. Values: `on` (enable content acceleration), and `off` (disable content acceleration). It can be used together with `SecurityType`.
     */
    public String getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Whether to enable content acceleration. Values: `on` (enable content acceleration), and `off` (disable content acceleration). It can be used together with `SecurityType`.
     * @param AccelerateType Whether to enable content acceleration. Values: `on` (enable content acceleration), and `off` (disable content acceleration). It can be used together with `SecurityType`.
     */
    public void setAccelerateType(String AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Whether to enable security protection. Values: `on` (enable security protection) and `off` (disable security protection). It can be used together with `AccelerateType`. 
     * @return SecurityType Whether to enable security protection. Values: `on` (enable security protection) and `off` (disable security protection). It can be used together with `AccelerateType`.
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether to enable security protection. Values: `on` (enable security protection) and `off` (disable security protection). It can be used together with `AccelerateType`.
     * @param SecurityType Whether to enable security protection. Values: `on` (enable security protection) and `off` (disable security protection). It can be used together with `AccelerateType`.
     */
    public void setSecurityType(String SecurityType) {
        this.SecurityType = SecurityType;
    }

    public ModifyDDoSPolicyHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSPolicyHostRequest(ModifyDDoSPolicyHostRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccelerateType != null) {
            this.AccelerateType = new String(source.AccelerateType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.SecurityType != null) {
            this.SecurityType = new String(source.SecurityType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccelerateType", this.AccelerateType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);

    }
}

