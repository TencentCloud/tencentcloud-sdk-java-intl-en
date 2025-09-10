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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwaspRule extends AbstractModel {

    /**
    * Rule ID
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
    * Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Threat level. valid values: 0 (unknown), 100 (low risk), 200 (medium risk), 300 (high risk), 400 (critical).
    */
    @SerializedName("VulLevel")
    @Expose
    private Long VulLevel;

    /**
    * CVE ID
    */
    @SerializedName("CveID")
    @Expose
    private String CveID;

    /**
    * Specifies the rule type ID.
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether the user is locked.
    */
    @SerializedName("Locked")
    @Expose
    private Long Locked;

    /**
    * Reason for modification

0: none (compatibility records are empty).
1: avoid false positives due to business characteristics.
2: reporting of rule-based false positives.
3: gray release of core business rules.
4: others
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
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
     * Get Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only). 
     * @return Status Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     * @param Status Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict). 
     * @return Level Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     * @param Level Protection level of the rule. valid values: 100 (loose), 200 (normal), 300 (strict), 400 (ultra-strict).
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Threat level. valid values: 0 (unknown), 100 (low risk), 200 (medium risk), 300 (high risk), 400 (critical). 
     * @return VulLevel Threat level. valid values: 0 (unknown), 100 (low risk), 200 (medium risk), 300 (high risk), 400 (critical).
     */
    public Long getVulLevel() {
        return this.VulLevel;
    }

    /**
     * Set Threat level. valid values: 0 (unknown), 100 (low risk), 200 (medium risk), 300 (high risk), 400 (critical).
     * @param VulLevel Threat level. valid values: 0 (unknown), 100 (low risk), 200 (medium risk), 300 (high risk), 400 (critical).
     */
    public void setVulLevel(Long VulLevel) {
        this.VulLevel = VulLevel;
    }

    /**
     * Get CVE ID 
     * @return CveID CVE ID
     */
    public String getCveID() {
        return this.CveID;
    }

    /**
     * Set CVE ID
     * @param CveID CVE ID
     */
    public void setCveID(String CveID) {
        this.CveID = CveID;
    }

    /**
     * Get Specifies the rule type ID. 
     * @return TypeId Specifies the rule type ID.
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Specifies the rule type ID.
     * @param TypeId Specifies the rule type ID.
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return ModifyTime Update time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time.
     * @param ModifyTime Update time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Whether the user is locked. 
     * @return Locked Whether the user is locked.
     */
    public Long getLocked() {
        return this.Locked;
    }

    /**
     * Set Whether the user is locked.
     * @param Locked Whether the user is locked.
     */
    public void setLocked(Long Locked) {
        this.Locked = Locked;
    }

    /**
     * Get Reason for modification

0: none (compatibility records are empty).
1: avoid false positives due to business characteristics.
2: reporting of rule-based false positives.
3: gray release of core business rules.
4: others 
     * @return Reason Reason for modification

0: none (compatibility records are empty).
1: avoid false positives due to business characteristics.
2: reporting of rule-based false positives.
3: gray release of core business rules.
4: others
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for modification

0: none (compatibility records are empty).
1: avoid false positives due to business characteristics.
2: reporting of rule-based false positives.
3: gray release of core business rules.
4: others
     * @param Reason Reason for modification

0: none (compatibility records are empty).
1: avoid false positives due to business characteristics.
2: reporting of rule-based false positives.
3: gray release of core business rules.
4: others
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public OwaspRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwaspRule(OwaspRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.VulLevel != null) {
            this.VulLevel = new Long(source.VulLevel);
        }
        if (source.CveID != null) {
            this.CveID = new String(source.CveID);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Locked != null) {
            this.Locked = new Long(source.Locked);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VulLevel", this.VulLevel);
        this.setParamSimple(map, prefix + "CveID", this.CveID);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Locked", this.Locked);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

