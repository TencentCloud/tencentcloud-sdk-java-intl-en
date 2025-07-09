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

public class RuleEngineItem extends AbstractModel {

    /**
    * Rule status. values: <li>`enable`: enabled</li> <li>`disable`: disabled</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Rule id. a unique identifier for the rule. this parameter is required when calling `modifyl7accrules`.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Rule name. name length limit: 255 characters.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule annotation. multiple annotations can be added.
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
    * Sub-Rule branch. this list currently supports filling in only one rule; multiple entries are invalid.
Note: this field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * Rule priority. only used as an output parameter.
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get Rule status. values: <li>`enable`: enabled</li> <li>`disable`: disabled</li>. 
     * @return Status Rule status. values: <li>`enable`: enabled</li> <li>`disable`: disabled</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. values: <li>`enable`: enabled</li> <li>`disable`: disabled</li>.
     * @param Status Rule status. values: <li>`enable`: enabled</li> <li>`disable`: disabled</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Rule id. a unique identifier for the rule. this parameter is required when calling `modifyl7accrules`. 
     * @return RuleId Rule id. a unique identifier for the rule. this parameter is required when calling `modifyl7accrules`.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule id. a unique identifier for the rule. this parameter is required when calling `modifyl7accrules`.
     * @param RuleId Rule id. a unique identifier for the rule. this parameter is required when calling `modifyl7accrules`.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule name. name length limit: 255 characters. 
     * @return RuleName Rule name. name length limit: 255 characters.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name. name length limit: 255 characters.
     * @param RuleName Rule name. name length limit: 255 characters.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule annotation. multiple annotations can be added. 
     * @return Description Rule annotation. multiple annotations can be added.
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set Rule annotation. multiple annotations can be added.
     * @param Description Rule annotation. multiple annotations can be added.
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    /**
     * Get Sub-Rule branch. this list currently supports filling in only one rule; multiple entries are invalid.
Note: this field may return null, which indicates a failure to obtain a valid value. 
     * @return Branches Sub-Rule branch. this list currently supports filling in only one rule; multiple entries are invalid.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set Sub-Rule branch. this list currently supports filling in only one rule; multiple entries are invalid.
Note: this field may return null, which indicates a failure to obtain a valid value.
     * @param Branches Sub-Rule branch. this list currently supports filling in only one rule; multiple entries are invalid.
Note: this field may return null, which indicates a failure to obtain a valid value.
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get Rule priority. only used as an output parameter. 
     * @return RulePriority Rule priority. only used as an output parameter.
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set Rule priority. only used as an output parameter.
     * @param RulePriority Rule priority. only used as an output parameter.
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public RuleEngineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineItem(RuleEngineItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String[source.Description.length];
            for (int i = 0; i < source.Description.length; i++) {
                this.Description[i] = new String(source.Description[i]);
            }
        }
        if (source.Branches != null) {
            this.Branches = new RuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new RuleBranch(source.Branches[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "Description.", this.Description);
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

