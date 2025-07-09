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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineUpgradeSettings extends AbstractModel {

    /**
    * Whether to enable automatic upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("AutoUpgrade")
    @Expose
    private Boolean AutoUpgrade;

    /**
    * Ops window
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("UpgradeOptions")
    @Expose
    private AutoUpgradeOptions UpgradeOptions;

    /**
    * Upgrade item
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * Maximum number of nodes that cannot be upgraded during upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private IntOrString MaxUnavailable;

    /**
     * Get Whether to enable automatic upgrade
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return AutoUpgrade Whether to enable automatic upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getAutoUpgrade() {
        return this.AutoUpgrade;
    }

    /**
     * Set Whether to enable automatic upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param AutoUpgrade Whether to enable automatic upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setAutoUpgrade(Boolean AutoUpgrade) {
        this.AutoUpgrade = AutoUpgrade;
    }

    /**
     * Get Ops window
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return UpgradeOptions Ops window
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public AutoUpgradeOptions getUpgradeOptions() {
        return this.UpgradeOptions;
    }

    /**
     * Set Ops window
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param UpgradeOptions Ops window
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setUpgradeOptions(AutoUpgradeOptions UpgradeOptions) {
        this.UpgradeOptions = UpgradeOptions;
    }

    /**
     * Get Upgrade item
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Components Upgrade item
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set Upgrade item
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Components Upgrade item
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get Maximum number of nodes that cannot be upgraded during upgrade
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return MaxUnavailable Maximum number of nodes that cannot be upgraded during upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public IntOrString getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set Maximum number of nodes that cannot be upgraded during upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param MaxUnavailable Maximum number of nodes that cannot be upgraded during upgrade
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setMaxUnavailable(IntOrString MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    public MachineUpgradeSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineUpgradeSettings(MachineUpgradeSettings source) {
        if (source.AutoUpgrade != null) {
            this.AutoUpgrade = new Boolean(source.AutoUpgrade);
        }
        if (source.UpgradeOptions != null) {
            this.UpgradeOptions = new AutoUpgradeOptions(source.UpgradeOptions);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.MaxUnavailable != null) {
            this.MaxUnavailable = new IntOrString(source.MaxUnavailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoUpgrade", this.AutoUpgrade);
        this.setParamObj(map, prefix + "UpgradeOptions.", this.UpgradeOptions);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamObj(map, prefix + "MaxUnavailable.", this.MaxUnavailable);

    }
}

