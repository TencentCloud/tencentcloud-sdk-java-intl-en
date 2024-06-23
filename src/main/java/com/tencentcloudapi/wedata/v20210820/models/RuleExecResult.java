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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecResult extends AbstractModel {

    /**
    * Rule Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleExecId")
    @Expose
    private Long RuleExecId;

    /**
    * Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupExecId")
    @Expose
    private Long RuleGroupExecId;

    /**
    * Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Rule IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQLNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * Source Field Detailed Type, int string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * Source Field NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * Conditional Scan WHERE Condition ExpressionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * Test Results (1: Detection passed, 2: Trigger Rules, 3: Detection failed)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecResultStatus")
    @Expose
    private Long ExecResultStatus;

    /**
    * Trigger Result, Alert Sent Successfully, Block Task Successful
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerResult")
    @Expose
    private String TriggerResult;

    /**
    * Comparison Result
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareResult")
    @Expose
    private CompareResult CompareResult;

    /**
    * Template name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Quality Dimension
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Target Table - Database Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetDBTableName")
    @Expose
    private String TargetDBTableName;

    /**
    * Target Table - Field Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * Target Table - Field Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectDataType")
    @Expose
    private String TargetObjectDataType;

    /**
    * Custom Definition Template SQL Expression Parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * Source Field and Target Field Association Condition ON ExpressionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * Execution timeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 1/2/3: Low/Medium/High
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
     * Get Rule Execution ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleExecId Rule Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleExecId() {
        return this.RuleExecId;
    }

    /**
     * Set Rule Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleExecId Rule Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleExecId(Long RuleExecId) {
        this.RuleExecId = RuleExecId;
    }

    /**
     * Get Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupExecId Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupExecId() {
        return this.RuleGroupExecId;
    }

    /**
     * Set Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupExecId Rule Group Execution ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupExecId(Long RuleGroupExecId) {
        this.RuleGroupExecId = RuleGroupExecId;
    }

    /**
     * Get Rule Group IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupId Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupId Rule Group IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Rule IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleId Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleId Rule IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleName Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQLNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleType Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQLNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQLNote: This field may return null, indicating that no valid value can be obtained.
     * @param RuleType Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQLNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Source Field Detailed Type, int string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectDataTypeName Source Field Detailed Type, int string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set Source Field Detailed Type, int string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectDataTypeName Source Field Detailed Type, int string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get Source Field NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectValue Source Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set Source Field NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectValue Source Field NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get Conditional Scan WHERE Condition ExpressionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ConditionExpression Conditional Scan WHERE Condition ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set Conditional Scan WHERE Condition ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     * @param ConditionExpression Conditional Scan WHERE Condition ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get Test Results (1: Detection passed, 2: Trigger Rules, 3: Detection failed)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecResultStatus Test Results (1: Detection passed, 2: Trigger Rules, 3: Detection failed)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getExecResultStatus() {
        return this.ExecResultStatus;
    }

    /**
     * Set Test Results (1: Detection passed, 2: Trigger Rules, 3: Detection failed)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecResultStatus Test Results (1: Detection passed, 2: Trigger Rules, 3: Detection failed)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecResultStatus(Long ExecResultStatus) {
        this.ExecResultStatus = ExecResultStatus;
    }

    /**
     * Get Trigger Result, Alert Sent Successfully, Block Task Successful
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerResult Trigger Result, Alert Sent Successfully, Block Task Successful
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTriggerResult() {
        return this.TriggerResult;
    }

    /**
     * Set Trigger Result, Alert Sent Successfully, Block Task Successful
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerResult Trigger Result, Alert Sent Successfully, Block Task Successful
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerResult(String TriggerResult) {
        this.TriggerResult = TriggerResult;
    }

    /**
     * Get Comparison Result
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareResult Comparison Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CompareResult getCompareResult() {
        return this.CompareResult;
    }

    /**
     * Set Comparison Result
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareResult Comparison Result
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareResult(CompareResult CompareResult) {
        this.CompareResult = CompareResult;
    }

    /**
     * Get Template name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TemplateName Template name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TemplateName Template name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Quality Dimension
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityDim Quality Dimension
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality Dimension
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityDim Quality Dimension
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Target Table - Database Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetDBTableName Target Table - Database Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetDBTableName() {
        return this.TargetDBTableName;
    }

    /**
     * Set Target Table - Database Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetDBTableName Target Table - Database Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetDBTableName(String TargetDBTableName) {
        this.TargetDBTableName = TargetDBTableName;
    }

    /**
     * Get Target Table - Field Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectValue Target Table - Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set Target Table - Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectValue Target Table - Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get Target Table - Field Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectDataType Target Table - Field Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetObjectDataType() {
        return this.TargetObjectDataType;
    }

    /**
     * Set Target Table - Field Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectDataType Target Table - Field Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectDataType(String TargetObjectDataType) {
        this.TargetObjectDataType = TargetObjectDataType;
    }

    /**
     * Get Custom Definition Template SQL Expression Parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldConfig Custom Definition Template SQL Expression Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set Custom Definition Template SQL Expression Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FieldConfig Custom Definition Template SQL Expression Parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get Source Field and Target Field Association Condition ON ExpressionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return RelConditionExpr Source Field and Target Field Association Condition ON ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set Source Field and Target Field Association Condition ON ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     * @param RelConditionExpr Source Field and Target Field Association Condition ON ExpressionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get Execution timeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return StartTime Execution timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Execution timeNote: This field may return null, indicating that no valid value can be obtained.
     * @param StartTime Execution timeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 1/2/3: Low/Medium/High
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmLevel 1/2/3: Low/Medium/High
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 1/2/3: Low/Medium/High
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmLevel 1/2/3: Low/Medium/High
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    public RuleExecResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecResult(RuleExecResult source) {
        if (source.RuleExecId != null) {
            this.RuleExecId = new Long(source.RuleExecId);
        }
        if (source.RuleGroupExecId != null) {
            this.RuleGroupExecId = new Long(source.RuleGroupExecId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.SourceObjectDataTypeName != null) {
            this.SourceObjectDataTypeName = new String(source.SourceObjectDataTypeName);
        }
        if (source.SourceObjectValue != null) {
            this.SourceObjectValue = new String(source.SourceObjectValue);
        }
        if (source.ConditionExpression != null) {
            this.ConditionExpression = new String(source.ConditionExpression);
        }
        if (source.ExecResultStatus != null) {
            this.ExecResultStatus = new Long(source.ExecResultStatus);
        }
        if (source.TriggerResult != null) {
            this.TriggerResult = new String(source.TriggerResult);
        }
        if (source.CompareResult != null) {
            this.CompareResult = new CompareResult(source.CompareResult);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.TargetDBTableName != null) {
            this.TargetDBTableName = new String(source.TargetDBTableName);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
        if (source.TargetObjectDataType != null) {
            this.TargetObjectDataType = new String(source.TargetObjectDataType);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new RuleFieldConfig(source.FieldConfig);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleExecId", this.RuleExecId);
        this.setParamSimple(map, prefix + "RuleGroupExecId", this.RuleGroupExecId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "ExecResultStatus", this.ExecResultStatus);
        this.setParamSimple(map, prefix + "TriggerResult", this.TriggerResult);
        this.setParamObj(map, prefix + "CompareResult.", this.CompareResult);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "TargetDBTableName", this.TargetDBTableName);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamSimple(map, prefix + "TargetObjectDataType", this.TargetObjectDataType);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);

    }
}

