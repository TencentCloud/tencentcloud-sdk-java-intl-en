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

public class QueryPolicyResponse extends AbstractModel {

    /**
    * The policy index.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * The policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * The claim protocol type (CPT) ID.
    */
    @SerializedName("CptId")
    @Expose
    private Long CptId;

    /**
    * The content of the policy.
    */
    @SerializedName("PolicyData")
    @Expose
    private String PolicyData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The policy index. 
     * @return Id The policy index.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set The policy index.
     * @param Id The policy index.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get The policy ID. 
     * @return PolicyId The policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set The policy ID.
     * @param PolicyId The policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get The claim protocol type (CPT) ID. 
     * @return CptId The claim protocol type (CPT) ID.
     */
    public Long getCptId() {
        return this.CptId;
    }

    /**
     * Set The claim protocol type (CPT) ID.
     * @param CptId The claim protocol type (CPT) ID.
     */
    public void setCptId(Long CptId) {
        this.CptId = CptId;
    }

    /**
     * Get The content of the policy. 
     * @return PolicyData The content of the policy.
     */
    public String getPolicyData() {
        return this.PolicyData;
    }

    /**
     * Set The content of the policy.
     * @param PolicyData The content of the policy.
     */
    public void setPolicyData(String PolicyData) {
        this.PolicyData = PolicyData;
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

    public QueryPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPolicyResponse(QueryPolicyResponse source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.CptId != null) {
            this.CptId = new Long(source.CptId);
        }
        if (source.PolicyData != null) {
            this.PolicyData = new String(source.PolicyData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "CptId", this.CptId);
        this.setParamSimple(map, prefix + "PolicyData", this.PolicyData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

