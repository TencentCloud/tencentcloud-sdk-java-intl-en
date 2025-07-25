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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionBoardResp extends AbstractModel {

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program category
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Developer
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * The time when the developer created it
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Version features
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Phase. Values: [Develop,Platform,Online]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * Whether it is a trial version. 
0: Not a trial version; 1: Trial version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowCase")
    @Expose
    private Long ShowCase;

    /**
    * Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * Scan score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanScore")
    @Expose
    private Long ScanScore;

    /**
    * Version number to roll back to
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RollbackVersion")
    @Expose
    private Long RollbackVersion;

    /**
    * Release status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Address of the scan result
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScanHtmlPath")
    @Expose
    private String ScanHtmlPath;

    /**
    * Version approval status. 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionCurrentStatus")
    @Expose
    private Long VersionCurrentStatus;

    /**
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersionId Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersionId Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get Mini program name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIcon Mini program icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program category
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPType Mini program category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program category
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPType Mini program category
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPIntro Mini program introduction
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Mini program description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPDesc Mini program description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Developer
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Developer
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Developer
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Developer
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get The time when the developer created it
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The time when the developer created it
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the developer created it
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The time when the developer created it
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Mini program version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersion Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersion Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Version features
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPVersionIntro Version features
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Version features
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPVersionIntro Version features
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Phase. Values: [Develop,Platform,Online]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phase Phase. Values: [Develop,Platform,Online]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Phase. Values: [Develop,Platform,Online]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phase Phase. Values: [Develop,Platform,Online]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditStatus 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditStatus 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditNo Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditNo Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
    }

    /**
     * Get Whether it is a trial version. 
0: Not a trial version; 1: Trial version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShowCase Whether it is a trial version. 
0: Not a trial version; 1: Trial version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShowCase() {
        return this.ShowCase;
    }

    /**
     * Set Whether it is a trial version. 
0: Not a trial version; 1: Trial version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShowCase Whether it is a trial version. 
0: Not a trial version; 1: Trial version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShowCase(Long ShowCase) {
        this.ShowCase = ShowCase;
    }

    /**
     * Get Scanning status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanStatus Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanStatus Scanning status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get Scan score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanScore Scan score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScanScore() {
        return this.ScanScore;
    }

    /**
     * Set Scan score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanScore Scan score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanScore(Long ScanScore) {
        this.ScanScore = ScanScore;
    }

    /**
     * Get Version number to roll back to
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RollbackVersion Version number to roll back to
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRollbackVersion() {
        return this.RollbackVersion;
    }

    /**
     * Set Version number to roll back to
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RollbackVersion Version number to roll back to
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRollbackVersion(Long RollbackVersion) {
        this.RollbackVersion = RollbackVersion;
    }

    /**
     * Get Release status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Release status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Release status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Release status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Address of the scan result
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ScanHtmlPath Address of the scan result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getScanHtmlPath() {
        return this.ScanHtmlPath;
    }

    /**
     * Set Address of the scan result
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ScanHtmlPath Address of the scan result
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScanHtmlPath(String ScanHtmlPath) {
        this.ScanHtmlPath = ScanHtmlPath;
    }

    /**
     * Get Version approval status. 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionCurrentStatus Version approval status. 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVersionCurrentStatus() {
        return this.VersionCurrentStatus;
    }

    /**
     * Set Version approval status. 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionCurrentStatus Version approval status. 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionCurrentStatus(Long VersionCurrentStatus) {
        this.VersionCurrentStatus = VersionCurrentStatus;
    }

    public VersionBoardResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionBoardResp(VersionBoardResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.MNPVersionIntro != null) {
            this.MNPVersionIntro = new String(source.MNPVersionIntro);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.ShowCase != null) {
            this.ShowCase = new Long(source.ShowCase);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.ScanScore != null) {
            this.ScanScore = new Long(source.ScanScore);
        }
        if (source.RollbackVersion != null) {
            this.RollbackVersion = new Long(source.RollbackVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScanHtmlPath != null) {
            this.ScanHtmlPath = new String(source.ScanHtmlPath);
        }
        if (source.VersionCurrentStatus != null) {
            this.VersionCurrentStatus = new Long(source.VersionCurrentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "MNPVersionIntro", this.MNPVersionIntro);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "ShowCase", this.ShowCase);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanScore", this.ScanScore);
        this.setParamSimple(map, prefix + "RollbackVersion", this.RollbackVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScanHtmlPath", this.ScanHtmlPath);
        this.setParamSimple(map, prefix + "VersionCurrentStatus", this.VersionCurrentStatus);

    }
}

