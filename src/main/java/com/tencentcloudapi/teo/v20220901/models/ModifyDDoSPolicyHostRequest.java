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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSPolicyHostRequest extends AbstractModel{

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name/layer-4 proxy.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Whether to enabled acceleration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("AccelerateType")
    @Expose
    private String AccelerateType;

    /**
    * The policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Whether to enable security protection. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("SecurityType")
    @Expose
    private String SecurityType;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The subdomain name/layer-4 proxy. 
     * @return Host The subdomain name/layer-4 proxy.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The subdomain name/layer-4 proxy.
     * @param Host The subdomain name/layer-4 proxy.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Whether to enabled acceleration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return AccelerateType Whether to enabled acceleration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getAccelerateType() {
        return this.AccelerateType;
    }

    /**
     * Set Whether to enabled acceleration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param AccelerateType Whether to enabled acceleration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setAccelerateType(String AccelerateType) {
        this.AccelerateType = AccelerateType;
    }

    /**
     * Get The policy ID. 
     * @return PolicyId The policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The policy ID.
     * @param PolicyId The policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Whether to enable security protection. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return SecurityType Whether to enable security protection. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set Whether to enable security protection. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param SecurityType Whether to enable security protection. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
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

