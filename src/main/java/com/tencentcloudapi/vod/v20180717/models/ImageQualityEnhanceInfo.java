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

public class ImageQualityEnhanceInfo extends AbstractModel {

    /**
    * Comprehensive enhancement control switch. Valid values:
<li>ON: enable comprehensive enhancement</li>
<li>OFF: disable comprehensive enhancement</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Comprehensive enhancement type. Valid only when the control switch is ON. Available values:
<li>weak: light comprehensive enhancement.</li>
<li>NORMAL: Comprehensive enhancement is normal.</li>
<li>strong: comprehensive enhancement.</li>
Default value: weak.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Comprehensive enhancement control switch. Valid values:
<li>ON: enable comprehensive enhancement</li>
<li>OFF: disable comprehensive enhancement</li> 
     * @return Switch Comprehensive enhancement control switch. Valid values:
<li>ON: enable comprehensive enhancement</li>
<li>OFF: disable comprehensive enhancement</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Comprehensive enhancement control switch. Valid values:
<li>ON: enable comprehensive enhancement</li>
<li>OFF: disable comprehensive enhancement</li>
     * @param Switch Comprehensive enhancement control switch. Valid values:
<li>ON: enable comprehensive enhancement</li>
<li>OFF: disable comprehensive enhancement</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Comprehensive enhancement type. Valid only when the control switch is ON. Available values:
<li>weak: light comprehensive enhancement.</li>
<li>NORMAL: Comprehensive enhancement is normal.</li>
<li>strong: comprehensive enhancement.</li>
Default value: weak. 
     * @return Type Comprehensive enhancement type. Valid only when the control switch is ON. Available values:
<li>weak: light comprehensive enhancement.</li>
<li>NORMAL: Comprehensive enhancement is normal.</li>
<li>strong: comprehensive enhancement.</li>
Default value: weak.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Comprehensive enhancement type. Valid only when the control switch is ON. Available values:
<li>weak: light comprehensive enhancement.</li>
<li>NORMAL: Comprehensive enhancement is normal.</li>
<li>strong: comprehensive enhancement.</li>
Default value: weak.
     * @param Type Comprehensive enhancement type. Valid only when the control switch is ON. Available values:
<li>weak: light comprehensive enhancement.</li>
<li>NORMAL: Comprehensive enhancement is normal.</li>
<li>strong: comprehensive enhancement.</li>
Default value: weak.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ImageQualityEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageQualityEnhanceInfo(ImageQualityEnhanceInfo source) {
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

