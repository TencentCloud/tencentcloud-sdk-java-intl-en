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

public class DescribeMNPSensitiveAPIPermissionApprovalListData extends AbstractModel {

    /**
    * Approval number.
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Sensitive API ID.
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API name.
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API method.
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * Mini program appid.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

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
    * Application note.
    */
    @SerializedName("ApplyNote")
    @Expose
    private String ApplyNote;

    /**
    * Approval status. Valid values: 1: Processing; 20: Rejected; 30: Approved.
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

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
    * Superapp ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

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
    * API type. Valid values: 1: System; 2: Custom.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * API feature description.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

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
     * Get Sensitive API ID. 
     * @return APIId Sensitive API ID.
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set Sensitive API ID.
     * @param APIId Sensitive API ID.
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API name. 
     * @return APIName API name.
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name.
     * @param APIName API name.
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API method. 
     * @return APIMethod API method.
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API method.
     * @param APIMethod API method.
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
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
     * Get Application note. 
     * @return ApplyNote Application note.
     */
    public String getApplyNote() {
        return this.ApplyNote;
    }

    /**
     * Set Application note.
     * @param ApplyNote Application note.
     */
    public void setApplyNote(String ApplyNote) {
        this.ApplyNote = ApplyNote;
    }

    /**
     * Get Approval status. Valid values: 1: Processing; 20: Rejected; 30: Approved. 
     * @return ApprovalStatus Approval status. Valid values: 1: Processing; 20: Rejected; 30: Approved.
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status. Valid values: 1: Processing; 20: Rejected; 30: Approved.
     * @param ApprovalStatus Approval status. Valid values: 1: Processing; 20: Rejected; 30: Approved.
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
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
     * Get API type. Valid values: 1: System; 2: Custom. 
     * @return APIType API type. Valid values: 1: System; 2: Custom.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. Valid values: 1: System; 2: Custom.
     * @param APIType API type. Valid values: 1: System; 2: Custom.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get API feature description. 
     * @return APIDesc API feature description.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API feature description.
     * @param APIDesc API feature description.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    public DescribeMNPSensitiveAPIPermissionApprovalListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSensitiveAPIPermissionApprovalListData(DescribeMNPSensitiveAPIPermissionApprovalListData source) {
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.APIName != null) {
            this.APIName = new String(source.APIName);
        }
        if (source.APIMethod != null) {
            this.APIMethod = new String(source.APIMethod);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.ApplyUser != null) {
            this.ApplyUser = new String(source.ApplyUser);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.ApplyNote != null) {
            this.ApplyNote = new String(source.ApplyNote);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationLogo != null) {
            this.ApplicationLogo = new String(source.ApplicationLogo);
        }
        if (source.APIType != null) {
            this.APIType = new Long(source.APIType);
        }
        if (source.APIDesc != null) {
            this.APIDesc = new String(source.APIDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "APIName", this.APIName);
        this.setParamSimple(map, prefix + "APIMethod", this.APIMethod);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "ApplyUser", this.ApplyUser);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ApplyNote", this.ApplyNote);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ApprovalUser", this.ApprovalUser);
        this.setParamSimple(map, prefix + "ApprovalTime", this.ApprovalTime);
        this.setParamSimple(map, prefix + "ApprovalNote", this.ApprovalNote);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationLogo", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "APIType", this.APIType);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);

    }
}

