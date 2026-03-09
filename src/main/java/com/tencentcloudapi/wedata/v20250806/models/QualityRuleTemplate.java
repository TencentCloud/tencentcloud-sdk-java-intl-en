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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleTemplate extends AbstractModel {

    /**
    * Rule template ID.
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * Rule template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Template type (1: system template, 2: custom).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Applicable source data object type for rule (1: constant, 2: offline table level, 3: offline field level).
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * Applicable source data object type for rule (1: numeric value, 2: string).
    */
    @SerializedName("SourceObjectDataType")
    @Expose
    private Long SourceObjectDataType;

    /**
    * Rule template source side content, case-sensitive, JSON structure.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Applicable source data type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * Quality dimension of rule (1: accuracy, 2: uniqueness, 3: integrity, 4: consistency, 5: timeliness, 6: validity).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Supported comparison types for rule (1: fixed value comparison, more than, less than, equal to or greater than; 2: fluctuation value comparison, absolute value, rise, drop).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * Referenced times.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CitationCount")
    @Expose
    private Long CitationCount;

    /**
    * Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * Creator nickname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Last update time yyyy-MM-dd HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether to add where parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
    * Whether multiple database tables are associated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * Custom template SQL expression.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SqlExpression")
    @Expose
    private String SqlExpression;

    /**
    * Template sub-dimension, 0. parent dimension type, 1. consistency: enumeration range consistency, 2. consistency: numeric range consistency, 3. consistency: field data correlation.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubQualityDim")
    @Expose
    private Long SubQualityDim;

    /**
    * sql expression parsing object.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResolvedSqlExpression")
    @Expose
    private QualitySqlExpression ResolvedSqlExpression;

    /**
    * Supported data source types.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatasourceTypes")
    @Expose
    private Long [] DatasourceTypes;

    /**
    * Created by user id str.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserIdStr")
    @Expose
    private String UserIdStr;

    /**
     * Get Rule template ID. 
     * @return RuleTemplateId Rule template ID.
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set Rule template ID.
     * @param RuleTemplateId Rule template ID.
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get Rule template name. 
     * @return Name Rule template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule template name.
     * @param Name Rule template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule template description. 
     * @return Description Rule template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule template description.
     * @param Description Rule template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Template type (1: system template, 2: custom). 
     * @return Type Template type (1: system template, 2: custom).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Template type (1: system template, 2: custom).
     * @param Type Template type (1: system template, 2: custom).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Applicable source data object type for rule (1: constant, 2: offline table level, 3: offline field level). 
     * @return SourceObjectType Applicable source data object type for rule (1: constant, 2: offline table level, 3: offline field level).
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set Applicable source data object type for rule (1: constant, 2: offline table level, 3: offline field level).
     * @param SourceObjectType Applicable source data object type for rule (1: constant, 2: offline table level, 3: offline field level).
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get Applicable source data object type for rule (1: numeric value, 2: string). 
     * @return SourceObjectDataType Applicable source data object type for rule (1: numeric value, 2: string).
     */
    public Long getSourceObjectDataType() {
        return this.SourceObjectDataType;
    }

    /**
     * Set Applicable source data object type for rule (1: numeric value, 2: string).
     * @param SourceObjectDataType Applicable source data object type for rule (1: numeric value, 2: string).
     */
    public void setSourceObjectDataType(Long SourceObjectDataType) {
        this.SourceObjectDataType = SourceObjectDataType;
    }

    /**
     * Get Rule template source side content, case-sensitive, JSON structure.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceContent Rule template source side content, case-sensitive, JSON structure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Rule template source side content, case-sensitive, JSON structure.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceContent Rule template source side content, case-sensitive, JSON structure.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Applicable source data type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceEngineTypes Applicable source data type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Applicable source data type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceEngineTypes Applicable source data type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get Quality dimension of rule (1: accuracy, 2: uniqueness, 3: integrity, 4: consistency, 5: timeliness, 6: validity).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityDim Quality dimension of rule (1: accuracy, 2: uniqueness, 3: integrity, 4: consistency, 5: timeliness, 6: validity).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality dimension of rule (1: accuracy, 2: uniqueness, 3: integrity, 4: consistency, 5: timeliness, 6: validity).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityDim Quality dimension of rule (1: accuracy, 2: uniqueness, 3: integrity, 4: consistency, 5: timeliness, 6: validity).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Supported comparison types for rule (1: fixed value comparison, more than, less than, equal to or greater than; 2: fluctuation value comparison, absolute value, rise, drop).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompareType Supported comparison types for rule (1: fixed value comparison, more than, less than, equal to or greater than; 2: fluctuation value comparison, absolute value, rise, drop).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set Supported comparison types for rule (1: fixed value comparison, more than, less than, equal to or greater than; 2: fluctuation value comparison, absolute value, rise, drop).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompareType Supported comparison types for rule (1: fixed value comparison, more than, less than, equal to or greater than; 2: fluctuation value comparison, absolute value, rise, drop).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get Referenced times.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CitationCount Referenced times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCitationCount() {
        return this.CitationCount;
    }

    /**
     * Set Referenced times.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CitationCount Referenced times.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCitationCount(Long CitationCount) {
        this.CitationCount = CitationCount;
    }

    /**
     * Get Creator ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId Creator ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Creator nickname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Creator nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Creator nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Creator nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Last update time yyyy-MM-dd HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Last update time yyyy-MM-dd HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time yyyy-MM-dd HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Last update time yyyy-MM-dd HH:MM:ss.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether to add where parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WhereFlag Whether to add where parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set Whether to add where parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WhereFlag Whether to add where parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    /**
     * Get Whether multiple database tables are associated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MultiSourceFlag Whether multiple database tables are associated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set Whether multiple database tables are associated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MultiSourceFlag Whether multiple database tables are associated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get Custom template SQL expression.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SqlExpression Custom template SQL expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSqlExpression() {
        return this.SqlExpression;
    }

    /**
     * Set Custom template SQL expression.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SqlExpression Custom template SQL expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSqlExpression(String SqlExpression) {
        this.SqlExpression = SqlExpression;
    }

    /**
     * Get Template sub-dimension, 0. parent dimension type, 1. consistency: enumeration range consistency, 2. consistency: numeric range consistency, 3. consistency: field data correlation.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubQualityDim Template sub-dimension, 0. parent dimension type, 1. consistency: enumeration range consistency, 2. consistency: numeric range consistency, 3. consistency: field data correlation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSubQualityDim() {
        return this.SubQualityDim;
    }

    /**
     * Set Template sub-dimension, 0. parent dimension type, 1. consistency: enumeration range consistency, 2. consistency: numeric range consistency, 3. consistency: field data correlation.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubQualityDim Template sub-dimension, 0. parent dimension type, 1. consistency: enumeration range consistency, 2. consistency: numeric range consistency, 3. consistency: field data correlation.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubQualityDim(Long SubQualityDim) {
        this.SubQualityDim = SubQualityDim;
    }

    /**
     * Get sql expression parsing object.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResolvedSqlExpression sql expression parsing object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualitySqlExpression getResolvedSqlExpression() {
        return this.ResolvedSqlExpression;
    }

    /**
     * Set sql expression parsing object.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResolvedSqlExpression sql expression parsing object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResolvedSqlExpression(QualitySqlExpression ResolvedSqlExpression) {
        this.ResolvedSqlExpression = ResolvedSqlExpression;
    }

    /**
     * Get Supported data source types.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatasourceTypes Supported data source types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getDatasourceTypes() {
        return this.DatasourceTypes;
    }

    /**
     * Set Supported data source types.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatasourceTypes Supported data source types.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatasourceTypes(Long [] DatasourceTypes) {
        this.DatasourceTypes = DatasourceTypes;
    }

    /**
     * Get Created by user id str.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserIdStr Created by user id str.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserIdStr() {
        return this.UserIdStr;
    }

    /**
     * Set Created by user id str.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserIdStr Created by user id str.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserIdStr(String UserIdStr) {
        this.UserIdStr = UserIdStr;
    }

    public QualityRuleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleTemplate(QualityRuleTemplate source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.SourceObjectDataType != null) {
            this.SourceObjectDataType = new Long(source.SourceObjectDataType);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.CitationCount != null) {
            this.CitationCount = new Long(source.CitationCount);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.SqlExpression != null) {
            this.SqlExpression = new String(source.SqlExpression);
        }
        if (source.SubQualityDim != null) {
            this.SubQualityDim = new Long(source.SubQualityDim);
        }
        if (source.ResolvedSqlExpression != null) {
            this.ResolvedSqlExpression = new QualitySqlExpression(source.ResolvedSqlExpression);
        }
        if (source.DatasourceTypes != null) {
            this.DatasourceTypes = new Long[source.DatasourceTypes.length];
            for (int i = 0; i < source.DatasourceTypes.length; i++) {
                this.DatasourceTypes[i] = new Long(source.DatasourceTypes[i]);
            }
        }
        if (source.UserIdStr != null) {
            this.UserIdStr = new String(source.UserIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "SourceObjectDataType", this.SourceObjectDataType);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "CitationCount", this.CitationCount);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "SqlExpression", this.SqlExpression);
        this.setParamSimple(map, prefix + "SubQualityDim", this.SubQualityDim);
        this.setParamObj(map, prefix + "ResolvedSqlExpression.", this.ResolvedSqlExpression);
        this.setParamArraySimple(map, prefix + "DatasourceTypes.", this.DatasourceTypes);
        this.setParamSimple(map, prefix + "UserIdStr", this.UserIdStr);

    }
}

