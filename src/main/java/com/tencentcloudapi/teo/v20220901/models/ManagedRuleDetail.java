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

public class ManagedRuleDetail extends AbstractModel {

    /**
    * Managed rule Id.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Protection level of managed rules. Values: <li>`low`: low risk, this rule has a relatively low risk and is applicable to very strict access scenarios, this level of rule may generate considerable false alarms.</li> <li>`medium`: medium risk, this means the risk of this rule is normal and is suitable for protection scenarios with stricter requirements.</li> <li>`high`: high risk, this indicates that the risk of this rule is relatively high and will not generate false alarms in most scenarios.</li> <li>`extreme`: ultra-high risk. this represents that the risk of this rule is extremely high and will not generate false alarms basically.</li>.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule tag. Some types of rules do not have tags.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Rule version.
    */
    @SerializedName("RuleVersion")
    @Expose
    private String RuleVersion;

    /**
     * Get Managed rule Id. 
     * @return RuleId Managed rule Id.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Managed rule Id.
     * @param RuleId Managed rule Id.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Protection level of managed rules. Values: <li>`low`: low risk, this rule has a relatively low risk and is applicable to very strict access scenarios, this level of rule may generate considerable false alarms.</li> <li>`medium`: medium risk, this means the risk of this rule is normal and is suitable for protection scenarios with stricter requirements.</li> <li>`high`: high risk, this indicates that the risk of this rule is relatively high and will not generate false alarms in most scenarios.</li> <li>`extreme`: ultra-high risk. this represents that the risk of this rule is extremely high and will not generate false alarms basically.</li>. 
     * @return RiskLevel Protection level of managed rules. Values: <li>`low`: low risk, this rule has a relatively low risk and is applicable to very strict access scenarios, this level of rule may generate considerable false alarms.</li> <li>`medium`: medium risk, this means the risk of this rule is normal and is suitable for protection scenarios with stricter requirements.</li> <li>`high`: high risk, this indicates that the risk of this rule is relatively high and will not generate false alarms in most scenarios.</li> <li>`extreme`: ultra-high risk. this represents that the risk of this rule is extremely high and will not generate false alarms basically.</li>.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Protection level of managed rules. Values: <li>`low`: low risk, this rule has a relatively low risk and is applicable to very strict access scenarios, this level of rule may generate considerable false alarms.</li> <li>`medium`: medium risk, this means the risk of this rule is normal and is suitable for protection scenarios with stricter requirements.</li> <li>`high`: high risk, this indicates that the risk of this rule is relatively high and will not generate false alarms in most scenarios.</li> <li>`extreme`: ultra-high risk. this represents that the risk of this rule is extremely high and will not generate false alarms basically.</li>.
     * @param RiskLevel Protection level of managed rules. Values: <li>`low`: low risk, this rule has a relatively low risk and is applicable to very strict access scenarios, this level of rule may generate considerable false alarms.</li> <li>`medium`: medium risk, this means the risk of this rule is normal and is suitable for protection scenarios with stricter requirements.</li> <li>`high`: high risk, this indicates that the risk of this rule is relatively high and will not generate false alarms in most scenarios.</li> <li>`extreme`: ultra-high risk. this represents that the risk of this rule is extremely high and will not generate false alarms basically.</li>.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Rule description. 
     * @return Description Rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description.
     * @param Description Rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule tag. Some types of rules do not have tags. 
     * @return Tags Rule tag. Some types of rules do not have tags.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Rule tag. Some types of rules do not have tags.
     * @param Tags Rule tag. Some types of rules do not have tags.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Rule version. 
     * @return RuleVersion Rule version.
     */
    public String getRuleVersion() {
        return this.RuleVersion;
    }

    /**
     * Set Rule version.
     * @param RuleVersion Rule version.
     */
    public void setRuleVersion(String RuleVersion) {
        this.RuleVersion = RuleVersion;
    }

    public ManagedRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleDetail(ManagedRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RuleVersion != null) {
            this.RuleVersion = new String(source.RuleVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RuleVersion", this.RuleVersion);

    }
}

