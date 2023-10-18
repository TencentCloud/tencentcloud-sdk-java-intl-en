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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyCondition extends AbstractModel {

    /**
    * Judgment condition of an alarm trigger condition (`0`: Any; `1`: All; `2`: Composite). When the value is set to `2` (i.e., composite trigger conditions), this parameter should be used together with `ComplexExpression`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private AlarmPolicyRule [] Rules;

    /**
    * The judgment expression of composite alarm trigger conditions, which is valid when the value of `IsUnionRule` is `2`. This parameter is used to determine that an alarm condition is met only when the expression values are `True` for multiple trigger conditions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComplexExpression")
    @Expose
    private String ComplexExpression;

    /**
     * Get Judgment condition of an alarm trigger condition (`0`: Any; `1`: All; `2`: Composite). When the value is set to `2` (i.e., composite trigger conditions), this parameter should be used together with `ComplexExpression`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsUnionRule Judgment condition of an alarm trigger condition (`0`: Any; `1`: All; `2`: Composite). When the value is set to `2` (i.e., composite trigger conditions), this parameter should be used together with `ComplexExpression`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set Judgment condition of an alarm trigger condition (`0`: Any; `1`: All; `2`: Composite). When the value is set to `2` (i.e., composite trigger conditions), this parameter should be used together with `ComplexExpression`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsUnionRule Judgment condition of an alarm trigger condition (`0`: Any; `1`: All; `2`: Composite). When the value is set to `2` (i.e., composite trigger conditions), this parameter should be used together with `ComplexExpression`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Rules Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AlarmPolicyRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Rules Alarm trigger condition list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(AlarmPolicyRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get The judgment expression of composite alarm trigger conditions, which is valid when the value of `IsUnionRule` is `2`. This parameter is used to determine that an alarm condition is met only when the expression values are `True` for multiple trigger conditions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComplexExpression The judgment expression of composite alarm trigger conditions, which is valid when the value of `IsUnionRule` is `2`. This parameter is used to determine that an alarm condition is met only when the expression values are `True` for multiple trigger conditions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComplexExpression() {
        return this.ComplexExpression;
    }

    /**
     * Set The judgment expression of composite alarm trigger conditions, which is valid when the value of `IsUnionRule` is `2`. This parameter is used to determine that an alarm condition is met only when the expression values are `True` for multiple trigger conditions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComplexExpression The judgment expression of composite alarm trigger conditions, which is valid when the value of `IsUnionRule` is `2`. This parameter is used to determine that an alarm condition is met only when the expression values are `True` for multiple trigger conditions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComplexExpression(String ComplexExpression) {
        this.ComplexExpression = ComplexExpression;
    }

    public AlarmPolicyCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyCondition(AlarmPolicyCondition source) {
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.Rules != null) {
            this.Rules = new AlarmPolicyRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AlarmPolicyRule(source.Rules[i]);
            }
        }
        if (source.ComplexExpression != null) {
            this.ComplexExpression = new String(source.ComplexExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ComplexExpression", this.ComplexExpression);

    }
}

