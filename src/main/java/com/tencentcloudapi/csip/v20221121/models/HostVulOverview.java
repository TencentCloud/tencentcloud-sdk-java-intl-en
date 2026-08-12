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

public class HostVulOverview extends AbstractModel {

    /**
    * <p>Number of vulnerabilities that require immediate fix (number of vulnerabilities with VPR rating of URGENT)</p>
    */
    @SerializedName("UrgentRepairCount")
    @Expose
    private Long UrgentRepairCount;

    /**
    * <p>Hosts with vulnerability protection enabled</p>
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * <p>Total hosts</p>
    */
    @SerializedName("TotalHostCount")
    @Expose
    private Long TotalHostCount;

    /**
    * <p>Total number of times vulnerabilities have been fixed</p>
    */
    @SerializedName("FixedVulCount")
    @Expose
    private Long FixedVulCount;

    /**
    * <p>Linux software vulnerability count</p>
    */
    @SerializedName("LinuxVulCount")
    @Expose
    private Long LinuxVulCount;

    /**
    * <p>Number of Windows system patches</p>
    */
    @SerializedName("WindowVulCount")
    @Expose
    private Long WindowVulCount;

    /**
    * <p>Number of Web-CMS vulnerabilities</p>
    */
    @SerializedName("WebCMSVulCount")
    @Expose
    private Long WebCMSVulCount;

    /**
    * <p>Number of application vulnerabilities</p>
    */
    @SerializedName("AppVulCount")
    @Expose
    private Long AppVulCount;

    /**
    * <p>Number of emergency vulnerabilities</p>
    */
    @SerializedName("EmergencyCount")
    @Expose
    private Long EmergencyCount;

    /**
    * <p>Total number of vulnerability knowledge base</p>
    */
    @SerializedName("VulItemCount")
    @Expose
    private Long VulItemCount;

    /**
    * <p>Latest scan time.</p><p>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>Whether period scanning is enabled</p><p>Enumeration value:</p><ul><li>1: Enabled</li><li>0: Not enabled</li></ul>
    */
    @SerializedName("EnableTimingScan")
    @Expose
    private Long EnableTimingScan;

    /**
    * <p>Number of critical fixes</p>
    */
    @SerializedName("CriticalRepairCount")
    @Expose
    private Long CriticalRepairCount;

    /**
    * <p>Critical Linux vulnerability fix count</p>
    */
    @SerializedName("CriticalRepairLinuxVulCount")
    @Expose
    private Long CriticalRepairLinuxVulCount;

    /**
    * <p>Severe application vulnerability fix count</p>
    */
    @SerializedName("CriticalRepairAppVulCount")
    @Expose
    private Long CriticalRepairAppVulCount;

    /**
    * <p>Critical fix for Web-CMS vulnerabilities</p>
    */
    @SerializedName("CriticalRepairWebCMSVulCount")
    @Expose
    private Long CriticalRepairWebCMSVulCount;

    /**
    * <p>Critical fix emergency vulnerability count</p>
    */
    @SerializedName("CriticalRepairEmergencyCount")
    @Expose
    private Long CriticalRepairEmergencyCount;

    /**
     * Get <p>Number of vulnerabilities that require immediate fix (number of vulnerabilities with VPR rating of URGENT)</p> 
     * @return UrgentRepairCount <p>Number of vulnerabilities that require immediate fix (number of vulnerabilities with VPR rating of URGENT)</p>
     */
    public Long getUrgentRepairCount() {
        return this.UrgentRepairCount;
    }

    /**
     * Set <p>Number of vulnerabilities that require immediate fix (number of vulnerabilities with VPR rating of URGENT)</p>
     * @param UrgentRepairCount <p>Number of vulnerabilities that require immediate fix (number of vulnerabilities with VPR rating of URGENT)</p>
     */
    public void setUrgentRepairCount(Long UrgentRepairCount) {
        this.UrgentRepairCount = UrgentRepairCount;
    }

    /**
     * Get <p>Hosts with vulnerability protection enabled</p> 
     * @return DefendHostCount <p>Hosts with vulnerability protection enabled</p>
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set <p>Hosts with vulnerability protection enabled</p>
     * @param DefendHostCount <p>Hosts with vulnerability protection enabled</p>
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get <p>Total hosts</p> 
     * @return TotalHostCount <p>Total hosts</p>
     */
    public Long getTotalHostCount() {
        return this.TotalHostCount;
    }

    /**
     * Set <p>Total hosts</p>
     * @param TotalHostCount <p>Total hosts</p>
     */
    public void setTotalHostCount(Long TotalHostCount) {
        this.TotalHostCount = TotalHostCount;
    }

    /**
     * Get <p>Total number of times vulnerabilities have been fixed</p> 
     * @return FixedVulCount <p>Total number of times vulnerabilities have been fixed</p>
     */
    public Long getFixedVulCount() {
        return this.FixedVulCount;
    }

    /**
     * Set <p>Total number of times vulnerabilities have been fixed</p>
     * @param FixedVulCount <p>Total number of times vulnerabilities have been fixed</p>
     */
    public void setFixedVulCount(Long FixedVulCount) {
        this.FixedVulCount = FixedVulCount;
    }

    /**
     * Get <p>Linux software vulnerability count</p> 
     * @return LinuxVulCount <p>Linux software vulnerability count</p>
     */
    public Long getLinuxVulCount() {
        return this.LinuxVulCount;
    }

    /**
     * Set <p>Linux software vulnerability count</p>
     * @param LinuxVulCount <p>Linux software vulnerability count</p>
     */
    public void setLinuxVulCount(Long LinuxVulCount) {
        this.LinuxVulCount = LinuxVulCount;
    }

    /**
     * Get <p>Number of Windows system patches</p> 
     * @return WindowVulCount <p>Number of Windows system patches</p>
     */
    public Long getWindowVulCount() {
        return this.WindowVulCount;
    }

    /**
     * Set <p>Number of Windows system patches</p>
     * @param WindowVulCount <p>Number of Windows system patches</p>
     */
    public void setWindowVulCount(Long WindowVulCount) {
        this.WindowVulCount = WindowVulCount;
    }

    /**
     * Get <p>Number of Web-CMS vulnerabilities</p> 
     * @return WebCMSVulCount <p>Number of Web-CMS vulnerabilities</p>
     */
    public Long getWebCMSVulCount() {
        return this.WebCMSVulCount;
    }

    /**
     * Set <p>Number of Web-CMS vulnerabilities</p>
     * @param WebCMSVulCount <p>Number of Web-CMS vulnerabilities</p>
     */
    public void setWebCMSVulCount(Long WebCMSVulCount) {
        this.WebCMSVulCount = WebCMSVulCount;
    }

    /**
     * Get <p>Number of application vulnerabilities</p> 
     * @return AppVulCount <p>Number of application vulnerabilities</p>
     */
    public Long getAppVulCount() {
        return this.AppVulCount;
    }

    /**
     * Set <p>Number of application vulnerabilities</p>
     * @param AppVulCount <p>Number of application vulnerabilities</p>
     */
    public void setAppVulCount(Long AppVulCount) {
        this.AppVulCount = AppVulCount;
    }

    /**
     * Get <p>Number of emergency vulnerabilities</p> 
     * @return EmergencyCount <p>Number of emergency vulnerabilities</p>
     */
    public Long getEmergencyCount() {
        return this.EmergencyCount;
    }

    /**
     * Set <p>Number of emergency vulnerabilities</p>
     * @param EmergencyCount <p>Number of emergency vulnerabilities</p>
     */
    public void setEmergencyCount(Long EmergencyCount) {
        this.EmergencyCount = EmergencyCount;
    }

    /**
     * Get <p>Total number of vulnerability knowledge base</p> 
     * @return VulItemCount <p>Total number of vulnerability knowledge base</p>
     */
    public Long getVulItemCount() {
        return this.VulItemCount;
    }

    /**
     * Set <p>Total number of vulnerability knowledge base</p>
     * @param VulItemCount <p>Total number of vulnerability knowledge base</p>
     */
    public void setVulItemCount(Long VulItemCount) {
        this.VulItemCount = VulItemCount;
    }

    /**
     * Get <p>Latest scan time.</p><p>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p> 
     * @return LatestScanTime <p>Latest scan time.</p><p>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>Latest scan time.</p><p>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     * @param LatestScanTime <p>Latest scan time.</p><p>Parameter format: YYYY-MM-DDTHH:mm:ssZ</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>Whether period scanning is enabled</p><p>Enumeration value:</p><ul><li>1: Enabled</li><li>0: Not enabled</li></ul> 
     * @return EnableTimingScan <p>Whether period scanning is enabled</p><p>Enumeration value:</p><ul><li>1: Enabled</li><li>0: Not enabled</li></ul>
     */
    public Long getEnableTimingScan() {
        return this.EnableTimingScan;
    }

    /**
     * Set <p>Whether period scanning is enabled</p><p>Enumeration value:</p><ul><li>1: Enabled</li><li>0: Not enabled</li></ul>
     * @param EnableTimingScan <p>Whether period scanning is enabled</p><p>Enumeration value:</p><ul><li>1: Enabled</li><li>0: Not enabled</li></ul>
     */
    public void setEnableTimingScan(Long EnableTimingScan) {
        this.EnableTimingScan = EnableTimingScan;
    }

    /**
     * Get <p>Number of critical fixes</p> 
     * @return CriticalRepairCount <p>Number of critical fixes</p>
     */
    public Long getCriticalRepairCount() {
        return this.CriticalRepairCount;
    }

    /**
     * Set <p>Number of critical fixes</p>
     * @param CriticalRepairCount <p>Number of critical fixes</p>
     */
    public void setCriticalRepairCount(Long CriticalRepairCount) {
        this.CriticalRepairCount = CriticalRepairCount;
    }

    /**
     * Get <p>Critical Linux vulnerability fix count</p> 
     * @return CriticalRepairLinuxVulCount <p>Critical Linux vulnerability fix count</p>
     */
    public Long getCriticalRepairLinuxVulCount() {
        return this.CriticalRepairLinuxVulCount;
    }

    /**
     * Set <p>Critical Linux vulnerability fix count</p>
     * @param CriticalRepairLinuxVulCount <p>Critical Linux vulnerability fix count</p>
     */
    public void setCriticalRepairLinuxVulCount(Long CriticalRepairLinuxVulCount) {
        this.CriticalRepairLinuxVulCount = CriticalRepairLinuxVulCount;
    }

    /**
     * Get <p>Severe application vulnerability fix count</p> 
     * @return CriticalRepairAppVulCount <p>Severe application vulnerability fix count</p>
     */
    public Long getCriticalRepairAppVulCount() {
        return this.CriticalRepairAppVulCount;
    }

    /**
     * Set <p>Severe application vulnerability fix count</p>
     * @param CriticalRepairAppVulCount <p>Severe application vulnerability fix count</p>
     */
    public void setCriticalRepairAppVulCount(Long CriticalRepairAppVulCount) {
        this.CriticalRepairAppVulCount = CriticalRepairAppVulCount;
    }

    /**
     * Get <p>Critical fix for Web-CMS vulnerabilities</p> 
     * @return CriticalRepairWebCMSVulCount <p>Critical fix for Web-CMS vulnerabilities</p>
     */
    public Long getCriticalRepairWebCMSVulCount() {
        return this.CriticalRepairWebCMSVulCount;
    }

    /**
     * Set <p>Critical fix for Web-CMS vulnerabilities</p>
     * @param CriticalRepairWebCMSVulCount <p>Critical fix for Web-CMS vulnerabilities</p>
     */
    public void setCriticalRepairWebCMSVulCount(Long CriticalRepairWebCMSVulCount) {
        this.CriticalRepairWebCMSVulCount = CriticalRepairWebCMSVulCount;
    }

    /**
     * Get <p>Critical fix emergency vulnerability count</p> 
     * @return CriticalRepairEmergencyCount <p>Critical fix emergency vulnerability count</p>
     */
    public Long getCriticalRepairEmergencyCount() {
        return this.CriticalRepairEmergencyCount;
    }

    /**
     * Set <p>Critical fix emergency vulnerability count</p>
     * @param CriticalRepairEmergencyCount <p>Critical fix emergency vulnerability count</p>
     */
    public void setCriticalRepairEmergencyCount(Long CriticalRepairEmergencyCount) {
        this.CriticalRepairEmergencyCount = CriticalRepairEmergencyCount;
    }

    public HostVulOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostVulOverview(HostVulOverview source) {
        if (source.UrgentRepairCount != null) {
            this.UrgentRepairCount = new Long(source.UrgentRepairCount);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.TotalHostCount != null) {
            this.TotalHostCount = new Long(source.TotalHostCount);
        }
        if (source.FixedVulCount != null) {
            this.FixedVulCount = new Long(source.FixedVulCount);
        }
        if (source.LinuxVulCount != null) {
            this.LinuxVulCount = new Long(source.LinuxVulCount);
        }
        if (source.WindowVulCount != null) {
            this.WindowVulCount = new Long(source.WindowVulCount);
        }
        if (source.WebCMSVulCount != null) {
            this.WebCMSVulCount = new Long(source.WebCMSVulCount);
        }
        if (source.AppVulCount != null) {
            this.AppVulCount = new Long(source.AppVulCount);
        }
        if (source.EmergencyCount != null) {
            this.EmergencyCount = new Long(source.EmergencyCount);
        }
        if (source.VulItemCount != null) {
            this.VulItemCount = new Long(source.VulItemCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.EnableTimingScan != null) {
            this.EnableTimingScan = new Long(source.EnableTimingScan);
        }
        if (source.CriticalRepairCount != null) {
            this.CriticalRepairCount = new Long(source.CriticalRepairCount);
        }
        if (source.CriticalRepairLinuxVulCount != null) {
            this.CriticalRepairLinuxVulCount = new Long(source.CriticalRepairLinuxVulCount);
        }
        if (source.CriticalRepairAppVulCount != null) {
            this.CriticalRepairAppVulCount = new Long(source.CriticalRepairAppVulCount);
        }
        if (source.CriticalRepairWebCMSVulCount != null) {
            this.CriticalRepairWebCMSVulCount = new Long(source.CriticalRepairWebCMSVulCount);
        }
        if (source.CriticalRepairEmergencyCount != null) {
            this.CriticalRepairEmergencyCount = new Long(source.CriticalRepairEmergencyCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UrgentRepairCount", this.UrgentRepairCount);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "TotalHostCount", this.TotalHostCount);
        this.setParamSimple(map, prefix + "FixedVulCount", this.FixedVulCount);
        this.setParamSimple(map, prefix + "LinuxVulCount", this.LinuxVulCount);
        this.setParamSimple(map, prefix + "WindowVulCount", this.WindowVulCount);
        this.setParamSimple(map, prefix + "WebCMSVulCount", this.WebCMSVulCount);
        this.setParamSimple(map, prefix + "AppVulCount", this.AppVulCount);
        this.setParamSimple(map, prefix + "EmergencyCount", this.EmergencyCount);
        this.setParamSimple(map, prefix + "VulItemCount", this.VulItemCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "EnableTimingScan", this.EnableTimingScan);
        this.setParamSimple(map, prefix + "CriticalRepairCount", this.CriticalRepairCount);
        this.setParamSimple(map, prefix + "CriticalRepairLinuxVulCount", this.CriticalRepairLinuxVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairAppVulCount", this.CriticalRepairAppVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairWebCMSVulCount", this.CriticalRepairWebCMSVulCount);
        this.setParamSimple(map, prefix + "CriticalRepairEmergencyCount", this.CriticalRepairEmergencyCount);

    }
}

