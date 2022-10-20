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

public class WafGroupRule extends AbstractModel{

    /**
    * The rule ID.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * The rule description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The description of the rule level.
    */
    @SerializedName("RuleLevelDesc")
    @Expose
    private String RuleLevelDesc;

    /**
    * The rule tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleTags")
    @Expose
    private String [] RuleTags;

    /**
    * The update time in the format of YYYY-MM-DD hh:mm:ss.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>It can be left empty when you query a managed rule.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The rule type.
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * ID of the rule type.
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
    * Description of the rule type.
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
     * Get The rule ID. 
     * @return RuleId The rule ID.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set The rule ID.
     * @param RuleId The rule ID.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get The rule description. 
     * @return Description The rule description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The rule description.
     * @param Description The rule description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The description of the rule level. 
     * @return RuleLevelDesc The description of the rule level.
     */
    public String getRuleLevelDesc() {
        return this.RuleLevelDesc;
    }

    /**
     * Set The description of the rule level.
     * @param RuleLevelDesc The description of the rule level.
     */
    public void setRuleLevelDesc(String RuleLevelDesc) {
        this.RuleLevelDesc = RuleLevelDesc;
    }

    /**
     * Get The rule tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleTags The rule tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRuleTags() {
        return this.RuleTags;
    }

    /**
     * Set The rule tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleTags The rule tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleTags(String [] RuleTags) {
        this.RuleTags = RuleTags;
    }

    /**
     * Get The update time in the format of YYYY-MM-DD hh:mm:ss.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime The update time in the format of YYYY-MM-DD hh:mm:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time in the format of YYYY-MM-DD hh:mm:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime The update time in the format of YYYY-MM-DD hh:mm:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>It can be left empty when you query a managed rule. 
     * @return Status The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>It can be left empty when you query a managed rule.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>It can be left empty when you query a managed rule.
     * @param Status The rule status. Values:
<li>`on`: Enabled</li>
<li>`off`: Disabled</li>It can be left empty when you query a managed rule.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The rule type. 
     * @return RuleTypeName The rule type.
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set The rule type.
     * @param RuleTypeName The rule type.
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get ID of the rule type. 
     * @return RuleTypeId ID of the rule type.
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set ID of the rule type.
     * @param RuleTypeId ID of the rule type.
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    /**
     * Get Description of the rule type. 
     * @return RuleTypeDesc Description of the rule type.
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set Description of the rule type.
     * @param RuleTypeDesc Description of the rule type.
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    public WafGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroupRule(WafGroupRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleLevelDesc != null) {
            this.RuleLevelDesc = new String(source.RuleLevelDesc);
        }
        if (source.RuleTags != null) {
            this.RuleTags = new String[source.RuleTags.length];
            for (int i = 0; i < source.RuleTags.length; i++) {
                this.RuleTags[i] = new String(source.RuleTags[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleLevelDesc", this.RuleLevelDesc);
        this.setParamArraySimple(map, prefix + "RuleTags.", this.RuleTags);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);

    }
}

