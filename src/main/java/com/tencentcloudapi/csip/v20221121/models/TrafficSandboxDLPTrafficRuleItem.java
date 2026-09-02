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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxDLPTrafficRuleItem extends AbstractModel {

    /**
    * Sub-rule name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Regular expression content (Hyperscan-compatible)
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
     * Get Sub-rule name 
     * @return RuleName Sub-rule name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Sub-rule name
     * @param RuleName Sub-rule name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Regular expression content (Hyperscan-compatible) 
     * @return RuleContent Regular expression content (Hyperscan-compatible)
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set Regular expression content (Hyperscan-compatible)
     * @param RuleContent Regular expression content (Hyperscan-compatible)
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    public TrafficSandboxDLPTrafficRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPTrafficRuleItem(TrafficSandboxDLPTrafficRuleItem source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);

    }
}

