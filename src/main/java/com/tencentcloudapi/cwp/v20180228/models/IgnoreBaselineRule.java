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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnoreBaselineRule extends AbstractModel {

    /**
    * Baseline check item name
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Baseline detection item id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Fixing suggestion
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * Number of affected hosts
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
     * Get Baseline check item name 
     * @return RuleName Baseline check item name
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Baseline check item name
     * @param RuleName Baseline check item name
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Baseline detection item id 
     * @return RuleId Baseline detection item id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Baseline detection item id
     * @param RuleId Baseline detection item id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Update time 
     * @return ModifyTime Update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
     * @param ModifyTime Update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Fixing suggestion 
     * @return Fix Fixing suggestion
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing suggestion
     * @param Fix Fixing suggestion
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get Number of affected hosts 
     * @return EffectHostCount Number of affected hosts
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set Number of affected hosts
     * @param EffectHostCount Number of affected hosts
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

