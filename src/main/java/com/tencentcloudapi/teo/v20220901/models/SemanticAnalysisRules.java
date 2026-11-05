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

public class SemanticAnalysisRules extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 
    */
    @SerializedName("RuleActions")
    @Expose
    private ManagedRuleAction [] RuleActions;

    /**
    * 
    */
    @SerializedName("MetaData")
    @Expose
    private ManagedRuleGroupMeta MetaData;

    /**
     * Get  
     * @return Enabled 
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 
     * @param Enabled 
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get  
     * @return RuleActions 
     */
    public ManagedRuleAction [] getRuleActions() {
        return this.RuleActions;
    }

    /**
     * Set 
     * @param RuleActions 
     */
    public void setRuleActions(ManagedRuleAction [] RuleActions) {
        this.RuleActions = RuleActions;
    }

    /**
     * Get  
     * @return MetaData 
     */
    public ManagedRuleGroupMeta getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 
     * @param MetaData 
     */
    public void setMetaData(ManagedRuleGroupMeta MetaData) {
        this.MetaData = MetaData;
    }

    public SemanticAnalysisRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SemanticAnalysisRules(SemanticAnalysisRules source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
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
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArrayObj(map, prefix + "RuleActions.", this.RuleActions);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);

    }
}

