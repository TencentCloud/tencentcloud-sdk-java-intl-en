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

public class ZoneFullConfig extends AbstractModel {

    /**
    * <p>Syntax version. It defaults to 1.0. An error will be reported if you input other values.</p>
    */
    @SerializedName("FormatVersion")
    @Expose
    private String FormatVersion;

    /**
    * <p>Site-level configuration, including all configuration items in "Site Acceleration". All items are required; otherwise, the configuration is invalid.</p>
    */
    @SerializedName("ZoneConfig")
    @Expose
    private ZoneConfig ZoneConfig;

    /**
    * <p>Site-level custom variable configuration, including variable definition and variable operations.</p>
    */
    @SerializedName("ZoneCustomVariables")
    @Expose
    private ZoneCustomVariables ZoneCustomVariables;

    /**
    * <p>Rule-level configuration, including all rules in the rule engine. The array can be empty, indicating that no rules are enabled.</p>
    */
    @SerializedName("Rules")
    @Expose
    private ConfigGroupRuleEngineItem [] Rules;

    /**
    * <p>Web security protection settings, corresponding to the functions supported in "Security Protection - Web Protection" in the console.</p>
    */
    @SerializedName("WebSecurity")
    @Expose
    private WebSecurity WebSecurity;

    /**
    * <p>Edge function trigger rule configuration, including all rules in the edge function. The array can be empty, indicating that no rules are enabled.</p>
    */
    @SerializedName("FunctionTriggers")
    @Expose
    private ConfigGroupFunctionTrigger [] FunctionTriggers;

    /**
     * Get <p>Syntax version. It defaults to 1.0. An error will be reported if you input other values.</p> 
     * @return FormatVersion <p>Syntax version. It defaults to 1.0. An error will be reported if you input other values.</p>
     */
    public String getFormatVersion() {
        return this.FormatVersion;
    }

    /**
     * Set <p>Syntax version. It defaults to 1.0. An error will be reported if you input other values.</p>
     * @param FormatVersion <p>Syntax version. It defaults to 1.0. An error will be reported if you input other values.</p>
     */
    public void setFormatVersion(String FormatVersion) {
        this.FormatVersion = FormatVersion;
    }

    /**
     * Get <p>Site-level configuration, including all configuration items in "Site Acceleration". All items are required; otherwise, the configuration is invalid.</p> 
     * @return ZoneConfig <p>Site-level configuration, including all configuration items in "Site Acceleration". All items are required; otherwise, the configuration is invalid.</p>
     */
    public ZoneConfig getZoneConfig() {
        return this.ZoneConfig;
    }

    /**
     * Set <p>Site-level configuration, including all configuration items in "Site Acceleration". All items are required; otherwise, the configuration is invalid.</p>
     * @param ZoneConfig <p>Site-level configuration, including all configuration items in "Site Acceleration". All items are required; otherwise, the configuration is invalid.</p>
     */
    public void setZoneConfig(ZoneConfig ZoneConfig) {
        this.ZoneConfig = ZoneConfig;
    }

    /**
     * Get <p>Site-level custom variable configuration, including variable definition and variable operations.</p> 
     * @return ZoneCustomVariables <p>Site-level custom variable configuration, including variable definition and variable operations.</p>
     */
    public ZoneCustomVariables getZoneCustomVariables() {
        return this.ZoneCustomVariables;
    }

    /**
     * Set <p>Site-level custom variable configuration, including variable definition and variable operations.</p>
     * @param ZoneCustomVariables <p>Site-level custom variable configuration, including variable definition and variable operations.</p>
     */
    public void setZoneCustomVariables(ZoneCustomVariables ZoneCustomVariables) {
        this.ZoneCustomVariables = ZoneCustomVariables;
    }

    /**
     * Get <p>Rule-level configuration, including all rules in the rule engine. The array can be empty, indicating that no rules are enabled.</p> 
     * @return Rules <p>Rule-level configuration, including all rules in the rule engine. The array can be empty, indicating that no rules are enabled.</p>
     */
    public ConfigGroupRuleEngineItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>Rule-level configuration, including all rules in the rule engine. The array can be empty, indicating that no rules are enabled.</p>
     * @param Rules <p>Rule-level configuration, including all rules in the rule engine. The array can be empty, indicating that no rules are enabled.</p>
     */
    public void setRules(ConfigGroupRuleEngineItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>Web security protection settings, corresponding to the functions supported in "Security Protection - Web Protection" in the console.</p> 
     * @return WebSecurity <p>Web security protection settings, corresponding to the functions supported in "Security Protection - Web Protection" in the console.</p>
     */
    public WebSecurity getWebSecurity() {
        return this.WebSecurity;
    }

    /**
     * Set <p>Web security protection settings, corresponding to the functions supported in "Security Protection - Web Protection" in the console.</p>
     * @param WebSecurity <p>Web security protection settings, corresponding to the functions supported in "Security Protection - Web Protection" in the console.</p>
     */
    public void setWebSecurity(WebSecurity WebSecurity) {
        this.WebSecurity = WebSecurity;
    }

    /**
     * Get <p>Edge function trigger rule configuration, including all rules in the edge function. The array can be empty, indicating that no rules are enabled.</p> 
     * @return FunctionTriggers <p>Edge function trigger rule configuration, including all rules in the edge function. The array can be empty, indicating that no rules are enabled.</p>
     */
    public ConfigGroupFunctionTrigger [] getFunctionTriggers() {
        return this.FunctionTriggers;
    }

    /**
     * Set <p>Edge function trigger rule configuration, including all rules in the edge function. The array can be empty, indicating that no rules are enabled.</p>
     * @param FunctionTriggers <p>Edge function trigger rule configuration, including all rules in the edge function. The array can be empty, indicating that no rules are enabled.</p>
     */
    public void setFunctionTriggers(ConfigGroupFunctionTrigger [] FunctionTriggers) {
        this.FunctionTriggers = FunctionTriggers;
    }

    public ZoneFullConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneFullConfig(ZoneFullConfig source) {
        if (source.FormatVersion != null) {
            this.FormatVersion = new String(source.FormatVersion);
        }
        if (source.ZoneConfig != null) {
            this.ZoneConfig = new ZoneConfig(source.ZoneConfig);
        }
        if (source.ZoneCustomVariables != null) {
            this.ZoneCustomVariables = new ZoneCustomVariables(source.ZoneCustomVariables);
        }
        if (source.Rules != null) {
            this.Rules = new ConfigGroupRuleEngineItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ConfigGroupRuleEngineItem(source.Rules[i]);
            }
        }
        if (source.WebSecurity != null) {
            this.WebSecurity = new WebSecurity(source.WebSecurity);
        }
        if (source.FunctionTriggers != null) {
            this.FunctionTriggers = new ConfigGroupFunctionTrigger[source.FunctionTriggers.length];
            for (int i = 0; i < source.FunctionTriggers.length; i++) {
                this.FunctionTriggers[i] = new ConfigGroupFunctionTrigger(source.FunctionTriggers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FormatVersion", this.FormatVersion);
        this.setParamObj(map, prefix + "ZoneConfig.", this.ZoneConfig);
        this.setParamObj(map, prefix + "ZoneCustomVariables.", this.ZoneCustomVariables);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamObj(map, prefix + "WebSecurity.", this.WebSecurity);
        this.setParamArrayObj(map, prefix + "FunctionTriggers.", this.FunctionTriggers);

    }
}

