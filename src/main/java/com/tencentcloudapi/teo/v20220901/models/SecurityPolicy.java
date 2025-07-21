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
    * Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CustomRules")
    @Expose
    private CustomRules CustomRules;

    /**
    * Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ManagedRules")
    @Expose
    private ManagedRules ManagedRules;

    /**
    * HTTP DDOS protection configuration.
    */
    @SerializedName("HttpDDoSProtection")
    @Expose
    private HttpDDoSProtection HttpDDoSProtection;

    /**
    * Configures the rate limiting rule.
    */
    @SerializedName("RateLimitingRules")
    @Expose
    private RateLimitingRules RateLimitingRules;

    /**
    * Exception rule configuration.
    */
    @SerializedName("ExceptionRules")
    @Expose
    private ExceptionRules ExceptionRules;

    /**
    * Bot management configuration.
    */
    @SerializedName("BotManagement")
    @Expose
    private BotManagement BotManagement;

    /**
     * Get Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CustomRules Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CustomRules getCustomRules() {
        return this.CustomRules;
    }

    /**
     * Set Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CustomRules Custom rules. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCustomRules(CustomRules CustomRules) {
        this.CustomRules = CustomRules;
    }

    /**
     * Get Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ManagedRules Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ManagedRules getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ManagedRules Managed. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setManagedRules(ManagedRules ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get HTTP DDOS protection configuration. 
     * @return HttpDDoSProtection HTTP DDOS protection configuration.
     */
    public HttpDDoSProtection getHttpDDoSProtection() {
        return this.HttpDDoSProtection;
    }

    /**
     * Set HTTP DDOS protection configuration.
     * @param HttpDDoSProtection HTTP DDOS protection configuration.
     */
    public void setHttpDDoSProtection(HttpDDoSProtection HttpDDoSProtection) {
        this.HttpDDoSProtection = HttpDDoSProtection;
    }

    /**
     * Get Configures the rate limiting rule. 
     * @return RateLimitingRules Configures the rate limiting rule.
     */
    public RateLimitingRules getRateLimitingRules() {
        return this.RateLimitingRules;
    }

    /**
     * Set Configures the rate limiting rule.
     * @param RateLimitingRules Configures the rate limiting rule.
     */
    public void setRateLimitingRules(RateLimitingRules RateLimitingRules) {
        this.RateLimitingRules = RateLimitingRules;
    }

    /**
     * Get Exception rule configuration. 
     * @return ExceptionRules Exception rule configuration.
     */
    public ExceptionRules getExceptionRules() {
        return this.ExceptionRules;
    }

    /**
     * Set Exception rule configuration.
     * @param ExceptionRules Exception rule configuration.
     */
    public void setExceptionRules(ExceptionRules ExceptionRules) {
        this.ExceptionRules = ExceptionRules;
    }

    /**
     * Get Bot management configuration. 
     * @return BotManagement Bot management configuration.
     */
    public BotManagement getBotManagement() {
        return this.BotManagement;
    }

    /**
     * Set Bot management configuration.
     * @param BotManagement Bot management configuration.
     */
    public void setBotManagement(BotManagement BotManagement) {
        this.BotManagement = BotManagement;
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

    }
}

