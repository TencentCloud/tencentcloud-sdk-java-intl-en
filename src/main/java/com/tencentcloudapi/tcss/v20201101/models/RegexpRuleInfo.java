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

public class RegexpRuleInfo extends AbstractModel {

    /**
    * Rule name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Enabled status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * Regular Expression List
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpressionList")
    @Expose
    private WhiteListRegexpExpressionInfo [] ExpressionList;

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * Latest update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Latest Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorUIN")
    @Expose
    private String OperatorUIN;

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

    /**
     * Get Regular Expression List
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpressionList Regular Expression List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WhiteListRegexpExpressionInfo [] getExpressionList() {
        return this.ExpressionList;
    }

    /**
     * Set Regular Expression List
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpressionList Regular Expression List
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpressionList(WhiteListRegexpExpressionInfo [] ExpressionList) {
        this.ExpressionList = ExpressionList;
    }

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
     * Get Latest update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Latest update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Latest update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Latest Operating Account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorUIN Latest Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperatorUIN() {
        return this.OperatorUIN;
    }

    /**
     * Set Latest Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorUIN Latest Operating Account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorUIN(String OperatorUIN) {
        this.OperatorUIN = OperatorUIN;
    }

    public RegexpRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegexpRuleInfo(RegexpRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.ExpressionList != null) {
            this.ExpressionList = new WhiteListRegexpExpressionInfo[source.ExpressionList.length];
            for (int i = 0; i < source.ExpressionList.length; i++) {
                this.ExpressionList[i] = new WhiteListRegexpExpressionInfo(source.ExpressionList[i]);
            }
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperatorUIN != null) {
            this.OperatorUIN = new String(source.OperatorUIN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ExpressionList.", this.ExpressionList);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperatorUIN", this.OperatorUIN);

    }
}

