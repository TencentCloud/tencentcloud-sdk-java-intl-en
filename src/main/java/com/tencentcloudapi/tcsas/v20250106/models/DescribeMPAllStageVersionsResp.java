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
    * <p>Mini program appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini program version primary key ID.</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

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
    * <p>Mini program description.</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Mini program version.</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Version introduction.</p>
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * <p>Phase:  Valid values: Develop; Platform; Online.</p>
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>Approval number.</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * <p>Whether this is a preview. Valid values: 0: No; 1: Yes.</p>
    */
    @SerializedName("ShowCase")
    @Expose
    private Long ShowCase;

    /**
    * <p>Rollback version number.</p>
    */
    @SerializedName("RollbackVersion")
    @Expose
    private Long RollbackVersion;

    /**
    * <p>Available status. Valid value: 0: All; 1 Available; 2: In canary release.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
    */
    @SerializedName("VersionCurrentStatus")
    @Expose
    private Long VersionCurrentStatus;

    /**
    * <p>Age rating information.</p>
    */
    @SerializedName("AgeRatings")
    @Expose
    private AgeRatingItem [] AgeRatings;

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
     * Get <p>Mini program version primary key ID.</p> 
     * @return MNPVersionId <p>Mini program version primary key ID.</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini program version primary key ID.</p>
     * @param MNPVersionId <p>Mini program version primary key ID.</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
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
     * Get <p>Mini program description.</p> 
     * @return MNPDesc <p>Mini program description.</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini program description.</p>
     * @param MNPDesc <p>Mini program description.</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get <p>Version introduction.</p> 
     * @return MNPVersionIntro <p>Version introduction.</p>
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set <p>Version introduction.</p>
     * @param MNPVersionIntro <p>Version introduction.</p>
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get <p>Phase:  Valid values: Develop; Platform; Online.</p> 
     * @return Phase <p>Phase:  Valid values: Develop; Platform; Online.</p>
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>Phase:  Valid values: Develop; Platform; Online.</p>
     * @param Phase <p>Phase:  Valid values: Develop; Platform; Online.</p>
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
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
     * Get <p>Whether this is a preview. Valid values: 0: No; 1: Yes.</p> 
     * @return ShowCase <p>Whether this is a preview. Valid values: 0: No; 1: Yes.</p>
     */
    public Long getShowCase() {
        return this.ShowCase;
    }

    /**
     * Set <p>Whether this is a preview. Valid values: 0: No; 1: Yes.</p>
     * @param ShowCase <p>Whether this is a preview. Valid values: 0: No; 1: Yes.</p>
     */
    public void setShowCase(Long ShowCase) {
        this.ShowCase = ShowCase;
    }

    /**
     * Get <p>Rollback version number.</p> 
     * @return RollbackVersion <p>Rollback version number.</p>
     */
    public Long getRollbackVersion() {
        return this.RollbackVersion;
    }

    /**
     * Set <p>Rollback version number.</p>
     * @param RollbackVersion <p>Rollback version number.</p>
     */
    public void setRollbackVersion(Long RollbackVersion) {
        this.RollbackVersion = RollbackVersion;
    }

    /**
     * Get <p>Available status. Valid value: 0: All; 1 Available; 2: In canary release.</p> 
     * @return Status <p>Available status. Valid value: 0: All; 1 Available; 2: In canary release.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Available status. Valid value: 0: All; 1 Available; 2: In canary release.</p>
     * @param Status <p>Available status. Valid value: 0: All; 1 Available; 2: In canary release.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p> 
     * @return VersionCurrentStatus <p>Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public Long getVersionCurrentStatus() {
        return this.VersionCurrentStatus;
    }

    /**
     * Set <p>Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     * @param VersionCurrentStatus <p>Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.</p>
     */
    public void setVersionCurrentStatus(Long VersionCurrentStatus) {
        this.VersionCurrentStatus = VersionCurrentStatus;
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
        this.setParamArrayObj(map, prefix + "AgeRatings.", this.AgeRatings);

    }
}

