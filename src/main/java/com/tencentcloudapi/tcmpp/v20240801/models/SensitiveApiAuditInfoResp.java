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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SensitiveApiAuditInfoResp extends AbstractModel {

    /**
    * Approval ticket ID
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * Approval ticket ID
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * API name
    */
    @SerializedName("ApiName")
    @Expose
    private String ApiName;

    /**
    * API request method
    */
    @SerializedName("ApiMethod")
    @Expose
    private String ApiMethod;

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
    * Approval status
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Approver
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditUser")
    @Expose
    private String AuditUser;

    /**
    * Approval time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditTime")
    @Expose
    private String AuditTime;

    /**
    * Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditNote")
    @Expose
    private String AuditNote;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * The application name.
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
    * API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiType")
    @Expose
    private Long ApiType;

    /**
    * API function description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApiDesc")
    @Expose
    private String ApiDesc;

    /**
     * Get Approval ticket ID 
     * @return AuditNo Approval ticket ID
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set Approval ticket ID
     * @param AuditNo Approval ticket ID
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
    }

    /**
     * Get Approval ticket ID 
     * @return ApiId Approval ticket ID
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set Approval ticket ID
     * @param ApiId Approval ticket ID
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get API name 
     * @return ApiName API name
     */
    public String getApiName() {
        return this.ApiName;
    }

    /**
     * Set API name
     * @param ApiName API name
     */
    public void setApiName(String ApiName) {
        this.ApiName = ApiName;
    }

    /**
     * Get API request method 
     * @return ApiMethod API request method
     */
    public String getApiMethod() {
        return this.ApiMethod;
    }

    /**
     * Set API request method
     * @param ApiMethod API request method
     */
    public void setApiMethod(String ApiMethod) {
        this.ApiMethod = ApiMethod;
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
     * Get Approval status 
     * @return AuditStatus Approval status
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Approval status
     * @param AuditStatus Approval status
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Approver
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditUser Approver
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuditUser() {
        return this.AuditUser;
    }

    /**
     * Set Approver
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditUser Approver
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditUser(String AuditUser) {
        this.AuditUser = AuditUser;
    }

    /**
     * Get Approval time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditTime Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuditTime() {
        return this.AuditTime;
    }

    /**
     * Set Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditTime Approval time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditTime(String AuditTime) {
        this.AuditTime = AuditTime;
    }

    /**
     * Get Approval notes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditNote Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuditNote() {
        return this.AuditNote;
    }

    /**
     * Set Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditNote Approval notes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditNote(String AuditNote) {
        this.AuditNote = AuditNote;
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
     * Get The application name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set The application name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName The application name.
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
     * Get API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getApiType() {
        return this.ApiType;
    }

    /**
     * Set API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiType(Long ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get API function description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApiDesc API function description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApiDesc() {
        return this.ApiDesc;
    }

    /**
     * Set API function description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApiDesc API function description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApiDesc(String ApiDesc) {
        this.ApiDesc = ApiDesc;
    }

    public SensitiveApiAuditInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SensitiveApiAuditInfoResp(SensitiveApiAuditInfoResp source) {
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
        }
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.ApiName != null) {
            this.ApiName = new String(source.ApiName);
        }
        if (source.ApiMethod != null) {
            this.ApiMethod = new String(source.ApiMethod);
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
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.AuditUser != null) {
            this.AuditUser = new String(source.AuditUser);
        }
        if (source.AuditTime != null) {
            this.AuditTime = new String(source.AuditTime);
        }
        if (source.AuditNote != null) {
            this.AuditNote = new String(source.AuditNote);
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
        if (source.ApiType != null) {
            this.ApiType = new Long(source.ApiType);
        }
        if (source.ApiDesc != null) {
            this.ApiDesc = new String(source.ApiDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "ApiName", this.ApiName);
        this.setParamSimple(map, prefix + "ApiMethod", this.ApiMethod);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "ApplyUser", this.ApplyUser);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ApplyNote", this.ApplyNote);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "AuditUser", this.AuditUser);
        this.setParamSimple(map, prefix + "AuditTime", this.AuditTime);
        this.setParamSimple(map, prefix + "AuditNote", this.AuditNote);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationLogo", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "ApiDesc", this.ApiDesc);

    }
}

