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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnWafConfig extends AbstractModel {

    /**
    * Whether to enable SCDN WAF configuration. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * WAF protection mode. Valid values: `intercept` and `observe`. Default value: `intercept`.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Redirection error page
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

    /**
    * Whether to enable webshell blocking. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("WebShellSwitch")
    @Expose
    private String WebShellSwitch;

    /**
    * Attack blocking rules
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private ScdnWafRule [] Rules;

    /**
    * WAF rule level. Valid values: 100, 200, and 300.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Whether to enable WAF sub-rules. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubRuleSwitch")
    @Expose
    private WafSubRuleStatus [] SubRuleSwitch;

    /**
     * Get Whether to enable SCDN WAF configuration. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable SCDN WAF configuration. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable SCDN WAF configuration. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable SCDN WAF configuration. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get WAF protection mode. Valid values: `intercept` and `observe`. Default value: `intercept`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Mode WAF protection mode. Valid values: `intercept` and `observe`. Default value: `intercept`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set WAF protection mode. Valid values: `intercept` and `observe`. Default value: `intercept`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Mode WAF protection mode. Valid values: `intercept` and `observe`. Default value: `intercept`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Redirection error page
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ErrorPage Redirection error page
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Redirection error page
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ErrorPage Redirection error page
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Get Whether to enable webshell blocking. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return WebShellSwitch Whether to enable webshell blocking. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getWebShellSwitch() {
        return this.WebShellSwitch;
    }

    /**
     * Set Whether to enable webshell blocking. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param WebShellSwitch Whether to enable webshell blocking. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setWebShellSwitch(String WebShellSwitch) {
        this.WebShellSwitch = WebShellSwitch;
    }

    /**
     * Get Attack blocking rules
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Rules Attack blocking rules
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnWafRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Attack blocking rules
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Rules Attack blocking rules
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRules(ScdnWafRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get WAF rule level. Valid values: 100, 200, and 300.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Level WAF rule level. Valid values: 100, 200, and 300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set WAF rule level. Valid values: 100, 200, and 300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Level WAF rule level. Valid values: 100, 200, and 300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Whether to enable WAF sub-rules. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SubRuleSwitch Whether to enable WAF sub-rules. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public WafSubRuleStatus [] getSubRuleSwitch() {
        return this.SubRuleSwitch;
    }

    /**
     * Set Whether to enable WAF sub-rules. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SubRuleSwitch Whether to enable WAF sub-rules. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubRuleSwitch(WafSubRuleStatus [] SubRuleSwitch) {
        this.SubRuleSwitch = SubRuleSwitch;
    }

    public ScdnWafConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnWafConfig(ScdnWafConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ScdnErrorPage(source.ErrorPage);
        }
        if (source.WebShellSwitch != null) {
            this.WebShellSwitch = new String(source.WebShellSwitch);
        }
        if (source.Rules != null) {
            this.Rules = new ScdnWafRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ScdnWafRule(source.Rules[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SubRuleSwitch != null) {
            this.SubRuleSwitch = new WafSubRuleStatus[source.SubRuleSwitch.length];
            for (int i = 0; i < source.SubRuleSwitch.length; i++) {
                this.SubRuleSwitch[i] = new WafSubRuleStatus(source.SubRuleSwitch[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);
        this.setParamSimple(map, prefix + "WebShellSwitch", this.WebShellSwitch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArrayObj(map, prefix + "SubRuleSwitch.", this.SubRuleSwitch);

    }
}

