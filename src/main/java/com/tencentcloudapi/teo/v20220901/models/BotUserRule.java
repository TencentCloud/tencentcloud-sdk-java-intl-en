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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotUserRule extends AbstractModel {

    /**
    * 
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Action. Valid values: 
<li>`drop`: Block;</li>
<li>`monitor`: Observe;</li>
<li>`trans`: Allow;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Random action;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * Details of the rule.
    */
    @SerializedName("AclConditions")
    @Expose
    private AclCondition [] AclConditions;

    /**
    * The rule weight. Value range: 0-100.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
    * The rule ID, which is only used as an output parameter.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * [Currently unavailable] Specify the random action and percentage.
    */
    @SerializedName("ExtendActions")
    @Expose
    private BotExtendAction [] ExtendActions;

    /**
    * The filter. Values:
<li>`sip`: Client IP</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FreqFields")
    @Expose
    private String [] FreqFields;

    /**
    * Updated time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The statistical dimension. Values:
<li>`source_to_eo`: Responses from the origin server to EdgeOne</li>
<li>`client_to_eo`: Requests from the client to EdgeOne</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FreqScope")
    @Expose
    private String [] FreqScope;

    /**
     * Get  
     * @return RuleName 
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 
     * @param RuleName 
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Action. Valid values: 
<li>`drop`: Block;</li>
<li>`monitor`: Observe;</li>
<li>`trans`: Allow;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Random action;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li> 
     * @return Action Action. Valid values: 
<li>`drop`: Block;</li>
<li>`monitor`: Observe;</li>
<li>`trans`: Allow;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Random action;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: 
<li>`drop`: Block;</li>
<li>`monitor`: Observe;</li>
<li>`trans`: Allow;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Random action;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     * @param Action Action. Valid values: 
<li>`drop`: Block;</li>
<li>`monitor`: Observe;</li>
<li>`trans`: Allow;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Random action;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on` 
     * @return RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     * @param RuleStatus The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>Default value: `on`
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Details of the rule. 
     * @return AclConditions Details of the rule.
     */
    public AclCondition [] getAclConditions() {
        return this.AclConditions;
    }

    /**
     * Set Details of the rule.
     * @param AclConditions Details of the rule.
     */
    public void setAclConditions(AclCondition [] AclConditions) {
        this.AclConditions = AclConditions;
    }

    /**
     * Get The rule weight. Value range: 0-100. 
     * @return RulePriority The rule weight. Value range: 0-100.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set The rule weight. Value range: 0-100.
     * @param RulePriority The rule weight. Value range: 0-100.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    /**
     * Get The rule ID, which is only used as an output parameter.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleID The rule ID, which is only used as an output parameter.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set The rule ID, which is only used as an output parameter.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RuleID The rule ID, which is only used as an output parameter.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get [Currently unavailable] Specify the random action and percentage. 
     * @return ExtendActions [Currently unavailable] Specify the random action and percentage.
     */
    public BotExtendAction [] getExtendActions() {
        return this.ExtendActions;
    }

    /**
     * Set [Currently unavailable] Specify the random action and percentage.
     * @param ExtendActions [Currently unavailable] Specify the random action and percentage.
     */
    public void setExtendActions(BotExtendAction [] ExtendActions) {
        this.ExtendActions = ExtendActions;
    }

    /**
     * Get The filter. Values:
<li>`sip`: Client IP</li>
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FreqFields The filter. Values:
<li>`sip`: Client IP</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getFreqFields() {
        return this.FreqFields;
    }

    /**
     * Set The filter. Values:
<li>`sip`: Client IP</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FreqFields The filter. Values:
<li>`sip`: Client IP</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFreqFields(String [] FreqFields) {
        this.FreqFields = FreqFields;
    }

    /**
     * Get Updated time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return UpdateTime Updated time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Updated time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param UpdateTime Updated time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The statistical dimension. Values:
<li>`source_to_eo`: Responses from the origin server to EdgeOne</li>
<li>`client_to_eo`: Requests from the client to EdgeOne</li>
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FreqScope The statistical dimension. Values:
<li>`source_to_eo`: Responses from the origin server to EdgeOne</li>
<li>`client_to_eo`: Requests from the client to EdgeOne</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getFreqScope() {
        return this.FreqScope;
    }

    /**
     * Set The statistical dimension. Values:
<li>`source_to_eo`: Responses from the origin server to EdgeOne</li>
<li>`client_to_eo`: Requests from the client to EdgeOne</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FreqScope The statistical dimension. Values:
<li>`source_to_eo`: Responses from the origin server to EdgeOne</li>
<li>`client_to_eo`: Requests from the client to EdgeOne</li>
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFreqScope(String [] FreqScope) {
        this.FreqScope = FreqScope;
    }

    public BotUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotUserRule(BotUserRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.AclConditions != null) {
            this.AclConditions = new AclCondition[source.AclConditions.length];
            for (int i = 0; i < source.AclConditions.length; i++) {
                this.AclConditions[i] = new AclCondition(source.AclConditions[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.ExtendActions != null) {
            this.ExtendActions = new BotExtendAction[source.ExtendActions.length];
            for (int i = 0; i < source.ExtendActions.length; i++) {
                this.ExtendActions[i] = new BotExtendAction(source.ExtendActions[i]);
            }
        }
        if (source.FreqFields != null) {
            this.FreqFields = new String[source.FreqFields.length];
            for (int i = 0; i < source.FreqFields.length; i++) {
                this.FreqFields[i] = new String(source.FreqFields[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FreqScope != null) {
            this.FreqScope = new String[source.FreqScope.length];
            for (int i = 0; i < source.FreqScope.length; i++) {
                this.FreqScope[i] = new String(source.FreqScope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamArrayObj(map, prefix + "AclConditions.", this.AclConditions);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamArrayObj(map, prefix + "ExtendActions.", this.ExtendActions);
        this.setParamArraySimple(map, prefix + "FreqFields.", this.FreqFields);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "FreqScope.", this.FreqScope);

    }
}

