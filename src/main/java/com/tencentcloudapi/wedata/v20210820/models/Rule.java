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

public class Rule extends AbstractModel {

    /**
    * Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Data Table ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Rule nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule Type 1. System Template, 2. Custom Definition Template, 3. Custom Definition SQL
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Rule Template ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * Rule Template Overview
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleTemplateContent")
    @Expose
    private String RuleTemplateContent;

    /**
    * Quality Dimension of Rule 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * Applicable Source Data Object Type (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectDataType")
    @Expose
    private Long SourceObjectDataType;

    /**
    * Source Field Detailed Type, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectDataTypeName")
    @Expose
    private String SourceObjectDataTypeName;

    /**
    * Source Field Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceObjectValue")
    @Expose
    private String SourceObjectValue;

    /**
    * Detection Range 1. Whole Table, 2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * Conditional Scan WHERE Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConditionExpression")
    @Expose
    private String ConditionExpression;

    /**
    * Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CustomSql")
    @Expose
    private String CustomSql;

    /**
    * Alert Trigger Condition
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareRule")
    @Expose
    private CompareRule CompareRule;

    /**
    * Alert Trigger Level 1. Low, 2. Medium, 3. High
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * Rule DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule Configurator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Target Database Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetDatabaseId")
    @Expose
    private String TargetDatabaseId;

    /**
    * Target Database Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetDatabaseName")
    @Expose
    private String TargetDatabaseName;

    /**
    * Target Table Id
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetTableId")
    @Expose
    private String TargetTableId;

    /**
    * Target Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetTableName")
    @Expose
    private String TargetTableName;

    /**
    * Target Field Filter Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetConditionExpr")
    @Expose
    private String TargetConditionExpr;

    /**
    * Source and target field association conditions in ON expression
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RelConditionExpr")
    @Expose
    private String RelConditionExpr;

    /**
    * From Definition template SQL expression parameters
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FieldConfig")
    @Expose
    private RuleFieldConfig FieldConfig;

    /**
    * Whether to join multiple tables
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * Whether WHERE parameters exist
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
    * Template original SQL
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TemplateSql")
    @Expose
    private String TemplateSql;

    /**
    * Template sub-dimensions: 0.Parent dimension type, 1.Consistency: Enum range consistency, 2.Consistency: Numeric range consistency, 3.Consistency: Field data correlation
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubQualityDim")
    @Expose
    private Long SubQualityDim;

    /**
    * Rule applicable target data object types (1: Constant, 2: Offline table level, 3: Offline field level)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectType")
    @Expose
    private Long TargetObjectType;

    /**
    * Rule applicable target data object types (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectDataType")
    @Expose
    private Long TargetObjectDataType;

    /**
    * Target field detailed types, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectDataTypeName")
    @Expose
    private String TargetObjectDataTypeName;

    /**
    * Target field name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TargetObjectValue")
    @Expose
    private String TargetObjectValue;

    /**
    * Source engine type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * Table name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table manager name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * Execution strategy information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ExecStrategy")
    @Expose
    private RuleGroupExecStrategy ExecStrategy;

    /**
    * Subscription information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Subscription")
    @Expose
    private RuleGroupSubscribe Subscription;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Database ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Monitoring enabled. 0 false, 1 true
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * Trigger conditionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TriggerCondition")
    @Expose
    private String TriggerCondition;

    /**
    * 0, or not returned, or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleId Rule ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroupId Rule Group ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Data Table ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableId Data Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Data Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableId Data Table ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Rule nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name Rule nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule Type 1. System Template, 2. Custom Definition Template, 3. Custom Definition SQL
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Rule Type 1. System Template, 2. Custom Definition Template, 3. Custom Definition SQL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Rule Type 1. System Template, 2. Custom Definition Template, 3. Custom Definition SQL
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type Rule Type 1. System Template, 2. Custom Definition Template, 3. Custom Definition SQL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Rule Template ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleTemplateId Rule Template ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Rule Template ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleTemplateId Rule Template ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Rule Template Overview
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleTemplateContent Rule Template Overview
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRuleTemplateContent() {
        return this.RuleTemplateContent;
    }

    /**
     * Set Rule Template Overview
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleTemplateContent Rule Template Overview
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleTemplateContent(String RuleTemplateContent) {
        this.RuleTemplateContent = RuleTemplateContent;
    }

    /**
     * Get Quality Dimension of Rule 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityDim Quality Dimension of Rule 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality Dimension of Rule 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityDim Quality Dimension of Rule 1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectType Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectType Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get Applicable Source Data Object Type (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectDataType Applicable Source Data Object Type (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSourceObjectDataType() {
        return this.SourceObjectDataType;
    }

    /**
     * Set Applicable Source Data Object Type (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectDataType Applicable Source Data Object Type (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectDataType(Long SourceObjectDataType) {
        this.SourceObjectDataType = SourceObjectDataType;
    }

    /**
     * Get Source Field Detailed Type, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectDataTypeName Source Field Detailed Type, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceObjectDataTypeName() {
        return this.SourceObjectDataTypeName;
    }

    /**
     * Set Source Field Detailed Type, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectDataTypeName Source Field Detailed Type, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectDataTypeName(String SourceObjectDataTypeName) {
        this.SourceObjectDataTypeName = SourceObjectDataTypeName;
    }

    /**
     * Get Source Field Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceObjectValue Source Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceObjectValue() {
        return this.SourceObjectValue;
    }

    /**
     * Set Source Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceObjectValue Source Field Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceObjectValue(String SourceObjectValue) {
        this.SourceObjectValue = SourceObjectValue;
    }

    /**
     * Get Detection Range 1. Whole Table, 2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ConditionType Detection Range 1. Whole Table, 2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set Detection Range 1. Whole Table, 2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ConditionType Detection Range 1. Whole Table, 2. Conditional Scan
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get Conditional Scan WHERE Condition Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ConditionExpression Conditional Scan WHERE Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getConditionExpression() {
        return this.ConditionExpression;
    }

    /**
     * Set Conditional Scan WHERE Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ConditionExpression Conditional Scan WHERE Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConditionExpression(String ConditionExpression) {
        this.ConditionExpression = ConditionExpression;
    }

    /**
     * Get Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CustomSql Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCustomSql() {
        return this.CustomSql;
    }

    /**
     * Set Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CustomSql Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCustomSql(String CustomSql) {
        this.CustomSql = CustomSql;
    }

    /**
     * Get Alert Trigger Condition
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareRule Alert Trigger Condition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public CompareRule getCompareRule() {
        return this.CompareRule;
    }

    /**
     * Set Alert Trigger Condition
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareRule Alert Trigger Condition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareRule(CompareRule CompareRule) {
        this.CompareRule = CompareRule;
    }

    /**
     * Get Alert Trigger Level 1. Low, 2. Medium, 3. High
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AlarmLevel Alert Trigger Level 1. Low, 2. Medium, 3. High
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set Alert Trigger Level 1. Low, 2. Medium, 3. High
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AlarmLevel Alert Trigger Level 1. Low, 2. Medium, 3. High
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get Rule DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description Rule DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description Rule DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule Configurator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Operator Rule Configurator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Rule Configurator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Operator Rule Configurator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Target Database Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetDatabaseId Target Database Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetDatabaseId() {
        return this.TargetDatabaseId;
    }

    /**
     * Set Target Database Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetDatabaseId Target Database Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetDatabaseId(String TargetDatabaseId) {
        this.TargetDatabaseId = TargetDatabaseId;
    }

    /**
     * Get Target Database Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetDatabaseName Target Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetDatabaseName() {
        return this.TargetDatabaseName;
    }

    /**
     * Set Target Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetDatabaseName Target Database Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetDatabaseName(String TargetDatabaseName) {
        this.TargetDatabaseName = TargetDatabaseName;
    }

    /**
     * Get Target Table Id
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetTableId Target Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetTableId() {
        return this.TargetTableId;
    }

    /**
     * Set Target Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetTableId Target Table Id
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetTableId(String TargetTableId) {
        this.TargetTableId = TargetTableId;
    }

    /**
     * Get Target Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetTableName Target Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetTableName() {
        return this.TargetTableName;
    }

    /**
     * Set Target Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetTableName Target Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetTableName(String TargetTableName) {
        this.TargetTableName = TargetTableName;
    }

    /**
     * Get Target Field Filter Condition Expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetConditionExpr Target Field Filter Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetConditionExpr() {
        return this.TargetConditionExpr;
    }

    /**
     * Set Target Field Filter Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetConditionExpr Target Field Filter Condition Expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetConditionExpr(String TargetConditionExpr) {
        this.TargetConditionExpr = TargetConditionExpr;
    }

    /**
     * Get Source and target field association conditions in ON expression
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RelConditionExpr Source and target field association conditions in ON expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRelConditionExpr() {
        return this.RelConditionExpr;
    }

    /**
     * Set Source and target field association conditions in ON expression
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RelConditionExpr Source and target field association conditions in ON expression
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRelConditionExpr(String RelConditionExpr) {
        this.RelConditionExpr = RelConditionExpr;
    }

    /**
     * Get From Definition template SQL expression parameters
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FieldConfig From Definition template SQL expression parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleFieldConfig getFieldConfig() {
        return this.FieldConfig;
    }

    /**
     * Set From Definition template SQL expression parameters
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FieldConfig From Definition template SQL expression parameters
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFieldConfig(RuleFieldConfig FieldConfig) {
        this.FieldConfig = FieldConfig;
    }

    /**
     * Get Whether to join multiple tables
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MultiSourceFlag Whether to join multiple tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set Whether to join multiple tables
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MultiSourceFlag Whether to join multiple tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get Whether WHERE parameters exist
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WhereFlag Whether WHERE parameters exist
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set Whether WHERE parameters exist
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WhereFlag Whether WHERE parameters exist
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    /**
     * Get Template original SQL
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TemplateSql Template original SQL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTemplateSql() {
        return this.TemplateSql;
    }

    /**
     * Set Template original SQL
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TemplateSql Template original SQL
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTemplateSql(String TemplateSql) {
        this.TemplateSql = TemplateSql;
    }

    /**
     * Get Template sub-dimensions: 0.Parent dimension type, 1.Consistency: Enum range consistency, 2.Consistency: Numeric range consistency, 3.Consistency: Field data correlation
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubQualityDim Template sub-dimensions: 0.Parent dimension type, 1.Consistency: Enum range consistency, 2.Consistency: Numeric range consistency, 3.Consistency: Field data correlation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSubQualityDim() {
        return this.SubQualityDim;
    }

    /**
     * Set Template sub-dimensions: 0.Parent dimension type, 1.Consistency: Enum range consistency, 2.Consistency: Numeric range consistency, 3.Consistency: Field data correlation
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubQualityDim Template sub-dimensions: 0.Parent dimension type, 1.Consistency: Enum range consistency, 2.Consistency: Numeric range consistency, 3.Consistency: Field data correlation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubQualityDim(Long SubQualityDim) {
        this.SubQualityDim = SubQualityDim;
    }

    /**
     * Get Rule applicable target data object types (1: Constant, 2: Offline table level, 3: Offline field level)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectType Rule applicable target data object types (1: Constant, 2: Offline table level, 3: Offline field level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTargetObjectType() {
        return this.TargetObjectType;
    }

    /**
     * Set Rule applicable target data object types (1: Constant, 2: Offline table level, 3: Offline field level)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectType Rule applicable target data object types (1: Constant, 2: Offline table level, 3: Offline field level)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectType(Long TargetObjectType) {
        this.TargetObjectType = TargetObjectType;
    }

    /**
     * Get Rule applicable target data object types (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectDataType Rule applicable target data object types (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTargetObjectDataType() {
        return this.TargetObjectDataType;
    }

    /**
     * Set Rule applicable target data object types (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectDataType Rule applicable target data object types (1: Numeric, 2: String)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectDataType(Long TargetObjectDataType) {
        this.TargetObjectDataType = TargetObjectDataType;
    }

    /**
     * Get Target field detailed types, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectDataTypeName Target field detailed types, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetObjectDataTypeName() {
        return this.TargetObjectDataTypeName;
    }

    /**
     * Set Target field detailed types, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectDataTypeName Target field detailed types, INT, STRING
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectDataTypeName(String TargetObjectDataTypeName) {
        this.TargetObjectDataTypeName = TargetObjectDataTypeName;
    }

    /**
     * Get Target field name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TargetObjectValue Target field name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTargetObjectValue() {
        return this.TargetObjectValue;
    }

    /**
     * Set Target field name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TargetObjectValue Target field name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTargetObjectValue(String TargetObjectValue) {
        this.TargetObjectValue = TargetObjectValue;
    }

    /**
     * Get Source engine type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceEngineTypes Source engine type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Source engine type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceEngineTypes Source engine type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get Table name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table manager name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableOwnerName Table manager name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set Table manager name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableOwnerName Table manager name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get Execution strategy information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ExecStrategy Execution strategy information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupExecStrategy getExecStrategy() {
        return this.ExecStrategy;
    }

    /**
     * Set Execution strategy information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ExecStrategy Execution strategy information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setExecStrategy(RuleGroupExecStrategy ExecStrategy) {
        this.ExecStrategy = ExecStrategy;
    }

    /**
     * Get Subscription information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Subscription Subscription information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupSubscribe getSubscription() {
        return this.Subscription;
    }

    /**
     * Set Subscription information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Subscription Subscription information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubscription(RuleGroupSubscribe Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Data Source ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceId Data Source ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatabaseId Database ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Monitoring enabled. 0 false, 1 true
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MonitorStatus Monitoring enabled. 0 false, 1 true
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set Monitoring enabled. 0 false, 1 true
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MonitorStatus Monitoring enabled. 0 false, 1 true
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get Trigger conditionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TriggerCondition Trigger conditionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTriggerCondition() {
        return this.TriggerCondition;
    }

    /**
     * Set Trigger conditionNote: This field may return null, indicating that no valid value can be obtained.
     * @param TriggerCondition Trigger conditionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTriggerCondition(String TriggerCondition) {
        this.TriggerCondition = TriggerCondition;
    }

    /**
     * Get 0, or not returned, or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DsEnvType 0, or not returned, or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 0, or not returned, or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DsEnvType 0, or not returned, or null: Undefined, 1: Production, 2: Development
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.RuleTemplateContent != null) {
            this.RuleTemplateContent = new String(source.RuleTemplateContent);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.SourceObjectDataType != null) {
            this.SourceObjectDataType = new Long(source.SourceObjectDataType);
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.TargetDatabaseId != null) {
            this.TargetDatabaseId = new String(source.TargetDatabaseId);
        }
        if (source.TargetDatabaseName != null) {
            this.TargetDatabaseName = new String(source.TargetDatabaseName);
        }
        if (source.TargetTableId != null) {
            this.TargetTableId = new String(source.TargetTableId);
        }
        if (source.TargetTableName != null) {
            this.TargetTableName = new String(source.TargetTableName);
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
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
        if (source.TemplateSql != null) {
            this.TemplateSql = new String(source.TemplateSql);
        }
        if (source.SubQualityDim != null) {
            this.SubQualityDim = new Long(source.SubQualityDim);
        }
        if (source.TargetObjectType != null) {
            this.TargetObjectType = new Long(source.TargetObjectType);
        }
        if (source.TargetObjectDataType != null) {
            this.TargetObjectDataType = new Long(source.TargetObjectDataType);
        }
        if (source.TargetObjectDataTypeName != null) {
            this.TargetObjectDataTypeName = new String(source.TargetObjectDataTypeName);
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
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.ExecStrategy != null) {
            this.ExecStrategy = new RuleGroupExecStrategy(source.ExecStrategy);
        }
        if (source.Subscription != null) {
            this.Subscription = new RuleGroupSubscribe(source.Subscription);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.TriggerCondition != null) {
            this.TriggerCondition = new String(source.TriggerCondition);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "RuleTemplateContent", this.RuleTemplateContent);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "SourceObjectDataType", this.SourceObjectDataType);
        this.setParamSimple(map, prefix + "SourceObjectDataTypeName", this.SourceObjectDataTypeName);
        this.setParamSimple(map, prefix + "SourceObjectValue", this.SourceObjectValue);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "ConditionExpression", this.ConditionExpression);
        this.setParamSimple(map, prefix + "CustomSql", this.CustomSql);
        this.setParamObj(map, prefix + "CompareRule.", this.CompareRule);
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "TargetDatabaseId", this.TargetDatabaseId);
        this.setParamSimple(map, prefix + "TargetDatabaseName", this.TargetDatabaseName);
        this.setParamSimple(map, prefix + "TargetTableId", this.TargetTableId);
        this.setParamSimple(map, prefix + "TargetTableName", this.TargetTableName);
        this.setParamSimple(map, prefix + "TargetConditionExpr", this.TargetConditionExpr);
        this.setParamSimple(map, prefix + "RelConditionExpr", this.RelConditionExpr);
        this.setParamObj(map, prefix + "FieldConfig.", this.FieldConfig);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);
        this.setParamSimple(map, prefix + "TemplateSql", this.TemplateSql);
        this.setParamSimple(map, prefix + "SubQualityDim", this.SubQualityDim);
        this.setParamSimple(map, prefix + "TargetObjectType", this.TargetObjectType);
        this.setParamSimple(map, prefix + "TargetObjectDataType", this.TargetObjectDataType);
        this.setParamSimple(map, prefix + "TargetObjectDataTypeName", this.TargetObjectDataTypeName);
        this.setParamSimple(map, prefix + "TargetObjectValue", this.TargetObjectValue);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamObj(map, prefix + "ExecStrategy.", this.ExecStrategy);
        this.setParamObj(map, prefix + "Subscription.", this.Subscription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "TriggerCondition", this.TriggerCondition);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);

    }
}

