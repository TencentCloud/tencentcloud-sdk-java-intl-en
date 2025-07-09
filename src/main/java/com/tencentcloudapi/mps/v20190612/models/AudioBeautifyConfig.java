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

public class AudioBeautifyConfig extends AbstractModel {

    /**
    * Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The audio improvement options. You can specify multiple options. Valid values:
<li>`declick`: Noise removal.</li>
<li>`deesser`: De-essing.</li>
Default: `declick`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
     * Get Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`. 
     * @return Switch Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     * @param Switch Whether to enable the feature. Valid values:
<li>`ON`</li>
<li>`OFF` </li>
Default value: `ON`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The audio improvement options. You can specify multiple options. Valid values:
<li>`declick`: Noise removal.</li>
<li>`deesser`: De-essing.</li>
Default: `declick`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Types The audio improvement options. You can specify multiple options. Valid values:
<li>`declick`: Noise removal.</li>
<li>`deesser`: De-essing.</li>
Default: `declick`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set The audio improvement options. You can specify multiple options. Valid values:
<li>`declick`: Noise removal.</li>
<li>`deesser`: De-essing.</li>
Default: `declick`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Types The audio improvement options. You can specify multiple options. Valid values:
<li>`declick`: Noise removal.</li>
<li>`deesser`: De-essing.</li>
Default: `declick`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    public AudioBeautifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioBeautifyConfig(AudioBeautifyConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

