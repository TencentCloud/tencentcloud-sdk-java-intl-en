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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMultipleSecurityPolicyRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Security group policy
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityPolicy [] SecurityGroupPolicySet;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Security group policy 
     * @return SecurityGroupPolicySet Security group policy
     */
    public SecurityPolicy [] getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set Security group policy
     * @param SecurityGroupPolicySet Security group policy
     */
    public void setSecurityGroupPolicySet(SecurityPolicy [] SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    public DeleteMultipleSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMultipleSecurityPolicyRequest(DeleteMultipleSecurityPolicyRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityPolicy[source.SecurityGroupPolicySet.length];
            for (int i = 0; i < source.SecurityGroupPolicySet.length; i++) {
                this.SecurityGroupPolicySet[i] = new SecurityPolicy(source.SecurityGroupPolicySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamArrayObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);

    }
}

