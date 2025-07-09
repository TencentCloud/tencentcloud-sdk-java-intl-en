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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSelectiveCredentialRequest extends AbstractModel {

    /**
    * A parameter set.
    */
    @SerializedName("FunctionArg")
    @Expose
    private VerifyFunctionArg FunctionArg;

    /**
    * The disclosure policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get A parameter set. 
     * @return FunctionArg A parameter set.
     */
    public VerifyFunctionArg getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set A parameter set.
     * @param FunctionArg A parameter set.
     */
    public void setFunctionArg(VerifyFunctionArg FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    /**
     * Get The disclosure policy ID. 
     * @return PolicyId The disclosure policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The disclosure policy ID.
     * @param PolicyId The disclosure policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public CreateSelectiveCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSelectiveCredentialRequest(CreateSelectiveCredentialRequest source) {
        if (source.FunctionArg != null) {
            this.FunctionArg = new VerifyFunctionArg(source.FunctionArg);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FunctionArg.", this.FunctionArg);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

