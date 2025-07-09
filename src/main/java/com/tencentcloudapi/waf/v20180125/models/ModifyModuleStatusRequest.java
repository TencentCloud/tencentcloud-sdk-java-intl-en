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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyModuleStatusRequest extends AbstractModel {

    /**
    * Domain to be set
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Enabling status of the web security module. The value is 0 or 1.
    */
    @SerializedName("WebSecurity")
    @Expose
    private Long WebSecurity;

    /**
    * Access control module switch: 0 or 1
    */
    @SerializedName("AccessControl")
    @Expose
    private Long AccessControl;

    /**
    * CC module switch, 0 or 1
    */
    @SerializedName("CcProtection")
    @Expose
    private Long CcProtection;

    /**
    * API security module switch, 0 or 1
    */
    @SerializedName("ApiProtection")
    @Expose
    private Long ApiProtection;

    /**
    * Tamper-proof module switch: 0 or 1
    */
    @SerializedName("AntiTamper")
    @Expose
    private Long AntiTamper;

    /**
    * Leakage prevention module switch: 0 or 1
    */
    @SerializedName("AntiLeakage")
    @Expose
    private Long AntiLeakage;

    /**
    * Traffic limiting module switch: 0 or 1
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
     * Get Domain to be set 
     * @return Domain Domain to be set
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain to be set
     * @param Domain Domain to be set
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Enabling status of the web security module. The value is 0 or 1. 
     * @return WebSecurity Enabling status of the web security module. The value is 0 or 1.
     */
    public Long getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set Enabling status of the web security module. The value is 0 or 1.
     * @param WebSecurity Enabling status of the web security module. The value is 0 or 1.
     */
    public void setWebSecurity(Long WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get Access control module switch: 0 or 1 
     * @return AccessControl Access control module switch: 0 or 1
     */
    public Long getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Access control module switch: 0 or 1
     * @param AccessControl Access control module switch: 0 or 1
     */
    public void setAccessControl(Long AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get CC module switch, 0 or 1 
     * @return CcProtection CC module switch, 0 or 1
     */
    public Long getCcProtection() {
        return this.CcProtection;
    }

    /**
     * Set CC module switch, 0 or 1
     * @param CcProtection CC module switch, 0 or 1
     */
    public void setCcProtection(Long CcProtection) {
        this.CcProtection = CcProtection;
    }

    /**
     * Get API security module switch, 0 or 1 
     * @return ApiProtection API security module switch, 0 or 1
     */
    public Long getApiProtection() {
        return this.ApiProtection;
    }

    /**
     * Set API security module switch, 0 or 1
     * @param ApiProtection API security module switch, 0 or 1
     */
    public void setApiProtection(Long ApiProtection) {
        this.ApiProtection = ApiProtection;
    }

    /**
     * Get Tamper-proof module switch: 0 or 1 
     * @return AntiTamper Tamper-proof module switch: 0 or 1
     */
    public Long getAntiTamper() {
        return this.AntiTamper;
    }

    /**
     * Set Tamper-proof module switch: 0 or 1
     * @param AntiTamper Tamper-proof module switch: 0 or 1
     */
    public void setAntiTamper(Long AntiTamper) {
        this.AntiTamper = AntiTamper;
    }

    /**
     * Get Leakage prevention module switch: 0 or 1 
     * @return AntiLeakage Leakage prevention module switch: 0 or 1
     */
    public Long getAntiLeakage() {
        return this.AntiLeakage;
    }

    /**
     * Set Leakage prevention module switch: 0 or 1
     * @param AntiLeakage Leakage prevention module switch: 0 or 1
     */
    public void setAntiLeakage(Long AntiLeakage) {
        this.AntiLeakage = AntiLeakage;
    }

    /**
     * Get Traffic limiting module switch: 0 or 1 
     * @return RateLimit Traffic limiting module switch: 0 or 1
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set Traffic limiting module switch: 0 or 1
     * @param RateLimit Traffic limiting module switch: 0 or 1
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    public ModifyModuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyModuleStatusRequest(ModifyModuleStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.WebSecurity != null) {
            this.WebSecurity = new Long(source.WebSecurity);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new Long(source.AccessControl);
        }
        if (source.CcProtection != null) {
            this.CcProtection = new Long(source.CcProtection);
        }
        if (source.ApiProtection != null) {
            this.ApiProtection = new Long(source.ApiProtection);
        }
        if (source.AntiTamper != null) {
            this.AntiTamper = new Long(source.AntiTamper);
        }
        if (source.AntiLeakage != null) {
            this.AntiLeakage = new Long(source.AntiLeakage);
        }
        if (source.RateLimit != null) {
            this.RateLimit = new Long(source.RateLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "WebSecurity", this.WebSecurity);
        this.setParamSimple(map, prefix + "AccessControl", this.AccessControl);
        this.setParamSimple(map, prefix + "CcProtection", this.CcProtection);
        this.setParamSimple(map, prefix + "ApiProtection", this.ApiProtection);
        this.setParamSimple(map, prefix + "AntiTamper", this.AntiTamper);
        this.setParamSimple(map, prefix + "AntiLeakage", this.AntiLeakage);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);

    }
}

