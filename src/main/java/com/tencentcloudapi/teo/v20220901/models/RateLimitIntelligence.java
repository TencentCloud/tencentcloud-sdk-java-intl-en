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

public class RateLimitIntelligence extends AbstractModel{

    /**
    * Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Action to be executed. Values:
<li>`monitor`: Observe</li>
<li>`alg`: Challenge</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The rule ID, which is only used as a response parameter.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Action to be executed. Values:
<li>`monitor`: Observe</li>
<li>`alg`: Challenge</li> 
     * @return Action Action to be executed. Values:
<li>`monitor`: Observe</li>
<li>`alg`: Challenge</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. Values:
<li>`monitor`: Observe</li>
<li>`alg`: Challenge</li>
     * @param Action Action to be executed. Values:
<li>`monitor`: Observe</li>
<li>`alg`: Challenge</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The rule ID, which is only used as a response parameter. 
     * @return RuleId The rule ID, which is only used as a response parameter.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID, which is only used as a response parameter.
     * @param RuleId The rule ID, which is only used as a response parameter.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public RateLimitIntelligence() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitIntelligence(RateLimitIntelligence source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

