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

public class DescribeMNGAllStageVersionsResp extends AbstractModel {

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini game version ID</p>
    */
    @SerializedName("MNPVersionId")
    @Expose
    private Long MNPVersionId;

    /**
    * <p>Mini game name</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini game icon</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Mini game category</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini game introduction</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Mini game description</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Developer</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Developer creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Mini game version</p>
    */
    @SerializedName("MNPVersion")
    @Expose
    private String MNPVersion;

    /**
    * <p>Version feature description</p>
    */
    @SerializedName("MNPVersionIntro")
    @Expose
    private String MNPVersionIntro;

    /**
    * <p>Version:</p> Develop, preview, released</p>
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>Approval number</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * <p>Whether this is a preview. Valid values: 0: No; 1: Yes</p>
    */
    @SerializedName("ShowCase")
    @Expose
    private Long ShowCase;

    /**
    * <p>Rollback version number</p>
    */
    @SerializedName("RollbackVersion")
    @Expose
    private Long RollbackVersion;

    /**
    * <p>Available status</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Primary status of the current version. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
    */
    @SerializedName("VersionCurrentStatus")
    @Expose
    private Long VersionCurrentStatus;

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini game version ID</p> 
     * @return MNPVersionId <p>Mini game version ID</p>
     */
    public Long getMNPVersionId() {
        return this.MNPVersionId;
    }

    /**
     * Set <p>Mini game version ID</p>
     * @param MNPVersionId <p>Mini game version ID</p>
     */
    public void setMNPVersionId(Long MNPVersionId) {
        this.MNPVersionId = MNPVersionId;
    }

    /**
     * Get <p>Mini game name</p> 
     * @return MNPName <p>Mini game name</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name</p>
     * @param MNPName <p>Mini game name</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini game icon</p> 
     * @return MNPIcon <p>Mini game icon</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini game icon</p>
     * @param MNPIcon <p>Mini game icon</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Mini game category</p> 
     * @return MNPType <p>Mini game category</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini game category</p>
     * @param MNPType <p>Mini game category</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Mini game introduction</p> 
     * @return MNPIntro <p>Mini game introduction</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini game introduction</p>
     * @param MNPIntro <p>Mini game introduction</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get <p>Mini game description</p> 
     * @return MNPDesc <p>Mini game description</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini game description</p>
     * @param MNPDesc <p>Mini game description</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Developer</p> 
     * @return CreateUser <p>Developer</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Developer</p>
     * @param CreateUser <p>Developer</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get <p>Developer creation time</p> 
     * @return CreateTime <p>Developer creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Developer creation time</p>
     * @param CreateTime <p>Developer creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Mini game version</p> 
     * @return MNPVersion <p>Mini game version</p>
     */
    public String getMNPVersion() {
        return this.MNPVersion;
    }

    /**
     * Set <p>Mini game version</p>
     * @param MNPVersion <p>Mini game version</p>
     */
    public void setMNPVersion(String MNPVersion) {
        this.MNPVersion = MNPVersion;
    }

    /**
     * Get <p>Version feature description</p> 
     * @return MNPVersionIntro <p>Version feature description</p>
     */
    public String getMNPVersionIntro() {
        return this.MNPVersionIntro;
    }

    /**
     * Set <p>Version feature description</p>
     * @param MNPVersionIntro <p>Version feature description</p>
     */
    public void setMNPVersionIntro(String MNPVersionIntro) {
        this.MNPVersionIntro = MNPVersionIntro;
    }

    /**
     * Get <p>Version:</p> Develop, preview, released</p> 
     * @return Phase <p>Version:</p> Develop, preview, released</p>
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>Version:</p> Develop, preview, released</p>
     * @param Phase <p>Version:</p> Develop, preview, released</p>
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get <p>Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p> 
     * @return ApprovalStatus <p>Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set <p>Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     * @param ApprovalStatus <p>Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get <p>Approval number</p> 
     * @return ApprovalNo <p>Approval number</p>
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set <p>Approval number</p>
     * @param ApprovalNo <p>Approval number</p>
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get <p>Whether this is a preview. Valid values: 0: No; 1: Yes</p> 
     * @return ShowCase <p>Whether this is a preview. Valid values: 0: No; 1: Yes</p>
     */
    public Long getShowCase() {
        return this.ShowCase;
    }

    /**
     * Set <p>Whether this is a preview. Valid values: 0: No; 1: Yes</p>
     * @param ShowCase <p>Whether this is a preview. Valid values: 0: No; 1: Yes</p>
     */
    public void setShowCase(Long ShowCase) {
        this.ShowCase = ShowCase;
    }

    /**
     * Get <p>Rollback version number</p> 
     * @return RollbackVersion <p>Rollback version number</p>
     */
    public Long getRollbackVersion() {
        return this.RollbackVersion;
    }

    /**
     * Set <p>Rollback version number</p>
     * @param RollbackVersion <p>Rollback version number</p>
     */
    public void setRollbackVersion(Long RollbackVersion) {
        this.RollbackVersion = RollbackVersion;
    }

    /**
     * Get <p>Available status</p> 
     * @return Status <p>Available status</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Available status</p>
     * @param Status <p>Available status</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Primary status of the current version. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p> 
     * @return VersionCurrentStatus <p>Primary status of the current version. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     */
    public Long getVersionCurrentStatus() {
        return this.VersionCurrentStatus;
    }

    /**
     * Set <p>Primary status of the current version. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     * @param VersionCurrentStatus <p>Primary status of the current version. Valid values: 0: Pending; 1: Processing; 2: Rejected; 3: Approved; 4: Cancelled</p>
     */
    public void setVersionCurrentStatus(Long VersionCurrentStatus) {
        this.VersionCurrentStatus = VersionCurrentStatus;
    }

    public DescribeMNGAllStageVersionsResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGAllStageVersionsResp(DescribeMNGAllStageVersionsResp source) {
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

