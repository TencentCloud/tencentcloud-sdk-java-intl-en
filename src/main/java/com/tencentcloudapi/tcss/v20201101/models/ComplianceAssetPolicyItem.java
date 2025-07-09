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

public class ComplianceAssetPolicyItem extends AbstractModel {

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
    * Category of the check item
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Compliance standard ID
    */
    @SerializedName("BenchmarkStandardId")
    @Expose
    private Long BenchmarkStandardId;

    /**
    * Compliance standard name
    */
    @SerializedName("BenchmarkStandardName")
    @Expose
    private String BenchmarkStandardName;

    /**
    * Severity
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

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
    * Check result
`RESULT_PASSED`: Passed.
`RESULT_FAILED`: Failed.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * Allowed item ID of the check item. If it exists and is not `0`, the check item is ignored.
Note: This field may return null, indicating that no valid values can be obtained.
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
    * Last check time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * Verification information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VerifyInfo")
    @Expose
    private String VerifyInfo;

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
     * Get Category of the check item 
     * @return Category Category of the check item
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category of the check item
     * @param Category Category of the check item
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
     * Get Compliance standard name 
     * @return BenchmarkStandardName Compliance standard name
     */
    public String getBenchmarkStandardName() {
        return this.BenchmarkStandardName;
    }

    /**
     * Set Compliance standard name
     * @param BenchmarkStandardName Compliance standard name
     */
    public void setBenchmarkStandardName(String BenchmarkStandardName) {
        this.BenchmarkStandardName = BenchmarkStandardName;
    }

    /**
     * Get Severity 
     * @return RiskLevel Severity
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Severity
     * @param RiskLevel Severity
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get Check result
`RESULT_PASSED`: Passed.
`RESULT_FAILED`: Failed.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckResult Check result
`RESULT_PASSED`: Passed.
`RESULT_FAILED`: Failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set Check result
`RESULT_PASSED`: Passed.
`RESULT_FAILED`: Failed.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckResult Check result
`RESULT_PASSED`: Passed.
`RESULT_FAILED`: Failed.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get Allowed item ID of the check item. If it exists and is not `0`, the check item is ignored.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WhitelistId Allowed item ID of the check item. If it exists and is not `0`, the check item is ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWhitelistId() {
        return this.WhitelistId;
    }

    /**
     * Set Allowed item ID of the check item. If it exists and is not `0`, the check item is ignored.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WhitelistId Allowed item ID of the check item. If it exists and is not `0`, the check item is ignored.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Last check time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastCheckTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastCheckTime Last check time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get Verification information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VerifyInfo Verification information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVerifyInfo() {
        return this.VerifyInfo;
    }

    /**
     * Set Verification information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VerifyInfo Verification information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVerifyInfo(String VerifyInfo) {
        this.VerifyInfo = VerifyInfo;
    }

    public ComplianceAssetPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetPolicyItem(ComplianceAssetPolicyItem source) {
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
        if (source.BenchmarkStandardId != null) {
            this.BenchmarkStandardId = new Long(source.BenchmarkStandardId);
        }
        if (source.BenchmarkStandardName != null) {
            this.BenchmarkStandardName = new String(source.BenchmarkStandardName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.WhitelistId != null) {
            this.WhitelistId = new Long(source.WhitelistId);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.VerifyInfo != null) {
            this.VerifyInfo = new String(source.VerifyInfo);
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
        this.setParamSimple(map, prefix + "BenchmarkStandardId", this.BenchmarkStandardId);
        this.setParamSimple(map, prefix + "BenchmarkStandardName", this.BenchmarkStandardName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "WhitelistId", this.WhitelistId);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "VerifyInfo", this.VerifyInfo);

    }
}

