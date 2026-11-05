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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRuleGroup extends AbstractModel {

    /**
    * Group name of the managed rule. If no rule group is specified, the default configuration is used. For the specific value of GroupId, refer to the product documentation.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Protection level of the managed rule group. Valid values: <li>loose: Loose. It only contains ultra-high risk rules. At this point, Action is required and RuleActions is invalid.</li><li>normal: Normal. It contains ultra-high risk and high-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>strict: Strict. It contains ultra-high risk, high-risk, and medium-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>extreme: Ultra-strict. It contains ultra-high risk, high-risk, medium-risk, and low-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>custom: Custom. Refined strategy. Configure the disposal method for each individual rule. At this point, the Action field is invalid. Use RuleActions to configure the refined strategy for individual rules.</li>	
    */
    @SerializedName("SensitivityLevel")
    @Expose
    private String SensitivityLevel;

    /**
    * Handling action of the managed rule group. Supported values for SecurityAction Name: <li>Deny: Block. Respond with an interception page;</li><li>Monitor: Observe. Do not process requests, log security events in logs;</li><li>Disabled: Not activated. Do not scan requests, skip this rule.</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * Specific configuration of rule items in the managed rule group. This configuration is effective only when SensitivityLevel is custom.
    */
    @SerializedName("RuleActions")
    @Expose
    private ManagedRuleAction [] RuleActions;

    /**
    * Managed rule group information. This is an output-only parameter.	
    */
    @SerializedName("MetaData")
    @Expose
    private ManagedRuleGroupMeta MetaData;

    /**
     * Get Group name of the managed rule. If no rule group is specified, the default configuration is used. For the specific value of GroupId, refer to the product documentation. 
     * @return GroupId Group name of the managed rule. If no rule group is specified, the default configuration is used. For the specific value of GroupId, refer to the product documentation.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group name of the managed rule. If no rule group is specified, the default configuration is used. For the specific value of GroupId, refer to the product documentation.
     * @param GroupId Group name of the managed rule. If no rule group is specified, the default configuration is used. For the specific value of GroupId, refer to the product documentation.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Protection level of the managed rule group. Valid values: <li>loose: Loose. It only contains ultra-high risk rules. At this point, Action is required and RuleActions is invalid.</li><li>normal: Normal. It contains ultra-high risk and high-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>strict: Strict. It contains ultra-high risk, high-risk, and medium-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>extreme: Ultra-strict. It contains ultra-high risk, high-risk, medium-risk, and low-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>custom: Custom. Refined strategy. Configure the disposal method for each individual rule. At this point, the Action field is invalid. Use RuleActions to configure the refined strategy for individual rules.</li>	 
     * @return SensitivityLevel Protection level of the managed rule group. Valid values: <li>loose: Loose. It only contains ultra-high risk rules. At this point, Action is required and RuleActions is invalid.</li><li>normal: Normal. It contains ultra-high risk and high-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>strict: Strict. It contains ultra-high risk, high-risk, and medium-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>extreme: Ultra-strict. It contains ultra-high risk, high-risk, medium-risk, and low-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>custom: Custom. Refined strategy. Configure the disposal method for each individual rule. At this point, the Action field is invalid. Use RuleActions to configure the refined strategy for individual rules.</li>	
     */
    public String getSensitivityLevel() {
        return this.SensitivityLevel;
    }

    /**
     * Set Protection level of the managed rule group. Valid values: <li>loose: Loose. It only contains ultra-high risk rules. At this point, Action is required and RuleActions is invalid.</li><li>normal: Normal. It contains ultra-high risk and high-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>strict: Strict. It contains ultra-high risk, high-risk, and medium-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>extreme: Ultra-strict. It contains ultra-high risk, high-risk, medium-risk, and low-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>custom: Custom. Refined strategy. Configure the disposal method for each individual rule. At this point, the Action field is invalid. Use RuleActions to configure the refined strategy for individual rules.</li>	
     * @param SensitivityLevel Protection level of the managed rule group. Valid values: <li>loose: Loose. It only contains ultra-high risk rules. At this point, Action is required and RuleActions is invalid.</li><li>normal: Normal. It contains ultra-high risk and high-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>strict: Strict. It contains ultra-high risk, high-risk, and medium-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>extreme: Ultra-strict. It contains ultra-high risk, high-risk, medium-risk, and low-risk rules. At this point, Action is required and RuleActions is invalid.</li><li>custom: Custom. Refined strategy. Configure the disposal method for each individual rule. At this point, the Action field is invalid. Use RuleActions to configure the refined strategy for individual rules.</li>	
     */
    public void setSensitivityLevel(String SensitivityLevel) {
        this.SensitivityLevel = SensitivityLevel;
    }

    /**
     * Get Handling action of the managed rule group. Supported values for SecurityAction Name: <li>Deny: Block. Respond with an interception page;</li><li>Monitor: Observe. Do not process requests, log security events in logs;</li><li>Disabled: Not activated. Do not scan requests, skip this rule.</li> 
     * @return Action Handling action of the managed rule group. Supported values for SecurityAction Name: <li>Deny: Block. Respond with an interception page;</li><li>Monitor: Observe. Do not process requests, log security events in logs;</li><li>Disabled: Not activated. Do not scan requests, skip this rule.</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Handling action of the managed rule group. Supported values for SecurityAction Name: <li>Deny: Block. Respond with an interception page;</li><li>Monitor: Observe. Do not process requests, log security events in logs;</li><li>Disabled: Not activated. Do not scan requests, skip this rule.</li>
     * @param Action Handling action of the managed rule group. Supported values for SecurityAction Name: <li>Deny: Block. Respond with an interception page;</li><li>Monitor: Observe. Do not process requests, log security events in logs;</li><li>Disabled: Not activated. Do not scan requests, skip this rule.</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get Specific configuration of rule items in the managed rule group. This configuration is effective only when SensitivityLevel is custom. 
     * @return RuleActions Specific configuration of rule items in the managed rule group. This configuration is effective only when SensitivityLevel is custom.
     */
    public ManagedRuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set Specific configuration of rule items in the managed rule group. This configuration is effective only when SensitivityLevel is custom.
     * @param RuleActions Specific configuration of rule items in the managed rule group. This configuration is effective only when SensitivityLevel is custom.
     */
    public void setRuleActions(ManagedRuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get Managed rule group information. This is an output-only parameter.	 
     * @return MetaData Managed rule group information. This is an output-only parameter.	
     */
    public ManagedRuleGroupMeta getMetaData() {
        return this.MetaData;
    }

    /**
     * Set Managed rule group information. This is an output-only parameter.	
     * @param MetaData Managed rule group information. This is an output-only parameter.	
     */
    public void setMetaData(ManagedRuleGroupMeta MetaData) {
        this.MetaData = MetaData;
    }

    public ManagedRuleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleGroup(ManagedRuleGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.SensitivityLevel != null) {
            this.SensitivityLevel = new String(source.SensitivityLevel);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.RuleActions != null) {
            this.RuleActions = new ManagedRuleAction[source.RuleActions.length];
            for (int i = 0; i < source.RuleActions.length; i++) {
                this.RuleActions[i] = new ManagedRuleAction(source.RuleActions[i]);
            }
        }
        if (source.MetaData != null) {
            this.MetaData = new ManagedRuleGroupMeta(source.MetaData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SensitivityLevel", this.SensitivityLevel);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

