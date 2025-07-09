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

public class RegisterClaimPolicyRequest extends AbstractModel {

    /**
    * The claim protocol type (CPT) index.
    */
    @SerializedName("CptIndex")
    @Expose
    private Long CptIndex;

    /**
    * The disclosure policy.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
     * Get The claim protocol type (CPT) index. 
     * @return CptIndex The claim protocol type (CPT) index.
     */
    public Long getCptIndex() {
        return this.CptIndex;
    }

    /**
     * Set The claim protocol type (CPT) index.
     * @param CptIndex The claim protocol type (CPT) index.
     */
    public void setCptIndex(Long CptIndex) {
        this.CptIndex = CptIndex;
    }

    /**
     * Get The disclosure policy. 
     * @return Policy The disclosure policy.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set The disclosure policy.
     * @param Policy The disclosure policy.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    public RegisterClaimPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterClaimPolicyRequest(RegisterClaimPolicyRequest source) {
        if (source.CptIndex != null) {
            this.CptIndex = new Long(source.CptIndex);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CptIndex", this.CptIndex);
        this.setParamSimple(map, prefix + "Policy", this.Policy);

    }
}

