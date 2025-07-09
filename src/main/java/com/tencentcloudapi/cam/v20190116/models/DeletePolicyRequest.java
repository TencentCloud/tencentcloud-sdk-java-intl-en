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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePolicyRequest extends AbstractModel {

    /**
    * Array. Array elements are policy IDs. Policies can be deleted in a batch
    */
    @SerializedName("PolicyId")
    @Expose
    private Long [] PolicyId;

    /**
     * Get Array. Array elements are policy IDs. Policies can be deleted in a batch 
     * @return PolicyId Array. Array elements are policy IDs. Policies can be deleted in a batch
     */
    public Long [] getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Array. Array elements are policy IDs. Policies can be deleted in a batch
     * @param PolicyId Array. Array elements are policy IDs. Policies can be deleted in a batch
     */
    public void setPolicyId(Long [] PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DeletePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePolicyRequest(DeletePolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long[source.PolicyId.length];
            for (int i = 0; i < source.PolicyId.length; i++) {
                this.PolicyId[i] = new Long(source.PolicyId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyId.", this.PolicyId);

    }
}

