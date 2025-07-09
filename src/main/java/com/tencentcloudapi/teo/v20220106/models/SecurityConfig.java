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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityConfig extends AbstractModel {

    /**
    * WAF configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * Rate limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * DDoS mitigation configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("DdosConfig")
    @Expose
    private DDoSConfig DdosConfig;

    /**
    * ACL configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * Bot configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * Switch that controls all web security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
    * IP blocklist/allowlist
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpTableConfig")
    @Expose
    private IpTableConfig IpTableConfig;

    /**
     * Get WAF configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WafConfig WAF configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set WAF configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WafConfig WAF configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get Rate limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RateLimitConfig Rate limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set Rate limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RateLimitConfig Rate limit configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get DDoS mitigation configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return DdosConfig DDoS mitigation configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public DDoSConfig getDdosConfig() {
        return this.DdosConfig;
    }

    /**
     * Set DDoS mitigation configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param DdosConfig DDoS mitigation configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setDdosConfig(DDoSConfig DdosConfig) {
        this.DdosConfig = DdosConfig;
    }

    /**
     * Get ACL configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AclConfig ACL configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set ACL configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AclConfig ACL configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get Bot configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BotConfig Bot configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set Bot configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BotConfig Bot configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get Switch that controls all web security configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SwitchConfig Switch that controls all web security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set Switch that controls all web security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SwitchConfig Switch that controls all web security configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
    }

    /**
     * Get IP blocklist/allowlist
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpTableConfig IP blocklist/allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IpTableConfig getIpTableConfig() {
        return this.IpTableConfig;
    }

    /**
     * Set IP blocklist/allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpTableConfig IP blocklist/allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpTableConfig(IpTableConfig IpTableConfig) {
        this.IpTableConfig = IpTableConfig;
    }

    public SecurityConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityConfig(SecurityConfig source) {
        if (source.WafConfig != null) {
            this.WafConfig = new WafConfig(source.WafConfig);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfig(source.RateLimitConfig);
        }
        if (source.DdosConfig != null) {
            this.DdosConfig = new DDoSConfig(source.DdosConfig);
        }
        if (source.AclConfig != null) {
            this.AclConfig = new AclConfig(source.AclConfig);
        }
        if (source.BotConfig != null) {
            this.BotConfig = new BotConfig(source.BotConfig);
        }
        if (source.SwitchConfig != null) {
            this.SwitchConfig = new SwitchConfig(source.SwitchConfig);
        }
        if (source.IpTableConfig != null) {
            this.IpTableConfig = new IpTableConfig(source.IpTableConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WafConfig.", this.WafConfig);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "DdosConfig.", this.DdosConfig);
        this.setParamObj(map, prefix + "AclConfig.", this.AclConfig);
        this.setParamObj(map, prefix + "BotConfig.", this.BotConfig);
        this.setParamObj(map, prefix + "SwitchConfig.", this.SwitchConfig);
        this.setParamObj(map, prefix + "IpTableConfig.", this.IpTableConfig);

    }
}

