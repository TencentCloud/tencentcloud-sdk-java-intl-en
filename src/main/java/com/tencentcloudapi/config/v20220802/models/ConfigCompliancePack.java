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

public class ConfigCompliancePack extends AbstractModel {

    /**
    * <p>Compliance package status</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Compliance package ID.</p>
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Compliance package name.</p>
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * <p>Risk level.</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>Evaluation results.</p>
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String ComplianceResult;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Non-compliant rule name</p>
    */
    @SerializedName("NoCompliantNames")
    @Expose
    private String [] NoCompliantNames;

    /**
    * <p>Number of compliance package rules</p>
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
     * Get <p>Compliance package status</p> 
     * @return Status <p>Compliance package status</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Compliance package status</p>
     * @param Status <p>Compliance package status</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Compliance package ID.</p> 
     * @return CompliancePackId <p>Compliance package ID.</p>
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set <p>Compliance package ID.</p>
     * @param CompliancePackId <p>Compliance package ID.</p>
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Compliance package name.</p> 
     * @return CompliancePackName <p>Compliance package name.</p>
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set <p>Compliance package name.</p>
     * @param CompliancePackName <p>Compliance package name.</p>
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get <p>Risk level.</p> 
     * @return RiskLevel <p>Risk level.</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level.</p>
     * @param RiskLevel <p>Risk level.</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Evaluation results.</p> 
     * @return ComplianceResult <p>Evaluation results.</p>
     */
    public String getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set <p>Evaluation results.</p>
     * @param ComplianceResult <p>Evaluation results.</p>
     */
    public void setComplianceResult(String ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Non-compliant rule name</p> 
     * @return NoCompliantNames <p>Non-compliant rule name</p>
     */
    public String [] getNoCompliantNames() {
        return this.NoCompliantNames;
    }

    /**
     * Set <p>Non-compliant rule name</p>
     * @param NoCompliantNames <p>Non-compliant rule name</p>
     */
    public void setNoCompliantNames(String [] NoCompliantNames) {
        this.NoCompliantNames = NoCompliantNames;
    }

    /**
     * Get <p>Number of compliance package rules</p> 
     * @return RuleCount <p>Number of compliance package rules</p>
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set <p>Number of compliance package rules</p>
     * @param RuleCount <p>Number of compliance package rules</p>
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    public ConfigCompliancePack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigCompliancePack(ConfigCompliancePack source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String(source.ComplianceResult);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NoCompliantNames != null) {
            this.NoCompliantNames = new String[source.NoCompliantNames.length];
            for (int i = 0; i < source.NoCompliantNames.length; i++) {
                this.NoCompliantNames[i] = new String(source.NoCompliantNames[i]);
            }
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ComplianceResult", this.ComplianceResult);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "NoCompliantNames.", this.NoCompliantNames);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);

    }
}

