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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditRule extends AbstractModel{

    /**
    * Audit rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Creation time of audit rule in the format of 2019-03-20 17:09:13
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of audit rule in the format of 2019-03-20 17:09:13
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Audit rule description
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Audit rule filters
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("RuleFilters")
    @Expose
    private AuditFilter [] RuleFilters;

    /**
    * Whether to enable full audit
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get Audit rule ID 
     * @return RuleId Audit rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Audit rule ID
     * @param RuleId Audit rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Creation time of audit rule in the format of 2019-03-20 17:09:13 
     * @return CreateTime Creation time of audit rule in the format of 2019-03-20 17:09:13
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of audit rule in the format of 2019-03-20 17:09:13
     * @param CreateTime Creation time of audit rule in the format of 2019-03-20 17:09:13
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of audit rule in the format of 2019-03-20 17:09:13 
     * @return ModifyTime Last modified time of audit rule in the format of 2019-03-20 17:09:13
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modified time of audit rule in the format of 2019-03-20 17:09:13
     * @param ModifyTime Last modified time of audit rule in the format of 2019-03-20 17:09:13
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Audit rule name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RuleName Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     * @param RuleName Audit rule name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Audit rule description
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Description Audit rule description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Audit rule description
Note: This field may return `null`, indicating that no valid value was found.
     * @param Description Audit rule description
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Audit rule filters
Note: This field may return `null`, indicating that no valid value was found. 
     * @return RuleFilters Audit rule filters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public AuditFilter [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set Audit rule filters
Note: This field may return `null`, indicating that no valid value was found.
     * @param RuleFilters Audit rule filters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setRuleFilters(AuditFilter [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get Whether to enable full audit 
     * @return AuditAll Whether to enable full audit
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set Whether to enable full audit
     * @param AuditAll Whether to enable full audit
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    public AuditRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRule(AuditRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new AuditFilter[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new AuditFilter(source.RuleFilters[i]);
            }
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);

    }
}

