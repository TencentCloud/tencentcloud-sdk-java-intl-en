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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegexpRuleListItem extends AbstractModel {

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Number of Effective Expressions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EffectiveExpression")
    @Expose
    private Long EffectiveExpression;

    /**
    * Latest edit time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * most recently edited account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * Enabled status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleID Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleID Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get Rule name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RuleName Rule name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Number of Effective Expressions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EffectiveExpression Number of Effective Expressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEffectiveExpression() {
        return this.EffectiveExpression;
    }

    /**
     * Set Number of Effective Expressions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EffectiveExpression Number of Effective Expressions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEffectiveExpression(Long EffectiveExpression) {
        this.EffectiveExpression = EffectiveExpression;
    }

    /**
     * Get Latest edit time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Latest edit time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest edit time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Latest edit time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get most recently edited account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorUin most recently edited account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set most recently edited account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorUin most recently edited account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Enabled status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Enabled status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Enabled status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Enabled status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public RegexpRuleListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegexpRuleListItem(RegexpRuleListItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.EffectiveExpression != null) {
            this.EffectiveExpression = new Long(source.EffectiveExpression);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "EffectiveExpression", this.EffectiveExpression);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

