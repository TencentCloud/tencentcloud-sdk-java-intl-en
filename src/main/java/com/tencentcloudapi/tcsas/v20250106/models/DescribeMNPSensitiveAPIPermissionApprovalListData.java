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
    * Approval ID
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Sensitive API ID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API name
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API request method
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * Mini program ID
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Applicant
    */
    @SerializedName("ApplyUser")
    @Expose
    private String ApplyUser;

    /**
    * Application time
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Application notes
    */
    @SerializedName("ApplyNote")
    @Expose
    private String ApplyNote;

    /**
    * Approval status. 1: Processing; 20: Rejected; 30: Approved
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * Specifies the review user.
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
    * Approval notes
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Specifies the application icon.
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private String ApplicationLogo;

    /**
    * API type. 1: system; 2: custom.
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
     * Get Approval ID 
     * @return ApprovalNo Approval ID
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval ID
     * @param ApprovalNo Approval ID
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get Sensitive API ID 
     * @return APIId Sensitive API ID
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set Sensitive API ID
     * @param APIId Sensitive API ID
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API name 
     * @return APIName API name
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name
     * @param APIName API name
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API request method 
     * @return APIMethod API request method
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API request method
     * @param APIMethod API request method
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get Mini program ID 
     * @return MNPId Mini program ID
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
     * @param MNPId Mini program ID
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
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
     * Get Applicant 
     * @return ApplyUser Applicant
     */
    public String getApplyUser() {
        return this.ApplyUser;
    }

    /**
     * Set Applicant
     * @param ApplyUser Applicant
     */
    public void setApplyUser(String ApplyUser) {
        this.ApplyUser = ApplyUser;
    }

    /**
     * Get Application time 
     * @return ApplyTime Application time
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time
     * @param ApplyTime Application time
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Application notes 
     * @return ApplyNote Application notes
     */
    public String getApplyNote() {
        return this.ApplyNote;
    }

    /**
     * Set Application notes
     * @param ApplyNote Application notes
     */
    public void setApplyNote(String ApplyNote) {
        this.ApplyNote = ApplyNote;
    }

    /**
     * Get Approval status. 1: Processing; 20: Rejected; 30: Approved 
     * @return ApprovalStatus Approval status. 1: Processing; 20: Rejected; 30: Approved
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status. 1: Processing; 20: Rejected; 30: Approved
     * @param ApprovalStatus Approval status. 1: Processing; 20: Rejected; 30: Approved
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get Specifies the review user. 
     * @return ApprovalUser Specifies the review user.
     */
    public String getApprovalUser() {
        return this.ApprovalUser;
    }

    /**
     * Set Specifies the review user.
     * @param ApprovalUser Specifies the review user.
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
     * Get Approval notes 
     * @return ApprovalNote Approval notes
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set Approval notes
     * @param ApprovalNote Approval notes
     */
    public void setApprovalNote(String ApprovalNote) {
        this.ApprovalNote = ApprovalNote;
    }

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name 
     * @return ApplicationName Application name
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
     * @param ApplicationName Application name
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Specifies the application icon. 
     * @return ApplicationLogo Specifies the application icon.
     */
    public String getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set Specifies the application icon.
     * @param ApplicationLogo Specifies the application icon.
     */
    public void setApplicationLogo(String ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get API type. 1: system; 2: custom. 
     * @return APIType API type. 1: system; 2: custom.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. 1: system; 2: custom.
     * @param APIType API type. 1: system; 2: custom.
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

