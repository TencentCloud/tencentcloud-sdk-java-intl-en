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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LowLightEnhanceInfo extends AbstractModel {

    /**
    * Whether to enable low-light enhancement. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The low-light enhancement type. This parameter is valid only if `Switch` is `ON`.
<li>`normal`</li>
Default value: `normal`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable low-light enhancement. Valid values:
<li>`ON`</li>
<li>`OFF`</li> 
     * @return Switch Whether to enable low-light enhancement. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable low-light enhancement. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     * @param Switch Whether to enable low-light enhancement. Valid values:
<li>`ON`</li>
<li>`OFF`</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The low-light enhancement type. This parameter is valid only if `Switch` is `ON`.
<li>`normal`</li>
Default value: `normal`. 
     * @return Type The low-light enhancement type. This parameter is valid only if `Switch` is `ON`.
<li>`normal`</li>
Default value: `normal`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The low-light enhancement type. This parameter is valid only if `Switch` is `ON`.
<li>`normal`</li>
Default value: `normal`.
     * @param Type The low-light enhancement type. This parameter is valid only if `Switch` is `ON`.
<li>`normal`</li>
Default value: `normal`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public LowLightEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LowLightEnhanceInfo(LowLightEnhanceInfo source) {
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

