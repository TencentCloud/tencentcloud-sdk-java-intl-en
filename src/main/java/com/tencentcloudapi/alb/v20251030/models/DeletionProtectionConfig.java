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

public class DeletionProtectionConfig extends AbstractModel {

    /**
    * Whether to enable deletion protection. Once enabled, instances can be prevented from being deleted accidentally.
- true: enable deletion protection
- false: disable deletion protection
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
    * Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Whether to enable deletion protection. Once enabled, instances can be prevented from being deleted accidentally.
- true: enable deletion protection
- false: disable deletion protection 
     * @return DeletionProtectionEnabled Whether to enable deletion protection. Once enabled, instances can be prevented from being deleted accidentally.
- true: enable deletion protection
- false: disable deletion protection
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set Whether to enable deletion protection. Once enabled, instances can be prevented from being deleted accidentally.
- true: enable deletion protection
- false: disable deletion protection
     * @param DeletionProtectionEnabled Whether to enable deletion protection. Once enabled, instances can be prevented from being deleted accidentally.
- true: enable deletion protection
- false: disable deletion protection
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    /**
     * Get Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return Reason Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param Reason Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public DeletionProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletionProtectionConfig(DeletionProtectionConfig source) {
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

