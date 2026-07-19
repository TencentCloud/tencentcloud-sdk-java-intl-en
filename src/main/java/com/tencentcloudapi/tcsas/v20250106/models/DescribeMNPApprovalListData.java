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
    * <p>Approval number.</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>Mini program appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini program version.</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Mini program version ID.</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>Applicant.</p>
    */
    @SerializedName("ApplyUser")
    @Expose
    private String ApplyUser;

    /**
    * <p>Application time.</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * <p>Mini program name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini program icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Superapp name.</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>Superapp icon.</p>
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Mini program approval QR code URL.</p>
    */
    @SerializedName("MNPQrCodeUrl")
    @Expose
    private String MNPQrCodeUrl;

    /**
    * <p>Mini program category.</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Approver.</p>
    */
    @SerializedName("ApprovalUser")
    @Expose
    private String ApprovalUser;

    /**
    * <p>Approval time.</p>
    */
    @SerializedName("ApprovalTime")
    @Expose
    private String ApprovalTime;

    /**
    * <p>Approval note.</p>
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
    * <p>Age rating information.</p>
    */
    @SerializedName("AgeRatings")
    @Expose
    private AgeRatingItem [] AgeRatings;

    /**
     * Get <p>Approval number.</p> 
     * @return ApprovalNo <p>Approval number.</p>
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set <p>Approval number.</p>
     * @param ApprovalNo <p>Approval number.</p>
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p> 
     * @return ApprovalStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     * @param ApprovalStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get <p>Mini program appid.</p> 
     * @return MNPId <p>Mini program appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program appid.</p>
     * @param MNPId <p>Mini program appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini program version.</p> 
     * @return MNPVersion <p>Mini program version.</p>
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set <p>Mini program version.</p>
     * @param MNPVersion <p>Mini program version.</p>
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get <p>Mini program version ID.</p> 
     * @return MNPVersionId <p>Mini program version ID.</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini program version ID.</p>
     * @param MNPVersionId <p>Mini program version ID.</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get <p>Applicant.</p> 
     * @return ApplyUser <p>Applicant.</p>
     */
    public String getApplyUser() {
        return this.ApplyUser;
    }

    /**
     * Set <p>Applicant.</p>
     * @param ApplyUser <p>Applicant.</p>
     */
    public void setApplyUser(String ApplyUser) {
        this.ApplyUser = ApplyUser;
    }

    /**
     * Get <p>Application time.</p> 
     * @return ApplyTime <p>Application time.</p>
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>Application time.</p>
     * @param ApplyTime <p>Application time.</p>
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>Mini program name.</p> 
     * @return MNPName <p>Mini program name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini program name.</p>
     * @param MNPName <p>Mini program name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini program icon.</p> 
     * @return MNPIcon <p>Mini program icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini program icon.</p>
     * @param MNPIcon <p>Mini program icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Superapp name.</p> 
     * @return ApplicationName <p>Superapp name.</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name.</p>
     * @param ApplicationName <p>Superapp name.</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>Superapp icon.</p> 
     * @return ApplicationLogo <p>Superapp icon.</p>
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set <p>Superapp icon.</p>
     * @param ApplicationLogo <p>Superapp icon.</p>
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Mini program approval QR code URL.</p> 
     * @return MNPQrCodeUrl <p>Mini program approval QR code URL.</p>
     */
    public String getMNPQrCodeUrl() {
        return this.MNPQrCodeUrl;
    }

    /**
     * Set <p>Mini program approval QR code URL.</p>
     * @param MNPQrCodeUrl <p>Mini program approval QR code URL.</p>
     */
    public void setMNPQrCodeUrl(String MNPQrCodeUrl) {
        this.MNPQrCodeUrl = MNPQrCodeUrl;
    }

    /**
     * Get <p>Mini program category.</p> 
     * @return MNPType <p>Mini program category.</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini program category.</p>
     * @param MNPType <p>Mini program category.</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Approver.</p> 
     * @return ApprovalUser <p>Approver.</p>
     */
    public String getApprovalUser() {
        return this.ApprovalUser;
    }

    /**
     * Set <p>Approver.</p>
     * @param ApprovalUser <p>Approver.</p>
     */
    public void setApprovalUser(String ApprovalUser) {
        this.ApprovalUser = ApprovalUser;
    }

    /**
     * Get <p>Approval time.</p> 
     * @return ApprovalTime <p>Approval time.</p>
     */
    public String getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set <p>Approval time.</p>
     * @param ApprovalTime <p>Approval time.</p>
     */
    public void setApprovalTime(String ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
    }

    /**
     * Get <p>Approval note.</p> 
     * @return ApprovalNote <p>Approval note.</p>
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set <p>Approval note.</p>
     * @param ApprovalNote <p>Approval note.</p>
     */
    public void setApprovalNote(String ApprovalNote) {
        this.ApprovalNote = ApprovalNote;
    }

    /**
     * Get <p>Age rating information.</p> 
     * @return AgeRatings <p>Age rating information.</p>
     */
    public AgeRatingItem [] getAgeRatings() {
        return this.AgeRatings;
    }

    /**
     * Set <p>Age rating information.</p>
     * @param AgeRatings <p>Age rating information.</p>
     */
    public void setAgeRatings(AgeRatingItem [] AgeRatings) {
        this.AgeRatings = AgeRatings;
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
        if (source.AgeRatings != null) {
            this.AgeRatings = new AgeRatingItem[source.AgeRatings.length];
            for (int i = 0; i < source.AgeRatings.length; i++) {
                this.AgeRatings[i] = new AgeRatingItem(source.AgeRatings[i]);
            }
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
        this.setParamArrayObj(map, prefix + "AgeRatings.", this.AgeRatings);

    }
}

