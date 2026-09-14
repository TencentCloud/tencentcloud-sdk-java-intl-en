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

public class CreateGlobalAcceleratorAclPolicyRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Default behavior.</p><p>Enumeration values:</p><ul><li>ACCEPT: Permit all traffic on the access channel by default</li><li>DROP: Deny all traffic on the access channel by default</li></ul>
    */
    @SerializedName("DefaultAction")
    @Expose
    private String DefaultAction;

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
     * Get <p>Default behavior.</p><p>Enumeration values:</p><ul><li>ACCEPT: Permit all traffic on the access channel by default</li><li>DROP: Deny all traffic on the access channel by default</li></ul> 
     * @return DefaultAction <p>Default behavior.</p><p>Enumeration values:</p><ul><li>ACCEPT: Permit all traffic on the access channel by default</li><li>DROP: Deny all traffic on the access channel by default</li></ul>
     */
    public String getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * Set <p>Default behavior.</p><p>Enumeration values:</p><ul><li>ACCEPT: Permit all traffic on the access channel by default</li><li>DROP: Deny all traffic on the access channel by default</li></ul>
     * @param DefaultAction <p>Default behavior.</p><p>Enumeration values:</p><ul><li>ACCEPT: Permit all traffic on the access channel by default</li><li>DROP: Deny all traffic on the access channel by default</li></ul>
     */
    public void setDefaultAction(String DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    public CreateGlobalAcceleratorAclPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalAcceleratorAclPolicyRequest(CreateGlobalAcceleratorAclPolicyRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.DefaultAction != null) {
            this.DefaultAction = new String(source.DefaultAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);

    }
}

