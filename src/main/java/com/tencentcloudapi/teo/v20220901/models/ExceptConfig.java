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

public class ExceptConfig extends AbstractModel {

    /**
    * Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptUserRules")
    @Expose
    private ExceptUserRule [] ExceptUserRules;

    /**
     * Get Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Whether to enable configuration. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptUserRules The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ExceptUserRule [] getExceptUserRules() {
        return this.ExceptUserRules;
    }

    /**
     * Set The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptUserRules The settings of the exception rule. If it is null, the settings that were last configured will be used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptUserRules(ExceptUserRule [] ExceptUserRules) {
        this.ExceptUserRules = ExceptUserRules;
    }

    public ExceptConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptConfig(ExceptConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ExceptUserRules != null) {
            this.ExceptUserRules = new ExceptUserRule[source.ExceptUserRules.length];
            for (int i = 0; i < source.ExceptUserRules.length; i++) {
                this.ExceptUserRules[i] = new ExceptUserRule(source.ExceptUserRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ExceptUserRules.", this.ExceptUserRules);

    }
}

