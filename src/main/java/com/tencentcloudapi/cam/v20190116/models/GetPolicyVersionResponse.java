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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetPolicyVersionResponse extends AbstractModel{

    /**
    * Policy version details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyVersion")
    @Expose
    private PolicyVersionDetail PolicyVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Policy version details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PolicyVersion Policy version details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PolicyVersionDetail getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set Policy version details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PolicyVersion Policy version details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyVersion(PolicyVersionDetail PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetPolicyVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetPolicyVersionResponse(GetPolicyVersionResponse source) {
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new PolicyVersionDetail(source.PolicyVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PolicyVersion.", this.PolicyVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

