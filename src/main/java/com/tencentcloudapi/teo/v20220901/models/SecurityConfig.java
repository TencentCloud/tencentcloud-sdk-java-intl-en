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

public class SecurityConfig extends AbstractModel {

    /**
    * Managed rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * Rate limiting. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * Custom rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * Bot configuration. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * Switch setting of the 7-layer protection. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
    * Basic access control. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("IpTableConfig")
    @Expose
    private IpTableConfig IpTableConfig;

    /**
    * Exception rule configuration. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExceptConfig")
    @Expose
    private ExceptConfig ExceptConfig;

    /**
    * Custom block page settings. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DropPageConfig")
    @Expose
    private DropPageConfig DropPageConfig;

    /**
    * Security template settings
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TemplateConfig")
    @Expose
    private TemplateConfig TemplateConfig;

    /**
    * Settings for slow attack defense. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SlowPostConfig")
    @Expose
    private SlowPostConfig SlowPostConfig;

    /**
    * Detect the length limit configuration, output parameter only.
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("DetectLengthLimitConfig")
    @Expose
    private DetectLengthLimitConfig DetectLengthLimitConfig;

    /**
     * Get Managed rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WafConfig Managed rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set Managed rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WafConfig Managed rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get Rate limiting. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RateLimitConfig Rate limiting. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set Rate limiting. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RateLimitConfig Rate limiting. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get Custom rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AclConfig Custom rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set Custom rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AclConfig Custom rule. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get Bot configuration. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BotConfig Bot configuration. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set Bot configuration. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BotConfig Bot configuration. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get Switch setting of the 7-layer protection. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SwitchConfig Switch setting of the 7-layer protection. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set Switch setting of the 7-layer protection. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     * @param SwitchConfig Switch setting of the 7-layer protection. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
    }

    /**
     * Get Basic access control. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return IpTableConfig Basic access control. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public IpTableConfig getIpTableConfig() {
        return this.IpTableConfig;
    }

    /**
     * Set Basic access control. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param IpTableConfig Basic access control. If the parameter is null or not filled, the configuration last set will be used by default.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setIpTableConfig(IpTableConfig IpTableConfig) {
        this.IpTableConfig = IpTableConfig;
    }

    /**
     * Get Exception rule configuration. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExceptConfig Exception rule configuration. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ExceptConfig getExceptConfig() {
        return this.ExceptConfig;
    }

    /**
     * Set Exception rule configuration. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExceptConfig Exception rule configuration. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExceptConfig(ExceptConfig ExceptConfig) {
        this.ExceptConfig = ExceptConfig;
    }

    /**
     * Get Custom block page settings. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DropPageConfig Custom block page settings. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DropPageConfig getDropPageConfig() {
        return this.DropPageConfig;
    }

    /**
     * Set Custom block page settings. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     * @param DropPageConfig Custom block page settings. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDropPageConfig(DropPageConfig DropPageConfig) {
        this.DropPageConfig = DropPageConfig;
    }

    /**
     * Get Security template settings
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TemplateConfig Security template settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public TemplateConfig getTemplateConfig() {
        return this.TemplateConfig;
    }

    /**
     * Set Security template settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TemplateConfig Security template settings
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTemplateConfig(TemplateConfig TemplateConfig) {
        this.TemplateConfig = TemplateConfig;
    }

    /**
     * Get Settings for slow attack defense. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SlowPostConfig Settings for slow attack defense. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SlowPostConfig getSlowPostConfig() {
        return this.SlowPostConfig;
    }

    /**
     * Set Settings for slow attack defense. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     * @param SlowPostConfig Settings for slow attack defense. If the parameter is null or not filled, the configuration last set will be used by default.Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSlowPostConfig(SlowPostConfig SlowPostConfig) {
        this.SlowPostConfig = SlowPostConfig;
    }

    /**
     * Get Detect the length limit configuration, output parameter only.
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return DetectLengthLimitConfig Detect the length limit configuration, output parameter only.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public DetectLengthLimitConfig getDetectLengthLimitConfig() {
        return this.DetectLengthLimitConfig;
    }

    /**
     * Set Detect the length limit configuration, output parameter only.
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param DetectLengthLimitConfig Detect the length limit configuration, output parameter only.
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setDetectLengthLimitConfig(DetectLengthLimitConfig DetectLengthLimitConfig) {
        this.DetectLengthLimitConfig = DetectLengthLimitConfig;
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
        if (source.TemplateConfig != null) {
            this.TemplateConfig = new TemplateConfig(source.TemplateConfig);
        }
        if (source.SlowPostConfig != null) {
            this.SlowPostConfig = new SlowPostConfig(source.SlowPostConfig);
        }
        if (source.DetectLengthLimitConfig != null) {
            this.DetectLengthLimitConfig = new DetectLengthLimitConfig(source.DetectLengthLimitConfig);
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
        this.setParamObj(map, prefix + "TemplateConfig.", this.TemplateConfig);
        this.setParamObj(map, prefix + "SlowPostConfig.", this.SlowPostConfig);
        this.setParamObj(map, prefix + "DetectLengthLimitConfig.", this.DetectLengthLimitConfig);

    }
}

