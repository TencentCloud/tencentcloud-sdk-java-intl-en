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

public class ModificationProtectionInfo extends AbstractModel {

    /**
    * Whether modification protection is enabled. Once enabled, it prevents the instance from unintended modification or deletion.
- true: enable modification protection
- false: disable modification protection
    */
    @SerializedName("ModificationProtectionEnabled")
    @Expose
    private Boolean ModificationProtectionEnabled;

    /**
    * 1238716123
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * Reason explanation for enabling modification protection.
Length: 1 to 255 characters. It must contain Chinese and characters from harmless strings. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Whether modification protection is enabled. Once enabled, it prevents the instance from unintended modification or deletion.
- true: enable modification protection
- false: disable modification protection 
     * @return ModificationProtectionEnabled Whether modification protection is enabled. Once enabled, it prevents the instance from unintended modification or deletion.
- true: enable modification protection
- false: disable modification protection
     */
    public Boolean getModificationProtectionEnabled() {
        return this.ModificationProtectionEnabled;
    }

    /**
     * Set Whether modification protection is enabled. Once enabled, it prevents the instance from unintended modification or deletion.
- true: enable modification protection
- false: disable modification protection
     * @param ModificationProtectionEnabled Whether modification protection is enabled. Once enabled, it prevents the instance from unintended modification or deletion.
- true: enable modification protection
- false: disable modification protection
     */
    public void setModificationProtectionEnabled(Boolean ModificationProtectionEnabled) {
        this.ModificationProtectionEnabled = ModificationProtectionEnabled;
    }

    /**
     * Get 1238716123 
     * @return OperatorUin 1238716123
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 1238716123
     * @param OperatorUin 1238716123
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
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

    public ModificationProtectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModificationProtectionInfo(ModificationProtectionInfo source) {
        if (source.ModificationProtectionEnabled != null) {
            this.ModificationProtectionEnabled = new Boolean(source.ModificationProtectionEnabled);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModificationProtectionEnabled", this.ModificationProtectionEnabled);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

