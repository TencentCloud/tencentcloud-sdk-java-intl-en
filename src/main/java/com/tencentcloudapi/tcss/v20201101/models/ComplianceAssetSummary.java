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

public class ComplianceAssetSummary extends AbstractModel {

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Whether it is the first check. This parameter is used together with `CheckStatus`.
    */
    @SerializedName("IsCustomerFirstCheck")
    @Expose
    private Boolean IsCustomerFirstCheck;

    /**
    * Check status

`CHECK_UNINIT`: Feature not enabled.

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * The detection progress of this category is a number between 0 and 100. If not in progress, field not found.
    */
    @SerializedName("CheckProgress")
    @Expose
    private Float CheckProgress;

    /**
    * Number of check items that the asset passed
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * Number of check items that the asset failed
    */
    @SerializedName("FailedPolicyItemCount")
    @Expose
    private Long FailedPolicyItemCount;

    /**
    * Number of critical check items that the asset failed
    */
    @SerializedName("FailedCriticalPolicyItemCount")
    @Expose
    private Long FailedCriticalPolicyItemCount;

    /**
    * Number of high-risk check items that the asset failed
    */
    @SerializedName("FailedHighRiskPolicyItemCount")
    @Expose
    private Long FailedHighRiskPolicyItemCount;

    /**
    * Number of medium-risk check items that the asset failed
    */
    @SerializedName("FailedMediumRiskPolicyItemCount")
    @Expose
    private Long FailedMediumRiskPolicyItemCount;

    /**
    * Number of low-risk check items that the asset failed
    */
    @SerializedName("FailedLowRiskPolicyItemCount")
    @Expose
    private Long FailedLowRiskPolicyItemCount;

    /**
    * Number of prompt check items of the asset
    */
    @SerializedName("NoticePolicyItemCount")
    @Expose
    private Long NoticePolicyItemCount;

    /**
    * Number of assets that passed the check
    */
    @SerializedName("PassedAssetCount")
    @Expose
    private Long PassedAssetCount;

    /**
    * Number of assets that failed the check
    */
    @SerializedName("FailedAssetCount")
    @Expose
    private Long FailedAssetCount;

    /**
    * Asset compliance rate. Value range: 0-100.
    */
    @SerializedName("AssetPassedRate")
    @Expose
    private Float AssetPassedRate;

    /**
    * Number of assets that failed the check
    */
    @SerializedName("ScanFailedAssetCount")
    @Expose
    private Long ScanFailedAssetCount;

    /**
    * Time taken for last detection, in seconds.
    */
    @SerializedName("CheckCostTime")
    @Expose
    private Float CheckCostTime;

    /**
    * Last detection time.
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * Scheduled check rule
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * Total Number of Enabled Check Items
    */
    @SerializedName("OpenPolicyItemCount")
    @Expose
    private Long OpenPolicyItemCount;

    /**
    * Total Number of Ignored Check Items
    */
    @SerializedName("IgnoredPolicyItemCount")
    @Expose
    private Long IgnoredPolicyItemCount;

    /**
    * Total number of detection items.
    */
    @SerializedName("TotalPolicyItemCount")
    @Expose
    private Long TotalPolicyItemCount;

    /**
    * Detection hosts
    */
    @SerializedName("DetectHostCount")
    @Expose
    private Long DetectHostCount;

    /**
    * Remaining time of the current task, in seconds.
    */
    @SerializedName("LeftTime")
    @Expose
    private Long LeftTime;

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Whether it is the first check. This parameter is used together with `CheckStatus`. 
     * @return IsCustomerFirstCheck Whether it is the first check. This parameter is used together with `CheckStatus`.
     */
    public Boolean getIsCustomerFirstCheck() {
        return this.IsCustomerFirstCheck;
    }

    /**
     * Set Whether it is the first check. This parameter is used together with `CheckStatus`.
     * @param IsCustomerFirstCheck Whether it is the first check. This parameter is used together with `CheckStatus`.
     */
    public void setIsCustomerFirstCheck(Boolean IsCustomerFirstCheck) {
        this.IsCustomerFirstCheck = IsCustomerFirstCheck;
    }

    /**
     * Get Check status

`CHECK_UNINIT`: Feature not enabled.

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed. 
     * @return CheckStatus Check status

`CHECK_UNINIT`: Feature not enabled.

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

`CHECK_UNINIT`: Feature not enabled.

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
     * @param CheckStatus Check status

`CHECK_UNINIT`: Feature not enabled.

`CHECK_INIT`: To be checked.

`CHECK_RUNNING`: Checking.

`CHECK_FINISHED`: Checked.

`CHECK_FAILED`: Check failed.
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get The detection progress of this category is a number between 0 and 100. If not in progress, field not found. 
     * @return CheckProgress The detection progress of this category is a number between 0 and 100. If not in progress, field not found.
     */
    public Float getCheckProgress() {
        return this.CheckProgress;
    }

    /**
     * Set The detection progress of this category is a number between 0 and 100. If not in progress, field not found.
     * @param CheckProgress The detection progress of this category is a number between 0 and 100. If not in progress, field not found.
     */
    public void setCheckProgress(Float CheckProgress) {
        this.CheckProgress = CheckProgress;
    }

    /**
     * Get Number of check items that the asset passed 
     * @return PassedPolicyItemCount Number of check items that the asset passed
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset passed
     * @param PassedPolicyItemCount Number of check items that the asset passed
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get Number of check items that the asset failed 
     * @return FailedPolicyItemCount Number of check items that the asset failed
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set Number of check items that the asset failed
     * @param FailedPolicyItemCount Number of check items that the asset failed
     */
    public void setFailedPolicyItemCount(Long FailedPolicyItemCount) {
        this.FailedPolicyItemCount = FailedPolicyItemCount;
    }

    /**
     * Get Number of critical check items that the asset failed 
     * @return FailedCriticalPolicyItemCount Number of critical check items that the asset failed
     */
    public Long getFailedCriticalPolicyItemCount() {
        return this.FailedCriticalPolicyItemCount;
    }

    /**
     * Set Number of critical check items that the asset failed
     * @param FailedCriticalPolicyItemCount Number of critical check items that the asset failed
     */
    public void setFailedCriticalPolicyItemCount(Long FailedCriticalPolicyItemCount) {
        this.FailedCriticalPolicyItemCount = FailedCriticalPolicyItemCount;
    }

    /**
     * Get Number of high-risk check items that the asset failed 
     * @return FailedHighRiskPolicyItemCount Number of high-risk check items that the asset failed
     */
    public Long getFailedHighRiskPolicyItemCount() {
        return this.FailedHighRiskPolicyItemCount;
    }

    /**
     * Set Number of high-risk check items that the asset failed
     * @param FailedHighRiskPolicyItemCount Number of high-risk check items that the asset failed
     */
    public void setFailedHighRiskPolicyItemCount(Long FailedHighRiskPolicyItemCount) {
        this.FailedHighRiskPolicyItemCount = FailedHighRiskPolicyItemCount;
    }

    /**
     * Get Number of medium-risk check items that the asset failed 
     * @return FailedMediumRiskPolicyItemCount Number of medium-risk check items that the asset failed
     */
    public Long getFailedMediumRiskPolicyItemCount() {
        return this.FailedMediumRiskPolicyItemCount;
    }

    /**
     * Set Number of medium-risk check items that the asset failed
     * @param FailedMediumRiskPolicyItemCount Number of medium-risk check items that the asset failed
     */
    public void setFailedMediumRiskPolicyItemCount(Long FailedMediumRiskPolicyItemCount) {
        this.FailedMediumRiskPolicyItemCount = FailedMediumRiskPolicyItemCount;
    }

    /**
     * Get Number of low-risk check items that the asset failed 
     * @return FailedLowRiskPolicyItemCount Number of low-risk check items that the asset failed
     */
    public Long getFailedLowRiskPolicyItemCount() {
        return this.FailedLowRiskPolicyItemCount;
    }

    /**
     * Set Number of low-risk check items that the asset failed
     * @param FailedLowRiskPolicyItemCount Number of low-risk check items that the asset failed
     */
    public void setFailedLowRiskPolicyItemCount(Long FailedLowRiskPolicyItemCount) {
        this.FailedLowRiskPolicyItemCount = FailedLowRiskPolicyItemCount;
    }

    /**
     * Get Number of prompt check items of the asset 
     * @return NoticePolicyItemCount Number of prompt check items of the asset
     */
    public Long getNoticePolicyItemCount() {
        return this.NoticePolicyItemCount;
    }

    /**
     * Set Number of prompt check items of the asset
     * @param NoticePolicyItemCount Number of prompt check items of the asset
     */
    public void setNoticePolicyItemCount(Long NoticePolicyItemCount) {
        this.NoticePolicyItemCount = NoticePolicyItemCount;
    }

    /**
     * Get Number of assets that passed the check 
     * @return PassedAssetCount Number of assets that passed the check
     */
    public Long getPassedAssetCount() {
        return this.PassedAssetCount;
    }

    /**
     * Set Number of assets that passed the check
     * @param PassedAssetCount Number of assets that passed the check
     */
    public void setPassedAssetCount(Long PassedAssetCount) {
        this.PassedAssetCount = PassedAssetCount;
    }

    /**
     * Get Number of assets that failed the check 
     * @return FailedAssetCount Number of assets that failed the check
     */
    public Long getFailedAssetCount() {
        return this.FailedAssetCount;
    }

    /**
     * Set Number of assets that failed the check
     * @param FailedAssetCount Number of assets that failed the check
     */
    public void setFailedAssetCount(Long FailedAssetCount) {
        this.FailedAssetCount = FailedAssetCount;
    }

    /**
     * Get Asset compliance rate. Value range: 0-100. 
     * @return AssetPassedRate Asset compliance rate. Value range: 0-100.
     */
    public Float getAssetPassedRate() {
        return this.AssetPassedRate;
    }

    /**
     * Set Asset compliance rate. Value range: 0-100.
     * @param AssetPassedRate Asset compliance rate. Value range: 0-100.
     */
    public void setAssetPassedRate(Float AssetPassedRate) {
        this.AssetPassedRate = AssetPassedRate;
    }

    /**
     * Get Number of assets that failed the check 
     * @return ScanFailedAssetCount Number of assets that failed the check
     */
    public Long getScanFailedAssetCount() {
        return this.ScanFailedAssetCount;
    }

    /**
     * Set Number of assets that failed the check
     * @param ScanFailedAssetCount Number of assets that failed the check
     */
    public void setScanFailedAssetCount(Long ScanFailedAssetCount) {
        this.ScanFailedAssetCount = ScanFailedAssetCount;
    }

    /**
     * Get Time taken for last detection, in seconds. 
     * @return CheckCostTime Time taken for last detection, in seconds.
     */
    public Float getCheckCostTime() {
        return this.CheckCostTime;
    }

    /**
     * Set Time taken for last detection, in seconds.
     * @param CheckCostTime Time taken for last detection, in seconds.
     */
    public void setCheckCostTime(Float CheckCostTime) {
        this.CheckCostTime = CheckCostTime;
    }

    /**
     * Get Last detection time. 
     * @return LastCheckTime Last detection time.
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set Last detection time.
     * @param LastCheckTime Last detection time.
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get Scheduled check rule 
     * @return PeriodRule Scheduled check rule
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set Scheduled check rule
     * @param PeriodRule Scheduled check rule
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get Total Number of Enabled Check Items 
     * @return OpenPolicyItemCount Total Number of Enabled Check Items
     */
    public Long getOpenPolicyItemCount() {
        return this.OpenPolicyItemCount;
    }

    /**
     * Set Total Number of Enabled Check Items
     * @param OpenPolicyItemCount Total Number of Enabled Check Items
     */
    public void setOpenPolicyItemCount(Long OpenPolicyItemCount) {
        this.OpenPolicyItemCount = OpenPolicyItemCount;
    }

    /**
     * Get Total Number of Ignored Check Items 
     * @return IgnoredPolicyItemCount Total Number of Ignored Check Items
     */
    public Long getIgnoredPolicyItemCount() {
        return this.IgnoredPolicyItemCount;
    }

    /**
     * Set Total Number of Ignored Check Items
     * @param IgnoredPolicyItemCount Total Number of Ignored Check Items
     */
    public void setIgnoredPolicyItemCount(Long IgnoredPolicyItemCount) {
        this.IgnoredPolicyItemCount = IgnoredPolicyItemCount;
    }

    /**
     * Get Total number of detection items. 
     * @return TotalPolicyItemCount Total number of detection items.
     */
    public Long getTotalPolicyItemCount() {
        return this.TotalPolicyItemCount;
    }

    /**
     * Set Total number of detection items.
     * @param TotalPolicyItemCount Total number of detection items.
     */
    public void setTotalPolicyItemCount(Long TotalPolicyItemCount) {
        this.TotalPolicyItemCount = TotalPolicyItemCount;
    }

    /**
     * Get Detection hosts 
     * @return DetectHostCount Detection hosts
     */
    public Long getDetectHostCount() {
        return this.DetectHostCount;
    }

    /**
     * Set Detection hosts
     * @param DetectHostCount Detection hosts
     */
    public void setDetectHostCount(Long DetectHostCount) {
        this.DetectHostCount = DetectHostCount;
    }

    /**
     * Get Remaining time of the current task, in seconds. 
     * @return LeftTime Remaining time of the current task, in seconds.
     */
    public Long getLeftTime() {
        return this.LeftTime;
    }

    /**
     * Set Remaining time of the current task, in seconds.
     * @param LeftTime Remaining time of the current task, in seconds.
     */
    public void setLeftTime(Long LeftTime) {
        this.LeftTime = LeftTime;
    }

    public ComplianceAssetSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetSummary(ComplianceAssetSummary source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.IsCustomerFirstCheck != null) {
            this.IsCustomerFirstCheck = new Boolean(source.IsCustomerFirstCheck);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckProgress != null) {
            this.CheckProgress = new Float(source.CheckProgress);
        }
        if (source.PassedPolicyItemCount != null) {
            this.PassedPolicyItemCount = new Long(source.PassedPolicyItemCount);
        }
        if (source.FailedPolicyItemCount != null) {
            this.FailedPolicyItemCount = new Long(source.FailedPolicyItemCount);
        }
        if (source.FailedCriticalPolicyItemCount != null) {
            this.FailedCriticalPolicyItemCount = new Long(source.FailedCriticalPolicyItemCount);
        }
        if (source.FailedHighRiskPolicyItemCount != null) {
            this.FailedHighRiskPolicyItemCount = new Long(source.FailedHighRiskPolicyItemCount);
        }
        if (source.FailedMediumRiskPolicyItemCount != null) {
            this.FailedMediumRiskPolicyItemCount = new Long(source.FailedMediumRiskPolicyItemCount);
        }
        if (source.FailedLowRiskPolicyItemCount != null) {
            this.FailedLowRiskPolicyItemCount = new Long(source.FailedLowRiskPolicyItemCount);
        }
        if (source.NoticePolicyItemCount != null) {
            this.NoticePolicyItemCount = new Long(source.NoticePolicyItemCount);
        }
        if (source.PassedAssetCount != null) {
            this.PassedAssetCount = new Long(source.PassedAssetCount);
        }
        if (source.FailedAssetCount != null) {
            this.FailedAssetCount = new Long(source.FailedAssetCount);
        }
        if (source.AssetPassedRate != null) {
            this.AssetPassedRate = new Float(source.AssetPassedRate);
        }
        if (source.ScanFailedAssetCount != null) {
            this.ScanFailedAssetCount = new Long(source.ScanFailedAssetCount);
        }
        if (source.CheckCostTime != null) {
            this.CheckCostTime = new Float(source.CheckCostTime);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.OpenPolicyItemCount != null) {
            this.OpenPolicyItemCount = new Long(source.OpenPolicyItemCount);
        }
        if (source.IgnoredPolicyItemCount != null) {
            this.IgnoredPolicyItemCount = new Long(source.IgnoredPolicyItemCount);
        }
        if (source.TotalPolicyItemCount != null) {
            this.TotalPolicyItemCount = new Long(source.TotalPolicyItemCount);
        }
        if (source.DetectHostCount != null) {
            this.DetectHostCount = new Long(source.DetectHostCount);
        }
        if (source.LeftTime != null) {
            this.LeftTime = new Long(source.LeftTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "IsCustomerFirstCheck", this.IsCustomerFirstCheck);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckProgress", this.CheckProgress);
        this.setParamSimple(map, prefix + "PassedPolicyItemCount", this.PassedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedPolicyItemCount", this.FailedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedCriticalPolicyItemCount", this.FailedCriticalPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedHighRiskPolicyItemCount", this.FailedHighRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedMediumRiskPolicyItemCount", this.FailedMediumRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedLowRiskPolicyItemCount", this.FailedLowRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "NoticePolicyItemCount", this.NoticePolicyItemCount);
        this.setParamSimple(map, prefix + "PassedAssetCount", this.PassedAssetCount);
        this.setParamSimple(map, prefix + "FailedAssetCount", this.FailedAssetCount);
        this.setParamSimple(map, prefix + "AssetPassedRate", this.AssetPassedRate);
        this.setParamSimple(map, prefix + "ScanFailedAssetCount", this.ScanFailedAssetCount);
        this.setParamSimple(map, prefix + "CheckCostTime", this.CheckCostTime);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamSimple(map, prefix + "OpenPolicyItemCount", this.OpenPolicyItemCount);
        this.setParamSimple(map, prefix + "IgnoredPolicyItemCount", this.IgnoredPolicyItemCount);
        this.setParamSimple(map, prefix + "TotalPolicyItemCount", this.TotalPolicyItemCount);
        this.setParamSimple(map, prefix + "DetectHostCount", this.DetectHostCount);
        this.setParamSimple(map, prefix + "LeftTime", this.LeftTime);

    }
}

