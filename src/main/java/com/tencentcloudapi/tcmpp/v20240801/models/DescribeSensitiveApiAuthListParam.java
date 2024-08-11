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

public class DescribeSensitiveApiAuthListParam extends AbstractModel {

    /**
    * API ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * API method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * API status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIStatus")
    @Expose
    private Long APIStatus;

    /**
    * API application status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIApplyStatus")
    @Expose
    private Long APIApplyStatus;

    /**
    * Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditNo")
    @Expose
    private String AuditNo;

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationIcon")
    @Expose
    private String ApplicationIcon;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * API type 1 - System API 2 - Custom API
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * API feature description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
     * Get API ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIId API ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set API ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIId API ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get API name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set API name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIName API name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get API method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIMethod API method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIMethod API method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get API status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIStatus API status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIStatus() {
        return this.APIStatus;
    }

    /**
     * Set API status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIStatus API status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIStatus(Long APIStatus) {
        this.APIStatus = APIStatus;
    }

    /**
     * Get API application status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIApplyStatus API application status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIApplyStatus() {
        return this.APIApplyStatus;
    }

    /**
     * Set API application status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIApplyStatus API application status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIApplyStatus(Long APIApplyStatus) {
        this.APIApplyStatus = APIApplyStatus;
    }

    /**
     * Get Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RejectReason Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RejectReason Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
    }

    /**
     * Get Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditNo Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuditNo() {
        return this.AuditNo;
    }

    /**
     * Set Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditNo Approval ticket ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditNo(String AuditNo) {
        this.AuditNo = AuditNo;
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
     * Get Application icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationIcon Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationIcon() {
        return this.ApplicationIcon;
    }

    /**
     * Set Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationIcon Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationIcon(String ApplicationIcon) {
        this.ApplicationIcon = ApplicationIcon;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get API type 1 - System API 2 - Custom API
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIType API type 1 - System API 2 - Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type 1 - System API 2 - Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIType API type 1 - System API 2 - Custom API
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get API feature description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIDesc API feature description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API feature description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIDesc API feature description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    public DescribeSensitiveApiAuthListParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSensitiveApiAuthListParam(DescribeSensitiveApiAuthListParam source) {
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
        if (source.AuditNo != null) {
            this.AuditNo = new String(source.AuditNo);
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
        this.setParamSimple(map, prefix + "AuditNo", this.AuditNo);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationIcon", this.ApplicationIcon);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "APIType", this.APIType);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);

    }
}

