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

public class IpTableRule extends AbstractModel{

    /**
    * The action. Values:
<li>`drop`: Block</li>
<li>`trans`: Allow</li>
<li>`monitor`: Observe</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The matching dimension. Values:
<li>`ip`: Match by IP.</li>
<li>`area`: Match by IP region.</li>
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * Matching method. It defaults to `equal` if it’s left empty.
Values: 
<li>`is_empty`: The field is empty.</li>
<li>`not_exists`: The configuration item does not exist.</li>
<li>`include`: Include</li>
<li>`not_include`: Do not include</li>
<li>`equal`: Equal to</li>
<li>`not_equal`: Not equal to</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The rule ID, which is only used as an output parameter.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * The update time, which is only used as an output parameter.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The rule status. A null value indicates that the rule is enabled. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Matching content. It’s not required when `Operator` is `is_emty` or `not_exists`. 
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get The action. Values:
<li>`drop`: Block</li>
<li>`trans`: Allow</li>
<li>`monitor`: Observe</li> 
     * @return Action The action. Values:
<li>`drop`: Block</li>
<li>`trans`: Allow</li>
<li>`monitor`: Observe</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action. Values:
<li>`drop`: Block</li>
<li>`trans`: Allow</li>
<li>`monitor`: Observe</li>
     * @param Action The action. Values:
<li>`drop`: Block</li>
<li>`trans`: Allow</li>
<li>`monitor`: Observe</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The matching dimension. Values:
<li>`ip`: Match by IP.</li>
<li>`area`: Match by IP region.</li> 
     * @return MatchFrom The matching dimension. Values:
<li>`ip`: Match by IP.</li>
<li>`area`: Match by IP region.</li>
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set The matching dimension. Values:
<li>`ip`: Match by IP.</li>
<li>`area`: Match by IP region.</li>
     * @param MatchFrom The matching dimension. Values:
<li>`ip`: Match by IP.</li>
<li>`area`: Match by IP region.</li>
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get Matching method. It defaults to `equal` if it’s left empty.
Values: 
<li>`is_empty`: The field is empty.</li>
<li>`not_exists`: The configuration item does not exist.</li>
<li>`include`: Include</li>
<li>`not_include`: Do not include</li>
<li>`equal`: Equal to</li>
<li>`not_equal`: Not equal to</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operator Matching method. It defaults to `equal` if it’s left empty.
Values: 
<li>`is_empty`: The field is empty.</li>
<li>`not_exists`: The configuration item does not exist.</li>
<li>`include`: Include</li>
<li>`not_include`: Do not include</li>
<li>`equal`: Equal to</li>
<li>`not_equal`: Not equal to</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Matching method. It defaults to `equal` if it’s left empty.
Values: 
<li>`is_empty`: The field is empty.</li>
<li>`not_exists`: The configuration item does not exist.</li>
<li>`include`: Include</li>
<li>`not_include`: Do not include</li>
<li>`equal`: Equal to</li>
<li>`not_equal`: Not equal to</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operator Matching method. It defaults to `equal` if it’s left empty.
Values: 
<li>`is_empty`: The field is empty.</li>
<li>`not_exists`: The configuration item does not exist.</li>
<li>`include`: Include</li>
<li>`not_include`: Do not include</li>
<li>`equal`: Equal to</li>
<li>`not_equal`: Not equal to</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The rule ID, which is only used as an output parameter. 
     * @return RuleID The rule ID, which is only used as an output parameter.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set The rule ID, which is only used as an output parameter.
     * @param RuleID The rule ID, which is only used as an output parameter.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get The update time, which is only used as an output parameter. 
     * @return UpdateTime The update time, which is only used as an output parameter.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time, which is only used as an output parameter.
     * @param UpdateTime The update time, which is only used as an output parameter.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The rule status. A null value indicates that the rule is enabled. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The rule status. A null value indicates that the rule is enabled. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The rule status. A null value indicates that the rule is enabled. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The rule status. A null value indicates that the rule is enabled. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The rule name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName The rule name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Matching content. It’s not required when `Operator` is `is_emty` or `not_exists`.  
     * @return MatchContent Matching content. It’s not required when `Operator` is `is_emty` or `not_exists`. 
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set Matching content. It’s not required when `Operator` is `is_emty` or `not_exists`. 
     * @param MatchContent Matching content. It’s not required when `Operator` is `is_emty` or `not_exists`. 
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public IpTableRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTableRule(IpTableRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

