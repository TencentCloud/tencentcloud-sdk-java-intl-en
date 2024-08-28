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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnoreBaselineRule extends AbstractModel {

    /**
    * Baseline check item name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Baseline check item ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Fixing suggestions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
     * Get Baseline check item name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Baseline check item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Baseline check item name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Baseline check item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Baseline check item ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleId Baseline check item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Baseline check item ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleId Baseline check item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Fixing suggestions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fix Fixing suggestions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fix Fixing suggestions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectHostCount Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectHostCount Number of affected hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    public IgnoreBaselineRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnoreBaselineRule(IgnoreBaselineRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);

    }
}

