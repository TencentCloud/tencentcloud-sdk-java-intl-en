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

public class GlobalAcceleratorAclPolicies extends AbstractModel {

    /**
    * Access control policy ID.
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * Default action.
    */
    @SerializedName("DefaultAction")
    @Expose
    private String DefaultAction;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Access control policy ID. 
     * @return GlobalAcceleratorAclPolicyId Access control policy ID.
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set Access control policy ID.
     * @param GlobalAcceleratorAclPolicyId Access control policy ID.
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get Default action. 
     * @return DefaultAction Default action.
     */
    public String getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * Set Default action.
     * @param DefaultAction Default action.
     */
    public void setDefaultAction(String DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public GlobalAcceleratorAclPolicies() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAclPolicies(GlobalAcceleratorAclPolicies source) {
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.DefaultAction != null) {
            this.DefaultAction = new String(source.DefaultAction);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

