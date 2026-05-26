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
    * Mini program appid.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program version primary key ID.
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

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
    * Mini program category.
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * Mini program introduction.
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Mini program description.
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Mini program version number.
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * Version introduction.
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * Stage: Develop, preview, released.
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * Approval number.
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Whether this is a preview. Valid values: 0: No; 1: Yes.
    */
    @SerializedName("ShowCase")
    @Expose
    private Long ShowCase;

    /**
    * Rollback version number.
    */
    @SerializedName("RollbackVersion")
    @Expose
    private Long RollbackVersion;

    /**
    * Available status. Valid value: 0: All; 1 Available; 2: In canary release.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
    */
    @SerializedName("VersionCurrentStatus")
    @Expose
    private Long VersionCurrentStatus;

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
     * Get Mini program version primary key ID. 
     * @return MNPVersionId Mini program version primary key ID.
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set Mini program version primary key ID.
     * @param MNPVersionId Mini program version primary key ID.
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
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
     * Get Mini program introduction. 
     * @return MNPIntro Mini program introduction.
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program introduction.
     * @param MNPIntro Mini program introduction.
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Mini program description. 
     * @return MNPDesc Mini program description.
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set Mini program description.
     * @param MNPDesc Mini program description.
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get Creator. 
     * @return CreateUser Creator.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator.
     * @param CreateUser Creator.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Mini program version number. 
     * @return MNPVersion Mini program version number.
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set Mini program version number.
     * @param MNPVersion Mini program version number.
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get Version introduction. 
     * @return MNPVersionIntro Version introduction.
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set Version introduction.
     * @param MNPVersionIntro Version introduction.
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get Stage: Develop, preview, released. 
     * @return Phase Stage: Develop, preview, released.
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Stage: Develop, preview, released.
     * @param Phase Stage: Develop, preview, released.
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled. 
     * @return ApprovalStatus Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     * @param ApprovalStatus Approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

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
     * Get Whether this is a preview. Valid values: 0: No; 1: Yes. 
     * @return ShowCase Whether this is a preview. Valid values: 0: No; 1: Yes.
     */
    public Long getShowCase() {
        return this.ShowCase;
    }

    /**
     * Set Whether this is a preview. Valid values: 0: No; 1: Yes.
     * @param ShowCase Whether this is a preview. Valid values: 0: No; 1: Yes.
     */
    public void setShowCase(Long ShowCase) {
        this.ShowCase = ShowCase;
    }

    /**
     * Get Rollback version number. 
     * @return RollbackVersion Rollback version number.
     */
    public Long getRollbackVersion() {
        return this.RollbackVersion;
    }

    /**
     * Set Rollback version number.
     * @param RollbackVersion Rollback version number.
     */
    public void setRollbackVersion(Long RollbackVersion) {
        this.RollbackVersion = RollbackVersion;
    }

    /**
     * Get Available status. Valid value: 0: All; 1 Available; 2: In canary release. 
     * @return Status Available status. Valid value: 0: All; 1 Available; 2: In canary release.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Available status. Valid value: 0: All; 1 Available; 2: In canary release.
     * @param Status Available status. Valid value: 0: All; 1 Available; 2: In canary release.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled. 
     * @return VersionCurrentStatus Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     */
    public Long getVersionCurrentStatus() {
        return this.VersionCurrentStatus;
    }

    /**
     * Set Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
     * @param VersionCurrentStatus Current version approval status. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled.
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

