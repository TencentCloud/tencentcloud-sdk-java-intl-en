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

public class CreateMNPApprovalResp extends AbstractModel {

    /**
    * Bool type response object
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Approval No.
    */
    @SerializedName("ApprovalNo")
    @Expose
    private String ApprovalNo;

    /**
     * Get Bool type response object 
     * @return Result Bool type response object
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Bool type response object
     * @param Result Bool type response object
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Approval No. 
     * @return ApprovalNo Approval No.
     */
    public String getApprovalNo() {
        return this.ApprovalNo;
    }

    /**
     * Set Approval No.
     * @param ApprovalNo Approval No.
     */
    public void setApprovalNo(String ApprovalNo) {
        this.ApprovalNo = ApprovalNo;
    }

    public CreateMNPApprovalResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMNPApprovalResp(CreateMNPApprovalResp source) {
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

