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
    * Managed rule. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConfig WafConfig;

    /**
    * Rate limiting. if the parameter is null or not filled, the configuration last set will be used by default.
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfig RateLimitConfig;

    /**
    * Custom rule. specifies if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("AclConfig")
    @Expose
    private AclConfig AclConfig;

    /**
    * Bot configuration. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("BotConfig")
    @Expose
    private BotConfig BotConfig;

    /**
    * Switch setting of the 7-layer protection. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("SwitchConfig")
    @Expose
    private SwitchConfig SwitchConfig;

    /**
    * Basic access control. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("IpTableConfig")
    @Expose
    private IpTableConfig IpTableConfig;

    /**
    * Exception rule configuration. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("ExceptConfig")
    @Expose
    private ExceptConfig ExceptConfig;

    /**
    * Custom block page settings. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("DropPageConfig")
    @Expose
    private DropPageConfig DropPageConfig;

    /**
    * Template configuration. specifies parameter usage for output only.
    */
    @SerializedName("TemplateConfig")
    @Expose
    private TemplateConfig TemplateConfig;

    /**
    * Slow attack configuration. if the parameter is null or not filled, use the last set configuration by default.
    */
    @SerializedName("SlowPostConfig")
    @Expose
    private SlowPostConfig SlowPostConfig;

    /**
    * Detect length limit configuration. for output usage only.
    */
    @SerializedName("DetectLengthLimitConfig")
    @Expose
    private DetectLengthLimitConfig DetectLengthLimitConfig;

    /**
     * Get Managed rule. if the parameter is null or not filled, use the last set configuration by default. 
     * @return WafConfig Managed rule. if the parameter is null or not filled, use the last set configuration by default.
     */
    public WafConfig getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set Managed rule. if the parameter is null or not filled, use the last set configuration by default.
     * @param WafConfig Managed rule. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setWafConfig(WafConfig WafConfig) {
        this.WafConfig = WafConfig;
    }

    /**
     * Get Rate limiting. if the parameter is null or not filled, the configuration last set will be used by default. 
     * @return RateLimitConfig Rate limiting. if the parameter is null or not filled, the configuration last set will be used by default.
     */
    public RateLimitConfig getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set Rate limiting. if the parameter is null or not filled, the configuration last set will be used by default.
     * @param RateLimitConfig Rate limiting. if the parameter is null or not filled, the configuration last set will be used by default.
     */
    public void setRateLimitConfig(RateLimitConfig RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get Custom rule. specifies if the parameter is null or not filled, use the last set configuration by default. 
     * @return AclConfig Custom rule. specifies if the parameter is null or not filled, use the last set configuration by default.
     */
    public AclConfig getAclConfig() {
        return this.AclConfig;
    }

    /**
     * Set Custom rule. specifies if the parameter is null or not filled, use the last set configuration by default.
     * @param AclConfig Custom rule. specifies if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setAclConfig(AclConfig AclConfig) {
        this.AclConfig = AclConfig;
    }

    /**
     * Get Bot configuration. if the parameter is null or not filled, use the last set configuration by default. 
     * @return BotConfig Bot configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public BotConfig getBotConfig() {
        return this.BotConfig;
    }

    /**
     * Set Bot configuration. if the parameter is null or not filled, use the last set configuration by default.
     * @param BotConfig Bot configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setBotConfig(BotConfig BotConfig) {
        this.BotConfig = BotConfig;
    }

    /**
     * Get Switch setting of the 7-layer protection. if the parameter is null or not filled, use the last set configuration by default. 
     * @return SwitchConfig Switch setting of the 7-layer protection. if the parameter is null or not filled, use the last set configuration by default.
     */
    public SwitchConfig getSwitchConfig() {
        return this.SwitchConfig;
    }

    /**
     * Set Switch setting of the 7-layer protection. if the parameter is null or not filled, use the last set configuration by default.
     * @param SwitchConfig Switch setting of the 7-layer protection. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setSwitchConfig(SwitchConfig SwitchConfig) {
        this.SwitchConfig = SwitchConfig;
    }

    /**
     * Get Basic access control. if the parameter is null or not filled, use the last set configuration by default. 
     * @return IpTableConfig Basic access control. if the parameter is null or not filled, use the last set configuration by default.
     */
    public IpTableConfig getIpTableConfig() {
        return this.IpTableConfig;
    }

    /**
     * Set Basic access control. if the parameter is null or not filled, use the last set configuration by default.
     * @param IpTableConfig Basic access control. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setIpTableConfig(IpTableConfig IpTableConfig) {
        this.IpTableConfig = IpTableConfig;
    }

    /**
     * Get Exception rule configuration. if the parameter is null or not filled, use the last set configuration by default. 
     * @return ExceptConfig Exception rule configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public ExceptConfig getExceptConfig() {
        return this.ExceptConfig;
    }

    /**
     * Set Exception rule configuration. if the parameter is null or not filled, use the last set configuration by default.
     * @param ExceptConfig Exception rule configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setExceptConfig(ExceptConfig ExceptConfig) {
        this.ExceptConfig = ExceptConfig;
    }

    /**
     * Get Custom block page settings. if the parameter is null or not filled, use the last set configuration by default. 
     * @return DropPageConfig Custom block page settings. if the parameter is null or not filled, use the last set configuration by default.
     */
    public DropPageConfig getDropPageConfig() {
        return this.DropPageConfig;
    }

    /**
     * Set Custom block page settings. if the parameter is null or not filled, use the last set configuration by default.
     * @param DropPageConfig Custom block page settings. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setDropPageConfig(DropPageConfig DropPageConfig) {
        this.DropPageConfig = DropPageConfig;
    }

    /**
     * Get Template configuration. specifies parameter usage for output only. 
     * @return TemplateConfig Template configuration. specifies parameter usage for output only.
     */
    public TemplateConfig getTemplateConfig() {
        return this.TemplateConfig;
    }

    /**
     * Set Template configuration. specifies parameter usage for output only.
     * @param TemplateConfig Template configuration. specifies parameter usage for output only.
     */
    public void setTemplateConfig(TemplateConfig TemplateConfig) {
        this.TemplateConfig = TemplateConfig;
    }

    /**
     * Get Slow attack configuration. if the parameter is null or not filled, use the last set configuration by default. 
     * @return SlowPostConfig Slow attack configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public SlowPostConfig getSlowPostConfig() {
        return this.SlowPostConfig;
    }

    /**
     * Set Slow attack configuration. if the parameter is null or not filled, use the last set configuration by default.
     * @param SlowPostConfig Slow attack configuration. if the parameter is null or not filled, use the last set configuration by default.
     */
    public void setSlowPostConfig(SlowPostConfig SlowPostConfig) {
        this.SlowPostConfig = SlowPostConfig;
    }

    /**
     * Get Detect length limit configuration. for output usage only. 
     * @return DetectLengthLimitConfig Detect length limit configuration. for output usage only.
     */
    public DetectLengthLimitConfig getDetectLengthLimitConfig() {
        return this.DetectLengthLimitConfig;
    }

    /**
     * Set Detect length limit configuration. for output usage only.
     * @param DetectLengthLimitConfig Detect length limit configuration. for output usage only.
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

