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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule Group ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Rule Template ID
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQL
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Integrity, 4: Consistency, 5: Timeliness, 6: Validity)
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Source Field Detailed Type, int, string
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * Source Field Name
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * Detection Range 1.Whole Table 2.Conditional Scan
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * Conditional Scan WHERE Condition Expression
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * Custom Definition SQL
    */
    @SerializedName("CustomSql")
    @Expose
    private String CustomSql;

    /**
    * Alert Trigger Condition
    */
    @SerializedName("CompareRule")
    @Expose
    private CompareRule CompareRule;

    /**
    * Alert Trigger Level 1.Low, 2.Medium, 3.High
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Rule Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Target Database Id
    */
    @SerializedName("TargetDatabaseId")
    @Expose
    private String TargetDatabaseId;

    /**
    * Target Table Id
    */
    @SerializedName("TargetTableId")
    @Expose
    private String TargetTableId;

    /**
    * Target Filter Condition Expression
    */
    @SerializedName("TargetConditionExpr")
    @Expose
    private String TargetConditionExpr;

    /**
    * Source Field and Target Field Association Condition ON Expression
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * Custom Definition Template SQL Expression Field Replacement Parameter
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * Target Field Name CITY
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * Execution engine adapted to the rule
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

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
     * Get Rule Group ID 
     * @return RuleGroupId Rule Group ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
     * @param RuleGroupId Rule Group ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data Table ID 
     * @return TableId Data Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Data Table ID
     * @param TableId Data Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Rule Template ID 
     * @return RuleTemplateId Rule Template ID
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Rule Template ID
     * @param RuleTemplateId Rule Template ID
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQL 
     * @return Type Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQL
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQL
     * @param Type Rule type 1.System Template, 2.Custom Definition Template, 3.Custom Definition SQL
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Integrity, 4: Consistency, 5: Timeliness, 6: Validity) 
     * @return QualityDim Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Integrity, 4: Consistency, 5: Timeliness, 6: Validity)
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Integrity, 4: Consistency, 5: Timeliness, 6: Validity)
     * @param QualityDim Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Integrity, 4: Consistency, 5: Timeliness, 6: Validity)
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Source Field Detailed Type, int, string 
     * @return SourceObjectDataTypeName Source Field Detailed Type, int, string
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set Source Field Detailed Type, int, string
     * @param SourceObjectDataTypeName Source Field Detailed Type, int, string
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get Source Field Name 
     * @return SourceObjectValue Source Field Name
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set Source Field Name
     * @param SourceObjectValue Source Field Name
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get Detection Range 1.Whole Table 2.Conditional Scan 
     * @return ConditionType Detection Range 1.Whole Table 2.Conditional Scan
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set Detection Range 1.Whole Table 2.Conditional Scan
     * @param ConditionType Detection Range 1.Whole Table 2.Conditional Scan
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get Conditional Scan WHERE Condition Expression 
     * @return ConditionExpression Conditional Scan WHERE Condition Expression
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set Conditional Scan WHERE Condition Expression
     * @param ConditionExpression Conditional Scan WHERE Condition Expression
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get Custom Definition SQL 
     * @return CustomSql Custom Definition SQL
     */
    public String getCustomSql() {
        return this.CustomSql;
    }

    /**
     * Set Custom Definition SQL
     * @param CustomSql Custom Definition SQL
     */
    public void setCustomSql(String CustomSql) {
        this.CustomSql = CustomSql;
    }

    /**
     * Get Alert Trigger Condition 
     * @return CompareRule Alert Trigger Condition
     */
    public CompareRule getCompareRule() {
        return this.CompareRule;
    }

    /**
     * Set Alert Trigger Condition
     * @param CompareRule Alert Trigger Condition
     */
    public void setCompareRule(CompareRule CompareRule) {
        this.CompareRule = CompareRule;
    }

    /**
     * Get Alert Trigger Level 1.Low, 2.Medium, 3.High 
     * @return AlarmLevel Alert Trigger Level 1.Low, 2.Medium, 3.High
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alert Trigger Level 1.Low, 2.Medium, 3.High
     * @param AlarmLevel Alert Trigger Level 1.Low, 2.Medium, 3.High
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Rule Description 
     * @return Description Rule Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule Description
     * @param Description Rule Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Target Database Id 
     * @return TargetDatabaseId Target Database Id
     */
    public String getTargetDatabaseId() {
        return this.TargetDatabaseId;
    }

    /**
     * Set Target Database Id
     * @param TargetDatabaseId Target Database Id
     */
    public void setTargetDatabaseId(String TargetDatabaseId) {
        this.TargetDatabaseId = TargetDatabaseId;
    }

    /**
     * Get Target Table Id 
     * @return TargetTableId Target Table Id
     */
    public String getTargetTableId() {
        return this.TargetTableId;
    }

    /**
     * Set Target Table Id
     * @param TargetTableId Target Table Id
     */
    public void setTargetTableId(String TargetTableId) {
        this.TargetTableId = TargetTableId;
    }

    /**
     * Get Target Filter Condition Expression 
     * @return TargetConditionExpr Target Filter Condition Expression
     */
    public String getTargetConditionExpr() {
        return this.TargetConditionExpr;
    }

    /**
     * Set Target Filter Condition Expression
     * @param TargetConditionExpr Target Filter Condition Expression
     */
    public void setTargetConditionExpr(String TargetConditionExpr) {
        this.TargetConditionExpr = TargetConditionExpr;
    }

    /**
     * Get Source Field and Target Field Association Condition ON Expression 
     * @return RelConditionExpr Source Field and Target Field Association Condition ON Expression
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set Source Field and Target Field Association Condition ON Expression
     * @param RelConditionExpr Source Field and Target Field Association Condition ON Expression
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get Custom Definition Template SQL Expression Field Replacement Parameter 
     * @return FieldConfig Custom Definition Template SQL Expression Field Replacement Parameter
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set Custom Definition Template SQL Expression Field Replacement Parameter
     * @param FieldConfig Custom Definition Template SQL Expression Field Replacement Parameter
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get Target Field Name CITY 
     * @return TargetObjectValue Target Field Name CITY
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set Target Field Name CITY
     * @param TargetObjectValue Target Field Name CITY
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get Execution engine adapted to the rule 
     * @return SourceEngineTypes Execution engine adapted to the rule
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Execution engine adapted to the rule
     * @param SourceEngineTypes Execution engine adapted to the rule
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.SourceObjectDataTypeName != null) {
            this.SourceObjectDataTypeName = new String(source.SourceObjectDataTypeName);
        }
        if (source.SourceObjectValue != null) {
            this.SourceObjectValue = new String(source.SourceObjectValue);
        }
        if (source.ConditionType != null) {
            this.ConditionType = new Long(source.ConditionType);
        }
        if (source.ConditionExpression != null) {
            this.ConditionExpression = new String(source.ConditionExpression);
        }
        if (source.CustomSql != null) {
            this.CustomSql = new String(source.CustomSql);
        }
        if (source.CompareRule != null) {
            this.CompareRule = new CompareRule(source.CompareRule);
        }
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TargetDatabaseId != null) {
            this.TargetDatabaseId = new String(source.TargetDatabaseId);
        }
        if (source.TargetTableId != null) {
            this.TargetTableId = new String(source.TargetTableId);
        }
        if (source.TargetConditionExpr != null) {
            this.TargetConditionExpr = new String(source.TargetConditionExpr);
        }
        if (source.RelConditionExpr != null) {
            this.RelConditionExpr = new String(source.RelConditionExpr);
        }
        if (source.FieldConfig != null) {
            this.FieldConfig = new RuleFieldConfig(source.FieldConfig);
        }
        if (source.TargetObjectValue != null) {
            this.TargetObjectValue = new String(source.TargetObjectValue);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "CustomSql", this.CustomSql);
        this.setParamObj(map, prefix + "CompareRule.", this.CompareRule);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetDatabaseId", this.TargetDatabaseId);
        this.setParamSimple(map, prefix + "TargetTableId", this.TargetTableId);
        this.setParamSimple(map, prefix + "TargetConditionExpr", this.TargetConditionExpr);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);

    }
}

