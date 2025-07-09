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

public class IdentityPolicy extends AbstractModel {

    /**
    * CAM preset policy ID, which is valid and required when PolicyType is a preset policy.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * CAM preset policy name, which is valid and required when PolicyType is a preset policy.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy type. Valid values: 1 (custom policy), 2 (preset policy). The default is 2.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * Custom policy content, which follows the CAM policy syntax. It is valid and required when PolicyType is a custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
     * Get CAM preset policy ID, which is valid and required when PolicyType is a preset policy. 
     * @return PolicyId CAM preset policy ID, which is valid and required when PolicyType is a preset policy.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set CAM preset policy ID, which is valid and required when PolicyType is a preset policy.
     * @param PolicyId CAM preset policy ID, which is valid and required when PolicyType is a preset policy.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get CAM preset policy name, which is valid and required when PolicyType is a preset policy. 
     * @return PolicyName CAM preset policy name, which is valid and required when PolicyType is a preset policy.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set CAM preset policy name, which is valid and required when PolicyType is a preset policy.
     * @param PolicyName CAM preset policy name, which is valid and required when PolicyType is a preset policy.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy type. Valid values: 1 (custom policy), 2 (preset policy). The default is 2.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyType Policy type. Valid values: 1 (custom policy), 2 (preset policy). The default is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type. Valid values: 1 (custom policy), 2 (preset policy). The default is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyType Policy type. Valid values: 1 (custom policy), 2 (preset policy). The default is 2.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Custom policy content, which follows the CAM policy syntax. It is valid and required when PolicyType is a custom policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyDocument Custom policy content, which follows the CAM policy syntax. It is valid and required when PolicyType is a custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set Custom policy content, which follows the CAM policy syntax. It is valid and required when PolicyType is a custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyDocument Custom policy content, which follows the CAM policy syntax. It is valid and required when PolicyType is a custom policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    public IdentityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentityPolicy(IdentityPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);

    }
}

