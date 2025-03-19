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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPApprovalListData extends AbstractModel {

    /**
    * Approval request ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Approval status : 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Mini program version ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * Applicant
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyUser")
    @Expose
    private String ApplyUser;

    /**
    * Application time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

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
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Application icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * Team ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Team name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * Mini Program QR code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPQrCodeUrl")
    @Expose
    private String MNPQrCodeUrl;

    /**
    * Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Approver
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApprovalUser")
    @Expose
    private String ApprovalUser;

    /**
    * Approval time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApprovalTime")
    @Expose
    private String ApprovalTime;

    /**
    * Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
     * Get Approval request ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApprovalNo Approval request ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval request ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApprovalNo Approval request ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Approval status : 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApprovalStatus Approval status : 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status : 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApprovalStatus Approval status : 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

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
     * Get Applicant
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplyUser Applicant
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplyUser() {
        return this.ApplyUser;
    }

    /**
     * Set Applicant
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplyUser Applicant
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplyUser(String ApplyUser) {
        this.ApplyUser = ApplyUser;
    }

    /**
     * Get Application time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplyTime Application time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplyTime Application time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
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
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Application icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationLogo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationLogo Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get Team ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamId Team ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Team name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set Team name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TeamName Team name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get Mini Program QR code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPQrCodeUrl Mini Program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPQrCodeUrl() {
        return this.MNPQrCodeUrl;
    }

    /**
     * Set Mini Program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPQrCodeUrl Mini Program QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPQrCodeUrl(String MNPQrCodeUrl) {
        this.MNPQrCodeUrl = MNPQrCodeUrl;
    }

    /**
     * Get Mini program type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPType Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPType Mini program type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get Approver
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApprovalUser Approver
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApprovalUser() {
        return this.ApprovalUser;
    }

    /**
     * Set Approver
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApprovalUser Approver
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApprovalUser(String ApprovalUser) {
        this.ApprovalUser = ApprovalUser;
    }

    /**
     * Get Approval time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApprovalTime Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApprovalTime Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApprovalTime(String ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
    }

    /**
     * Get Approval notes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApprovalNote Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApprovalNote Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
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

