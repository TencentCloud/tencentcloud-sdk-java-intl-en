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

public class RuleAction extends AbstractModel {

    /**
    * <p>Behavior type of the Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>ForwardGroup: The forwarding policy forwards to a terminal node group.</li><li>Drop: The forwarding policy drops the request.</li></ul>
    */
    @SerializedName("RuleActionType")
    @Expose
    private String RuleActionType;

    /**
    * <p>Layer 7 forwarding rule action value</p><p>This field is not required to input when RuleActionType is Drop. This field is required when RuleActionType is ForwardGroup, which requires filling in the custom terminal node group ID. The default terminal node group cannot be configured.</p>
    */
    @SerializedName("RuleActionValue")
    @Expose
    private String RuleActionValue;

    /**
     * Get <p>Behavior type of the Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>ForwardGroup: The forwarding policy forwards to a terminal node group.</li><li>Drop: The forwarding policy drops the request.</li></ul> 
     * @return RuleActionType <p>Behavior type of the Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>ForwardGroup: The forwarding policy forwards to a terminal node group.</li><li>Drop: The forwarding policy drops the request.</li></ul>
     */
    public String getRuleActionType() {
        return this.RuleActionType;
    }

    /**
     * Set <p>Behavior type of the Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>ForwardGroup: The forwarding policy forwards to a terminal node group.</li><li>Drop: The forwarding policy drops the request.</li></ul>
     * @param RuleActionType <p>Behavior type of the Layer 7 forwarding rule</p><p>Enumeration values:</p><ul><li>ForwardGroup: The forwarding policy forwards to a terminal node group.</li><li>Drop: The forwarding policy drops the request.</li></ul>
     */
    public void setRuleActionType(String RuleActionType) {
        this.RuleActionType = RuleActionType;
    }

    /**
     * Get <p>Layer 7 forwarding rule action value</p><p>This field is not required to input when RuleActionType is Drop. This field is required when RuleActionType is ForwardGroup, which requires filling in the custom terminal node group ID. The default terminal node group cannot be configured.</p> 
     * @return RuleActionValue <p>Layer 7 forwarding rule action value</p><p>This field is not required to input when RuleActionType is Drop. This field is required when RuleActionType is ForwardGroup, which requires filling in the custom terminal node group ID. The default terminal node group cannot be configured.</p>
     */
    public String getRuleActionValue() {
        return this.RuleActionValue;
    }

    /**
     * Set <p>Layer 7 forwarding rule action value</p><p>This field is not required to input when RuleActionType is Drop. This field is required when RuleActionType is ForwardGroup, which requires filling in the custom terminal node group ID. The default terminal node group cannot be configured.</p>
     * @param RuleActionValue <p>Layer 7 forwarding rule action value</p><p>This field is not required to input when RuleActionType is Drop. This field is required when RuleActionType is ForwardGroup, which requires filling in the custom terminal node group ID. The default terminal node group cannot be configured.</p>
     */
    public void setRuleActionValue(String RuleActionValue) {
        this.RuleActionValue = RuleActionValue;
    }

    public RuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleAction(RuleAction source) {
        if (source.RuleActionType != null) {
            this.RuleActionType = new String(source.RuleActionType);
        }
        if (source.RuleActionValue != null) {
            this.RuleActionValue = new String(source.RuleActionValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleActionType", this.RuleActionType);
        this.setParamSimple(map, prefix + "RuleActionValue", this.RuleActionValue);

    }
}

