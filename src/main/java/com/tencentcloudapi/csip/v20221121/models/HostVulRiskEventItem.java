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

public class HostVulRiskEventItem extends AbstractModel {

    /**
    * Unique identifier of a vulnerability risk record.
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * Risk record ID
    */
    @SerializedName("RiskID")
    @Expose
    private Long RiskID;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulID")
    @Expose
    private Long VulID;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * CVE No.
Parameter format: such as CVE-2024-12345
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch
WEB_CMS: Web-CMS vulnerability
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Vulnerability severity level
Enumeration values:
UNKNOWN: invalid
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * VPR repair priority
Enumeration values:
DEFERRABLE: Can be repaired later
PLANNED: Planned repair
SOON: Fix as soon as possible
URGENT: urgent repair
    */
    @SerializedName("VPRLevel")
    @Expose
    private String VPRLevel;

    /**
    * Detection mode
Enumeration values:
VersionCompare: version comparison
POC: POC detection
VersionComparePOC: version comparison + POC
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * Risk status
Enumeration value:
PENDING: to be processed.
HANDLED: processed
FIXED: Fixed
SCANNING: Rechecking
IGNORED: ignored
NOT_REQUIRED: No action is required
DELETED: Deleted
FIXING: In remediation
NEED_REBOOT: Fixed and pending restart
FIX_FAILURE: FIX failure
    */
    @SerializedName("RiskStatus")
    @Expose
    private String RiskStatus;

    /**
    * Whether one-click repair is supported
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * Cloud host instance ID
Parameter format: such as ins-xxxxxxxx
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Account AppID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
     * Get Unique identifier of a vulnerability risk record. 
     * @return UUID Unique identifier of a vulnerability risk record.
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set Unique identifier of a vulnerability risk record.
     * @param UUID Unique identifier of a vulnerability risk record.
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get Risk record ID 
     * @return RiskID Risk record ID
     */
    public Long getRiskID() {
        return this.RiskID;
    }

    /**
     * Set Risk record ID
     * @param RiskID Risk record ID
     */
    public void setRiskID(Long RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get Vulnerability ID 
     * @return VulID Vulnerability ID
     */
    public Long getVulID() {
        return this.VulID;
    }

    /**
     * Set Vulnerability ID
     * @param VulID Vulnerability ID
     */
    public void setVulID(Long VulID) {
        this.VulID = VulID;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get CVE No.
Parameter format: such as CVE-2024-12345 
     * @return CVEID CVE No.
Parameter format: such as CVE-2024-12345
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set CVE No.
Parameter format: such as CVE-2024-12345
     * @param CVEID CVE No.
Parameter format: such as CVE-2024-12345
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch
WEB_CMS: Web-CMS vulnerability
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability 
     * @return Category Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch
WEB_CMS: Web-CMS vulnerability
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch
WEB_CMS: Web-CMS vulnerability
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     * @param Category Vulnerability category
Enumeration values:
LINUX: Linux software vulnerability
WINDOWS: Windows system patch
WEB_CMS: Web-CMS vulnerability
APPLICATION: Application vulnerability
EMERGENCY: Urgent vulnerability
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Vulnerability severity level
Enumeration values:
UNKNOWN: invalid
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical 
     * @return Level Vulnerability severity level
Enumeration values:
UNKNOWN: invalid
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability severity level
Enumeration values:
UNKNOWN: invalid
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     * @param Level Vulnerability severity level
Enumeration values:
UNKNOWN: invalid
LOW: low-risk
MEDIUM: Medium risk
HIGH: High risk
CRITICAL: Critical
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get VPR repair priority
Enumeration values:
DEFERRABLE: Can be repaired later
PLANNED: Planned repair
SOON: Fix as soon as possible
URGENT: urgent repair 
     * @return VPRLevel VPR repair priority
Enumeration values:
DEFERRABLE: Can be repaired later
PLANNED: Planned repair
SOON: Fix as soon as possible
URGENT: urgent repair
     */
    public String getVPRLevel() {
        return this.VPRLevel;
    }

    /**
     * Set VPR repair priority
Enumeration values:
DEFERRABLE: Can be repaired later
PLANNED: Planned repair
SOON: Fix as soon as possible
URGENT: urgent repair
     * @param VPRLevel VPR repair priority
Enumeration values:
DEFERRABLE: Can be repaired later
PLANNED: Planned repair
SOON: Fix as soon as possible
URGENT: urgent repair
     */
    public void setVPRLevel(String VPRLevel) {
        this.VPRLevel = VPRLevel;
    }

    /**
     * Get Detection mode
Enumeration values:
VersionCompare: version comparison
POC: POC detection
VersionComparePOC: version comparison + POC 
     * @return CheckMethod Detection mode
Enumeration values:
VersionCompare: version comparison
POC: POC detection
VersionComparePOC: version comparison + POC
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set Detection mode
Enumeration values:
VersionCompare: version comparison
POC: POC detection
VersionComparePOC: version comparison + POC
     * @param CheckMethod Detection mode
Enumeration values:
VersionCompare: version comparison
POC: POC detection
VersionComparePOC: version comparison + POC
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get Risk status
Enumeration value:
PENDING: to be processed.
HANDLED: processed
FIXED: Fixed
SCANNING: Rechecking
IGNORED: ignored
NOT_REQUIRED: No action is required
DELETED: Deleted
FIXING: In remediation
NEED_REBOOT: Fixed and pending restart
FIX_FAILURE: FIX failure 
     * @return RiskStatus Risk status
Enumeration value:
PENDING: to be processed.
HANDLED: processed
FIXED: Fixed
SCANNING: Rechecking
IGNORED: ignored
NOT_REQUIRED: No action is required
DELETED: Deleted
FIXING: In remediation
NEED_REBOOT: Fixed and pending restart
FIX_FAILURE: FIX failure
     */
    public String getRiskStatus() {
        return this.RiskStatus;
    }

    /**
     * Set Risk status
Enumeration value:
PENDING: to be processed.
HANDLED: processed
FIXED: Fixed
SCANNING: Rechecking
IGNORED: ignored
NOT_REQUIRED: No action is required
DELETED: Deleted
FIXING: In remediation
NEED_REBOOT: Fixed and pending restart
FIX_FAILURE: FIX failure
     * @param RiskStatus Risk status
Enumeration value:
PENDING: to be processed.
HANDLED: processed
FIXED: Fixed
SCANNING: Rechecking
IGNORED: ignored
NOT_REQUIRED: No action is required
DELETED: Deleted
FIXING: In remediation
NEED_REBOOT: Fixed and pending restart
FIX_FAILURE: FIX failure
     */
    public void setRiskStatus(String RiskStatus) {
        this.RiskStatus = RiskStatus;
    }

    /**
     * Get Whether one-click repair is supported 
     * @return SupportFix Whether one-click repair is supported
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set Whether one-click repair is supported
     * @param SupportFix Whether one-click repair is supported
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format) 
     * @return LatestScanTime Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     * @param LatestScanTime Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get Cloud host instance ID
Parameter format: such as ins-xxxxxxxx 
     * @return InstanceID Cloud host instance ID
Parameter format: such as ins-xxxxxxxx
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Cloud host instance ID
Parameter format: such as ins-xxxxxxxx
     * @param InstanceID Cloud host instance ID
Parameter format: such as ins-xxxxxxxx
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Account AppID 
     * @return AppID Account AppID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Account AppID
     * @param AppID Account AppID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    public HostVulRiskEventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulRiskEventItem(HostVulRiskEventItem source) {
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.RiskID != null) {
            this.RiskID = new Long(source.RiskID);
        }
        if (source.VulID != null) {
            this.VulID = new Long(source.VulID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.VPRLevel != null) {
            this.VPRLevel = new String(source.VPRLevel);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.RiskStatus != null) {
            this.RiskStatus = new String(source.RiskStatus);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamSimple(map, prefix + "VulID", this.VulID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VPRLevel", this.VPRLevel);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "RiskStatus", this.RiskStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);

    }
}

