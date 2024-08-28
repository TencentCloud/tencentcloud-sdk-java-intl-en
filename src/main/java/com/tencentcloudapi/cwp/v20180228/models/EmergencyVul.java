/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class EmergencyVul extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Release date
    */
    @SerializedName("PublishDate")
    @Expose
    private String PublishDate;

    /**
    * Vulnerability category
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

    /**
    * Vulnerability status. 0: not detected; 1: at risk; 2: not at risk; 3: show progress during check
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Scan progress
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * Vulnerability Tags, Separated by Multiple Commas
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * Number of affected machines
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Whether to support defense: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportDefense")
    @Expose
    private Long IsSupportDefense;

    /**
    * Number of Attacks Defended
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseAttackCount")
    @Expose
    private Long DefenseAttackCount;

    /**
    * Detection rule: 0: version comparison; 1: POC verification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * Attack intensity level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * Whether vulnerability defense is enabled on hosts with vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseState")
    @Expose
    private Boolean DefenseState;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability level 
     * @return Level Vulnerability level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level
     * @param Level Vulnerability level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
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
     * Get Release date 
     * @return PublishDate Release date
     */
    public String getPublishDate() {
        return this.PublishDate;
    }

    /**
     * Set Release date
     * @param PublishDate Release date
     */
    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    /**
     * Get Vulnerability category 
     * @return Category Vulnerability category
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set Vulnerability category
     * @param Category Vulnerability category
     */
    public void setCategory(Long Category) {
        this.Category = Category;
    }

    /**
     * Get Vulnerability status. 0: not detected; 1: at risk; 2: not at risk; 3: show progress during check 
     * @return Status Vulnerability status. 0: not detected; 1: at risk; 2: not at risk; 3: show progress during check
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Vulnerability status. 0: not detected; 1: at risk; 2: not at risk; 3: show progress during check
     * @param Status Vulnerability status. 0: not detected; 1: at risk; 2: not at risk; 3: show progress during check
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Last scan time 
     * @return LastScanTime Last scan time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
     * @param LastScanTime Last scan time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Scan progress 
     * @return Progress Scan progress
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set Scan progress
     * @param Progress Scan progress
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get CVE ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CveId CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CveId CVE ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get CVSS score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CvssScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CvssScore CVSS score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get Vulnerability Tags, Separated by Multiple Commas
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Vulnerability Tags, Separated by Multiple Commas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set Vulnerability Tags, Separated by Multiple Commas
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Vulnerability Tags, Separated by Multiple Commas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Number of affected machines
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostCount Number of affected machines
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected machines
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostCount Number of affected machines
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Whether to support defense: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportDefense Whether to support defense: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportDefense() {
        return this.IsSupportDefense;
    }

    /**
     * Set Whether to support defense: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportDefense Whether to support defense: 0: no; 1: yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportDefense(Long IsSupportDefense) {
        this.IsSupportDefense = IsSupportDefense;
    }

    /**
     * Get Number of Attacks Defended
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenseAttackCount Number of Attacks Defended
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefenseAttackCount() {
        return this.DefenseAttackCount;
    }

    /**
     * Set Number of Attacks Defended
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenseAttackCount Number of Attacks Defended
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenseAttackCount(Long DefenseAttackCount) {
        this.DefenseAttackCount = DefenseAttackCount;
    }

    /**
     * Get Detection rule: 0: version comparison; 1: POC verification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Method Detection rule: 0: version comparison; 1: POC verification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set Detection rule: 0: version comparison; 1: POC verification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Method Detection rule: 0: version comparison; 1: POC verification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get Attack intensity level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackLevel Attack intensity level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set Attack intensity level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackLevel Attack intensity level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get Whether vulnerability defense is enabled on hosts with vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenseState Whether vulnerability defense is enabled on hosts with vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDefenseState() {
        return this.DefenseState;
    }

    /**
     * Set Whether vulnerability defense is enabled on hosts with vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenseState Whether vulnerability defense is enabled on hosts with vulnerabilities
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenseState(Boolean DefenseState) {
        this.DefenseState = DefenseState;
    }

    public EmergencyVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmergencyVul(EmergencyVul source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.PublishDate != null) {
            this.PublishDate = new String(source.PublishDate);
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Labels != null) {
            this.Labels = new String(source.Labels);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.IsSupportDefense != null) {
            this.IsSupportDefense = new Long(source.IsSupportDefense);
        }
        if (source.DefenseAttackCount != null) {
            this.DefenseAttackCount = new Long(source.DefenseAttackCount);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.DefenseState != null) {
            this.DefenseState = new Boolean(source.DefenseState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "PublishDate", this.PublishDate);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "IsSupportDefense", this.IsSupportDefense);
        this.setParamSimple(map, prefix + "DefenseAttackCount", this.DefenseAttackCount);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "DefenseState", this.DefenseState);

    }
}

