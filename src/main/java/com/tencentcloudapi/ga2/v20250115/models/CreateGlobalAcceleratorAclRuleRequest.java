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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGlobalAcceleratorAclRuleRequest extends AbstractModel {

    /**
    * Global acceleration instance ID.
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * Security policy ID
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * Acl information.
    */
    @SerializedName("AclEntries")
    @Expose
    private AclEntries [] AclEntries;

    /**
     * Get Global acceleration instance ID. 
     * @return GlobalAcceleratorId Global acceleration instance ID.
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set Global acceleration instance ID.
     * @param GlobalAcceleratorId Global acceleration instance ID.
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get Security policy ID 
     * @return GlobalAcceleratorAclPolicyId Security policy ID
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set Security policy ID
     * @param GlobalAcceleratorAclPolicyId Security policy ID
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get Acl information. 
     * @return AclEntries Acl information.
     */
    public AclEntries [] getAclEntries() {
        return this.AclEntries;
    }

    /**
     * Set Acl information.
     * @param AclEntries Acl information.
     */
    public void setAclEntries(AclEntries [] AclEntries) {
        this.AclEntries = AclEntries;
    }

    public CreateGlobalAcceleratorAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalAcceleratorAclRuleRequest(CreateGlobalAcceleratorAclRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.AclEntries != null) {
            this.AclEntries = new AclEntries[source.AclEntries.length];
            for (int i = 0; i < source.AclEntries.length; i++) {
                this.AclEntries[i] = new AclEntries(source.AclEntries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamArrayObj(map, prefix + "AclEntries.", this.AclEntries);

    }
}

