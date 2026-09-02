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

public class HostKBRisk extends AbstractModel {

    /**
    * <p>Risk record ID (kb_risk.id)</p>
    */
    @SerializedName("RiskID")
    @Expose
    private Long RiskID;

    /**
    * <p>Windows KB patch detailed information</p>
    */
    @SerializedName("KBDetail")
    @Expose
    private KBDetail KBDetail;

    /**
    * <p>Number of affected hosts.</p>
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * <p>Latest scan time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Associated account list</p>
    */
    @SerializedName("Account")
    @Expose
    private AccountBriefInfo [] Account;

    /**
    * <p>Remediation status<br>Enumeration values:<br>PENDING: To be fixed<br>SCANNING: Scan in progress<br>FIXED: Fixed<br>IGNORED: Allowlisted<br>FIXING: In remediation<br>FIX_FAILED: Fix failure</p>
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
     * Get <p>Risk record ID (kb_risk.id)</p> 
     * @return RiskID <p>Risk record ID (kb_risk.id)</p>
     */
    public Long getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>Risk record ID (kb_risk.id)</p>
     * @param RiskID <p>Risk record ID (kb_risk.id)</p>
     */
    public void setRiskID(Long RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>Windows KB patch detailed information</p> 
     * @return KBDetail <p>Windows KB patch detailed information</p>
     */
    public KBDetail getKBDetail() {
        return this.KBDetail;
    }

    /**
     * Set <p>Windows KB patch detailed information</p>
     * @param KBDetail <p>Windows KB patch detailed information</p>
     */
    public void setKBDetail(KBDetail KBDetail) {
        this.KBDetail = KBDetail;
    }

    /**
     * Get <p>Number of affected hosts.</p> 
     * @return EffectHostCount <p>Number of affected hosts.</p>
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set <p>Number of affected hosts.</p>
     * @param EffectHostCount <p>Number of affected hosts.</p>
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get <p>Latest scan time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p> 
     * @return LatestScanTime <p>Latest scan time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Latest scan time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     * @param LatestScanTime <p>Latest scan time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Associated account list</p> 
     * @return Account <p>Associated account list</p>
     */
    public AccountBriefInfo [] getAccount() {
        return this.Account;
    }

    /**
     * Set <p>Associated account list</p>
     * @param Account <p>Associated account list</p>
     */
    public void setAccount(AccountBriefInfo [] Account) {
        this.Account = Account;
    }

    /**
     * Get <p>Remediation status<br>Enumeration values:<br>PENDING: To be fixed<br>SCANNING: Scan in progress<br>FIXED: Fixed<br>IGNORED: Allowlisted<br>FIXING: In remediation<br>FIX_FAILED: Fix failure</p> 
     * @return RiskStatus <p>Remediation status<br>Enumeration values:<br>PENDING: To be fixed<br>SCANNING: Scan in progress<br>FIXED: Fixed<br>IGNORED: Allowlisted<br>FIXING: In remediation<br>FIX_FAILED: Fix failure</p>
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set <p>Remediation status<br>Enumeration values:<br>PENDING: To be fixed<br>SCANNING: Scan in progress<br>FIXED: Fixed<br>IGNORED: Allowlisted<br>FIXING: In remediation<br>FIX_FAILED: Fix failure</p>
     * @param RiskStatus <p>Remediation status<br>Enumeration values:<br>PENDING: To be fixed<br>SCANNING: Scan in progress<br>FIXED: Fixed<br>IGNORED: Allowlisted<br>FIXING: In remediation<br>FIX_FAILED: Fix failure</p>
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    public HostKBRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostKBRisk(HostKBRisk source) {
        if (source.RiskID != null) {
            this.RiskID = new Long(source.RiskID);
        }
        if (source.KBDetail != null) {
            this.KBDetail = new KBDetail(source.KBDetail);
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
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamObj(map, prefix + "KBDetail.", this.KBDetail);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamArrayObj(map, prefix + "Account.", this.Account);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);

    }
}

