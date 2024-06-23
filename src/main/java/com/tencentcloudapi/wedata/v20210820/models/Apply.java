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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Apply extends AbstractModel {

    /**
    * Applicant ID
    */
    @SerializedName("ApplicantId")
    @Expose
    private String ApplicantId;

    /**
    * Applicant Name
    */
    @SerializedName("ApplicantName")
    @Expose
    private String ApplicantName;

    /**
    * Approval Remarks
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Approval Category Key
    */
    @SerializedName("ApproveClassification")
    @Expose
    private String ApproveClassification;

    /**
    * Approval Form ID
    */
    @SerializedName("ApproveId")
    @Expose
    private String ApproveId;

    /**
    * Approval Type Key
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * Application Reason
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Approval Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * Approval Category Name
    */
    @SerializedName("ApproveClassificationName")
    @Expose
    private String ApproveClassificationName;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Approval Type Name
    */
    @SerializedName("ApproveTypeName")
    @Expose
    private String ApproveTypeName;

    /**
    * Approval Exception or Failure Information
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Apply for Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * Approver ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ApproverId")
    @Expose
    private String ApproverId;

    /**
    * Approver Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * Project for Approval
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ApproveProjectName")
    @Expose
    private String ApproveProjectName;

    /**
     * Get Applicant ID 
     * @return ApplicantId Applicant ID
     */
    public String getApplicantId() {
        return this.ApplicantId;
    }

    /**
     * Set Applicant ID
     * @param ApplicantId Applicant ID
     */
    public void setApplicantId(String ApplicantId) {
        this.ApplicantId = ApplicantId;
    }

    /**
     * Get Applicant Name 
     * @return ApplicantName Applicant Name
     */
    public String getApplicantName() {
        return this.ApplicantName;
    }

    /**
     * Set Applicant Name
     * @param ApplicantName Applicant Name
     */
    public void setApplicantName(String ApplicantName) {
        this.ApplicantName = ApplicantName;
    }

    /**
     * Get Approval Remarks
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Remark Approval Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Approval Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Remark Approval Remarks
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Approval Category Key 
     * @return ApproveClassification Approval Category Key
     */
    public String getApproveClassification() {
        return this.ApproveClassification;
    }

    /**
     * Set Approval Category Key
     * @param ApproveClassification Approval Category Key
     */
    public void setApproveClassification(String ApproveClassification) {
        this.ApproveClassification = ApproveClassification;
    }

    /**
     * Get Approval Form ID 
     * @return ApproveId Approval Form ID
     */
    public String getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set Approval Form ID
     * @param ApproveId Approval Form ID
     */
    public void setApproveId(String ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get Approval Type Key 
     * @return ApproveType Approval Type Key
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set Approval Type Key
     * @param ApproveType Approval Type Key
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get Application Reason
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Reason Application Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Application Reason
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Reason Application Reason
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Creation Time 
     * @return CreateTime Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation Time
     * @param CreateTime Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Approval Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ApproveTime Approval Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set Approval Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ApproveTime Approval Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get Approval Category Name 
     * @return ApproveClassificationName Approval Category Name
     */
    public String getApproveClassificationName() {
        return this.ApproveClassificationName;
    }

    /**
     * Set Approval Category Name
     * @param ApproveClassificationName Approval Category Name
     */
    public void setApproveClassificationName(String ApproveClassificationName) {
        this.ApproveClassificationName = ApproveClassificationName;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Approval Type Name 
     * @return ApproveTypeName Approval Type Name
     */
    public String getApproveTypeName() {
        return this.ApproveTypeName;
    }

    /**
     * Set Approval Type Name
     * @param ApproveTypeName Approval Type Name
     */
    public void setApproveTypeName(String ApproveTypeName) {
        this.ApproveTypeName = ApproveTypeName;
    }

    /**
     * Get Approval Exception or Failure Information 
     * @return ErrorMessage Approval Exception or Failure Information
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Approval Exception or Failure Information
     * @param ErrorMessage Approval Exception or Failure Information
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Apply for Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ApplyName Apply for Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set Apply for Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ApplyName Apply for Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get Approver ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ApproverId Approver ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getApproverId() {
        return this.ApproverId;
    }

    /**
     * Set Approver ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ApproverId Approver ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setApproverId(String ApproverId) {
        this.ApproverId = ApproverId;
    }

    /**
     * Get Approver Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ApproverName Approver Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set Approver Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ApproverName Approver Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get Project for Approval
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ApproveProjectName Project for Approval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getApproveProjectName() {
        return this.ApproveProjectName;
    }

    /**
     * Set Project for Approval
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ApproveProjectName Project for Approval
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setApproveProjectName(String ApproveProjectName) {
        this.ApproveProjectName = ApproveProjectName;
    }

    public Apply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Apply(Apply source) {
        if (source.ApplicantId != null) {
            this.ApplicantId = new String(source.ApplicantId);
        }
        if (source.ApplicantName != null) {
            this.ApplicantName = new String(source.ApplicantName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ApproveClassification != null) {
            this.ApproveClassification = new String(source.ApproveClassification);
        }
        if (source.ApproveId != null) {
            this.ApproveId = new String(source.ApproveId);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new String(source.ApproveType);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.ApproveClassificationName != null) {
            this.ApproveClassificationName = new String(source.ApproveClassificationName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApproveTypeName != null) {
            this.ApproveTypeName = new String(source.ApproveTypeName);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.ApproverId != null) {
            this.ApproverId = new String(source.ApproverId);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproveProjectName != null) {
            this.ApproveProjectName = new String(source.ApproveProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicantId", this.ApplicantId);
        this.setParamSimple(map, prefix + "ApplicantName", this.ApplicantName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ApproveClassification", this.ApproveClassification);
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveClassificationName", this.ApproveClassificationName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveTypeName", this.ApproveTypeName);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "ApproverId", this.ApproverId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproveProjectName", this.ApproveProjectName);

    }
}

