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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnWafConfig extends AbstractModel{

    /**
    * Whether to enable WAF. Valid values: `on` and `off`.
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
    * Whether to enable Web shell blocking. Valid values: `on` and `off`. Default value: `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
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
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * WAF sub-rule switch
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubRuleSwitch")
    @Expose
    private WafSubRuleStatus [] SubRuleSwitch;

    /**
     * Get Whether to enable WAF. Valid values: `on` and `off`. 
     * @return Switch Whether to enable WAF. Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable WAF. Valid values: `on` and `off`.
     * @param Switch Whether to enable WAF. Valid values: `on` and `off`.
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
     * Get Whether to enable Web shell blocking. Valid values: `on` and `off`. Default value: `off`.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return WebShellSwitch Whether to enable Web shell blocking. Valid values: `on` and `off`. Default value: `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getWebShellSwitch() {
        return this.WebShellSwitch;
    }

    /**
     * Set Whether to enable Web shell blocking. Valid values: `on` and `off`. Default value: `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param WebShellSwitch Whether to enable Web shell blocking. Valid values: `on` and `off`. Default value: `off`.
Note: this field may return `null`, indicating that no valid values can be obtained.
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
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Level WAF rule level. Valid values: 100, 200, and 300.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set WAF rule level. Valid values: 100, 200, and 300.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Level WAF rule level. Valid values: 100, 200, and 300.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get WAF sub-rule switch
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SubRuleSwitch WAF sub-rule switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public WafSubRuleStatus [] getSubRuleSwitch() {
        return this.SubRuleSwitch;
    }

    /**
     * Set WAF sub-rule switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SubRuleSwitch WAF sub-rule switch
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubRuleSwitch(WafSubRuleStatus [] SubRuleSwitch) {
        this.SubRuleSwitch = SubRuleSwitch;
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

