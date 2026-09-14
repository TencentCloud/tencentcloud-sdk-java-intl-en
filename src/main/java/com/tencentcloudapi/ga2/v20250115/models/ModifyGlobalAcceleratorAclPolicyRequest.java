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

public class ModifyGlobalAcceleratorAclPolicyRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Access control policy ID.</p>
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * <p>Access control policy status.</p><p>Enumeration values:</p><ul><li>OPEN: On.</li><li>CLOSE: Off.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Access control policy ID.</p> 
     * @return GlobalAcceleratorAclPolicyId <p>Access control policy ID.</p>
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set <p>Access control policy ID.</p>
     * @param GlobalAcceleratorAclPolicyId <p>Access control policy ID.</p>
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get <p>Access control policy status.</p><p>Enumeration values:</p><ul><li>OPEN: On.</li><li>CLOSE: Off.</li></ul> 
     * @return Status <p>Access control policy status.</p><p>Enumeration values:</p><ul><li>OPEN: On.</li><li>CLOSE: Off.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Access control policy status.</p><p>Enumeration values:</p><ul><li>OPEN: On.</li><li>CLOSE: Off.</li></ul>
     * @param Status <p>Access control policy status.</p><p>Enumeration values:</p><ul><li>OPEN: On.</li><li>CLOSE: Off.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyGlobalAcceleratorAclPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorAclPolicyRequest(ModifyGlobalAcceleratorAclPolicyRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

