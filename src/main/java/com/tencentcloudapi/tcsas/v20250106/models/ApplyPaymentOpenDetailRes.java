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

public class ApplyPaymentOpenDetailRes extends AbstractModel {

    /**
    * <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
    */
    @SerializedName("ApprovalStatus")
    @Expose
    private Long ApprovalStatus;

    /**
    * <p>Application time.</p><p>Unit: Milliseconds.</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private Long ApplyTime;

    /**
    * <p>Approval time.</p><p>Unit: milliseconds.</p>
    */
    @SerializedName("ApprovalTime")
    @Expose
    private Long ApprovalTime;

    /**
    * <p>Approval note.</p>
    */
    @SerializedName("ApprovalNote")
    @Expose
    private String ApprovalNote;

    /**
    * <p>Specifies whether to display the approval records. Valid values: 0: No; 1: Yes.</p>
    */
    @SerializedName("ApprovalShow")
    @Expose
    private Long ApprovalShow;

    /**
    * <p>Specifies whether the activation of mini program payment can be requested again. Valid values: 0: No; 1: Yes.</p>
    */
    @SerializedName("ApplyShow")
    @Expose
    private Long ApplyShow;

    /**
     * Get <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p> 
     * @return ApprovalStatus <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     */
    public Long getApprovalStatus() {
        return this.ApprovalStatus;
    }

    /**
     * Set <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     * @param ApprovalStatus <p>Approval status. Valid values: 0: In progress; 10: Approved; 20: Rejected.</p>
     */
    public void setApprovalStatus(Long ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    /**
     * Get <p>Application time.</p><p>Unit: Milliseconds.</p> 
     * @return ApplyTime <p>Application time.</p><p>Unit: Milliseconds.</p>
     */
    public Long getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>Application time.</p><p>Unit: Milliseconds.</p>
     * @param ApplyTime <p>Application time.</p><p>Unit: Milliseconds.</p>
     */
    public void setApplyTime(Long ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>Approval time.</p><p>Unit: milliseconds.</p> 
     * @return ApprovalTime <p>Approval time.</p><p>Unit: milliseconds.</p>
     */
    public Long getApprovalTime() {
        return this.ApprovalTime;
    }

    /**
     * Set <p>Approval time.</p><p>Unit: milliseconds.</p>
     * @param ApprovalTime <p>Approval time.</p><p>Unit: milliseconds.</p>
     */
    public void setApprovalTime(Long ApprovalTime) {
        this.ApprovalTime = ApprovalTime;
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

    /**
     * Get <p>Specifies whether to display the approval records. Valid values: 0: No; 1: Yes.</p> 
     * @return ApprovalShow <p>Specifies whether to display the approval records. Valid values: 0: No; 1: Yes.</p>
     */
    public Long getApprovalShow() {
        return this.ApprovalShow;
    }

    /**
     * Set <p>Specifies whether to display the approval records. Valid values: 0: No; 1: Yes.</p>
     * @param ApprovalShow <p>Specifies whether to display the approval records. Valid values: 0: No; 1: Yes.</p>
     */
    public void setApprovalShow(Long ApprovalShow) {
        this.ApprovalShow = ApprovalShow;
    }

    /**
     * Get <p>Specifies whether the activation of mini program payment can be requested again. Valid values: 0: No; 1: Yes.</p> 
     * @return ApplyShow <p>Specifies whether the activation of mini program payment can be requested again. Valid values: 0: No; 1: Yes.</p>
     */
    public Long getApplyShow() {
        return this.ApplyShow;
    }

    /**
     * Set <p>Specifies whether the activation of mini program payment can be requested again. Valid values: 0: No; 1: Yes.</p>
     * @param ApplyShow <p>Specifies whether the activation of mini program payment can be requested again. Valid values: 0: No; 1: Yes.</p>
     */
    public void setApplyShow(Long ApplyShow) {
        this.ApplyShow = ApplyShow;
    }

    public ApplyPaymentOpenDetailRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyPaymentOpenDetailRes(ApplyPaymentOpenDetailRes source) {
        if (source.ApprovalStatus != null) {
            this.ApprovalStatus = new Long(source.ApprovalStatus);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new Long(source.ApplyTime);
        }
        if (source.ApprovalTime != null) {
            this.ApprovalTime = new Long(source.ApprovalTime);
        }
        if (source.ApprovalNote != null) {
            this.ApprovalNote = new String(source.ApprovalNote);
        }
        if (source.ApprovalShow != null) {
            this.ApprovalShow = new Long(source.ApprovalShow);
        }
        if (source.ApplyShow != null) {
            this.ApplyShow = new Long(source.ApplyShow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalStatus", this.ApprovalStatus);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ApprovalTime", this.ApprovalTime);
        this.setParamSimple(map, prefix + "ApprovalNote", this.ApprovalNote);
        this.setParamSimple(map, prefix + "ApprovalShow", this.ApprovalShow);
        this.setParamSimple(map, prefix + "ApplyShow", this.ApplyShow);

    }
}

