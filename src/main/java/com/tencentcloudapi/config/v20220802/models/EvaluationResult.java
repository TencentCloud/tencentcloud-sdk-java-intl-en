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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EvaluationResult extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource region
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Resource name
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Rule ID
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * Rule name
    */
    @SerializedName("ConfigRuleName")
    @Expose
    private String ConfigRuleName;

    /**
    * Compliance package ID.
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * Risk level
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Assessment result.
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
    * Compliance type.
    */
    @SerializedName("ComplianceType")
    @Expose
    private String ComplianceType;

    /**
    * Rule initiation type.
    */
    @SerializedName("InvokingEventMessageType")
    @Expose
    private String InvokingEventMessageType;

    /**
    * Evaluation initiation time.
    */
    @SerializedName("ConfigRuleInvokedTime")
    @Expose
    private String ConfigRuleInvokedTime;

    /**
    * Actual evaluation time.
    */
    @SerializedName("ResultRecordedTime")
    @Expose
    private String ResultRecordedTime;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. 
     * @return ResourceType Resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type.
     * @param ResourceType Resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource region 
     * @return ResourceRegion Resource region
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource region
     * @param ResourceRegion Resource region
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Resource name 
     * @return ResourceName Resource name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
     * @param ResourceName Resource name
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Rule ID 
     * @return ConfigRuleId Rule ID
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set Rule ID
     * @param ConfigRuleId Rule ID
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get Rule name 
     * @return ConfigRuleName Rule name
     */
    public String getConfigRuleName() {
        return this.ConfigRuleName;
    }

    /**
     * Set Rule name
     * @param ConfigRuleName Rule name
     */
    public void setConfigRuleName(String ConfigRuleName) {
        this.ConfigRuleName = ConfigRuleName;
    }

    /**
     * Get Compliance package ID. 
     * @return CompliancePackId Compliance package ID.
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set Compliance package ID.
     * @param CompliancePackId Compliance package ID.
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get Risk level 
     * @return RiskLevel Risk level
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level
     * @param RiskLevel Risk level
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Assessment result. 
     * @return Annotation Assessment result.
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set Assessment result.
     * @param Annotation Assessment result.
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    /**
     * Get Compliance type. 
     * @return ComplianceType Compliance type.
     */
    public String getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set Compliance type.
     * @param ComplianceType Compliance type.
     */
    public void setComplianceType(String ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get Rule initiation type. 
     * @return InvokingEventMessageType Rule initiation type.
     */
    public String getInvokingEventMessageType() {
        return this.InvokingEventMessageType;
    }

    /**
     * Set Rule initiation type.
     * @param InvokingEventMessageType Rule initiation type.
     */
    public void setInvokingEventMessageType(String InvokingEventMessageType) {
        this.InvokingEventMessageType = InvokingEventMessageType;
    }

    /**
     * Get Evaluation initiation time. 
     * @return ConfigRuleInvokedTime Evaluation initiation time.
     */
    public String getConfigRuleInvokedTime() {
        return this.ConfigRuleInvokedTime;
    }

    /**
     * Set Evaluation initiation time.
     * @param ConfigRuleInvokedTime Evaluation initiation time.
     */
    public void setConfigRuleInvokedTime(String ConfigRuleInvokedTime) {
        this.ConfigRuleInvokedTime = ConfigRuleInvokedTime;
    }

    /**
     * Get Actual evaluation time. 
     * @return ResultRecordedTime Actual evaluation time.
     */
    public String getResultRecordedTime() {
        return this.ResultRecordedTime;
    }

    /**
     * Set Actual evaluation time.
     * @param ResultRecordedTime Actual evaluation time.
     */
    public void setResultRecordedTime(String ResultRecordedTime) {
        this.ResultRecordedTime = ResultRecordedTime;
    }

    public EvaluationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationResult(EvaluationResult source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.ConfigRuleName != null) {
            this.ConfigRuleName = new String(source.ConfigRuleName);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String(source.ComplianceType);
        }
        if (source.InvokingEventMessageType != null) {
            this.InvokingEventMessageType = new String(source.InvokingEventMessageType);
        }
        if (source.ConfigRuleInvokedTime != null) {
            this.ConfigRuleInvokedTime = new String(source.ConfigRuleInvokedTime);
        }
        if (source.ResultRecordedTime != null) {
            this.ResultRecordedTime = new String(source.ResultRecordedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "ConfigRuleName", this.ConfigRuleName);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);
        this.setParamSimple(map, prefix + "InvokingEventMessageType", this.InvokingEventMessageType);
        this.setParamSimple(map, prefix + "ConfigRuleInvokedTime", this.ConfigRuleInvokedTime);
        this.setParamSimple(map, prefix + "ResultRecordedTime", this.ResultRecordedTime);

    }
}

