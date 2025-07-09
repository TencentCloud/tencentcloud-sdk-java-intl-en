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

public class CreateRuleTemplateRequest extends AbstractModel {

    /**
    * Template Type 1. System Template 2. Custom Definition Template
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Template Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Quality Inspection Dimension 1. Accuracy 2. Uniqueness 3. Integrity 4. Consistency 5. Timeliness 6. Validity
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * Source Data Object Type 1. Constant 2. Offline Table Level 2. Offline Field Level
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * Template Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Corresponding Engine Type of the Source
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * Whether to Associate with Other Databases and Tables
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * SQL Expression
    */
    @SerializedName("SqlExpression")
    @Expose
    private String SqlExpression;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to add where parameter
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
     * Get Template Type 1. System Template 2. Custom Definition Template 
     * @return Type Template Type 1. System Template 2. Custom Definition Template
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Template Type 1. System Template 2. Custom Definition Template
     * @param Type Template Type 1. System Template 2. Custom Definition Template
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Template Name 
     * @return Name Template Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template Name
     * @param Name Template Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Quality Inspection Dimension 1. Accuracy 2. Uniqueness 3. Integrity 4. Consistency 5. Timeliness 6. Validity 
     * @return QualityDim Quality Inspection Dimension 1. Accuracy 2. Uniqueness 3. Integrity 4. Consistency 5. Timeliness 6. Validity
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set Quality Inspection Dimension 1. Accuracy 2. Uniqueness 3. Integrity 4. Consistency 5. Timeliness 6. Validity
     * @param QualityDim Quality Inspection Dimension 1. Accuracy 2. Uniqueness 3. Integrity 4. Consistency 5. Timeliness 6. Validity
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get Source Data Object Type 1. Constant 2. Offline Table Level 2. Offline Field Level 
     * @return SourceObjectType Source Data Object Type 1. Constant 2. Offline Table Level 2. Offline Field Level
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set Source Data Object Type 1. Constant 2. Offline Table Level 2. Offline Field Level
     * @param SourceObjectType Source Data Object Type 1. Constant 2. Offline Table Level 2. Offline Field Level
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get Template Description 
     * @return Description Template Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Template Description
     * @param Description Template Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Corresponding Engine Type of the Source 
     * @return SourceEngineTypes Corresponding Engine Type of the Source
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set Corresponding Engine Type of the Source
     * @param SourceEngineTypes Corresponding Engine Type of the Source
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get Whether to Associate with Other Databases and Tables 
     * @return MultiSourceFlag Whether to Associate with Other Databases and Tables
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set Whether to Associate with Other Databases and Tables
     * @param MultiSourceFlag Whether to Associate with Other Databases and Tables
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get SQL Expression 
     * @return SqlExpression SQL Expression
     */
    public String getSqlExpression() {
        return this.SqlExpression;
    }

    /**
     * Set SQL Expression
     * @param SqlExpression SQL Expression
     */
    public void setSqlExpression(String SqlExpression) {
        this.SqlExpression = SqlExpression;
    }

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
     * Get Whether to add where parameter 
     * @return WhereFlag Whether to add where parameter
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set Whether to add where parameter
     * @param WhereFlag Whether to add where parameter
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    public CreateRuleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleTemplateRequest(CreateRuleTemplateRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.SqlExpression != null) {
            this.SqlExpression = new String(source.SqlExpression);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "SqlExpression", this.SqlExpression);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);

    }
}

