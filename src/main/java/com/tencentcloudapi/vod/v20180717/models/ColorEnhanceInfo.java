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

public class ColorEnhanceInfo extends AbstractModel {

    /**
    * <p>Color enhancement control switch</p><p>Enumeration values: </p><ul><li>ON: Enable color enhancement</li><li>OFF: Disable color enhancement</li></ul>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Color enhancement type. It is valid only when the color enhancement control switch is ON. Available values:</p><li>weak: light color enhancement;</li><li>normal: normal color enhancement;</li><li>strong: strong color enhancement.</li>Default value: weak.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Color enhancement control switch</p><p>Enumeration values: </p><ul><li>ON: Enable color enhancement</li><li>OFF: Disable color enhancement</li></ul> 
     * @return Switch <p>Color enhancement control switch</p><p>Enumeration values: </p><ul><li>ON: Enable color enhancement</li><li>OFF: Disable color enhancement</li></ul>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Color enhancement control switch</p><p>Enumeration values: </p><ul><li>ON: Enable color enhancement</li><li>OFF: Disable color enhancement</li></ul>
     * @param Switch <p>Color enhancement control switch</p><p>Enumeration values: </p><ul><li>ON: Enable color enhancement</li><li>OFF: Disable color enhancement</li></ul>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Color enhancement type. It is valid only when the color enhancement control switch is ON. Available values:</p><li>weak: light color enhancement;</li><li>normal: normal color enhancement;</li><li>strong: strong color enhancement.</li>Default value: weak. 
     * @return Type <p>Color enhancement type. It is valid only when the color enhancement control switch is ON. Available values:</p><li>weak: light color enhancement;</li><li>normal: normal color enhancement;</li><li>strong: strong color enhancement.</li>Default value: weak.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Color enhancement type. It is valid only when the color enhancement control switch is ON. Available values:</p><li>weak: light color enhancement;</li><li>normal: normal color enhancement;</li><li>strong: strong color enhancement.</li>Default value: weak.
     * @param Type <p>Color enhancement type. It is valid only when the color enhancement control switch is ON. Available values:</p><li>weak: light color enhancement;</li><li>normal: normal color enhancement;</li><li>strong: strong color enhancement.</li>Default value: weak.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ColorEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColorEnhanceInfo(ColorEnhanceInfo source) {
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

