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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSensitiveApiApplyDetail extends AbstractModel {

    /**
    * API ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * API request method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIMethod")
    @Expose
    private String APIMethod;

    /**
    * Reason for application
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplyReason")
    @Expose
    private String ApplyReason;

    /**
    * Reason for rejection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
    * Approval status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * API function description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIDesc")
    @Expose
    private String APIDesc;

    /**
    * API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("APIType")
    @Expose
    private Long APIType;

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
     * Get API request method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIMethod API request method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIMethod() {
        return this.APIMethod;
    }

    /**
     * Set API request method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIMethod API request method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIMethod(String APIMethod) {
        this.APIMethod = APIMethod;
    }

    /**
     * Get Reason for application
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplyReason Reason for application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplyReason() {
        return this.ApplyReason;
    }

    /**
     * Set Reason for application
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplyReason Reason for application
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplyReason(String ApplyReason) {
        this.ApplyReason = ApplyReason;
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
     * Get Approval status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuditStatus Approval status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Approval status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuditStatus Approval status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get API function description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIDesc API function description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAPIDesc() {
        return this.APIDesc;
    }

    /**
     * Set API function description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIDesc API function description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIDesc(String APIDesc) {
        this.APIDesc = APIDesc;
    }

    /**
     * Get API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAPIType() {
        return this.APIType;
    }

    /**
     * Set API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param APIType API type. 1: System; 2: Custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAPIType(Long APIType) {
        this.APIType = APIType;
    }

    public DescribeSensitiveApiApplyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSensitiveApiApplyDetail(DescribeSensitiveApiApplyDetail source) {
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
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
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
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "APIDesc", this.APIDesc);
        this.setParamSimple(map, prefix + "APIType", this.APIType);

    }
}

