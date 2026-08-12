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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostVulRisk extends AbstractModel {

    /**
    * <p>Risk record ID (host_vul_risk.id)</p>
    */
    @SerializedName("RiskID")
    @Expose
    private Long RiskID;

    /**
    * <p>Number of affected hosts</p>
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * <p>Latest scan time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Account list it belongs to</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo [] Account;

    /**
    * <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * <p>Remediation status<br>Enumeration values:<br>PENDING: to be fixed<br>SCANNING: scan in progress<br>FIXED: fixed<br>IGNORED: whitelisted<br>FIXING: fix<br>FIX_FAILED: FIX_FAILURE<br>NOTSCAN: unscanned<br>WITHOUT_RISK: no risk<br>NEED_REBOOT: pending restart</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * <p>Vulnerability details</p>
    */
    @SerializedName("VulDetail")
    @Expose
    private VulDetailInfo VulDetail;

    /**
     * Get <p>Risk record ID (host_vul_risk.id)</p> 
     * @return RiskID <p>Risk record ID (host_vul_risk.id)</p>
     */
    public Long getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>Risk record ID (host_vul_risk.id)</p>
     * @param RiskID <p>Risk record ID (host_vul_risk.id)</p>
     */
    public void setRiskID(Long RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>Number of affected hosts</p> 
     * @return EffectHostCount <p>Number of affected hosts</p>
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set <p>Number of affected hosts</p>
     * @param EffectHostCount <p>Number of affected hosts</p>
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get <p>Latest scan time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p> 
     * @return LatestScanTime <p>Latest scan time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Latest scan time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     * @param LatestScanTime <p>Latest scan time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Account list it belongs to</p> 
     * @return Account <p>Account list it belongs to</p>
     */
    public AccountBriefInfo [] getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Account list it belongs to</p>
     * @param Account <p>Account list it belongs to</p>
     */
    public void setAccount(AccountBriefInfo [] Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p> 
     * @return DefendStatus <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     * @param DefendStatus <p>Vulnerability defense status<br>Enumeration value:<br>ENABLED: Enabled<br>NOT_SUPPORTED: Unsupported<br>NOT_ENABLED: Not enabled</p>
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get <p>Remediation status<br>Enumeration values:<br>PENDING: to be fixed<br>SCANNING: scan in progress<br>FIXED: fixed<br>IGNORED: whitelisted<br>FIXING: fix<br>FIX_FAILED: FIX_FAILURE<br>NOTSCAN: unscanned<br>WITHOUT_RISK: no risk<br>NEED_REBOOT: pending restart</p> 
     * @return RiskStatus <p>Remediation status<br>Enumeration values:<br>PENDING: to be fixed<br>SCANNING: scan in progress<br>FIXED: fixed<br>IGNORED: whitelisted<br>FIXING: fix<br>FIX_FAILED: FIX_FAILURE<br>NOTSCAN: unscanned<br>WITHOUT_RISK: no risk<br>NEED_REBOOT: pending restart</p>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>Remediation status<br>Enumeration values:<br>PENDING: to be fixed<br>SCANNING: scan in progress<br>FIXED: fixed<br>IGNORED: whitelisted<br>FIXING: fix<br>FIX_FAILED: FIX_FAILURE<br>NOTSCAN: unscanned<br>WITHOUT_RISK: no risk<br>NEED_REBOOT: pending restart</p>
     * @param RiskStatus <p>Remediation status<br>Enumeration values:<br>PENDING: to be fixed<br>SCANNING: scan in progress<br>FIXED: fixed<br>IGNORED: whitelisted<br>FIXING: fix<br>FIX_FAILED: FIX_FAILURE<br>NOTSCAN: unscanned<br>WITHOUT_RISK: no risk<br>NEED_REBOOT: pending restart</p>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get <p>Vulnerability details</p> 
     * @return VulDetail <p>Vulnerability details</p>
     */
    public VulDetailInfo getVulDetail() {
        return this.VulDetail;
    }

    /**
     * Set <p>Vulnerability details</p>
     * @param VulDetail <p>Vulnerability details</p>
     */
    public void setVulDetail(VulDetailInfo VulDetail) {
        this.VulDetail = VulDetail;
    }

    public HostVulRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulRisk(HostVulRisk source) {
        if (source.RiskID != null) {
            this.RiskID = new Long(source.RiskID);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.Account != null) {
            this.Account = new AccountBriefInfo[source.Account.length];
            for (int i = 0; i < source.Account.length; i++) {
                this.Account[i] = new AccountBriefInfo(source.Account[i]);
            }
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.VulDetail != null) {
            this.VulDetail = new VulDetailInfo(source.VulDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamArrayObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamObj(map, prefix + "VulDetail.", this.VulDetail);

    }
}

