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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchImageAutoAuthorizedRuleRequest extends AbstractModel{

    /**
    * Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get Whether the rule takes effect. Valid values: `0` (no); `1` (yes). 
     * @return IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     * @param IsEnabled Whether the rule takes effect. Valid values: `0` (no); `1` (yes).
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public SwitchImageAutoAuthorizedRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchImageAutoAuthorizedRuleRequest(SwitchImageAutoAuthorizedRuleRequest source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

