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

public class DescribeMNPSensitiveAPIPermissionApprovalData extends AbstractModel {

    /**
    * API ID
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API method.
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * Reason for application
    */
    @SerializedName("ApplyReason")
    @Expose
    private String ApplyReason;

    /**
    * Reason for rejection.
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * Approval status. valid values: 20 (rejected), 30 (approved).
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * API feature description.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * API type. 1: system; 2: custom.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

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
     * Get Reason for application 
     * @return ApplyReason Reason for application
     */
    public String getApplyReason() {
        return this.ApplyReason;
    }

    /**
     * Set Reason for application
     * @param ApplyReason Reason for application
     */
    public void setApplyReason(String ApplyReason) {
        this.ApplyReason = ApplyReason;
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
     * Get Approval status. valid values: 20 (rejected), 30 (approved). 
     * @return ApprovalStatus Approval status. valid values: 20 (rejected), 30 (approved).
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set Approval status. valid values: 20 (rejected), 30 (approved).
     * @param ApprovalStatus Approval status. valid values: 20 (rejected), 30 (approved).
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
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

    public DescribeMNPSensitiveAPIPermissionApprovalData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSensitiveAPIPermissionApprovalData(DescribeMNPSensitiveAPIPermissionApprovalData source) {
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.APIMethod != null) {
            this.APIMethod = new String(source.APIMethod);
        }
        if (source.ApplyReason != null) {
            this.ApplyReason = new String(source.ApplyReason);
        }
        if (source.RejectReason != null) {
            this.RejectReason = new String(source.RejectReason);
        }
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.APIDesc != null) {
            this.APIDesc = new String(source.APIDesc);
        }
        if (source.APIType != null) {
            this.APIType = new Long(source.APIType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "APIMethod", this.APIMethod);
        this.setParamSimple(map, prefix + "ApplyReason", this.ApplyReason);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);
        this.setParamSimple(map, prefix + "APIType", this.APIType);

    }
}

