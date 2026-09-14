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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel {

    /**
    * <p>Condition type of Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>Path: Path</li></ul>
    */
    @SerializedName("RuleConditionType")
    @Expose
    private String RuleConditionType;

    /**
    * <p>Layer 7 forwarding rule condition value</p><p>Parameter format: The format must match the regular expression: ^[a-zA-Z0-9_.-/]{1,80}$</p><p>The array length cannot exceed 1.</p>
    */
    @SerializedName("RuleConditionValue")
    @Expose
    private String [] RuleConditionValue;

    /**
     * Get <p>Condition type of Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>Path: Path</li></ul> 
     * @return RuleConditionType <p>Condition type of Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>Path: Path</li></ul>
     */
    public String getRuleConditionType() {
        return this.RuleConditionType;
    }

    /**
     * Set <p>Condition type of Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>Path: Path</li></ul>
     * @param RuleConditionType <p>Condition type of Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>Path: Path</li></ul>
     */
    public void setRuleConditionType(String RuleConditionType) {
        this.RuleConditionType = RuleConditionType;
    }

    /**
     * Get <p>Layer 7 forwarding rule condition value</p><p>Parameter format: The format must match the regular expression: ^[a-zA-Z0-9_.-/]{1,80}$</p><p>The array length cannot exceed 1.</p> 
     * @return RuleConditionValue <p>Layer 7 forwarding rule condition value</p><p>Parameter format: The format must match the regular expression: ^[a-zA-Z0-9_.-/]{1,80}$</p><p>The array length cannot exceed 1.</p>
     */
    public String [] getRuleConditionValue() {
        return this.RuleConditionValue;
    }

    /**
     * Set <p>Layer 7 forwarding rule condition value</p><p>Parameter format: The format must match the regular expression: ^[a-zA-Z0-9_.-/]{1,80}$</p><p>The array length cannot exceed 1.</p>
     * @param RuleConditionValue <p>Layer 7 forwarding rule condition value</p><p>Parameter format: The format must match the regular expression: ^[a-zA-Z0-9_.-/]{1,80}$</p><p>The array length cannot exceed 1.</p>
     */
    public void setRuleConditionValue(String [] RuleConditionValue) {
        this.RuleConditionValue = RuleConditionValue;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.RuleConditionType != null) {
            this.RuleConditionType = new String(source.RuleConditionType);
        }
        if (source.RuleConditionValue != null) {
            this.RuleConditionValue = new String[source.RuleConditionValue.length];
            for (int i = 0; i < source.RuleConditionValue.length; i++) {
                this.RuleConditionValue[i] = new String(source.RuleConditionValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleConditionType", this.RuleConditionType);
        this.setParamArraySimple(map, prefix + "RuleConditionValue.", this.RuleConditionValue);

    }
}

