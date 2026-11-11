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

public class HostVulScanStatus extends AbstractModel {

    /**
    * Whether vulnerability scanning has been initiated
Enumeration values:
true: Vulnerability scanning initiated
false: vulnerability scanning not initiated
    */
    @SerializedName("HasScanned")
    @Expose
    private Boolean HasScanned;

    /**
    * If it is the first vulnerability scanning judgment scenario
Enumeration values:
true: is in the first-time vulnerability scanning judgment scenario
false: not in the first vulnerability scanning judgment scenario
    */
    @SerializedName("IsFirstScan")
    @Expose
    private Boolean IsFirstScan;

    /**
    * Status of the last scan task
Enumeration values:
SCANNING: scan in progress
SUCCESS: Scan successful
PARTIAL_FAILED: Partial scan failure
ALL_FAILED: All scans failed
STOPPED: Stop scanning
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * Business status of the page
Enumeration values:
NEVER_SCANNED: Never scanned for vulnerabilities
SCANNING: scan in progress
FIRST_SCAN_FAILED: Vulnerability scanning failed for the first time
FIRST_SCAN_HAS_FIXABLE_VUL: First scan complete, fixable vulnerabilities exist
FIRST_SCAN_NO_FIXABLE_VUL: First scan completed. Vulnerabilities exist but none can be fixed.
FIRST_SCAN_NO_VUL: First scan complete, no vulnerabilities
SCANNED_HAS_FIXABLE_VUL: Not the first scan, fixable vulnerabilities exist
SCANNED_NO_FIXABLE_VUL: Not the first scan. Vulnerabilities exist but none can be fixed.
SCANNED_NO_VUL: Not the first scan, no vulnerabilities
    */
    @SerializedName("ScanScene")
    @Expose
    private String ScanScene;

    /**
    * Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
Returns an empty string if unscanned.
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * Current total count of pending vulnerabilities
Contains common host vulnerabilities and pending risks of the latest Windows KB.
    */
    @SerializedName("TotalVulCount")
    @Expose
    private Long TotalVulCount;

    /**
    * Current number of fixable vulnerabilities
Contains ordinary host vulnerabilities that support one-click repair and the latest pending Windows KB risks.
    */
    @SerializedName("FixableVulCount")
    @Expose
    private Long FixableVulCount;

    /**
    * Current number of repairable emergency vulnerabilities
Urgent vulnerabilities are prioritized for categorization: urgent vulnerabilities are only counted into this field and no longer included in the Linux software vulnerability count.
    */
    @SerializedName("FixableEmergencyCount")
    @Expose
    private Long FixableEmergencyCount;

    /**
    * Current number of repairable Linux software vulnerabilities
Only non-emergency Linux software vulnerabilities are counted.
    */
    @SerializedName("FixableLinuxVulCount")
    @Expose
    private Long FixableLinuxVulCount;

    /**
    * Number of currently repairable patches for Windows systems
Statistics of the latest pending Windows KB risks.
    */
    @SerializedName("FixableWindowVulCount")
    @Expose
    private Long FixableWindowVulCount;

    /**
     * Get Whether vulnerability scanning has been initiated
Enumeration values:
true: Vulnerability scanning initiated
false: vulnerability scanning not initiated 
     * @return HasScanned Whether vulnerability scanning has been initiated
Enumeration values:
true: Vulnerability scanning initiated
false: vulnerability scanning not initiated
     */
    public Boolean getHasScanned() {
        return this.HasScanned;
    }

    /**
     * Set Whether vulnerability scanning has been initiated
Enumeration values:
true: Vulnerability scanning initiated
false: vulnerability scanning not initiated
     * @param HasScanned Whether vulnerability scanning has been initiated
Enumeration values:
true: Vulnerability scanning initiated
false: vulnerability scanning not initiated
     */
    public void setHasScanned(Boolean HasScanned) {
        this.HasScanned = HasScanned;
    }

    /**
     * Get If it is the first vulnerability scanning judgment scenario
Enumeration values:
true: is in the first-time vulnerability scanning judgment scenario
false: not in the first vulnerability scanning judgment scenario 
     * @return IsFirstScan If it is the first vulnerability scanning judgment scenario
Enumeration values:
true: is in the first-time vulnerability scanning judgment scenario
false: not in the first vulnerability scanning judgment scenario
     */
    public Boolean getIsFirstScan() {
        return this.IsFirstScan;
    }

    /**
     * Set If it is the first vulnerability scanning judgment scenario
Enumeration values:
true: is in the first-time vulnerability scanning judgment scenario
false: not in the first vulnerability scanning judgment scenario
     * @param IsFirstScan If it is the first vulnerability scanning judgment scenario
Enumeration values:
true: is in the first-time vulnerability scanning judgment scenario
false: not in the first vulnerability scanning judgment scenario
     */
    public void setIsFirstScan(Boolean IsFirstScan) {
        this.IsFirstScan = IsFirstScan;
    }

    /**
     * Get Status of the last scan task
Enumeration values:
SCANNING: scan in progress
SUCCESS: Scan successful
PARTIAL_FAILED: Partial scan failure
ALL_FAILED: All scans failed
STOPPED: Stop scanning 
     * @return ScanTaskStatus Status of the last scan task
Enumeration values:
SCANNING: scan in progress
SUCCESS: Scan successful
PARTIAL_FAILED: Partial scan failure
ALL_FAILED: All scans failed
STOPPED: Stop scanning
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set Status of the last scan task
Enumeration values:
SCANNING: scan in progress
SUCCESS: Scan successful
PARTIAL_FAILED: Partial scan failure
ALL_FAILED: All scans failed
STOPPED: Stop scanning
     * @param ScanTaskStatus Status of the last scan task
Enumeration values:
SCANNING: scan in progress
SUCCESS: Scan successful
PARTIAL_FAILED: Partial scan failure
ALL_FAILED: All scans failed
STOPPED: Stop scanning
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get Business status of the page
Enumeration values:
NEVER_SCANNED: Never scanned for vulnerabilities
SCANNING: scan in progress
FIRST_SCAN_FAILED: Vulnerability scanning failed for the first time
FIRST_SCAN_HAS_FIXABLE_VUL: First scan complete, fixable vulnerabilities exist
FIRST_SCAN_NO_FIXABLE_VUL: First scan completed. Vulnerabilities exist but none can be fixed.
FIRST_SCAN_NO_VUL: First scan complete, no vulnerabilities
SCANNED_HAS_FIXABLE_VUL: Not the first scan, fixable vulnerabilities exist
SCANNED_NO_FIXABLE_VUL: Not the first scan. Vulnerabilities exist but none can be fixed.
SCANNED_NO_VUL: Not the first scan, no vulnerabilities 
     * @return ScanScene Business status of the page
Enumeration values:
NEVER_SCANNED: Never scanned for vulnerabilities
SCANNING: scan in progress
FIRST_SCAN_FAILED: Vulnerability scanning failed for the first time
FIRST_SCAN_HAS_FIXABLE_VUL: First scan complete, fixable vulnerabilities exist
FIRST_SCAN_NO_FIXABLE_VUL: First scan completed. Vulnerabilities exist but none can be fixed.
FIRST_SCAN_NO_VUL: First scan complete, no vulnerabilities
SCANNED_HAS_FIXABLE_VUL: Not the first scan, fixable vulnerabilities exist
SCANNED_NO_FIXABLE_VUL: Not the first scan. Vulnerabilities exist but none can be fixed.
SCANNED_NO_VUL: Not the first scan, no vulnerabilities
     */
    public String getScanScene() {
        return this.ScanScene;
    }

    /**
     * Set Business status of the page
Enumeration values:
NEVER_SCANNED: Never scanned for vulnerabilities
SCANNING: scan in progress
FIRST_SCAN_FAILED: Vulnerability scanning failed for the first time
FIRST_SCAN_HAS_FIXABLE_VUL: First scan complete, fixable vulnerabilities exist
FIRST_SCAN_NO_FIXABLE_VUL: First scan completed. Vulnerabilities exist but none can be fixed.
FIRST_SCAN_NO_VUL: First scan complete, no vulnerabilities
SCANNED_HAS_FIXABLE_VUL: Not the first scan, fixable vulnerabilities exist
SCANNED_NO_FIXABLE_VUL: Not the first scan. Vulnerabilities exist but none can be fixed.
SCANNED_NO_VUL: Not the first scan, no vulnerabilities
     * @param ScanScene Business status of the page
Enumeration values:
NEVER_SCANNED: Never scanned for vulnerabilities
SCANNING: scan in progress
FIRST_SCAN_FAILED: Vulnerability scanning failed for the first time
FIRST_SCAN_HAS_FIXABLE_VUL: First scan complete, fixable vulnerabilities exist
FIRST_SCAN_NO_FIXABLE_VUL: First scan completed. Vulnerabilities exist but none can be fixed.
FIRST_SCAN_NO_VUL: First scan complete, no vulnerabilities
SCANNED_HAS_FIXABLE_VUL: Not the first scan, fixable vulnerabilities exist
SCANNED_NO_FIXABLE_VUL: Not the first scan. Vulnerabilities exist but none can be fixed.
SCANNED_NO_VUL: Not the first scan, no vulnerabilities
     */
    public void setScanScene(String ScanScene) {
        this.ScanScene = ScanScene;
    }

    /**
     * Get Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
Returns an empty string if unscanned. 
     * @return LatestScanTime Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
Returns an empty string if unscanned.
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
Returns an empty string if unscanned.
     * @param LatestScanTime Last scan time
Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)
Returns an empty string if unscanned.
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get Current total count of pending vulnerabilities
Contains common host vulnerabilities and pending risks of the latest Windows KB. 
     * @return TotalVulCount Current total count of pending vulnerabilities
Contains common host vulnerabilities and pending risks of the latest Windows KB.
     */
    public Long getTotalVulCount() {
        return this.TotalVulCount;
    }

    /**
     * Set Current total count of pending vulnerabilities
Contains common host vulnerabilities and pending risks of the latest Windows KB.
     * @param TotalVulCount Current total count of pending vulnerabilities
Contains common host vulnerabilities and pending risks of the latest Windows KB.
     */
    public void setTotalVulCount(Long TotalVulCount) {
        this.TotalVulCount = TotalVulCount;
    }

    /**
     * Get Current number of fixable vulnerabilities
Contains ordinary host vulnerabilities that support one-click repair and the latest pending Windows KB risks. 
     * @return FixableVulCount Current number of fixable vulnerabilities
Contains ordinary host vulnerabilities that support one-click repair and the latest pending Windows KB risks.
     */
    public Long getFixableVulCount() {
        return this.FixableVulCount;
    }

    /**
     * Set Current number of fixable vulnerabilities
Contains ordinary host vulnerabilities that support one-click repair and the latest pending Windows KB risks.
     * @param FixableVulCount Current number of fixable vulnerabilities
Contains ordinary host vulnerabilities that support one-click repair and the latest pending Windows KB risks.
     */
    public void setFixableVulCount(Long FixableVulCount) {
        this.FixableVulCount = FixableVulCount;
    }

    /**
     * Get Current number of repairable emergency vulnerabilities
Urgent vulnerabilities are prioritized for categorization: urgent vulnerabilities are only counted into this field and no longer included in the Linux software vulnerability count. 
     * @return FixableEmergencyCount Current number of repairable emergency vulnerabilities
Urgent vulnerabilities are prioritized for categorization: urgent vulnerabilities are only counted into this field and no longer included in the Linux software vulnerability count.
     */
    public Long getFixableEmergencyCount() {
        return this.FixableEmergencyCount;
    }

    /**
     * Set Current number of repairable emergency vulnerabilities
Urgent vulnerabilities are prioritized for categorization: urgent vulnerabilities are only counted into this field and no longer included in the Linux software vulnerability count.
     * @param FixableEmergencyCount Current number of repairable emergency vulnerabilities
Urgent vulnerabilities are prioritized for categorization: urgent vulnerabilities are only counted into this field and no longer included in the Linux software vulnerability count.
     */
    public void setFixableEmergencyCount(Long FixableEmergencyCount) {
        this.FixableEmergencyCount = FixableEmergencyCount;
    }

    /**
     * Get Current number of repairable Linux software vulnerabilities
Only non-emergency Linux software vulnerabilities are counted. 
     * @return FixableLinuxVulCount Current number of repairable Linux software vulnerabilities
Only non-emergency Linux software vulnerabilities are counted.
     */
    public Long getFixableLinuxVulCount() {
        return this.FixableLinuxVulCount;
    }

    /**
     * Set Current number of repairable Linux software vulnerabilities
Only non-emergency Linux software vulnerabilities are counted.
     * @param FixableLinuxVulCount Current number of repairable Linux software vulnerabilities
Only non-emergency Linux software vulnerabilities are counted.
     */
    public void setFixableLinuxVulCount(Long FixableLinuxVulCount) {
        this.FixableLinuxVulCount = FixableLinuxVulCount;
    }

    /**
     * Get Number of currently repairable patches for Windows systems
Statistics of the latest pending Windows KB risks. 
     * @return FixableWindowVulCount Number of currently repairable patches for Windows systems
Statistics of the latest pending Windows KB risks.
     */
    public Long getFixableWindowVulCount() {
        return this.FixableWindowVulCount;
    }

    /**
     * Set Number of currently repairable patches for Windows systems
Statistics of the latest pending Windows KB risks.
     * @param FixableWindowVulCount Number of currently repairable patches for Windows systems
Statistics of the latest pending Windows KB risks.
     */
    public void setFixableWindowVulCount(Long FixableWindowVulCount) {
        this.FixableWindowVulCount = FixableWindowVulCount;
    }

    public HostVulScanStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulScanStatus(HostVulScanStatus source) {
        if (source.HasScanned != null) {
            this.HasScanned = new Boolean(source.HasScanned);
        }
        if (source.IsFirstScan != null) {
            this.IsFirstScan = new Boolean(source.IsFirstScan);
        }
        if (source.ScanTaskStatus != null) {
            this.ScanTaskStatus = new String(source.ScanTaskStatus);
        }
        if (source.ScanScene != null) {
            this.ScanScene = new String(source.ScanScene);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.TotalVulCount != null) {
            this.TotalVulCount = new Long(source.TotalVulCount);
        }
        if (source.FixableVulCount != null) {
            this.FixableVulCount = new Long(source.FixableVulCount);
        }
        if (source.FixableEmergencyCount != null) {
            this.FixableEmergencyCount = new Long(source.FixableEmergencyCount);
        }
        if (source.FixableLinuxVulCount != null) {
            this.FixableLinuxVulCount = new Long(source.FixableLinuxVulCount);
        }
        if (source.FixableWindowVulCount != null) {
            this.FixableWindowVulCount = new Long(source.FixableWindowVulCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HasScanned", this.HasScanned);
        this.setParamSimple(map, prefix + "IsFirstScan", this.IsFirstScan);
        this.setParamSimple(map, prefix + "ScanTaskStatus", this.ScanTaskStatus);
        this.setParamSimple(map, prefix + "ScanScene", this.ScanScene);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "TotalVulCount", this.TotalVulCount);
        this.setParamSimple(map, prefix + "FixableVulCount", this.FixableVulCount);
        this.setParamSimple(map, prefix + "FixableEmergencyCount", this.FixableEmergencyCount);
        this.setParamSimple(map, prefix + "FixableLinuxVulCount", this.FixableLinuxVulCount);
        this.setParamSimple(map, prefix + "FixableWindowVulCount", this.FixableWindowVulCount);

    }
}

