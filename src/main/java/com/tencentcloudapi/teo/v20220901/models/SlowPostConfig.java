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

public class SlowPostConfig extends AbstractModel {

    /**
    * Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * First packet configuration.
    */
    @SerializedName("FirstPartConfig")
    @Expose
    private FirstPartConfig FirstPartConfig;

    /**
    * Specifies the basic configuration.
    */
    @SerializedName("SlowRateConfig")
    @Expose
    private SlowRateConfig SlowRateConfig;

    /**
    * Handling action for slow attack. valid values:.
<li>`monitor`: observe</li>.
<li>`drop`: block the request.</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specifies the Id of this rule.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get First packet configuration. 
     * @return FirstPartConfig First packet configuration.
     */
    public FirstPartConfig getFirstPartConfig() {
        return this.FirstPartConfig;
    }

    /**
     * Set First packet configuration.
     * @param FirstPartConfig First packet configuration.
     */
    public void setFirstPartConfig(FirstPartConfig FirstPartConfig) {
        this.FirstPartConfig = FirstPartConfig;
    }

    /**
     * Get Specifies the basic configuration. 
     * @return SlowRateConfig Specifies the basic configuration.
     */
    public SlowRateConfig getSlowRateConfig() {
        return this.SlowRateConfig;
    }

    /**
     * Set Specifies the basic configuration.
     * @param SlowRateConfig Specifies the basic configuration.
     */
    public void setSlowRateConfig(SlowRateConfig SlowRateConfig) {
        this.SlowRateConfig = SlowRateConfig;
    }

    /**
     * Get Handling action for slow attack. valid values:.
<li>`monitor`: observe</li>.
<li>`drop`: block the request.</li>. 
     * @return Action Handling action for slow attack. valid values:.
<li>`monitor`: observe</li>.
<li>`drop`: block the request.</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Handling action for slow attack. valid values:.
<li>`monitor`: observe</li>.
<li>`drop`: block the request.</li>.
     * @param Action Handling action for slow attack. valid values:.
<li>`monitor`: observe</li>.
<li>`drop`: block the request.</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specifies the Id of this rule. 
     * @return RuleId Specifies the Id of this rule.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Specifies the Id of this rule.
     * @param RuleId Specifies the Id of this rule.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public SlowPostConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowPostConfig(SlowPostConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FirstPartConfig != null) {
            this.FirstPartConfig = new FirstPartConfig(source.FirstPartConfig);
        }
        if (source.SlowRateConfig != null) {
            this.SlowRateConfig = new SlowRateConfig(source.SlowRateConfig);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "FirstPartConfig.", this.FirstPartConfig);
        this.setParamObj(map, prefix + "SlowRateConfig.", this.SlowRateConfig);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

