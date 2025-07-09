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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRule extends AbstractModel {

    /**
    * ID of the rule
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule type
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * Rule level
    */
    @SerializedName("RuleLevelDesc")
    @Expose
    private String RuleLevelDesc;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Rule status: `block`, `allow`
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Tag of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTags")
    @Expose
    private String [] RuleTags;

    /**
    * Description of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
    * ID of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
     * Get ID of the rule 
     * @return RuleId ID of the rule
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set ID of the rule
     * @param RuleId ID of the rule
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule description 
     * @return Description Rule description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
     * @param Description Rule description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule type 
     * @return RuleTypeName Rule type
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set Rule type
     * @param RuleTypeName Rule type
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get Rule level 
     * @return RuleLevelDesc Rule level
     */
    public String getRuleLevelDesc() {
        return this.RuleLevelDesc;
    }

    /**
     * Set Rule level
     * @param RuleLevelDesc Rule level
     */
    public void setRuleLevelDesc(String RuleLevelDesc) {
        this.RuleLevelDesc = RuleLevelDesc;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Rule status: `block`, `allow` 
     * @return Status Rule status: `block`, `allow`
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status: `block`, `allow`
     * @param Status Rule status: `block`, `allow`
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Tag of the rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleTags Tag of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getRuleTags() {
        return this.RuleTags;
    }

    /**
     * Set Tag of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleTags Tag of the rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleTags(String [] RuleTags) {
        this.RuleTags = RuleTags;
    }

    /**
     * Get Description of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleTypeDesc Description of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set Description of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleTypeDesc Description of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    /**
     * Get ID of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return RuleTypeId ID of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set ID of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param RuleTypeId ID of the rule type
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    public ManagedRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRule(ManagedRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.RuleLevelDesc != null) {
            this.RuleLevelDesc = new String(source.RuleLevelDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleTags != null) {
            this.RuleTags = new String[source.RuleTags.length];
            for (int i = 0; i < source.RuleTags.length; i++) {
                this.RuleTags[i] = new String(source.RuleTags[i]);
            }
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "RuleLevelDesc", this.RuleLevelDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "RuleTags.", this.RuleTags);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);

    }
}

