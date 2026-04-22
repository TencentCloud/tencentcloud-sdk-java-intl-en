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

public class DescribeMNGSensitiveAPIPermissionListData extends AbstractModel {

    /**
    * <p>API ID</p>
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * <p>API name</p>
    */
    @SerializedName("APIName")
    @Expose
    private String APIName;

    /**
    * <p>API method</p>
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * <p>API status</p>
    */
    @SerializedName("APIStatus")
    @Expose
    private Long APIStatus;

    /**
    * <p>API request status</p>
    */
    @SerializedName("APIApplyStatus")
    @Expose
    private Long APIApplyStatus;

    /**
    * <p>Reason for rejection</p>
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * <p>Approval number</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * <p>Superapp ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Superapp icon</p>
    */
    @SerializedName("ApplicationIcon")
    @Expose
    private String ApplicationIcon;

    /**
    * <p>Superapp name</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>API type. Valid values: 1: System; 2: Custom
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

    /**
    * <p>API feature description</p>
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
     * Get <p>API ID</p> 
     * @return APIId <p>API ID</p>
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set <p>API ID</p>
     * @param APIId <p>API ID</p>
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get <p>API name</p> 
     * @return APIName <p>API name</p>
     */
    public String getAPIName() {
        return this.APIName;
    }

    /**
     * Set <p>API name</p>
     * @param APIName <p>API name</p>
     */
    public void setAPIName(String APIName) {
        this.APIName = APIName;
    }

    /**
     * Get <p>API method</p> 
     * @return APIMethod <p>API method</p>
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set <p>API method</p>
     * @param APIMethod <p>API method</p>
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get <p>API status</p> 
     * @return APIStatus <p>API status</p>
     */
    public Long getAPIStatus() {
        return this.APIStatus;
    }

    /**
     * Set <p>API status</p>
     * @param APIStatus <p>API status</p>
     */
    public void setAPIStatus(Long APIStatus) {
        this.APIStatus = APIStatus;
    }

    /**
     * Get <p>API request status</p> 
     * @return APIApplyStatus <p>API request status</p>
     */
    public Long getAPIApplyStatus() {
        return this.APIApplyStatus;
    }

    /**
     * Set <p>API request status</p>
     * @param APIApplyStatus <p>API request status</p>
     */
    public void setAPIApplyStatus(Long APIApplyStatus) {
        this.APIApplyStatus = APIApplyStatus;
    }

    /**
     * Get <p>Reason for rejection</p> 
     * @return RejectReason <p>Reason for rejection</p>
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set <p>Reason for rejection</p>
     * @param RejectReason <p>Reason for rejection</p>
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
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
     * Get <p>Superapp ID</p> 
     * @return ApplicationId <p>Superapp ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID</p>
     * @param ApplicationId <p>Superapp ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Superapp icon</p> 
     * @return ApplicationIcon <p>Superapp icon</p>
     */
    public String getApplicationIcon() {
        return this.ApplicationIcon;
    }

    /**
     * Set <p>Superapp icon</p>
     * @param ApplicationIcon <p>Superapp icon</p>
     */
    public void setApplicationIcon(String ApplicationIcon) {
        this.ApplicationIcon = ApplicationIcon;
    }

    /**
     * Get <p>Superapp name</p> 
     * @return ApplicationName <p>Superapp name</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name</p>
     * @param ApplicationName <p>Superapp name</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>API type. Valid values: 1: System; 2: Custom 
     * @return APIType <p>API type. Valid values: 1: System; 2: Custom
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set <p>API type. Valid values: 1: System; 2: Custom
     * @param APIType <p>API type. Valid values: 1: System; 2: Custom
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    /**
     * Get <p>API feature description</p> 
     * @return APIDesc <p>API feature description</p>
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set <p>API feature description</p>
     * @param APIDesc <p>API feature description</p>
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    public DescribeMNGSensitiveAPIPermissionListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSensitiveAPIPermissionListData(DescribeMNGSensitiveAPIPermissionListData source) {
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

