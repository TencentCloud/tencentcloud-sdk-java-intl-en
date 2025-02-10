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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproveClientApplyRequest extends AbstractModel {

    /**
    * Sub-customer uin.
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Approval type. only supports pass and reject.
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * Reason for rejection. required only when approvetype is reject.
    */
    @SerializedName("RejectReason")
    @Expose
    private String RejectReason;

    /**
     * Get Sub-customer uin. 
     * @return ClientUin Sub-customer uin.
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Sub-customer uin.
     * @param ClientUin Sub-customer uin.
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Approval type. only supports pass and reject. 
     * @return ApproveType Approval type. only supports pass and reject.
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set Approval type. only supports pass and reject.
     * @param ApproveType Approval type. only supports pass and reject.
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get Reason for rejection. required only when approvetype is reject. 
     * @return RejectReason Reason for rejection. required only when approvetype is reject.
     */
    public String getRejectReason() {
        return this.RejectReason;
    }

    /**
     * Set Reason for rejection. required only when approvetype is reject.
     * @param RejectReason Reason for rejection. required only when approvetype is reject.
     */
    public void setRejectReason(String RejectReason) {
        this.RejectReason = RejectReason;
    }

    public ApproveClientApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproveClientApplyRequest(ApproveClientApplyRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new String(source.ApproveType);
        }
        if (source.RejectReason != null) {
            this.RejectReason = new String(source.RejectReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);
        this.setParamSimple(map, prefix + "RejectReason", this.RejectReason);

    }
}

