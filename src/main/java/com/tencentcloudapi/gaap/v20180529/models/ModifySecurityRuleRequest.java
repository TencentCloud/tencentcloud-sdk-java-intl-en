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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityRuleRequest extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name: up to 30 characters. The extra characters will be truncated.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Security policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Security rule action
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * A CIDR IP address associated with the rule
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * Protocol type
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port range. Valid values:
A single port: 80
Multiple ports: 80 and 443
Consecutive ports: 3306-20000
All ports: ALL
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name: up to 30 characters. The extra characters will be truncated. 
     * @return AliasName Rule name: up to 30 characters. The extra characters will be truncated.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Rule name: up to 30 characters. The extra characters will be truncated.
     * @param AliasName Rule name: up to 30 characters. The extra characters will be truncated.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

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
     * Get Security rule action 
     * @return RuleAction Security rule action
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set Security rule action
     * @param RuleAction Security rule action
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get A CIDR IP address associated with the rule 
     * @return SourceCidr A CIDR IP address associated with the rule
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set A CIDR IP address associated with the rule
     * @param SourceCidr A CIDR IP address associated with the rule
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get Protocol type 
     * @return Protocol Protocol type
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type
     * @param Protocol Protocol type
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port range. Valid values:
A single port: 80
Multiple ports: 80 and 443
Consecutive ports: 3306-20000
All ports: ALL 
     * @return DestPortRange Port range. Valid values:
A single port: 80
Multiple ports: 80 and 443
Consecutive ports: 3306-20000
All ports: ALL
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set Port range. Valid values:
A single port: 80
Multiple ports: 80 and 443
Consecutive ports: 3306-20000
All ports: ALL
     * @param DestPortRange Port range. Valid values:
A single port: 80
Multiple ports: 80 and 443
Consecutive ports: 3306-20000
All ports: ALL
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

    public ModifySecurityRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityRuleRequest(ModifySecurityRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DestPortRange != null) {
            this.DestPortRange = new String(source.DestPortRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);

    }
}

