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

public class CompliancePolicyItemSummary extends AbstractModel {

    /**
    * Unique ID of the customer check item
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * Original ID of the check item
    */
    @SerializedName("BasePolicyItemId")
    @Expose
    private Long BasePolicyItemId;

    /**
    * Check item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Category of the check item, which is an enumerated string.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Compliance standard
    */
    @SerializedName("BenchmarkStandardName")
    @Expose
    private String BenchmarkStandardName;

    /**
    * Severity. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * Asset type of the check item
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Last detection time
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * Check status

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * Detection result. RESULT_PASSED: Passed.

RESULT_FAILED: failed
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * Number of assets passed detection
    */
    @SerializedName("PassedAssetCount")
    @Expose
    private Long PassedAssetCount;

    /**
    * Number of assets with detection failed
    */
    @SerializedName("FailedAssetCount")
    @Expose
    private Long FailedAssetCount;

    /**
    * ID of the allowlist item corresponding to the detection item. If it exists and is not 0, it means the detection item is ignored by the user.
    */
    @SerializedName("WhitelistId")
    @Expose
    private Long WhitelistId;

    /**
    * Handling suggestion
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
    * Compliance standard ID
    */
    @SerializedName("BenchmarkStandardId")
    @Expose
    private Long BenchmarkStandardId;

    /**
    * Applicable Version for Check Items
    */
    @SerializedName("ApplicableVersion")
    @Expose
    private String ApplicableVersion;

    /**
    * Check Item Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Check Item Audit Method
    */
    @SerializedName("AuditProcedure")
    @Expose
    private String AuditProcedure;

    /**
    * Whether enabled
<li>0 Off</li>
<li>1 Enable</li>
    */
    @SerializedName("IsEnable")
    @Expose
    private Long IsEnable;

    /**
     * Get Unique ID of the customer check item 
     * @return CustomerPolicyItemId Unique ID of the customer check item
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set Unique ID of the customer check item
     * @param CustomerPolicyItemId Unique ID of the customer check item
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get Original ID of the check item 
     * @return BasePolicyItemId Original ID of the check item
     */
    public Long getBasePolicyItemId() {
        return this.BasePolicyItemId;
    }

    /**
     * Set Original ID of the check item
     * @param BasePolicyItemId Original ID of the check item
     */
    public void setBasePolicyItemId(Long BasePolicyItemId) {
        this.BasePolicyItemId = BasePolicyItemId;
    }

    /**
     * Get Check item name 
     * @return Name Check item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Check item name
     * @param Name Check item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Category of the check item, which is an enumerated string. 
     * @return Category Category of the check item, which is an enumerated string.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category of the check item, which is an enumerated string.
     * @param Category Category of the check item, which is an enumerated string.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Compliance standard 
     * @return BenchmarkStandardName Compliance standard
     */
    public String getBenchmarkStandardName() {
        return this.BenchmarkStandardName;
    }

    /**
     * Set Compliance standard
     * @param BenchmarkStandardName Compliance standard
     */
    public void setBenchmarkStandardName(String BenchmarkStandardName) {
        this.BenchmarkStandardName = BenchmarkStandardName;
    }

    /**
     * Get Severity. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`. 
     * @return RiskLevel Severity. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Severity. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
     * @param RiskLevel Severity. Valid values: `RISK_CRITICAL`, `RISK_HIGH`, `RISK_MEDIUM`, `RISK_LOW`, `RISK_NOTICE`.
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Asset type of the check item 
     * @return AssetType Asset type of the check item
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type of the check item
     * @param AssetType Asset type of the check item
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Last detection time 
     * @return LastCheckTime Last detection time
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set Last detection time
     * @param LastCheckTime Last detection time
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get Check status

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed. 
     * @return CheckStatus Check status

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set Check status

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
     * @param CheckStatus Check status

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Detection result. RESULT_PASSED: Passed.

RESULT_FAILED: failed 
     * @return CheckResult Detection result. RESULT_PASSED: Passed.

RESULT_FAILED: failed
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Detection result. RESULT_PASSED: Passed.

RESULT_FAILED: failed
     * @param CheckResult Detection result. RESULT_PASSED: Passed.

RESULT_FAILED: failed
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get Number of assets passed detection 
     * @return PassedAssetCount Number of assets passed detection
     */
    public Long getPassedAssetCount() {
        return this.PassedAssetCount;
    }

    /**
     * Set Number of assets passed detection
     * @param PassedAssetCount Number of assets passed detection
     */
    public void setPassedAssetCount(Long PassedAssetCount) {
        this.PassedAssetCount = PassedAssetCount;
    }

    /**
     * Get Number of assets with detection failed 
     * @return FailedAssetCount Number of assets with detection failed
     */
    public Long getFailedAssetCount() {
        return this.FailedAssetCount;
    }

    /**
     * Set Number of assets with detection failed
     * @param FailedAssetCount Number of assets with detection failed
     */
    public void setFailedAssetCount(Long FailedAssetCount) {
        this.FailedAssetCount = FailedAssetCount;
    }

    /**
     * Get ID of the allowlist item corresponding to the detection item. If it exists and is not 0, it means the detection item is ignored by the user. 
     * @return WhitelistId ID of the allowlist item corresponding to the detection item. If it exists and is not 0, it means the detection item is ignored by the user.
     */
    public Long getWhitelistId() {
        return this.WhitelistId;
    }

    /**
     * Set ID of the allowlist item corresponding to the detection item. If it exists and is not 0, it means the detection item is ignored by the user.
     * @param WhitelistId ID of the allowlist item corresponding to the detection item. If it exists and is not 0, it means the detection item is ignored by the user.
     */
    public void setWhitelistId(Long WhitelistId) {
        this.WhitelistId = WhitelistId;
    }

    /**
     * Get Handling suggestion 
     * @return FixSuggestion Handling suggestion
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set Handling suggestion
     * @param FixSuggestion Handling suggestion
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    /**
     * Get Compliance standard ID 
     * @return BenchmarkStandardId Compliance standard ID
     */
    public Long getBenchmarkStandardId() {
        return this.BenchmarkStandardId;
    }

    /**
     * Set Compliance standard ID
     * @param BenchmarkStandardId Compliance standard ID
     */
    public void setBenchmarkStandardId(Long BenchmarkStandardId) {
        this.BenchmarkStandardId = BenchmarkStandardId;
    }

    /**
     * Get Applicable Version for Check Items 
     * @return ApplicableVersion Applicable Version for Check Items
     */
    public String getApplicableVersion() {
        return this.ApplicableVersion;
    }

    /**
     * Set Applicable Version for Check Items
     * @param ApplicableVersion Applicable Version for Check Items
     */
    public void setApplicableVersion(String ApplicableVersion) {
        this.ApplicableVersion = ApplicableVersion;
    }

    /**
     * Get Check Item Description 
     * @return Description Check Item Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Check Item Description
     * @param Description Check Item Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Check Item Audit Method 
     * @return AuditProcedure Check Item Audit Method
     */
    public String getAuditProcedure() {
        return this.AuditProcedure;
    }

    /**
     * Set Check Item Audit Method
     * @param AuditProcedure Check Item Audit Method
     */
    public void setAuditProcedure(String AuditProcedure) {
        this.AuditProcedure = AuditProcedure;
    }

    /**
     * Get Whether enabled
<li>0 Off</li>
<li>1 Enable</li> 
     * @return IsEnable Whether enabled
<li>0 Off</li>
<li>1 Enable</li>
     */
    public Long getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Whether enabled
<li>0 Off</li>
<li>1 Enable</li>
     * @param IsEnable Whether enabled
<li>0 Off</li>
<li>1 Enable</li>
     */
    public void setIsEnable(Long IsEnable) {
        this.IsEnable = IsEnable;
    }

    public CompliancePolicyItemSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePolicyItemSummary(CompliancePolicyItemSummary source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.BasePolicyItemId != null) {
            this.BasePolicyItemId = new Long(source.BasePolicyItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.BenchmarkStandardName != null) {
            this.BenchmarkStandardName = new String(source.BenchmarkStandardName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.PassedAssetCount != null) {
            this.PassedAssetCount = new Long(source.PassedAssetCount);
        }
        if (source.FailedAssetCount != null) {
            this.FailedAssetCount = new Long(source.FailedAssetCount);
        }
        if (source.WhitelistId != null) {
            this.WhitelistId = new Long(source.WhitelistId);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
        if (source.BenchmarkStandardId != null) {
            this.BenchmarkStandardId = new Long(source.BenchmarkStandardId);
        }
        if (source.ApplicableVersion != null) {
            this.ApplicableVersion = new String(source.ApplicableVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AuditProcedure != null) {
            this.AuditProcedure = new String(source.AuditProcedure);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Long(source.IsEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamSimple(map, prefix + "BasePolicyItemId", this.BasePolicyItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "BenchmarkStandardName", this.BenchmarkStandardName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "PassedAssetCount", this.PassedAssetCount);
        this.setParamSimple(map, prefix + "FailedAssetCount", this.FailedAssetCount);
        this.setParamSimple(map, prefix + "WhitelistId", this.WhitelistId);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);
        this.setParamSimple(map, prefix + "BenchmarkStandardId", this.BenchmarkStandardId);
        this.setParamSimple(map, prefix + "ApplicableVersion", this.ApplicableVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuditProcedure", this.AuditProcedure);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);

    }
}

