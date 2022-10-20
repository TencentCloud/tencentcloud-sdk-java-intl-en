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

public class SecurityConfig extends AbstractModel{

    /**
    * The settings of the managed rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * The settings of the custom rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * The settings of the bot configuration. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * The switch setting of the layer-7 protection. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
    * The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpTableConfig")
    @Expose
    private IpTableConfig IpTableConfig;

    /**
    * The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptConfig")
    @Expose
    private ExceptConfig ExceptConfig;

    /**
    * The settings of the custom block page. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DropPageConfig")
    @Expose
    private DropPageConfig DropPageConfig;

    /**
     * Get The settings of the managed rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WafConfig The settings of the managed rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set The settings of the managed rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WafConfig The settings of the managed rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RateLimitConfig The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RateLimitConfig The settings of the rate limiting rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get The settings of the custom rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AclConfig The settings of the custom rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set The settings of the custom rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AclConfig The settings of the custom rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get The settings of the bot configuration. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BotConfig The settings of the bot configuration. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set The settings of the bot configuration. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BotConfig The settings of the bot configuration. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get The switch setting of the layer-7 protection. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SwitchConfig The switch setting of the layer-7 protection. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set The switch setting of the layer-7 protection. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SwitchConfig The switch setting of the layer-7 protection. If it is null, the setting that was last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
    }

    /**
     * Get The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpTableConfig The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public IpTableConfig getIpTableConfig() {
        return this.IpTableConfig;
    }

    /**
     * Set The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpTableConfig The settings of the basic access control rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpTableConfig(IpTableConfig IpTableConfig) {
        this.IpTableConfig = IpTableConfig;
    }

    /**
     * Get The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptConfig The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExceptConfig getExceptConfig() {
        return this.ExceptConfig;
    }

    /**
     * Set The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptConfig The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptConfig(ExceptConfig ExceptConfig) {
        this.ExceptConfig = ExceptConfig;
    }

    /**
     * Get The settings of the custom block page. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DropPageConfig The settings of the custom block page. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DropPageConfig getDropPageConfig() {
        return this.DropPageConfig;
    }

    /**
     * Set The settings of the custom block page. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DropPageConfig The settings of the custom block page. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDropPageConfig(DropPageConfig DropPageConfig) {
        this.DropPageConfig = DropPageConfig;
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
        if (source.ExceptConfig != null) {
            this.ExceptConfig = new ExceptConfig(source.ExceptConfig);
        }
        if (source.DropPageConfig != null) {
            this.DropPageConfig = new DropPageConfig(source.DropPageConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WafConfig.", this.WafConfig);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "AclConfig.", this.AclConfig);
        this.setParamObj(map, prefix + "BotConfig.", this.BotConfig);
        this.setParamObj(map, prefix + "SwitchConfig.", this.SwitchConfig);
        this.setParamObj(map, prefix + "IpTableConfig.", this.IpTableConfig);
        this.setParamObj(map, prefix + "ExceptConfig.", this.ExceptConfig);
        this.setParamObj(map, prefix + "DropPageConfig.", this.DropPageConfig);

    }
}

