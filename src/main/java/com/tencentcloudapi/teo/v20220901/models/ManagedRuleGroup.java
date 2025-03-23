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

public class ManagedRuleGroup extends AbstractModel {

    /**
    * Name of the managed rule group, if the configuration for the rule group is not specified, it will be processed by default, refer to product documentation for the specific value of GroupId.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Protection level of the managed rule group. Values: <li>`loose`: lenient, only contain ultra-high risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`normal`: normal, contain ultra-high risk and high-risk rules, at this point,Action parameter needs configured instead of RuleActions parameter;</li> <li>`strict`: strict, contains ultra-high risk, high-risk and medium-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`extreme`: super strict, contains ultra-high risk, high-risk, medium-risk and low-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`custom`: custom, refined strategy, configure the RuleActions parameter for each individual rule, at this point, the Action field is invalid, use RuleActions to configure the refined strategy for each individual rule.</li>.
    */
    @SerializedName("SensitivityLevel")
    @Expose
    private String SensitivityLevel;

    /**
    * Action for ManagedRuleGroup. the Name parameter value of SecurityAction supports: <li>`Deny`: block and respond with a block page;</li> <li>`Monitor`: observe, do not process requests and record security events in logs;</li> <li>`Disabled`: not enabled, do not scan requests and skip this rule.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * Specific configuration of rule items under the managed rule group, valid only when SensitivityLevel is custom.
    */
    @SerializedName("RuleActions")
    @Expose
    private ManagedRuleAction [] RuleActions;

    /**
    * ManagedRuleGroup detailed information, output parameter only.
    */
    @SerializedName("MetaData")
    @Expose
    private ManagedRuleGroupMeta MetaData;

    /**
     * Get Name of the managed rule group, if the configuration for the rule group is not specified, it will be processed by default, refer to product documentation for the specific value of GroupId. 
     * @return GroupId Name of the managed rule group, if the configuration for the rule group is not specified, it will be processed by default, refer to product documentation for the specific value of GroupId.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Name of the managed rule group, if the configuration for the rule group is not specified, it will be processed by default, refer to product documentation for the specific value of GroupId.
     * @param GroupId Name of the managed rule group, if the configuration for the rule group is not specified, it will be processed by default, refer to product documentation for the specific value of GroupId.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Protection level of the managed rule group. Values: <li>`loose`: lenient, only contain ultra-high risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`normal`: normal, contain ultra-high risk and high-risk rules, at this point,Action parameter needs configured instead of RuleActions parameter;</li> <li>`strict`: strict, contains ultra-high risk, high-risk and medium-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`extreme`: super strict, contains ultra-high risk, high-risk, medium-risk and low-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`custom`: custom, refined strategy, configure the RuleActions parameter for each individual rule, at this point, the Action field is invalid, use RuleActions to configure the refined strategy for each individual rule.</li>. 
     * @return SensitivityLevel Protection level of the managed rule group. Values: <li>`loose`: lenient, only contain ultra-high risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`normal`: normal, contain ultra-high risk and high-risk rules, at this point,Action parameter needs configured instead of RuleActions parameter;</li> <li>`strict`: strict, contains ultra-high risk, high-risk and medium-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`extreme`: super strict, contains ultra-high risk, high-risk, medium-risk and low-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`custom`: custom, refined strategy, configure the RuleActions parameter for each individual rule, at this point, the Action field is invalid, use RuleActions to configure the refined strategy for each individual rule.</li>.
     */
    public String getSensitivityLevel() {
        return this.SensitivityLevel;
    }

    /**
     * Set Protection level of the managed rule group. Values: <li>`loose`: lenient, only contain ultra-high risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`normal`: normal, contain ultra-high risk and high-risk rules, at this point,Action parameter needs configured instead of RuleActions parameter;</li> <li>`strict`: strict, contains ultra-high risk, high-risk and medium-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`extreme`: super strict, contains ultra-high risk, high-risk, medium-risk and low-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`custom`: custom, refined strategy, configure the RuleActions parameter for each individual rule, at this point, the Action field is invalid, use RuleActions to configure the refined strategy for each individual rule.</li>.
     * @param SensitivityLevel Protection level of the managed rule group. Values: <li>`loose`: lenient, only contain ultra-high risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`normal`: normal, contain ultra-high risk and high-risk rules, at this point,Action parameter needs configured instead of RuleActions parameter;</li> <li>`strict`: strict, contains ultra-high risk, high-risk and medium-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`extreme`: super strict, contains ultra-high risk, high-risk, medium-risk and low-risk rules, at this point, Action parameter needs configured instead of RuleActions parameter;</li> <li>`custom`: custom, refined strategy, configure the RuleActions parameter for each individual rule, at this point, the Action field is invalid, use RuleActions to configure the refined strategy for each individual rule.</li>.
     */
    public void setSensitivityLevel(String SensitivityLevel) {
        this.SensitivityLevel = SensitivityLevel;
    }

    /**
     * Get Action for ManagedRuleGroup. the Name parameter value of SecurityAction supports: <li>`Deny`: block and respond with a block page;</li> <li>`Monitor`: observe, do not process requests and record security events in logs;</li> <li>`Disabled`: not enabled, do not scan requests and skip this rule.</li>. 
     * @return Action Action for ManagedRuleGroup. the Name parameter value of SecurityAction supports: <li>`Deny`: block and respond with a block page;</li> <li>`Monitor`: observe, do not process requests and record security events in logs;</li> <li>`Disabled`: not enabled, do not scan requests and skip this rule.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Action for ManagedRuleGroup. the Name parameter value of SecurityAction supports: <li>`Deny`: block and respond with a block page;</li> <li>`Monitor`: observe, do not process requests and record security events in logs;</li> <li>`Disabled`: not enabled, do not scan requests and skip this rule.</li>.
     * @param Action Action for ManagedRuleGroup. the Name parameter value of SecurityAction supports: <li>`Deny`: block and respond with a block page;</li> <li>`Monitor`: observe, do not process requests and record security events in logs;</li> <li>`Disabled`: not enabled, do not scan requests and skip this rule.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get Specific configuration of rule items under the managed rule group, valid only when SensitivityLevel is custom. 
     * @return RuleActions Specific configuration of rule items under the managed rule group, valid only when SensitivityLevel is custom.
     */
    public ManagedRuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set Specific configuration of rule items under the managed rule group, valid only when SensitivityLevel is custom.
     * @param RuleActions Specific configuration of rule items under the managed rule group, valid only when SensitivityLevel is custom.
     */
    public void setRuleActions(ManagedRuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get ManagedRuleGroup detailed information, output parameter only. 
     * @return MetaData ManagedRuleGroup detailed information, output parameter only.
     */
    public ManagedRuleGroupMeta getMetaData() {
        return this.MetaData;
    }

    /**
     * Set ManagedRuleGroup detailed information, output parameter only.
     * @param MetaData ManagedRuleGroup detailed information, output parameter only.
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

