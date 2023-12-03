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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotJavaScript extends AbstractModel {

    /**
    * Whether to enable bot JS policies. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Rule type, which can only be `file` currently.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Rule value. Valid values: `html` and `htm`.
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * Action. Valid values: `monitor`, `intercept`, `redirect`, and `captcha`.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Redirection target page
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Whether to enable bot JS policies. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable bot JS policies. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable bot JS policies. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable bot JS policies. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Rule type, which can only be `file` currently. 
     * @return RuleType Rule type, which can only be `file` currently.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type, which can only be `file` currently.
     * @param RuleType Rule type, which can only be `file` currently.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Rule value. Valid values: `html` and `htm`. 
     * @return RuleValue Rule value. Valid values: `html` and `htm`.
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set Rule value. Valid values: `html` and `htm`.
     * @param RuleValue Rule value. Valid values: `html` and `htm`.
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get Action. Valid values: `monitor`, `intercept`, `redirect`, and `captcha`. 
     * @return Action Action. Valid values: `monitor`, `intercept`, `redirect`, and `captcha`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: `monitor`, `intercept`, `redirect`, and `captcha`.
     * @param Action Action. Valid values: `monitor`, `intercept`, `redirect`, and `captcha`.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Redirection target page
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RedirectUrl Redirection target page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set Redirection target page
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RedirectUrl Redirection target page
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BotJavaScript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotJavaScript(BotJavaScript source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

