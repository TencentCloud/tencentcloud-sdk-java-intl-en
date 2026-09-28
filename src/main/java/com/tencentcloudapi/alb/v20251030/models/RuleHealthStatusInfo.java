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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHealthStatusInfo extends AbstractModel {

    /**
    * Whether it is the default forwarding rule.
    */
    @SerializedName("IsDefaultRule")
    @Expose
    private String IsDefaultRule;

    /**
    * Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Target group health status.
    */
    @SerializedName("TargetGroupHealthInfos")
    @Expose
    private TargetGroupHealthInfo [] TargetGroupHealthInfos;

    /**
     * Get Whether it is the default forwarding rule. 
     * @return IsDefaultRule Whether it is the default forwarding rule.
     */
    public String getIsDefaultRule() {
        return this.IsDefaultRule;
    }

    /**
     * Set Whether it is the default forwarding rule.
     * @param IsDefaultRule Whether it is the default forwarding rule.
     */
    public void setIsDefaultRule(String IsDefaultRule) {
        this.IsDefaultRule = IsDefaultRule;
    }

    /**
     * Get Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters. 
     * @return RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     * @param RuleId Forwarding rule ID in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Target group health status. 
     * @return TargetGroupHealthInfos Target group health status.
     */
    public TargetGroupHealthInfo [] getTargetGroupHealthInfos() {
        return this.TargetGroupHealthInfos;
    }

    /**
     * Set Target group health status.
     * @param TargetGroupHealthInfos Target group health status.
     */
    public void setTargetGroupHealthInfos(TargetGroupHealthInfo [] TargetGroupHealthInfos) {
        this.TargetGroupHealthInfos = TargetGroupHealthInfos;
    }

    public RuleHealthStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleHealthStatusInfo(RuleHealthStatusInfo source) {
        if (source.IsDefaultRule != null) {
            this.IsDefaultRule = new String(source.IsDefaultRule);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TargetGroupHealthInfos != null) {
            this.TargetGroupHealthInfos = new TargetGroupHealthInfo[source.TargetGroupHealthInfos.length];
            for (int i = 0; i < source.TargetGroupHealthInfos.length; i++) {
                this.TargetGroupHealthInfos[i] = new TargetGroupHealthInfo(source.TargetGroupHealthInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDefaultRule", this.IsDefaultRule);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "TargetGroupHealthInfos.", this.TargetGroupHealthInfos);

    }
}

