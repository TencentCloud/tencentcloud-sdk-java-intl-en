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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityPolicyRequest extends AbstractModel {

    /**
    * Security policy ID list. ID format: tls- followed by 8 alphanumeric characters.
    */
    @SerializedName("SecurityPolicyIds")
    @Expose
    private String [] SecurityPolicyIds;

    /**
    * Whether to only execute a preflight request. Value:
- **true**: Execute only the preflight request without actually deleting a resource. The preflight request will verify the parameter format, permission, and whether the security policy is referenced, helping you identify potential issues before proceeding with any operations.
- **false** (default): Execute a normal request. After the precheck is passed, delete the security policy directly.

    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Security policy ID list. ID format: tls- followed by 8 alphanumeric characters. 
     * @return SecurityPolicyIds Security policy ID list. ID format: tls- followed by 8 alphanumeric characters.
     */
    public String [] getSecurityPolicyIds() {
        return this.SecurityPolicyIds;
    }

    /**
     * Set Security policy ID list. ID format: tls- followed by 8 alphanumeric characters.
     * @param SecurityPolicyIds Security policy ID list. ID format: tls- followed by 8 alphanumeric characters.
     */
    public void setSecurityPolicyIds(String [] SecurityPolicyIds) {
        this.SecurityPolicyIds = SecurityPolicyIds;
    }

    /**
     * Get Whether to only execute a preflight request. Value:
- **true**: Execute only the preflight request without actually deleting a resource. The preflight request will verify the parameter format, permission, and whether the security policy is referenced, helping you identify potential issues before proceeding with any operations.
- **false** (default): Execute a normal request. After the precheck is passed, delete the security policy directly.
 
     * @return DryRun Whether to only execute a preflight request. Value:
- **true**: Execute only the preflight request without actually deleting a resource. The preflight request will verify the parameter format, permission, and whether the security policy is referenced, helping you identify potential issues before proceeding with any operations.
- **false** (default): Execute a normal request. After the precheck is passed, delete the security policy directly.

     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only execute a preflight request. Value:
- **true**: Execute only the preflight request without actually deleting a resource. The preflight request will verify the parameter format, permission, and whether the security policy is referenced, helping you identify potential issues before proceeding with any operations.
- **false** (default): Execute a normal request. After the precheck is passed, delete the security policy directly.

     * @param DryRun Whether to only execute a preflight request. Value:
- **true**: Execute only the preflight request without actually deleting a resource. The preflight request will verify the parameter format, permission, and whether the security policy is referenced, helping you identify potential issues before proceeding with any operations.
- **false** (default): Execute a normal request. After the precheck is passed, delete the security policy directly.

     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSecurityPolicyRequest(DeleteSecurityPolicyRequest source) {
        if (source.SecurityPolicyIds != null) {
            this.SecurityPolicyIds = new String[source.SecurityPolicyIds.length];
            for (int i = 0; i < source.SecurityPolicyIds.length; i++) {
                this.SecurityPolicyIds[i] = new String(source.SecurityPolicyIds[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityPolicyIds.", this.SecurityPolicyIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

