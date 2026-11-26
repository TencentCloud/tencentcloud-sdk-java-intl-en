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
    * Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
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
    * Basic configuration.
    */
    @SerializedName("SlowRateConfig")
    @Expose
    private SlowRateConfig SlowRateConfig;

    /**
    * Handling action for slow attacks. Valid values:
<li>monitor: observation;</li>
<li>drop: block.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule Id.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
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
     * Get Basic configuration. 
     * @return SlowRateConfig Basic configuration.
     */
    public SlowRateConfig getSlowRateConfig() {
        return this.SlowRateConfig;
    }

    /**
     * Set Basic configuration.
     * @param SlowRateConfig Basic configuration.
     */
    public void setSlowRateConfig(SlowRateConfig SlowRateConfig) {
        this.SlowRateConfig = SlowRateConfig;
    }

    /**
     * Get Handling action for slow attacks. Valid values:
<li>monitor: observation;</li>
<li>drop: block.</li> 
     * @return Action Handling action for slow attacks. Valid values:
<li>monitor: observation;</li>
<li>drop: block.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Handling action for slow attacks. Valid values:
<li>monitor: observation;</li>
<li>drop: block.</li>
     * @param Action Handling action for slow attacks. Valid values:
<li>monitor: observation;</li>
<li>drop: block.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Rule Id. 
     * @return RuleId Rule Id.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule Id.
     * @param RuleId Rule Id.
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

