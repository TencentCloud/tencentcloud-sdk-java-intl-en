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

public class DescribeMNPApprovalListData extends AbstractModel {

    /**
    * Approval number.
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Superapp ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Approval status. Valid values: 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * Mini program appid.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program version.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Mini program version ID.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Applicant.
    */
    @SerializedName("ApplyUser")
    @Expose
    private String ApplyUser;

    /**
    * Application time.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Mini program name.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program icon.
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Superapp name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Superapp icon.
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * Team ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Mini program approval QR code URL.
    */
    @SerializedName("MNPQrCodeUrl")
    @Expose
    private String MNPQrCodeUrl;

    /**
    * Mini program category.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Approver.
    */
    @SerializedName("ApprovalUser")
    @Expose
    private String ApprovalUser;

    /**
    * Approval time.
    */
    @SerializedName("ApprovalTime")
    @Expose
    private String ApprovalTime;

    /**
    * Approval note.
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
     * Get Approval number. 
     * @return ApprovalNo Approval number.
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval number.
     * @param ApprovalNo Approval number.
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get Superapp ID. 
     * @return ApplicationId Superapp ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID.
     * @param ApplicationId Superapp ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Approval status. Valid values: 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled. 
     * @return ApprovalStatus Approval status. Valid values: 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status. Valid values: 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     * @param ApprovalStatus Approval status. Valid values: 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get Mini program appid. 
     * @return MNPId Mini program appid.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program appid.
     * @param MNPId Mini program appid.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
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
     * Get Mini program version ID. 
     * @return MNPVersionId Mini program version ID.
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Mini program version ID.
     * @param MNPVersionId Mini program version ID.
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get Applicant. 
     * @return ApplyUser Applicant.
     */
    public String getApplyUser() {
        return this.ApplyUser;
    }

    /**
     * Set Applicant.
     * @param ApplyUser Applicant.
     */
    public void setApplyUser(String ApplyUser) {
        this.ApplyUser = ApplyUser;
    }

    /**
     * Get Application time. 
     * @return ApplyTime Application time.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time.
     * @param ApplyTime Application time.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Mini program name. 
     * @return MNPName Mini program name.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name.
     * @param MNPName Mini program name.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program icon. 
     * @return MNPIcon Mini program icon.
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program icon.
     * @param MNPIcon Mini program icon.
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Superapp name. 
     * @return ApplicationName Superapp name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Superapp name.
     * @param ApplicationName Superapp name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Superapp icon. 
     * @return ApplicationLogo Superapp icon.
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set Superapp icon.
     * @param ApplicationLogo Superapp icon.
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get Team ID. 
     * @return TeamId Team ID.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID.
     * @param TeamId Team ID.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name. 
     * @return TeamName Team name.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name.
     * @param TeamName Team name.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Mini program approval QR code URL. 
     * @return MNPQrCodeUrl Mini program approval QR code URL.
     */
    public String getMNPQrCodeUrl() {
        return this.MNPQrCodeUrl;
    }

    /**
     * Set Mini program approval QR code URL.
     * @param MNPQrCodeUrl Mini program approval QR code URL.
     */
    public void setMNPQrCodeUrl(String MNPQrCodeUrl) {
        this.MNPQrCodeUrl = MNPQrCodeUrl;
    }

    /**
     * Get Mini program category. 
     * @return MNPType Mini program category.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program category.
     * @param MNPType Mini program category.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Approver. 
     * @return ApprovalUser Approver.
     */
    public String getApprovalUser() {
        return this.ApprovalUser;
    }

    /**
     * Set Approver.
     * @param ApprovalUser Approver.
     */
    public void setApprovalUser(String ApprovalUser) {
        this.ApprovalUser = ApprovalUser;
    }

    /**
     * Get Approval time. 
     * @return ApprovalTime Approval time.
     */
    public String getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set Approval time.
     * @param ApprovalTime Approval time.
     */
    public void setApprovalTime(String ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
    }

    /**
     * Get Approval note. 
     * @return ApprovalNote Approval note.
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set Approval note.
     * @param ApprovalNote Approval note.
     */
    public void setApprovalNote(String ApprovalNote) {
        this.ApprovalNote = ApprovalNote;
    }

    public DescribeMNPApprovalListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPApprovalListData(DescribeMNPApprovalListData source) {
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.ApplyUser != null) {
            this.ApplyUser = new String(source.ApplyUser);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationLogo != null) {
            this.ApplicationLogo = new String(source.ApplicationLogo);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.MNPQrCodeUrl != null) {
            this.MNPQrCodeUrl = new String(source.MNPQrCodeUrl);
        }
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.ApprovalUser != null) {
            this.ApprovalUser = new String(source.ApprovalUser);
        }
        if (source.ApprovalTime != null) {
            this.ApprovalTime = new String(source.ApprovalTime);
        }
        if (source.ApprovalNote != null) {
            this.ApprovalNote = new String(source.ApprovalNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamSimple(map, prefix + "ApplyUser", this.ApplyUser);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationLogo", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "MNPQrCodeUrl", this.MNPQrCodeUrl);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "ApprovalUser", this.ApprovalUser);
        this.setParamSimple(map, prefix + "ApprovalTime", this.ApprovalTime);
        this.setParamSimple(map, prefix + "ApprovalNote", this.ApprovalNote);

    }
}

