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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckPolicyRule extends AbstractModel {

    /**
    * Health check rules
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to check this item
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Whether to enable repair
    */
    @SerializedName("AutoRepairEnabled")
    @Expose
    private Boolean AutoRepairEnabled;

    /**
     * Get Health check rules 
     * @return Name Health check rules
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Health check rules
     * @param Name Health check rules
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to check this item 
     * @return Enabled Whether to check this item
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to check this item
     * @param Enabled Whether to check this item
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Whether to enable repair 
     * @return AutoRepairEnabled Whether to enable repair
     */
    public Boolean getAutoRepairEnabled() {
        return this.AutoRepairEnabled;
    }

    /**
     * Set Whether to enable repair
     * @param AutoRepairEnabled Whether to enable repair
     */
    public void setAutoRepairEnabled(Boolean AutoRepairEnabled) {
        this.AutoRepairEnabled = AutoRepairEnabled;
    }

    public HealthCheckPolicyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckPolicyRule(HealthCheckPolicyRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.AutoRepairEnabled != null) {
            this.AutoRepairEnabled = new Boolean(source.AutoRepairEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "AutoRepairEnabled", this.AutoRepairEnabled);

    }
}

