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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclConfig extends AbstractModel {

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The custom rule.
    */
    @SerializedName("AclUserRules")
    @Expose
    private AclUserRule [] AclUserRules;

    /**
    * Custom managed rules
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Customizes")
    @Expose
    private AclUserRule [] Customizes;

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The custom rule. 
     * @return AclUserRules The custom rule.
     */
    public AclUserRule [] getAclUserRules() {
        return this.AclUserRules;
    }

    /**
     * Set The custom rule.
     * @param AclUserRules The custom rule.
     */
    public void setAclUserRules(AclUserRule [] AclUserRules) {
        this.AclUserRules = AclUserRules;
    }

    /**
     * Get Custom managed rules
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Customizes Custom managed rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AclUserRule [] getCustomizes() {
        return this.Customizes;
    }

    /**
     * Set Custom managed rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Customizes Custom managed rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCustomizes(AclUserRule [] Customizes) {
        this.Customizes = Customizes;
    }

    public AclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclConfig(AclConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AclUserRules != null) {
            this.AclUserRules = new AclUserRule[source.AclUserRules.length];
            for (int i = 0; i < source.AclUserRules.length; i++) {
                this.AclUserRules[i] = new AclUserRule(source.AclUserRules[i]);
            }
        }
        if (source.Customizes != null) {
            this.Customizes = new AclUserRule[source.Customizes.length];
            for (int i = 0; i < source.Customizes.length; i++) {
                this.Customizes[i] = new AclUserRule(source.Customizes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "AclUserRules.", this.AclUserRules);
        this.setParamArrayObj(map, prefix + "Customizes.", this.Customizes);

    }
}

