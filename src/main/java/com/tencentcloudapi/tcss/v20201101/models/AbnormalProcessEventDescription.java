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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessEventDescription extends AbstractModel {

    /**
    * Event rule
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Solution
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * Event remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Details of the hit rule
    */
    @SerializedName("MatchRule")
    @Expose
    private AbnormalProcessChildRuleInfo MatchRule;

    /**
    * Name of the hit rule. Valid values: `PROXY_TOOL` (proxy); `TRANSFER_CONTROL` (lateral movement); `ATTACK_CMD` (malicious command); `REVERSE_SHELL` (reverse shell); `FILELESS` (fileless execution); `RISK_CMD` (high-risk command); `ABNORMAL_CHILD_PROC` (unusual start found in the child process of the sensitive service); `USER_DEFINED_RULE` (custom rule).
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * ID of the hit rule
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * Name of the hit policy. Valid values: `SYSTEM_DEFINED_RULE` (preset policy); name of the custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get Event rule 
     * @return Description Event rule
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Event rule
     * @param Description Event rule
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Solution 
     * @return Solution Solution
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set Solution
     * @param Solution Solution
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get Event remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Event remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Event remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Event remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Details of the hit rule 
     * @return MatchRule Details of the hit rule
     */
    public AbnormalProcessChildRuleInfo getMatchRule() {
        return this.MatchRule;
    }

    /**
     * Set Details of the hit rule
     * @param MatchRule Details of the hit rule
     */
    public void setMatchRule(AbnormalProcessChildRuleInfo MatchRule) {
        this.MatchRule = MatchRule;
    }

    /**
     * Get Name of the hit rule. Valid values: `PROXY_TOOL` (proxy); `TRANSFER_CONTROL` (lateral movement); `ATTACK_CMD` (malicious command); `REVERSE_SHELL` (reverse shell); `FILELESS` (fileless execution); `RISK_CMD` (high-risk command); `ABNORMAL_CHILD_PROC` (unusual start found in the child process of the sensitive service); `USER_DEFINED_RULE` (custom rule). 
     * @return RuleName Name of the hit rule. Valid values: `PROXY_TOOL` (proxy); `TRANSFER_CONTROL` (lateral movement); `ATTACK_CMD` (malicious command); `REVERSE_SHELL` (reverse shell); `FILELESS` (fileless execution); `RISK_CMD` (high-risk command); `ABNORMAL_CHILD_PROC` (unusual start found in the child process of the sensitive service); `USER_DEFINED_RULE` (custom rule).
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Name of the hit rule. Valid values: `PROXY_TOOL` (proxy); `TRANSFER_CONTROL` (lateral movement); `ATTACK_CMD` (malicious command); `REVERSE_SHELL` (reverse shell); `FILELESS` (fileless execution); `RISK_CMD` (high-risk command); `ABNORMAL_CHILD_PROC` (unusual start found in the child process of the sensitive service); `USER_DEFINED_RULE` (custom rule).
     * @param RuleName Name of the hit rule. Valid values: `PROXY_TOOL` (proxy); `TRANSFER_CONTROL` (lateral movement); `ATTACK_CMD` (malicious command); `REVERSE_SHELL` (reverse shell); `FILELESS` (fileless execution); `RISK_CMD` (high-risk command); `ABNORMAL_CHILD_PROC` (unusual start found in the child process of the sensitive service); `USER_DEFINED_RULE` (custom rule).
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get ID of the hit rule 
     * @return RuleId ID of the hit rule
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the hit rule
     * @param RuleId ID of the hit rule
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperationTime Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperationTime Last processing time of the event
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get Name of the hit policy. Valid values: `SYSTEM_DEFINED_RULE` (preset policy); name of the custom policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Name of the hit policy. Valid values: `SYSTEM_DEFINED_RULE` (preset policy); name of the custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Name of the hit policy. Valid values: `SYSTEM_DEFINED_RULE` (preset policy); name of the custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Name of the hit policy. Valid values: `SYSTEM_DEFINED_RULE` (preset policy); name of the custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public AbnormalProcessEventDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessEventDescription(AbnormalProcessEventDescription source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MatchRule != null) {
            this.MatchRule = new AbnormalProcessChildRuleInfo(source.MatchRule);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "MatchRule.", this.MatchRule);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

