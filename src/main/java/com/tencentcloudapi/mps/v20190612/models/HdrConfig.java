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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HdrConfig extends AbstractModel {

    /**
    * Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Type. Valid values:
<li>HDR10</li>
<li>HLG</li>
Default Value: HDR10.
Note: The video encoding method should be H.265.
Note: The video encoding bit depth is 10.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON. 
     * @return Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     * @param Switch Whether to enable the feature. Valid values:
<li>ON</li>
<li>OFF</li>
Default value: ON.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Type. Valid values:
<li>HDR10</li>
<li>HLG</li>
Default Value: HDR10.
Note: The video encoding method should be H.265.
Note: The video encoding bit depth is 10.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type. Valid values:
<li>HDR10</li>
<li>HLG</li>
Default Value: HDR10.
Note: The video encoding method should be H.265.
Note: The video encoding bit depth is 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type. Valid values:
<li>HDR10</li>
<li>HLG</li>
Default Value: HDR10.
Note: The video encoding method should be H.265.
Note: The video encoding bit depth is 10.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type. Valid values:
<li>HDR10</li>
<li>HLG</li>
Default Value: HDR10.
Note: The video encoding method should be H.265.
Note: The video encoding bit depth is 10.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HdrConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HdrConfig(HdrConfig source) {
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

