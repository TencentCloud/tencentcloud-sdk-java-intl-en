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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyRuleOut extends AbstractModel{

    /**
    * Policy: Allow (ACCEPT) or reject (DROP).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Source IP or IP range of the request.
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * Rule alias
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Target port range
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Protocol type to be matched (TCP/UDP)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get Policy: Allow (ACCEPT) or reject (DROP). 
     * @return Action Policy: Allow (ACCEPT) or reject (DROP).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy: Allow (ACCEPT) or reject (DROP).
     * @param Action Policy: Allow (ACCEPT) or reject (DROP).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Source IP or IP range of the request. 
     * @return SourceCidr Source IP or IP range of the request.
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set Source IP or IP range of the request.
     * @param SourceCidr Source IP or IP range of the request.
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get Rule alias 
     * @return AliasName Rule alias
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Rule alias
     * @param AliasName Rule alias
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Target port range
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DestPortRange Target port range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set Target port range
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DestPortRange Target port range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

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
     * Get Protocol type to be matched (TCP/UDP)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol type to be matched (TCP/UDP)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol type to be matched (TCP/UDP)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol type to be matched (TCP/UDP)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get  
     * @return PolicyId 
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 
     * @param PolicyId 
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

