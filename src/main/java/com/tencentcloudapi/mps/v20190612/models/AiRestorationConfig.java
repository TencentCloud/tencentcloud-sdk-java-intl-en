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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiRestorationConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Strength type</p><p>Enumeration values: </p><ul><li>weak: Weak</li><li>normal: Medium</li><li>strong: Strong</li></ul><p>Default value: normal</p>
Attention: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Capability configuration switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p> 
     * @return Switch <p>Capability configuration switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p>
     * @param Switch <p>Capability configuration switch</p><p>Enumeration values: </p><ul><li>ON: Enable</li><li>OFF: Disable</li></ul><p>Default value: OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Strength type</p><p>Enumeration values: </p><ul><li>weak: Weak</li><li>normal: Medium</li><li>strong: Strong</li></ul><p>Default value: normal</p>
Attention: This field may return null, indicating that no valid values can be obtained. 
     * @return Type <p>Strength type</p><p>Enumeration values: </p><ul><li>weak: Weak</li><li>normal: Medium</li><li>strong: Strong</li></ul><p>Default value: normal</p>
Attention: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Strength type</p><p>Enumeration values: </p><ul><li>weak: Weak</li><li>normal: Medium</li><li>strong: Strong</li></ul><p>Default value: normal</p>
Attention: This field may return null, indicating that no valid values can be obtained.
     * @param Type <p>Strength type</p><p>Enumeration values: </p><ul><li>weak: Weak</li><li>normal: Medium</li><li>strong: Strong</li></ul><p>Default value: normal</p>
Attention: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AiRestorationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRestorationConfig(AiRestorationConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

