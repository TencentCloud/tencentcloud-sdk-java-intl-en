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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicy extends AbstractModel {

    /**
    * <p>Custom rule configuration.</p>
    */
    @SerializedName("CustomRules")
    @Expose
    private CustomRules CustomRules;

    /**
    * <p>Managed rule configuration.</p>
    */
    @SerializedName("ManagedRules")
    @Expose
    private ManagedRules ManagedRules;

    /**
    * <p>HTTP DDoS protection configuration.</p>
    */
    @SerializedName("HttpDDoSProtection")
    @Expose
    private HttpDDoSProtection HttpDDoSProtection;

    /**
    * <p>Rate limiting rule configuration.</p>
    */
    @SerializedName("RateLimitingRules")
    @Expose
    private RateLimitingRules RateLimitingRules;

    /**
    * <p>Exception rule configuration.</p>
    */
    @SerializedName("ExceptionRules")
    @Expose
    private ExceptionRules ExceptionRules;

    /**
    * <p>Bot management configuration.</p>
    */
    @SerializedName("BotManagement")
    @Expose
    private BotManagement BotManagement;

    /**
    * <p>Basic Bot management configuration.</p>
    */
    @SerializedName("BotManagementLite")
    @Expose
    private BotManagementLite BotManagementLite;

    /**
    * <p>Default block action configuration.</p>
    */
    @SerializedName("DefaultDenySecurityActionParameters")
    @Expose
    private DefaultDenySecurityActionParameters DefaultDenySecurityActionParameters;

    /**
    * <p>Security headers to include in requests to the origin. After the configuration takes effect, request headers with the corresponding `keyname` will be sent to the origin.</p>
    */
    @SerializedName("SecurityHeadersToOrigin")
    @Expose
    private SecurityHeadersToOrigin SecurityHeadersToOrigin;

    /**
     * Get <p>Custom rule configuration.</p> 
     * @return CustomRules <p>Custom rule configuration.</p>
     */
    public CustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set <p>Custom rule configuration.</p>
     * @param CustomRules <p>Custom rule configuration.</p>
     */
    public void setCustomRules(CustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get <p>Managed rule configuration.</p> 
     * @return ManagedRules <p>Managed rule configuration.</p>
     */
    public ManagedRules getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set <p>Managed rule configuration.</p>
     * @param ManagedRules <p>Managed rule configuration.</p>
     */
    public void setManagedRules(ManagedRules ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get <p>HTTP DDoS protection configuration.</p> 
     * @return HttpDDoSProtection <p>HTTP DDoS protection configuration.</p>
     */
    public HttpDDoSProtection getHttpDDoSProtection() {
        return this.HttpDDoSProtection;
    }

    /**
     * Set <p>HTTP DDoS protection configuration.</p>
     * @param HttpDDoSProtection <p>HTTP DDoS protection configuration.</p>
     */
    public void setHttpDDoSProtection(HttpDDoSProtection HttpDDoSProtection) {
        this.HttpDDoSProtection = HttpDDoSProtection;
    }

    /**
     * Get <p>Rate limiting rule configuration.</p> 
     * @return RateLimitingRules <p>Rate limiting rule configuration.</p>
     */
    public RateLimitingRules getRateLimitingRules() {
        return this.RateLimitingRules;
    }

    /**
     * Set <p>Rate limiting rule configuration.</p>
     * @param RateLimitingRules <p>Rate limiting rule configuration.</p>
     */
    public void setRateLimitingRules(RateLimitingRules RateLimitingRules) {
        this.RateLimitingRules = RateLimitingRules;
    }

    /**
     * Get <p>Exception rule configuration.</p> 
     * @return ExceptionRules <p>Exception rule configuration.</p>
     */
    public ExceptionRules getExceptionRules() {
        return this.ExceptionRules;
    }

    /**
     * Set <p>Exception rule configuration.</p>
     * @param ExceptionRules <p>Exception rule configuration.</p>
     */
    public void setExceptionRules(ExceptionRules ExceptionRules) {
        this.ExceptionRules = ExceptionRules;
    }

    /**
     * Get <p>Bot management configuration.</p> 
     * @return BotManagement <p>Bot management configuration.</p>
     */
    public BotManagement getBotManagement() {
        return this.BotManagement;
    }

    /**
     * Set <p>Bot management configuration.</p>
     * @param BotManagement <p>Bot management configuration.</p>
     */
    public void setBotManagement(BotManagement BotManagement) {
        this.BotManagement = BotManagement;
    }

    /**
     * Get <p>Basic Bot management configuration.</p> 
     * @return BotManagementLite <p>Basic Bot management configuration.</p>
     */
    public BotManagementLite getBotManagementLite() {
        return this.BotManagementLite;
    }

    /**
     * Set <p>Basic Bot management configuration.</p>
     * @param BotManagementLite <p>Basic Bot management configuration.</p>
     */
    public void setBotManagementLite(BotManagementLite BotManagementLite) {
        this.BotManagementLite = BotManagementLite;
    }

    /**
     * Get <p>Default block action configuration.</p> 
     * @return DefaultDenySecurityActionParameters <p>Default block action configuration.</p>
     */
    public DefaultDenySecurityActionParameters getDefaultDenySecurityActionParameters() {
        return this.DefaultDenySecurityActionParameters;
    }

    /**
     * Set <p>Default block action configuration.</p>
     * @param DefaultDenySecurityActionParameters <p>Default block action configuration.</p>
     */
    public void setDefaultDenySecurityActionParameters(DefaultDenySecurityActionParameters DefaultDenySecurityActionParameters) {
        this.DefaultDenySecurityActionParameters = DefaultDenySecurityActionParameters;
    }

    /**
     * Get <p>Security headers to include in requests to the origin. After the configuration takes effect, request headers with the corresponding `keyname` will be sent to the origin.</p> 
     * @return SecurityHeadersToOrigin <p>Security headers to include in requests to the origin. After the configuration takes effect, request headers with the corresponding `keyname` will be sent to the origin.</p>
     */
    public SecurityHeadersToOrigin getSecurityHeadersToOrigin() {
        return this.SecurityHeadersToOrigin;
    }

    /**
     * Set <p>Security headers to include in requests to the origin. After the configuration takes effect, request headers with the corresponding `keyname` will be sent to the origin.</p>
     * @param SecurityHeadersToOrigin <p>Security headers to include in requests to the origin. After the configuration takes effect, request headers with the corresponding `keyname` will be sent to the origin.</p>
     */
    public void setSecurityHeadersToOrigin(SecurityHeadersToOrigin SecurityHeadersToOrigin) {
        this.SecurityHeadersToOrigin = SecurityHeadersToOrigin;
    }

    public SecurityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicy(SecurityPolicy source) {
        if (source.CustomRules != null) {
            this.CustomRules = new CustomRules(source.CustomRules);
        }
        if (source.ManagedRules != null) {
            this.ManagedRules = new ManagedRules(source.ManagedRules);
        }
        if (source.HttpDDoSProtection != null) {
            this.HttpDDoSProtection = new HttpDDoSProtection(source.HttpDDoSProtection);
        }
        if (source.RateLimitingRules != null) {
            this.RateLimitingRules = new RateLimitingRules(source.RateLimitingRules);
        }
        if (source.ExceptionRules != null) {
            this.ExceptionRules = new ExceptionRules(source.ExceptionRules);
        }
        if (source.BotManagement != null) {
            this.BotManagement = new BotManagement(source.BotManagement);
        }
        if (source.BotManagementLite != null) {
            this.BotManagementLite = new BotManagementLite(source.BotManagementLite);
        }
        if (source.DefaultDenySecurityActionParameters != null) {
            this.DefaultDenySecurityActionParameters = new DefaultDenySecurityActionParameters(source.DefaultDenySecurityActionParameters);
        }
        if (source.SecurityHeadersToOrigin != null) {
            this.SecurityHeadersToOrigin = new SecurityHeadersToOrigin(source.SecurityHeadersToOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CustomRules.", this.CustomRules);
        this.setParamObj(map, prefix + "ManagedRules.", this.ManagedRules);
        this.setParamObj(map, prefix + "HttpDDoSProtection.", this.HttpDDoSProtection);
        this.setParamObj(map, prefix + "RateLimitingRules.", this.RateLimitingRules);
        this.setParamObj(map, prefix + "ExceptionRules.", this.ExceptionRules);
        this.setParamObj(map, prefix + "BotManagement.", this.BotManagement);
        this.setParamObj(map, prefix + "BotManagementLite.", this.BotManagementLite);
        this.setParamObj(map, prefix + "DefaultDenySecurityActionParameters.", this.DefaultDenySecurityActionParameters);
        this.setParamObj(map, prefix + "SecurityHeadersToOrigin.", this.SecurityHeadersToOrigin);

    }
}

