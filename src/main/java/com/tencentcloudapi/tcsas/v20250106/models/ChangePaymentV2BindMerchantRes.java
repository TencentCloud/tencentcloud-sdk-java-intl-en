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

public class ChangePaymentV2BindMerchantRes extends AbstractModel {

    /**
    * <p>API response result. Valid values: true: Operation succeeded; false: Operation failed.</p>
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * <p>Approval number. Used for the API where the superapp approves the merchant binding of a mini program team.</p>
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
     * Get <p>API response result. Valid values: true: Operation succeeded; false: Operation failed.</p> 
     * @return Result <p>API response result. Valid values: true: Operation succeeded; false: Operation failed.</p>
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set <p>API response result. Valid values: true: Operation succeeded; false: Operation failed.</p>
     * @param Result <p>API response result. Valid values: true: Operation succeeded; false: Operation failed.</p>
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get <p>Approval number. Used for the API where the superapp approves the merchant binding of a mini program team.</p> 
     * @return ApprovalNo <p>Approval number. Used for the API where the superapp approves the merchant binding of a mini program team.</p>
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set <p>Approval number. Used for the API where the superapp approves the merchant binding of a mini program team.</p>
     * @param ApprovalNo <p>Approval number. Used for the API where the superapp approves the merchant binding of a mini program team.</p>
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    public ChangePaymentV2BindMerchantRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChangePaymentV2BindMerchantRes(ChangePaymentV2BindMerchantRes source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.ApprovalNo != null) {
            this.ApprovalNo = new String(source.ApprovalNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ApprovalNo", this.ApprovalNo);

    }
}

