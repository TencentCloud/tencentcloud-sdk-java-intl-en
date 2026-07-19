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

public class ApproveMNPPaymentEnableRequest extends AbstractModel {

    /**
    * <p>Platform ID.</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Approval number.</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
    * <p>Approval status. Valid values: 10: Approved; 20: Rejected.</p>
    */
    @SerializedName("ApprovalType")
    @Expose
    private Long ApprovalType;

    /**
    * <p>Approval note.</p>
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
     * Get <p>Platform ID.</p> 
     * @return PlatformId <p>Platform ID.</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID.</p>
     * @param PlatformId <p>Platform ID.</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Approval number.</p> 
     * @return ApprovalNo <p>Approval number.</p>
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set <p>Approval number.</p>
     * @param ApprovalNo <p>Approval number.</p>
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    /**
     * Get <p>Approval status. Valid values: 10: Approved; 20: Rejected.</p> 
     * @return ApprovalType <p>Approval status. Valid values: 10: Approved; 20: Rejected.</p>
     */
    public Long getApprovalType() {
        return this.ApprovalType;
    }

    /**
     * Set <p>Approval status. Valid values: 10: Approved; 20: Rejected.</p>
     * @param ApprovalType <p>Approval status. Valid values: 10: Approved; 20: Rejected.</p>
     */
    public void setApprovalType(Long ApprovalType) {
        this.ApprovalType = ApprovalType;
    }

    /**
     * Get <p>Approval note.</p> 
     * @return ApprovalNote <p>Approval note.</p>
     */
    public String getApprovalNote() {
        return this.ApprovalNote;
    }

    /**
     * Set <p>Approval note.</p>
     * @param ApprovalNote <p>Approval note.</p>
     */
    public void setApprovalNote(String ApprovalNote) {
        this.ApprovalNote = ApprovalNote;
    }

    public ApproveMNPPaymentEnableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveMNPPaymentEnableRequest(ApproveMNPPaymentEnableRequest source) {
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
        if (source.ApprovalType != null) {
            this.ApprovalType = new Long(source.ApprovalType);
        }
        if (source.ApprovalNote != null) {
            this.ApprovalNote = new String(source.ApprovalNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);
        this.setParamSimple(map, prefix + "ApprovalType", this.ApprovalType);
        this.setParamSimple(map, prefix + "ApprovalNote", this.ApprovalNote);

    }
}

