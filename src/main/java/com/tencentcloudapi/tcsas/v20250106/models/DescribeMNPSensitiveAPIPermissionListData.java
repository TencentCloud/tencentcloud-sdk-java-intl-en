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

public class DescribeMNPSensitiveAPIPermissionListData extends AbstractModel {

    /**
    * API ID
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
    * API request method
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * API status.
    */
    @SerializedName("APIStatus")
    @Expose
    private Long APIStatus;

    /**
    * API application status.
    */
    @SerializedName("APIApplyStatus")
    @Expose
    private Long APIApplyStatus;

    /**
    * Reason for rejection.
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * Approval ID
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Specifies the application icon.
    */
    @SerializedName("ApplicationIcon")
    @Expose
    private String ApplicationIcon;

    /**
    * Application name
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

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
     * Get API ID 
     * @return APIId API ID
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API ID
     * @param APIId API ID
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
     * Get API status. 
     * @return APIStatus API status.
     */
    public Long getAPIStatus() {
        return this.APIStatus;
    }

    /**
     * Set API status.
     * @param APIStatus API status.
     */
    public void setAPIStatus(Long APIStatus) {
        this.APIStatus = APIStatus;
    }

    /**
     * Get API application status. 
     * @return APIApplyStatus API application status.
     */
    public Long getAPIApplyStatus() {
        return this.APIApplyStatus;
    }

    /**
     * Set API application status.
     * @param APIApplyStatus API application status.
     */
    public void setAPIApplyStatus(Long APIApplyStatus) {
        this.APIApplyStatus = APIApplyStatus;
    }

    /**
     * Get Reason for rejection. 
     * @return RejectReason Reason for rejection.
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set Reason for rejection.
     * @param RejectReason Reason for rejection.
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
    }

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
     * Get Specifies the application icon. 
     * @return ApplicationIcon Specifies the application icon.
     */
    public String getApplicationIcon() {
        return this.ApplicationIcon;
    }

    /**
     * Set Specifies the application icon.
     * @param ApplicationIcon Specifies the application icon.
     */
    public void setApplicationIcon(String ApplicationIcon) {
        this.ApplicationIcon = ApplicationIcon;
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

    public DescribeMNPSensitiveAPIPermissionListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSensitiveAPIPermissionListData(DescribeMNPSensitiveAPIPermissionListData source) {
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.APIName != null) {
            this.APIName = new String(source.APIName);
        }
        if (source.APIMethod != null) {
            this.APIMethod = new String(source.APIMethod);
        }
        if (source.APIStatus != null) {
            this.APIStatus = new Long(source.APIStatus);
        }
        if (source.APIApplyStatus != null) {
            this.APIApplyStatus = new Long(source.APIApplyStatus);
        }
        if (source.RejectReason != null) {
            this.RejectReason = new String(source.RejectReason);
        }
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationIcon != null) {
            this.ApplicationIcon = new String(source.ApplicationIcon);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
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
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "APIName", this.APIName);
        this.setParamSimple(map, prefix + "APIMethod", this.APIMethod);
        this.setParamSimple(map, prefix + "APIStatus", this.APIStatus);
        this.setParamSimple(map, prefix + "APIApplyStatus", this.APIApplyStatus);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationIcon", this.ApplicationIcon);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "APIType", this.APIType);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);

    }
}

