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

public class ModifyLoadBalancerModificationProtectionRequest extends AbstractModel {

    /**
    * Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Indicates whether to enable modification protection. Once enabled, the instance is protected from unintended modification or deletion.\n- true: enables modification protection\n- false: disables modification protection
    */
    @SerializedName("ModificationProtectionEnabled")
    @Expose
    private Boolean ModificationProtectionEnabled;

    /**
    * Whether to only precheck this request. Parameter Value:
- true: Only perform precheck without performing operations on a resource. Check parameter integrity, request format, and service limits. If approved, DryRunOperation is returned. If not approved, the corresponding error is returned.
-false (default): Execute a normal request. After the check is passed, directly perform operations on the resource.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Reason explanation for enabling modification protection.
Length: 1–255 characters. It must be a Chinese or harmless string and can contain Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId Cloud Load Balancer instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Indicates whether to enable modification protection. Once enabled, the instance is protected from unintended modification or deletion.\n- true: enables modification protection\n- false: disables modification protection 
     * @return ModificationProtectionEnabled Indicates whether to enable modification protection. Once enabled, the instance is protected from unintended modification or deletion.\n- true: enables modification protection\n- false: disables modification protection
     */
    public Boolean getModificationProtectionEnabled() {
        return this.ModificationProtectionEnabled;
    }

    /**
     * Set Indicates whether to enable modification protection. Once enabled, the instance is protected from unintended modification or deletion.\n- true: enables modification protection\n- false: disables modification protection
     * @param ModificationProtectionEnabled Indicates whether to enable modification protection. Once enabled, the instance is protected from unintended modification or deletion.\n- true: enables modification protection\n- false: disables modification protection
     */
    public void setModificationProtectionEnabled(Boolean ModificationProtectionEnabled) {
        this.ModificationProtectionEnabled = ModificationProtectionEnabled;
    }

    /**
     * Get Whether to only precheck this request. Parameter Value:
- true: Only perform precheck without performing operations on a resource. Check parameter integrity, request format, and service limits. If approved, DryRunOperation is returned. If not approved, the corresponding error is returned.
-false (default): Execute a normal request. After the check is passed, directly perform operations on the resource. 
     * @return DryRun Whether to only precheck this request. Parameter Value:
- true: Only perform precheck without performing operations on a resource. Check parameter integrity, request format, and service limits. If approved, DryRunOperation is returned. If not approved, the corresponding error is returned.
-false (default): Execute a normal request. After the check is passed, directly perform operations on the resource.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter Value:
- true: Only perform precheck without performing operations on a resource. Check parameter integrity, request format, and service limits. If approved, DryRunOperation is returned. If not approved, the corresponding error is returned.
-false (default): Execute a normal request. After the check is passed, directly perform operations on the resource.
     * @param DryRun Whether to only precheck this request. Parameter Value:
- true: Only perform precheck without performing operations on a resource. Check parameter integrity, request format, and service limits. If approved, DryRunOperation is returned. If not approved, the corresponding error is returned.
-false (default): Execute a normal request. After the check is passed, directly perform operations on the resource.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Reason explanation for enabling modification protection.
Length: 1–255 characters. It must be a Chinese or harmless string and can contain Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return Reason Reason explanation for enabling modification protection.
Length: 1–255 characters. It must be a Chinese or harmless string and can contain Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason explanation for enabling modification protection.
Length: 1–255 characters. It must be a Chinese or harmless string and can contain Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param Reason Reason explanation for enabling modification protection.
Length: 1–255 characters. It must be a Chinese or harmless string and can contain Chinese characters, letters, digits, dashes (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ModifyLoadBalancerModificationProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerModificationProtectionRequest(ModifyLoadBalancerModificationProtectionRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ModificationProtectionEnabled != null) {
            this.ModificationProtectionEnabled = new Boolean(source.ModificationProtectionEnabled);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ModificationProtectionEnabled", this.ModificationProtectionEnabled);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

