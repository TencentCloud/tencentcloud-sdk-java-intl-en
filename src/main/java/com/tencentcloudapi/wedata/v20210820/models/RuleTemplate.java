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

public class RuleTemplate extends AbstractModel {

    /**
    * Rule Template ID
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * Rule Template Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule Template Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Template Type (1: System Template, 2: Self Definition)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * Applicable Source Data Object Type (1: Numeric, 2: String)
    */
    @SerializedName("SourceObjectDataType")
    @Expose
    private Long SourceObjectDataType;

    /**
    * Rule Template Source Side Content, distinguish engine, JSON Structure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * Applicable Source Data Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Supported Comparison Types for Rule (1: Fixed Value Comparison, greater than, less than, greater than or equal, etc. 2: Fluctuation Value Comparison, absolute value, increase, decrease)
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * Number of References
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CitationCount")
    @Expose
    private Long CitationCount;

    /**
    * Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * Creator Nickname
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Update Time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether to add where parameter
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
    * Whether to Associate Multiple Tables
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SqlExpression")
    @Expose
    private String SqlExpression;

    /**
    * Template Sub-dimension,0. Parent Dimension Type,1. Consistency: Enumeration Range Consistency,2. Consistency: Numeric Range Consistency,3. Consistency: Field Data Correlation
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubQualityDim")
    @Expose
    private Long SubQualityDim;

    /**
    * SQL Expression Parsing Object
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ResolvedSqlExpression")
    @Expose
    private SqlExpression ResolvedSqlExpression;

    /**
    * Supported Data Source Types
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DatasourceTypes")
    @Expose
    private Long [] DatasourceTypes;

    /**
    * Created by User ID Str
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("UserIdStr")
    @Expose
    private String UserIdStr;

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
     * Get Rule Template Name 
     * @return Name Rule Template Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule Template Name
     * @param Name Rule Template Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Rule Template Description 
     * @return Description Rule Template Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule Template Description
     * @param Description Rule Template Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Template Type (1: System Template, 2: Self Definition) 
     * @return Type Template Type (1: System Template, 2: Self Definition)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Template Type (1: System Template, 2: Self Definition)
     * @param Type Template Type (1: System Template, 2: Self Definition)
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level) 
     * @return SourceObjectType Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
     * @param SourceObjectType Applicable Source Data Object Type (1: Constant, 2: Offline Table Level, 3: Offline Field Level)
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get Applicable Source Data Object Type (1: Numeric, 2: String) 
     * @return SourceObjectDataType Applicable Source Data Object Type (1: Numeric, 2: String)
     */
    public Long getSourceObjectDataType() {
        return this.SourceObjectDataType;
    }

    /**
     * Set Applicable Source Data Object Type (1: Numeric, 2: String)
     * @param SourceObjectDataType Applicable Source Data Object Type (1: Numeric, 2: String)
     */
    public void setSourceObjectDataType(Long SourceObjectDataType) {
        this.SourceObjectDataType = SourceObjectDataType;
    }

    /**
     * Get Rule Template Source Side Content, distinguish engine, JSON Structure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceContent Rule Template Source Side Content, distinguish engine, JSON Structure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set Rule Template Source Side Content, distinguish engine, JSON Structure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceContent Rule Template Source Side Content, distinguish engine, JSON Structure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get Applicable Source Data Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SourceEngineTypes Applicable Source Data Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Applicable Source Data Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SourceEngineTypes Applicable Source Data Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityDim Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityDim Quality Dimension of Rule (1: Accuracy, 2: Uniqueness, 3: Completeness, 4: Consistency, 5: Timeliness, 6: Validity)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Supported Comparison Types for Rule (1: Fixed Value Comparison, greater than, less than, greater than or equal, etc. 2: Fluctuation Value Comparison, absolute value, increase, decrease)
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CompareType Supported Comparison Types for Rule (1: Fixed Value Comparison, greater than, less than, greater than or equal, etc. 2: Fluctuation Value Comparison, absolute value, increase, decrease)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set Supported Comparison Types for Rule (1: Fixed Value Comparison, greater than, less than, greater than or equal, etc. 2: Fluctuation Value Comparison, absolute value, increase, decrease)
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CompareType Supported Comparison Types for Rule (1: Fixed Value Comparison, greater than, less than, greater than or equal, etc. 2: Fluctuation Value Comparison, absolute value, increase, decrease)
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get Number of References
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CitationCount Number of References
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCitationCount() {
        return this.CitationCount;
    }

    /**
     * Set Number of References
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CitationCount Number of References
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCitationCount(Long CitationCount) {
        this.CitationCount = CitationCount;
    }

    /**
     * Get Creator ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserId Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserId Creator ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Creator Nickname
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserName Creator Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Creator Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserName Creator Nickname
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Update Time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UpdateTime Update Time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update Time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UpdateTime Update Time yyyy-MM-dd HH:mm:ss
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether to add where parameter
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return WhereFlag Whether to add where parameter
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set Whether to add where parameter
Note: This field may return null, indicating that no valid value can be obtained.
     * @param WhereFlag Whether to add where parameter
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    /**
     * Get Whether to Associate Multiple Tables
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return MultiSourceFlag Whether to Associate Multiple Tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set Whether to Associate Multiple Tables
Note: This field may return null, indicating that no valid value can be obtained.
     * @param MultiSourceFlag Whether to Associate Multiple Tables
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SqlExpression Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSqlExpression() {
        return this.SqlExpression;
    }

    /**
     * Set Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SqlExpression Custom Template SQL Expression from Definition
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSqlExpression(String SqlExpression) {
        this.SqlExpression = SqlExpression;
    }

    /**
     * Get Template Sub-dimension,0. Parent Dimension Type,1. Consistency: Enumeration Range Consistency,2. Consistency: Numeric Range Consistency,3. Consistency: Field Data Correlation
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubQualityDim Template Sub-dimension,0. Parent Dimension Type,1. Consistency: Enumeration Range Consistency,2. Consistency: Numeric Range Consistency,3. Consistency: Field Data Correlation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getSubQualityDim() {
        return this.SubQualityDim;
    }

    /**
     * Set Template Sub-dimension,0. Parent Dimension Type,1. Consistency: Enumeration Range Consistency,2. Consistency: Numeric Range Consistency,3. Consistency: Field Data Correlation
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubQualityDim Template Sub-dimension,0. Parent Dimension Type,1. Consistency: Enumeration Range Consistency,2. Consistency: Numeric Range Consistency,3. Consistency: Field Data Correlation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubQualityDim(Long SubQualityDim) {
        this.SubQualityDim = SubQualityDim;
    }

    /**
     * Get SQL Expression Parsing Object
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ResolvedSqlExpression SQL Expression Parsing Object
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SqlExpression getResolvedSqlExpression() {
        return this.ResolvedSqlExpression;
    }

    /**
     * Set SQL Expression Parsing Object
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ResolvedSqlExpression SQL Expression Parsing Object
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setResolvedSqlExpression(SqlExpression ResolvedSqlExpression) {
        this.ResolvedSqlExpression = ResolvedSqlExpression;
    }

    /**
     * Get Supported Data Source Types
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DatasourceTypes Supported Data Source Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getDatasourceTypes() {
        return this.DatasourceTypes;
    }

    /**
     * Set Supported Data Source Types
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DatasourceTypes Supported Data Source Types
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDatasourceTypes(Long [] DatasourceTypes) {
        this.DatasourceTypes = DatasourceTypes;
    }

    /**
     * Get Created by User ID Str
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return UserIdStr Created by User ID Str
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getUserIdStr() {
        return this.UserIdStr;
    }

    /**
     * Set Created by User ID Str
Note: This field may return null, indicating that no valid value can be obtained.
     * @param UserIdStr Created by User ID Str
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setUserIdStr(String UserIdStr) {
        this.UserIdStr = UserIdStr;
    }

    public RuleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplate(RuleTemplate source) {
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
            this.ResolvedSqlExpression = new SqlExpression(source.ResolvedSqlExpression);
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

