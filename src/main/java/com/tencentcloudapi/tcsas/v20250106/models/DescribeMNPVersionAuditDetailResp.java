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

public class DescribeMNPVersionAuditDetailResp extends AbstractModel {

    /**
    * <p>Approval number.</p>
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * <p>Mini program or mini game appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini program or mini game name.</p>
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
    * <p>Mini program category.</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini program introduction.</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Mini program version.</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Mini program version introduction.</p>
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

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
    * <p>Approver.</p>
    */
    @SerializedName("AuditUser")
    @Expose
    private String AuditUser;

    /**
    * <p>Approval time.</p>
    */
    @SerializedName("AuditTime")
    @Expose
    private String AuditTime;

    /**
    * <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * <p>Number of associated superapps.</p>
    */
    @SerializedName("MNPRelAppCount")
    @Expose
    private Long MNPRelAppCount;

    /**
    * <p>Information encoded in the mini program QR code.</p>
    */
    @SerializedName("QRCodeContent")
    @Expose
    private String QRCodeContent;

    /**
    * <p>Approval note.</p>
    */
    @SerializedName("AuditNote")
    @Expose
    private String AuditNote;

    /**
    * <p>Mini program version ID.</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>Age rating information.</p>
    */
    @SerializedName("AgeRatings")
    @Expose
    private AgeRatingItem [] AgeRatings;

    /**
    * <p>Superapp approval information.</p>
    */
    @SerializedName("AppAuditList")
    @Expose
    private DescribeMNPAuditDetailAppAuditInfo [] AppAuditList;

    /**
     * Get <p>Approval number.</p> 
     * @return AuditNo <p>Approval number.</p>
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set <p>Approval number.</p>
     * @param AuditNo <p>Approval number.</p>
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
    }

    /**
     * Get <p>Mini program or mini game appid.</p> 
     * @return MNPId <p>Mini program or mini game appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program or mini game appid.</p>
     * @param MNPId <p>Mini program or mini game appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini program or mini game name.</p> 
     * @return MNPName <p>Mini program or mini game name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini program or mini game name.</p>
     * @param MNPName <p>Mini program or mini game name.</p>
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
     * Get <p>Mini program introduction.</p> 
     * @return MNPIntro <p>Mini program introduction.</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini program introduction.</p>
     * @param MNPIntro <p>Mini program introduction.</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
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
     * Get <p>Mini program version introduction.</p> 
     * @return MNPVersionIntro <p>Mini program version introduction.</p>
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set <p>Mini program version introduction.</p>
     * @param MNPVersionIntro <p>Mini program version introduction.</p>
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
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
     * Get <p>Approver.</p> 
     * @return AuditUser <p>Approver.</p>
     */
    public String getAuditUser() {
        return this.AuditUser;
    }

    /**
     * Set <p>Approver.</p>
     * @param AuditUser <p>Approver.</p>
     */
    public void setAuditUser(String AuditUser) {
        this.AuditUser = AuditUser;
    }

    /**
     * Get <p>Approval time.</p> 
     * @return AuditTime <p>Approval time.</p>
     */
    public String getAuditTime() {
        return this.AuditTime;
    }

    /**
     * Set <p>Approval time.</p>
     * @param AuditTime <p>Approval time.</p>
     */
    public void setAuditTime(String AuditTime) {
        this.AuditTime = AuditTime;
    }

    /**
     * Get <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p> 
     * @return AuditStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     * @param AuditStatus <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get <p>Number of associated superapps.</p> 
     * @return MNPRelAppCount <p>Number of associated superapps.</p>
     */
    public Long getMNPRelAppCount() {
        return this.MNPRelAppCount;
    }

    /**
     * Set <p>Number of associated superapps.</p>
     * @param MNPRelAppCount <p>Number of associated superapps.</p>
     */
    public void setMNPRelAppCount(Long MNPRelAppCount) {
        this.MNPRelAppCount = MNPRelAppCount;
    }

    /**
     * Get <p>Information encoded in the mini program QR code.</p> 
     * @return QRCodeContent <p>Information encoded in the mini program QR code.</p>
     */
    public String getQRCodeContent() {
        return this.QRCodeContent;
    }

    /**
     * Set <p>Information encoded in the mini program QR code.</p>
     * @param QRCodeContent <p>Information encoded in the mini program QR code.</p>
     */
    public void setQRCodeContent(String QRCodeContent) {
        this.QRCodeContent = QRCodeContent;
    }

    /**
     * Get <p>Approval note.</p> 
     * @return AuditNote <p>Approval note.</p>
     */
    public String getAuditNote() {
        return this.AuditNote;
    }

    /**
     * Set <p>Approval note.</p>
     * @param AuditNote <p>Approval note.</p>
     */
    public void setAuditNote(String AuditNote) {
        this.AuditNote = AuditNote;
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

    /**
     * Get <p>Superapp approval information.</p> 
     * @return AppAuditList <p>Superapp approval information.</p>
     */
    public DescribeMNPAuditDetailAppAuditInfo [] getAppAuditList() {
        return this.AppAuditList;
    }

    /**
     * Set <p>Superapp approval information.</p>
     * @param AppAuditList <p>Superapp approval information.</p>
     */
    public void setAppAuditList(DescribeMNPAuditDetailAppAuditInfo [] AppAuditList) {
        this.AppAuditList = AppAuditList;
    }

    public DescribeMNPVersionAuditDetailResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPVersionAuditDetailResp(DescribeMNPVersionAuditDetailResp source) {
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
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
        if (source.MNPVersion != null) {
            this.MNPVersion = new String(source.MNPVersion);
        }
        if (source.MNPVersionIntro != null) {
            this.MNPVersionIntro = new String(source.MNPVersionIntro);
        }
        if (source.ApplyUser != null) {
            this.ApplyUser = new String(source.ApplyUser);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.AuditUser != null) {
            this.AuditUser = new String(source.AuditUser);
        }
        if (source.AuditTime != null) {
            this.AuditTime = new String(source.AuditTime);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.MNPRelAppCount != null) {
            this.MNPRelAppCount = new Long(source.MNPRelAppCount);
        }
        if (source.QRCodeContent != null) {
            this.QRCodeContent = new String(source.QRCodeContent);
        }
        if (source.AuditNote != null) {
            this.AuditNote = new String(source.AuditNote);
        }
        if (source.MNPVersionId != null) {
            this.MNPVersionId = new Long(source.MNPVersionId);
        }
        if (source.AgeRatings != null) {
            this.AgeRatings = new AgeRatingItem[source.AgeRatings.length];
            for (int i = 0; i < source.AgeRatings.length; i++) {
                this.AgeRatings[i] = new AgeRatingItem(source.AgeRatings[i]);
            }
        }
        if (source.AppAuditList != null) {
            this.AppAuditList = new DescribeMNPAuditDetailAppAuditInfo[source.AppAuditList.length];
            for (int i = 0; i < source.AppAuditList.length; i++) {
                this.AppAuditList[i] = new DescribeMNPAuditDetailAppAuditInfo(source.AppAuditList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPVersion", this.MNPVersion);
        this.setParamSimple(map, prefix + "MNPVersionIntro", this.MNPVersionIntro);
        this.setParamSimple(map, prefix + "ApplyUser", this.ApplyUser);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "AuditUser", this.AuditUser);
        this.setParamSimple(map, prefix + "AuditTime", this.AuditTime);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "MNPRelAppCount", this.MNPRelAppCount);
        this.setParamSimple(map, prefix + "QRCodeContent", this.QRCodeContent);
        this.setParamSimple(map, prefix + "AuditNote", this.AuditNote);
        this.setParamSimple(map, prefix + "MNPVersionId", this.MNPVersionId);
        this.setParamArrayObj(map, prefix + "AgeRatings.", this.AgeRatings);
        this.setParamArrayObj(map, prefix + "AppAuditList.", this.AppAuditList);

    }
}

