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

public class VulInfoList extends AbstractModel {

    /**
    * IDs of events corresponding to a vulnerability, separated by commas (,)
    */
    @SerializedName("Ids")
    @Expose
    private String Ids;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability disclosure time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Last detection time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Number of affected hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublishTimeWisteria")
    @Expose
    private String PublishTimeWisteria;

    /**
    * This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NameWisteria")
    @Expose
    private String NameWisteria;

    /**
    * This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DescriptWisteria")
    @Expose
    private String DescriptWisteria;

    /**
    * Event status after aggregation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

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
    * Vulnerability tags, separated by multiple commas
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Labels")
    @Expose
    private String Labels;

    /**
    * Whether automatic fixing is supported and hosts that support automatic fixing are included. 0: no; 1: yes.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
    * ID of the last scan task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Whether defense is supported. 0: not supported; 1: supported.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportDefense")
    @Expose
    private Long IsSupportDefense;

    /**
    * Number of attacks defended
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenseAttackCount")
    @Expose
    private Long DefenseAttackCount;

    /**
    * First occurrence time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstAppearTime")
    @Expose
    private String FirstAppearTime;

    /**
    * Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Attack intensity
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * Whether a restart is required after the vulnerability is fixed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FixNoNeedRestart")
    @Expose
    private Boolean FixNoNeedRestart;

    /**
    * Detection method. 0: version comparison; 1: POC verification.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
     * Get IDs of events corresponding to a vulnerability, separated by commas (,) 
     * @return Ids IDs of events corresponding to a vulnerability, separated by commas (,)
     */
    public String getIds() {
        return this.Ids;
    }

    /**
     * Set IDs of events corresponding to a vulnerability, separated by commas (,)
     * @param Ids IDs of events corresponding to a vulnerability, separated by commas (,)
     */
    public void setIds(String Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed 
     * @return Status 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed
     * @param Status 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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
     * Get Vulnerability disclosure time 
     * @return PublishTime Vulnerability disclosure time
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Vulnerability disclosure time
     * @param PublishTime Vulnerability disclosure time
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get Last detection time 
     * @return LastTime Last detection time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection time
     * @param LastTime Last detection time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Number of affected hosts 
     * @return HostCount Number of affected hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected hosts
     * @param HostCount Number of affected hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical. 
     * @return Level Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     * @param Level Vulnerability level. 1: low-risk; 2: medium-risk; 3: high-risk; 4: critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return From This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param From This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Descript Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Descript Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublishTimeWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublishTimeWisteria() {
        return this.PublishTimeWisteria;
    }

    /**
     * Set This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublishTimeWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublishTimeWisteria(String PublishTimeWisteria) {
        this.PublishTimeWisteria = PublishTimeWisteria;
    }

    /**
     * Get This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NameWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNameWisteria() {
        return this.NameWisteria;
    }

    /**
     * Set This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NameWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNameWisteria(String NameWisteria) {
        this.NameWisteria = NameWisteria;
    }

    /**
     * Get This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DescriptWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescriptWisteria() {
        return this.DescriptWisteria;
    }

    /**
     * Set This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DescriptWisteria This field has been deprecated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescriptWisteria(String DescriptWisteria) {
        this.DescriptWisteria = DescriptWisteria;
    }

    /**
     * Get Event status after aggregation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StatusStr Event status after aggregation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set Event status after aggregation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StatusStr Event status after aggregation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
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
     * Get Vulnerability tags, separated by multiple commas
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Labels Vulnerability tags, separated by multiple commas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabels() {
        return this.Labels;
    }

    /**
     * Set Vulnerability tags, separated by multiple commas
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Labels Vulnerability tags, separated by multiple commas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabels(String Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Whether automatic fixing is supported and hosts that support automatic fixing are included. 0: no; 1: yes.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixSwitch Whether automatic fixing is supported and hosts that support automatic fixing are included. 0: no; 1: yes.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set Whether automatic fixing is supported and hosts that support automatic fixing are included. 0: no; 1: yes.Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixSwitch Whether automatic fixing is supported and hosts that support automatic fixing are included. 0: no; 1: yes.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    /**
     * Get ID of the last scan task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId ID of the last scan task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the last scan task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId ID of the last scan task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Whether defense is supported. 0: not supported; 1: supported.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportDefense Whether defense is supported. 0: not supported; 1: supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportDefense() {
        return this.IsSupportDefense;
    }

    /**
     * Set Whether defense is supported. 0: not supported; 1: supported.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportDefense Whether defense is supported. 0: not supported; 1: supported.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportDefense(Long IsSupportDefense) {
        this.IsSupportDefense = IsSupportDefense;
    }

    /**
     * Get Number of attacks defended
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenseAttackCount Number of attacks defended
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefenseAttackCount() {
        return this.DefenseAttackCount;
    }

    /**
     * Set Number of attacks defended
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenseAttackCount Number of attacks defended
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenseAttackCount(Long DefenseAttackCount) {
        this.DefenseAttackCount = DefenseAttackCount;
    }

    /**
     * Get First occurrence time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstAppearTime First occurrence time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstAppearTime() {
        return this.FirstAppearTime;
    }

    /**
     * Set First occurrence time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstAppearTime First occurrence time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstAppearTime(String FirstAppearTime) {
        this.FirstAppearTime = FirstAppearTime;
    }

    /**
     * Get Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulCategory Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulCategory Vulnerability category. 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Attack intensity
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackLevel Attack intensity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set Attack intensity
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackLevel Attack intensity
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get Whether a restart is required after the vulnerability is fixed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FixNoNeedRestart Whether a restart is required after the vulnerability is fixed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getFixNoNeedRestart() {
        return this.FixNoNeedRestart;
    }

    /**
     * Set Whether a restart is required after the vulnerability is fixed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FixNoNeedRestart Whether a restart is required after the vulnerability is fixed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFixNoNeedRestart(Boolean FixNoNeedRestart) {
        this.FixNoNeedRestart = FixNoNeedRestart;
    }

    /**
     * Get Detection method. 0: version comparison; 1: POC verification.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Method Detection method. 0: version comparison; 1: POC verification.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set Detection method. 0: version comparison; 1: POC verification.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Method Detection method. 0: version comparison; 1: POC verification.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    public VulInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoList(VulInfoList source) {
        if (source.Ids != null) {
            this.Ids = new String(source.Ids);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.PublishTimeWisteria != null) {
            this.PublishTimeWisteria = new String(source.PublishTimeWisteria);
        }
        if (source.NameWisteria != null) {
            this.NameWisteria = new String(source.NameWisteria);
        }
        if (source.DescriptWisteria != null) {
            this.DescriptWisteria = new String(source.DescriptWisteria);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
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
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.IsSupportDefense != null) {
            this.IsSupportDefense = new Long(source.IsSupportDefense);
        }
        if (source.DefenseAttackCount != null) {
            this.DefenseAttackCount = new Long(source.DefenseAttackCount);
        }
        if (source.FirstAppearTime != null) {
            this.FirstAppearTime = new String(source.FirstAppearTime);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.FixNoNeedRestart != null) {
            this.FixNoNeedRestart = new Boolean(source.FixNoNeedRestart);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ids", this.Ids);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "PublishTimeWisteria", this.PublishTimeWisteria);
        this.setParamSimple(map, prefix + "NameWisteria", this.NameWisteria);
        this.setParamSimple(map, prefix + "DescriptWisteria", this.DescriptWisteria);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamSimple(map, prefix + "Labels", this.Labels);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "IsSupportDefense", this.IsSupportDefense);
        this.setParamSimple(map, prefix + "DefenseAttackCount", this.DefenseAttackCount);
        this.setParamSimple(map, prefix + "FirstAppearTime", this.FirstAppearTime);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "FixNoNeedRestart", this.FixNoNeedRestart);
        this.setParamSimple(map, prefix + "Method", this.Method);

    }
}

