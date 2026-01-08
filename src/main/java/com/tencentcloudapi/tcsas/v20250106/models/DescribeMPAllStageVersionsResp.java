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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMPAllStageVersionsResp extends AbstractModel {

    /**
    * Mini program ID.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Specifies the mini program version primary key id.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Mini program name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Specifies the mini program avatar.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program type
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Mini program introduction
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Mini program description
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Specifies the developer.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Developer creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Mini program version.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Describes version features.
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Development Platform Online.
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * 0 pending review; 1 under review; 2 review rejection; 3 pass review; 4 review cancellation.
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * Approval ticket ID
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Specifies whether it is a trial version.
Specifies the version type. valid values: 0 (non-preview version); 1 (trial version).
    */
    @SerializedName("ShowCase")
    @Expose
    private Long ShowCase;

    /**
    * Version number to roll back to.
    */
    @SerializedName("RollbackVersion")
    @Expose
    private Long RollbackVersion;

    /**
    * Indicates the release status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies the current main status of the version. valid values: "0" (pending review), "1" (under review), "2" (review rejection), "3" (pass review), "4" (review cancellation).
    */
    @SerializedName("VersionCurrentStatus")
    @Expose
    private Long VersionCurrentStatus;

    /**
     * Get Mini program ID. 
     * @return MNPId Mini program ID.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID.
     * @param MNPId Mini program ID.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Specifies the mini program version primary key id. 
     * @return MNPVersionId Specifies the mini program version primary key id.
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Specifies the mini program version primary key id.
     * @param MNPVersionId Specifies the mini program version primary key id.
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get Mini program name 
     * @return MNPName Mini program name
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
     * @param MNPName Mini program name
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Specifies the mini program avatar. 
     * @return MNPIcon Specifies the mini program avatar.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Specifies the mini program avatar.
     * @param MNPIcon Specifies the mini program avatar.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program type 
     * @return MNPType Mini program type
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program type
     * @param MNPType Mini program type
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Mini program introduction 
     * @return MNPIntro Mini program introduction
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction
     * @param MNPIntro Mini program introduction
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Mini program description 
     * @return MNPDesc Mini program description
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description
     * @param MNPDesc Mini program description
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Specifies the developer. 
     * @return CreateUser Specifies the developer.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Specifies the developer.
     * @param CreateUser Specifies the developer.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Developer creation time. 
     * @return CreateTime Developer creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Developer creation time.
     * @param CreateTime Developer creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Mini program version. 
     * @return MNPVersion Mini program version.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Mini program version.
     * @param MNPVersion Mini program version.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Describes version features. 
     * @return MNPVersionIntro Describes version features.
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Describes version features.
     * @param MNPVersionIntro Describes version features.
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Development Platform Online. 
     * @return Phase Development Platform Online.
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Development Platform Online.
     * @param Phase Development Platform Online.
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get 0 pending review; 1 under review; 2 review rejection; 3 pass review; 4 review cancellation. 
     * @return ApprovalStatus 0 pending review; 1 under review; 2 review rejection; 3 pass review; 4 review cancellation.
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set 0 pending review; 1 under review; 2 review rejection; 3 pass review; 4 review cancellation.
     * @param ApprovalStatus 0 pending review; 1 under review; 2 review rejection; 3 pass review; 4 review cancellation.
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get Approval ticket ID 
     * @return ApprovalNo Approval ticket ID
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval ticket ID
     * @param ApprovalNo Approval ticket ID
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get Specifies whether it is a trial version.
Specifies the version type. valid values: 0 (non-preview version); 1 (trial version). 
     * @return ShowCase Specifies whether it is a trial version.
Specifies the version type. valid values: 0 (non-preview version); 1 (trial version).
     */
    public Long getShowCase() {
        return this.ShowCase;
    }

    /**
     * Set Specifies whether it is a trial version.
Specifies the version type. valid values: 0 (non-preview version); 1 (trial version).
     * @param ShowCase Specifies whether it is a trial version.
Specifies the version type. valid values: 0 (non-preview version); 1 (trial version).
     */
    public void setShowCase(Long ShowCase) {
        this.ShowCase = ShowCase;
    }

    /**
     * Get Version number to roll back to. 
     * @return RollbackVersion Version number to roll back to.
     */
    public Long getRollbackVersion() {
        return this.RollbackVersion;
    }

    /**
     * Set Version number to roll back to.
     * @param RollbackVersion Version number to roll back to.
     */
    public void setRollbackVersion(Long RollbackVersion) {
        this.RollbackVersion = RollbackVersion;
    }

    /**
     * Get Indicates the release status. 
     * @return Status Indicates the release status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Indicates the release status.
     * @param Status Indicates the release status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the current main status of the version. valid values: "0" (pending review), "1" (under review), "2" (review rejection), "3" (pass review), "4" (review cancellation). 
     * @return VersionCurrentStatus Specifies the current main status of the version. valid values: "0" (pending review), "1" (under review), "2" (review rejection), "3" (pass review), "4" (review cancellation).
     */
    public Long getVersionCurrentStatus() {
        return this.VersionCurrentStatus;
    }

    /**
     * Set Specifies the current main status of the version. valid values: "0" (pending review), "1" (under review), "2" (review rejection), "3" (pass review), "4" (review cancellation).
     * @param VersionCurrentStatus Specifies the current main status of the version. valid values: "0" (pending review), "1" (under review), "2" (review rejection), "3" (pass review), "4" (review cancellation).
     */
    public void setVersionCurrentStatus(Long VersionCurrentStatus) {
        this.VersionCurrentStatus = VersionCurrentStatus;
    }

    public DescribeMPAllStageVersionsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMPAllStageVersionsResp(DescribeMPAllStageVersionsResp source) {
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
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.ShowCase != null) {
            this.ShowCase = new Long(source.ShowCase);
        }
        if (source.RollbackVersion != null) {
            this.RollbackVersion = new Long(source.RollbackVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "ShowCase", this.ShowCase);
        this.setParamSimple(map, prefix + "RollbackVersion", this.RollbackVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VersionCurrentStatus", this.VersionCurrentStatus);

    }
}

