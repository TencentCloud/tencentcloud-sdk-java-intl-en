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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectionConfigItem extends AbstractModel {

    /**
    * Configuration item ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Configuration item name.
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * Configuration item description
    */
    @SerializedName("ConfigDescription")
    @Expose
    private String ConfigDescription;

    /**
    * Configuration group
Enumeration value:
auto_risk_discovery: auto risk discovery
auto-defense
client_hardening: Client hardening
    */
    @SerializedName("ConfigGroup")
    @Expose
    private String ConfigGroup;

    /**
    * Whether enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get Configuration item ID 
     * @return ConfigId Configuration item ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Configuration item ID
     * @param ConfigId Configuration item ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Configuration item name. 
     * @return ConfigName Configuration item name.
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set Configuration item name.
     * @param ConfigName Configuration item name.
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get Configuration item description 
     * @return ConfigDescription Configuration item description
     */
    public String getConfigDescription() {
        return this.ConfigDescription;
    }

    /**
     * Set Configuration item description
     * @param ConfigDescription Configuration item description
     */
    public void setConfigDescription(String ConfigDescription) {
        this.ConfigDescription = ConfigDescription;
    }

    /**
     * Get Configuration group
Enumeration value:
auto_risk_discovery: auto risk discovery
auto-defense
client_hardening: Client hardening 
     * @return ConfigGroup Configuration group
Enumeration value:
auto_risk_discovery: auto risk discovery
auto-defense
client_hardening: Client hardening
     */
    public String getConfigGroup() {
        return this.ConfigGroup;
    }

    /**
     * Set Configuration group
Enumeration value:
auto_risk_discovery: auto risk discovery
auto-defense
client_hardening: Client hardening
     * @param ConfigGroup Configuration group
Enumeration value:
auto_risk_discovery: auto risk discovery
auto-defense
client_hardening: Client hardening
     */
    public void setConfigGroup(String ConfigGroup) {
        this.ConfigGroup = ConfigGroup;
    }

    /**
     * Get Whether enabled 
     * @return Enabled Whether enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether enabled
     * @param Enabled Whether enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ProtectionConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionConfigItem(ProtectionConfigItem source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigDescription != null) {
            this.ConfigDescription = new String(source.ConfigDescription);
        }
        if (source.ConfigGroup != null) {
            this.ConfigGroup = new String(source.ConfigGroup);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigDescription", this.ConfigDescription);
        this.setParamSimple(map, prefix + "ConfigGroup", this.ConfigGroup);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

