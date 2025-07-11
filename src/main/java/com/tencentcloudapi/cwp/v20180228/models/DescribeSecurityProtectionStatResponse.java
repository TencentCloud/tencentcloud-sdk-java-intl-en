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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityProtectionStatResponse extends AbstractModel {

    /**
    * 0: asset not paid; 1: agent not installed; 2: Pro or Ultimate Edition for some assets; 3: Pro or Ultimate Edition for all assets.
    */
    @SerializedName("AssetManageStat")
    @Expose
    private Long AssetManageStat;

    /**
    * 0: never scanned or asset not paid; 1: vulnerability risk found; 2: no risk.
    */
    @SerializedName("VulManageStat")
    @Expose
    private Long VulManageStat;

    /**
    * 0: never scanned or asset not paid; 1: baseline risk found; 2: no risk.
    */
    @SerializedName("SecureBasicLineStat")
    @Expose
    private Long SecureBasicLineStat;

    /**
    * 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
    */
    @SerializedName("MalwareScanStat")
    @Expose
    private Long MalwareScanStat;

    /**
    * Enabling status of password cracking prevention. 0: disabled or asset not paid; 1: enabled; 2: events pending fixing found.
    */
    @SerializedName("DefenseBruteAttackStat")
    @Expose
    private Long DefenseBruteAttackStat;

    /**
    * Core file monitoring. 0: disabled (asset not paid); 1: enabled.
    */
    @SerializedName("FileTamperStat")
    @Expose
    private Long FileTamperStat;

    /**
    * Web page tamper prevention. 0: disabled; 1: enabled.
    */
    @SerializedName("WebPageStat")
    @Expose
    private Long WebPageStat;

    /**
    * Abnormal log-in. 0: unfixed risks found; 1: no risk and allowlist not configured; 2: no risk and allowlist configured.
    */
    @SerializedName("LoginLogStat")
    @Expose
    private Long LoginLogStat;

    /**
    * Password cracking risk detection. 0: unfixed risks found; 1: no risk with detection in progress.
    */
    @SerializedName("DiscoverBruteAttackStat")
    @Expose
    private Long DiscoverBruteAttackStat;

    /**
    * Malicious request. 0: no asset in Pro or Ultimate Edition; 1: unfixed malicious request risks found; 2: paid assets found with no risk.
    */
    @SerializedName("MaliciousRequestStat")
    @Expose
    private Long MaliciousRequestStat;

    /**
    * Local privilege escalation. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
    */
    @SerializedName("PrivilegeStat")
    @Expose
    private Long PrivilegeStat;

    /**
    * Reverse shell. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
    */
    @SerializedName("ReverseShellStat")
    @Expose
    private Long ReverseShellStat;

    /**
    * Expert service. 0: disabled; 1: enabled.
    */
    @SerializedName("ExpertServiceStat")
    @Expose
    private Long ExpertServiceStat;

    /**
    * Log analysis. 0: disabled; 1: enabled.
    */
    @SerializedName("LogAnalysisStat")
    @Expose
    private Long LogAnalysisStat;

    /**
    * Security alarm. 0: disabled (for all assets); 1: enabled (for at least one asset).
    */
    @SerializedName("WarningSetStat")
    @Expose
    private Long WarningSetStat;

    /**
    * High-risk command. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
    */
    @SerializedName("EventBashStat")
    @Expose
    private Long EventBashStat;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0: asset not paid; 1: agent not installed; 2: Pro or Ultimate Edition for some assets; 3: Pro or Ultimate Edition for all assets. 
     * @return AssetManageStat 0: asset not paid; 1: agent not installed; 2: Pro or Ultimate Edition for some assets; 3: Pro or Ultimate Edition for all assets.
     */
    public Long getAssetManageStat() {
        return this.AssetManageStat;
    }

    /**
     * Set 0: asset not paid; 1: agent not installed; 2: Pro or Ultimate Edition for some assets; 3: Pro or Ultimate Edition for all assets.
     * @param AssetManageStat 0: asset not paid; 1: agent not installed; 2: Pro or Ultimate Edition for some assets; 3: Pro or Ultimate Edition for all assets.
     */
    public void setAssetManageStat(Long AssetManageStat) {
        this.AssetManageStat = AssetManageStat;
    }

    /**
     * Get 0: never scanned or asset not paid; 1: vulnerability risk found; 2: no risk. 
     * @return VulManageStat 0: never scanned or asset not paid; 1: vulnerability risk found; 2: no risk.
     */
    public Long getVulManageStat() {
        return this.VulManageStat;
    }

    /**
     * Set 0: never scanned or asset not paid; 1: vulnerability risk found; 2: no risk.
     * @param VulManageStat 0: never scanned or asset not paid; 1: vulnerability risk found; 2: no risk.
     */
    public void setVulManageStat(Long VulManageStat) {
        this.VulManageStat = VulManageStat;
    }

    /**
     * Get 0: never scanned or asset not paid; 1: baseline risk found; 2: no risk. 
     * @return SecureBasicLineStat 0: never scanned or asset not paid; 1: baseline risk found; 2: no risk.
     */
    public Long getSecureBasicLineStat() {
        return this.SecureBasicLineStat;
    }

    /**
     * Set 0: never scanned or asset not paid; 1: baseline risk found; 2: no risk.
     * @param SecureBasicLineStat 0: never scanned or asset not paid; 1: baseline risk found; 2: no risk.
     */
    public void setSecureBasicLineStat(Long SecureBasicLineStat) {
        this.SecureBasicLineStat = SecureBasicLineStat;
    }

    /**
     * Get 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found. 
     * @return MalwareScanStat 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
     */
    public Long getMalwareScanStat() {
        return this.MalwareScanStat;
    }

    /**
     * Set 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
     * @param MalwareScanStat 0: never scanned or asset not paid; 1: scanned and malicious files found; 2: scanned but isolation protection disabled; 3: scanned, protection enabled, and no risk found.
     */
    public void setMalwareScanStat(Long MalwareScanStat) {
        this.MalwareScanStat = MalwareScanStat;
    }

    /**
     * Get Enabling status of password cracking prevention. 0: disabled or asset not paid; 1: enabled; 2: events pending fixing found. 
     * @return DefenseBruteAttackStat Enabling status of password cracking prevention. 0: disabled or asset not paid; 1: enabled; 2: events pending fixing found.
     */
    public Long getDefenseBruteAttackStat() {
        return this.DefenseBruteAttackStat;
    }

    /**
     * Set Enabling status of password cracking prevention. 0: disabled or asset not paid; 1: enabled; 2: events pending fixing found.
     * @param DefenseBruteAttackStat Enabling status of password cracking prevention. 0: disabled or asset not paid; 1: enabled; 2: events pending fixing found.
     */
    public void setDefenseBruteAttackStat(Long DefenseBruteAttackStat) {
        this.DefenseBruteAttackStat = DefenseBruteAttackStat;
    }

    /**
     * Get Core file monitoring. 0: disabled (asset not paid); 1: enabled. 
     * @return FileTamperStat Core file monitoring. 0: disabled (asset not paid); 1: enabled.
     */
    public Long getFileTamperStat() {
        return this.FileTamperStat;
    }

    /**
     * Set Core file monitoring. 0: disabled (asset not paid); 1: enabled.
     * @param FileTamperStat Core file monitoring. 0: disabled (asset not paid); 1: enabled.
     */
    public void setFileTamperStat(Long FileTamperStat) {
        this.FileTamperStat = FileTamperStat;
    }

    /**
     * Get Web page tamper prevention. 0: disabled; 1: enabled. 
     * @return WebPageStat Web page tamper prevention. 0: disabled; 1: enabled.
     */
    public Long getWebPageStat() {
        return this.WebPageStat;
    }

    /**
     * Set Web page tamper prevention. 0: disabled; 1: enabled.
     * @param WebPageStat Web page tamper prevention. 0: disabled; 1: enabled.
     */
    public void setWebPageStat(Long WebPageStat) {
        this.WebPageStat = WebPageStat;
    }

    /**
     * Get Abnormal log-in. 0: unfixed risks found; 1: no risk and allowlist not configured; 2: no risk and allowlist configured. 
     * @return LoginLogStat Abnormal log-in. 0: unfixed risks found; 1: no risk and allowlist not configured; 2: no risk and allowlist configured.
     */
    public Long getLoginLogStat() {
        return this.LoginLogStat;
    }

    /**
     * Set Abnormal log-in. 0: unfixed risks found; 1: no risk and allowlist not configured; 2: no risk and allowlist configured.
     * @param LoginLogStat Abnormal log-in. 0: unfixed risks found; 1: no risk and allowlist not configured; 2: no risk and allowlist configured.
     */
    public void setLoginLogStat(Long LoginLogStat) {
        this.LoginLogStat = LoginLogStat;
    }

    /**
     * Get Password cracking risk detection. 0: unfixed risks found; 1: no risk with detection in progress. 
     * @return DiscoverBruteAttackStat Password cracking risk detection. 0: unfixed risks found; 1: no risk with detection in progress.
     */
    public Long getDiscoverBruteAttackStat() {
        return this.DiscoverBruteAttackStat;
    }

    /**
     * Set Password cracking risk detection. 0: unfixed risks found; 1: no risk with detection in progress.
     * @param DiscoverBruteAttackStat Password cracking risk detection. 0: unfixed risks found; 1: no risk with detection in progress.
     */
    public void setDiscoverBruteAttackStat(Long DiscoverBruteAttackStat) {
        this.DiscoverBruteAttackStat = DiscoverBruteAttackStat;
    }

    /**
     * Get Malicious request. 0: no asset in Pro or Ultimate Edition; 1: unfixed malicious request risks found; 2: paid assets found with no risk. 
     * @return MaliciousRequestStat Malicious request. 0: no asset in Pro or Ultimate Edition; 1: unfixed malicious request risks found; 2: paid assets found with no risk.
     */
    public Long getMaliciousRequestStat() {
        return this.MaliciousRequestStat;
    }

    /**
     * Set Malicious request. 0: no asset in Pro or Ultimate Edition; 1: unfixed malicious request risks found; 2: paid assets found with no risk.
     * @param MaliciousRequestStat Malicious request. 0: no asset in Pro or Ultimate Edition; 1: unfixed malicious request risks found; 2: paid assets found with no risk.
     */
    public void setMaliciousRequestStat(Long MaliciousRequestStat) {
        this.MaliciousRequestStat = MaliciousRequestStat;
    }

    /**
     * Get Local privilege escalation. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk. 
     * @return PrivilegeStat Local privilege escalation. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public Long getPrivilegeStat() {
        return this.PrivilegeStat;
    }

    /**
     * Set Local privilege escalation. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     * @param PrivilegeStat Local privilege escalation. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public void setPrivilegeStat(Long PrivilegeStat) {
        this.PrivilegeStat = PrivilegeStat;
    }

    /**
     * Get Reverse shell. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk. 
     * @return ReverseShellStat Reverse shell. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public Long getReverseShellStat() {
        return this.ReverseShellStat;
    }

    /**
     * Set Reverse shell. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     * @param ReverseShellStat Reverse shell. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public void setReverseShellStat(Long ReverseShellStat) {
        this.ReverseShellStat = ReverseShellStat;
    }

    /**
     * Get Expert service. 0: disabled; 1: enabled. 
     * @return ExpertServiceStat Expert service. 0: disabled; 1: enabled.
     */
    public Long getExpertServiceStat() {
        return this.ExpertServiceStat;
    }

    /**
     * Set Expert service. 0: disabled; 1: enabled.
     * @param ExpertServiceStat Expert service. 0: disabled; 1: enabled.
     */
    public void setExpertServiceStat(Long ExpertServiceStat) {
        this.ExpertServiceStat = ExpertServiceStat;
    }

    /**
     * Get Log analysis. 0: disabled; 1: enabled. 
     * @return LogAnalysisStat Log analysis. 0: disabled; 1: enabled.
     */
    public Long getLogAnalysisStat() {
        return this.LogAnalysisStat;
    }

    /**
     * Set Log analysis. 0: disabled; 1: enabled.
     * @param LogAnalysisStat Log analysis. 0: disabled; 1: enabled.
     */
    public void setLogAnalysisStat(Long LogAnalysisStat) {
        this.LogAnalysisStat = LogAnalysisStat;
    }

    /**
     * Get Security alarm. 0: disabled (for all assets); 1: enabled (for at least one asset). 
     * @return WarningSetStat Security alarm. 0: disabled (for all assets); 1: enabled (for at least one asset).
     */
    public Long getWarningSetStat() {
        return this.WarningSetStat;
    }

    /**
     * Set Security alarm. 0: disabled (for all assets); 1: enabled (for at least one asset).
     * @param WarningSetStat Security alarm. 0: disabled (for all assets); 1: enabled (for at least one asset).
     */
    public void setWarningSetStat(Long WarningSetStat) {
        this.WarningSetStat = WarningSetStat;
    }

    /**
     * Get High-risk command. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk. 
     * @return EventBashStat High-risk command. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public Long getEventBashStat() {
        return this.EventBashStat;
    }

    /**
     * Set High-risk command. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     * @param EventBashStat High-risk command. 0: no asset in Pro or Ultimate Edition; 1: unfixed risks found; 2: paid assets found with no risk.
     */
    public void setEventBashStat(Long EventBashStat) {
        this.EventBashStat = EventBashStat;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecurityProtectionStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityProtectionStatResponse(DescribeSecurityProtectionStatResponse source) {
        if (source.AssetManageStat != null) {
            this.AssetManageStat = new Long(source.AssetManageStat);
        }
        if (source.VulManageStat != null) {
            this.VulManageStat = new Long(source.VulManageStat);
        }
        if (source.SecureBasicLineStat != null) {
            this.SecureBasicLineStat = new Long(source.SecureBasicLineStat);
        }
        if (source.MalwareScanStat != null) {
            this.MalwareScanStat = new Long(source.MalwareScanStat);
        }
        if (source.DefenseBruteAttackStat != null) {
            this.DefenseBruteAttackStat = new Long(source.DefenseBruteAttackStat);
        }
        if (source.FileTamperStat != null) {
            this.FileTamperStat = new Long(source.FileTamperStat);
        }
        if (source.WebPageStat != null) {
            this.WebPageStat = new Long(source.WebPageStat);
        }
        if (source.LoginLogStat != null) {
            this.LoginLogStat = new Long(source.LoginLogStat);
        }
        if (source.DiscoverBruteAttackStat != null) {
            this.DiscoverBruteAttackStat = new Long(source.DiscoverBruteAttackStat);
        }
        if (source.MaliciousRequestStat != null) {
            this.MaliciousRequestStat = new Long(source.MaliciousRequestStat);
        }
        if (source.PrivilegeStat != null) {
            this.PrivilegeStat = new Long(source.PrivilegeStat);
        }
        if (source.ReverseShellStat != null) {
            this.ReverseShellStat = new Long(source.ReverseShellStat);
        }
        if (source.ExpertServiceStat != null) {
            this.ExpertServiceStat = new Long(source.ExpertServiceStat);
        }
        if (source.LogAnalysisStat != null) {
            this.LogAnalysisStat = new Long(source.LogAnalysisStat);
        }
        if (source.WarningSetStat != null) {
            this.WarningSetStat = new Long(source.WarningSetStat);
        }
        if (source.EventBashStat != null) {
            this.EventBashStat = new Long(source.EventBashStat);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetManageStat", this.AssetManageStat);
        this.setParamSimple(map, prefix + "VulManageStat", this.VulManageStat);
        this.setParamSimple(map, prefix + "SecureBasicLineStat", this.SecureBasicLineStat);
        this.setParamSimple(map, prefix + "MalwareScanStat", this.MalwareScanStat);
        this.setParamSimple(map, prefix + "DefenseBruteAttackStat", this.DefenseBruteAttackStat);
        this.setParamSimple(map, prefix + "FileTamperStat", this.FileTamperStat);
        this.setParamSimple(map, prefix + "WebPageStat", this.WebPageStat);
        this.setParamSimple(map, prefix + "LoginLogStat", this.LoginLogStat);
        this.setParamSimple(map, prefix + "DiscoverBruteAttackStat", this.DiscoverBruteAttackStat);
        this.setParamSimple(map, prefix + "MaliciousRequestStat", this.MaliciousRequestStat);
        this.setParamSimple(map, prefix + "PrivilegeStat", this.PrivilegeStat);
        this.setParamSimple(map, prefix + "ReverseShellStat", this.ReverseShellStat);
        this.setParamSimple(map, prefix + "ExpertServiceStat", this.ExpertServiceStat);
        this.setParamSimple(map, prefix + "LogAnalysisStat", this.LogAnalysisStat);
        this.setParamSimple(map, prefix + "WarningSetStat", this.WarningSetStat);
        this.setParamSimple(map, prefix + "EventBashStat", this.EventBashStat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

