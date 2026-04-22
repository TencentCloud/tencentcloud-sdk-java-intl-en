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

public class DescribeMNGSensitiveAPIPermissionApprovalData extends AbstractModel {

    /**
    * <p>API ID</p>
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * <p>API method</p>
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * <p>Reason for request</p>
    */
    @SerializedName("ApplyReason")
    @Expose
    private String ApplyReason;

    /**
    * <p>Reason for rejection</p>
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * <p>Approval status. 20: Rejected; 30: Approved</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>API feature description</p>
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * <p>API type. Valid values: 1: System; 2: Custom</p>
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

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
     * Get <p>Reason for request</p> 
     * @return ApplyReason <p>Reason for request</p>
     */
    public String getApplyReason() {
        return this.ApplyReason;
    }

    /**
     * Set <p>Reason for request</p>
     * @param ApplyReason <p>Reason for request</p>
     */
    public void setApplyReason(String ApplyReason) {
        this.ApplyReason = ApplyReason;
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
     * Get <p>Approval status. 20: Rejected; 30: Approved</p> 
     * @return ApprovalStatus <p>Approval status. 20: Rejected; 30: Approved</p>
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set <p>Approval status. 20: Rejected; 30: Approved</p>
     * @param ApprovalStatus <p>Approval status. 20: Rejected; 30: Approved</p>
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
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

    /**
     * Get <p>API type. Valid values: 1: System; 2: Custom</p> 
     * @return APIType <p>API type. Valid values: 1: System; 2: Custom</p>
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set <p>API type. Valid values: 1: System; 2: Custom</p>
     * @param APIType <p>API type. Valid values: 1: System; 2: Custom</p>
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    public DescribeMNGSensitiveAPIPermissionApprovalData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSensitiveAPIPermissionApprovalData(DescribeMNGSensitiveAPIPermissionApprovalData source) {
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

