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

public class MerchantBindApprovalResp extends AbstractModel {

    /**
    * <p>Operation response result. A value of true indicates that the operation succeeded.</p>
    */
    @SerializedName("ApprovalResult")
    @Expose
    private Boolean ApprovalResult;

    /**
    * <p>Approval number. Required as an input parameter when calling the API to approve merchant binding.</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>Operation response result. A value of true indicates that the operation succeeded.</p> 
     * @return ApprovalResult <p>Operation response result. A value of true indicates that the operation succeeded.</p>
     */
    public Boolean getApprovalResult() {
        return this.ApprovalResult;
    }

    /**
     * Set <p>Operation response result. A value of true indicates that the operation succeeded.</p>
     * @param ApprovalResult <p>Operation response result. A value of true indicates that the operation succeeded.</p>
     */
    public void setApprovalResult(Boolean ApprovalResult) {
        this.ApprovalResult = ApprovalResult;
    }

    /**
     * Get <p>Approval number. Required as an input parameter when calling the API to approve merchant binding.</p> 
     * @return ResourceId <p>Approval number. Required as an input parameter when calling the API to approve merchant binding.</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Approval number. Required as an input parameter when calling the API to approve merchant binding.</p>
     * @param ResourceId <p>Approval number. Required as an input parameter when calling the API to approve merchant binding.</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public MerchantBindApprovalResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MerchantBindApprovalResp(MerchantBindApprovalResp source) {
        if (source.ApprovalResult != null) {
            this.ApprovalResult = new Boolean(source.ApprovalResult);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalResult", this.ApprovalResult);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

