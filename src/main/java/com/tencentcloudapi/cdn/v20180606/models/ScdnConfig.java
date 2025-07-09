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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnConfig extends AbstractModel {

    /**
    * Whether to enable SCDN CC configuration. Values:
`on`: Enable
`off`: Disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private ScdnCCRules [] Rules;

    /**
    * Advanced custom CC attack defense rule
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AdvancedRules")
    @Expose
    private AdvancedCCRules [] AdvancedRules;

    /**
    * Global advanced CC protection rules
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("GlobalAdvancedRules")
    @Expose
    private AdvancedCCRules [] GlobalAdvancedRules;

    /**
     * Get Whether to enable SCDN CC configuration. Values:
`on`: Enable
`off`: Disable 
     * @return Switch Whether to enable SCDN CC configuration. Values:
`on`: Enable
`off`: Disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable SCDN CC configuration. Values:
`on`: Enable
`off`: Disable
     * @param Switch Whether to enable SCDN CC configuration. Values:
`on`: Enable
`off`: Disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Rules Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnCCRules [] getRules() {
        return this.Rules;
    }

    /**
     * Set Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Rules Custom CC attack defense rule
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRules(ScdnCCRules [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Advanced custom CC attack defense rule
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AdvancedRules Advanced custom CC attack defense rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AdvancedCCRules [] getAdvancedRules() {
        return this.AdvancedRules;
    }

    /**
     * Set Advanced custom CC attack defense rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AdvancedRules Advanced custom CC attack defense rule
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAdvancedRules(AdvancedCCRules [] AdvancedRules) {
        this.AdvancedRules = AdvancedRules;
    }

    /**
     * Get Global advanced CC protection rules
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return GlobalAdvancedRules Global advanced CC protection rules
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public AdvancedCCRules [] getGlobalAdvancedRules() {
        return this.GlobalAdvancedRules;
    }

    /**
     * Set Global advanced CC protection rules
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param GlobalAdvancedRules Global advanced CC protection rules
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setGlobalAdvancedRules(AdvancedCCRules [] GlobalAdvancedRules) {
        this.GlobalAdvancedRules = GlobalAdvancedRules;
    }

    public ScdnConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnConfig(ScdnConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Rules != null) {
            this.Rules = new ScdnCCRules[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ScdnCCRules(source.Rules[i]);
            }
        }
        if (source.AdvancedRules != null) {
            this.AdvancedRules = new AdvancedCCRules[source.AdvancedRules.length];
            for (int i = 0; i < source.AdvancedRules.length; i++) {
                this.AdvancedRules[i] = new AdvancedCCRules(source.AdvancedRules[i]);
            }
        }
        if (source.GlobalAdvancedRules != null) {
            this.GlobalAdvancedRules = new AdvancedCCRules[source.GlobalAdvancedRules.length];
            for (int i = 0; i < source.GlobalAdvancedRules.length; i++) {
                this.GlobalAdvancedRules[i] = new AdvancedCCRules(source.GlobalAdvancedRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArrayObj(map, prefix + "AdvancedRules.", this.AdvancedRules);
        this.setParamArrayObj(map, prefix + "GlobalAdvancedRules.", this.GlobalAdvancedRules);

    }
}

