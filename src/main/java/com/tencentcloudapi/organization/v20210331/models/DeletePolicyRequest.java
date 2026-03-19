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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePolicyRequest extends AbstractModel {

    /**
    * Policy ID to be deleted. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.

    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Policy ID to be deleted. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.
 
     * @return PolicyId Policy ID to be deleted. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.

     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID to be deleted. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.

     * @param PolicyId Policy ID to be deleted. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.

     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY. 
     * @return Type Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     * @param Type Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DeletePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePolicyRequest(DeletePolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

