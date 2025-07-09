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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityRulesRequest extends AbstractModel {

    /**
    * Security policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * List of access rules
    */
    @SerializedName("RuleList")
    @Expose
    private SecurityPolicyRuleIn [] RuleList;

    /**
     * Get Security policy ID 
     * @return PolicyId Security policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Security policy ID
     * @param PolicyId Security policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get List of access rules 
     * @return RuleList List of access rules
     */
    public SecurityPolicyRuleIn [] getRuleList() {
        return this.RuleList;
    }

    /**
     * Set List of access rules
     * @param RuleList List of access rules
     */
    public void setRuleList(SecurityPolicyRuleIn [] RuleList) {
        this.RuleList = RuleList;
    }

    public CreateSecurityRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityRulesRequest(CreateSecurityRulesRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.RuleList != null) {
            this.RuleList = new SecurityPolicyRuleIn[source.RuleList.length];
            for (int i = 0; i < source.RuleList.length; i++) {
                this.RuleList[i] = new SecurityPolicyRuleIn(source.RuleList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);

    }
}

