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
    * Detect slow attacks by the transfer period of the first 8 KB of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FirstPartConfig")
    @Expose
    private FirstPartConfig FirstPartConfig;

    /**
    * Detect slow attacks by the data rate of the main body (excluding the first 8 KB) of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SlowRateConfig")
    @Expose
    private SlowRateConfig SlowRateConfig;

    /**
    * The action to taken when a slow attack is detected. Values:
<li>`monitor`: Observe</li>
<li>`drop`: Block the request</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
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
     * Get Detect slow attacks by the transfer period of the first 8 KB of requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FirstPartConfig Detect slow attacks by the transfer period of the first 8 KB of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public FirstPartConfig getFirstPartConfig() {
        return this.FirstPartConfig;
    }

    /**
     * Set Detect slow attacks by the transfer period of the first 8 KB of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FirstPartConfig Detect slow attacks by the transfer period of the first 8 KB of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFirstPartConfig(FirstPartConfig FirstPartConfig) {
        this.FirstPartConfig = FirstPartConfig;
    }

    /**
     * Get Detect slow attacks by the data rate of the main body (excluding the first 8 KB) of requests
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SlowRateConfig Detect slow attacks by the data rate of the main body (excluding the first 8 KB) of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public SlowRateConfig getSlowRateConfig() {
        return this.SlowRateConfig;
    }

    /**
     * Set Detect slow attacks by the data rate of the main body (excluding the first 8 KB) of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SlowRateConfig Detect slow attacks by the data rate of the main body (excluding the first 8 KB) of requests
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSlowRateConfig(SlowRateConfig SlowRateConfig) {
        this.SlowRateConfig = SlowRateConfig;
    }

    /**
     * Get The action to taken when a slow attack is detected. Values:
<li>`monitor`: Observe</li>
<li>`drop`: Block the request</li>
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Action The action to taken when a slow attack is detected. Values:
<li>`monitor`: Observe</li>
<li>`drop`: Block the request</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action to taken when a slow attack is detected. Values:
<li>`monitor`: Observe</li>
<li>`drop`: Block the request</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Action The action to taken when a slow attack is detected. Values:
<li>`monitor`: Observe</li>
<li>`drop`: Block the request</li>
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleId ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleId ID of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
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

